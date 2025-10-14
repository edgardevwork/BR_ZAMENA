package org.apache.commons.compress.archivers.tar;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.math.BigDecimal;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import kotlin.p051io.path.PathTreeWalkKt$$ExternalSyntheticApiModelOutline0;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.EntryStreamOffsets;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.lang3.SystemUtils;

/* loaded from: classes8.dex */
public class TarArchiveEntry implements ArchiveEntry, TarConstants, EntryStreamOffsets {
    public static final int DEFAULT_DIR_MODE = 16877;
    public static final int DEFAULT_FILE_MODE = 33188;
    public static final TarArchiveEntry[] EMPTY_TAR_ARCHIVE_ENTRY_ARRAY = new TarArchiveEntry[0];
    public static final int MAX_NAMELEN = 31;
    public static final int MILLIS_PER_SECOND = 1000;
    public static final long UNKNOWN = -1;
    public FileTime aTime;
    public FileTime birthTime;
    public FileTime cTime;
    public boolean checkSumOK;
    public long dataOffset;
    public int devMajor;
    public int devMinor;
    public final Map<String, String> extraPaxHeaders;
    public final Path file;
    public long groupId;
    public String groupName;
    public boolean isExtended;
    public byte linkFlag;
    public String linkName;
    public final LinkOption[] linkOptions;
    public FileTime mTime;
    public String magic;
    public int mode;
    public String name;
    public boolean paxGNU1XSparse;
    public boolean paxGNUSparse;
    public final boolean preserveAbsolutePath;
    public long realSize;
    public long size;
    public List<TarArchiveStructSparse> sparseHeaders;
    public boolean starSparse;
    public long userId;
    public String userName;
    public String version;

    @Override // org.apache.commons.compress.archivers.EntryStreamOffsets
    public boolean isStreamContiguous() {
        return true;
    }

    public static FileTime fileTimeFromOptionalSeconds(long j) {
        if (j <= 0) {
            return null;
        }
        return FileTime.from(j, TimeUnit.SECONDS);
    }

    public static String normalizeFileName(String str, boolean z) {
        String property;
        int iIndexOf;
        if (!z && (property = System.getProperty("os.name")) != null) {
            String lowerCase = property.toLowerCase(Locale.ROOT);
            if (lowerCase.startsWith("windows")) {
                if (str.length() > 2) {
                    char cCharAt = str.charAt(0);
                    if (str.charAt(1) == ':' && ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                        str = str.substring(2);
                    }
                }
            } else if (lowerCase.contains("netware") && (iIndexOf = str.indexOf(58)) != -1) {
                str = str.substring(iIndexOf + 1);
            }
        }
        String strReplace = str.replace(File.separatorChar, '/');
        while (!z && strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        return strReplace;
    }

    public static Instant parseInstantFromDecimalSeconds(String str) {
        BigDecimal bigDecimal = new BigDecimal(str);
        return Instant.ofEpochSecond(bigDecimal.longValue(), bigDecimal.remainder(BigDecimal.ONE).movePointRight(9).longValue());
    }

    public TarArchiveEntry(boolean z) {
        this.name = "";
        this.linkName = "";
        this.magic = "ustar\u0000";
        this.version = "00";
        this.groupName = "";
        this.extraPaxHeaders = new HashMap();
        this.dataOffset = -1L;
        String property = System.getProperty(SystemUtils.USER_NAME_KEY, "");
        this.userName = property.length() > 31 ? property.substring(0, 31) : property;
        this.file = null;
        this.linkOptions = IOUtils.EMPTY_LINK_OPTIONS;
        this.preserveAbsolutePath = z;
    }

    public TarArchiveEntry(byte[] bArr) {
        this(false);
        parseTarHeader(bArr);
    }

    public TarArchiveEntry(byte[] bArr, ZipEncoding zipEncoding) throws IOException {
        this(bArr, zipEncoding, false);
    }

    public TarArchiveEntry(byte[] bArr, ZipEncoding zipEncoding, boolean z) throws IOException {
        this((Map<String, String>) Collections.emptyMap(), bArr, zipEncoding, z);
    }

    public TarArchiveEntry(byte[] bArr, ZipEncoding zipEncoding, boolean z, long j) throws IOException {
        this(bArr, zipEncoding, z);
        setDataOffset(j);
    }

    public TarArchiveEntry(File file) {
        this(file, file.getPath());
    }

    public TarArchiveEntry(File file, String str) {
        this.name = "";
        this.linkName = "";
        this.magic = "ustar\u0000";
        this.version = "00";
        this.groupName = "";
        this.extraPaxHeaders = new HashMap();
        this.dataOffset = -1L;
        String strNormalizeFileName = normalizeFileName(str, false);
        Path path = file.toPath();
        this.file = path;
        this.linkOptions = IOUtils.EMPTY_LINK_OPTIONS;
        try {
            readFileMode(path, strNormalizeFileName, new LinkOption[0]);
        } catch (IOException unused) {
            if (!file.isDirectory()) {
                this.size = file.length();
            }
        }
        this.userName = "";
        try {
            readOsSpecificProperties(this.file, new LinkOption[0]);
        } catch (IOException unused2) {
            this.mTime = FileTime.fromMillis(file.lastModified());
        }
        this.preserveAbsolutePath = false;
    }

    public TarArchiveEntry(Map<String, String> map, byte[] bArr, ZipEncoding zipEncoding, boolean z) throws IOException {
        this(false);
        parseTarHeader(map, bArr, zipEncoding, false, z);
    }

    public TarArchiveEntry(Map<String, String> map, byte[] bArr, ZipEncoding zipEncoding, boolean z, long j) throws IOException {
        this(map, bArr, zipEncoding, z);
        setDataOffset(j);
    }

    public TarArchiveEntry(Path path) throws IOException {
        this(path, path.toString(), new LinkOption[0]);
    }

    public TarArchiveEntry(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        this.name = "";
        this.linkName = "";
        this.magic = "ustar\u0000";
        this.version = "00";
        this.groupName = "";
        this.extraPaxHeaders = new HashMap();
        this.dataOffset = -1L;
        String strNormalizeFileName = normalizeFileName(str, false);
        this.file = path;
        this.linkOptions = linkOptionArr == null ? IOUtils.EMPTY_LINK_OPTIONS : linkOptionArr;
        readFileMode(path, strNormalizeFileName, linkOptionArr);
        this.userName = "";
        readOsSpecificProperties(path, new LinkOption[0]);
        this.preserveAbsolutePath = false;
    }

    public TarArchiveEntry(String str) {
        this(str, false);
    }

    public TarArchiveEntry(String str, boolean z) {
        this(z);
        String strNormalizeFileName = normalizeFileName(str, z);
        boolean zEndsWith = strNormalizeFileName.endsWith("/");
        this.name = strNormalizeFileName;
        this.mode = zEndsWith ? 16877 : 33188;
        this.linkFlag = zEndsWith ? TarConstants.LF_DIR : (byte) 48;
        this.mTime = FileTime.from(Instant.now());
        this.userName = "";
    }

    public TarArchiveEntry(String str, byte b) {
        this(str, b, false);
    }

    public TarArchiveEntry(String str, byte b, boolean z) {
        this(str, z);
        this.linkFlag = b;
        if (b == 76) {
            this.magic = TarConstants.MAGIC_GNU;
            this.version = TarConstants.VERSION_GNU_SPACE;
        }
    }

    public void addPaxHeader(String str, String str2) throws NumberFormatException {
        try {
            processPaxHeader(str, str2);
        } catch (IOException e) {
            throw new IllegalArgumentException("Invalid input", e);
        }
    }

    public void clearExtraPaxHeaders() {
        this.extraPaxHeaders.clear();
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return equals((TarArchiveEntry) obj);
    }

    public boolean equals(TarArchiveEntry tarArchiveEntry) {
        return tarArchiveEntry != null && getName().equals(tarArchiveEntry.getName());
    }

    public final int evaluateType(Map<String, String> map, byte[] bArr) {
        if (ArchiveUtils.matchAsciiBuffer(TarConstants.MAGIC_GNU, bArr, 257, 6)) {
            return 2;
        }
        if (ArchiveUtils.matchAsciiBuffer("ustar\u0000", bArr, 257, 6)) {
            return isXstar(map, bArr) ? 4 : 3;
        }
        return 0;
    }

    public final int fill(byte b, int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = b;
        }
        return i + i2;
    }

    public final int fill(int i, int i2, byte[] bArr, int i3) {
        return fill((byte) i, i2, bArr, i3);
    }

    public void fillGNUSparse0xData(Map<String, String> map) {
        this.paxGNUSparse = true;
        this.realSize = Integer.parseInt(map.get("GNU.sparse.size"));
        if (map.containsKey("GNU.sparse.name")) {
            this.name = map.get("GNU.sparse.name");
        }
    }

    public void fillGNUSparse1xData(Map<String, String> map) throws IOException {
        this.paxGNUSparse = true;
        this.paxGNU1XSparse = true;
        if (map.containsKey("GNU.sparse.name")) {
            this.name = map.get("GNU.sparse.name");
        }
        if (map.containsKey("GNU.sparse.realsize")) {
            try {
                this.realSize = Integer.parseInt(map.get("GNU.sparse.realsize"));
            } catch (NumberFormatException unused) {
                throw new IOException("Corrupted TAR archive. GNU.sparse.realsize header for " + this.name + " contains non-numeric value");
            }
        }
    }

    public void fillStarSparseData(Map<String, String> map) throws IOException {
        this.starSparse = true;
        if (map.containsKey("SCHILY.realsize")) {
            try {
                this.realSize = Long.parseLong(map.get("SCHILY.realsize"));
            } catch (NumberFormatException unused) {
                throw new IOException("Corrupted TAR archive. SCHILY.realsize header for " + this.name + " contains non-numeric value");
            }
        }
    }

    public FileTime getCreationTime() {
        return this.birthTime;
    }

    @Override // org.apache.commons.compress.archivers.EntryStreamOffsets
    public long getDataOffset() {
        return this.dataOffset;
    }

    public int getDevMajor() {
        return this.devMajor;
    }

    public int getDevMinor() {
        return this.devMinor;
    }

    public TarArchiveEntry[] getDirectoryEntries() throws IOException {
        if (this.file == null || !isDirectory()) {
            return EMPTY_TAR_ARCHIVE_ENTRY_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        try {
            DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(this.file);
            try {
                Iterator it = directoryStreamNewDirectoryStream.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TarArchiveEntry(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(it.next())));
                }
                if (directoryStreamNewDirectoryStream != null) {
                    directoryStreamNewDirectoryStream.close();
                }
                return (TarArchiveEntry[]) arrayList.toArray(EMPTY_TAR_ARCHIVE_ENTRY_ARRAY);
            } finally {
            }
        } catch (IOException unused) {
            return EMPTY_TAR_ARCHIVE_ENTRY_ARRAY;
        }
    }

    public String getExtraPaxHeader(String str) {
        return this.extraPaxHeaders.get(str);
    }

    public Map<String, String> getExtraPaxHeaders() {
        return Collections.unmodifiableMap(this.extraPaxHeaders);
    }

    public File getFile() {
        Path path = this.file;
        if (path == null) {
            return null;
        }
        return path.toFile();
    }

    @Deprecated
    public int getGroupId() {
        return (int) this.groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public FileTime getLastAccessTime() {
        return this.aTime;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public Date getLastModifiedDate() {
        return getModTime();
    }

    public FileTime getLastModifiedTime() {
        return this.mTime;
    }

    public String getLinkName() {
        return this.linkName;
    }

    public long getLongGroupId() {
        return this.groupId;
    }

    public long getLongUserId() {
        return this.userId;
    }

    public int getMode() {
        return this.mode;
    }

    public Date getModTime() {
        return new Date(this.mTime.toMillis());
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public String getName() {
        return this.name;
    }

    public List<TarArchiveStructSparse> getOrderedSparseHeaders() throws IOException {
        List<TarArchiveStructSparse> list = this.sparseHeaders;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<TarArchiveStructSparse> list2 = (List) this.sparseHeaders.stream().filter(new Predicate() { // from class: org.apache.commons.compress.archivers.tar.TarArchiveEntry$$ExternalSyntheticLambda20
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return TarArchiveEntry.lambda$getOrderedSparseHeaders$0((TarArchiveStructSparse) obj);
            }
        }).sorted(Comparator.comparingLong(new ToLongFunction() { // from class: org.apache.commons.compress.archivers.tar.TarArchiveEntry$$ExternalSyntheticLambda21
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((TarArchiveStructSparse) obj).getOffset();
            }
        })).collect(Collectors.toList());
        int size = list2.size();
        int i = 0;
        while (i < size) {
            TarArchiveStructSparse tarArchiveStructSparse = list2.get(i);
            i++;
            if (i < size && tarArchiveStructSparse.getOffset() + tarArchiveStructSparse.getNumbytes() > list2.get(i).getOffset()) {
                throw new IOException("Corrupted TAR archive. Sparse blocks for " + getName() + " overlap each other.");
            }
            if (tarArchiveStructSparse.getOffset() + tarArchiveStructSparse.getNumbytes() < 0) {
                throw new IOException("Unreadable TAR archive. Offset and numbytes for sparse block in " + getName() + " too large.");
            }
        }
        if (!list2.isEmpty()) {
            TarArchiveStructSparse tarArchiveStructSparse2 = list2.get(size - 1);
            if (tarArchiveStructSparse2.getOffset() + tarArchiveStructSparse2.getNumbytes() > getRealSize()) {
                throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
            }
        }
        return list2;
    }

    public static /* synthetic */ boolean lambda$getOrderedSparseHeaders$0(TarArchiveStructSparse tarArchiveStructSparse) {
        return tarArchiveStructSparse.getOffset() > 0 || tarArchiveStructSparse.getNumbytes() > 0;
    }

    public Path getPath() {
        return this.file;
    }

    public long getRealSize() {
        if (!isSparse()) {
            return getSize();
        }
        return this.realSize;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public long getSize() {
        return this.size;
    }

    public List<TarArchiveStructSparse> getSparseHeaders() {
        return this.sparseHeaders;
    }

    public FileTime getStatusChangeTime() {
        return this.cTime;
    }

    @Deprecated
    public int getUserId() {
        return (int) this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public boolean isBlockDevice() {
        return this.linkFlag == 52;
    }

    public boolean isCharacterDevice() {
        return this.linkFlag == 51;
    }

    public boolean isCheckSumOK() {
        return this.checkSumOK;
    }

    public boolean isDescendent(TarArchiveEntry tarArchiveEntry) {
        return tarArchiveEntry.getName().startsWith(getName());
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public boolean isDirectory() {
        Path path = this.file;
        if (path != null) {
            return Files.isDirectory(path, this.linkOptions);
        }
        if (this.linkFlag == 53) {
            return true;
        }
        return (isPaxHeader() || isGlobalPaxHeader() || !getName().endsWith("/")) ? false : true;
    }

    public boolean isExtended() {
        return this.isExtended;
    }

    public boolean isFIFO() {
        return this.linkFlag == 54;
    }

    public boolean isFile() {
        Path path = this.file;
        if (path != null) {
            return Files.isRegularFile(path, this.linkOptions);
        }
        byte b = this.linkFlag;
        if (b == 0 || b == 48) {
            return true;
        }
        return !getName().endsWith("/");
    }

    public boolean isGlobalPaxHeader() {
        return this.linkFlag == 103;
    }

    public boolean isGNULongLinkEntry() {
        return this.linkFlag == 75;
    }

    public boolean isGNULongNameEntry() {
        return this.linkFlag == 76;
    }

    public boolean isGNUSparse() {
        return isOldGNUSparse() || isPaxGNUSparse();
    }

    public final boolean isInvalidPrefix(byte[] bArr) {
        byte b = bArr[475];
        if (b != 0) {
            return bArr[156] != 77 || ((bArr[464] & 128) == 0 && b != 32);
        }
        return false;
    }

    public final boolean isInvalidXtarTime(byte[] bArr, int i, int i2) {
        if ((bArr[i] & 128) == 0) {
            int i3 = i2 - 1;
            for (int i4 = 0; i4 < i3; i4++) {
                byte b = bArr[i + i4];
                if (b < 48 || b > 55) {
                    return true;
                }
            }
            byte b2 = bArr[i + i3];
            if (b2 != 32 && b2 != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isLink() {
        return this.linkFlag == 49;
    }

    public boolean isOldGNUSparse() {
        return this.linkFlag == 83;
    }

    public boolean isPaxGNU1XSparse() {
        return this.paxGNU1XSparse;
    }

    public boolean isPaxGNUSparse() {
        return this.paxGNUSparse;
    }

    public boolean isPaxHeader() {
        byte b = this.linkFlag;
        return b == 120 || b == 88;
    }

    public boolean isSparse() {
        return isGNUSparse() || isStarSparse();
    }

    public boolean isStarSparse() {
        return this.starSparse;
    }

    public boolean isSymbolicLink() {
        return this.linkFlag == 50;
    }

    public final boolean isXstar(Map<String, String> map, byte[] bArr) {
        if (ArchiveUtils.matchAsciiBuffer(TarConstants.MAGIC_XSTAR, bArr, 508, 4)) {
            return true;
        }
        String str = map.get("SCHILY.archtype");
        return str != null ? "xustar".equals(str) || "exustar".equals(str) : (isInvalidPrefix(bArr) || isInvalidXtarTime(bArr, TarConstants.XSTAR_ATIME_OFFSET, 12) || isInvalidXtarTime(bArr, TarConstants.XSTAR_CTIME_OFFSET, 12)) ? false : true;
    }

    public final long parseOctalOrBinary(byte[] bArr, int i, int i2, boolean z) {
        if (z) {
            try {
                return TarUtils.parseOctalOrBinary(bArr, i, i2);
            } catch (IllegalArgumentException unused) {
                return -1L;
            }
        }
        return TarUtils.parseOctalOrBinary(bArr, i, i2);
    }

    public void parseTarHeader(byte[] bArr) {
        try {
            try {
                parseTarHeader(bArr, TarUtils.DEFAULT_ENCODING);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        } catch (IOException unused) {
            parseTarHeader(bArr, TarUtils.DEFAULT_ENCODING, true, false);
        }
    }

    public void parseTarHeader(byte[] bArr, ZipEncoding zipEncoding) throws IOException {
        parseTarHeader(bArr, zipEncoding, false, false);
    }

    public final void parseTarHeader(byte[] bArr, ZipEncoding zipEncoding, boolean z, boolean z2) throws IOException {
        parseTarHeader(Collections.emptyMap(), bArr, zipEncoding, z, z2);
    }

    public final void parseTarHeader(Map<String, String> map, byte[] bArr, ZipEncoding zipEncoding, boolean z, boolean z2) throws IOException {
        try {
            parseTarHeaderUnwrapped(map, bArr, zipEncoding, z, z2);
        } catch (IllegalArgumentException e) {
            throw new IOException("Corrupted TAR archive.", e);
        }
    }

    public final void parseTarHeaderUnwrapped(Map<String, String> map, byte[] bArr, ZipEncoding zipEncoding, boolean z, boolean z2) throws IOException {
        String name;
        String name2;
        String name3;
        String name4;
        String name5;
        String name6;
        if (z) {
            name = TarUtils.parseName(bArr, 0, 100);
        } else {
            name = TarUtils.parseName(bArr, 0, 100, zipEncoding);
        }
        this.name = name;
        this.mode = (int) parseOctalOrBinary(bArr, 100, 8, z2);
        this.userId = (int) parseOctalOrBinary(bArr, 108, 8, z2);
        this.groupId = (int) parseOctalOrBinary(bArr, 116, 8, z2);
        long octalOrBinary = TarUtils.parseOctalOrBinary(bArr, 124, 12);
        this.size = octalOrBinary;
        if (octalOrBinary < 0) {
            throw new IOException("broken archive, entry with negative size");
        }
        this.mTime = FileTime.from(parseOctalOrBinary(bArr, 136, 12, z2), TimeUnit.SECONDS);
        this.checkSumOK = TarUtils.verifyCheckSum(bArr);
        this.linkFlag = bArr[156];
        if (z) {
            name2 = TarUtils.parseName(bArr, 157, 100);
        } else {
            name2 = TarUtils.parseName(bArr, 157, 100, zipEncoding);
        }
        this.linkName = name2;
        this.magic = TarUtils.parseName(bArr, 257, 6);
        this.version = TarUtils.parseName(bArr, TarConstants.VERSION_OFFSET, 2);
        if (z) {
            name3 = TarUtils.parseName(bArr, 265, 32);
        } else {
            name3 = TarUtils.parseName(bArr, 265, 32, zipEncoding);
        }
        this.userName = name3;
        if (z) {
            name4 = TarUtils.parseName(bArr, 297, 32);
        } else {
            name4 = TarUtils.parseName(bArr, 297, 32, zipEncoding);
        }
        this.groupName = name4;
        byte b = this.linkFlag;
        if (b == 51 || b == 52) {
            this.devMajor = (int) parseOctalOrBinary(bArr, 329, 8, z2);
            this.devMinor = (int) parseOctalOrBinary(bArr, 337, 8, z2);
        }
        int iEvaluateType = evaluateType(map, bArr);
        if (iEvaluateType == 2) {
            this.aTime = fileTimeFromOptionalSeconds(parseOctalOrBinary(bArr, TarConstants.XSTAR_PREFIX_OFFSET, 12, z2));
            this.cTime = fileTimeFromOptionalSeconds(parseOctalOrBinary(bArr, 357, 12, z2));
            this.sparseHeaders = new ArrayList(TarUtils.readSparseStructs(bArr, 386, 4));
            this.isExtended = TarUtils.parseBoolean(bArr, 482);
            this.realSize = TarUtils.parseOctal(bArr, 483, 12);
            return;
        }
        if (iEvaluateType == 4) {
            if (z) {
                name5 = TarUtils.parseName(bArr, TarConstants.XSTAR_PREFIX_OFFSET, 131);
            } else {
                name5 = TarUtils.parseName(bArr, TarConstants.XSTAR_PREFIX_OFFSET, 131, zipEncoding);
            }
            if (!name5.isEmpty()) {
                this.name = name5 + "/" + this.name;
            }
            this.aTime = fileTimeFromOptionalSeconds(parseOctalOrBinary(bArr, TarConstants.XSTAR_ATIME_OFFSET, 12, z2));
            this.cTime = fileTimeFromOptionalSeconds(parseOctalOrBinary(bArr, TarConstants.XSTAR_CTIME_OFFSET, 12, z2));
            return;
        }
        if (z) {
            name6 = TarUtils.parseName(bArr, TarConstants.XSTAR_PREFIX_OFFSET, 155);
        } else {
            name6 = TarUtils.parseName(bArr, TarConstants.XSTAR_PREFIX_OFFSET, 155, zipEncoding);
        }
        if (isDirectory() && !this.name.endsWith("/")) {
            this.name += "/";
        }
        if (name6.isEmpty()) {
            return;
        }
        this.name = name6 + "/" + this.name;
    }

    public final void processPaxHeader(String str, String str2) throws IOException, NumberFormatException {
        processPaxHeader(str, str2, this.extraPaxHeaders);
    }

    public final void processPaxHeader(String str, String str2, Map<String, String> map) throws IOException, NumberFormatException {
        str.hashCode();
        switch (str) {
            case "SCHILY.devmajor":
                int i = Integer.parseInt(str2);
                if (i < 0) {
                    throw new IOException("Corrupted TAR archive. Dev-Major is negative");
                }
                setDevMajor(i);
                return;
            case "SCHILY.devminor":
                int i2 = Integer.parseInt(str2);
                if (i2 < 0) {
                    throw new IOException("Corrupted TAR archive. Dev-Minor is negative");
                }
                setDevMinor(i2);
                return;
            case "GNU.sparse.realsize":
                fillGNUSparse1xData(map);
                return;
            case "GNU.sparse.size":
                fillGNUSparse0xData(map);
                return;
            case "gid":
                setGroupId(Long.parseLong(str2));
                return;
            case "uid":
                setUserId(Long.parseLong(str2));
                return;
            case "path":
                setName(str2);
                return;
            case "size":
                long j = Long.parseLong(str2);
                if (j < 0) {
                    throw new IOException("Corrupted TAR archive. Entry size is negative");
                }
                setSize(j);
                return;
            case "atime":
                setLastAccessTime(FileTime.from(parseInstantFromDecimalSeconds(str2)));
                return;
            case "ctime":
                setStatusChangeTime(FileTime.from(parseInstantFromDecimalSeconds(str2)));
                return;
            case "gname":
                setGroupName(str2);
                return;
            case "mtime":
                setLastModifiedTime(FileTime.from(parseInstantFromDecimalSeconds(str2)));
                return;
            case "uname":
                setUserName(str2);
                return;
            case "LIBARCHIVE.creationtime":
                setCreationTime(FileTime.from(parseInstantFromDecimalSeconds(str2)));
                return;
            case "SCHILY.filetype":
                if ("sparse".equals(str2)) {
                    fillStarSparseData(map);
                    return;
                }
                return;
            case "linkpath":
                setLinkName(str2);
                return;
            default:
                this.extraPaxHeaders.put(str, str2);
                return;
        }
    }

    public final void readFileMode(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        if (Files.isDirectory(path, linkOptionArr)) {
            this.mode = 16877;
            this.linkFlag = TarConstants.LF_DIR;
            int length = str.length();
            if (length == 0 || str.charAt(length - 1) != '/') {
                this.name = str + "/";
                return;
            }
            this.name = str;
            return;
        }
        this.mode = 33188;
        this.linkFlag = (byte) 48;
        this.name = str;
        this.size = Files.size(path);
    }

    public final void readOsSpecificProperties(Path path, LinkOption... linkOptionArr) throws IOException {
        Set setSupportedFileAttributeViews = path.getFileSystem().supportedFileAttributeViews();
        if (setSupportedFileAttributeViews.contains("posix")) {
            PosixFileAttributes posixFileAttributesM7292m = TarArchiveEntry$$ExternalSyntheticApiModelOutline15.m7292m(Files.readAttributes(path, TarArchiveEntry$$ExternalSyntheticApiModelOutline14.m7291m(), linkOptionArr));
            setLastModifiedTime(posixFileAttributesM7292m.lastModifiedTime());
            setCreationTime(posixFileAttributesM7292m.creationTime());
            setLastAccessTime(posixFileAttributesM7292m.lastAccessTime());
            this.userName = posixFileAttributesM7292m.owner().getName();
            this.groupName = posixFileAttributesM7292m.group().getName();
            if (setSupportedFileAttributeViews.contains("unix")) {
                this.userId = ((Number) Files.getAttribute(path, "unix:uid", linkOptionArr)).longValue();
                this.groupId = ((Number) Files.getAttribute(path, "unix:gid", linkOptionArr)).longValue();
                try {
                    setStatusChangeTime(TarArchiveEntry$$ExternalSyntheticApiModelOutline5.m7300m(Files.getAttribute(path, "unix:ctime", linkOptionArr)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
            return;
        }
        if (setSupportedFileAttributeViews.contains("dos")) {
            DosFileAttributes dosFileAttributesM7304m = TarArchiveEntry$$ExternalSyntheticApiModelOutline9.m7304m(Files.readAttributes(path, TarArchiveEntry$$ExternalSyntheticApiModelOutline8.m7303m(), linkOptionArr));
            setLastModifiedTime(dosFileAttributesM7304m.lastModifiedTime());
            setCreationTime(dosFileAttributesM7304m.creationTime());
            setLastAccessTime(dosFileAttributesM7304m.lastAccessTime());
            this.userName = Files.getOwner(path, linkOptionArr).getName();
            return;
        }
        BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) PathTreeWalkKt$$ExternalSyntheticApiModelOutline0.m7151m(), linkOptionArr);
        setLastModifiedTime(attributes.lastModifiedTime());
        setCreationTime(attributes.creationTime());
        setLastAccessTime(attributes.lastAccessTime());
        this.userName = Files.getOwner(path, linkOptionArr).getName();
    }

    public void setCreationTime(FileTime fileTime) {
        this.birthTime = fileTime;
    }

    public void setDataOffset(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("The offset can not be smaller than 0");
        }
        this.dataOffset = j;
    }

    public void setDevMajor(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Major device number is out of range: " + i);
        }
        this.devMajor = i;
    }

    public void setDevMinor(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Minor device number is out of range: " + i);
        }
        this.devMinor = i;
    }

    public void setGroupId(int i) {
        setGroupId(i);
    }

    public void setGroupId(long j) {
        this.groupId = j;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setIds(int i, int i2) {
        setUserId(i);
        setGroupId(i2);
    }

    public void setLastAccessTime(FileTime fileTime) {
        this.aTime = fileTime;
    }

    public void setLastModifiedTime(FileTime fileTime) {
        Objects.requireNonNull(fileTime, "Time must not be null");
        this.mTime = TarArchiveEntry$$ExternalSyntheticApiModelOutline5.m7300m(fileTime);
    }

    public void setLinkName(String str) {
        this.linkName = str;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setModTime(Date date) {
        setLastModifiedTime(FileTime.fromMillis(date.getTime()));
    }

    public void setModTime(FileTime fileTime) {
        setLastModifiedTime(fileTime);
    }

    public void setModTime(long j) {
        setLastModifiedTime(FileTime.fromMillis(j));
    }

    public void setName(String str) {
        this.name = normalizeFileName(str, this.preserveAbsolutePath);
    }

    public void setNames(String str, String str2) {
        setUserName(str);
        setGroupName(str2);
    }

    public void setSize(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Size is out of range: " + j);
        }
        this.size = j;
    }

    public void setSparseHeaders(List<TarArchiveStructSparse> list) {
        this.sparseHeaders = list;
    }

    public void setStatusChangeTime(FileTime fileTime) {
        this.cTime = fileTime;
    }

    public void setUserId(int i) {
        setUserId(i);
    }

    public void setUserId(long j) {
        this.userId = j;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void updateEntryFromPaxHeaders(Map<String, String> map) throws IOException, NumberFormatException {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            processPaxHeader(entry.getKey(), entry.getValue(), map);
        }
    }

    public void writeEntryHeader(byte[] bArr) {
        try {
            try {
                writeEntryHeader(bArr, TarUtils.DEFAULT_ENCODING, false);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        } catch (IOException unused) {
            writeEntryHeader(bArr, TarUtils.FALLBACK_ENCODING, false);
        }
    }

    public void writeEntryHeader(byte[] bArr, ZipEncoding zipEncoding, boolean z) throws IOException {
        int iWriteEntryHeaderField = writeEntryHeaderField(this.mTime.to(TimeUnit.SECONDS), bArr, writeEntryHeaderField(this.size, bArr, writeEntryHeaderField(this.groupId, bArr, writeEntryHeaderField(this.userId, bArr, writeEntryHeaderField(this.mode, bArr, TarUtils.formatNameBytes(this.name, bArr, 0, 100, zipEncoding), 8, z), 8, z), 8, z), 12, z), 12, z);
        int iFill = fill((byte) 32, iWriteEntryHeaderField, bArr, 8);
        bArr[iFill] = this.linkFlag;
        int iWriteEntryHeaderField2 = writeEntryHeaderField(this.devMinor, bArr, writeEntryHeaderField(this.devMajor, bArr, TarUtils.formatNameBytes(this.groupName, bArr, TarUtils.formatNameBytes(this.userName, bArr, TarUtils.formatNameBytes(this.version, bArr, TarUtils.formatNameBytes(this.magic, bArr, TarUtils.formatNameBytes(this.linkName, bArr, iFill + 1, 100, zipEncoding), 6), 2), 32, zipEncoding), 32, zipEncoding), 8, z), 8, z);
        if (z) {
            iWriteEntryHeaderField2 = fill(0, fill(0, writeEntryHeaderOptionalTimeField(this.cTime, writeEntryHeaderOptionalTimeField(this.aTime, fill(0, iWriteEntryHeaderField2, bArr, 131), bArr, 12), bArr, 12), bArr, 8), bArr, 4);
        }
        fill(0, iWriteEntryHeaderField2, bArr, bArr.length - iWriteEntryHeaderField2);
        TarUtils.formatCheckSumOctalBytes(TarUtils.computeCheckSum(bArr), bArr, iWriteEntryHeaderField, 8);
    }

    public final int writeEntryHeaderField(long j, byte[] bArr, int i, int i2, boolean z) {
        if (!z && (j < 0 || j >= (1 << ((i2 - 1) * 3)))) {
            return TarUtils.formatLongOctalBytes(0L, bArr, i, i2);
        }
        return TarUtils.formatLongOctalOrBinaryBytes(j, bArr, i, i2);
    }

    public final int writeEntryHeaderOptionalTimeField(FileTime fileTime, int i, byte[] bArr, int i2) {
        if (fileTime != null) {
            return writeEntryHeaderField(fileTime.to(TimeUnit.SECONDS), bArr, i, i2, true);
        }
        return fill(0, i, bArr, i2);
    }
}
