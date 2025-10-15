package org.jfrog.build.extractor.clientConfiguration.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import java.io.IOException;
import java.io.StringWriter;
import org.jfrog.build.extractor.BuildInfoExtractorUtils;

/* loaded from: classes7.dex */
public class JsonSerializer<T> {
    public String toJSON(T t) throws IOException {
        JsonFactory jsonFactory = new JsonFactory();
        ObjectMapper objectMapperCreateMapper = BuildInfoExtractorUtils.createMapper();
        objectMapperCreateMapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
        jsonFactory.setCodec(objectMapperCreateMapper);
        StringWriter stringWriter = new StringWriter();
        try {
            JsonGenerator jsonGeneratorCreateGenerator = jsonFactory.createGenerator(stringWriter);
            try {
                jsonGeneratorCreateGenerator.useDefaultPrettyPrinter();
                jsonGeneratorCreateGenerator.writeObject(t);
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
}
