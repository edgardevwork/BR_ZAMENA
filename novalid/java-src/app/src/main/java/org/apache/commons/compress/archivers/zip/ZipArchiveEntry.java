package org.apache.commons.compress.archivers.zip;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import okhttp3.internal.p054ws.WebSocketProtocol;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.EntryStreamOffsets;
import org.apache.commons.compress.archivers.zip.ExtraFieldUtils;
import org.apache.commons.compress.utils.ByteUtils;

/* loaded from: classes6.dex */
public class ZipArchiveEntry extends ZipEntry implements ArchiveEntry, EntryStreamOffsets {
    public static final int CRC_UNKNOWN = -1;
    public static final ZipArchiveEntry[] EMPTY_ZIP_ARCHIVE_ENTRY_ARRAY = new ZipArchiveEntry[0];
    public static final int PLATFORM_FAT = 0;
    public static final int PLATFORM_UNIX = 3;
    public static final int SHORT_MASK = 65535;
    public static final int SHORT_SHIFT = 16;
    public int alignment;
    public CommentSource commentSource;
    public long dataOffset;
    public long diskNumberStart;
    public long externalAttributes;
    public ZipExtraField[] extraFields;
    public GeneralPurposeBit gpb;
    public int internalAttributes;
    public boolean isStreamContiguous;
    public long localHeaderOffset;
    public int method;
    public String name;
    public NameSource nameSource;
    public int platform;
    public int rawFlag;
    public byte[] rawName;
    public long size;
    public UnparseableExtraFieldData unparseableExtra;
    public int versionMadeBy;
    public int versionRequired;

    /* loaded from: classes5.dex */
    public enum CommentSource {
        COMMENT,
        UNICODE_EXTRA_FIELD
    }

    /* loaded from: classes5.dex */
    public enum NameSource {
        NAME,
        NAME_WITH_EFS_FLAG,
        UNICODE_EXTRA_FIELD
    }

    public ZipArchiveEntry(String str) {
        super(str);
        this.method = -1;
        this.size = -1L;
        this.platform = 0;
        this.gpb = new GeneralPurposeBit();
        this.localHeaderOffset = -1L;
        this.dataOffset = -1L;
        this.nameSource = NameSource.NAME;
        this.commentSource = CommentSource.COMMENT;
        setName(str);
    }

    public ZipArchiveEntry(ZipEntry zipEntry) throws ZipException {
        super(zipEntry);
        this.method = -1;
        this.size = -1L;
        this.platform = 0;
        this.gpb = new GeneralPurposeBit();
        this.localHeaderOffset = -1L;
        this.dataOffset = -1L;
        this.nameSource = NameSource.NAME;
        this.commentSource = CommentSource.COMMENT;
        setName(zipEntry.getName());
        byte[] extra = zipEntry.getExtra();
        if (extra != null) {
            setExtraFields(ExtraFieldUtils.parse(extra, true, (ExtraFieldParsingBehavior) ExtraFieldParsingMode.BEST_EFFORT));
        } else {
            setExtra();
        }
        setMethod(zipEntry.getMethod());
        this.size = zipEntry.getSize();
    }

    public ZipArchiveEntry(ZipArchiveEntry zipArchiveEntry) throws ZipException {
        this((ZipEntry) zipArchiveEntry);
        setInternalAttributes(zipArchiveEntry.getInternalAttributes());
        setExternalAttributes(zipArchiveEntry.getExternalAttributes());
        setExtraFields(getAllExtraFieldsNoCopy());
        setPlatform(zipArchiveEntry.getPlatform());
        GeneralPurposeBit generalPurposeBit = zipArchiveEntry.getGeneralPurposeBit();
        setGeneralPurposeBit(generalPurposeBit == null ? null : (GeneralPurposeBit) generalPurposeBit.clone());
    }

    public ZipArchiveEntry() {
        this("");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ZipArchiveEntry(File file, String str) {
        if (file.isDirectory() && !str.endsWith("/")) {
            str = str + "/";
        }
        this(str);
        if (file.isFile()) {
            setSize(file.length());
        }
        setTime(file.lastModified());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ZipArchiveEntry(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        if (Files.isDirectory(path, linkOptionArr) && !str.endsWith("/")) {
            str = str + "/";
        }
        this(str);
        if (Files.isRegularFile(path, linkOptionArr)) {
            setSize(Files.size(path));
        }
        setTime(Files.getLastModifiedTime(path, linkOptionArr));
    }

    public void setTime(FileTime fileTime) {
        setTime(fileTime.toMillis());
    }

    @Override // java.util.zip.ZipEntry
    public Object clone() {
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) super.clone();
        zipArchiveEntry.setInternalAttributes(getInternalAttributes());
        zipArchiveEntry.setExternalAttributes(getExternalAttributes());
        zipArchiveEntry.setExtraFields(getAllExtraFieldsNoCopy());
        return zipArchiveEntry;
    }

    @Override // java.util.zip.ZipEntry
    public int getMethod() {
        return this.method;
    }

    @Override // java.util.zip.ZipEntry
    public void setMethod(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("ZIP compression method can not be negative: " + i);
        }
        this.method = i;
    }

    public int getInternalAttributes() {
        return this.internalAttributes;
    }

    public void setInternalAttributes(int i) {
        this.internalAttributes = i;
    }

    public long getExternalAttributes() {
        return this.externalAttributes;
    }

    public void setExternalAttributes(long j) {
        this.externalAttributes = j;
    }

    public void setUnixMode(int i) {
        setExternalAttributes(((i & 128) == 0 ? 1 : 0) | (i << 16) | (isDirectory() ? 16 : 0));
        this.platform = 3;
    }

    public int getUnixMode() {
        if (this.platform != 3) {
            return 0;
        }
        return (int) ((getExternalAttributes() >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    public boolean isUnixSymlink() {
        return (getUnixMode() & 61440) == 40960;
    }

    public int getPlatform() {
        return this.platform;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public int getAlignment() {
        return this.alignment;
    }

    public void setAlignment(int i) {
        if (((i - 1) & i) != 0 || i > 65535) {
            throw new IllegalArgumentException("Invalid value for alignment, must be power of two and no bigger than 65535 but is " + i);
        }
        this.alignment = i;
    }

    public void setExtraFields(ZipExtraField[] zipExtraFieldArr) {
        this.unparseableExtra = null;
        ArrayList arrayList = new ArrayList();
        if (zipExtraFieldArr != null) {
            for (ZipExtraField zipExtraField : zipExtraFieldArr) {
                if (zipExtraField instanceof UnparseableExtraFieldData) {
                    this.unparseableExtra = (UnparseableExtraFieldData) zipExtraField;
                } else {
                    arrayList.add(zipExtraField);
                }
            }
        }
        this.extraFields = (ZipExtraField[]) arrayList.toArray(ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY);
        setExtra();
    }

    public ZipExtraField[] getExtraFields() {
        return getParseableExtraFields();
    }

    public ZipExtraField[] getExtraFields(boolean z) {
        if (z) {
            return getAllExtraFields();
        }
        return getParseableExtraFields();
    }

    public ZipExtraField[] getExtraFields(ExtraFieldParsingBehavior extraFieldParsingBehavior) throws ZipException {
        ZipExtraField zipExtraFieldFindMatching;
        if (extraFieldParsingBehavior == ExtraFieldParsingMode.BEST_EFFORT) {
            return getExtraFields(true);
        }
        if (extraFieldParsingBehavior == ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT) {
            return getExtraFields(false);
        }
        ArrayList<ZipExtraField> arrayList = new ArrayList(Arrays.asList(ExtraFieldUtils.parse(getExtra(), true, extraFieldParsingBehavior)));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(ExtraFieldUtils.parse(getCentralDirectoryExtra(), false, extraFieldParsingBehavior)));
        ArrayList arrayList3 = new ArrayList();
        for (ZipExtraField zipExtraField : arrayList) {
            if (zipExtraField instanceof UnparseableExtraFieldData) {
                zipExtraFieldFindMatching = findUnparseable(arrayList2);
            } else {
                zipExtraFieldFindMatching = findMatching(zipExtraField.getHeaderId(), arrayList2);
            }
            if (zipExtraFieldFindMatching != null) {
                byte[] centralDirectoryData = zipExtraFieldFindMatching.getCentralDirectoryData();
                if (centralDirectoryData != null && centralDirectoryData.length > 0) {
                    zipExtraField.parseFromCentralDirectoryData(centralDirectoryData, 0, centralDirectoryData.length);
                }
                arrayList2.remove(zipExtraFieldFindMatching);
            }
            arrayList3.add(zipExtraField);
        }
        arrayList3.addAll(arrayList2);
        return (ZipExtraField[]) arrayList3.toArray(ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY);
    }

    public final ZipExtraField[] getParseableExtraFieldsNoCopy() {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        return zipExtraFieldArr == null ? ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY : zipExtraFieldArr;
    }

    public final ZipExtraField[] getParseableExtraFields() {
        ZipExtraField[] parseableExtraFieldsNoCopy = getParseableExtraFieldsNoCopy();
        return parseableExtraFieldsNoCopy == this.extraFields ? copyOf(parseableExtraFieldsNoCopy, parseableExtraFieldsNoCopy.length) : parseableExtraFieldsNoCopy;
    }

    public final ZipExtraField[] getAllExtraFieldsNoCopy() {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        if (zipExtraFieldArr == null) {
            return getUnparseableOnly();
        }
        return this.unparseableExtra != null ? getMergedFields() : zipExtraFieldArr;
    }

    public final ZipExtraField[] getMergedFields() {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        ZipExtraField[] zipExtraFieldArrCopyOf = copyOf(zipExtraFieldArr, zipExtraFieldArr.length + 1);
        zipExtraFieldArrCopyOf[this.extraFields.length] = this.unparseableExtra;
        return zipExtraFieldArrCopyOf;
    }

    public final ZipExtraField[] getUnparseableOnly() {
        UnparseableExtraFieldData unparseableExtraFieldData = this.unparseableExtra;
        return unparseableExtraFieldData == null ? ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY : new ZipExtraField[]{unparseableExtraFieldData};
    }

    public final ZipExtraField[] getAllExtraFields() {
        ZipExtraField[] allExtraFieldsNoCopy = getAllExtraFieldsNoCopy();
        return allExtraFieldsNoCopy == this.extraFields ? copyOf(allExtraFieldsNoCopy, allExtraFieldsNoCopy.length) : allExtraFieldsNoCopy;
    }

    public final ZipExtraField findUnparseable(List<ZipExtraField> list) {
        final Class<UnparseableExtraFieldData> cls = UnparseableExtraFieldData.class;
        return list.stream().filter(new Predicate() { // from class: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance((ZipExtraField) obj);
            }
        }).findFirst().orElse(null);
    }

    public static /* synthetic */ boolean lambda$findMatching$0(ZipShort zipShort, ZipExtraField zipExtraField) {
        return zipShort.equals(zipExtraField.getHeaderId());
    }

    public final ZipExtraField findMatching(final ZipShort zipShort, List<ZipExtraField> list) {
        return list.stream().filter(new Predicate() { // from class: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ZipArchiveEntry.lambda$findMatching$0(zipShort, (ZipExtraField) obj);
            }
        }).findFirst().orElse(null);
    }

    public void addExtraField(ZipExtraField zipExtraField) {
        if (zipExtraField instanceof UnparseableExtraFieldData) {
            this.unparseableExtra = (UnparseableExtraFieldData) zipExtraField;
        } else if (this.extraFields == null) {
            this.extraFields = new ZipExtraField[]{zipExtraField};
        } else {
            if (getExtraField(zipExtraField.getHeaderId()) != null) {
                removeExtraField(zipExtraField.getHeaderId());
            }
            ZipExtraField[] zipExtraFieldArr = this.extraFields;
            ZipExtraField[] zipExtraFieldArrCopyOf = copyOf(zipExtraFieldArr, zipExtraFieldArr.length + 1);
            zipExtraFieldArrCopyOf[zipExtraFieldArrCopyOf.length - 1] = zipExtraField;
            this.extraFields = zipExtraFieldArrCopyOf;
        }
        setExtra();
    }

    public void addAsFirstExtraField(ZipExtraField zipExtraField) {
        if (zipExtraField instanceof UnparseableExtraFieldData) {
            this.unparseableExtra = (UnparseableExtraFieldData) zipExtraField;
        } else {
            if (getExtraField(zipExtraField.getHeaderId()) != null) {
                removeExtraField(zipExtraField.getHeaderId());
            }
            ZipExtraField[] zipExtraFieldArr = this.extraFields;
            ZipExtraField[] zipExtraFieldArr2 = new ZipExtraField[zipExtraFieldArr != null ? zipExtraFieldArr.length + 1 : 1];
            this.extraFields = zipExtraFieldArr2;
            zipExtraFieldArr2[0] = zipExtraField;
            if (zipExtraFieldArr != null) {
                System.arraycopy(zipExtraFieldArr, 0, zipExtraFieldArr2, 1, zipExtraFieldArr2.length - 1);
            }
        }
        setExtra();
    }

    public void removeExtraField(ZipShort zipShort) {
        if (this.extraFields == null) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        for (ZipExtraField zipExtraField : this.extraFields) {
            if (!zipShort.equals(zipExtraField.getHeaderId())) {
                arrayList.add(zipExtraField);
            }
        }
        if (this.extraFields.length == arrayList.size()) {
            throw new NoSuchElementException();
        }
        this.extraFields = (ZipExtraField[]) arrayList.toArray(ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY);
        setExtra();
    }

    public void removeUnparseableExtraFieldData() {
        if (this.unparseableExtra == null) {
            throw new NoSuchElementException();
        }
        this.unparseableExtra = null;
        setExtra();
    }

    public ZipExtraField getExtraField(ZipShort zipShort) {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        if (zipExtraFieldArr == null) {
            return null;
        }
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            if (zipShort.equals(zipExtraField.getHeaderId())) {
                return zipExtraField;
            }
        }
        return null;
    }

    public UnparseableExtraFieldData getUnparseableExtraFieldData() {
        return this.unparseableExtra;
    }

    @Override // java.util.zip.ZipEntry
    public void setExtra(byte[] bArr) throws RuntimeException {
        try {
            mergeExtraFields(ExtraFieldUtils.parse(bArr, true, (ExtraFieldParsingBehavior) ExtraFieldParsingMode.BEST_EFFORT), true);
        } catch (ZipException e) {
            throw new IllegalArgumentException("Error parsing extra fields for entry: " + getName() + " - " + e.getMessage(), e);
        }
    }

    public void setExtra() {
        super.setExtra(ExtraFieldUtils.mergeLocalFileDataData(getAllExtraFieldsNoCopy()));
    }

    public void setCentralDirectoryExtra(byte[] bArr) {
        try {
            mergeExtraFields(ExtraFieldUtils.parse(bArr, false, (ExtraFieldParsingBehavior) ExtraFieldParsingMode.BEST_EFFORT), false);
        } catch (ZipException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public byte[] getLocalFileDataExtra() {
        byte[] extra = getExtra();
        return extra != null ? extra : ByteUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] getCentralDirectoryExtra() {
        return ExtraFieldUtils.mergeCentralDirectoryData(getAllExtraFieldsNoCopy());
    }

    @Override // java.util.zip.ZipEntry, org.apache.commons.compress.archivers.ArchiveEntry
    public String getName() {
        String str = this.name;
        return str == null ? super.getName() : str;
    }

    @Override // java.util.zip.ZipEntry, org.apache.commons.compress.archivers.ArchiveEntry
    public boolean isDirectory() {
        return getName().endsWith("/");
    }

    public void setName(String str) {
        if (str != null && getPlatform() == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.name = str;
    }

    @Override // java.util.zip.ZipEntry, org.apache.commons.compress.archivers.ArchiveEntry
    public long getSize() {
        return this.size;
    }

    @Override // java.util.zip.ZipEntry
    public void setSize(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Invalid entry size");
        }
        this.size = j;
    }

    public void setName(String str, byte[] bArr) {
        setName(str);
        this.rawName = bArr;
    }

    public byte[] getRawName() {
        byte[] bArr = this.rawName;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public long getLocalHeaderOffset() {
        return this.localHeaderOffset;
    }

    public void setLocalHeaderOffset(long j) {
        this.localHeaderOffset = j;
    }

    @Override // org.apache.commons.compress.archivers.EntryStreamOffsets
    public long getDataOffset() {
        return this.dataOffset;
    }

    public void setDataOffset(long j) {
        this.dataOffset = j;
    }

    @Override // org.apache.commons.compress.archivers.EntryStreamOffsets
    public boolean isStreamContiguous() {
        return this.isStreamContiguous;
    }

    public void setStreamContiguous(boolean z) {
        this.isStreamContiguous = z;
    }

    @Override // java.util.zip.ZipEntry
    public int hashCode() {
        return getName().hashCode();
    }

    public GeneralPurposeBit getGeneralPurposeBit() {
        return this.gpb;
    }

    public void setGeneralPurposeBit(GeneralPurposeBit generalPurposeBit) {
        this.gpb = generalPurposeBit;
    }

    public final void mergeExtraFields(ZipExtraField[] zipExtraFieldArr, boolean z) {
        ZipExtraField extraField;
        byte[] centralDirectoryData;
        if (this.extraFields == null) {
            setExtraFields(zipExtraFieldArr);
            return;
        }
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            if (zipExtraField instanceof UnparseableExtraFieldData) {
                extraField = this.unparseableExtra;
            } else {
                extraField = getExtraField(zipExtraField.getHeaderId());
            }
            if (extraField == null) {
                addExtraField(zipExtraField);
            } else {
                if (z) {
                    centralDirectoryData = zipExtraField.getLocalFileDataData();
                } else {
                    centralDirectoryData = zipExtraField.getCentralDirectoryData();
                }
                if (z) {
                    try {
                        extraField.parseFromLocalFileData(centralDirectoryData, 0, centralDirectoryData.length);
                    } catch (ZipException unused) {
                        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
                        unrecognizedExtraField.setHeaderId(extraField.getHeaderId());
                        if (z) {
                            unrecognizedExtraField.setLocalFileDataData(centralDirectoryData);
                            unrecognizedExtraField.setCentralDirectoryData(extraField.getCentralDirectoryData());
                        } else {
                            unrecognizedExtraField.setLocalFileDataData(extraField.getLocalFileDataData());
                            unrecognizedExtraField.setCentralDirectoryData(centralDirectoryData);
                        }
                        removeExtraField(extraField.getHeaderId());
                        addExtraField(unrecognizedExtraField);
                    }
                } else {
                    extraField.parseFromCentralDirectoryData(centralDirectoryData, 0, centralDirectoryData.length);
                }
            }
        }
        setExtra();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public Date getLastModifiedDate() {
        return new Date(getTime());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) obj;
        if (!Objects.equals(getName(), zipArchiveEntry.getName())) {
            return false;
        }
        String comment = getComment();
        String comment2 = zipArchiveEntry.getComment();
        if (comment == null) {
            comment = "";
        }
        if (comment2 == null) {
            comment2 = "";
        }
        return getTime() == zipArchiveEntry.getTime() && comment.equals(comment2) && getInternalAttributes() == zipArchiveEntry.getInternalAttributes() && getPlatform() == zipArchiveEntry.getPlatform() && getExternalAttributes() == zipArchiveEntry.getExternalAttributes() && getMethod() == zipArchiveEntry.getMethod() && getSize() == zipArchiveEntry.getSize() && getCrc() == zipArchiveEntry.getCrc() && getCompressedSize() == zipArchiveEntry.getCompressedSize() && Arrays.equals(getCentralDirectoryExtra(), zipArchiveEntry.getCentralDirectoryExtra()) && Arrays.equals(getLocalFileDataExtra(), zipArchiveEntry.getLocalFileDataExtra()) && this.localHeaderOffset == zipArchiveEntry.localHeaderOffset && this.dataOffset == zipArchiveEntry.dataOffset && this.gpb.equals(zipArchiveEntry.gpb);
    }

    public void setVersionMadeBy(int i) {
        this.versionMadeBy = i;
    }

    public void setVersionRequired(int i) {
        this.versionRequired = i;
    }

    public int getVersionRequired() {
        return this.versionRequired;
    }

    public int getVersionMadeBy() {
        return this.versionMadeBy;
    }

    public int getRawFlag() {
        return this.rawFlag;
    }

    public void setRawFlag(int i) {
        this.rawFlag = i;
    }

    public NameSource getNameSource() {
        return this.nameSource;
    }

    public void setNameSource(NameSource nameSource) {
        this.nameSource = nameSource;
    }

    public CommentSource getCommentSource() {
        return this.commentSource;
    }

    public void setCommentSource(CommentSource commentSource) {
        this.commentSource = commentSource;
    }

    public long getDiskNumberStart() {
        return this.diskNumberStart;
    }

    public void setDiskNumberStart(long j) {
        this.diskNumberStart = j;
    }

    public final ZipExtraField[] copyOf(ZipExtraField[] zipExtraFieldArr, int i) {
        ZipExtraField[] zipExtraFieldArr2 = new ZipExtraField[i];
        System.arraycopy(zipExtraFieldArr, 0, zipExtraFieldArr2, 0, Math.min(zipExtraFieldArr.length, i));
        return zipExtraFieldArr2;
    }

    /* loaded from: classes8.dex */
    public static class ExtraFieldParsingMode extends Enum<ExtraFieldParsingMode> implements ExtraFieldParsingBehavior {
        public static final /* synthetic */ ExtraFieldParsingMode[] $VALUES;
        public static final ExtraFieldParsingMode BEST_EFFORT;
        public static final ExtraFieldParsingMode DRACONIC;
        public static final ExtraFieldParsingMode ONLY_PARSEABLE_LENIENT;
        public static final ExtraFieldParsingMode ONLY_PARSEABLE_STRICT;
        public static final ExtraFieldParsingMode STRICT_FOR_KNOW_EXTRA_FIELDS;
        public final ExtraFieldUtils.UnparseableExtraField onUnparseableData;

        public /* synthetic */ ExtraFieldParsingMode(String str, int i, ExtraFieldUtils.UnparseableExtraField unparseableExtraField, C110301 c110301) {
            this(str, i, unparseableExtraField);
        }

        public static ExtraFieldParsingMode valueOf(String str) {
            return (ExtraFieldParsingMode) Enum.valueOf(ExtraFieldParsingMode.class, str);
        }

        public static ExtraFieldParsingMode[] values() {
            return (ExtraFieldParsingMode[]) $VALUES.clone();
        }

        /* renamed from: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode$1 */
        /* loaded from: classes7.dex */
        public enum C110311 extends ExtraFieldParsingMode {
            public C110311(String str, int i, ExtraFieldUtils.UnparseableExtraField unparseableExtraField) {
                super(str, i, unparseableExtraField);
            }

            @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode, org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior
            public ZipExtraField fill(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) {
                return ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(zipExtraField, bArr, i, i2, z);
            }
        }

        static {
            ExtraFieldUtils.UnparseableExtraField unparseableExtraField = ExtraFieldUtils.UnparseableExtraField.READ;
            C110311 c110311 = new ExtraFieldParsingMode("BEST_EFFORT", 0, unparseableExtraField) { // from class: org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.1
                public C110311(String str, int i, ExtraFieldUtils.UnparseableExtraField unparseableExtraField2) {
                    super(str, i, unparseableExtraField2);
                }

                @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode, org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior
                public ZipExtraField fill(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) {
                    return ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(zipExtraField, bArr, i, i2, z);
                }
            };
            BEST_EFFORT = c110311;
            ExtraFieldParsingMode extraFieldParsingMode = new ExtraFieldParsingMode("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, unparseableExtraField2);
            STRICT_FOR_KNOW_EXTRA_FIELDS = extraFieldParsingMode;
            ExtraFieldUtils.UnparseableExtraField unparseableExtraField2 = ExtraFieldUtils.UnparseableExtraField.SKIP;
            C110322 c110322 = new ExtraFieldParsingMode("ONLY_PARSEABLE_LENIENT", 2, unparseableExtraField2) { // from class: org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.2
                public C110322(String str, int i, ExtraFieldUtils.UnparseableExtraField unparseableExtraField22) {
                    super(str, i, unparseableExtraField22);
                }

                @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode, org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior
                public ZipExtraField fill(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) {
                    return ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(zipExtraField, bArr, i, i2, z);
                }
            };
            ONLY_PARSEABLE_LENIENT = c110322;
            ExtraFieldParsingMode extraFieldParsingMode2 = new ExtraFieldParsingMode("ONLY_PARSEABLE_STRICT", 3, unparseableExtraField22);
            ONLY_PARSEABLE_STRICT = extraFieldParsingMode2;
            ExtraFieldParsingMode extraFieldParsingMode3 = new ExtraFieldParsingMode("DRACONIC", 4, ExtraFieldUtils.UnparseableExtraField.THROW);
            DRACONIC = extraFieldParsingMode3;
            $VALUES = new ExtraFieldParsingMode[]{c110311, extraFieldParsingMode, c110322, extraFieldParsingMode2, extraFieldParsingMode3};
        }

        /* renamed from: org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode$2 */
        /* loaded from: classes7.dex */
        public enum C110322 extends ExtraFieldParsingMode {
            public C110322(String str, int i, ExtraFieldUtils.UnparseableExtraField unparseableExtraField22) {
                super(str, i, unparseableExtraField22);
            }

            @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode, org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior
            public ZipExtraField fill(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) {
                return ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(zipExtraField, bArr, i, i2, z);
            }
        }

        public ExtraFieldParsingMode(String str, int i, ExtraFieldUtils.UnparseableExtraField unparseableExtraField) {
            super(str, i);
            this.onUnparseableData = unparseableExtraField;
        }

        @Override // org.apache.commons.compress.archivers.zip.UnparseableExtraFieldBehavior
        public ZipExtraField onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
            return this.onUnparseableData.onUnparseableExtraField(bArr, i, i2, z, i3);
        }

        @Override // org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior
        public ZipExtraField createExtraField(ZipShort zipShort) throws IllegalAccessException, ZipException, InstantiationException {
            return ExtraFieldUtils.createExtraField(zipShort);
        }

        @Override // org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior
        public ZipExtraField fill(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) throws ZipException {
            return ExtraFieldUtils.fillExtraField(zipExtraField, bArr, i, i2, z);
        }

        public static ZipExtraField fillAndMakeUnrecognizedOnError(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) {
            try {
                return ExtraFieldUtils.fillExtraField(zipExtraField, bArr, i, i2, z);
            } catch (ZipException unused) {
                UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
                unrecognizedExtraField.setHeaderId(zipExtraField.getHeaderId());
                if (z) {
                    unrecognizedExtraField.setLocalFileDataData(Arrays.copyOfRange(bArr, i, i2 + i));
                } else {
                    unrecognizedExtraField.setCentralDirectoryData(Arrays.copyOfRange(bArr, i, i2 + i));
                }
                return unrecognizedExtraField;
            }
        }
    }
}
