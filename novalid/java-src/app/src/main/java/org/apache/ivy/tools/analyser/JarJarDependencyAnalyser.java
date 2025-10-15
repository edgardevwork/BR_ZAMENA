package org.apache.ivy.tools.analyser;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class JarJarDependencyAnalyser implements DependencyAnalyser {
    public File jarjarjarLocation;

    public JarJarDependencyAnalyser(File file) {
        this.jarjarjarLocation = file;
    }

    @Override // org.apache.ivy.tools.analyser.DependencyAnalyser
    public ModuleDescriptor[] analyze(JarModule[] jarModuleArr) throws IOException {
        StringBuilder sb = new StringBuilder("java -jar \"");
        sb.append(this.jarjarjarLocation.getAbsolutePath());
        sb.append("\" --find --level=jar ");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (JarModule jarModule : jarModuleArr) {
            map.put(jarModule.getJar().getAbsolutePath(), jarModule);
            map2.put(jarModule.getMrid(), DefaultModuleDescriptor.newBasicInstance(jarModule.getMrid(), new Date(jarModule.getJar().lastModified())));
            sb.append("\"");
            sb.append(jarModule.getJar().getAbsolutePath());
            sb.append("\"");
            sb.append(File.pathSeparator);
        }
        if (jarModuleArr.length > 0) {
            sb.setLength(sb.length() - 1);
        }
        Message.verbose("jarjar command: " + ((Object) sb));
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(sb.toString()).getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(" -> ");
                JarModule jarModule2 = (JarModule) map.get(strArrSplit[0]);
                JarModule jarModule3 = (JarModule) map.get(strArrSplit[1]);
                if (!jarModule2.getMrid().getModuleId().equals(jarModule3.getMrid().getModuleId())) {
                    Message.verbose(jarModule2.getMrid() + " depends on " + jarModule3.getMrid());
                    DefaultModuleDescriptor defaultModuleDescriptor = (DefaultModuleDescriptor) map2.get(jarModule2.getMrid());
                    DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(defaultModuleDescriptor, jarModule3.getMrid(), false, false, true);
                    defaultDependencyDescriptor.addDependencyConfiguration("default", "default");
                    defaultModuleDescriptor.addDependency(defaultDependencyDescriptor);
                }
            }
        } catch (IOException e) {
            Message.debug(e);
        }
        return (ModuleDescriptor[]) map2.values().toArray(new ModuleDescriptor[map2.values().size()]);
    }

    public static void main(String[] strArr) throws IOException {
        new JarJarDependencyAnalyser(new File("D:/temp/test2/jarjar-0.7.jar")).analyze(new JarModuleFinder("D:/temp/test2/ivyrep/[organisation]/[module]/[revision]/[artifact].[ext]").findJarModules());
    }
}
