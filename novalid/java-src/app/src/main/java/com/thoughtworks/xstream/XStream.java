package com.thoughtworks.xstream;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.internal.bind.TypeAdapters;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.ConverterRegistry;
import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;
import com.thoughtworks.xstream.converters.basic.BigDecimalConverter;
import com.thoughtworks.xstream.converters.basic.BigIntegerConverter;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import com.thoughtworks.xstream.converters.basic.ByteConverter;
import com.thoughtworks.xstream.converters.basic.CharConverter;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.converters.basic.DoubleConverter;
import com.thoughtworks.xstream.converters.basic.FloatConverter;
import com.thoughtworks.xstream.converters.basic.IntConverter;
import com.thoughtworks.xstream.converters.basic.LongConverter;
import com.thoughtworks.xstream.converters.basic.NullConverter;
import com.thoughtworks.xstream.converters.basic.ShortConverter;
import com.thoughtworks.xstream.converters.basic.StringBufferConverter;
import com.thoughtworks.xstream.converters.basic.StringConverter;
import com.thoughtworks.xstream.converters.basic.URIConverter;
import com.thoughtworks.xstream.converters.basic.URLConverter;
import com.thoughtworks.xstream.converters.collections.ArrayConverter;
import com.thoughtworks.xstream.converters.collections.BitSetConverter;
import com.thoughtworks.xstream.converters.collections.CharArrayConverter;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;
import com.thoughtworks.xstream.converters.collections.MapConverter;
import com.thoughtworks.xstream.converters.collections.PropertiesConverter;
import com.thoughtworks.xstream.converters.collections.SingletonCollectionConverter;
import com.thoughtworks.xstream.converters.collections.SingletonMapConverter;
import com.thoughtworks.xstream.converters.collections.TreeMapConverter;
import com.thoughtworks.xstream.converters.collections.TreeSetConverter;
import com.thoughtworks.xstream.converters.extended.ColorConverter;
import com.thoughtworks.xstream.converters.extended.DynamicProxyConverter;
import com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter;
import com.thoughtworks.xstream.converters.extended.FileConverter;
import com.thoughtworks.xstream.converters.extended.FontConverter;
import com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter;
import com.thoughtworks.xstream.converters.extended.JavaClassConverter;
import com.thoughtworks.xstream.converters.extended.JavaFieldConverter;
import com.thoughtworks.xstream.converters.extended.JavaMethodConverter;
import com.thoughtworks.xstream.converters.extended.LocaleConverter;
import com.thoughtworks.xstream.converters.extended.LookAndFeelConverter;
import com.thoughtworks.xstream.converters.extended.SqlDateConverter;
import com.thoughtworks.xstream.converters.extended.SqlTimeConverter;
import com.thoughtworks.xstream.converters.extended.SqlTimestampConverter;
import com.thoughtworks.xstream.converters.extended.TextAttributeConverter;
import com.thoughtworks.xstream.converters.reflection.ExternalizableConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.SerializableConverter;
import com.thoughtworks.xstream.core.ClassLoaderReference;
import com.thoughtworks.xstream.core.DefaultConverterLookup;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.MapBackedDataHolder;
import com.thoughtworks.xstream.core.ReferenceByIdMarshallingStrategy;
import com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy;
import com.thoughtworks.xstream.core.TreeMarshallingStrategy;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream;
import com.thoughtworks.xstream.core.util.SelfStreamingInstanceChecker;
import com.thoughtworks.xstream.mapper.AnnotationConfiguration;
import com.thoughtworks.xstream.mapper.ArrayMapper;
import com.thoughtworks.xstream.mapper.AttributeAliasingMapper;
import com.thoughtworks.xstream.mapper.AttributeMapper;
import com.thoughtworks.xstream.mapper.CachingMapper;
import com.thoughtworks.xstream.mapper.ClassAliasingMapper;
import com.thoughtworks.xstream.mapper.DefaultImplementationsMapper;
import com.thoughtworks.xstream.mapper.DefaultMapper;
import com.thoughtworks.xstream.mapper.DynamicProxyMapper;
import com.thoughtworks.xstream.mapper.ElementIgnoringMapper;
import com.thoughtworks.xstream.mapper.FieldAliasingMapper;
import com.thoughtworks.xstream.mapper.ImmutableTypesMapper;
import com.thoughtworks.xstream.mapper.ImplicitCollectionMapper;
import com.thoughtworks.xstream.mapper.LocalConversionMapper;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import com.thoughtworks.xstream.mapper.OuterClassMapper;
import com.thoughtworks.xstream.mapper.PackageAliasingMapper;
import com.thoughtworks.xstream.mapper.SecurityMapper;
import com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper;
import com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.StatefulWriter;
import com.thoughtworks.xstream.p042io.xml.XppDriver;
import com.thoughtworks.xstream.security.ArrayTypePermission;
import com.thoughtworks.xstream.security.ExplicitTypePermission;
import com.thoughtworks.xstream.security.InputManipulationException;
import com.thoughtworks.xstream.security.InterfaceTypePermission;
import com.thoughtworks.xstream.security.NoPermission;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;
import com.thoughtworks.xstream.security.RegExpTypePermission;
import com.thoughtworks.xstream.security.TypeHierarchyPermission;
import com.thoughtworks.xstream.security.TypePermission;
import com.thoughtworks.xstream.security.WildcardTypePermission;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes5.dex */
public class XStream {
    public static final String ANNOTATION_MAPPER_TYPE = "com.thoughtworks.xstream.mapper.AnnotationMapper";
    public static final String COLLECTION_UPDATE_LIMIT = "XStreamCollectionUpdateLimit";
    public static final String COLLECTION_UPDATE_SECONDS = "XStreamCollectionUpdateSeconds";
    public static final int ID_REFERENCES = 1002;
    public static final Pattern IGNORE_ALL = Pattern.compile(SegmentConstantPool.REGEX_MATCH_ALL);
    public static final int NO_REFERENCES = 1001;
    public static final int PRIORITY_LOW = -10;
    public static final int PRIORITY_NORMAL = 0;
    public static final int PRIORITY_VERY_HIGH = 10000;
    public static final int PRIORITY_VERY_LOW = -20;
    public static final int SINGLE_NODE_XPATH_ABSOLUTE_REFERENCES = 1006;
    public static final int SINGLE_NODE_XPATH_RELATIVE_REFERENCES = 1005;
    public static final int XPATH_ABSOLUTE_REFERENCES = 1004;
    public static final int XPATH_RELATIVE_REFERENCES = 1003;
    public static /* synthetic */ Class array$Ljava$lang$String;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$converters$ConverterLookup;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$converters$ConverterRegistry;

    /* renamed from: class$com$thoughtworks$xstream$converters$reflection$ReflectionProvider */
    public static /* synthetic */ Class f5887x9b2a01bc;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$core$ClassLoaderReference;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$AnnotationConfiguration;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$AttributeMapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$ClassAliasingMapper;

    /* renamed from: class$com$thoughtworks$xstream$mapper$DefaultImplementationsMapper */
    public static /* synthetic */ Class f5888x5429862c;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$ElementIgnoringMapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$FieldAliasingMapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$LocalConversionMapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$PackageAliasingMapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$SecurityMapper;

    /* renamed from: class$com$thoughtworks$xstream$mapper$SystemAttributeAliasingMapper */
    public static /* synthetic */ Class f5889x6d3e9b15;
    public static /* synthetic */ Class class$java$io$File;
    public static /* synthetic */ Class class$java$lang$Boolean;
    public static /* synthetic */ Class class$java$lang$Byte;
    public static /* synthetic */ Class class$java$lang$Character;
    public static /* synthetic */ Class class$java$lang$Class;
    public static /* synthetic */ Class class$java$lang$Double;
    public static /* synthetic */ Class class$java$lang$Float;
    public static /* synthetic */ Class class$java$lang$Integer;
    public static /* synthetic */ Class class$java$lang$Long;
    public static /* synthetic */ Class class$java$lang$Number;
    public static /* synthetic */ Class class$java$lang$Object;
    public static /* synthetic */ Class class$java$lang$Short;
    public static /* synthetic */ Class class$java$lang$StackTraceElement;
    public static /* synthetic */ Class class$java$lang$String;
    public static /* synthetic */ Class class$java$lang$StringBuffer;
    public static /* synthetic */ Class class$java$lang$Throwable;
    public static /* synthetic */ Class class$java$lang$reflect$Constructor;
    public static /* synthetic */ Class class$java$lang$reflect$Field;
    public static /* synthetic */ Class class$java$lang$reflect$Member;
    public static /* synthetic */ Class class$java$lang$reflect$Method;
    public static /* synthetic */ Class class$java$math$BigDecimal;
    public static /* synthetic */ Class class$java$math$BigInteger;
    public static /* synthetic */ Class class$java$net$URI;
    public static /* synthetic */ Class class$java$net$URL;
    public static /* synthetic */ Class class$java$nio$charset$Charset;
    public static /* synthetic */ Class class$java$text$DecimalFormatSymbols;
    public static /* synthetic */ Class class$java$util$ArrayList;
    public static /* synthetic */ Class class$java$util$BitSet;
    public static /* synthetic */ Class class$java$util$Calendar;
    public static /* synthetic */ Class class$java$util$Collection;
    public static /* synthetic */ Class class$java$util$Currency;
    public static /* synthetic */ Class class$java$util$Date;
    public static /* synthetic */ Class class$java$util$GregorianCalendar;
    public static /* synthetic */ Class class$java$util$HashMap;
    public static /* synthetic */ Class class$java$util$HashSet;
    public static /* synthetic */ Class class$java$util$Hashtable;
    public static /* synthetic */ Class class$java$util$LinkedList;
    public static /* synthetic */ Class class$java$util$List;
    public static /* synthetic */ Class class$java$util$Locale;
    public static /* synthetic */ Class class$java$util$Map;
    public static /* synthetic */ Class class$java$util$Map$Entry;
    public static /* synthetic */ Class class$java$util$Properties;
    public static /* synthetic */ Class class$java$util$Set;
    public static /* synthetic */ Class class$java$util$SortedSet;
    public static /* synthetic */ Class class$java$util$TimeZone;
    public static /* synthetic */ Class class$java$util$TreeMap;
    public static /* synthetic */ Class class$java$util$TreeSet;
    public static /* synthetic */ Class class$java$util$Vector;
    public static /* synthetic */ Class class$java$util$regex$Pattern;
    public AnnotationConfiguration annotationConfiguration;
    public AttributeAliasingMapper attributeAliasingMapper;
    public AttributeMapper attributeMapper;
    public ClassAliasingMapper classAliasingMapper;
    public ClassLoaderReference classLoaderReference;
    public int collectionUpdateLimit;
    public ConverterLookup converterLookup;
    public ConverterRegistry converterRegistry;
    public DefaultImplementationsMapper defaultImplementationsMapper;
    public ElementIgnoringMapper elementIgnoringMapper;
    public FieldAliasingMapper fieldAliasingMapper;
    public HierarchicalStreamDriver hierarchicalStreamDriver;
    public ImmutableTypesMapper immutableTypesMapper;
    public ImplicitCollectionMapper implicitCollectionMapper;
    public LocalConversionMapper localConversionMapper;
    public Mapper mapper;
    public MarshallingStrategy marshallingStrategy;
    public PackageAliasingMapper packageAliasingMapper;
    public ReflectionProvider reflectionProvider;
    public SecurityMapper securityMapper;
    public SystemAttributeAliasingMapper systemAttributeAliasingMapper;

    public static void setupDefaultSecurity(XStream xStream) {
    }

    public boolean useXStream11XmlFriendlyMapper() {
        return false;
    }

    public MapperWrapper wrapMapper(MapperWrapper mapperWrapper) {
        return mapperWrapper;
    }

    public XStream() {
        this((ReflectionProvider) null, (Mapper) null, new XppDriver());
    }

    public XStream(ReflectionProvider reflectionProvider) {
        this(reflectionProvider, (Mapper) null, new XppDriver());
    }

    public XStream(HierarchicalStreamDriver hierarchicalStreamDriver) {
        this((ReflectionProvider) null, (Mapper) null, hierarchicalStreamDriver);
    }

    public XStream(ReflectionProvider reflectionProvider, HierarchicalStreamDriver hierarchicalStreamDriver) {
        this(reflectionProvider, (Mapper) null, hierarchicalStreamDriver);
    }

    public XStream(ReflectionProvider reflectionProvider, Mapper mapper, HierarchicalStreamDriver hierarchicalStreamDriver) {
        this(reflectionProvider, hierarchicalStreamDriver, new CompositeClassLoader(), mapper);
    }

    public XStream(ReflectionProvider reflectionProvider, HierarchicalStreamDriver hierarchicalStreamDriver, ClassLoaderReference classLoaderReference) {
        this(reflectionProvider, hierarchicalStreamDriver, classLoaderReference, (Mapper) null);
    }

    public XStream(ReflectionProvider reflectionProvider, HierarchicalStreamDriver hierarchicalStreamDriver, ClassLoader classLoader) {
        this(reflectionProvider, hierarchicalStreamDriver, classLoader, (Mapper) null);
    }

    public XStream(ReflectionProvider reflectionProvider, HierarchicalStreamDriver hierarchicalStreamDriver, ClassLoader classLoader, Mapper mapper) {
        this(reflectionProvider, hierarchicalStreamDriver, new ClassLoaderReference(classLoader), mapper, new DefaultConverterLookup());
    }

    public XStream(ReflectionProvider reflectionProvider, HierarchicalStreamDriver hierarchicalStreamDriver, ClassLoaderReference classLoaderReference, Mapper mapper) {
        this(reflectionProvider, hierarchicalStreamDriver, classLoaderReference, mapper, new DefaultConverterLookup());
    }

    /* renamed from: com.thoughtworks.xstream.XStream$1 */
    /* loaded from: classes8.dex */
    public class C86121 implements ConverterLookup {
        public C86121() {
        }

        @Override // com.thoughtworks.xstream.converters.ConverterLookup
        public Converter lookupConverterForType(Class cls) {
            return defaultConverterLookup.lookupConverterForType(cls);
        }
    }

    public XStream(ReflectionProvider reflectionProvider, HierarchicalStreamDriver hierarchicalStreamDriver, ClassLoaderReference classLoaderReference, Mapper mapper, DefaultConverterLookup defaultConverterLookup) {
        this(reflectionProvider, hierarchicalStreamDriver, classLoaderReference, mapper, new ConverterLookup() { // from class: com.thoughtworks.xstream.XStream.1
            public C86121() {
            }

            @Override // com.thoughtworks.xstream.converters.ConverterLookup
            public Converter lookupConverterForType(Class cls) {
                return defaultConverterLookup.lookupConverterForType(cls);
            }
        }, new ConverterRegistry() { // from class: com.thoughtworks.xstream.XStream.2
            public C86132() {
            }

            @Override // com.thoughtworks.xstream.converters.ConverterRegistry
            public void registerConverter(Converter converter, int i) {
                defaultConverterLookup.registerConverter(converter, i);
            }
        });
    }

    /* renamed from: com.thoughtworks.xstream.XStream$2 */
    /* loaded from: classes8.dex */
    public class C86132 implements ConverterRegistry {
        public C86132() {
        }

        @Override // com.thoughtworks.xstream.converters.ConverterRegistry
        public void registerConverter(Converter converter, int i) {
            defaultConverterLookup.registerConverter(converter, i);
        }
    }

    public XStream(ReflectionProvider reflectionProvider, HierarchicalStreamDriver hierarchicalStreamDriver, ClassLoader classLoader, Mapper mapper, ConverterLookup converterLookup, ConverterRegistry converterRegistry) {
        this(reflectionProvider, hierarchicalStreamDriver, new ClassLoaderReference(classLoader), mapper, converterLookup, converterRegistry);
    }

    public XStream(ReflectionProvider reflectionProvider, HierarchicalStreamDriver hierarchicalStreamDriver, ClassLoaderReference classLoaderReference, Mapper mapper, ConverterLookup converterLookup, ConverterRegistry converterRegistry) throws Throwable {
        this.collectionUpdateLimit = 20;
        this.reflectionProvider = reflectionProvider == null ? JVM.newReflectionProvider() : reflectionProvider;
        this.hierarchicalStreamDriver = hierarchicalStreamDriver;
        this.classLoaderReference = classLoaderReference;
        this.converterLookup = converterLookup;
        this.converterRegistry = converterRegistry;
        this.mapper = mapper == null ? buildMapper() : mapper;
        setupMappers();
        setupSecurity();
        setupAliases();
        setupDefaultImplementations();
        setupConverters();
        setupImmutableTypes();
        setMode(1003);
    }

    public final Mapper buildMapper() throws Throwable {
        Mapper defaultMapper = new DefaultMapper(this.classLoaderReference);
        if (useXStream11XmlFriendlyMapper()) {
            defaultMapper = new XStream11XmlFriendlyMapper(defaultMapper);
        }
        Mapper attributeMapper = new AttributeMapper(new DefaultImplementationsMapper(new ArrayMapper(new OuterClassMapper(new ImplicitCollectionMapper(new SystemAttributeAliasingMapper(new AttributeAliasingMapper(new FieldAliasingMapper(new ElementIgnoringMapper(new ClassAliasingMapper(new PackageAliasingMapper(new DynamicProxyMapper(defaultMapper))))))), this.reflectionProvider)))), this.converterLookup, this.reflectionProvider);
        if (JVM.isVersion(5)) {
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$;
            }
            attributeMapper = buildMapperDynamically("com.thoughtworks.xstream.mapper.EnumMapper", new Class[]{clsClass$}, new Object[]{attributeMapper});
        }
        Mapper immutableTypesMapper = new ImmutableTypesMapper(new LocalConversionMapper(attributeMapper));
        if (JVM.isVersion(8)) {
            Class clsClass$2 = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$2 == null) {
                clsClass$2 = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$2;
            }
            immutableTypesMapper = buildMapperDynamically("com.thoughtworks.xstream.mapper.LambdaMapper", new Class[]{clsClass$2}, new Object[]{immutableTypesMapper});
        }
        Mapper securityMapper = new SecurityMapper(immutableTypesMapper);
        if (JVM.isVersion(5)) {
            Class clsClass$3 = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$3 == null) {
                clsClass$3 = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$3;
            }
            Class clsClass$4 = class$com$thoughtworks$xstream$converters$ConverterRegistry;
            if (clsClass$4 == null) {
                clsClass$4 = class$("com.thoughtworks.xstream.converters.ConverterRegistry");
                class$com$thoughtworks$xstream$converters$ConverterRegistry = clsClass$4;
            }
            Class clsClass$5 = class$com$thoughtworks$xstream$converters$ConverterLookup;
            if (clsClass$5 == null) {
                clsClass$5 = class$("com.thoughtworks.xstream.converters.ConverterLookup");
                class$com$thoughtworks$xstream$converters$ConverterLookup = clsClass$5;
            }
            Class clsClass$6 = class$com$thoughtworks$xstream$core$ClassLoaderReference;
            if (clsClass$6 == null) {
                clsClass$6 = class$("com.thoughtworks.xstream.core.ClassLoaderReference");
                class$com$thoughtworks$xstream$core$ClassLoaderReference = clsClass$6;
            }
            Class clsClass$7 = f5887x9b2a01bc;
            if (clsClass$7 == null) {
                clsClass$7 = class$("com.thoughtworks.xstream.converters.reflection.ReflectionProvider");
                f5887x9b2a01bc = clsClass$7;
            }
            securityMapper = buildMapperDynamically(ANNOTATION_MAPPER_TYPE, new Class[]{clsClass$3, clsClass$4, clsClass$5, clsClass$6, clsClass$7}, new Object[]{securityMapper, this.converterRegistry, this.converterLookup, this.classLoaderReference, this.reflectionProvider});
        }
        return new CachingMapper(wrapMapper((MapperWrapper) securityMapper));
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public final Mapper buildMapperDynamically(String str, Class[] clsArr, Object[] objArr) {
        try {
            return (Mapper) Class.forName(str, false, this.classLoaderReference.getReference()).getConstructor(clsArr).newInstance(objArr);
        } catch (Exception e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not instantiate mapper : ");
            stringBuffer.append(str);
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString(), e);
        } catch (LinkageError e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Could not instantiate mapper : ");
            stringBuffer2.append(str);
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer2.toString(), e2);
        }
    }

    public final void setupMappers() throws Throwable {
        Mapper mapper = this.mapper;
        Class clsClass$ = class$com$thoughtworks$xstream$mapper$PackageAliasingMapper;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.mapper.PackageAliasingMapper");
            class$com$thoughtworks$xstream$mapper$PackageAliasingMapper = clsClass$;
        }
        this.packageAliasingMapper = (PackageAliasingMapper) mapper.lookupMapperOfType(clsClass$);
        Mapper mapper2 = this.mapper;
        Class clsClass$2 = class$com$thoughtworks$xstream$mapper$ClassAliasingMapper;
        if (clsClass$2 == null) {
            clsClass$2 = class$("com.thoughtworks.xstream.mapper.ClassAliasingMapper");
            class$com$thoughtworks$xstream$mapper$ClassAliasingMapper = clsClass$2;
        }
        this.classAliasingMapper = (ClassAliasingMapper) mapper2.lookupMapperOfType(clsClass$2);
        Mapper mapper3 = this.mapper;
        Class clsClass$3 = class$com$thoughtworks$xstream$mapper$ElementIgnoringMapper;
        if (clsClass$3 == null) {
            clsClass$3 = class$("com.thoughtworks.xstream.mapper.ElementIgnoringMapper");
            class$com$thoughtworks$xstream$mapper$ElementIgnoringMapper = clsClass$3;
        }
        this.elementIgnoringMapper = (ElementIgnoringMapper) mapper3.lookupMapperOfType(clsClass$3);
        Mapper mapper4 = this.mapper;
        Class clsClass$4 = class$com$thoughtworks$xstream$mapper$FieldAliasingMapper;
        if (clsClass$4 == null) {
            clsClass$4 = class$("com.thoughtworks.xstream.mapper.FieldAliasingMapper");
            class$com$thoughtworks$xstream$mapper$FieldAliasingMapper = clsClass$4;
        }
        this.fieldAliasingMapper = (FieldAliasingMapper) mapper4.lookupMapperOfType(clsClass$4);
        Mapper mapper5 = this.mapper;
        Class clsClass$5 = class$com$thoughtworks$xstream$mapper$AttributeMapper;
        if (clsClass$5 == null) {
            clsClass$5 = class$("com.thoughtworks.xstream.mapper.AttributeMapper");
            class$com$thoughtworks$xstream$mapper$AttributeMapper = clsClass$5;
        }
        this.attributeMapper = (AttributeMapper) mapper5.lookupMapperOfType(clsClass$5);
        Mapper mapper6 = this.mapper;
        Class clsClass$6 = class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper;
        if (clsClass$6 == null) {
            clsClass$6 = class$("com.thoughtworks.xstream.mapper.AttributeAliasingMapper");
            class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper = clsClass$6;
        }
        this.attributeAliasingMapper = (AttributeAliasingMapper) mapper6.lookupMapperOfType(clsClass$6);
        Mapper mapper7 = this.mapper;
        Class clsClass$7 = f5889x6d3e9b15;
        if (clsClass$7 == null) {
            clsClass$7 = class$("com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper");
            f5889x6d3e9b15 = clsClass$7;
        }
        this.systemAttributeAliasingMapper = (SystemAttributeAliasingMapper) mapper7.lookupMapperOfType(clsClass$7);
        Mapper mapper8 = this.mapper;
        Class clsClass$8 = class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper;
        if (clsClass$8 == null) {
            clsClass$8 = class$("com.thoughtworks.xstream.mapper.ImplicitCollectionMapper");
            class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper = clsClass$8;
        }
        this.implicitCollectionMapper = (ImplicitCollectionMapper) mapper8.lookupMapperOfType(clsClass$8);
        Mapper mapper9 = this.mapper;
        Class clsClass$9 = f5888x5429862c;
        if (clsClass$9 == null) {
            clsClass$9 = class$("com.thoughtworks.xstream.mapper.DefaultImplementationsMapper");
            f5888x5429862c = clsClass$9;
        }
        this.defaultImplementationsMapper = (DefaultImplementationsMapper) mapper9.lookupMapperOfType(clsClass$9);
        Mapper mapper10 = this.mapper;
        Class clsClass$10 = class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper;
        if (clsClass$10 == null) {
            clsClass$10 = class$("com.thoughtworks.xstream.mapper.ImmutableTypesMapper");
            class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper = clsClass$10;
        }
        this.immutableTypesMapper = (ImmutableTypesMapper) mapper10.lookupMapperOfType(clsClass$10);
        Mapper mapper11 = this.mapper;
        Class clsClass$11 = class$com$thoughtworks$xstream$mapper$LocalConversionMapper;
        if (clsClass$11 == null) {
            clsClass$11 = class$("com.thoughtworks.xstream.mapper.LocalConversionMapper");
            class$com$thoughtworks$xstream$mapper$LocalConversionMapper = clsClass$11;
        }
        this.localConversionMapper = (LocalConversionMapper) mapper11.lookupMapperOfType(clsClass$11);
        Mapper mapper12 = this.mapper;
        Class clsClass$12 = class$com$thoughtworks$xstream$mapper$SecurityMapper;
        if (clsClass$12 == null) {
            clsClass$12 = class$("com.thoughtworks.xstream.mapper.SecurityMapper");
            class$com$thoughtworks$xstream$mapper$SecurityMapper = clsClass$12;
        }
        this.securityMapper = (SecurityMapper) mapper12.lookupMapperOfType(clsClass$12);
        Mapper mapper13 = this.mapper;
        Class clsClass$13 = class$com$thoughtworks$xstream$mapper$AnnotationConfiguration;
        if (clsClass$13 == null) {
            clsClass$13 = class$("com.thoughtworks.xstream.mapper.AnnotationConfiguration");
            class$com$thoughtworks$xstream$mapper$AnnotationConfiguration = clsClass$13;
        }
        this.annotationConfiguration = (AnnotationConfiguration) mapper13.lookupMapperOfType(clsClass$13);
    }

    public void setupSecurity() throws Throwable {
        if (this.securityMapper == null) {
            return;
        }
        addPermission(NoTypePermission.NONE);
        addPermission(NullPermission.NULL);
        addPermission(PrimitiveTypePermission.PRIMITIVES);
        addPermission(ArrayTypePermission.ARRAYS);
        addPermission(InterfaceTypePermission.INTERFACES);
        Class clsClass$ = class$java$util$Calendar;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.Calendar");
            class$java$util$Calendar = clsClass$;
        }
        allowTypeHierarchy(clsClass$);
        Class clsClass$2 = class$java$util$Collection;
        if (clsClass$2 == null) {
            clsClass$2 = class$("java.util.Collection");
            class$java$util$Collection = clsClass$2;
        }
        allowTypeHierarchy(clsClass$2);
        Class clsClass$3 = class$java$util$Map;
        if (clsClass$3 == null) {
            clsClass$3 = class$("java.util.Map");
            class$java$util$Map = clsClass$3;
        }
        allowTypeHierarchy(clsClass$3);
        Class clsClass$4 = class$java$util$Map$Entry;
        if (clsClass$4 == null) {
            clsClass$4 = class$("java.util.Map$Entry");
            class$java$util$Map$Entry = clsClass$4;
        }
        allowTypeHierarchy(clsClass$4);
        Class clsClass$5 = class$java$lang$reflect$Member;
        if (clsClass$5 == null) {
            clsClass$5 = class$("java.lang.reflect.Member");
            class$java$lang$reflect$Member = clsClass$5;
        }
        allowTypeHierarchy(clsClass$5);
        Class clsClass$6 = class$java$lang$Number;
        if (clsClass$6 == null) {
            clsClass$6 = class$("java.lang.Number");
            class$java$lang$Number = clsClass$6;
        }
        allowTypeHierarchy(clsClass$6);
        Class clsClass$7 = class$java$lang$Throwable;
        if (clsClass$7 == null) {
            clsClass$7 = class$("java.lang.Throwable");
            class$java$lang$Throwable = clsClass$7;
        }
        allowTypeHierarchy(clsClass$7);
        Class clsClass$8 = class$java$util$TimeZone;
        if (clsClass$8 == null) {
            clsClass$8 = class$("java.util.TimeZone");
            class$java$util$TimeZone = clsClass$8;
        }
        allowTypeHierarchy(clsClass$8);
        Class clsLoadClassForName = JVM.loadClassForName("java.lang.Enum");
        if (clsLoadClassForName != null) {
            allowTypeHierarchy(clsLoadClassForName);
        }
        Class clsLoadClassForName2 = JVM.loadClassForName("java.nio.file.Path");
        if (clsLoadClassForName2 != null) {
            allowTypeHierarchy(clsLoadClassForName2);
        }
        HashSet hashSet = new HashSet();
        Class clsClass$9 = class$java$util$BitSet;
        if (clsClass$9 == null) {
            clsClass$9 = class$("java.util.BitSet");
            class$java$util$BitSet = clsClass$9;
        }
        hashSet.add(clsClass$9);
        Class clsClass$10 = class$java$nio$charset$Charset;
        if (clsClass$10 == null) {
            clsClass$10 = class$("java.nio.charset.Charset");
            class$java$nio$charset$Charset = clsClass$10;
        }
        hashSet.add(clsClass$10);
        Class clsClass$11 = class$java$lang$Class;
        if (clsClass$11 == null) {
            clsClass$11 = class$("java.lang.Class");
            class$java$lang$Class = clsClass$11;
        }
        hashSet.add(clsClass$11);
        Class clsClass$12 = class$java$util$Currency;
        if (clsClass$12 == null) {
            clsClass$12 = class$("java.util.Currency");
            class$java$util$Currency = clsClass$12;
        }
        hashSet.add(clsClass$12);
        Class clsClass$13 = class$java$util$Date;
        if (clsClass$13 == null) {
            clsClass$13 = class$("java.util.Date");
            class$java$util$Date = clsClass$13;
        }
        hashSet.add(clsClass$13);
        Class clsClass$14 = class$java$text$DecimalFormatSymbols;
        if (clsClass$14 == null) {
            clsClass$14 = class$("java.text.DecimalFormatSymbols");
            class$java$text$DecimalFormatSymbols = clsClass$14;
        }
        hashSet.add(clsClass$14);
        Class clsClass$15 = class$java$io$File;
        if (clsClass$15 == null) {
            clsClass$15 = class$("java.io.File");
            class$java$io$File = clsClass$15;
        }
        hashSet.add(clsClass$15);
        Class clsClass$16 = class$java$util$Locale;
        if (clsClass$16 == null) {
            clsClass$16 = class$("java.util.Locale");
            class$java$util$Locale = clsClass$16;
        }
        hashSet.add(clsClass$16);
        Class clsClass$17 = class$java$lang$Object;
        if (clsClass$17 == null) {
            clsClass$17 = class$("java.lang.Object");
            class$java$lang$Object = clsClass$17;
        }
        hashSet.add(clsClass$17);
        Class clsClass$18 = class$java$util$regex$Pattern;
        if (clsClass$18 == null) {
            clsClass$18 = class$("java.util.regex.Pattern");
            class$java$util$regex$Pattern = clsClass$18;
        }
        hashSet.add(clsClass$18);
        Class clsClass$19 = class$java$lang$StackTraceElement;
        if (clsClass$19 == null) {
            clsClass$19 = class$("java.lang.StackTraceElement");
            class$java$lang$StackTraceElement = clsClass$19;
        }
        hashSet.add(clsClass$19);
        Class clsClass$20 = class$java$lang$String;
        if (clsClass$20 == null) {
            clsClass$20 = class$("java.lang.String");
            class$java$lang$String = clsClass$20;
        }
        hashSet.add(clsClass$20);
        Class clsClass$21 = class$java$lang$StringBuffer;
        if (clsClass$21 == null) {
            clsClass$21 = class$("java.lang.StringBuffer");
            class$java$lang$StringBuffer = clsClass$21;
        }
        hashSet.add(clsClass$21);
        hashSet.add(JVM.loadClassForName("java.lang.StringBuilder"));
        Class clsClass$22 = class$java$net$URL;
        if (clsClass$22 == null) {
            clsClass$22 = class$("java.net.URL");
            class$java$net$URL = clsClass$22;
        }
        hashSet.add(clsClass$22);
        Class clsClass$23 = class$java$net$URI;
        if (clsClass$23 == null) {
            clsClass$23 = class$("java.net.URI");
            class$java$net$URI = clsClass$23;
        }
        hashSet.add(clsClass$23);
        hashSet.add(JVM.loadClassForName("java.util.UUID"));
        hashSet.add(JVM.loadClassForName("java.util.concurrent.atomic.AtomicBoolean"));
        hashSet.add(JVM.loadClassForName("java.util.concurrent.atomic.AtomicInteger"));
        hashSet.add(JVM.loadClassForName("java.util.concurrent.atomic.AtomicLong"));
        hashSet.add(JVM.loadClassForName("java.util.concurrent.atomic.AtomicReference"));
        if (JVM.isSQLAvailable()) {
            hashSet.add(JVM.loadClassForName(OptionalHandlerFactory.CLS_NAME_JAVA_SQL_TIMESTAMP));
            hashSet.add(JVM.loadClassForName(OptionalHandlerFactory.CLS_NAME_JAVA_SQL_TIME));
            hashSet.add(JVM.loadClassForName(OptionalHandlerFactory.CLS_NAME_JAVA_SQL_DATE));
        }
        if (JVM.isVersion(8)) {
            allowTypeHierarchy(JVM.loadClassForName("java.time.Clock"));
            hashSet.add(JVM.loadClassForName("java.time.Duration"));
            hashSet.add(JVM.loadClassForName("java.time.Instant"));
            hashSet.add(JVM.loadClassForName("java.time.LocalDate"));
            hashSet.add(JVM.loadClassForName("java.time.LocalDateTime"));
            hashSet.add(JVM.loadClassForName("java.time.LocalTime"));
            hashSet.add(JVM.loadClassForName("java.time.MonthDay"));
            hashSet.add(JVM.loadClassForName("java.time.OffsetDateTime"));
            hashSet.add(JVM.loadClassForName("java.time.OffsetTime"));
            hashSet.add(JVM.loadClassForName("java.time.Period"));
            hashSet.add(JVM.loadClassForName("java.time.Ser"));
            hashSet.add(JVM.loadClassForName("java.time.Year"));
            hashSet.add(JVM.loadClassForName("java.time.YearMonth"));
            hashSet.add(JVM.loadClassForName("java.time.ZonedDateTime"));
            allowTypeHierarchy(JVM.loadClassForName("java.time.ZoneId"));
            hashSet.add(JVM.loadClassForName("java.time.chrono.HijrahDate"));
            hashSet.add(JVM.loadClassForName("java.time.chrono.JapaneseDate"));
            hashSet.add(JVM.loadClassForName("java.time.chrono.JapaneseEra"));
            hashSet.add(JVM.loadClassForName("java.time.chrono.MinguoDate"));
            hashSet.add(JVM.loadClassForName("java.time.chrono.ThaiBuddhistDate"));
            hashSet.add(JVM.loadClassForName("java.time.chrono.Ser"));
            allowTypeHierarchy(JVM.loadClassForName("java.time.chrono.Chronology"));
            hashSet.add(JVM.loadClassForName("java.time.temporal.ValueRange"));
            hashSet.add(JVM.loadClassForName("java.time.temporal.WeekFields"));
            hashSet.add(JVM.loadClassForName("java.util.Optional"));
            hashSet.add(JVM.loadClassForName("java.util.OptionalDouble"));
            hashSet.add(JVM.loadClassForName("java.util.OptionalInt"));
            hashSet.add(JVM.loadClassForName("java.util.OptionalLong"));
        }
        hashSet.remove(null);
        Iterator it = hashSet.iterator();
        int size = hashSet.size();
        Class[] clsArr = new Class[size];
        for (int i = 0; i < size; i++) {
            clsArr[i] = (Class) it.next();
        }
        allowTypes(clsArr);
    }

    public final void denyTypeHierarchyDynamically(String str) {
        Class clsLoadClassForName = JVM.loadClassForName(str);
        if (clsLoadClassForName != null) {
            denyTypeHierarchy(clsLoadClassForName);
        }
    }

    public void setupAliases() throws Throwable {
        if (this.classAliasingMapper == null) {
            return;
        }
        Class clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper$Null;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
            class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
        }
        alias("null", clsClass$);
        Class clsClass$2 = class$java$lang$Integer;
        if (clsClass$2 == null) {
            clsClass$2 = class$("java.lang.Integer");
            class$java$lang$Integer = clsClass$2;
        }
        alias("int", clsClass$2);
        Class clsClass$3 = class$java$lang$Float;
        if (clsClass$3 == null) {
            clsClass$3 = class$("java.lang.Float");
            class$java$lang$Float = clsClass$3;
        }
        alias(TypedValues.Custom.S_FLOAT, clsClass$3);
        Class clsClass$4 = class$java$lang$Double;
        if (clsClass$4 == null) {
            clsClass$4 = class$("java.lang.Double");
            class$java$lang$Double = clsClass$4;
        }
        alias("double", clsClass$4);
        Class clsClass$5 = class$java$lang$Long;
        if (clsClass$5 == null) {
            clsClass$5 = class$("java.lang.Long");
            class$java$lang$Long = clsClass$5;
        }
        alias("long", clsClass$5);
        Class clsClass$6 = class$java$lang$Short;
        if (clsClass$6 == null) {
            clsClass$6 = class$("java.lang.Short");
            class$java$lang$Short = clsClass$6;
        }
        alias("short", clsClass$6);
        Class clsClass$7 = class$java$lang$Character;
        if (clsClass$7 == null) {
            clsClass$7 = class$("java.lang.Character");
            class$java$lang$Character = clsClass$7;
        }
        alias("char", clsClass$7);
        Class clsClass$8 = class$java$lang$Byte;
        if (clsClass$8 == null) {
            clsClass$8 = class$("java.lang.Byte");
            class$java$lang$Byte = clsClass$8;
        }
        alias("byte", clsClass$8);
        Class clsClass$9 = class$java$lang$Boolean;
        if (clsClass$9 == null) {
            clsClass$9 = class$("java.lang.Boolean");
            class$java$lang$Boolean = clsClass$9;
        }
        alias(TypedValues.Custom.S_BOOLEAN, clsClass$9);
        Class clsClass$10 = class$java$lang$Number;
        if (clsClass$10 == null) {
            clsClass$10 = class$("java.lang.Number");
            class$java$lang$Number = clsClass$10;
        }
        alias("number", clsClass$10);
        Class clsClass$11 = class$java$lang$Object;
        if (clsClass$11 == null) {
            clsClass$11 = class$("java.lang.Object");
            class$java$lang$Object = clsClass$11;
        }
        alias("object", clsClass$11);
        Class clsClass$12 = class$java$math$BigInteger;
        if (clsClass$12 == null) {
            clsClass$12 = class$("java.math.BigInteger");
            class$java$math$BigInteger = clsClass$12;
        }
        alias("big-int", clsClass$12);
        Class clsClass$13 = class$java$math$BigDecimal;
        if (clsClass$13 == null) {
            clsClass$13 = class$("java.math.BigDecimal");
            class$java$math$BigDecimal = clsClass$13;
        }
        alias("big-decimal", clsClass$13);
        Class clsClass$14 = class$java$lang$StringBuffer;
        if (clsClass$14 == null) {
            clsClass$14 = class$("java.lang.StringBuffer");
            class$java$lang$StringBuffer = clsClass$14;
        }
        alias("string-buffer", clsClass$14);
        Class clsClass$15 = class$java$lang$String;
        if (clsClass$15 == null) {
            clsClass$15 = class$("java.lang.String");
            class$java$lang$String = clsClass$15;
        }
        alias(TypedValues.Custom.S_STRING, clsClass$15);
        Class clsClass$16 = class$java$lang$Class;
        if (clsClass$16 == null) {
            clsClass$16 = class$("java.lang.Class");
            class$java$lang$Class = clsClass$16;
        }
        alias("java-class", clsClass$16);
        Class clsClass$17 = class$java$lang$reflect$Method;
        if (clsClass$17 == null) {
            clsClass$17 = class$("java.lang.reflect.Method");
            class$java$lang$reflect$Method = clsClass$17;
        }
        alias(FirebaseAnalytics.Param.METHOD, clsClass$17);
        Class clsClass$18 = class$java$lang$reflect$Constructor;
        if (clsClass$18 == null) {
            clsClass$18 = class$("java.lang.reflect.Constructor");
            class$java$lang$reflect$Constructor = clsClass$18;
        }
        alias("constructor", clsClass$18);
        Class clsClass$19 = class$java$lang$reflect$Field;
        if (clsClass$19 == null) {
            clsClass$19 = class$("java.lang.reflect.Field");
            class$java$lang$reflect$Field = clsClass$19;
        }
        alias(SerializableConverter.ELEMENT_FIELD, clsClass$19);
        Class clsClass$20 = class$java$util$Date;
        if (clsClass$20 == null) {
            clsClass$20 = class$("java.util.Date");
            class$java$util$Date = clsClass$20;
        }
        alias("date", clsClass$20);
        Class clsClass$21 = class$java$net$URI;
        if (clsClass$21 == null) {
            clsClass$21 = class$("java.net.URI");
            class$java$net$URI = clsClass$21;
        }
        alias("uri", clsClass$21);
        Class clsClass$22 = class$java$net$URL;
        if (clsClass$22 == null) {
            clsClass$22 = class$("java.net.URL");
            class$java$net$URL = clsClass$22;
        }
        alias("url", clsClass$22);
        Class clsClass$23 = class$java$util$BitSet;
        if (clsClass$23 == null) {
            clsClass$23 = class$("java.util.BitSet");
            class$java$util$BitSet = clsClass$23;
        }
        alias("bit-set", clsClass$23);
        Class clsClass$24 = class$java$util$Map;
        if (clsClass$24 == null) {
            clsClass$24 = class$("java.util.Map");
            class$java$util$Map = clsClass$24;
        }
        alias("map", clsClass$24);
        Class clsClass$25 = class$java$util$Map$Entry;
        if (clsClass$25 == null) {
            clsClass$25 = class$("java.util.Map$Entry");
            class$java$util$Map$Entry = clsClass$25;
        }
        alias("entry", clsClass$25);
        Class clsClass$26 = class$java$util$Properties;
        if (clsClass$26 == null) {
            clsClass$26 = class$("java.util.Properties");
            class$java$util$Properties = clsClass$26;
        }
        alias("properties", clsClass$26);
        Class clsClass$27 = class$java$util$List;
        if (clsClass$27 == null) {
            clsClass$27 = class$("java.util.List");
            class$java$util$List = clsClass$27;
        }
        alias(IFramePlayerOptions.Builder.LIST, clsClass$27);
        Class clsClass$28 = class$java$util$Set;
        if (clsClass$28 == null) {
            clsClass$28 = class$("java.util.Set");
            class$java$util$Set = clsClass$28;
        }
        alias("set", clsClass$28);
        Class clsClass$29 = class$java$util$SortedSet;
        if (clsClass$29 == null) {
            clsClass$29 = class$("java.util.SortedSet");
            class$java$util$SortedSet = clsClass$29;
        }
        alias("sorted-set", clsClass$29);
        Class clsClass$30 = class$java$util$LinkedList;
        if (clsClass$30 == null) {
            clsClass$30 = class$("java.util.LinkedList");
            class$java$util$LinkedList = clsClass$30;
        }
        alias("linked-list", clsClass$30);
        Class clsClass$31 = class$java$util$Vector;
        if (clsClass$31 == null) {
            clsClass$31 = class$("java.util.Vector");
            class$java$util$Vector = clsClass$31;
        }
        alias(VectorDrawableCompat.SHAPE_VECTOR, clsClass$31);
        Class clsClass$32 = class$java$util$TreeMap;
        if (clsClass$32 == null) {
            clsClass$32 = class$("java.util.TreeMap");
            class$java$util$TreeMap = clsClass$32;
        }
        alias("tree-map", clsClass$32);
        Class clsClass$33 = class$java$util$TreeSet;
        if (clsClass$33 == null) {
            clsClass$33 = class$("java.util.TreeSet");
            class$java$util$TreeSet = clsClass$33;
        }
        alias("tree-set", clsClass$33);
        Class clsClass$34 = class$java$util$Hashtable;
        if (clsClass$34 == null) {
            clsClass$34 = class$("java.util.Hashtable");
            class$java$util$Hashtable = clsClass$34;
        }
        alias("hashtable", clsClass$34);
        alias("empty-list", Collections.EMPTY_LIST.getClass());
        alias("empty-map", Collections.EMPTY_MAP.getClass());
        alias("empty-set", Collections.EMPTY_SET.getClass());
        alias("singleton-list", Collections.singletonList(this).getClass());
        alias("singleton-map", Collections.singletonMap(this, null).getClass());
        alias("singleton-set", Collections.singleton(this).getClass());
        if (JVM.isAWTAvailable()) {
            alias("awt-color", JVM.loadClassForName("java.awt.Color", false));
            alias("awt-font", JVM.loadClassForName("java.awt.Font", false));
            alias("awt-text-attribute", JVM.loadClassForName("java.awt.font.TextAttribute"));
        }
        Class clsLoadClassForName = JVM.loadClassForName("javax.activation.ActivationDataFlavor");
        if (clsLoadClassForName != null) {
            alias("activation-data-flavor", clsLoadClassForName);
        }
        if (JVM.isSQLAvailable()) {
            alias("sql-timestamp", JVM.loadClassForName(OptionalHandlerFactory.CLS_NAME_JAVA_SQL_TIMESTAMP));
            alias("sql-time", JVM.loadClassForName(OptionalHandlerFactory.CLS_NAME_JAVA_SQL_TIME));
            alias("sql-date", JVM.loadClassForName(OptionalHandlerFactory.CLS_NAME_JAVA_SQL_DATE));
        }
        Class clsClass$35 = class$java$io$File;
        if (clsClass$35 == null) {
            clsClass$35 = class$("java.io.File");
            class$java$io$File = clsClass$35;
        }
        alias(PomReader.PomProfileElement.FILE, clsClass$35);
        Class clsClass$36 = class$java$util$Locale;
        if (clsClass$36 == null) {
            clsClass$36 = class$("java.util.Locale");
            class$java$util$Locale = clsClass$36;
        }
        alias("locale", clsClass$36);
        Class clsClass$37 = class$java$util$Calendar;
        if (clsClass$37 == null) {
            clsClass$37 = class$("java.util.Calendar");
            class$java$util$Calendar = clsClass$37;
        }
        alias("gregorian-calendar", clsClass$37);
        if (JVM.isVersion(4)) {
            aliasDynamically("auth-subject", "javax.security.auth.Subject");
            alias("linked-hash-map", JVM.loadClassForName("java.util.LinkedHashMap"));
            alias("linked-hash-set", JVM.loadClassForName("java.util.LinkedHashSet"));
            alias("trace", JVM.loadClassForName("java.lang.StackTraceElement"));
            alias(FirebaseAnalytics.Param.CURRENCY, JVM.loadClassForName("java.util.Currency"));
            aliasType("charset", JVM.loadClassForName("java.nio.charset.Charset"));
        }
        if (JVM.isVersion(5)) {
            aliasDynamically("xml-duration", "javax.xml.datatype.Duration");
            alias("concurrent-hash-map", JVM.loadClassForName("java.util.concurrent.ConcurrentHashMap"));
            alias("enum-set", JVM.loadClassForName("java.util.EnumSet"));
            alias("enum-map", JVM.loadClassForName("java.util.EnumMap"));
            alias("string-builder", JVM.loadClassForName("java.lang.StringBuilder"));
            alias(CommonUrlParts.UUID, JVM.loadClassForName("java.util.UUID"));
            alias("atomic-boolean", JVM.loadClassForName("java.util.concurrent.atomic.AtomicBoolean"));
            alias("atomic-int", JVM.loadClassForName("java.util.concurrent.atomic.AtomicInteger"));
            alias("atomic-long", JVM.loadClassForName("java.util.concurrent.atomic.AtomicLong"));
            alias("atomic-reference", JVM.loadClassForName("java.util.concurrent.atomic.AtomicReference"));
        }
        if (JVM.isVersion(7)) {
            aliasType("path", JVM.loadClassForName("java.nio.file.Path"));
        }
        if (JVM.isVersion(8)) {
            alias("fixed-clock", JVM.loadClassForName("java.time.Clock$FixedClock"));
            alias("offset-clock", JVM.loadClassForName("java.time.Clock$OffsetClock"));
            alias("system-clock", JVM.loadClassForName("java.time.Clock$SystemClock"));
            alias("tick-clock", JVM.loadClassForName("java.time.Clock$TickClock"));
            alias("day-of-week", JVM.loadClassForName("java.time.DayOfWeek"));
            alias("duration", JVM.loadClassForName("java.time.Duration"));
            alias("instant", JVM.loadClassForName("java.time.Instant"));
            alias("local-date", JVM.loadClassForName("java.time.LocalDate"));
            alias("local-date-time", JVM.loadClassForName("java.time.LocalDateTime"));
            alias("local-time", JVM.loadClassForName("java.time.LocalTime"));
            alias(TypeAdapters.C786626.MONTH, JVM.loadClassForName("java.time.Month"));
            alias("month-day", JVM.loadClassForName("java.time.MonthDay"));
            alias("offset-date-time", JVM.loadClassForName("java.time.OffsetDateTime"));
            alias("offset-time", JVM.loadClassForName("java.time.OffsetTime"));
            alias(TypedValues.CycleType.S_WAVE_PERIOD, JVM.loadClassForName("java.time.Period"));
            alias(TypeAdapters.C786626.YEAR, JVM.loadClassForName("java.time.Year"));
            alias("year-month", JVM.loadClassForName("java.time.YearMonth"));
            alias("zoned-date-time", JVM.loadClassForName("java.time.ZonedDateTime"));
            aliasType("zone-id", JVM.loadClassForName("java.time.ZoneId"));
            aliasType("chronology", JVM.loadClassForName("java.time.chrono.Chronology"));
            alias("hijrah-date", JVM.loadClassForName("java.time.chrono.HijrahDate"));
            alias("hijrah-era", JVM.loadClassForName("java.time.chrono.HijrahEra"));
            alias("japanese-date", JVM.loadClassForName("java.time.chrono.JapaneseDate"));
            alias("japanese-era", JVM.loadClassForName("java.time.chrono.JapaneseEra"));
            alias("minguo-date", JVM.loadClassForName("java.time.chrono.MinguoDate"));
            alias("minguo-era", JVM.loadClassForName("java.time.chrono.MinguoEra"));
            alias("thai-buddhist-date", JVM.loadClassForName("java.time.chrono.ThaiBuddhistDate"));
            alias("thai-buddhist-era", JVM.loadClassForName("java.time.chrono.ThaiBuddhistEra"));
            alias("chrono-field", JVM.loadClassForName("java.time.temporal.ChronoField"));
            alias("chrono-unit", JVM.loadClassForName("java.time.temporal.ChronoUnit"));
            alias("iso-field", JVM.loadClassForName("java.time.temporal.IsoFields$Field"));
            alias("iso-unit", JVM.loadClassForName("java.time.temporal.IsoFields$Unit"));
            alias("julian-field", JVM.loadClassForName("java.time.temporal.JulianFields$Field"));
            alias("temporal-value-range", JVM.loadClassForName("java.time.temporal.ValueRange"));
            alias("week-fields", JVM.loadClassForName("java.time.temporal.WeekFields"));
            alias("optional", JVM.loadClassForName("java.util.Optional"));
            alias("optional-double", JVM.loadClassForName("java.util.OptionalDouble"));
            alias("optional-int", JVM.loadClassForName("java.util.OptionalInt"));
            alias("optional-long", JVM.loadClassForName("java.util.OptionalLong"));
        }
        if (JVM.loadClassForName("java.lang.invoke.SerializedLambda") != null) {
            aliasDynamically("serialized-lambda", "java.lang.invoke.SerializedLambda");
        }
    }

    public final void aliasDynamically(String str, String str2) throws Throwable {
        Class clsLoadClassForName = JVM.loadClassForName(str2);
        if (clsLoadClassForName != null) {
            alias(str, clsLoadClassForName);
        }
    }

    public void setupDefaultImplementations() throws Throwable {
        if (this.defaultImplementationsMapper == null) {
            return;
        }
        Class clsClass$ = class$java$util$HashMap;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.HashMap");
            class$java$util$HashMap = clsClass$;
        }
        Class clsClass$2 = class$java$util$Map;
        if (clsClass$2 == null) {
            clsClass$2 = class$("java.util.Map");
            class$java$util$Map = clsClass$2;
        }
        addDefaultImplementation(clsClass$, clsClass$2);
        Class clsClass$3 = class$java$util$ArrayList;
        if (clsClass$3 == null) {
            clsClass$3 = class$("java.util.ArrayList");
            class$java$util$ArrayList = clsClass$3;
        }
        Class clsClass$4 = class$java$util$List;
        if (clsClass$4 == null) {
            clsClass$4 = class$("java.util.List");
            class$java$util$List = clsClass$4;
        }
        addDefaultImplementation(clsClass$3, clsClass$4);
        Class clsClass$5 = class$java$util$HashSet;
        if (clsClass$5 == null) {
            clsClass$5 = class$("java.util.HashSet");
            class$java$util$HashSet = clsClass$5;
        }
        Class clsClass$6 = class$java$util$Set;
        if (clsClass$6 == null) {
            clsClass$6 = class$("java.util.Set");
            class$java$util$Set = clsClass$6;
        }
        addDefaultImplementation(clsClass$5, clsClass$6);
        Class clsClass$7 = class$java$util$TreeSet;
        if (clsClass$7 == null) {
            clsClass$7 = class$("java.util.TreeSet");
            class$java$util$TreeSet = clsClass$7;
        }
        Class clsClass$8 = class$java$util$SortedSet;
        if (clsClass$8 == null) {
            clsClass$8 = class$("java.util.SortedSet");
            class$java$util$SortedSet = clsClass$8;
        }
        addDefaultImplementation(clsClass$7, clsClass$8);
        Class clsClass$9 = class$java$util$GregorianCalendar;
        if (clsClass$9 == null) {
            clsClass$9 = class$("java.util.GregorianCalendar");
            class$java$util$GregorianCalendar = clsClass$9;
        }
        Class clsClass$10 = class$java$util$Calendar;
        if (clsClass$10 == null) {
            clsClass$10 = class$("java.util.Calendar");
            class$java$util$Calendar = clsClass$10;
        }
        addDefaultImplementation(clsClass$9, clsClass$10);
    }

    public void setupConverters() throws Throwable {
        registerConverter(new ReflectionConverter(this.mapper, this.reflectionProvider), -20);
        registerConverter(new SerializableConverter(this.mapper, this.reflectionProvider, this.classLoaderReference), -10);
        registerConverter(new ExternalizableConverter(this.mapper, this.classLoaderReference), -10);
        registerConverter(new NullConverter(), 10000);
        registerConverter(new IntConverter(), 0);
        registerConverter(new FloatConverter(), 0);
        registerConverter(new DoubleConverter(), 0);
        registerConverter(new LongConverter(), 0);
        registerConverter(new ShortConverter(), 0);
        registerConverter((Converter) new CharConverter(), 0);
        registerConverter(new BooleanConverter(), 0);
        registerConverter(new ByteConverter(), 0);
        registerConverter(new StringConverter(), 0);
        registerConverter(new StringBufferConverter(), 0);
        registerConverter(new DateConverter(), 0);
        registerConverter(new BitSetConverter(), 0);
        registerConverter(new URIConverter(), 0);
        registerConverter(new URLConverter(), 0);
        registerConverter(new BigIntegerConverter(), 0);
        registerConverter(new BigDecimalConverter(), 0);
        registerConverter(new ArrayConverter(this.mapper), 0);
        registerConverter(new CharArrayConverter(), 0);
        registerConverter(new CollectionConverter(this.mapper), 0);
        registerConverter(new MapConverter(this.mapper), 0);
        registerConverter(new TreeMapConverter(this.mapper), 0);
        registerConverter(new TreeSetConverter(this.mapper), 0);
        registerConverter(new SingletonCollectionConverter(this.mapper), 0);
        registerConverter(new SingletonMapConverter(this.mapper), 0);
        registerConverter(new PropertiesConverter(), 0);
        registerConverter((Converter) new EncodedByteArrayConverter(), 0);
        registerConverter(new FileConverter(), 0);
        if (JVM.isSQLAvailable()) {
            registerConverter(new SqlTimestampConverter(), 0);
            registerConverter(new SqlTimeConverter(), 0);
            registerConverter(new SqlDateConverter(), 0);
        }
        registerConverter(new DynamicProxyConverter(this.mapper, this.classLoaderReference), 0);
        registerConverter(new JavaClassConverter(this.classLoaderReference), 0);
        registerConverter(new JavaMethodConverter(this.classLoaderReference), 0);
        registerConverter(new JavaFieldConverter(this.classLoaderReference), 0);
        if (JVM.isAWTAvailable()) {
            registerConverter(new FontConverter(this.mapper), 0);
            registerConverter(new ColorConverter(), 0);
            registerConverter(new TextAttributeConverter(), 0);
        }
        if (JVM.isSwingAvailable()) {
            registerConverter(new LookAndFeelConverter(this.mapper, this.reflectionProvider), 0);
        }
        registerConverter(new LocaleConverter(), 0);
        registerConverter(new GregorianCalendarConverter(), 0);
        if (JVM.isVersion(4)) {
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$;
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.SubjectConverter", 0, new Class[]{clsClass$}, new Object[]{this.mapper});
            Class clsClass$2 = class$com$thoughtworks$xstream$converters$ConverterLookup;
            if (clsClass$2 == null) {
                clsClass$2 = class$("com.thoughtworks.xstream.converters.ConverterLookup");
                class$com$thoughtworks$xstream$converters$ConverterLookup = clsClass$2;
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.ThrowableConverter", 0, new Class[]{clsClass$2}, new Object[]{this.converterLookup});
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.StackTraceElementConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.CurrencyConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.RegexPatternConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.CharsetConverter", 0, null, null);
        }
        if (JVM.isVersion(5)) {
            if (JVM.loadClassForName("javax.xml.datatype.Duration") != null) {
                registerConverterDynamically("com.thoughtworks.xstream.converters.extended.DurationConverter", 0, null, null);
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.enums.EnumConverter", 0, null, null);
            Class clsClass$3 = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$3 == null) {
                clsClass$3 = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$3;
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.enums.EnumSetConverter", 0, new Class[]{clsClass$3}, new Object[]{this.mapper});
            Class clsClass$4 = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$4 == null) {
                clsClass$4 = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$4;
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.enums.EnumMapConverter", 0, new Class[]{clsClass$4}, new Object[]{this.mapper});
            registerConverterDynamically("com.thoughtworks.xstream.converters.basic.StringBuilderConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.basic.UUIDConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.AtomicBooleanConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.AtomicIntegerConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.AtomicLongConverter", 0, null, null);
            Class clsClass$5 = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$5 == null) {
                clsClass$5 = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$5;
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.AtomicReferenceConverter", 0, new Class[]{clsClass$5}, new Object[]{this.mapper});
        }
        if (JVM.loadClassForName("javax.activation.ActivationDataFlavor") != null) {
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.ActivationDataFlavorConverter", 0, null, null);
        }
        if (JVM.isVersion(7)) {
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.PathConverter", 0, null, null);
        }
        if (JVM.isVersion(8)) {
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.ChronologyConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.DurationConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.HijrahDateConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.JapaneseDateConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.JapaneseEraConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.InstantConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.LocalDateConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.LocalDateTimeConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.LocalTimeConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.MinguoDateConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.MonthDayConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.OffsetDateTimeConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.OffsetTimeConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.PeriodConverter", 0, null, null);
            Class clsClass$6 = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$6 == null) {
                clsClass$6 = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$6;
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.SystemClockConverter", 0, new Class[]{clsClass$6}, new Object[]{this.mapper});
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.ThaiBuddhistDateConverter", 0, null, null);
            Class clsClass$7 = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$7 == null) {
                clsClass$7 = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$7;
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.ValueRangeConverter", 0, new Class[]{clsClass$7}, new Object[]{this.mapper});
            Class clsClass$8 = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$8 == null) {
                clsClass$8 = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$8;
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.WeekFieldsConverter", 0, new Class[]{clsClass$8}, new Object[]{this.mapper});
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.YearConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.YearMonthConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.ZonedDateTimeConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.time.ZoneIdConverter", 0, null, null);
            Class clsClass$9 = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$9 == null) {
                clsClass$9 = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$9;
            }
            Class clsClass$10 = f5887x9b2a01bc;
            if (clsClass$10 == null) {
                clsClass$10 = class$("com.thoughtworks.xstream.converters.reflection.ReflectionProvider");
                f5887x9b2a01bc = clsClass$10;
            }
            Class clsClass$11 = class$com$thoughtworks$xstream$core$ClassLoaderReference;
            if (clsClass$11 == null) {
                clsClass$11 = class$("com.thoughtworks.xstream.core.ClassLoaderReference");
                class$com$thoughtworks$xstream$core$ClassLoaderReference = clsClass$11;
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.reflection.LambdaConverter", 0, new Class[]{clsClass$9, clsClass$10, clsClass$11}, new Object[]{this.mapper, this.reflectionProvider, this.classLoaderReference});
            Class clsClass$12 = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$12 == null) {
                clsClass$12 = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$12;
            }
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.OptionalConverter", 0, new Class[]{clsClass$12}, new Object[]{this.mapper});
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.OptionalDoubleConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.OptionalIntConverter", 0, null, null);
            registerConverterDynamically("com.thoughtworks.xstream.converters.extended.OptionalLongConverter", 0, null, null);
        }
        registerConverter(new SelfStreamingInstanceChecker(this.converterLookup, this), 0);
    }

    public final void registerConverterDynamically(String str, int i, Class[] clsArr, Object[] objArr) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = Class.forName(str, false, this.classLoaderReference.getReference()).getConstructor(clsArr).newInstance(objArr);
            if (objNewInstance instanceof Converter) {
                registerConverter((Converter) objNewInstance, i);
            } else if (objNewInstance instanceof SingleValueConverter) {
                registerConverter((SingleValueConverter) objNewInstance, i);
            }
        } catch (Exception e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not instantiate converter : ");
            stringBuffer.append(str);
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString(), e);
        } catch (LinkageError e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Could not instantiate converter : ");
            stringBuffer2.append(str);
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer2.toString(), e2);
        }
    }

    public void setupImmutableTypes() throws Throwable {
        Class clsLoadClassForName;
        Object objInvoke;
        if (this.immutableTypesMapper == null) {
            return;
        }
        addImmutableType(Boolean.TYPE, false);
        Class clsClass$ = class$java$lang$Boolean;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.Boolean");
            class$java$lang$Boolean = clsClass$;
        }
        addImmutableType(clsClass$, false);
        addImmutableType(Byte.TYPE, false);
        Class clsClass$2 = class$java$lang$Byte;
        if (clsClass$2 == null) {
            clsClass$2 = class$("java.lang.Byte");
            class$java$lang$Byte = clsClass$2;
        }
        addImmutableType(clsClass$2, false);
        addImmutableType(Character.TYPE, false);
        Class clsClass$3 = class$java$lang$Character;
        if (clsClass$3 == null) {
            clsClass$3 = class$("java.lang.Character");
            class$java$lang$Character = clsClass$3;
        }
        addImmutableType(clsClass$3, false);
        addImmutableType(Double.TYPE, false);
        Class clsClass$4 = class$java$lang$Double;
        if (clsClass$4 == null) {
            clsClass$4 = class$("java.lang.Double");
            class$java$lang$Double = clsClass$4;
        }
        addImmutableType(clsClass$4, false);
        addImmutableType(Float.TYPE, false);
        Class clsClass$5 = class$java$lang$Float;
        if (clsClass$5 == null) {
            clsClass$5 = class$("java.lang.Float");
            class$java$lang$Float = clsClass$5;
        }
        addImmutableType(clsClass$5, false);
        addImmutableType(Integer.TYPE, false);
        Class clsClass$6 = class$java$lang$Integer;
        if (clsClass$6 == null) {
            clsClass$6 = class$("java.lang.Integer");
            class$java$lang$Integer = clsClass$6;
        }
        addImmutableType(clsClass$6, false);
        addImmutableType(Long.TYPE, false);
        Class clsClass$7 = class$java$lang$Long;
        if (clsClass$7 == null) {
            clsClass$7 = class$("java.lang.Long");
            class$java$lang$Long = clsClass$7;
        }
        addImmutableType(clsClass$7, false);
        addImmutableType(Short.TYPE, false);
        Class clsClass$8 = class$java$lang$Short;
        if (clsClass$8 == null) {
            clsClass$8 = class$("java.lang.Short");
            class$java$lang$Short = clsClass$8;
        }
        addImmutableType(clsClass$8, false);
        Class clsClass$9 = class$com$thoughtworks$xstream$mapper$Mapper$Null;
        if (clsClass$9 == null) {
            clsClass$9 = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
            class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$9;
        }
        addImmutableType(clsClass$9, false);
        Class clsClass$10 = class$java$math$BigDecimal;
        if (clsClass$10 == null) {
            clsClass$10 = class$("java.math.BigDecimal");
            class$java$math$BigDecimal = clsClass$10;
        }
        addImmutableType(clsClass$10, false);
        Class clsClass$11 = class$java$math$BigInteger;
        if (clsClass$11 == null) {
            clsClass$11 = class$("java.math.BigInteger");
            class$java$math$BigInteger = clsClass$11;
        }
        addImmutableType(clsClass$11, false);
        Class clsClass$12 = class$java$lang$String;
        if (clsClass$12 == null) {
            clsClass$12 = class$("java.lang.String");
            class$java$lang$String = clsClass$12;
        }
        addImmutableType(clsClass$12, false);
        Class clsClass$13 = class$java$net$URL;
        if (clsClass$13 == null) {
            clsClass$13 = class$("java.net.URL");
            class$java$net$URL = clsClass$13;
        }
        addImmutableType(clsClass$13, false);
        Class clsClass$14 = class$java$io$File;
        if (clsClass$14 == null) {
            clsClass$14 = class$("java.io.File");
            class$java$io$File = clsClass$14;
        }
        addImmutableType(clsClass$14, false);
        Class clsClass$15 = class$java$lang$Class;
        if (clsClass$15 == null) {
            clsClass$15 = class$("java.lang.Class");
            class$java$lang$Class = clsClass$15;
        }
        addImmutableType(clsClass$15, false);
        if (JVM.isVersion(7) && (clsLoadClassForName = JVM.loadClassForName("java.nio.file.Paths")) != null) {
            try {
                Class clsClass$16 = class$java$lang$String;
                if (clsClass$16 == null) {
                    clsClass$16 = class$("java.lang.String");
                    class$java$lang$String = clsClass$16;
                }
                Class clsClass$17 = array$Ljava$lang$String;
                if (clsClass$17 == null) {
                    clsClass$17 = class$("[Ljava.lang.String;");
                    array$Ljava$lang$String = clsClass$17;
                }
                Method declaredMethod = clsLoadClassForName.getDeclaredMethod("get", clsClass$16, clsClass$17);
                if (declaredMethod != null && (objInvoke = declaredMethod.invoke(null, ".", new String[0])) != null) {
                    addImmutableType(objInvoke.getClass(), false);
                }
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            }
        }
        if (JVM.isAWTAvailable()) {
            addImmutableTypeDynamically("java.awt.font.TextAttribute", false);
        }
        if (JVM.isVersion(4)) {
            addImmutableTypeDynamically("java.nio.charset.Charset", true);
            addImmutableTypeDynamically("java.util.Currency", true);
        }
        if (JVM.isVersion(5)) {
            addImmutableTypeDynamically("java.util.UUID", true);
        }
        Class clsClass$18 = class$java$net$URI;
        if (clsClass$18 == null) {
            clsClass$18 = class$("java.net.URI");
            class$java$net$URI = clsClass$18;
        }
        addImmutableType(clsClass$18, true);
        addImmutableType(Collections.EMPTY_LIST.getClass(), true);
        addImmutableType(Collections.EMPTY_SET.getClass(), true);
        addImmutableType(Collections.EMPTY_MAP.getClass(), true);
        if (JVM.isVersion(8)) {
            addImmutableTypeDynamically("java.time.Duration", false);
            addImmutableTypeDynamically("java.time.Instant", false);
            addImmutableTypeDynamically("java.time.LocalDate", false);
            addImmutableTypeDynamically("java.time.LocalDateTime", false);
            addImmutableTypeDynamically("java.time.LocalTime", false);
            addImmutableTypeDynamically("java.time.MonthDay", false);
            addImmutableTypeDynamically("java.time.OffsetDateTime", false);
            addImmutableTypeDynamically("java.time.OffsetTime", false);
            addImmutableTypeDynamically("java.time.Period", false);
            addImmutableTypeDynamically("java.time.Year", false);
            addImmutableTypeDynamically("java.time.YearMonth", false);
            addImmutableTypeDynamically("java.time.ZonedDateTime", false);
            addImmutableTypeDynamically("java.time.ZoneId", false);
            addImmutableTypeDynamically("java.time.ZoneOffset", false);
            addImmutableTypeDynamically("java.time.ZoneRegion", false);
            addImmutableTypeDynamically("java.time.chrono.HijrahChronology", false);
            addImmutableTypeDynamically("java.time.chrono.HijrahDate", false);
            addImmutableTypeDynamically("java.time.chrono.IsoChronology", false);
            addImmutableTypeDynamically("java.time.chrono.JapaneseChronology", false);
            addImmutableTypeDynamically("java.time.chrono.JapaneseDate", false);
            addImmutableTypeDynamically("java.time.chrono.JapaneseEra", false);
            addImmutableTypeDynamically("java.time.chrono.MinguoChronology", false);
            addImmutableTypeDynamically("java.time.chrono.MinguoDate", false);
            addImmutableTypeDynamically("java.time.chrono.ThaiBuddhistChronology", false);
            addImmutableTypeDynamically("java.time.chrono.ThaiBuddhistDate", false);
            addImmutableTypeDynamically("java.time.temporal.IsoFields$Field", false);
            addImmutableTypeDynamically("java.time.temporal.IsoFields$Unit", false);
            addImmutableTypeDynamically("java.time.temporal.JulianFields$Field", false);
            addImmutableTypeDynamically("java.util.OptionalDouble", false);
            addImmutableTypeDynamically("java.util.OptionalInt", false);
            addImmutableTypeDynamically("java.util.OptionalLong", false);
        }
    }

    public final void addImmutableTypeDynamically(String str, boolean z) throws Throwable {
        Class clsLoadClassForName = JVM.loadClassForName(str);
        if (clsLoadClassForName != null) {
            addImmutableType(clsLoadClassForName, z);
        }
    }

    public void setMarshallingStrategy(MarshallingStrategy marshallingStrategy) {
        this.marshallingStrategy = marshallingStrategy;
    }

    public void setCollectionUpdateLimit(int i) {
        this.collectionUpdateLimit = i;
    }

    public String toXML(Object obj) {
        StringWriter stringWriter = new StringWriter();
        toXML(obj, stringWriter);
        return stringWriter.toString();
    }

    public void toXML(Object obj, Writer writer) {
        HierarchicalStreamWriter hierarchicalStreamWriterCreateWriter = this.hierarchicalStreamDriver.createWriter(writer);
        try {
            marshal(obj, hierarchicalStreamWriterCreateWriter);
        } finally {
            hierarchicalStreamWriterCreateWriter.flush();
        }
    }

    public void toXML(Object obj, OutputStream outputStream) {
        HierarchicalStreamWriter hierarchicalStreamWriterCreateWriter = this.hierarchicalStreamDriver.createWriter(outputStream);
        try {
            marshal(obj, hierarchicalStreamWriterCreateWriter);
        } finally {
            hierarchicalStreamWriterCreateWriter.flush();
        }
    }

    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter) {
        marshal(obj, hierarchicalStreamWriter, null);
    }

    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, DataHolder dataHolder) {
        this.marshallingStrategy.marshal(hierarchicalStreamWriter, obj, this.converterLookup, this.mapper, dataHolder);
    }

    public Object fromXML(String str) {
        return fromXML(new StringReader(str));
    }

    public Object fromXML(Reader reader) {
        return unmarshal(this.hierarchicalStreamDriver.createReader(reader), null);
    }

    public Object fromXML(InputStream inputStream) {
        return unmarshal(this.hierarchicalStreamDriver.createReader(inputStream), null);
    }

    public Object fromXML(URL url) {
        return fromXML(url, (Object) null);
    }

    public Object fromXML(File file) {
        return fromXML(file, (Object) null);
    }

    public Object fromXML(String str, Object obj) {
        return fromXML(new StringReader(str), obj);
    }

    public Object fromXML(Reader reader, Object obj) {
        return unmarshal(this.hierarchicalStreamDriver.createReader(reader), obj);
    }

    public Object fromXML(URL url, Object obj) {
        HierarchicalStreamReader hierarchicalStreamReaderCreateReader = this.hierarchicalStreamDriver.createReader(url);
        try {
            return unmarshal(hierarchicalStreamReaderCreateReader, obj);
        } finally {
            hierarchicalStreamReaderCreateReader.close();
        }
    }

    public Object fromXML(File file, Object obj) {
        HierarchicalStreamReader hierarchicalStreamReaderCreateReader = this.hierarchicalStreamDriver.createReader(file);
        try {
            return unmarshal(hierarchicalStreamReaderCreateReader, obj);
        } finally {
            hierarchicalStreamReaderCreateReader.close();
        }
    }

    public Object fromXML(InputStream inputStream, Object obj) {
        return unmarshal(this.hierarchicalStreamDriver.createReader(inputStream), obj);
    }

    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader) {
        return unmarshal(hierarchicalStreamReader, null, null);
    }

    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, Object obj) {
        return unmarshal(hierarchicalStreamReader, obj, null);
    }

    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, Object obj, DataHolder dataHolder) {
        try {
            if (this.collectionUpdateLimit > 0) {
                if (dataHolder == null) {
                    dataHolder = new MapBackedDataHolder();
                }
                dataHolder.put(COLLECTION_UPDATE_LIMIT, new Integer(this.collectionUpdateLimit));
                dataHolder.put(COLLECTION_UPDATE_SECONDS, new Integer(0));
            }
            try {
                return this.marshallingStrategy.unmarshal(obj, hierarchicalStreamReader, dataHolder, this.converterLookup, this.mapper);
            } catch (StackOverflowError unused) {
                throw new InputManipulationException("Possible Dneial of Service attack by Stack Overflow");
            }
        } catch (ConversionException e) {
            Package r8 = getClass().getPackage();
            String implementationVersion = r8 != null ? r8.getImplementationVersion() : null;
            if (implementationVersion == null) {
                implementationVersion = "not available";
            }
            e.add("version", implementationVersion);
            throw e;
        }
    }

    public void alias(String str, Class cls) throws Throwable {
        ClassAliasingMapper classAliasingMapper = this.classAliasingMapper;
        if (classAliasingMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$ClassAliasingMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.ClassAliasingMapper");
                class$com$thoughtworks$xstream$mapper$ClassAliasingMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        classAliasingMapper.addClassAlias(str, cls);
    }

    public void aliasType(String str, Class cls) throws Throwable {
        ClassAliasingMapper classAliasingMapper = this.classAliasingMapper;
        if (classAliasingMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$ClassAliasingMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.ClassAliasingMapper");
                class$com$thoughtworks$xstream$mapper$ClassAliasingMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        classAliasingMapper.addTypeAlias(str, cls);
    }

    public void alias(String str, Class cls, Class cls2) throws Throwable {
        alias(str, cls);
        addDefaultImplementation(cls2, cls);
    }

    public void aliasPackage(String str, String str2) throws Throwable {
        PackageAliasingMapper packageAliasingMapper = this.packageAliasingMapper;
        if (packageAliasingMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$PackageAliasingMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.PackageAliasingMapper");
                class$com$thoughtworks$xstream$mapper$PackageAliasingMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        packageAliasingMapper.addPackageAlias(str, str2);
    }

    public void aliasField(String str, Class cls, String str2) throws Throwable {
        FieldAliasingMapper fieldAliasingMapper = this.fieldAliasingMapper;
        if (fieldAliasingMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$FieldAliasingMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.FieldAliasingMapper");
                class$com$thoughtworks$xstream$mapper$FieldAliasingMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        fieldAliasingMapper.addFieldAlias(str, cls, str2);
    }

    public void aliasAttribute(String str, String str2) throws Throwable {
        AttributeAliasingMapper attributeAliasingMapper = this.attributeAliasingMapper;
        if (attributeAliasingMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.AttributeAliasingMapper");
                class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        attributeAliasingMapper.addAliasFor(str2, str);
    }

    public void aliasSystemAttribute(String str, String str2) throws Throwable {
        SystemAttributeAliasingMapper systemAttributeAliasingMapper = this.systemAttributeAliasingMapper;
        if (systemAttributeAliasingMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = f5889x6d3e9b15;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper");
                f5889x6d3e9b15 = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        systemAttributeAliasingMapper.addAliasFor(str2, str);
    }

    public void aliasAttribute(Class cls, String str, String str2) throws Throwable {
        aliasField(str2, cls, str);
        useAttributeFor(cls, str);
    }

    public void useAttributeFor(String str, Class cls) throws Throwable {
        AttributeMapper attributeMapper = this.attributeMapper;
        if (attributeMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$AttributeMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.AttributeMapper");
                class$com$thoughtworks$xstream$mapper$AttributeMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        attributeMapper.addAttributeFor(str, cls);
    }

    public void useAttributeFor(Class cls, String str) throws Throwable {
        AttributeMapper attributeMapper = this.attributeMapper;
        if (attributeMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$AttributeMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.AttributeMapper");
                class$com$thoughtworks$xstream$mapper$AttributeMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        attributeMapper.addAttributeFor(cls, str);
    }

    public void useAttributeFor(Class cls) throws Throwable {
        AttributeMapper attributeMapper = this.attributeMapper;
        if (attributeMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$AttributeMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.AttributeMapper");
                class$com$thoughtworks$xstream$mapper$AttributeMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        attributeMapper.addAttributeFor(cls);
    }

    public void addDefaultImplementation(Class cls, Class cls2) throws Throwable {
        DefaultImplementationsMapper defaultImplementationsMapper = this.defaultImplementationsMapper;
        if (defaultImplementationsMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = f5888x5429862c;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.DefaultImplementationsMapper");
                f5888x5429862c = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        defaultImplementationsMapper.addDefaultImplementation(cls, cls2);
    }

    public void addImmutableType(Class cls) throws Throwable {
        addImmutableType(cls, true);
    }

    public void addImmutableType(Class cls, boolean z) throws Throwable {
        ImmutableTypesMapper immutableTypesMapper = this.immutableTypesMapper;
        if (immutableTypesMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.ImmutableTypesMapper");
                class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        immutableTypesMapper.addImmutableType(cls, z);
    }

    public void registerConverter(Converter converter) {
        registerConverter(converter, 0);
    }

    public void registerConverter(Converter converter, int i) {
        ConverterRegistry converterRegistry = this.converterRegistry;
        if (converterRegistry != null) {
            converterRegistry.registerConverter(converter, i);
        }
    }

    public void registerConverter(SingleValueConverter singleValueConverter) {
        registerConverter(singleValueConverter, 0);
    }

    public void registerConverter(SingleValueConverter singleValueConverter, int i) {
        ConverterRegistry converterRegistry = this.converterRegistry;
        if (converterRegistry != null) {
            converterRegistry.registerConverter(new SingleValueConverterWrapper(singleValueConverter), i);
        }
    }

    public void registerLocalConverter(Class cls, String str, Converter converter) throws Throwable {
        LocalConversionMapper localConversionMapper = this.localConversionMapper;
        if (localConversionMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$LocalConversionMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.LocalConversionMapper");
                class$com$thoughtworks$xstream$mapper$LocalConversionMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        localConversionMapper.registerLocalConverter(cls, str, converter);
    }

    public void registerLocalConverter(Class cls, String str, SingleValueConverter singleValueConverter) throws Throwable {
        registerLocalConverter(cls, str, (Converter) new SingleValueConverterWrapper(singleValueConverter));
    }

    public Mapper getMapper() {
        return this.mapper;
    }

    public ReflectionProvider getReflectionProvider() {
        return this.reflectionProvider;
    }

    public ConverterLookup getConverterLookup() {
        return this.converterLookup;
    }

    public void setMode(int i) {
        switch (i) {
            case 1001:
                setMarshallingStrategy(new TreeMarshallingStrategy());
                return;
            case 1002:
                setMarshallingStrategy(new ReferenceByIdMarshallingStrategy());
                return;
            case 1003:
                setMarshallingStrategy(new ReferenceByXPathMarshallingStrategy(ReferenceByXPathMarshallingStrategy.RELATIVE));
                return;
            case 1004:
                setMarshallingStrategy(new ReferenceByXPathMarshallingStrategy(ReferenceByXPathMarshallingStrategy.ABSOLUTE));
                return;
            case 1005:
                setMarshallingStrategy(new ReferenceByXPathMarshallingStrategy(ReferenceByXPathMarshallingStrategy.RELATIVE | ReferenceByXPathMarshallingStrategy.SINGLE_NODE));
                return;
            case 1006:
                setMarshallingStrategy(new ReferenceByXPathMarshallingStrategy(ReferenceByXPathMarshallingStrategy.ABSOLUTE | ReferenceByXPathMarshallingStrategy.SINGLE_NODE));
                return;
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unknown mode : ");
                stringBuffer.append(i);
                throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public void addImplicitCollection(Class cls, String str) throws Throwable {
        addImplicitCollection(cls, str, null, null);
    }

    public void addImplicitCollection(Class cls, String str, Class cls2) throws Throwable {
        addImplicitCollection(cls, str, null, cls2);
    }

    public void addImplicitCollection(Class cls, String str, String str2, Class cls2) throws Throwable {
        addImplicitMap(cls, str, str2, cls2, null);
    }

    public void addImplicitArray(Class cls, String str) throws Throwable {
        addImplicitCollection(cls, str);
    }

    public void addImplicitArray(Class cls, String str, Class cls2) throws Throwable {
        addImplicitCollection(cls, str, cls2);
    }

    public void addImplicitArray(Class cls, String str, String str2) throws Throwable {
        addImplicitCollection(cls, str, str2, null);
    }

    public void addImplicitMap(Class cls, String str, Class cls2, String str2) throws Throwable {
        addImplicitMap(cls, str, null, cls2, str2);
    }

    public void addImplicitMap(Class cls, String str, String str2, Class cls2, String str3) throws Throwable {
        ImplicitCollectionMapper implicitCollectionMapper = this.implicitCollectionMapper;
        if (implicitCollectionMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.ImplicitCollectionMapper");
                class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        implicitCollectionMapper.add(cls, str, str2, cls2, str3);
    }

    public DataHolder newDataHolder() {
        return new MapBackedDataHolder();
    }

    public ObjectOutputStream createObjectOutputStream(Writer writer) throws IOException {
        return createObjectOutputStream(this.hierarchicalStreamDriver.createWriter(writer), "object-stream");
    }

    public ObjectOutputStream createObjectOutputStream(HierarchicalStreamWriter hierarchicalStreamWriter) throws IOException {
        return createObjectOutputStream(hierarchicalStreamWriter, "object-stream");
    }

    public ObjectOutputStream createObjectOutputStream(Writer writer, String str) throws IOException {
        return createObjectOutputStream(this.hierarchicalStreamDriver.createWriter(writer), str);
    }

    public ObjectOutputStream createObjectOutputStream(OutputStream outputStream) throws IOException {
        return createObjectOutputStream(this.hierarchicalStreamDriver.createWriter(outputStream), "object-stream");
    }

    public ObjectOutputStream createObjectOutputStream(OutputStream outputStream, String str) throws IOException {
        return createObjectOutputStream(this.hierarchicalStreamDriver.createWriter(outputStream), str);
    }

    public ObjectOutputStream createObjectOutputStream(HierarchicalStreamWriter hierarchicalStreamWriter, String str) throws IOException {
        return createObjectOutputStream(hierarchicalStreamWriter, str, null);
    }

    public ObjectOutputStream createObjectOutputStream(HierarchicalStreamWriter hierarchicalStreamWriter, String str, DataHolder dataHolder) throws IOException {
        StatefulWriter statefulWriter = new StatefulWriter(hierarchicalStreamWriter);
        statefulWriter.startNode(str, null);
        return new CustomObjectOutputStream(new CustomObjectOutputStream.StreamCallback() { // from class: com.thoughtworks.xstream.XStream.3
            public final /* synthetic */ DataHolder val$dataHolder;
            public final /* synthetic */ StatefulWriter val$statefulWriter;

            public C86143(StatefulWriter statefulWriter2, DataHolder dataHolder2) {
                statefulWriter = statefulWriter2;
                dataHolder = dataHolder2;
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
            public void writeToStream(Object obj) {
                XStream.this.marshal(obj, statefulWriter, dataHolder);
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
            public void writeFieldsToStream(Map map) throws NotActiveException {
                throw new NotActiveException("not in call to writeObject");
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
            public void defaultWriteObject() throws NotActiveException {
                throw new NotActiveException("not in call to writeObject");
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
            public void flush() {
                statefulWriter.flush();
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
            public void close() {
                if (statefulWriter.state() != StatefulWriter.STATE_CLOSED) {
                    statefulWriter.endNode();
                    statefulWriter.close();
                }
            }
        });
    }

    /* renamed from: com.thoughtworks.xstream.XStream$3 */
    /* loaded from: classes8.dex */
    public class C86143 implements CustomObjectOutputStream.StreamCallback {
        public final /* synthetic */ DataHolder val$dataHolder;
        public final /* synthetic */ StatefulWriter val$statefulWriter;

        public C86143(StatefulWriter statefulWriter2, DataHolder dataHolder2) {
            statefulWriter = statefulWriter2;
            dataHolder = dataHolder2;
        }

        @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
        public void writeToStream(Object obj) {
            XStream.this.marshal(obj, statefulWriter, dataHolder);
        }

        @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
        public void writeFieldsToStream(Map map) throws NotActiveException {
            throw new NotActiveException("not in call to writeObject");
        }

        @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
        public void defaultWriteObject() throws NotActiveException {
            throw new NotActiveException("not in call to writeObject");
        }

        @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
        public void flush() {
            statefulWriter.flush();
        }

        @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
        public void close() {
            if (statefulWriter.state() != StatefulWriter.STATE_CLOSED) {
                statefulWriter.endNode();
                statefulWriter.close();
            }
        }
    }

    public ObjectInputStream createObjectInputStream(Reader reader) throws IOException {
        return createObjectInputStream(this.hierarchicalStreamDriver.createReader(reader));
    }

    public ObjectInputStream createObjectInputStream(InputStream inputStream) throws IOException {
        return createObjectInputStream(this.hierarchicalStreamDriver.createReader(inputStream));
    }

    public ObjectInputStream createObjectInputStream(HierarchicalStreamReader hierarchicalStreamReader) throws IOException {
        return createObjectInputStream(hierarchicalStreamReader, null);
    }

    public ObjectInputStream createObjectInputStream(HierarchicalStreamReader hierarchicalStreamReader, DataHolder dataHolder) throws IOException {
        if (this.collectionUpdateLimit > 0) {
            if (dataHolder == null) {
                dataHolder = new MapBackedDataHolder();
            }
            dataHolder.put(COLLECTION_UPDATE_LIMIT, new Integer(this.collectionUpdateLimit));
            dataHolder.put(COLLECTION_UPDATE_SECONDS, new Integer(0));
        }
        return new CustomObjectInputStream(new CustomObjectInputStream.StreamCallback() { // from class: com.thoughtworks.xstream.XStream.4
            public final /* synthetic */ DataHolder val$dh;
            public final /* synthetic */ HierarchicalStreamReader val$reader;

            public C86154(HierarchicalStreamReader hierarchicalStreamReader2, DataHolder dataHolder2) {
                hierarchicalStreamReader = hierarchicalStreamReader2;
                dataHolder = dataHolder2;
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
            public Object readFromStream() throws EOFException {
                if (!hierarchicalStreamReader.hasMoreChildren()) {
                    throw new EOFException();
                }
                hierarchicalStreamReader.moveDown();
                Object objUnmarshal = XStream.this.unmarshal(hierarchicalStreamReader, null, dataHolder);
                hierarchicalStreamReader.moveUp();
                return objUnmarshal;
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
            public Map readFieldsFromStream() throws IOException {
                throw new NotActiveException("not in call to readObject");
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
            public void defaultReadObject() throws NotActiveException {
                throw new NotActiveException("not in call to readObject");
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
            public void registerValidation(ObjectInputValidation objectInputValidation, int i) throws NotActiveException {
                throw new NotActiveException("stream inactive");
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
            public void close() {
                hierarchicalStreamReader.close();
            }
        }, this.classLoaderReference);
    }

    /* renamed from: com.thoughtworks.xstream.XStream$4 */
    /* loaded from: classes8.dex */
    public class C86154 implements CustomObjectInputStream.StreamCallback {
        public final /* synthetic */ DataHolder val$dh;
        public final /* synthetic */ HierarchicalStreamReader val$reader;

        public C86154(HierarchicalStreamReader hierarchicalStreamReader2, DataHolder dataHolder2) {
            hierarchicalStreamReader = hierarchicalStreamReader2;
            dataHolder = dataHolder2;
        }

        @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
        public Object readFromStream() throws EOFException {
            if (!hierarchicalStreamReader.hasMoreChildren()) {
                throw new EOFException();
            }
            hierarchicalStreamReader.moveDown();
            Object objUnmarshal = XStream.this.unmarshal(hierarchicalStreamReader, null, dataHolder);
            hierarchicalStreamReader.moveUp();
            return objUnmarshal;
        }

        @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
        public Map readFieldsFromStream() throws IOException {
            throw new NotActiveException("not in call to readObject");
        }

        @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
        public void defaultReadObject() throws NotActiveException {
            throw new NotActiveException("not in call to readObject");
        }

        @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
        public void registerValidation(ObjectInputValidation objectInputValidation, int i) throws NotActiveException {
            throw new NotActiveException("stream inactive");
        }

        @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
        public void close() {
            hierarchicalStreamReader.close();
        }
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoaderReference.setReference(classLoader);
    }

    public ClassLoader getClassLoader() {
        return this.classLoaderReference.getReference();
    }

    public ClassLoaderReference getClassLoaderReference() {
        return this.classLoaderReference;
    }

    public void omitField(Class cls, String str) throws Throwable {
        ElementIgnoringMapper elementIgnoringMapper = this.elementIgnoringMapper;
        if (elementIgnoringMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$ElementIgnoringMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.ElementIgnoringMapper");
                class$com$thoughtworks$xstream$mapper$ElementIgnoringMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        elementIgnoringMapper.omitField(cls, str);
    }

    public void ignoreUnknownElements() throws Throwable {
        ignoreUnknownElements(IGNORE_ALL);
    }

    public void ignoreUnknownElements(String str) throws Throwable {
        ignoreUnknownElements(Pattern.compile(str));
    }

    public void ignoreUnknownElements(Pattern pattern) throws Throwable {
        ElementIgnoringMapper elementIgnoringMapper = this.elementIgnoringMapper;
        if (elementIgnoringMapper == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No ");
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$ElementIgnoringMapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.ElementIgnoringMapper");
                class$com$thoughtworks$xstream$mapper$ElementIgnoringMapper = clsClass$;
            }
            stringBuffer.append(clsClass$.getName());
            stringBuffer.append(" available");
            throw new com.thoughtworks.xstream.InitializationException(stringBuffer.toString());
        }
        elementIgnoringMapper.addElementsToIgnore(pattern);
    }

    public void processAnnotations(Class[] clsArr) {
        AnnotationConfiguration annotationConfiguration = this.annotationConfiguration;
        if (annotationConfiguration == null) {
            throw new com.thoughtworks.xstream.InitializationException("No com.thoughtworks.xstream.mapper.AnnotationMapper available");
        }
        annotationConfiguration.processAnnotations(clsArr);
    }

    public void processAnnotations(Class cls) {
        processAnnotations(new Class[]{cls});
    }

    public void autodetectAnnotations(boolean z) {
        AnnotationConfiguration annotationConfiguration = this.annotationConfiguration;
        if (annotationConfiguration != null) {
            annotationConfiguration.autodetectAnnotations(z);
        }
    }

    public void addPermission(TypePermission typePermission) {
        SecurityMapper securityMapper = this.securityMapper;
        if (securityMapper != null) {
            securityMapper.addPermission(typePermission);
        }
    }

    public void allowTypes(String[] strArr) {
        addPermission(new ExplicitTypePermission(strArr));
    }

    public void allowTypes(Class[] clsArr) {
        addPermission(new ExplicitTypePermission(clsArr));
    }

    public void allowTypeHierarchy(Class cls) {
        addPermission(new TypeHierarchyPermission(cls));
    }

    public void allowTypesByRegExp(String[] strArr) {
        addPermission(new RegExpTypePermission(strArr));
    }

    public void allowTypesByRegExp(Pattern[] patternArr) {
        addPermission(new RegExpTypePermission(patternArr));
    }

    public void allowTypesByWildcard(String[] strArr) {
        addPermission(new WildcardTypePermission(strArr));
    }

    public void denyPermission(TypePermission typePermission) {
        addPermission(new NoPermission(typePermission));
    }

    public void denyTypes(String[] strArr) {
        denyPermission(new ExplicitTypePermission(strArr));
    }

    public void denyTypes(Class[] clsArr) {
        denyPermission(new ExplicitTypePermission(clsArr));
    }

    public void denyTypeHierarchy(Class cls) {
        denyPermission(new TypeHierarchyPermission(cls));
    }

    public void denyTypesByRegExp(String[] strArr) {
        denyPermission(new RegExpTypePermission(strArr));
    }

    public void denyTypesByRegExp(Pattern[] patternArr) {
        denyPermission(new RegExpTypePermission(patternArr));
    }

    public void denyTypesByWildcard(String[] strArr) {
        denyPermission(new WildcardTypePermission(strArr));
    }

    /* loaded from: classes6.dex */
    public static class InitializationException extends XStreamException {
        public InitializationException(String str, Throwable th) {
            super(str, th);
        }

        public InitializationException(String str) {
            super(str);
        }
    }
}
