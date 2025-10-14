package org.apache.commons.lang3.arch;

import org.jfrog.build.extractor.scan.License;

/* loaded from: classes5.dex */
public class Processor {
    public final Arch arch;
    public final Type type;

    public enum Type {
        X86,
        IA_64,
        PPC,
        UNKNOWN
    }

    public enum Arch {
        BIT_32("32-bit"),
        BIT_64("64-bit"),
        UNKNOWN(License.UNKNOWN_LICENCE_NAME);

        public final String label;

        Arch(String str) {
            this.label = str;
        }

        public String getLabel() {
            return this.label;
        }
    }

    public Processor(Arch arch, Type type) {
        this.arch = arch;
        this.type = type;
    }

    public Arch getArch() {
        return this.arch;
    }

    public Type getType() {
        return this.type;
    }

    public boolean is32Bit() {
        return Arch.BIT_32 == this.arch;
    }

    public boolean is64Bit() {
        return Arch.BIT_64 == this.arch;
    }

    public boolean isX86() {
        return Type.X86 == this.type;
    }

    public boolean isIA64() {
        return Type.IA_64 == this.type;
    }

    public boolean isPPC() {
        return Type.PPC == this.type;
    }
}
