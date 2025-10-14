package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.core.util.ObjectIdDictionary;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.path.Path;
import com.thoughtworks.xstream.p042io.path.PathTracker;
import com.thoughtworks.xstream.p042io.path.PathTrackingWriter;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class AbstractReferenceMarshaller extends TreeMarshaller {
    public ObjectIdDictionary implicitElements;
    public Path lastPath;
    public PathTracker pathTracker;
    public ObjectIdDictionary references;

    public abstract String createReference(Path path, Object obj);

    public abstract Object createReferenceKey(Path path, Object obj);

    public abstract void fireValidReference(Object obj);

    public AbstractReferenceMarshaller(HierarchicalStreamWriter hierarchicalStreamWriter, ConverterLookup converterLookup, Mapper mapper) {
        super(hierarchicalStreamWriter, converterLookup, mapper);
        this.references = new ObjectIdDictionary();
        this.implicitElements = new ObjectIdDictionary();
        PathTracker pathTracker = new PathTracker();
        this.pathTracker = pathTracker;
        this.writer = new PathTrackingWriter(hierarchicalStreamWriter, pathTracker);
    }

    @Override // com.thoughtworks.xstream.core.TreeMarshaller
    public void convert(Object obj, Converter converter) {
        Object item;
        if (getMapper().isImmutableValueType(obj.getClass())) {
            converter.marshal(obj, this.writer, this);
            return;
        }
        Path path = this.pathTracker.getPath();
        C8638Id c8638Id = (C8638Id) this.references.lookupId(obj);
        if (c8638Id != null && c8638Id.getPath() != path) {
            String strAliasForSystemAttribute = getMapper().aliasForSystemAttribute("reference");
            if (strAliasForSystemAttribute != null) {
                this.writer.addAttribute(strAliasForSystemAttribute, createReference(path, c8638Id.getItem()));
                return;
            }
            return;
        }
        if (c8638Id == null) {
            item = createReferenceKey(path, obj);
        } else {
            item = c8638Id.getItem();
        }
        Path path2 = this.lastPath;
        if (path2 == null || !path.isAncestor(path2)) {
            fireValidReference(item);
            this.lastPath = path;
            this.references.associateId(obj, new C8638Id(item, path));
        }
        converter.marshal(obj, this.writer, new ReferencingMarshallingContext() { // from class: com.thoughtworks.xstream.core.AbstractReferenceMarshaller.1
            public final /* synthetic */ Path val$currentPath;
            public final /* synthetic */ Object val$newReferenceKey;

            public C86371(Object item2, Path path3) {
                obj = item2;
                path = path3;
            }

            @Override // com.thoughtworks.xstream.converters.DataHolder
            public void put(Object obj2, Object obj3) {
                AbstractReferenceMarshaller.this.put(obj2, obj3);
            }

            @Override // com.thoughtworks.xstream.converters.DataHolder
            public Iterator keys() {
                return AbstractReferenceMarshaller.this.keys();
            }

            @Override // com.thoughtworks.xstream.converters.DataHolder
            public Object get(Object obj2) {
                return AbstractReferenceMarshaller.this.get(obj2);
            }

            @Override // com.thoughtworks.xstream.converters.MarshallingContext
            public void convertAnother(Object obj2, Converter converter2) {
                AbstractReferenceMarshaller.this.convertAnother(obj2, converter2);
            }

            @Override // com.thoughtworks.xstream.converters.MarshallingContext
            public void convertAnother(Object obj2) {
                AbstractReferenceMarshaller.this.convertAnother(obj2);
            }

            @Override // com.thoughtworks.xstream.core.ReferencingMarshallingContext
            public void replace(Object obj2, Object obj3) {
                AbstractReferenceMarshaller.this.references.associateId(obj3, new C8638Id(obj, path));
            }

            @Override // com.thoughtworks.xstream.core.ReferencingMarshallingContext
            public Object lookupReference(Object obj2) {
                return ((C8638Id) AbstractReferenceMarshaller.this.references.lookupId(obj2)).getItem();
            }

            @Override // com.thoughtworks.xstream.core.ReferencingMarshallingContext
            public Path currentPath() {
                return AbstractReferenceMarshaller.this.pathTracker.getPath();
            }

            @Override // com.thoughtworks.xstream.core.ReferencingMarshallingContext
            public void registerImplicit(Object obj2) {
                if (!AbstractReferenceMarshaller.this.implicitElements.containsId(obj2)) {
                    AbstractReferenceMarshaller.this.implicitElements.associateId(obj2, obj);
                    return;
                }
                throw new ReferencedImplicitElementException(obj2, path);
            }
        });
    }

    /* renamed from: com.thoughtworks.xstream.core.AbstractReferenceMarshaller$1 */
    public class C86371 implements ReferencingMarshallingContext {
        public final /* synthetic */ Path val$currentPath;
        public final /* synthetic */ Object val$newReferenceKey;

        public C86371(Object item2, Path path3) {
            obj = item2;
            path = path3;
        }

        @Override // com.thoughtworks.xstream.converters.DataHolder
        public void put(Object obj2, Object obj3) {
            AbstractReferenceMarshaller.this.put(obj2, obj3);
        }

        @Override // com.thoughtworks.xstream.converters.DataHolder
        public Iterator keys() {
            return AbstractReferenceMarshaller.this.keys();
        }

        @Override // com.thoughtworks.xstream.converters.DataHolder
        public Object get(Object obj2) {
            return AbstractReferenceMarshaller.this.get(obj2);
        }

        @Override // com.thoughtworks.xstream.converters.MarshallingContext
        public void convertAnother(Object obj2, Converter converter2) {
            AbstractReferenceMarshaller.this.convertAnother(obj2, converter2);
        }

        @Override // com.thoughtworks.xstream.converters.MarshallingContext
        public void convertAnother(Object obj2) {
            AbstractReferenceMarshaller.this.convertAnother(obj2);
        }

        @Override // com.thoughtworks.xstream.core.ReferencingMarshallingContext
        public void replace(Object obj2, Object obj3) {
            AbstractReferenceMarshaller.this.references.associateId(obj3, new C8638Id(obj, path));
        }

        @Override // com.thoughtworks.xstream.core.ReferencingMarshallingContext
        public Object lookupReference(Object obj2) {
            return ((C8638Id) AbstractReferenceMarshaller.this.references.lookupId(obj2)).getItem();
        }

        @Override // com.thoughtworks.xstream.core.ReferencingMarshallingContext
        public Path currentPath() {
            return AbstractReferenceMarshaller.this.pathTracker.getPath();
        }

        @Override // com.thoughtworks.xstream.core.ReferencingMarshallingContext
        public void registerImplicit(Object obj2) {
            if (!AbstractReferenceMarshaller.this.implicitElements.containsId(obj2)) {
                AbstractReferenceMarshaller.this.implicitElements.associateId(obj2, obj);
                return;
            }
            throw new ReferencedImplicitElementException(obj2, path);
        }
    }

    /* renamed from: com.thoughtworks.xstream.core.AbstractReferenceMarshaller$Id */
    /* loaded from: classes8.dex */
    public static class C8638Id {
        public Object item;
        public Path path;

        public C8638Id(Object obj, Path path) {
            this.item = obj;
            this.path = path;
        }

        public Object getItem() {
            return this.item;
        }

        public Path getPath() {
            return this.path;
        }
    }

    public static class ReferencedImplicitElementException extends ConversionException {
        public ReferencedImplicitElementException(Object obj, Path path) {
            super("Cannot reference implicit element");
            add("implicit-element", obj.toString());
            add("referencing-element", path.toString());
        }
    }
}
