package org.jfrog.build.extractor.executor;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.IntFunction;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.p059io.input.ReversedLinesFileReader$$ExternalSyntheticBackport0;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes7.dex */
public class CommandExecutor implements Serializable {
    public static final int TIMEOUT_EXIT_VALUE = 124;
    public static final int TIMEOUT_SECONDS = 30;
    public static final long serialVersionUID = 1;
    public final String[] env;
    public final String executablePath;

    public CommandExecutor(String str, Map<String, String> map) {
        this.executablePath = escapeSpacesInPath(str);
        HashMap map2 = new HashMap(System.getenv());
        if (map != null) {
            HashMap map3 = new HashMap(map);
            fixPathEnv(map3);
            map2.putAll(map3);
        }
        this.env = (String[]) map2.entrySet().stream().map(new Function() { // from class: org.jfrog.build.extractor.executor.CommandExecutor$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CommandExecutor.lambda$new$0((Map.Entry) obj);
            }
        }).toArray(new IntFunction() { // from class: org.jfrog.build.extractor.executor.CommandExecutor$$ExternalSyntheticLambda2
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return CommandExecutor.lambda$new$1(i);
            }
        });
    }

    public static /* synthetic */ String lambda$new$0(Map.Entry entry) {
        return ((String) entry.getKey()) + URLEncodedUtils.NAME_VALUE_SEPARATOR + ((String) entry.getValue());
    }

    public static /* synthetic */ String[] lambda$new$1(int i) {
        return new String[i];
    }

    public final void fixPathEnv(Map<String, String> map) {
        String fixedWindowsPath;
        String str = map.get("PATH");
        if (str == null) {
            return;
        }
        if (SystemUtils.IS_OS_WINDOWS) {
            fixedWindowsPath = getFixedWindowsPath(str);
        } else {
            fixedWindowsPath = str.replaceAll(PropertiesParser.PROPS_SEPARATOR, File.pathSeparator) + ":/usr/local/bin";
        }
        map.replace("PATH", fixedWindowsPath);
    }

    public static String escapeSpacesInPath(String str) {
        if (str == null) {
            return null;
        }
        return str.trim().replaceAll(" ", SystemUtils.IS_OS_WINDOWS ? "^ " : "\\\\ ");
    }

    public static String getFixedWindowsPath(String str) {
        String[] strArrSplit = str.split(PropertiesParser.PROPS_SEPARATOR);
        String[] strArr = new String[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String str2 = strArrSplit[i];
            int iIndexOf = str2.indexOf(92);
            if (iIndexOf < 0) {
                strArr[i] = str2.replaceAll(StringUtils.PROCESS_POSTFIX_DELIMITER, PropertiesParser.PROPS_SEPARATOR);
            } else {
                strArr[i] = str2.substring(0, iIndexOf) + str2.substring(iIndexOf).replaceAll(StringUtils.PROCESS_POSTFIX_DELIMITER, PropertiesParser.PROPS_SEPARATOR);
            }
        }
        return CommandExecutor$$ExternalSyntheticBackport0.m7390m(PropertiesParser.PROPS_SEPARATOR, strArr);
    }

    public static String maskCredentials(String str, List<String> list) {
        return (list == null || list.isEmpty()) ? str : str.replaceAll(ReversedLinesFileReader$$ExternalSyntheticBackport0.m7340m("|", list), "***");
    }

    public CommandResults exeCommand(File file, List<String> list, List<String> list2, Log log) throws InterruptedException, IOException {
        list.add(0, this.executablePath);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
        try {
            Process processRunProcess = runProcess(file, list, list2, this.env, log);
            processRunProcess.getOutputStream().close();
            InputStream inputStream = processRunProcess.getInputStream();
            try {
                InputStream errorStream = processRunProcess.getErrorStream();
                try {
                    StreamReader streamReader = new StreamReader(inputStream);
                    StreamReader streamReader2 = new StreamReader(errorStream);
                    executorServiceNewFixedThreadPool.submit(streamReader);
                    executorServiceNewFixedThreadPool.submit(streamReader2);
                    processRunProcess.waitFor();
                    executorServiceNewFixedThreadPool.shutdown();
                    CommandResults commandResults = getCommandResults(executorServiceNewFixedThreadPool.awaitTermination(30L, TimeUnit.SECONDS), list, streamReader.getOutput(), streamReader2.getOutput(), processRunProcess.exitValue());
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return commandResults;
                } finally {
                }
            } finally {
            }
        } finally {
            executorServiceNewFixedThreadPool.shutdownNow();
        }
    }

    public final CommandResults getCommandResults(boolean z, List<String> list, String str, String str2, int i) {
        CommandResults commandResults = new CommandResults();
        if (!z) {
            str2 = str2 + System.lineSeparator() + String.format("Process '%s' had been terminated forcibly after timeout of %d seconds.", ReversedLinesFileReader$$ExternalSyntheticBackport0.m7340m(" ", list), 30);
            i = 124;
        }
        commandResults.setRes(str);
        commandResults.setErr(str2);
        commandResults.setExitValue(i);
        return commandResults;
    }

    public static Process runProcess(File file, List<String> list, List<String> list2, String[] strArr, Log log) throws IOException {
        if (list2 != null) {
            list.addAll(list2);
        }
        if (SystemUtils.IS_OS_WINDOWS) {
            list.addAll(0, Arrays.asList("cmd", "/c"));
        } else {
            list = new ArrayList<String>(ReversedLinesFileReader$$ExternalSyntheticBackport0.m7340m(" ", list)) { // from class: org.jfrog.build.extractor.executor.CommandExecutor.1
                public final /* synthetic */ String val$strArgs;

                {
                    this.val$strArgs = str;
                    add("/bin/sh");
                    add("-c");
                    add(str);
                }
            };
        }
        logCommand(log, list, list2);
        return Runtime.getRuntime().exec((String[]) list.toArray(new String[0]), strArr, file);
    }

    public static void logCommand(Log log, List<String> list, List<String> list2) {
        if (log == null) {
            return;
        }
        log.info("Executing command: " + maskCredentials(UrlUtils.removeCredentialsFromUrl(ReversedLinesFileReader$$ExternalSyntheticBackport0.m7340m(" ", list)), list2));
    }
}
