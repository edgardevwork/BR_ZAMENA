package org.apache.commons.compress.harmony.unpack200;

import com.google.common.reflect.ClassPath;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.function.Consumer;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.CRC32;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute;

/* loaded from: classes7.dex */
public class Segment {
    public static final int LOG_LEVEL_QUIET = 0;
    public static final int LOG_LEVEL_STANDARD = 1;
    public static final int LOG_LEVEL_VERBOSE = 2;
    public AttrDefinitionBands attrDefinitionBands;
    public BcBands bcBands;
    public ClassBands classBands;
    public byte[][] classFilesContents;
    public CpBands cpBands;
    public boolean deflateHint;
    public boolean doPreRead;
    public FileBands fileBands;
    public boolean[] fileDeflate;
    public boolean[] fileIsClass;
    public SegmentHeader header;
    public IcBands icBands;
    public InputStream internalBuffer;
    public int logLevel;
    public PrintWriter logStream;
    public boolean overrideDeflateHint;

    public final ClassFile buildClassFile(int i) {
        int i2;
        CPClass cPClassCpClassValue;
        CPUTF8 cputf8CpUTF8Value;
        CPClass cPClassCpClassValue2;
        ClassFile classFile = new ClassFile();
        int[] classVersionMajor = this.classBands.getClassVersionMajor();
        int[] classVersionMinor = this.classBands.getClassVersionMinor();
        if (classVersionMajor != null) {
            classFile.major = classVersionMajor[i];
            classFile.minor = classVersionMinor[i];
        } else {
            classFile.major = this.header.getDefaultClassMajorVersion();
            classFile.minor = this.header.getDefaultClassMinorVersion();
        }
        ClassConstantPool classConstantPool = classFile.pool;
        int i3 = this.classBands.getClassThisInts()[i];
        String str = this.cpBands.getCpClass()[i3];
        int iLastIndexOf = str.lastIndexOf("/") + 1;
        ArrayList<Attribute> arrayList = this.classBands.getClassAttributes()[i];
        SourceFileAttribute sourceFileAttribute = null;
        for (Attribute attribute : arrayList) {
            if (attribute.isSourceFileAttribute()) {
                sourceFileAttribute = (SourceFileAttribute) attribute;
            }
        }
        if (sourceFileAttribute == null) {
            if (this.attrDefinitionBands.getAttributeDefinitionMap().getAttributeLayout(AttributeLayout.ATTRIBUTE_SOURCE_FILE, 0).matches(this.classBands.getRawClassFlags()[i])) {
                int i4 = -1;
                for (int i5 = 0; i5 < str.length(); i5++) {
                    if (str.charAt(i5) <= '$') {
                        i4 = i5;
                    }
                }
                classFile.attributes = new Attribute[]{(Attribute) classConstantPool.add(new SourceFileAttribute(this.cpBands.cpUTF8Value((i4 > -1 && iLastIndexOf <= i4) ? str.substring(iLastIndexOf, i4) + ".java" : str.substring(iLastIndexOf) + ".java", false)))};
            } else {
                classFile.attributes = new Attribute[0];
            }
        } else {
            classFile.attributes = new Attribute[]{(Attribute) classConstantPool.add(sourceFileAttribute)};
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            Attribute attribute2 = arrayList.get(i6);
            if (!attribute2.isSourceFileAttribute()) {
                arrayList2.add(attribute2);
            }
        }
        Attribute[] attributeArr = classFile.attributes;
        Attribute[] attributeArr2 = new Attribute[attributeArr.length + arrayList2.size()];
        classFile.attributes = attributeArr2;
        System.arraycopy(attributeArr, 0, attributeArr2, 0, attributeArr.length);
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            Attribute attribute3 = (Attribute) arrayList2.get(i7);
            classConstantPool.add(attribute3);
            classFile.attributes[attributeArr.length + i7] = attribute3;
        }
        ClassFileEntry classFileEntryAdd = classConstantPool.add(this.cpBands.cpClassValue(i3));
        ClassFileEntry classFileEntryAdd2 = classConstantPool.add(this.cpBands.cpClassValue(this.classBands.getClassSuperInts()[i]));
        int length = this.classBands.getClassInterfacesInts()[i].length;
        ClassFileEntry[] classFileEntryArr = new ClassFileEntry[length];
        for (int i8 = 0; i8 < length; i8++) {
            classFileEntryArr[i8] = classConstantPool.add(this.cpBands.cpClassValue(this.classBands.getClassInterfacesInts()[i][i8]));
        }
        int i9 = this.classBands.getClassFieldCount()[i];
        ClassFileEntry[] classFileEntryArr2 = new ClassFileEntry[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.classBands.getFieldDescrInts()[i][i10];
            classFileEntryArr2[i10] = classConstantPool.add(new CPField(this.cpBands.cpUTF8Value(this.cpBands.getCpDescriptorNameInts()[i11]), this.cpBands.cpSignatureValue(this.cpBands.getCpDescriptorTypeInts()[i11]), this.classBands.getFieldFlags()[i][i10], this.classBands.getFieldAttributes()[i][i10]));
        }
        int i12 = this.classBands.getClassMethodCount()[i];
        ClassFileEntry[] classFileEntryArr3 = new ClassFileEntry[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = this.classBands.getMethodDescrInts()[i][i13];
            classFileEntryArr3[i13] = classConstantPool.add(new CPMethod(this.cpBands.cpUTF8Value(this.cpBands.getCpDescriptorNameInts()[i14]), this.cpBands.cpSignatureValue(this.cpBands.getCpDescriptorTypeInts()[i14]), this.classBands.getMethodFlags()[i][i13], this.classBands.getMethodAttributes()[i][i13]));
        }
        classConstantPool.addNestedEntries();
        IcTuple[] icTupleArr = getClassBands().getIcLocal()[i];
        boolean z = icTupleArr != null;
        InnerClassesAttribute innerClassesAttribute = new InnerClassesAttribute(AttributeLayout.ATTRIBUTE_INNER_CLASSES);
        IcTuple[] relevantIcTuples = getIcBands().getRelevantIcTuples(str, classConstantPool);
        Iterator<IcTuple> it = computeIcStored(icTupleArr, relevantIcTuples).iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            IcTuple next = it.next();
            int iThisClassIndex = next.thisClassIndex();
            Iterator<IcTuple> it2 = it;
            int iOuterClassIndex = next.outerClassIndex();
            ClassFileEntry[] classFileEntryArr4 = classFileEntryArr3;
            int iSimpleClassNameIndex = next.simpleClassNameIndex();
            ClassFileEntry[] classFileEntryArr5 = classFileEntryArr2;
            String strThisClassString = next.thisClassString();
            ClassFileEntry[] classFileEntryArr6 = classFileEntryArr;
            String strOuterClassString = next.outerClassString();
            int i15 = length;
            String strSimpleClassName = next.simpleClassName();
            ClassFileEntry classFileEntry = classFileEntryAdd2;
            if (iThisClassIndex != -1) {
                cPClassCpClassValue = this.cpBands.cpClassValue(iThisClassIndex);
            } else {
                cPClassCpClassValue = this.cpBands.cpClassValue(strThisClassString);
            }
            if (next.isAnonymous()) {
                cputf8CpUTF8Value = null;
            } else if (iSimpleClassNameIndex != -1) {
                cputf8CpUTF8Value = this.cpBands.cpUTF8Value(iSimpleClassNameIndex);
            } else {
                cputf8CpUTF8Value = this.cpBands.cpUTF8Value(strSimpleClassName);
            }
            if (next.isMember()) {
                CpBands cpBands = this.cpBands;
                cPClassCpClassValue2 = iOuterClassIndex != -1 ? cpBands.cpClassValue(iOuterClassIndex) : cpBands.cpClassValue(strOuterClassString);
            } else {
                cPClassCpClassValue2 = null;
            }
            innerClassesAttribute.addInnerClassesEntry(cPClassCpClassValue, cPClassCpClassValue2, cputf8CpUTF8Value, next.f9879F);
            it = it2;
            classFileEntryArr3 = classFileEntryArr4;
            classFileEntryArr2 = classFileEntryArr5;
            classFileEntryArr = classFileEntryArr6;
            length = i15;
            classFileEntryAdd2 = classFileEntry;
            z2 = true;
        }
        ClassFileEntry classFileEntry2 = classFileEntryAdd2;
        int i16 = length;
        ClassFileEntry[] classFileEntryArr7 = classFileEntryArr3;
        ClassFileEntry[] classFileEntryArr8 = classFileEntryArr;
        ClassFileEntry[] classFileEntryArr9 = classFileEntryArr2;
        if (z && icTupleArr.length == 0) {
            z2 = false;
        }
        if (!z && relevantIcTuples.length == 0) {
            z2 = false;
        }
        if (z2) {
            Attribute[] attributeArr3 = classFile.attributes;
            int length2 = attributeArr3.length;
            Attribute[] attributeArr4 = new Attribute[length2 + 1];
            i2 = 0;
            System.arraycopy(attributeArr3, 0, attributeArr4, 0, attributeArr3.length);
            attributeArr4[length2] = innerClassesAttribute;
            classFile.attributes = attributeArr4;
            classConstantPool.addWithNestedEntries(innerClassesAttribute);
        } else {
            i2 = 0;
        }
        classConstantPool.resolve(this);
        classFile.accessFlags = (int) this.classBands.getClassFlags()[i];
        classFile.thisClass = classConstantPool.indexOf(classFileEntryAdd);
        classFile.superClass = classConstantPool.indexOf(classFileEntry2);
        classFile.interfaces = new int[i16];
        for (int i17 = i2; i17 < i16; i17++) {
            classFile.interfaces[i17] = classConstantPool.indexOf(classFileEntryArr8[i17]);
        }
        classFile.fields = classFileEntryArr9;
        classFile.methods = classFileEntryArr7;
        return classFile;
    }

    public final List<IcTuple> computeIcStored(IcTuple[] icTupleArr, IcTuple[] icTupleArr2) {
        final ArrayList arrayList = new ArrayList(icTupleArr2.length);
        ArrayList arrayList2 = new ArrayList(icTupleArr2.length);
        HashSet hashSet = new HashSet(icTupleArr2.length);
        if (icTupleArr != null) {
            for (IcTuple icTuple : icTupleArr) {
                if (hashSet.add(icTuple)) {
                    arrayList.add(icTuple);
                }
            }
        }
        for (IcTuple icTuple2 : icTupleArr2) {
            if (hashSet.add(icTuple2)) {
                arrayList.add(icTuple2);
            } else {
                arrayList2.add(icTuple2);
            }
        }
        arrayList2.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.unpack200.Segment$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.remove((IcTuple) obj);
            }
        });
        return arrayList;
    }

    public final void readSegment(InputStream inputStream) throws Pack200Exception, IOException {
        log(2, "-------");
        CpBands cpBands = new CpBands(this);
        this.cpBands = cpBands;
        cpBands.read(inputStream);
        AttrDefinitionBands attrDefinitionBands = new AttrDefinitionBands(this);
        this.attrDefinitionBands = attrDefinitionBands;
        attrDefinitionBands.read(inputStream);
        IcBands icBands = new IcBands(this);
        this.icBands = icBands;
        icBands.read(inputStream);
        ClassBands classBands = new ClassBands(this);
        this.classBands = classBands;
        classBands.read(inputStream);
        BcBands bcBands = new BcBands(this);
        this.bcBands = bcBands;
        bcBands.read(inputStream);
        FileBands fileBands = new FileBands(this);
        this.fileBands = fileBands;
        fileBands.read(inputStream);
        this.fileBands.processFileBits();
    }

    public final void parseSegment() throws Pack200Exception, IOException {
        this.header.unpack();
        this.cpBands.unpack();
        this.attrDefinitionBands.unpack();
        this.icBands.unpack();
        this.classBands.unpack();
        this.bcBands.unpack();
        this.fileBands.unpack();
        int numberOfFiles = this.header.getNumberOfFiles();
        String[] fileName = this.fileBands.getFileName();
        int[] fileOptions = this.fileBands.getFileOptions();
        SegmentOptions options = this.header.getOptions();
        this.classFilesContents = new byte[numberOfFiles][];
        this.fileDeflate = new boolean[numberOfFiles];
        this.fileIsClass = new boolean[numberOfFiles];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int i = 0;
        for (int i2 = 0; i2 < numberOfFiles; i2++) {
            String str = fileName[i2];
            boolean z = true;
            boolean z2 = str == null || str.equals("");
            boolean z3 = (fileOptions[i2] & 2) == 2 || z2;
            if (z3 && z2) {
                fileName[i2] = this.cpBands.getCpClass()[this.classBands.getClassThisInts()[i]] + ClassPath.CLASS_FILE_NAME_EXTENSION;
            }
            if (!this.overrideDeflateHint) {
                boolean[] zArr = this.fileDeflate;
                if ((fileOptions[i2] & 1) != 1 && !options.shouldDeflate()) {
                    z = false;
                }
                zArr[i2] = z;
            } else {
                this.fileDeflate[i2] = this.deflateHint;
            }
            this.fileIsClass[i2] = z3;
            if (z3) {
                buildClassFile(i).write(dataOutputStream);
                dataOutputStream.flush();
                this.classFilesContents[i] = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.reset();
                i++;
            }
        }
    }

    public void unpack(InputStream inputStream, JarOutputStream jarOutputStream) throws Pack200Exception, Error, IOException {
        unpackRead(inputStream);
        unpackProcess();
        unpackWrite(jarOutputStream);
    }

    public void unpackRead(InputStream inputStream) throws Pack200Exception, Error, IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        SegmentHeader segmentHeader = new SegmentHeader(this);
        this.header = segmentHeader;
        segmentHeader.read(inputStream);
        int archiveSize = ((int) this.header.getArchiveSize()) - this.header.getArchiveSizeOffset();
        if (this.doPreRead && this.header.getArchiveSize() != 0) {
            byte[] bArr = new byte[archiveSize];
            inputStream.read(bArr);
            this.internalBuffer = new BufferedInputStream(new ByteArrayInputStream(bArr));
            return;
        }
        readSegment(inputStream);
    }

    public void unpackProcess() throws Pack200Exception, IOException {
        InputStream inputStream = this.internalBuffer;
        if (inputStream != null) {
            readSegment(inputStream);
        }
        parseSegment();
    }

    public void unpackWrite(JarOutputStream jarOutputStream) throws IOException {
        writeJar(jarOutputStream);
        PrintWriter printWriter = this.logStream;
        if (printWriter != null) {
            printWriter.close();
        }
    }

    public void writeJar(JarOutputStream jarOutputStream) throws IOException {
        String[] strArr;
        int[] iArr;
        String[] fileName = this.fileBands.getFileName();
        int[] fileModtime = this.fileBands.getFileModtime();
        long[] fileSize = this.fileBands.getFileSize();
        byte[][] fileBits = this.fileBands.getFileBits();
        int numberOfFiles = this.header.getNumberOfFiles();
        long archiveModtime = this.header.getArchiveModtime();
        int i = 0;
        int i2 = 0;
        while (i < numberOfFiles) {
            String str = fileName[i];
            long j = (fileModtime[i] + archiveModtime) * 1000;
            boolean z = this.fileDeflate[i];
            JarEntry jarEntry = new JarEntry(str);
            if (z) {
                jarEntry.setMethod(8);
                strArr = fileName;
                iArr = fileModtime;
            } else {
                jarEntry.setMethod(0);
                CRC32 crc32 = new CRC32();
                if (this.fileIsClass[i]) {
                    crc32.update(this.classFilesContents[i2]);
                    strArr = fileName;
                    iArr = fileModtime;
                    jarEntry.setSize(this.classFilesContents[i2].length);
                } else {
                    strArr = fileName;
                    iArr = fileModtime;
                    crc32.update(fileBits[i]);
                    jarEntry.setSize(fileSize[i]);
                }
                jarEntry.setCrc(crc32.getValue());
            }
            jarEntry.setTime(j - TimeZone.getDefault().getRawOffset());
            jarOutputStream.putNextEntry(jarEntry);
            if (this.fileIsClass[i]) {
                jarEntry.setSize(this.classFilesContents[i2].length);
                jarOutputStream.write(this.classFilesContents[i2]);
                i2++;
            } else {
                jarEntry.setSize(fileSize[i]);
                jarOutputStream.write(fileBits[i]);
            }
            i++;
            fileName = strArr;
            fileModtime = iArr;
        }
    }

    public SegmentConstantPool getConstantPool() {
        return this.cpBands.getConstantPool();
    }

    public SegmentHeader getSegmentHeader() {
        return this.header;
    }

    public void setPreRead(boolean z) {
        this.doPreRead = z;
    }

    public AttrDefinitionBands getAttrDefinitionBands() {
        return this.attrDefinitionBands;
    }

    public ClassBands getClassBands() {
        return this.classBands;
    }

    public CpBands getCpBands() {
        return this.cpBands;
    }

    public IcBands getIcBands() {
        return this.icBands;
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    public void setLogStream(OutputStream outputStream) {
        this.logStream = new PrintWriter((Writer) new OutputStreamWriter(outputStream, Charset.defaultCharset()), false);
    }

    public void log(int i, String str) {
        if (this.logLevel >= i) {
            this.logStream.println(str);
        }
    }

    public void overrideDeflateHint(boolean z) {
        this.overrideDeflateHint = true;
        this.deflateHint = z;
    }
}
