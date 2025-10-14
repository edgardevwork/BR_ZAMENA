package org.apache.ivy.plugins.parser.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyArtifactDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptorMediator;
import org.apache.ivy.core.module.descriptor.ExcludeRule;
import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;
import org.apache.ivy.core.module.descriptor.ExtraInfoHolder;
import org.apache.ivy.core.module.descriptor.IncludeRule;
import org.apache.ivy.core.module.descriptor.License;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.descriptor.OverrideDependencyDescriptorMediator;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.matcher.MapMatcher;
import org.apache.ivy.util.DateUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.XMLHelper;
import org.apache.ivy.util.extendable.ExtendableItem;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes6.dex */
public final class XmlModuleDescriptorWriter {
    public static void write(ModuleDescriptor moduleDescriptor, File file) throws IOException {
        write(moduleDescriptor, null, file);
    }

    public static void write(ModuleDescriptor moduleDescriptor, String str, File file) throws IOException {
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
        try {
            printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            if (str != null) {
                printWriter.print(str);
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : moduleDescriptor.getExtraAttributesNamespaces().entrySet()) {
                sb.append(" xmlns:");
                sb.append(entry.getKey());
                sb.append("=\"");
                sb.append(entry.getValue());
                sb.append("\"");
            }
            String str2 = "2.0";
            if (moduleDescriptor.getInheritedDescriptors().length > 0) {
                str2 = "2.2";
            }
            printWriter.println("<ivy-module version=\"" + str2 + "\"" + ((Object) sb) + ">");
            printInfoTag(moduleDescriptor, printWriter);
            printConfigurations(moduleDescriptor, printWriter);
            printPublications(moduleDescriptor, printWriter);
            printDependencies(moduleDescriptor, printWriter);
            printWriter.println("</ivy-module>");
            printWriter.close();
        } catch (Throwable th) {
            try {
                printWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void printDependencies(ModuleDescriptor moduleDescriptor, PrintWriter printWriter) {
        DependencyDescriptor[] dependencies = moduleDescriptor.getDependencies();
        if (dependencies.length > 0) {
            printWriter.println("\t<dependencies>");
            for (DependencyDescriptor dependencyDescriptor : dependencies) {
                printWriter.print("\t\t");
                printDependency(moduleDescriptor, dependencyDescriptor, printWriter);
            }
            printAllExcludes(moduleDescriptor, printWriter);
            printAllMediators(moduleDescriptor, printWriter);
            printWriter.println("\t</dependencies>");
        }
    }

    public static void printDependency(ModuleDescriptor moduleDescriptor, DependencyDescriptor dependencyDescriptor, PrintWriter printWriter) {
        ModuleRevisionId dependencyRevisionId = dependencyDescriptor.getDependencyRevisionId();
        printWriter.print(String.format("<dependency org=\"%s\" name=\"%s\"", XMLHelper.escape(dependencyRevisionId.getOrganisation()), XMLHelper.escape(dependencyRevisionId.getName())));
        if (dependencyRevisionId.getBranch() != null) {
            printWriter.print(" branch=\"" + XMLHelper.escape(dependencyRevisionId.getBranch()) + "\"");
        }
        printWriter.print(" rev=\"" + XMLHelper.escape(dependencyRevisionId.getRevision()) + "\"");
        ModuleRevisionId dynamicConstraintDependencyRevisionId = dependencyDescriptor.getDynamicConstraintDependencyRevisionId();
        if (!dynamicConstraintDependencyRevisionId.equals(dependencyRevisionId)) {
            if (dynamicConstraintDependencyRevisionId.getBranch() != null) {
                printWriter.print(" branchConstraint=\"" + XMLHelper.escape(dynamicConstraintDependencyRevisionId.getBranch()) + "\"");
            }
            printWriter.print(" revConstraint=\"" + XMLHelper.escape(dynamicConstraintDependencyRevisionId.getRevision()) + "\"");
        }
        if (dependencyDescriptor.isForce()) {
            printWriter.print(" force=\"" + dependencyDescriptor.isForce() + "\"");
        }
        if (dependencyDescriptor.isChanging()) {
            printWriter.print(" changing=\"" + dependencyDescriptor.isChanging() + "\"");
        }
        if (!dependencyDescriptor.isTransitive()) {
            printWriter.print(" transitive=\"" + dependencyDescriptor.isTransitive() + "\"");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : dependencyDescriptor.getModuleConfigurations()) {
            if (sb.length() > 0) {
                sb.append(PropertiesParser.PROPS_SEPARATOR);
            }
            sb.append(XMLHelper.escape(str));
            sb.append(listToPrefixedString(dependencyDescriptor.getDependencyConfigurations(str), "->"));
        }
        printWriter.print(" conf=\"" + ((Object) sb) + "\"");
        printExtraAttributes(dependencyDescriptor, printWriter, " ");
        DependencyArtifactDescriptor[] allDependencyArtifacts = dependencyDescriptor.getAllDependencyArtifacts();
        if (allDependencyArtifacts.length > 0) {
            printWriter.println(">");
        }
        printDependencyArtefacts(moduleDescriptor, printWriter, allDependencyArtifacts);
        IncludeRule[] allIncludeRules = dependencyDescriptor.getAllIncludeRules();
        if (allIncludeRules.length > 0 && allDependencyArtifacts.length == 0) {
            printWriter.println(">");
        }
        printDependencyIncludeRules(moduleDescriptor, printWriter, allIncludeRules);
        ExcludeRule[] allExcludeRules = dependencyDescriptor.getAllExcludeRules();
        if (allExcludeRules.length > 0 && allIncludeRules.length == 0 && allDependencyArtifacts.length == 0) {
            printWriter.println(">");
        }
        printDependencyExcludeRules(moduleDescriptor, printWriter, allExcludeRules);
        if (allIncludeRules.length + allExcludeRules.length + allDependencyArtifacts.length == 0) {
            printWriter.println("/>");
        } else {
            printWriter.println("\t\t</dependency>");
        }
    }

    public static void printAllMediators(ModuleDescriptor moduleDescriptor, PrintWriter printWriter) {
        for (Map.Entry<MapMatcher, DependencyDescriptorMediator> entry : moduleDescriptor.getAllDependencyDescriptorMediators().getAllRules().entrySet()) {
            MapMatcher key = entry.getKey();
            DependencyDescriptorMediator value = entry.getValue();
            if (value instanceof OverrideDependencyDescriptorMediator) {
                OverrideDependencyDescriptorMediator overrideDependencyDescriptorMediator = (OverrideDependencyDescriptorMediator) value;
                printWriter.print(String.format("\t\t<override org=\"%s\" module=\"%s\" matcher=\"%s\"", XMLHelper.escape(key.getAttributes().get(IvyPatternHelper.ORGANISATION_KEY)), XMLHelper.escape(key.getAttributes().get("module")), XMLHelper.escape(key.getPatternMatcher().getName())));
                if (overrideDependencyDescriptorMediator.getBranch() != null) {
                    printWriter.print(" branch=\"" + XMLHelper.escape(overrideDependencyDescriptorMediator.getBranch()) + "\"");
                }
                if (overrideDependencyDescriptorMediator.getVersion() != null) {
                    printWriter.print(" rev=\"" + XMLHelper.escape(overrideDependencyDescriptorMediator.getVersion()) + "\"");
                }
                printWriter.println("/>");
            } else {
                Message.verbose("ignoring unhandled DependencyDescriptorMediator: " + value.getClass());
            }
        }
    }

    public static void printAllExcludes(ModuleDescriptor moduleDescriptor, PrintWriter printWriter) {
        ExcludeRule[] allExcludeRules = moduleDescriptor.getAllExcludeRules();
        if (allExcludeRules.length > 0) {
            for (ExcludeRule excludeRule : allExcludeRules) {
                printWriter.print(String.format("\t\t<exclude org=\"%s\" module=\"%s\" artifact=\"%s\" type=\"%s\" ext=\"%s\"", XMLHelper.escape(excludeRule.getId().getModuleId().getOrganisation()), XMLHelper.escape(excludeRule.getId().getModuleId().getName()), XMLHelper.escape(excludeRule.getId().getName()), XMLHelper.escape(excludeRule.getId().getType()), XMLHelper.escape(excludeRule.getId().getExt())));
                String[] configurations = excludeRule.getConfigurations();
                if (!Arrays.asList(configurations).equals(Arrays.asList(moduleDescriptor.getConfigurationsNames()))) {
                    printWriter.print(listToPrefixedString(configurations, " conf=\""));
                }
                printWriter.print(" matcher=\"" + XMLHelper.escape(excludeRule.getMatcher().getName()) + "\"");
                printWriter.println("/>");
            }
        }
    }

    public static void printDependencyExcludeRules(ModuleDescriptor moduleDescriptor, PrintWriter printWriter, ExcludeRule[] excludeRuleArr) {
        if (excludeRuleArr.length > 0) {
            for (ExcludeRule excludeRule : excludeRuleArr) {
                printWriter.print(String.format("\t\t\t<exclude org=\"%s\" module=\"%s\" name=\"%s\" type=\"%s\" ext=\"%s\"", XMLHelper.escape(excludeRule.getId().getModuleId().getOrganisation()), XMLHelper.escape(excludeRule.getId().getModuleId().getName()), XMLHelper.escape(excludeRule.getId().getName()), XMLHelper.escape(excludeRule.getId().getType()), XMLHelper.escape(excludeRule.getId().getExt())));
                String[] configurations = excludeRule.getConfigurations();
                if (!Arrays.asList(configurations).equals(Arrays.asList(moduleDescriptor.getConfigurationsNames()))) {
                    printWriter.print(listToPrefixedString(configurations, " conf=\""));
                }
                printWriter.print(" matcher=\"" + XMLHelper.escape(excludeRule.getMatcher().getName()) + "\"");
                printWriter.println("/>");
            }
        }
    }

    public static void printDependencyIncludeRules(ModuleDescriptor moduleDescriptor, PrintWriter printWriter, IncludeRule[] includeRuleArr) {
        if (includeRuleArr.length > 0) {
            for (IncludeRule includeRule : includeRuleArr) {
                printWriter.print(String.format("\t\t\t<include name=\"%s\" type=\"%s\" ext=\"%s\"", XMLHelper.escape(includeRule.getId().getName()), XMLHelper.escape(includeRule.getId().getType()), XMLHelper.escape(includeRule.getId().getExt())));
                String[] configurations = includeRule.getConfigurations();
                if (!Arrays.asList(configurations).equals(Arrays.asList(moduleDescriptor.getConfigurationsNames()))) {
                    printWriter.print(listToPrefixedString(configurations, " conf=\""));
                }
                printWriter.print(" matcher=\"" + XMLHelper.escape(includeRule.getMatcher().getName()) + "\"");
                printWriter.println("/>");
            }
        }
    }

    public static void printDependencyArtefacts(ModuleDescriptor moduleDescriptor, PrintWriter printWriter, DependencyArtifactDescriptor[] dependencyArtifactDescriptorArr) {
        if (dependencyArtifactDescriptorArr.length > 0) {
            for (DependencyArtifactDescriptor dependencyArtifactDescriptor : dependencyArtifactDescriptorArr) {
                printWriter.print(String.format("\t\t\t<artifact name=\"%s\" type=\"%s\" ext=\"%s\"", XMLHelper.escape(dependencyArtifactDescriptor.getName()), XMLHelper.escape(dependencyArtifactDescriptor.getType()), XMLHelper.escape(dependencyArtifactDescriptor.getExt())));
                String[] configurations = dependencyArtifactDescriptor.getConfigurations();
                if (configurations != null && configurations.length > 0 && !Arrays.asList(configurations).equals(Arrays.asList(moduleDescriptor.getConfigurationsNames()))) {
                    printWriter.print(listToPrefixedString(configurations, " conf=\""));
                }
                printExtraAttributes(dependencyArtifactDescriptor, printWriter, " ");
                printWriter.println("/>");
            }
        }
    }

    public static String listToPrefixedString(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (String str2 : strArr) {
            if (sb.length() > str.length()) {
                sb.append(",");
            }
            sb.append(XMLHelper.escape(str2));
        }
        if (str.endsWith("\"")) {
            sb.append("\"");
        }
        return sb.toString();
    }

    public static void printExtraAttributes(ExtendableItem extendableItem, PrintWriter printWriter, String str) {
        printExtraAttributes(extendableItem.getQualifiedExtraAttributes(), printWriter, str);
    }

    public static void printExtraAttributes(Map<String, String> map, PrintWriter printWriter, String str) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            printWriter.print(String.format("%s%s=\"%s\"", str, entry.getKey(), XMLHelper.escape(entry.getValue())));
            str = " ";
        }
    }

    public static void printPublications(ModuleDescriptor moduleDescriptor, PrintWriter printWriter) {
        printWriter.println("\t<publications>");
        for (Artifact artifact : moduleDescriptor.getAllArtifacts()) {
            printWriter.print(String.format("\t\t<artifact name=\"%s\" type=\"%s\" ext=\"%s\" conf=\"%s\"", XMLHelper.escape(artifact.getName()), XMLHelper.escape(artifact.getType()), XMLHelper.escape(artifact.getExt()), XMLHelper.escape(getConfs(moduleDescriptor, artifact))));
            printExtraAttributes(artifact, printWriter, " ");
            printWriter.println("/>");
        }
        printWriter.println("\t</publications>");
    }

    public static void printConfigurations(ModuleDescriptor moduleDescriptor, PrintWriter printWriter) {
        Configuration[] configurations = moduleDescriptor.getConfigurations();
        if (configurations.length > 0) {
            printWriter.println("\t<configurations>");
            for (Configuration configuration : configurations) {
                printWriter.print("\t\t");
                printConfiguration(configuration, printWriter);
            }
            printWriter.println("\t</configurations>");
        }
    }

    public static void printConfiguration(Configuration configuration, PrintWriter printWriter) {
        printWriter.print("<conf");
        printWriter.print(" name=\"" + XMLHelper.escape(configuration.getName()) + "\"");
        printWriter.print(" visibility=\"" + XMLHelper.escape(configuration.getVisibility().toString()) + "\"");
        if (configuration.getDescription() != null) {
            printWriter.print(" description=\"" + XMLHelper.escape(configuration.getDescription()) + "\"");
        }
        String[] strArr = configuration.getExtends();
        if (strArr.length > 0) {
            printWriter.print(listToPrefixedString(strArr, " extends=\""));
        }
        if (!configuration.isTransitive()) {
            printWriter.print(" transitive=\"false\"");
        }
        if (configuration.getDeprecated() != null) {
            printWriter.print(" deprecated=\"" + XMLHelper.escape(configuration.getDeprecated()) + "\"");
        }
        printExtraAttributes(configuration, printWriter, " ");
        printWriter.println("/>");
    }

    public static void printInfoTag(ModuleDescriptor moduleDescriptor, PrintWriter printWriter) {
        printWriter.println("\t<info organisation=\"" + XMLHelper.escape(moduleDescriptor.getModuleRevisionId().getOrganisation()) + "\"");
        printWriter.println("\t\tmodule=\"" + XMLHelper.escape(moduleDescriptor.getModuleRevisionId().getName()) + "\"");
        String branch = moduleDescriptor.getResolvedModuleRevisionId().getBranch();
        if (branch != null) {
            printWriter.println("\t\tbranch=\"" + XMLHelper.escape(branch) + "\"");
        }
        String revision = moduleDescriptor.getResolvedModuleRevisionId().getRevision();
        if (revision != null) {
            printWriter.println("\t\trevision=\"" + XMLHelper.escape(revision) + "\"");
        }
        printWriter.println("\t\tstatus=\"" + XMLHelper.escape(moduleDescriptor.getStatus()) + "\"");
        printWriter.println("\t\tpublication=\"" + DateUtil.format(moduleDescriptor.getResolvedPublicationDate()) + "\"");
        if (moduleDescriptor.isDefault()) {
            printWriter.println("\t\tdefault=\"true\"");
        }
        if (moduleDescriptor instanceof DefaultModuleDescriptor) {
            DefaultModuleDescriptor defaultModuleDescriptor = (DefaultModuleDescriptor) moduleDescriptor;
            if (defaultModuleDescriptor.getNamespace() != null && !defaultModuleDescriptor.getNamespace().getName().equals("system")) {
                printWriter.println("\t\tnamespace=\"" + XMLHelper.escape(defaultModuleDescriptor.getNamespace().getName()) + "\"");
            }
        }
        if (!moduleDescriptor.getExtraAttributes().isEmpty()) {
            printExtraAttributes(moduleDescriptor, printWriter, "\t\t");
            printWriter.println();
        }
        if (requireInnerInfoElement(moduleDescriptor)) {
            printWriter.println("\t>");
            for (ExtendsDescriptor extendsDescriptor : moduleDescriptor.getInheritedDescriptors()) {
                ModuleRevisionId parentRevisionId = extendsDescriptor.getParentRevisionId();
                printWriter.print(String.format("\t\t<extends organisation=\"%s\" module=\"%s\" revision=\"%s\"", XMLHelper.escape(parentRevisionId.getOrganisation()), XMLHelper.escape(parentRevisionId.getName()), XMLHelper.escape(parentRevisionId.getRevision())));
                String location = extendsDescriptor.getLocation();
                if (location != null) {
                    printWriter.print(" location=\"" + XMLHelper.escape(location) + "\"");
                }
                printWriter.print(" extendType=\"" + StringUtils.joinArray(extendsDescriptor.getExtendsTypes(), ",") + "\"");
                printWriter.println("/>");
            }
            for (License license : moduleDescriptor.getLicenses()) {
                printWriter.print("\t\t<license ");
                if (license.getName() != null) {
                    printWriter.print("name=\"" + XMLHelper.escape(license.getName()) + "\" ");
                }
                if (license.getUrl() != null) {
                    printWriter.print("url=\"" + XMLHelper.escape(license.getUrl()) + "\" ");
                }
                printWriter.println("/>");
            }
            if (moduleDescriptor.getHomePage() != null || moduleDescriptor.getDescription() != null) {
                printWriter.print("\t\t<description");
                if (moduleDescriptor.getHomePage() != null) {
                    printWriter.print(" homepage=\"" + XMLHelper.escape(moduleDescriptor.getHomePage()) + "\"");
                }
                if (StringUtils.isNullOrEmpty(moduleDescriptor.getDescription())) {
                    printWriter.println(" />");
                } else {
                    printWriter.println(">");
                    printWriter.println("\t\t" + XMLHelper.escape(moduleDescriptor.getDescription()));
                    printWriter.println("\t\t</description>");
                }
            }
            Iterator<ExtraInfoHolder> it = moduleDescriptor.getExtraInfos().iterator();
            while (it.hasNext()) {
                printExtraInfoElement(printWriter, it.next(), 2);
            }
            printWriter.println("\t</info>");
            return;
        }
        printWriter.println("\t/>");
    }

    public static void printExtraInfoElement(PrintWriter printWriter, ExtraInfoHolder extraInfoHolder, int i) {
        boolean z;
        boolean z2 = true;
        for (int i2 = 1; i2 <= i; i2++) {
            printWriter.print("\t");
        }
        printWriter.print("<");
        printWriter.print(extraInfoHolder.getName());
        for (Map.Entry<String, String> entry : extraInfoHolder.getAttributes().entrySet()) {
            printWriter.print(String.format(" %s=\"%s\"", entry.getKey(), entry.getValue()));
        }
        if (StringUtils.isNullOrEmpty(extraInfoHolder.getContent())) {
            z = false;
        } else {
            printWriter.print(">");
            printWriter.print(XMLHelper.escape(extraInfoHolder.getContent()));
            z = true;
        }
        if (extraInfoHolder.getNestedExtraInfoHolder().isEmpty()) {
            z2 = z;
        } else {
            printWriter.println(">");
            Iterator<ExtraInfoHolder> it = extraInfoHolder.getNestedExtraInfoHolder().iterator();
            while (it.hasNext()) {
                printExtraInfoElement(printWriter, it.next(), i + 1);
            }
            for (int i3 = 1; i3 <= i; i3++) {
                printWriter.print("\t");
            }
        }
        if (z2) {
            printWriter.print("</");
            printWriter.print(extraInfoHolder.getName());
            printWriter.println(">");
            return;
        }
        printWriter.println("/>");
    }

    public static boolean requireInnerInfoElement(ModuleDescriptor moduleDescriptor) {
        return moduleDescriptor.getExtraInfos().size() > 0 || moduleDescriptor.getHomePage() != null || !StringUtils.isNullOrEmpty(moduleDescriptor.getDescription()) || moduleDescriptor.getLicenses().length > 0 || moduleDescriptor.getInheritedDescriptors().length > 0;
    }

    public static String getConfs(ModuleDescriptor moduleDescriptor, Artifact artifact) {
        StringBuilder sb = new StringBuilder();
        for (String str : moduleDescriptor.getConfigurationsNames()) {
            if (Arrays.asList(moduleDescriptor.getArtifacts(str)).contains(artifact)) {
                sb.append(str);
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
