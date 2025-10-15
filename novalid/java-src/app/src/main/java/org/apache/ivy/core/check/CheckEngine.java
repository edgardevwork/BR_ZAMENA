package org.apache.ivy.core.check;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolveEngine;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class CheckEngine {
    public ResolveEngine resolveEngine;
    public CheckEngineSettings settings;

    public CheckEngine(CheckEngineSettings checkEngineSettings, ResolveEngine resolveEngine) {
        this.settings = checkEngineSettings;
        this.resolveEngine = resolveEngine;
    }

    public boolean check(URL url, String str) {
        ResolveData resolveData;
        ModuleDescriptor moduleDescriptor;
        Artifact[] artifactArr;
        CheckEngine checkEngine = this;
        try {
            ModuleDescriptorParserRegistry moduleDescriptorParserRegistry = ModuleDescriptorParserRegistry.getInstance();
            CheckEngineSettings checkEngineSettings = checkEngine.settings;
            ModuleDescriptor descriptor = moduleDescriptorParserRegistry.parseDescriptor(checkEngineSettings, url, checkEngineSettings.doValidate());
            boolean z = true;
            if (str != null) {
                DependencyResolver resolver = checkEngine.settings.getResolver(str);
                HashSet<Artifact> hashSet = new HashSet();
                for (String str2 : descriptor.getConfigurationsNames()) {
                    hashSet.addAll(Arrays.asList(descriptor.getArtifacts(str2)));
                }
                for (Artifact artifact : hashSet) {
                    if (!resolver.exists(artifact)) {
                        Message.info("declared publication not found: " + artifact);
                        z = false;
                    }
                }
            }
            ResolveData resolveData2 = new ResolveData(checkEngine.resolveEngine, new ResolveOptions());
            DependencyDescriptor[] dependencies = descriptor.getDependencies();
            int length = dependencies.length;
            int i = 0;
            while (i < length) {
                DependencyDescriptor dependencyDescriptor = dependencies[i];
                for (String str3 : dependencyDescriptor.getModuleConfigurations()) {
                    if (!"*".equals(str3.trim()) && descriptor.getConfiguration(str3) == null) {
                        Message.info("dependency required in non existing conf for " + url + " \n\tin " + dependencyDescriptor + ": " + str3);
                        z = false;
                    }
                }
                DependencyResolver resolver2 = checkEngine.settings.getResolver(dependencyDescriptor.getDependencyRevisionId());
                ResolvedModuleRevision dependency = resolver2.getDependency(dependencyDescriptor, resolveData2);
                if (dependency == null) {
                    Message.info("dependency not found in " + url + ":\n\t" + dependencyDescriptor);
                    resolveData = resolveData2;
                    moduleDescriptor = descriptor;
                    z = false;
                } else {
                    String[] dependencyConfigurations = dependencyDescriptor.getDependencyConfigurations(descriptor.getConfigurationsNames());
                    int length2 = dependencyConfigurations.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        String str4 = dependencyConfigurations[i2];
                        ResolveData resolveData3 = resolveData2;
                        if (!Arrays.asList(dependency.getDescriptor().getConfigurationsNames()).contains(str4)) {
                            Message.info("dependency configuration is missing for " + url + "\n\tin " + dependencyDescriptor + ": " + str4);
                            z = false;
                        }
                        Artifact[] artifacts = dependency.getDescriptor().getArtifacts(str4);
                        int length3 = artifacts.length;
                        int i3 = 0;
                        while (i3 < length3) {
                            ModuleDescriptor moduleDescriptor2 = descriptor;
                            Artifact artifact2 = artifacts[i3];
                            if (resolver2.exists(artifact2)) {
                                artifactArr = artifacts;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                artifactArr = artifacts;
                                sb.append("dependency artifact is missing for ");
                                sb.append(url);
                                sb.append("\n\t in ");
                                sb.append(dependencyDescriptor);
                                sb.append(": ");
                                sb.append(artifact2);
                                Message.info(sb.toString());
                                z = false;
                            }
                            i3++;
                            descriptor = moduleDescriptor2;
                            artifacts = artifactArr;
                        }
                        i2++;
                        resolveData2 = resolveData3;
                    }
                    resolveData = resolveData2;
                    moduleDescriptor = descriptor;
                }
                i++;
                checkEngine = this;
                resolveData2 = resolveData;
                descriptor = moduleDescriptor;
            }
            return z;
        } catch (IOException e) {
            Message.info("io problem on " + url, e);
            return false;
        } catch (ParseException e2) {
            Message.info("parse problem on " + url, e2);
            return false;
        } catch (Exception e3) {
            Message.info("problem on " + url, e3);
            return false;
        }
    }
}
