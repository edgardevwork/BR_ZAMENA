package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.Subject;

/* loaded from: classes7.dex */
public class SubjectConverter extends AbstractCollectionConverter {
    public static /* synthetic */ Class class$javax$security$auth$Subject;

    public void marshalPrivateCredentials(Set set, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
    }

    public void marshalPublicCredentials(Set set, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
    }

    public SubjectConverter(Mapper mapper) {
        super(mapper);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$javax$security$auth$Subject;
        if (clsClass$ == null) {
            clsClass$ = class$("javax.security.auth.Subject");
            class$javax$security$auth$Subject = clsClass$;
        }
        return cls == clsClass$;
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        Subject subject = (Subject) obj;
        marshalPrincipals(subject.getPrincipals(), hierarchicalStreamWriter, marshallingContext);
        marshalPublicCredentials(subject.getPublicCredentials(), hierarchicalStreamWriter, marshallingContext);
        marshalPrivateCredentials(subject.getPrivateCredentials(), hierarchicalStreamWriter, marshallingContext);
        marshalReadOnly(subject.isReadOnly(), hierarchicalStreamWriter);
    }

    public void marshalPrincipals(Set set, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        hierarchicalStreamWriter.startNode("principals");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            writeCompleteItem(it.next(), marshallingContext, hierarchicalStreamWriter);
        }
        hierarchicalStreamWriter.endNode();
    }

    public void marshalReadOnly(boolean z, HierarchicalStreamWriter hierarchicalStreamWriter) {
        hierarchicalStreamWriter.startNode("readOnly");
        hierarchicalStreamWriter.setValue(String.valueOf(z));
        hierarchicalStreamWriter.endNode();
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        return new Subject(unmarshalReadOnly(hierarchicalStreamReader), unmarshalPrincipals(hierarchicalStreamReader, unmarshallingContext), unmarshalPublicCredentials(hierarchicalStreamReader, unmarshallingContext), unmarshalPrivateCredentials(hierarchicalStreamReader, unmarshallingContext));
    }

    public Set unmarshalPrincipals(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        return populateSet(hierarchicalStreamReader, unmarshallingContext);
    }

    public Set unmarshalPublicCredentials(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        return Collections.EMPTY_SET;
    }

    public Set unmarshalPrivateCredentials(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        return Collections.EMPTY_SET;
    }

    public boolean unmarshalReadOnly(HierarchicalStreamReader hierarchicalStreamReader) {
        hierarchicalStreamReader.moveDown();
        boolean z = Boolean.getBoolean(hierarchicalStreamReader.getValue());
        hierarchicalStreamReader.moveUp();
        return z;
    }

    public Set populateSet(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        HashSet hashSet = new HashSet();
        hierarchicalStreamReader.moveDown();
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hashSet.add(readCompleteItem(hierarchicalStreamReader, unmarshallingContext, hashSet));
        }
        hierarchicalStreamReader.moveUp();
        return hashSet;
    }
}
