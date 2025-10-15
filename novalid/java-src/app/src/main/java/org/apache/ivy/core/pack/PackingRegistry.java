package org.apache.ivy.core.pack;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class PackingRegistry {
    public Map<String, ArchivePacking> packings = new HashMap();

    public PackingRegistry() {
        register(new ZipPacking());
        register(new Pack200Packing());
        register(new OsgiBundlePacking());
    }

    public void register(ArchivePacking archivePacking) {
        for (String str : archivePacking.getNames()) {
            this.packings.put(str, archivePacking);
        }
    }

    public ArchivePacking get(String str) {
        return this.packings.get(str);
    }
}
