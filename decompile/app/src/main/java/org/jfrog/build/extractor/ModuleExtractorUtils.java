package org.jfrog.build.extractor;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.google.common.base.Charsets;
import com.google.common.p024io.FileWriteMode;
import com.google.common.p024io.Files;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import org.jfrog.build.extractor.p065ci.Module;

/* loaded from: classes8.dex */
public class ModuleExtractorUtils {
    public static JsonFactory createJsonFactory() {
        JsonFactory jsonFactory = new JsonFactory();
        ObjectMapper objectMapperCreateMapper = BuildInfoExtractorUtils.createMapper();
        objectMapperCreateMapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
        jsonFactory.setCodec(objectMapperCreateMapper);
        return jsonFactory;
    }

    public static String moduleToJsonString(Module module) throws IOException {
        JsonFactory jsonFactoryCreateJsonFactory = createJsonFactory();
        StringWriter stringWriter = new StringWriter();
        try {
            JsonGenerator jsonGeneratorCreateGenerator = jsonFactoryCreateJsonFactory.createGenerator(stringWriter);
            try {
                jsonGeneratorCreateGenerator.useDefaultPrettyPrinter();
                jsonGeneratorCreateGenerator.writeObject(module);
                String string = stringWriter.getBuffer().toString();
                jsonGeneratorCreateGenerator.close();
                stringWriter.close();
                return string;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    stringWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static Module jsonStringToModule(String str) throws IOException {
        JsonFactory jsonFactoryCreateJsonFactory = createJsonFactory();
        return (Module) jsonFactoryCreateJsonFactory.getCodec().readValue(jsonFactoryCreateJsonFactory.createParser(new StringReader(str)), Module.class);
    }

    public static void saveModuleToFile(Module module, File file) throws Throwable {
        String strModuleToJsonString = moduleToJsonString(module);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        Files.asCharSink(file, Charsets.UTF_8, new FileWriteMode[0]).write(strModuleToJsonString);
    }

    public static Module readModuleFromFile(File file) throws IOException {
        return jsonStringToModule(Files.asCharSource(file, Charsets.UTF_8).read());
    }
}
