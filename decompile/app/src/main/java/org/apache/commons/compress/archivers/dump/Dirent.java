package org.apache.commons.compress.archivers.dump;

/* loaded from: classes5.dex */
public class Dirent {
    public final int ino;
    public final String name;
    public final int parentIno;
    public final int type;

    public Dirent(int i, int i2, int i3, String str) {
        this.ino = i;
        this.parentIno = i2;
        this.type = i3;
        this.name = str;
    }

    public int getIno() {
        return this.ino;
    }

    public int getParentIno() {
        return this.parentIno;
    }

    public int getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("[%d]: %s", Integer.valueOf(this.ino), this.name);
    }
}
