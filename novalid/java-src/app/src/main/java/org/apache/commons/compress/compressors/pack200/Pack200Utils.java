package org.apache.commons.compress.compressors.pack200;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import org.apache.commons.compress.java.util.jar.Pack200;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.ScanBuild;

/* loaded from: classes6.dex */
public class Pack200Utils {
    public static void normalize(File file) throws IOException {
        normalize(file, file, null);
    }

    public static void normalize(File file, Map<String, String> map) throws IOException {
        normalize(file, file, map);
    }

    public static void normalize(File file, File file2) throws IOException {
        normalize(file, file2, null);
    }

    public static void normalize(File file, File file2, Map<String, String> map) throws IOException {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(Pack200.Packer.SEGMENT_LIMIT, ScanBuild.XRAY_FATAL_FAIL_STATUS);
        File fileCreateTempFile = File.createTempFile("commons-compress", "pack200normalize");
        try {
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(fileCreateTempFile.toPath(), new OpenOption[0]);
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    Pack200.Packer packerNewPacker = Pack200.newPacker();
                    packerNewPacker.properties().putAll(map);
                    packerNewPacker.pack(jarFile, outputStreamNewOutputStream);
                    jarFile.close();
                    if (outputStreamNewOutputStream != null) {
                        outputStreamNewOutputStream.close();
                    }
                    Pack200.Unpacker unpackerNewUnpacker = Pack200.newUnpacker();
                    JarOutputStream jarOutputStream = new JarOutputStream(Files.newOutputStream(file2.toPath(), new OpenOption[0]));
                    try {
                        unpackerNewUnpacker.unpack(fileCreateTempFile, jarOutputStream);
                        jarOutputStream.close();
                        if (fileCreateTempFile.delete()) {
                            return;
                        }
                        fileCreateTempFile.deleteOnExit();
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!fileCreateTempFile.delete()) {
                fileCreateTempFile.deleteOnExit();
            }
            throw th;
        }
    }
}
