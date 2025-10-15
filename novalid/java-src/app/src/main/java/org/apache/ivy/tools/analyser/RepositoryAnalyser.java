package org.apache.ivy.tools.analyser;

import java.io.File;
import java.io.IOException;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorWriter;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public class RepositoryAnalyser {
    public void analyse(String str, DependencyAnalyser dependencyAnalyser) {
        ModuleDescriptor[] moduleDescriptorArrAnalyze = dependencyAnalyser.analyze(new JarModuleFinder(str).findJarModules());
        Message.info("found " + moduleDescriptorArrAnalyze.length + " modules");
        for (ModuleDescriptor moduleDescriptor : moduleDescriptorArrAnalyze) {
            File file = new File(IvyPatternHelper.substitute(str, DefaultArtifact.newIvyArtifact(moduleDescriptor.getModuleRevisionId(), moduleDescriptor.getPublicationDate())));
            try {
                Message.info("generating " + file);
                XmlModuleDescriptorWriter.write(moduleDescriptor, file);
            } catch (IOException e) {
                Message.debug(e);
            }
        }
    }

    public static void main(String[] strArr) {
        if (strArr.length != 2) {
            System.out.println("usage: ivyanalyser path/to/jarjar.jar absolute-ivy-repository-pattern");
            return;
        }
        String str = strArr[0];
        new RepositoryAnalyser().analyse(strArr[1], new JarJarDependencyAnalyser(new File(str)));
    }
}
