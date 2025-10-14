package org.apache.ivy;

import androidx.appcompat.widget.ActivityChooserModel;
import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.game.core.constants.BuildTypeConstants;
import com.blackhub.bronline.game.gui.craft.CraftKeys;
import io.ktor.http.auth.HttpAuthHeader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHost;
import org.apache.ivy.ant.IvyBuildList;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.deliver.DeliverOptions;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.publish.PublishOptions;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolveProcessException;
import org.apache.ivy.core.retrieve.RetrieveOptions;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.parser.p064m2.PomModuleDescriptorWriter;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.parser.p064m2.PomWriterOptions;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorWriter;
import org.apache.ivy.plugins.report.XmlReportParser;
import org.apache.ivy.util.DefaultMessageLogger;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.PropertiesFile;
import org.apache.ivy.util.cli.CommandLine;
import org.apache.ivy.util.cli.CommandLineParser;
import org.apache.ivy.util.cli.OptionBuilder;
import org.apache.ivy.util.cli.ParseException;
import org.apache.ivy.util.filter.FilterHelper;
import org.apache.ivy.util.url.CredentialsStore;
import org.apache.ivy.util.url.TimeoutConstrainedURLHandler;
import org.apache.ivy.util.url.URLHandlerDispatcher;
import org.apache.ivy.util.url.URLHandlerRegistry;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes7.dex */
public final class Main {
    public static final int HELP_WIDTH = 80;

    public static CommandLineParser getParser() {
        return new CommandLineParser().addCategory("settings options").addOption(new OptionBuilder("settings").arg("settingsfile|url").description("use given file or URL for settings").create()).addOption(new OptionBuilder("properties").arg("propertiesfile").description("use given file for properties not specified in settings").create()).addOption(new OptionBuilder("cache").arg("cachedir").description("use given directory for cache").create()).addOption(new OptionBuilder("novalidate").description("do not validate ivy files against xsd").create()).addOption(new OptionBuilder("m2compatible").description("use Maven 2 compatibility").create()).addOption(new OptionBuilder(IvyPatternHelper.CONF_KEY).arg("settingsfile").deprecated().description("use given file for settings").create()).addOption(new OptionBuilder("useOrigin").deprecated().description("use original artifact location with local resolvers instead of copying to the cache").create()).addCategory("resolve options").addOption(new OptionBuilder(ClientConfigurationFields.IVY).arg("ivyfile").description("use given file as ivy file").create()).addOption(new OptionBuilder("refresh").description("refresh dynamic resolved revisions").create()).addOption(new OptionBuilder("dependency").arg(IvyPatternHelper.ORGANISATION_KEY).arg("module").arg(IvyPatternHelper.REVISION_KEY).description("use this instead of ivy file to do the rest of the work with this as a dependency.").create()).addOption(new OptionBuilder("confs").arg("configurations").countArgs(false).description("resolve given configurations").create()).addOption(new OptionBuilder("types").arg("types").countArgs(false).description("accepted artifact types").create()).addOption(new OptionBuilder("mode").arg("resolvemode").description("the resolve mode to use").create()).addOption(new OptionBuilder("notransitive").description("do not resolve dependencies transitively").create()).addCategory("retrieve options").addOption(new OptionBuilder("retrieve").arg("retrievepattern").description("use given pattern as retrieve pattern").create()).addOption(new OptionBuilder("ivypattern").arg("pattern").description("use given pattern to copy the ivy files").create()).addOption(new OptionBuilder("sync").description("use sync mode for retrieve").create()).addOption(new OptionBuilder("symlink").description("create symbolic links").create()).addOption(new OptionBuilder("overwriteMode").arg("overwriteMode").description("use given overwrite mode for retrieve").create()).addCategory("cache path options").addOption(new OptionBuilder("cachepath").arg("cachepathfile").description("outputs a classpath consisting of all dependencies in cache (including transitive ones) of the given ivy file to the given cachepathfile").create()).addCategory("deliver options").addOption(new OptionBuilder("deliverto").arg("ivypattern").description("use given pattern as resolved ivy file pattern").create()).addCategory("publish options").addOption(new OptionBuilder("publish").arg("resolvername").description("use given resolver to publish to").create()).addOption(new OptionBuilder("publishpattern").arg("artpattern").description("use given pattern to find artifacts to publish").create()).addOption(new OptionBuilder(IvyPatternHelper.REVISION_KEY).arg(IvyPatternHelper.REVISION_KEY).description("use given revision to publish the module").create()).addOption(new OptionBuilder("status").arg("status").description("use given status to publish the module").create()).addOption(new OptionBuilder("overwrite").description("overwrite files in the repository if they exist").create()).addCategory("makepom options").addOption(new OptionBuilder("makepom").arg("pomfilepath").description("create a POM file for the module").create()).addCategory("http auth options").addOption(new OptionBuilder(HttpAuthHeader.Parameters.Realm).arg(HttpAuthHeader.Parameters.Realm).description("use given realm for HTTP AUTH").create()).addOption(new OptionBuilder("host").arg("host").description("use given host for HTTP AUTH").create()).addOption(new OptionBuilder("username").arg("username").description("use given username for HTTP AUTH").create()).addOption(new OptionBuilder("passwd").arg("passwd").description("use given password for HTTP AUTH").create()).addCategory("launcher options").addOption(new OptionBuilder(BuildConfig.CDN_USERNAME).arg(BuildConfig.CDN_USERNAME).description("the FQCN of the main class to launch").create()).addOption(new OptionBuilder("args").arg("args").countArgs(false).description("the arguments to give to the launched process").create()).addOption(new OptionBuilder(CraftKeys.PRODUCTION_ITEMS_ARRAY_KEY).arg(CraftKeys.PRODUCTION_ITEMS_ARRAY_KEY).description("extra classpath to use when launching process").create()).addCategory("message options").addOption(new OptionBuilder(BuildTypeConstants.DEBUG_TYPE).description("set message level to debug").create()).addOption(new OptionBuilder("verbose").description("set message level to verbose").create()).addOption(new OptionBuilder(IvyBuildList.OnMissingDescriptor.WARN).description("set message level to warn").create()).addOption(new OptionBuilder("error").description("set message level to error").create()).addCategory("help options").addOption(new OptionBuilder("?").description("display this help").create()).addOption(new OptionBuilder("deprecated").description("show deprecated options").create()).addOption(new OptionBuilder("version").description("displays version information").create());
    }

    public static void main(String[] strArr) throws Exception {
        try {
            run(strArr, true);
            System.exit(0);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    public static ResolveReport run(String[] strArr) throws Exception {
        return run(strArr, false);
    }

    public static void run(CommandLineParser commandLineParser, String[] strArr) throws Exception {
        if (Arrays.asList(strArr).contains("-?")) {
            usage(commandLineParser, false);
        } else {
            run(commandLineParser.parse(strArr), true);
        }
    }

    public static ResolveReport run(String[] strArr, boolean z) throws Exception {
        CommandLineParser parser = getParser();
        try {
            CommandLine commandLine = parser.parse(strArr);
            if (commandLine.hasOption("?")) {
                usage(parser, commandLine.hasOption("deprecated"));
                return null;
            }
            return run(commandLine, z);
        } catch (ParseException e) {
            usage(parser, false);
            throw new ParseException(e.getMessage());
        }
    }

    public static ResolveReport run(CommandLine commandLine, boolean z) throws Exception {
        String[] optionValues;
        File file;
        ResolveReport resolveReport;
        if (commandLine.hasOption("version")) {
            System.out.println("Apache Ivy " + Ivy.getIvyVersion() + " - " + Ivy.getIvyDate() + " :: " + Ivy.getIvyHomeURL());
            return null;
        }
        boolean z2 = !commandLine.hasOption("novalidate");
        Ivy ivyNewInstance = Ivy.newInstance();
        initMessage(commandLine, ivyNewInstance);
        IvySettings ivySettingsInitSettings = initSettings(commandLine, ivyNewInstance);
        ivyNewInstance.pushContext();
        File file2 = new File(ivySettingsInitSettings.substitute(commandLine.getOptionValue("cache", ivySettingsInitSettings.getDefaultCache().getAbsolutePath())));
        if (commandLine.hasOption("cache")) {
            ivySettingsInitSettings.setDefaultCache(file2);
        }
        if (!file2.exists()) {
            file2.mkdirs();
        } else if (!file2.isDirectory()) {
            error(file2 + " is not a directory");
        }
        if (commandLine.hasOption("confs")) {
            optionValues = commandLine.getOptionValues("confs");
        } else {
            optionValues = new String[]{"*"};
        }
        if (commandLine.hasOption("dependency")) {
            String[] optionValues2 = commandLine.getOptionValues("dependency");
            file = File.createTempFile(ClientConfigurationFields.IVY, ActivityChooserModel.HISTORY_FILE_EXTENSION);
            file.deleteOnExit();
            DefaultModuleDescriptor defaultModuleDescriptorNewDefaultInstance = DefaultModuleDescriptor.newDefaultInstance(ModuleRevisionId.newInstance(optionValues2[0], optionValues2[1] + "-caller", "working"));
            DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(defaultModuleDescriptorNewDefaultInstance, ModuleRevisionId.newInstance(optionValues2[0], optionValues2[1], optionValues2[2]), false, false, true);
            for (String str : optionValues) {
                defaultDependencyDescriptor.addDependencyConfiguration("default", str);
            }
            defaultModuleDescriptorNewDefaultInstance.addDependency(defaultDependencyDescriptor);
            XmlModuleDescriptorWriter.write(defaultModuleDescriptorNewDefaultInstance, file);
            optionValues = new String[]{"default"};
        } else {
            file = new File(ivySettingsInitSettings.substitute(commandLine.getOptionValue(ClientConfigurationFields.IVY, "ivy.xml")));
            if (!file.exists()) {
                error("ivy file not found: " + file);
            } else if (file.isDirectory()) {
                error("ivy file is not a file: " + file);
            }
        }
        if (commandLine.hasOption("useOrigin")) {
            ivyNewInstance.getSettings().useDeprecatedUseOrigin();
        }
        ResolveOptions artifactFilter = new ResolveOptions().setConfs(optionValues).setValidate(z2).setResolveMode(commandLine.getOptionValue("mode")).setArtifactFilter(FilterHelper.getArtifactTypeFilter(commandLine.getOptionValues("types")));
        if (commandLine.hasOption("notransitive")) {
            artifactFilter.setTransitive(false);
        }
        if (commandLine.hasOption("refresh")) {
            artifactFilter.setRefresh(true);
        }
        ResolveReport resolveReportResolve = ivyNewInstance.resolve(file.toURI().toURL(), artifactFilter);
        if (resolveReportResolve.hasError()) {
            if (z) {
                System.exit(1);
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : resolveReportResolve.getAllProblemMessages()) {
                if (sb.length() > 0) {
                    sb.append(StringUtils.f9903LF);
                }
                sb.append(str2);
            }
            throw new ResolveProcessException(sb.toString());
        }
        ModuleDescriptor moduleDescriptor = resolveReportResolve.getModuleDescriptor();
        String[] configurationsNames = (optionValues.length == 1 && "*".equals(optionValues[0])) ? moduleDescriptor.getConfigurationsNames() : optionValues;
        if (commandLine.hasOption("retrieve")) {
            String strSubstitute = ivySettingsInitSettings.substitute(commandLine.getOptionValue("retrieve"));
            if (!strSubstitute.contains("[")) {
                strSubstitute = strSubstitute + "/lib/[conf]/[artifact].[ext]";
            }
            ivyNewInstance.retrieve(moduleDescriptor.getModuleRevisionId(), new RetrieveOptions().setConfs(configurationsNames).setSync(commandLine.hasOption("sync")).setUseOrigin(commandLine.hasOption("useOrigin")).setDestArtifactPattern(strSubstitute).setDestIvyPattern(ivySettingsInitSettings.substitute(commandLine.getOptionValue("ivypattern"))).setOverwriteMode(commandLine.getOptionValue("overwriteMode")).setArtifactFilter(FilterHelper.getArtifactTypeFilter(commandLine.getOptionValues("types"))).setMakeSymlinks(commandLine.hasOption("symlink")).setMakeSymlinksInMass(commandLine.hasOption("symlinkmass")));
        }
        if (commandLine.hasOption("cachepath")) {
            outputCachePath(ivyNewInstance, file2, moduleDescriptor, configurationsNames, commandLine.getOptionValue("cachepath", "ivycachepath.txt"));
        }
        if (commandLine.hasOption(IvyPatternHelper.REVISION_KEY)) {
            resolveReport = resolveReportResolve;
            ivyNewInstance.deliver(moduleDescriptor.getResolvedModuleRevisionId(), ivySettingsInitSettings.substitute(commandLine.getOptionValue(IvyPatternHelper.REVISION_KEY)), ivySettingsInitSettings.substitute(commandLine.getOptionValue("deliverto", "ivy-[revision].xml")), DeliverOptions.newInstance(ivySettingsInitSettings).setStatus(ivySettingsInitSettings.substitute(commandLine.getOptionValue("status", "release"))).setValidate(z2));
            if (commandLine.hasOption("publish")) {
                ivyNewInstance.publish(moduleDescriptor.getResolvedModuleRevisionId(), Collections.singleton(ivySettingsInitSettings.substitute(commandLine.getOptionValue("publishpattern", "distrib/[type]s/[artifact]-[revision].[ext]"))), commandLine.getOptionValue("publish"), new PublishOptions().setPubrevision(ivySettingsInitSettings.substitute(commandLine.getOptionValue(IvyPatternHelper.REVISION_KEY))).setValidate(z2).setSrcIvyPattern(ivySettingsInitSettings.substitute(commandLine.getOptionValue("deliverto", "ivy-[revision].xml"))).setOverwrite(commandLine.hasOption("overwrite")));
            }
        } else {
            resolveReport = resolveReportResolve;
        }
        if (commandLine.hasOption("makepom")) {
            File file3 = new File(commandLine.getOptionValue("makepom", "pom.xml"));
            PomModuleDescriptorWriter.write(moduleDescriptor, file3, new PomWriterOptions());
            Message.debug("Generated a pom file for module at " + file3);
        }
        if (commandLine.hasOption(BuildConfig.CDN_USERNAME)) {
            List<File> extraClasspathFileList = getExtraClasspathFileList(commandLine);
            String[] optionValues3 = commandLine.getOptionValues("args");
            if (optionValues3 == null) {
                optionValues3 = new String[0];
            }
            String[] leftOverArgs = commandLine.getLeftOverArgs();
            if (leftOverArgs == null) {
                leftOverArgs = new String[0];
            }
            String[] strArr = new String[optionValues3.length + leftOverArgs.length];
            System.arraycopy(optionValues3, 0, strArr, 0, optionValues3.length);
            System.arraycopy(leftOverArgs, 0, strArr, optionValues3.length, leftOverArgs.length);
            invoke(ivyNewInstance, file2, moduleDescriptor, configurationsNames, extraClasspathFileList, commandLine.getOptionValue(BuildConfig.CDN_USERNAME), strArr);
        }
        ivyNewInstance.getLoggerEngine().popLogger();
        ivyNewInstance.popContext();
        return resolveReport;
    }

    public static List<File> getExtraClasspathFileList(CommandLine commandLine) {
        if (!commandLine.hasOption(CraftKeys.PRODUCTION_ITEMS_ARRAY_KEY)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : commandLine.getOptionValues(CraftKeys.PRODUCTION_ITEMS_ARRAY_KEY)) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, File.pathSeparator);
            while (stringTokenizer.hasMoreTokens()) {
                File file = new File(stringTokenizer.nextToken());
                if (file.exists()) {
                    arrayList.add(file);
                } else {
                    Message.warn("Skipping extra classpath '" + file + "' as it does not exist.");
                }
            }
        }
        return arrayList;
    }

    public static IvySettings initSettings(CommandLine commandLine, Ivy ivy) throws ParseException, IOException, java.text.ParseException {
        IvySettings settings = ivy.getSettings();
        settings.addAllVariables(System.getProperties());
        if (commandLine.hasOption("properties")) {
            settings.addAllVariables(new PropertiesFile(new File(commandLine.getOptionValue("properties")), "additional properties"));
        }
        if (commandLine.hasOption("m2compatible")) {
            settings.setVariable("ivy.default.configuration.m2compatible", "true");
        }
        configureURLHandler(commandLine.getOptionValue(HttpAuthHeader.Parameters.Realm, null), commandLine.getOptionValue("host", null), commandLine.getOptionValue("username", null), commandLine.getOptionValue("passwd", null));
        String optionValue = commandLine.getOptionValue("settings", "");
        if ("".equals(optionValue)) {
            optionValue = commandLine.getOptionValue(IvyPatternHelper.CONF_KEY, "");
            if (!"".equals(optionValue)) {
                Message.deprecated("-conf is deprecated, use -settings instead");
            }
        }
        if ("".equals(optionValue)) {
            ivy.configureDefault();
        } else {
            URI settingsURI = getSettingsURI(optionValue);
            if (PomReader.PomProfileElement.FILE.equals(settingsURI.getScheme())) {
                File file = new File(settingsURI);
                if (!file.exists()) {
                    throw new IOException("ivy configuration file not found: " + file);
                }
                if (file.isDirectory()) {
                    throw new IOException("ivy configuration file is not a file: " + file);
                }
                ivy.configure(file);
            } else {
                try {
                    ivy.configure(settingsURI.toURL());
                } catch (IOException e) {
                    throw new IOException("ivy configuration failed to load from: " + optionValue, e);
                }
            }
        }
        return settings;
    }

    public static URI getSettingsURI(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() == null ? new File(str).toURI() : uri;
        } catch (URISyntaxException unused) {
            return new File(str).toURI();
        }
    }

    public static void initMessage(CommandLine commandLine, Ivy ivy) {
        if (commandLine.hasOption(BuildTypeConstants.DEBUG_TYPE)) {
            ivy.getLoggerEngine().pushLogger(new DefaultMessageLogger(4));
            return;
        }
        if (commandLine.hasOption("verbose")) {
            ivy.getLoggerEngine().pushLogger(new DefaultMessageLogger(3));
            return;
        }
        if (commandLine.hasOption(IvyBuildList.OnMissingDescriptor.WARN)) {
            ivy.getLoggerEngine().pushLogger(new DefaultMessageLogger(1));
        } else if (commandLine.hasOption("error")) {
            ivy.getLoggerEngine().pushLogger(new DefaultMessageLogger(0));
        } else {
            ivy.getLoggerEngine().pushLogger(new DefaultMessageLogger(2));
        }
    }

    public static void outputCachePath(Ivy ivy, File file, ModuleDescriptor moduleDescriptor, String[] strArr, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            LinkedHashSet<ArtifactDownloadReport> linkedHashSet = new LinkedHashSet();
            ResolutionCacheManager resolutionCacheManager = ivy.getResolutionCacheManager();
            XmlReportParser xmlReportParser = new XmlReportParser();
            for (String str2 : strArr) {
                xmlReportParser.parse(resolutionCacheManager.getConfigurationResolveReportInCache(ResolveOptions.getDefaultResolveId(moduleDescriptor), str2));
                linkedHashSet.addAll(Arrays.asList(xmlReportParser.getArtifactReports()));
            }
            for (ArtifactDownloadReport artifactDownloadReport : linkedHashSet) {
                if (artifactDownloadReport.getLocalFile() != null) {
                    sb.append(artifactDownloadReport.getLocalFile().getCanonicalPath());
                    sb.append(File.pathSeparator);
                }
            }
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(str));
            if (sb.length() > 0) {
                sb.setLength(sb.length() - File.pathSeparator.length());
                printWriter.println(sb);
            }
            printWriter.close();
            System.out.println("cachepath output to " + str);
        } catch (Exception e) {
            throw new RuntimeException("impossible to build ivy cache path: " + e.getMessage(), e);
        }
    }

    public static void invoke(Ivy ivy, File file, ModuleDescriptor moduleDescriptor, String[] strArr, List<File> list, String str, String[] strArr2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(it.next().toURI().toURL());
                } catch (MalformedURLException unused) {
                }
            }
        }
        try {
            LinkedHashSet<ArtifactDownloadReport> linkedHashSet = new LinkedHashSet();
            ResolutionCacheManager resolutionCacheManager = ivy.getResolutionCacheManager();
            XmlReportParser xmlReportParser = new XmlReportParser();
            for (String str2 : strArr) {
                xmlReportParser.parse(resolutionCacheManager.getConfigurationResolveReportInCache(ResolveOptions.getDefaultResolveId(moduleDescriptor), str2));
                linkedHashSet.addAll(Arrays.asList(xmlReportParser.getArtifactReports()));
            }
            for (ArtifactDownloadReport artifactDownloadReport : linkedHashSet) {
                if (artifactDownloadReport.getLocalFile() != null) {
                    arrayList.add(artifactDownloadReport.getLocalFile().toURI().toURL());
                }
            }
            URLClassLoader uRLClassLoader = new URLClassLoader((URL[]) arrayList.toArray(new URL[arrayList.size()]), Main.class.getClassLoader().getParent());
            try {
                Method method = uRLClassLoader.loadClass(str).getMethod(BuildConfig.CDN_USERNAME, String[].class);
                Thread.currentThread().setContextClassLoader(uRLClassLoader);
                if (strArr2 == null) {
                    strArr2 = new String[0];
                }
                method.invoke(null, strArr2);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Could not find class: " + str, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("No permissions to invoke main method: " + str, e2);
            } catch (NoSuchMethodException e3) {
                e = e3;
                throw new RuntimeException("Could not find main method: " + str, e);
            } catch (SecurityException e4) {
                e = e4;
                throw new RuntimeException("Could not find main method: " + str, e);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Unexpected exception invoking main method: " + str, e5);
            }
        } catch (Exception e6) {
            throw new RuntimeException("impossible to build ivy cache path: " + e6.getMessage(), e6);
        }
    }

    public static void configureURLHandler(String str, String str2, String str3, String str4) {
        CredentialsStore.INSTANCE.addCredentials(str, str2, str3, str4);
        URLHandlerDispatcher uRLHandlerDispatcher = new URLHandlerDispatcher();
        TimeoutConstrainedURLHandler http = URLHandlerRegistry.getHttp();
        uRLHandlerDispatcher.setDownloader(HttpHost.DEFAULT_SCHEME_NAME, http);
        uRLHandlerDispatcher.setDownloader("https", http);
        URLHandlerRegistry.setDefault(uRLHandlerDispatcher);
    }

    public static void error(String str) throws ParseException {
        throw new ParseException(str);
    }

    public static void usage(CommandLineParser commandLineParser, boolean z) {
        PrintWriter printWriter = new PrintWriter(System.out);
        commandLineParser.printHelp(printWriter, 80, ClientConfigurationFields.IVY, z);
        printWriter.flush();
    }
}
