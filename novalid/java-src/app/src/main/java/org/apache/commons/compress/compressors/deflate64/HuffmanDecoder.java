package org.apache.commons.compress.compressors.deflate64;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import okhttp3.internal.p054ws.WebSocketProtocol;
import org.apache.commons.compress.utils.BitInputStream;
import org.apache.commons.compress.utils.ByteUtils;
import org.apache.commons.compress.utils.ExactMath;

/* loaded from: classes6.dex */
public class HuffmanDecoder implements Closeable {
    public static final int[] FIXED_DISTANCE;
    public static final int[] FIXED_LITERALS;
    public boolean finalBlock;

    /* renamed from: in */
    public final InputStream f9848in;
    public final DecodingMemory memory;
    public BitInputStream reader;
    public DecoderState state;
    public static final short[] RUN_LENGTH_TABLE = {96, 128, 160, 192, 224, 256, ColorResourcesTableCreator.PackageChunk.HEADER_SIZE, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
    public static final int[] DISTANCE_TABLE = {16, 32, 48, 64, 81, 113, Cea708Decoder.COMMAND_SPL, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};
    public static final int[] CODE_LENGTHS_ORDER = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    static {
        int[] iArr = new int[288];
        FIXED_LITERALS = iArr;
        Arrays.fill(iArr, 0, Cea708Decoder.COMMAND_SPA, 8);
        Arrays.fill(iArr, Cea708Decoder.COMMAND_SPA, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        FIXED_DISTANCE = iArr2;
        Arrays.fill(iArr2, 5);
    }

    public HuffmanDecoder(InputStream inputStream) {
        this.memory = new DecodingMemory();
        this.reader = new BitInputStream(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.f9848in = inputStream;
        this.state = new InitialState();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.state = new InitialState();
        this.reader = null;
    }

    public int decode(byte[] bArr) throws IOException {
        return decode(bArr, 0, bArr.length);
    }

    public int decode(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            if (this.finalBlock && !this.state.hasData()) {
                return -1;
            }
            if (this.state.state() == HuffmanState.INITIAL) {
                this.finalBlock = readBits(1) == 1;
                int bits = (int) readBits(2);
                if (bits == 0) {
                    switchToUncompressedState();
                } else if (bits == 1) {
                    this.state = new HuffmanCodes(HuffmanState.FIXED_CODES, FIXED_LITERALS, FIXED_DISTANCE);
                } else if (bits == 2) {
                    int[][] dynamicTables = readDynamicTables();
                    this.state = new HuffmanCodes(HuffmanState.DYNAMIC_CODES, dynamicTables[0], dynamicTables[1]);
                } else {
                    throw new IllegalStateException("Unsupported compression: " + bits);
                }
            } else {
                int i3 = this.state.read(bArr, i, i2);
                if (i3 != 0) {
                    return i3;
                }
            }
        }
    }

    public long getBytesRead() {
        return this.reader.getBytesRead();
    }

    public final void switchToUncompressedState() throws IOException {
        this.reader.alignWithByteBoundary();
        long bits = readBits(16);
        if ((WebSocketProtocol.PAYLOAD_SHORT_MAX & (bits ^ WebSocketProtocol.PAYLOAD_SHORT_MAX)) != readBits(16)) {
            throw new IllegalStateException("Illegal LEN / NLEN values");
        }
        this.state = new UncompressedState(bits);
    }

    public final int[][] readDynamicTables() throws IOException {
        int[][] iArr = {new int[(int) (readBits(5) + 257)], new int[(int) (readBits(5) + 1)]};
        populateDynamicTables(this.reader, iArr[0], iArr[1]);
        return iArr;
    }

    public int available() throws IOException {
        return this.state.available();
    }

    public static abstract class DecoderState {
        public abstract int available() throws IOException;

        public abstract boolean hasData();

        public abstract int read(byte[] bArr, int i, int i2) throws IOException;

        public abstract HuffmanState state();

        public DecoderState() {
        }
    }

    public class UncompressedState extends DecoderState {
        public final long blockLength;
        public long read;

        public UncompressedState(long j) {
            super();
            this.blockLength = j;
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public HuffmanState state() {
            return this.read < this.blockLength ? HuffmanState.STORED : HuffmanState.INITIAL;
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            int i4 = 0;
            if (i2 == 0) {
                return 0;
            }
            int iMin = (int) Math.min(this.blockLength - this.read, i2);
            while (i4 < iMin) {
                if (HuffmanDecoder.this.reader.bitsCached() > 0) {
                    bArr[i + i4] = HuffmanDecoder.this.memory.add((byte) HuffmanDecoder.this.readBits(8));
                    i3 = 1;
                } else {
                    int i5 = i + i4;
                    i3 = HuffmanDecoder.this.f9848in.read(bArr, i5, iMin - i4);
                    if (i3 != -1) {
                        HuffmanDecoder.this.memory.add(bArr, i5, i3);
                    } else {
                        throw new EOFException("Truncated Deflate64 Stream");
                    }
                }
                this.read += i3;
                i4 += i3;
            }
            return iMin;
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public boolean hasData() {
            return this.read < this.blockLength;
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public int available() throws IOException {
            return (int) Math.min(this.blockLength - this.read, HuffmanDecoder.this.reader.bitsAvailable() / 8);
        }
    }

    public static class InitialState extends DecoderState {
        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public int available() {
            return 0;
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public boolean hasData() {
            return false;
        }

        public InitialState() {
            super();
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public HuffmanState state() {
            return HuffmanState.INITIAL;
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            throw new IllegalStateException("Cannot read in this state");
        }
    }

    public class HuffmanCodes extends DecoderState {
        public final BinaryTreeNode distanceTree;
        public boolean endOfBlock;
        public final BinaryTreeNode lengthTree;
        public byte[] runBuffer;
        public int runBufferLength;
        public int runBufferPos;
        public final HuffmanState state;

        public HuffmanCodes(HuffmanState huffmanState, int[] iArr, int[] iArr2) {
            super();
            this.runBuffer = ByteUtils.EMPTY_BYTE_ARRAY;
            this.state = huffmanState;
            this.lengthTree = HuffmanDecoder.buildTree(iArr);
            this.distanceTree = HuffmanDecoder.buildTree(iArr2);
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public HuffmanState state() {
            return this.endOfBlock ? HuffmanState.INITIAL : this.state;
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            return decodeNext(bArr, i, i2);
        }

        public final int decodeNext(byte[] bArr, int i, int i2) throws IOException {
            if (this.endOfBlock) {
                return -1;
            }
            int iCopyFromRunBuffer = copyFromRunBuffer(bArr, i, i2);
            while (true) {
                if (iCopyFromRunBuffer < i2) {
                    int iNextSymbol = HuffmanDecoder.nextSymbol(HuffmanDecoder.this.reader, this.lengthTree);
                    if (iNextSymbol >= 256) {
                        if (iNextSymbol > 256) {
                            short s = HuffmanDecoder.RUN_LENGTH_TABLE[iNextSymbol - 257];
                            int iAdd = ExactMath.add(s >>> 5, HuffmanDecoder.this.readBits(s & 31));
                            int i3 = HuffmanDecoder.DISTANCE_TABLE[HuffmanDecoder.nextSymbol(HuffmanDecoder.this.reader, this.distanceTree)];
                            int iAdd2 = ExactMath.add(i3 >>> 4, HuffmanDecoder.this.readBits(i3 & 15));
                            if (this.runBuffer.length < iAdd) {
                                this.runBuffer = new byte[iAdd];
                            }
                            this.runBufferLength = iAdd;
                            this.runBufferPos = 0;
                            HuffmanDecoder.this.memory.recordToBuffer(iAdd2, iAdd, this.runBuffer);
                            iCopyFromRunBuffer += copyFromRunBuffer(bArr, i + iCopyFromRunBuffer, i2 - iCopyFromRunBuffer);
                        } else {
                            this.endOfBlock = true;
                            break;
                        }
                    } else {
                        bArr[iCopyFromRunBuffer + i] = HuffmanDecoder.this.memory.add((byte) iNextSymbol);
                        iCopyFromRunBuffer++;
                    }
                } else {
                    break;
                }
            }
            return iCopyFromRunBuffer;
        }

        public final int copyFromRunBuffer(byte[] bArr, int i, int i2) {
            int i3 = this.runBufferLength - this.runBufferPos;
            if (i3 <= 0) {
                return 0;
            }
            int iMin = Math.min(i2, i3);
            System.arraycopy(this.runBuffer, this.runBufferPos, bArr, i, iMin);
            this.runBufferPos += iMin;
            return iMin;
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public boolean hasData() {
            return !this.endOfBlock;
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        public int available() {
            return this.runBufferLength - this.runBufferPos;
        }
    }

    public static int nextSymbol(BitInputStream bitInputStream, BinaryTreeNode binaryTreeNode) throws IOException {
        while (binaryTreeNode != null && binaryTreeNode.literal == -1) {
            binaryTreeNode = readBits(bitInputStream, 1) == 0 ? binaryTreeNode.leftNode : binaryTreeNode.rightNode;
        }
        if (binaryTreeNode != null) {
            return binaryTreeNode.literal;
        }
        return -1;
    }

    public static void populateDynamicTables(BitInputStream bitInputStream, int[] iArr, int[] iArr2) throws IOException {
        long bits;
        int bits2 = (int) (readBits(bitInputStream, 4) + 4);
        int[] iArr3 = new int[19];
        for (int i = 0; i < bits2; i++) {
            iArr3[CODE_LENGTHS_ORDER[i]] = (int) readBits(bitInputStream, 3);
        }
        BinaryTreeNode binaryTreeNodeBuildTree = buildTree(iArr3);
        int length = iArr.length + iArr2.length;
        int[] iArr4 = new int[length];
        int i2 = -1;
        int i3 = 0;
        int bits3 = 0;
        while (i3 < length) {
            if (bits3 > 0) {
                iArr4[i3] = i2;
                bits3--;
                i3++;
            } else {
                int iNextSymbol = nextSymbol(bitInputStream, binaryTreeNodeBuildTree);
                if (iNextSymbol < 16) {
                    iArr4[i3] = iNextSymbol;
                    i3++;
                    i2 = iNextSymbol;
                } else {
                    long j = 3;
                    switch (iNextSymbol) {
                        case 16:
                            bits3 = (int) (readBits(bitInputStream, 2) + 3);
                            continue;
                        case 17:
                            bits = readBits(bitInputStream, 3);
                            break;
                        case 18:
                            bits = readBits(bitInputStream, 7);
                            j = 11;
                            break;
                    }
                    bits3 = (int) (bits + j);
                    i2 = 0;
                }
            }
        }
        System.arraycopy(iArr4, 0, iArr, 0, iArr.length);
        System.arraycopy(iArr4, iArr.length, iArr2, 0, iArr2.length);
    }

    public static class BinaryTreeNode {
        public final int bits;
        public BinaryTreeNode leftNode;
        public int literal;
        public BinaryTreeNode rightNode;

        public BinaryTreeNode(int i) {
            this.literal = -1;
            this.bits = i;
        }

        public void leaf(int i) {
            this.literal = i;
            this.leftNode = null;
            this.rightNode = null;
        }

        public BinaryTreeNode left() {
            if (this.leftNode == null && this.literal == -1) {
                this.leftNode = new BinaryTreeNode(this.bits + 1);
            }
            return this.leftNode;
        }

        public BinaryTreeNode right() {
            if (this.rightNode == null && this.literal == -1) {
                this.rightNode = new BinaryTreeNode(this.bits + 1);
            }
            return this.rightNode;
        }
    }

    public static BinaryTreeNode buildTree(int[] iArr) {
        int[] codes = getCodes(iArr);
        int i = 0;
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(i);
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 != 0) {
                int i3 = i2 - 1;
                int i4 = codes[i3];
                BinaryTreeNode binaryTreeNodeLeft = binaryTreeNode;
                for (int i5 = i3; i5 >= 0; i5--) {
                    binaryTreeNodeLeft = ((1 << i5) & i4) == 0 ? binaryTreeNodeLeft.left() : binaryTreeNodeLeft.right();
                    if (binaryTreeNodeLeft == null) {
                        throw new IllegalStateException("node doesn't exist in Huffman tree");
                    }
                }
                binaryTreeNodeLeft.leaf(i);
                codes[i3] = codes[i3] + 1;
            }
            i++;
        }
        return binaryTreeNode;
    }

    public static int[] getCodes(int[] iArr) {
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            if (i < 0 || i > 64) {
                throw new IllegalArgumentException("Invalid code " + i + " in literal table");
            }
            iMax = Math.max(iMax, i);
            iArr2[i] = iArr2[i] + 1;
        }
        int i2 = iMax + 1;
        int[] iArrCopyOf = Arrays.copyOf(iArr2, i2);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 <= iMax; i4++) {
            i3 = (i3 + iArrCopyOf[i4]) << 1;
            iArr3[i4] = i3;
        }
        return iArr3;
    }

    public static class DecodingMemory {
        public final int mask;
        public final byte[] memory;
        public int wHead;
        public boolean wrappedAround;

        public DecodingMemory() {
            this(16);
        }

        public DecodingMemory(int i) {
            byte[] bArr = new byte[1 << i];
            this.memory = bArr;
            this.mask = bArr.length - 1;
        }

        public byte add(byte b) {
            byte[] bArr = this.memory;
            int i = this.wHead;
            bArr[i] = b;
            this.wHead = incCounter(i);
            return b;
        }

        public void add(byte[] bArr, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                add(bArr[i3]);
            }
        }

        public void recordToBuffer(int i, int i2, byte[] bArr) {
            if (i > this.memory.length) {
                throw new IllegalStateException("Illegal distance parameter: " + i);
            }
            int i3 = this.wHead;
            int iIncCounter = (i3 - i) & this.mask;
            if (!this.wrappedAround && iIncCounter >= i3) {
                throw new IllegalStateException("Attempt to read beyond memory: dist=" + i);
            }
            int i4 = 0;
            while (i4 < i2) {
                bArr[i4] = add(this.memory[iIncCounter]);
                i4++;
                iIncCounter = incCounter(iIncCounter);
            }
        }

        public final int incCounter(int i) {
            int i2 = (i + 1) & this.mask;
            if (!this.wrappedAround && i2 < i) {
                this.wrappedAround = true;
            }
            return i2;
        }
    }

    public final long readBits(int i) throws IOException {
        return readBits(this.reader, i);
    }

    public static long readBits(BitInputStream bitInputStream, int i) throws IOException {
        long bits = bitInputStream.readBits(i);
        if (bits != -1) {
            return bits;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }
}
