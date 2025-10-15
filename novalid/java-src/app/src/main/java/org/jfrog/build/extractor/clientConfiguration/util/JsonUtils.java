package org.jfrog.build.extractor.clientConfiguration.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import org.jfrog.build.extractor.BuildInfoExtractorUtils;

/* loaded from: classes7.dex */
public class JsonUtils {
    public static String toJsonString(Object obj) throws IOException {
        JsonFactory jsonFactoryCreateJsonFactory = createJsonFactory();
        StringWriter stringWriter = new StringWriter();
        try {
            JsonGenerator jsonGeneratorCreateGenerator = jsonFactoryCreateJsonFactory.createGenerator(stringWriter);
            try {
                jsonGeneratorCreateGenerator.useDefaultPrettyPrinter();
                jsonGeneratorCreateGenerator.writeObject(obj);
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

    public static JsonParser createJsonParser(InputStream inputStream) throws IOException {
        return createJsonFactory().createParser(inputStream);
    }

    public static JsonParser createJsonParser(String str) throws IOException {
        return createJsonFactory().createParser(str);
    }

    public static JsonFactory createJsonFactory() {
        JsonFactory jsonFactory = new JsonFactory();
        ObjectMapper objectMapperCreateMapper = BuildInfoExtractorUtils.createMapper();
        objectMapperCreateMapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
        jsonFactory.setCodec(objectMapperCreateMapper);
        return jsonFactory;
    }
}
