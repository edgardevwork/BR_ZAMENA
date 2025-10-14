package org.apache.ivy.core.cache;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class ModuleDescriptorMemoryCache {
    public final int maxSize;
    public final LinkedHashMap<File, CacheEntry> valueMap;

    public ModuleDescriptorMemoryCache(int i) {
        this.maxSize = i;
        this.valueMap = new LinkedHashMap<>(i);
    }

    public ModuleDescriptor get(File file, ParserSettings parserSettings, boolean z, ModuleDescriptorProvider moduleDescriptorProvider) throws IOException, ParseException {
        ModuleDescriptor fromCache = getFromCache(file, parserSettings, z);
        return fromCache == null ? getStale(file, parserSettings, z, moduleDescriptorProvider) : fromCache;
    }

    public ModuleDescriptor getStale(File file, ParserSettings parserSettings, boolean z, ModuleDescriptorProvider moduleDescriptorProvider) throws IOException, ParseException {
        ParserSettingsMonitor parserSettingsMonitor = new ParserSettingsMonitor(parserSettings);
        ModuleDescriptor moduleDescriptorProvideModule = moduleDescriptorProvider.provideModule(parserSettingsMonitor.getMonitoredSettings(), file, z);
        putInCache(file, parserSettingsMonitor, z, moduleDescriptorProvideModule);
        return moduleDescriptorProvideModule;
    }

    public ModuleDescriptor getFromCache(File file, ParserSettings parserSettings, boolean z) {
        if (this.maxSize <= 0) {
            return null;
        }
        synchronized (this.valueMap) {
            try {
                CacheEntry cacheEntry = this.valueMap.get(file);
                if (cacheEntry != null) {
                    if (cacheEntry.isStale(file, z, parserSettings)) {
                        Message.debug("Entry is found in the ModuleDescriptorCache but entry should be reevaluated : " + file);
                        this.valueMap.remove(file);
                        return null;
                    }
                    this.valueMap.remove(file);
                    this.valueMap.put(file, cacheEntry);
                    Message.debug("Entry is found in the ModuleDescriptorCache : " + file);
                    return cacheEntry.f9955md;
                }
                Message.debug("No entry is found in the ModuleDescriptorCache : " + file);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void putInCache(File file, ParserSettingsMonitor parserSettingsMonitor, boolean z, ModuleDescriptor moduleDescriptor) {
        if (this.maxSize <= 0) {
            return;
        }
        synchronized (this.valueMap) {
            try {
                if (this.valueMap.size() >= this.maxSize) {
                    Message.debug("ModuleDescriptorCache is full, remove one entry");
                    Iterator<CacheEntry> it = this.valueMap.values().iterator();
                    it.next();
                    it.remove();
                }
                this.valueMap.put(file, new CacheEntry(moduleDescriptor, z, parserSettingsMonitor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static class CacheEntry {

        /* renamed from: md */
        public final ModuleDescriptor f9955md;
        public final ParserSettingsMonitor parserSettingsMonitor;
        public final boolean validated;

        public CacheEntry(ModuleDescriptor moduleDescriptor, boolean z, ParserSettingsMonitor parserSettingsMonitor) {
            this.f9955md = moduleDescriptor;
            this.validated = z;
            this.parserSettingsMonitor = parserSettingsMonitor;
        }

        public boolean isStale(File file, boolean z, ParserSettings parserSettings) {
            return (z && !this.validated) || this.f9955md.getLastModified() != file.lastModified() || this.parserSettingsMonitor.hasChanged(parserSettings);
        }
    }
}
