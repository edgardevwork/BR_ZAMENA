package org.apache.ivy.osgi.util;

import java.text.ParseException;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes6.dex */
public class VersionRange {
    public boolean endExclusive;
    public Version endVersion;
    public boolean startExclusive;
    public Version startVersion;

    public VersionRange(String str) throws ParseException {
        if (StringUtils.isNullOrEmpty(str)) {
            this.startExclusive = false;
            this.startVersion = new Version(0, 0, 0, null);
            this.endExclusive = true;
            this.endVersion = null;
            return;
        }
        new VersionRangeParser(str).parse();
    }

    public class VersionRangeParser {

        /* renamed from: c */
        public char f9993c;
        public int length;
        public int pos = 0;
        public final String version;

        public VersionRangeParser(String str) {
            this.version = str;
            this.length = str.length();
        }

        public void parse() throws ParseException {
            boolean start = parseStart();
            VersionRange.this.startVersion = parseVersion();
            if (VersionRange.this.startVersion == null) {
                throw new ParseException("Expecting a number", this.pos);
            }
            if (parseVersionSeparator()) {
                VersionRange.this.endVersion = parseVersion();
                parseEnd();
            } else {
                if (!start) {
                    VersionRange.this.endVersion = null;
                    VersionRange.this.startExclusive = false;
                    VersionRange.this.endExclusive = false;
                    return;
                }
                throw new ParseException("Expecting ,", this.pos);
            }
        }

        public final char readNext() {
            int i = this.pos;
            if (i == this.length) {
                this.f9993c = (char) 0;
            } else {
                String str = this.version;
                this.pos = i + 1;
                this.f9993c = str.charAt(i);
            }
            return this.f9993c;
        }

        public final void unread() {
            int i = this.pos;
            if (i > 0) {
                this.pos = i - 1;
            }
        }

        public final boolean parseStart() {
            skipWhiteSpace();
            char next = readNext();
            if (next == '(') {
                VersionRange.this.startExclusive = true;
                return true;
            }
            if (next == '[') {
                VersionRange.this.startExclusive = false;
                return true;
            }
            unread();
            return false;
        }

        public final void skipWhiteSpace() {
            while (readNext() == ' ') {
                if (this.pos >= this.length) {
                    return;
                }
            }
            unread();
        }

        public final Version parseVersion() {
            Integer number = parseNumber();
            String qualifier = null;
            if (number == null) {
                return null;
            }
            Integer number2 = 0;
            Integer number3 = 0;
            if (parseNumberSeparator()) {
                number2 = parseNumber();
                if (number2 == null) {
                    number2 = 0;
                } else if (parseNumberSeparator()) {
                    number3 = parseNumber();
                    if (number3 == null) {
                        number3 = 0;
                    } else if (parseNumberSeparator()) {
                        qualifier = parseQualifier();
                    }
                }
            }
            return new Version(number.intValue(), number2.intValue(), number3.intValue(), qualifier);
        }

        public final Integer parseNumber() {
            skipWhiteSpace();
            Integer numValueOf = null;
            do {
                char next = readNext();
                if (next != 0) {
                    switch (next) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            numValueOf = Integer.valueOf(((numValueOf == null ? 0 : numValueOf.intValue() * 10) + this.f9993c) - 48);
                            break;
                        default:
                            unread();
                            return numValueOf;
                    }
                }
                return numValueOf;
            } while (this.pos < this.length);
            return numValueOf;
        }

        public final boolean parseNumberSeparator() {
            if (readNext() == '.') {
                return true;
            }
            unread();
            return false;
        }

        public final boolean parseVersionSeparator() {
            skipWhiteSpace();
            if (readNext() == ',') {
                return true;
            }
            unread();
            return false;
        }

        public final String parseQualifier() {
            StringBuilder sb = new StringBuilder();
            while (true) {
                readNext();
                char c = this.f9993c;
                if ((c >= 'a' && c <= 'z') || ((c >= 'A' && c <= 'Z') || ((c >= '0' && c <= '9') || c == '-' || c == '_'))) {
                    sb.append(c);
                    if (this.pos >= this.length) {
                        break;
                    }
                } else {
                    unread();
                    break;
                }
            }
            if (sb.length() == 0) {
                return null;
            }
            return sb.toString();
        }

        public final void parseEnd() throws ParseException {
            skipWhiteSpace();
            char next = readNext();
            if (next == ')') {
                VersionRange.this.endExclusive = true;
            } else if (next == ']') {
                VersionRange.this.endExclusive = false;
            } else {
                unread();
                throw new ParseException("Expecting ] or )", this.pos);
            }
        }
    }

    public VersionRange(boolean z, Version version, boolean z2, Version version2) {
        this.startExclusive = z;
        this.startVersion = version;
        this.endExclusive = z2;
        this.endVersion = version2;
    }

    public VersionRange(Version version) {
        this.startExclusive = false;
        this.startVersion = version;
        this.endExclusive = true;
        this.endVersion = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.startExclusive ? "(" : "[");
        sb.append(this.startVersion.toString());
        sb.append(",");
        Version version = this.endVersion;
        sb.append(version == null ? "" : version.toString());
        sb.append(this.endExclusive ? ")" : "]");
        return sb.toString();
    }

    public String toIvyRevision() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.startExclusive ? "(" : "[");
        sb.append(this.startVersion);
        sb.append(",");
        Version version = this.endVersion;
        if (version != null) {
            if (!this.endExclusive || this.startVersion.equals(version)) {
                sb.append(this.endVersion.withNudgedPatch());
            } else {
                sb.append(this.endVersion);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public boolean isEndExclusive() {
        return this.endExclusive;
    }

    public Version getEndVersion() {
        return this.endVersion;
    }

    public boolean isStartExclusive() {
        return this.startExclusive;
    }

    public Version getStartVersion() {
        return this.startVersion;
    }

    public boolean isClosedRange() {
        return this.startVersion.equals(this.endVersion);
    }

    public boolean contains(String str) {
        return contains(new Version(str));
    }

    public boolean contains(Version version) {
        if (!this.startExclusive ? version.compareUnqualified(this.startVersion) >= 0 : version.compareUnqualified(this.startVersion) > 0) {
            Version version2 = this.endVersion;
            if (version2 == null || (!this.endExclusive ? version.compareUnqualified(version2) <= 0 : version.compareUnqualified(version2) < 0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.endExclusive ? 1231 : 1237) + 31) * 31;
        Version version = this.endVersion;
        int iHashCode = (((i + (version == null ? 0 : version.hashCode())) * 31) + (this.startExclusive ? 1231 : 1237)) * 31;
        Version version2 = this.startVersion;
        return iHashCode + (version2 != null ? version2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VersionRange)) {
            return false;
        }
        VersionRange versionRange = (VersionRange) obj;
        if (this.endExclusive != versionRange.endExclusive) {
            return false;
        }
        Version version = this.endVersion;
        if (version == null) {
            if (versionRange.endVersion != null) {
                return false;
            }
        } else if (!version.equals(versionRange.endVersion)) {
            return false;
        }
        if (this.startExclusive == versionRange.startExclusive) {
            Version version2 = this.startVersion;
            Version version3 = versionRange.startVersion;
            if (version2 == null) {
                if (version3 == null) {
                    return true;
                }
            } else if (version2.equals(version3)) {
                return true;
            }
        }
        return false;
    }
}
