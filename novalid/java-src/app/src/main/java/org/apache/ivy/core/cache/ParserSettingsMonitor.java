package org.apache.ivy.core.cache;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.ivy.core.RelativeUrlResolver;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.module.status.StatusManager;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class ParserSettingsMonitor {
    public ParserSettings delegatedSettings;
    public ParserSettings monitoredSettings = new ParserSettings() { // from class: org.apache.ivy.core.cache.ParserSettingsMonitor.1
        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public ConflictManager getConflictManager(String str) {
            return ParserSettingsMonitor.this.delegatedSettings.getConflictManager(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public PatternMatcher getMatcher(String str) {
            return ParserSettingsMonitor.this.delegatedSettings.getMatcher(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public Namespace getNamespace(String str) {
            return ParserSettingsMonitor.this.delegatedSettings.getNamespace(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public RelativeUrlResolver getRelativeUrlResolver() {
            return ParserSettingsMonitor.this.delegatedSettings.getRelativeUrlResolver();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public ResolutionCacheManager getResolutionCacheManager() {
            return ParserSettingsMonitor.this.delegatedSettings.getResolutionCacheManager();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public DependencyResolver getResolver(ModuleRevisionId moduleRevisionId) {
            return ParserSettingsMonitor.this.delegatedSettings.getResolver(moduleRevisionId);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public StatusManager getStatusManager() {
            return ParserSettingsMonitor.this.delegatedSettings.getStatusManager();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public File resolveFile(String str) {
            return ParserSettingsMonitor.this.delegatedSettings.resolveFile(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public String getDefaultBranch(ModuleId moduleId) {
            return ParserSettingsMonitor.this.delegatedSettings.getDefaultBranch(moduleId);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public Namespace getContextNamespace() {
            return ParserSettingsMonitor.this.delegatedSettings.getContextNamespace();
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public Map<String, String> substitute(Map<String, String> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), substitute(entry.getValue()));
            }
            return linkedHashMap;
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public String substitute(String str) {
            String strSubstitute = ParserSettingsMonitor.this.delegatedSettings.substitute(str);
            if (str != null && !str.equals(strSubstitute)) {
                ParserSettingsMonitor.this.substitutes.put(str, strSubstitute);
            }
            return strSubstitute;
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public String getVariable(String str) {
            return ParserSettingsMonitor.this.delegatedSettings.getVariable(str);
        }

        @Override // org.apache.ivy.plugins.parser.ParserSettings
        public TimeoutConstraint getTimeoutConstraint(String str) {
            return ParserSettingsMonitor.this.delegatedSettings.getTimeoutConstraint(str);
        }
    };
    public final Map<String, String> substitutes = new HashMap();

    public ParserSettingsMonitor(ParserSettings parserSettings) {
        this.delegatedSettings = parserSettings;
    }

    public ParserSettings getMonitoredSettings() {
        return this.monitoredSettings;
    }

    public void endMonitoring() {
        this.monitoredSettings = null;
        this.delegatedSettings = null;
    }

    public boolean hasChanged(ParserSettings parserSettings) {
        for (Map.Entry<String, String> entry : this.substitutes.entrySet()) {
            String key = entry.getKey();
            if (!entry.getValue().equals(parserSettings.substitute(key))) {
                Message.debug("settings variable has changed for : " + key);
                return true;
            }
        }
        return false;
    }
}
