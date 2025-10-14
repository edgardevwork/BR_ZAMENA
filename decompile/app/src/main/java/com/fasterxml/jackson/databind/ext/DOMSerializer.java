package com.fasterxml.jackson.databind.ext;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.lang3.BooleanUtils;
import org.w3c.dom.Node;

/* loaded from: classes6.dex */
public class DOMSerializer extends StdSerializer<Node> {
    public final TransformerFactory transformerFactory;

    public DOMSerializer() throws TransformerConfigurationException, TransformerFactoryConfigurationError {
        super(Node.class);
        try {
            TransformerFactory transformerFactoryNewInstance = TransformerFactory.newInstance();
            this.transformerFactory = transformerFactoryNewInstance;
            transformerFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e) {
            throw new IllegalStateException("Could not instantiate `TransformerFactory`: " + e.getMessage(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Node node, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws TransformerException, IOException, IllegalArgumentException {
        try {
            Transformer transformerNewTransformer = this.transformerFactory.newTransformer();
            transformerNewTransformer.setOutputProperty("omit-xml-declaration", BooleanUtils.YES);
            transformerNewTransformer.setOutputProperty("indent", "no");
            StreamResult streamResult = new StreamResult(new StringWriter());
            transformerNewTransformer.transform(new DOMSource(node), streamResult);
            jsonGenerator.writeString(streamResult.getWriter().toString());
        } catch (TransformerConfigurationException e) {
            throw new IllegalStateException("Could not create XML Transformer for writing DOM `Node` value: " + e.getMessage(), e);
        } catch (TransformerException e2) {
            serializerProvider.reportMappingProblem(e2, "DOM `Node` value serialization failed: %s", e2.getMessage());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode(TypedValues.Custom.S_STRING, true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.expectAnyFormat(javaType);
        }
    }
}
