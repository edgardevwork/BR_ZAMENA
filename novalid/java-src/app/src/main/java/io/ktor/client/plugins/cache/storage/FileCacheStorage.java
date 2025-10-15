package io.ktor.client.plugins.cache.storage;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.MetadataUtil;
import androidx.media3.extractor.p007ts.H263Reader;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import io.ktor.client.plugins.cache.HttpCacheKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.CryptoKt;
import io.ktor.util.StringValuesKt;
import io.ktor.util.collections.ConcurrentMap;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.p050io.ByteChannel;
import io.ktor.utils.p050io.ByteChannelKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteReadChannelKt;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.ByteWriteChannelKt;
import io.ktor.utils.p050io.core.CloseableJVMKt;
import io.ktor.utils.p050io.jvm.javaio.ReadingKt;
import io.ktor.utils.p050io.jvm.javaio.WritingKt;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileCacheStorage.kt */
@Metadata(m7104d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J/\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0019\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u001a\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ!\u0010 \u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020!2\u0006\u0010\"\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J'\u0010 \u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0&H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m7105d2 = {"Lio/ktor/client/plugins/cache/storage/FileCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "directory", "Ljava/io/File;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Ljava/io/File;Lkotlinx/coroutines/CoroutineDispatcher;)V", "mutexes", "Lio/ktor/util/collections/ConcurrentMap;", "", "Lkotlinx/coroutines/sync/Mutex;", "find", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "url", "Lio/ktor/http/Url;", "varyKeys", "", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAll", "", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "key", "readCache", "channel", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlHex", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "store", "", "data", "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeCache", "Lio/ktor/utils/io/ByteChannel;", "cache", "(Lio/ktor/utils/io/ByteChannel;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "caches", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,196:1\n167#2,3:197\n120#3,10:200\n8#4,4:210\n22#4,2:214\n12#4,9:216\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage\n*L\n83#1:197,3\n112#1:200,10\n117#1:210,4\n117#1:214,2\n117#1:216,9\n*E\n"})
/* loaded from: classes7.dex */
public final class FileCacheStorage implements CacheStorage {

    @NotNull
    public final File directory;

    @NotNull
    public final CoroutineDispatcher dispatcher;

    @NotNull
    public final ConcurrentMap<String, Mutex> mutexes;

    /* compiled from: FileCacheStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", m7120f = "FileCacheStorage.kt", m7121i = {0}, m7122l = {81}, m7123m = "find", m7124n = {"varyKeys"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1 */
    public static final class C101701 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C101701(Continuation<? super C101701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.find(null, null, this);
        }
    }

    /* compiled from: FileCacheStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", m7120f = "FileCacheStorage.kt", m7121i = {}, m7122l = {77}, m7123m = "findAll", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1 */
    public static final class C101711 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C101711(Continuation<? super C101711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.findAll(null, this);
        }
    }

    /* compiled from: FileCacheStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", m7120f = "FileCacheStorage.kt", m7121i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3}, m7122l = {202, 119, 122, 124}, m7123m = "readCache", m7124n = {"this", "urlHex", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$use$iv", "channel", "closed$iv", "this", "$this$withLock_u24default$iv", "$this$use$iv", "channel", "caches", "closed$iv", "requestsCount", "i", "$this$withLock_u24default$iv", "$this$use$iv", "caches", "closed$iv"}, m7125s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1 */
    public static final class C101721 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C101721(Continuation<? super C101721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.readCache((String) null, this);
        }
    }

    /* compiled from: FileCacheStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", m7120f = "FileCacheStorage.kt", m7121i = {0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14}, m7122l = {159, 160, 160, MatroskaExtractor.ID_BLOCK, 162, MatroskaExtractor.ID_BLOCK_ADDITIONAL, MatroskaExtractor.ID_BLOCK_MORE, MetadataUtil.TYPE_TOP_BYTE_COPYRIGHT, 170, BcBands.LOOKUPSWITCH, TsExtractor.TS_STREAM_TYPE_AC4, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 176, 180, H263Reader.START_CODE_VALUE_VOP}, m7123m = "readCache", m7124n = {"channel", "channel", "url", "channel", "url", "channel", "url", "status", "channel", "url", "status", "version", "channel", "url", "status", "version", "headers", "headersCount", "j", "channel", "url", "status", "version", "headers", "key", "headersCount", "j", "channel", "url", "status", "version", "headers", "channel", "url", "status", "version", "headers", "requestTime", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u244", "varyKeysCount", "j", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u244", "key", "varyKeysCount", "j", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "body"}, m7125s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3 */
    public static final class C101733 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C101733(Continuation<? super C101733> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.readCache((ByteReadChannel) null, this);
        }
    }

    /* compiled from: FileCacheStorage.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", m7120f = "FileCacheStorage.kt", m7121i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13}, m7122l = {136, Cea708Decoder.COMMAND_DSW, 138, 139, Cea708Decoder.COMMAND_DLY, Cea708Decoder.COMMAND_RST, Cea708Decoder.COMMAND_SPA, Cea708Decoder.COMMAND_SPL, 147, TarConstants.CHKSUM_OFFSET, 149, Cea708Decoder.COMMAND_SWA, Cea708Decoder.COMMAND_DF0, Cea708Decoder.COMMAND_DF2, 155}, m7123m = "writeCache", m7124n = {"channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "headers", "channel", "cache", "value", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "value", "channel", "cache", "channel", "cache"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$3 */
    public static final class C101763 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C101763(Continuation<? super C101763> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.writeCache((ByteChannel) null, (CachedResponseData) null, this);
        }
    }

    public FileCacheStorage(@NotNull File directory, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.directory = directory;
        this.dispatcher = dispatcher;
        this.mutexes = new ConcurrentMap<>(0, 1, null);
        directory.mkdirs();
    }

    public /* synthetic */ FileCacheStorage(File file, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* compiled from: FileCacheStorage.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", m7120f = "FileCacheStorage.kt", m7121i = {0}, m7122l = {72, 73}, m7123m = "invokeSuspend", m7124n = {"urlHex"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$store$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n819#2:197\n847#2,2:198\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$store$2\n*L\n72#1:197\n72#1:198,2\n*E\n"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2 */
    /* loaded from: classes6.dex */
    public static final class C101742 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CachedResponseData $data;
        public final /* synthetic */ Url $url;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101742(Url url, CachedResponseData cachedResponseData, Continuation<? super C101742> continuation) {
            super(2, continuation);
            this.$url = url;
            this.$data = cachedResponseData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FileCacheStorage.this.new C101742(this.$url, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C101742) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String strKey;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                strKey = FileCacheStorage.this.key(this.$url);
                FileCacheStorage fileCacheStorage = FileCacheStorage.this;
                this.L$0 = strKey;
                this.label = 1;
                obj = fileCacheStorage.readCache(strKey, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                strKey = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            CachedResponseData cachedResponseData = this.$data;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (!Intrinsics.areEqual(((CachedResponseData) obj2).getVaryKeys(), cachedResponseData.getVaryKeys())) {
                    arrayList.add(obj2);
                }
            }
            List listPlus = CollectionsKt___CollectionsKt.plus((Collection<? extends CachedResponseData>) arrayList, this.$data);
            FileCacheStorage fileCacheStorage2 = FileCacheStorage.this;
            this.L$0 = null;
            this.label = 2;
            if (fileCacheStorage2.writeCache(strKey, (List<CachedResponseData>) listPlus, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    @Nullable
    public Object store(@NotNull Url url, @NotNull CachedResponseData cachedResponseData, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new C101742(url, cachedResponseData, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object findAll(@NotNull Url url, @NotNull Continuation<? super Set<CachedResponseData>> continuation) throws Throwable {
        C101711 c101711;
        if (continuation instanceof C101711) {
            c101711 = (C101711) continuation;
            int i = c101711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101711.label = i - Integer.MIN_VALUE;
            } else {
                c101711 = new C101711(continuation);
            }
        }
        Object cache = c101711.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(cache);
            String strKey = key(url);
            c101711.label = 1;
            cache = readCache(strKey, c101711);
            if (cache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(cache);
        }
        return CollectionsKt___CollectionsKt.toSet((Iterable) cache);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object find(@NotNull Url url, @NotNull Map<String, String> map, @NotNull Continuation<? super CachedResponseData> continuation) throws Throwable {
        C101701 c101701;
        if (continuation instanceof C101701) {
            c101701 = (C101701) continuation;
            int i = c101701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101701.label = i - Integer.MIN_VALUE;
            } else {
                c101701 = new C101701(continuation);
            }
        }
        Object cache = c101701.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(cache);
            String strKey = key(url);
            c101701.L$0 = map;
            c101701.label = 1;
            cache = readCache(strKey, c101701);
            if (cache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c101701.L$0;
            ResultKt.throwOnFailure(cache);
        }
        for (Object obj : (Set) cache) {
            CachedResponseData cachedResponseData = (CachedResponseData) obj;
            if (map.isEmpty()) {
                return obj;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!Intrinsics.areEqual(cachedResponseData.getVaryKeys().get(key), entry.getValue())) {
                    break;
                }
            }
            return obj;
        }
        return null;
    }

    public final String key(Url url) {
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(StringsKt__StringsJVMKt.encodeToByteArray(url.getUrlString()));
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "getInstance(\"MD5\").diges…ng().encodeToByteArray())");
        return CryptoKt.hex(bArrDigest);
    }

    /* compiled from: FileCacheStorage.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2", m7120f = "FileCacheStorage.kt", m7121i = {0, 0, 1, 1, 1}, m7122l = {202, 102}, m7123m = "invokeSuspend", m7124n = {"$this$coroutineScope", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$use$iv", "closed$iv"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
    @SourceDebugExtension({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,196:1\n120#2,8:197\n129#2:222\n8#3,4:205\n22#3,4:209\n12#3,9:213\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2\n*L\n91#1:197,8\n91#1:222\n94#1:205,4\n94#1:209,4\n94#1:213,9\n*E\n"})
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2 */
    /* loaded from: classes6.dex */
    public static final class C101752 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        public final /* synthetic */ List<CachedResponseData> $caches;
        public final /* synthetic */ String $urlHex;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101752(String str, List<CachedResponseData> list, Continuation<? super C101752> continuation) {
            super(2, continuation);
            this.$urlHex = str;
            this.$caches = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C101752 c101752 = FileCacheStorage.this.new C101752(this.$urlHex, this.$caches, continuation);
            c101752.L$0 = obj;
            return c101752;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        @Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<Object> continuation) {
            return ((C101752) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|77|(1:(1:(9:6|64|7|8|70|36|37|60|61)(2:11|12))(1:13))(2:15|(1:17)(1:18))|14|19|69|20|66|21|(1:23)(2:28|29)|75|30|31|72|32|(1:34)(6:35|70|36|37|60|61)|(2:(0)|(1:74))) */
        /* JADX WARN: Can't wrap try/catch for region: R(9:(4:(1:(1:(9:6|64|7|8|70|36|37|60|61)(2:11|12))(1:13))(2:15|(1:17)(1:18))|72|32|(1:34)(6:35|70|36|37|60|61))|69|20|66|21|(1:23)(2:28|29)|75|30|31) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        
            r12 = r7;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v20, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Mutex mutex;
            Object objBoxLong;
            Mutex mutex2;
            CoroutineScope coroutineScope;
            FileCacheStorage fileCacheStorage;
            String str;
            List<CachedResponseData> list;
            CoroutineScope coroutineScope2;
            ByteChannel byteChannelByteChannel$default;
            BufferedOutputStream bufferedOutputStream;
            BufferedOutputStream bufferedOutputStream2;
            Throwable th;
            Mutex mutex3;
            Object objCopyTo$default;
            Mutex mutex4;
            BufferedOutputStream bufferedOutputStream3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            ?? r2 = 2;
            r2 = 2;
            try {
            } catch (Exception e) {
                e = e;
                mutex = r2;
                HttpCacheKt.getLOGGER().trace("Exception during saving a cache to a file: " + ExceptionsKt__ExceptionsKt.stackTraceToString(e));
                objBoxLong = Unit.INSTANCE;
                mutex2 = mutex;
                mutex2.unlock(null);
                return objBoxLong;
            } catch (Throwable th2) {
                th = th2;
                mutex = r2;
                mutex.unlock(null);
                throw th;
            }
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        coroutineScope = (CoroutineScope) this.L$0;
                        Mutex mutex5 = (Mutex) FileCacheStorage.this.mutexes.computeIfAbsent((ConcurrentMap) this.$urlHex, (Function0) new Function0<Mutex>() { // from class: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$mutex$1
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Mutex invoke() {
                                return MutexKt.Mutex$default(false, 1, null);
                            }
                        });
                        fileCacheStorage = FileCacheStorage.this;
                        str = this.$urlHex;
                        List<CachedResponseData> list2 = this.$caches;
                        this.L$0 = coroutineScope;
                        this.L$1 = mutex5;
                        this.L$2 = fileCacheStorage;
                        this.L$3 = str;
                        this.L$4 = list2;
                        this.label = 1;
                        if (mutex5.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex5;
                        list = list2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ?? r1 = (Closeable) this.L$1;
                            Mutex mutex6 = (Mutex) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                bufferedOutputStream2 = r1;
                                objCopyTo$default = obj;
                                mutex4 = mutex6;
                                try {
                                    objBoxLong = Boxing.boxLong(((Number) objCopyTo$default).longValue());
                                    bufferedOutputStream2.close();
                                    mutex2 = mutex4;
                                    mutex2.unlock(null);
                                    return objBoxLong;
                                } catch (Throwable th3) {
                                    th = th3;
                                    mutex3 = mutex4;
                                    bufferedOutputStream3 = bufferedOutputStream2;
                                    r2 = mutex3;
                                    try {
                                        bufferedOutputStream3.close();
                                        throw th;
                                    } finally {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream3 = r1;
                                r2 = mutex6;
                                bufferedOutputStream3.close();
                                throw th;
                            }
                        }
                        list = (List) this.L$4;
                        str = (String) this.L$3;
                        fileCacheStorage = (FileCacheStorage) this.L$2;
                        Mutex mutex7 = (Mutex) this.L$1;
                        coroutineScope = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex7;
                    }
                    objCopyTo$default = WritingKt.copyTo$default(byteChannelByteChannel$default, bufferedOutputStream, 0L, this, 2, null);
                    if (objCopyTo$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex4 = mutex;
                    objBoxLong = Boxing.boxLong(((Number) objCopyTo$default).longValue());
                    bufferedOutputStream2.close();
                    mutex2 = mutex4;
                    mutex2.unlock(null);
                    return objBoxLong;
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    mutex3 = mutex;
                    bufferedOutputStream3 = bufferedOutputStream2;
                    r2 = mutex3;
                    bufferedOutputStream3.close();
                    throw th;
                }
                byteChannelByteChannel$default = ByteChannelKt.ByteChannel$default(false, 1, null);
                OutputStream fileOutputStream = new FileOutputStream(new File(fileCacheStorage.directory, str));
                bufferedOutputStream = fileOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new FileCacheStorage$writeCache$2$1$1$1(byteChannelByteChannel$default, list, fileCacheStorage, null), 3, null);
                this.L$0 = mutex;
                this.L$1 = bufferedOutputStream;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 0;
                this.label = 2;
                bufferedOutputStream2 = bufferedOutputStream;
            } catch (Throwable th6) {
                th = th6;
                mutex.unlock(null);
                throw th;
            }
            coroutineScope2 = coroutineScope;
        }
    }

    public final Object writeCache(String str, List<CachedResponseData> list, Continuation<Object> continuation) {
        return CoroutineScopeKt.coroutineScope(new C101752(str, list, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130 A[Catch: all -> 0x0164, TRY_LEAVE, TryCatch #2 {all -> 0x0164, blocks: (B:56:0x0130, B:64:0x0169, B:54:0x011d), top: B:92:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169 A[Catch: all -> 0x0164, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0164, blocks: (B:56:0x0130, B:64:0x0169, B:54:0x011d), top: B:92:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x014b -> B:60:0x0156). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readCache(String str, Continuation<? super Set<CachedResponseData>> continuation) throws Throwable {
        C101721 c101721;
        ?? r2;
        ?? r22;
        FileCacheStorage fileCacheStorage;
        BufferedInputStream bufferedInputStream;
        Closeable closeable;
        Mutex mutex;
        ByteReadChannel byteReadChannel;
        int i;
        int iIntValue;
        int i2;
        Set linkedHashSet;
        ByteReadChannel byteReadChannel2;
        Throwable th;
        Mutex mutex2;
        String str2 = str;
        if (continuation instanceof C101721) {
            c101721 = (C101721) continuation;
            int i3 = c101721.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c101721.label = i3 - Integer.MIN_VALUE;
            } else {
                c101721 = new C101721(continuation);
            }
        }
        Object obj = c101721.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c101721.label;
        int i5 = 0;
        try {
        } catch (Exception e) {
            e = e;
            r22 = c101721;
        } catch (Throwable th2) {
            th = th2;
            r2 = c101721;
        }
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                Mutex mutexComputeIfAbsent = this.mutexes.computeIfAbsent((ConcurrentMap<String, Mutex>) str2, (Function0<? extends Mutex>) new Function0<Mutex>() { // from class: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$mutex$1
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Mutex invoke() {
                        return MutexKt.Mutex$default(false, 1, null);
                    }
                });
                c101721.L$0 = this;
                c101721.L$1 = str2;
                c101721.L$2 = mutexComputeIfAbsent;
                c101721.label = 1;
                if (mutexComputeIfAbsent.lock(null, c101721) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fileCacheStorage = this;
                r2 = mutexComputeIfAbsent;
            } else if (i4 == 1) {
                Mutex mutex3 = (Mutex) c101721.L$2;
                String str3 = (String) c101721.L$1;
                FileCacheStorage fileCacheStorage2 = (FileCacheStorage) c101721.L$0;
                ResultKt.throwOnFailure(obj);
                r2 = mutex3;
                str2 = str3;
                fileCacheStorage = fileCacheStorage2;
            } else if (i4 == 2) {
                i = c101721.I$0;
                ByteReadChannel byteReadChannel3 = (ByteReadChannel) c101721.L$3;
                ?? r7 = (Closeable) c101721.L$2;
                mutex = (Mutex) c101721.L$1;
                fileCacheStorage = (FileCacheStorage) c101721.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    byteReadChannel = byteReadChannel3;
                    bufferedInputStream = r7;
                } catch (Throwable th3) {
                    th = th3;
                    closeable = r7;
                    closeable.close();
                    throw th;
                }
                try {
                    iIntValue = ((Number) obj).intValue();
                    ByteReadChannel byteReadChannel4 = byteReadChannel;
                    i2 = i;
                    linkedHashSet = new LinkedHashSet();
                    byteReadChannel2 = byteReadChannel4;
                    if (i5 >= iIntValue) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    closeable = bufferedInputStream;
                    closeable.close();
                    throw th;
                }
            } else {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    linkedHashSet = (Set) c101721.L$2;
                    closeable = (Closeable) c101721.L$1;
                    mutex2 = (Mutex) c101721.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        closeable.close();
                        mutex2.unlock(null);
                        return linkedHashSet;
                    } catch (Throwable th5) {
                        th = th5;
                        th = th;
                        try {
                            closeable.close();
                            throw th;
                        } catch (Throwable th6) {
                            CloseableJVMKt.addSuppressedInternal(th, th6);
                            throw th;
                        }
                    }
                }
                int i6 = c101721.I$2;
                int i7 = c101721.I$1;
                int i8 = c101721.I$0;
                Set set = (Set) c101721.L$5;
                Set set2 = (Set) c101721.L$4;
                byteReadChannel2 = (ByteReadChannel) c101721.L$3;
                ?? r14 = (Closeable) c101721.L$2;
                Mutex mutex4 = (Mutex) c101721.L$1;
                FileCacheStorage fileCacheStorage3 = (FileCacheStorage) c101721.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    i2 = i8;
                    FileCacheStorage fileCacheStorage4 = fileCacheStorage3;
                    r14 = r14;
                    set.add(obj);
                    iIntValue = i7;
                    bufferedInputStream = r14;
                    mutex = mutex4;
                    FileCacheStorage fileCacheStorage5 = fileCacheStorage4;
                    i5 = i6 + 1;
                    linkedHashSet = set2;
                    fileCacheStorage = fileCacheStorage5;
                    if (i5 >= iIntValue) {
                        c101721.L$0 = fileCacheStorage;
                        c101721.L$1 = mutex;
                        c101721.L$2 = bufferedInputStream;
                        c101721.L$3 = byteReadChannel2;
                        c101721.L$4 = linkedHashSet;
                        c101721.L$5 = linkedHashSet;
                        c101721.I$0 = i2;
                        c101721.I$1 = iIntValue;
                        c101721.I$2 = i5;
                        c101721.label = 3;
                        Object cache = fileCacheStorage.readCache(byteReadChannel2, c101721);
                        if (cache == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex4 = mutex;
                        set = linkedHashSet;
                        i6 = i5;
                        fileCacheStorage4 = fileCacheStorage;
                        set2 = set;
                        BufferedInputStream bufferedInputStream2 = bufferedInputStream;
                        i7 = iIntValue;
                        obj = cache;
                        r14 = bufferedInputStream2;
                        set.add(obj);
                        iIntValue = i7;
                        bufferedInputStream = r14;
                        mutex = mutex4;
                        FileCacheStorage fileCacheStorage52 = fileCacheStorage4;
                        i5 = i6 + 1;
                        linkedHashSet = set2;
                        fileCacheStorage = fileCacheStorage52;
                        if (i5 >= iIntValue) {
                            c101721.L$0 = mutex;
                            c101721.L$1 = bufferedInputStream;
                            c101721.L$2 = linkedHashSet;
                            c101721.L$3 = null;
                            c101721.L$4 = null;
                            c101721.L$5 = null;
                            c101721.I$0 = i2;
                            c101721.label = 4;
                            if (ByteReadChannelKt.discard(byteReadChannel2, c101721) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            closeable = bufferedInputStream;
                            mutex2 = mutex;
                            closeable.close();
                            mutex2.unlock(null);
                            return linkedHashSet;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    closeable = r14;
                    closeable.close();
                    throw th;
                }
            }
            File file = new File(fileCacheStorage.directory, str2);
            if (file.exists()) {
                try {
                    InputStream fileInputStream = new FileInputStream(file);
                    bufferedInputStream = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
                    try {
                        ByteReadChannel byteReadChannelWithArrayPool$default = ReadingKt.toByteReadChannelWithArrayPool$default(bufferedInputStream, null, null, 3, null);
                        c101721.L$0 = fileCacheStorage;
                        c101721.L$1 = r2;
                        c101721.L$2 = bufferedInputStream;
                        c101721.L$3 = byteReadChannelWithArrayPool$default;
                        c101721.I$0 = 0;
                        c101721.label = 2;
                        Object obj2 = byteReadChannelWithArrayPool$default.readInt(c101721);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = r2;
                        obj = obj2;
                        byteReadChannel = byteReadChannelWithArrayPool$default;
                        i = 0;
                        iIntValue = ((Number) obj).intValue();
                        ByteReadChannel byteReadChannel42 = byteReadChannel;
                        i2 = i;
                        linkedHashSet = new LinkedHashSet();
                        byteReadChannel2 = byteReadChannel42;
                        if (i5 >= iIntValue) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        closeable = bufferedInputStream;
                        th = th;
                        closeable.close();
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    r22 = r2;
                    HttpCacheKt.getLOGGER().trace("Exception during cache lookup in a file: " + ExceptionsKt__ExceptionsKt.stackTraceToString(e));
                    Set setEmptySet = SetsKt__SetsKt.emptySet();
                    r22.unlock(null);
                    return setEmptySet;
                }
            } else {
                Set setEmptySet2 = SetsKt__SetsKt.emptySet();
                r2.unlock(null);
                return setEmptySet2;
            }
        } catch (Throwable th9) {
            th = th9;
            r2.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0254 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0305 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x020a -> B:45:0x01ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x02d9 -> B:69:0x0278). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeCache(ByteChannel byteChannel, CachedResponseData cachedResponseData, Continuation<? super Unit> continuation) throws Throwable {
        C101763 c101763;
        int value;
        ByteChannel byteChannel2;
        CachedResponseData cachedResponseData2;
        String str;
        String string;
        ByteChannel byteChannel3;
        CachedResponseData cachedResponseData3;
        List<Pair<String, String>> listFlattenEntries;
        int size;
        Iterator<Pair<String, String>> it;
        String str2;
        Iterator<Pair<String, String>> it2;
        CachedResponseData cachedResponseData4;
        ByteChannel byteChannel4;
        String str3;
        CachedResponseData cachedResponseData5;
        ByteChannel byteChannel5;
        long timestamp;
        long timestamp2;
        int size2;
        Iterator<Map.Entry<String, String>> it3;
        String str4;
        Iterator<Map.Entry<String, String>> it4;
        CachedResponseData cachedResponseData6;
        ByteChannel byteChannel6;
        String str5;
        byte[] body;
        if (continuation instanceof C101763) {
            c101763 = (C101763) continuation;
            int i = c101763.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101763.label = i - Integer.MIN_VALUE;
            } else {
                c101763 = new C101763(continuation);
            }
        }
        Object obj = c101763.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c101763.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                StringBuilder sb = new StringBuilder();
                sb.append(cachedResponseData.getUrl());
                sb.append('\n');
                String string2 = sb.toString();
                c101763.L$0 = byteChannel;
                c101763.L$1 = cachedResponseData;
                c101763.label = 1;
                if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel, string2, (Continuation<? super Unit>) c101763) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                value = cachedResponseData.getStatusCode().getValue();
                c101763.L$0 = byteChannel;
                c101763.L$1 = cachedResponseData;
                c101763.label = 2;
                if (byteChannel.writeInt(value, c101763) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                CachedResponseData cachedResponseData7 = cachedResponseData;
                byteChannel2 = byteChannel;
                cachedResponseData2 = cachedResponseData7;
                str = cachedResponseData2.getStatusCode().getDescription() + '\n';
                c101763.L$0 = byteChannel2;
                c101763.L$1 = cachedResponseData2;
                c101763.label = 3;
                if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel2, str, (Continuation<? super Unit>) c101763) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cachedResponseData2.getVersion());
                sb2.append('\n');
                string = sb2.toString();
                c101763.L$0 = byteChannel2;
                c101763.L$1 = cachedResponseData2;
                c101763.label = 4;
                if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel2, string, (Continuation<? super Unit>) c101763) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteChannel3 = byteChannel2;
                cachedResponseData3 = cachedResponseData2;
                listFlattenEntries = StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                size = listFlattenEntries.size();
                c101763.L$0 = byteChannel3;
                c101763.L$1 = cachedResponseData3;
                c101763.L$2 = listFlattenEntries;
                c101763.label = 5;
                if (byteChannel3.writeInt(size, c101763) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it = listFlattenEntries.iterator();
                if (it.hasNext()) {
                    Pair<String, String> next = it.next();
                    String strComponent1 = next.component1();
                    String strComponent2 = next.component2();
                    String str6 = strComponent1 + '\n';
                    c101763.L$0 = byteChannel3;
                    c101763.L$1 = cachedResponseData3;
                    c101763.L$2 = it;
                    c101763.L$3 = strComponent2;
                    c101763.label = 6;
                    if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel3, str6, (Continuation<? super Unit>) c101763) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteChannel4 = byteChannel3;
                    cachedResponseData4 = cachedResponseData3;
                    it2 = it;
                    str2 = strComponent2;
                    str3 = str2 + '\n';
                    c101763.L$0 = byteChannel4;
                    c101763.L$1 = cachedResponseData4;
                    c101763.L$2 = it2;
                    c101763.L$3 = null;
                    c101763.label = 7;
                    if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel4, str3, (Continuation<? super Unit>) c101763) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it = it2;
                    cachedResponseData3 = cachedResponseData4;
                    byteChannel3 = byteChannel4;
                    if (it.hasNext()) {
                        long timestamp3 = cachedResponseData3.getRequestTime().getTimestamp();
                        c101763.L$0 = byteChannel3;
                        c101763.L$1 = cachedResponseData3;
                        c101763.L$2 = null;
                        c101763.label = 8;
                        if (byteChannel3.writeLong(timestamp3, c101763) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        cachedResponseData5 = cachedResponseData3;
                        byteChannel5 = byteChannel3;
                        timestamp = cachedResponseData5.getResponseTime().getTimestamp();
                        c101763.L$0 = byteChannel5;
                        c101763.L$1 = cachedResponseData5;
                        c101763.label = 9;
                        if (byteChannel5.writeLong(timestamp, c101763) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        timestamp2 = cachedResponseData5.getExpires().getTimestamp();
                        c101763.L$0 = byteChannel5;
                        c101763.L$1 = cachedResponseData5;
                        c101763.label = 10;
                        if (byteChannel5.writeLong(timestamp2, c101763) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        size2 = cachedResponseData5.getVaryKeys().size();
                        c101763.L$0 = byteChannel5;
                        c101763.L$1 = cachedResponseData5;
                        c101763.label = 11;
                        if (byteChannel5.writeInt(size2, c101763) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                        if (it3.hasNext()) {
                            Map.Entry<String, String> next2 = it3.next();
                            String key = next2.getKey();
                            String value2 = next2.getValue();
                            String str7 = key + '\n';
                            c101763.L$0 = byteChannel5;
                            c101763.L$1 = cachedResponseData5;
                            c101763.L$2 = it3;
                            c101763.L$3 = value2;
                            c101763.label = 12;
                            if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel5, str7, (Continuation<? super Unit>) c101763) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteChannel6 = byteChannel5;
                            it4 = it3;
                            cachedResponseData6 = cachedResponseData5;
                            str4 = value2;
                            str5 = str4 + '\n';
                            c101763.L$0 = byteChannel6;
                            c101763.L$1 = cachedResponseData6;
                            c101763.L$2 = it4;
                            c101763.L$3 = null;
                            c101763.label = 13;
                            if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel6, str5, (Continuation<? super Unit>) c101763) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it3 = it4;
                            cachedResponseData5 = cachedResponseData6;
                            byteChannel5 = byteChannel6;
                            if (it3.hasNext()) {
                                int length = cachedResponseData5.getBody().length;
                                c101763.L$0 = byteChannel5;
                                c101763.L$1 = cachedResponseData5;
                                c101763.L$2 = null;
                                c101763.label = 14;
                                if (byteChannel5.writeInt(length, c101763) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                body = cachedResponseData5.getBody();
                                c101763.L$0 = null;
                                c101763.L$1 = null;
                                c101763.label = 15;
                                if (ByteWriteChannelKt.writeFully(byteChannel5, body, c101763) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
            case 1:
                cachedResponseData = (CachedResponseData) c101763.L$1;
                byteChannel = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                value = cachedResponseData.getStatusCode().getValue();
                c101763.L$0 = byteChannel;
                c101763.L$1 = cachedResponseData;
                c101763.label = 2;
                if (byteChannel.writeInt(value, c101763) != coroutine_suspended) {
                }
                break;
            case 2:
                cachedResponseData2 = (CachedResponseData) c101763.L$1;
                byteChannel2 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                str = cachedResponseData2.getStatusCode().getDescription() + '\n';
                c101763.L$0 = byteChannel2;
                c101763.L$1 = cachedResponseData2;
                c101763.label = 3;
                if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel2, str, (Continuation<? super Unit>) c101763) == coroutine_suspended) {
                }
                StringBuilder sb22 = new StringBuilder();
                sb22.append(cachedResponseData2.getVersion());
                sb22.append('\n');
                string = sb22.toString();
                c101763.L$0 = byteChannel2;
                c101763.L$1 = cachedResponseData2;
                c101763.label = 4;
                if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel2, string, (Continuation<? super Unit>) c101763) == coroutine_suspended) {
                }
                byteChannel3 = byteChannel2;
                cachedResponseData3 = cachedResponseData2;
                listFlattenEntries = StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                size = listFlattenEntries.size();
                c101763.L$0 = byteChannel3;
                c101763.L$1 = cachedResponseData3;
                c101763.L$2 = listFlattenEntries;
                c101763.label = 5;
                if (byteChannel3.writeInt(size, c101763) == coroutine_suspended) {
                }
                it = listFlattenEntries.iterator();
                if (it.hasNext()) {
                }
                break;
            case 3:
                cachedResponseData2 = (CachedResponseData) c101763.L$1;
                byteChannel2 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                StringBuilder sb222 = new StringBuilder();
                sb222.append(cachedResponseData2.getVersion());
                sb222.append('\n');
                string = sb222.toString();
                c101763.L$0 = byteChannel2;
                c101763.L$1 = cachedResponseData2;
                c101763.label = 4;
                if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel2, string, (Continuation<? super Unit>) c101763) == coroutine_suspended) {
                }
                byteChannel3 = byteChannel2;
                cachedResponseData3 = cachedResponseData2;
                listFlattenEntries = StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                size = listFlattenEntries.size();
                c101763.L$0 = byteChannel3;
                c101763.L$1 = cachedResponseData3;
                c101763.L$2 = listFlattenEntries;
                c101763.label = 5;
                if (byteChannel3.writeInt(size, c101763) == coroutine_suspended) {
                }
                it = listFlattenEntries.iterator();
                if (it.hasNext()) {
                }
                break;
            case 4:
                cachedResponseData2 = (CachedResponseData) c101763.L$1;
                byteChannel2 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                byteChannel3 = byteChannel2;
                cachedResponseData3 = cachedResponseData2;
                listFlattenEntries = StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                size = listFlattenEntries.size();
                c101763.L$0 = byteChannel3;
                c101763.L$1 = cachedResponseData3;
                c101763.L$2 = listFlattenEntries;
                c101763.label = 5;
                if (byteChannel3.writeInt(size, c101763) == coroutine_suspended) {
                }
                it = listFlattenEntries.iterator();
                if (it.hasNext()) {
                }
                break;
            case 5:
                listFlattenEntries = (List) c101763.L$2;
                cachedResponseData3 = (CachedResponseData) c101763.L$1;
                byteChannel3 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                it = listFlattenEntries.iterator();
                if (it.hasNext()) {
                }
                break;
            case 6:
                str2 = (String) c101763.L$3;
                it2 = (Iterator) c101763.L$2;
                cachedResponseData4 = (CachedResponseData) c101763.L$1;
                byteChannel4 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                str3 = str2 + '\n';
                c101763.L$0 = byteChannel4;
                c101763.L$1 = cachedResponseData4;
                c101763.L$2 = it2;
                c101763.L$3 = null;
                c101763.label = 7;
                if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel4, str3, (Continuation<? super Unit>) c101763) != coroutine_suspended) {
                }
                break;
            case 7:
                it = (Iterator) c101763.L$2;
                cachedResponseData3 = (CachedResponseData) c101763.L$1;
                byteChannel3 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                if (it.hasNext()) {
                }
                break;
            case 8:
                cachedResponseData5 = (CachedResponseData) c101763.L$1;
                byteChannel5 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                timestamp = cachedResponseData5.getResponseTime().getTimestamp();
                c101763.L$0 = byteChannel5;
                c101763.L$1 = cachedResponseData5;
                c101763.label = 9;
                if (byteChannel5.writeLong(timestamp, c101763) == coroutine_suspended) {
                }
                timestamp2 = cachedResponseData5.getExpires().getTimestamp();
                c101763.L$0 = byteChannel5;
                c101763.L$1 = cachedResponseData5;
                c101763.label = 10;
                if (byteChannel5.writeLong(timestamp2, c101763) == coroutine_suspended) {
                }
                size2 = cachedResponseData5.getVaryKeys().size();
                c101763.L$0 = byteChannel5;
                c101763.L$1 = cachedResponseData5;
                c101763.label = 11;
                if (byteChannel5.writeInt(size2, c101763) == coroutine_suspended) {
                }
                it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                if (it3.hasNext()) {
                }
                break;
            case 9:
                cachedResponseData5 = (CachedResponseData) c101763.L$1;
                byteChannel5 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                timestamp2 = cachedResponseData5.getExpires().getTimestamp();
                c101763.L$0 = byteChannel5;
                c101763.L$1 = cachedResponseData5;
                c101763.label = 10;
                if (byteChannel5.writeLong(timestamp2, c101763) == coroutine_suspended) {
                }
                size2 = cachedResponseData5.getVaryKeys().size();
                c101763.L$0 = byteChannel5;
                c101763.L$1 = cachedResponseData5;
                c101763.label = 11;
                if (byteChannel5.writeInt(size2, c101763) == coroutine_suspended) {
                }
                it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                if (it3.hasNext()) {
                }
                break;
            case 10:
                cachedResponseData5 = (CachedResponseData) c101763.L$1;
                byteChannel5 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                size2 = cachedResponseData5.getVaryKeys().size();
                c101763.L$0 = byteChannel5;
                c101763.L$1 = cachedResponseData5;
                c101763.label = 11;
                if (byteChannel5.writeInt(size2, c101763) == coroutine_suspended) {
                }
                it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                if (it3.hasNext()) {
                }
                break;
            case 11:
                cachedResponseData5 = (CachedResponseData) c101763.L$1;
                byteChannel5 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                if (it3.hasNext()) {
                }
                break;
            case 12:
                str4 = (String) c101763.L$3;
                it4 = (Iterator) c101763.L$2;
                cachedResponseData6 = (CachedResponseData) c101763.L$1;
                byteChannel6 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                str5 = str4 + '\n';
                c101763.L$0 = byteChannel6;
                c101763.L$1 = cachedResponseData6;
                c101763.L$2 = it4;
                c101763.L$3 = null;
                c101763.label = 13;
                if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel6, str5, (Continuation<? super Unit>) c101763) != coroutine_suspended) {
                }
                break;
            case 13:
                Iterator<Map.Entry<String, String>> it5 = (Iterator) c101763.L$2;
                CachedResponseData cachedResponseData8 = (CachedResponseData) c101763.L$1;
                ByteChannel byteChannel7 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                it3 = it5;
                cachedResponseData5 = cachedResponseData8;
                byteChannel5 = byteChannel7;
                if (it3.hasNext()) {
                }
                break;
            case 14:
                cachedResponseData5 = (CachedResponseData) c101763.L$1;
                byteChannel5 = (ByteChannel) c101763.L$0;
                ResultKt.throwOnFailure(obj);
                body = cachedResponseData5.getBody();
                c101763.L$0 = null;
                c101763.L$1 = null;
                c101763.label = 15;
                if (ByteWriteChannelKt.writeFully(byteChannel5, body, c101763) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 15:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x025c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0278 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0309 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0355 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0374 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x039d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x040b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0483 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0484  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0307 -> B:22:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x040c -> B:15:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readCache(ByteReadChannel byteReadChannel, Continuation<? super CachedResponseData> continuation) throws Throwable {
        C101733 c101733;
        Object obj;
        ByteReadChannel byteReadChannel2;
        String str;
        int iIntValue;
        HttpProtocolVersion.Companion companion;
        String str2;
        HttpStatusCode httpStatusCode;
        ByteReadChannel byteReadChannel3;
        HttpProtocolVersion httpProtocolVersion;
        int iIntValue2;
        HeadersBuilder headersBuilder;
        Object obj2;
        int i;
        int i2;
        int i3;
        ByteReadChannel byteReadChannel4;
        String str3;
        HttpStatusCode httpStatusCode2;
        HttpProtocolVersion httpProtocolVersion2;
        HeadersBuilder headersBuilder2;
        String str4;
        ByteReadChannel byteReadChannel5;
        HttpStatusCode httpStatusCode3;
        HeadersBuilder headersBuilder3;
        String str5;
        HttpProtocolVersion httpProtocolVersion3;
        GMTDate GMTDate;
        Object obj3;
        ByteReadChannel byteReadChannel6;
        HttpStatusCode httpStatusCode4;
        HeadersBuilder headersBuilder4;
        GMTDate gMTDate;
        String str6;
        HttpProtocolVersion httpProtocolVersion4;
        GMTDate gMTDate2;
        GMTDate GMTDate2;
        int iIntValue3;
        Map mapCreateMapBuilder;
        Map map;
        int i4;
        ByteReadChannel byteReadChannel7;
        HttpProtocolVersion httpProtocolVersion5;
        GMTDate gMTDate3;
        Map map2;
        Map map3;
        String str7;
        HeadersBuilder headersBuilder5;
        GMTDate gMTDate4;
        HttpStatusCode httpStatusCode5;
        GMTDate gMTDate5;
        String str8;
        C101733 c1017332;
        Map map4;
        Map map5;
        ByteReadChannel byteReadChannel8;
        int i5;
        GMTDate gMTDate6;
        Map map6;
        GMTDate gMTDate7;
        byte[] bArr;
        Map map7;
        byte[] bArr2;
        GMTDate gMTDate8;
        GMTDate gMTDate9;
        GMTDate gMTDate10;
        HttpProtocolVersion httpProtocolVersion6;
        HttpStatusCode httpStatusCode6;
        String str9;
        ByteReadChannel byteReadChannel9 = byteReadChannel;
        if (continuation instanceof C101733) {
            c101733 = (C101733) continuation;
            int i6 = c101733.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c101733.label = i6 - Integer.MIN_VALUE;
            } else {
                c101733 = new C101733(continuation);
            }
        }
        Object uTF8Line = c101733.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = 0;
        switch (c101733.label) {
            case 0:
                ResultKt.throwOnFailure(uTF8Line);
                c101733.L$0 = byteReadChannel9;
                c101733.label = 1;
                uTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel9, c101733);
                if (uTF8Line == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Intrinsics.checkNotNull(uTF8Line);
                String str10 = (String) uTF8Line;
                c101733.L$0 = byteReadChannel9;
                c101733.L$1 = str10;
                c101733.label = 2;
                obj = byteReadChannel9.readInt(c101733);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteReadChannel2 = byteReadChannel9;
                str = str10;
                uTF8Line = obj;
                iIntValue = ((Number) uTF8Line).intValue();
                c101733.L$0 = byteReadChannel2;
                c101733.L$1 = str;
                c101733.I$0 = iIntValue;
                c101733.label = 3;
                uTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel2, c101733);
                if (uTF8Line == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Intrinsics.checkNotNull(uTF8Line);
                HttpStatusCode httpStatusCode7 = new HttpStatusCode(iIntValue, (String) uTF8Line);
                companion = HttpProtocolVersion.INSTANCE;
                c101733.L$0 = byteReadChannel2;
                c101733.L$1 = str;
                c101733.L$2 = httpStatusCode7;
                c101733.L$3 = companion;
                c101733.label = 4;
                uTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel2, c101733);
                if (uTF8Line == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ByteReadChannel byteReadChannel10 = byteReadChannel2;
                str2 = str;
                httpStatusCode = httpStatusCode7;
                byteReadChannel3 = byteReadChannel10;
                Intrinsics.checkNotNull(uTF8Line);
                httpProtocolVersion = companion.parse((CharSequence) uTF8Line);
                c101733.L$0 = byteReadChannel3;
                c101733.L$1 = str2;
                c101733.L$2 = httpStatusCode;
                c101733.L$3 = httpProtocolVersion;
                c101733.label = 5;
                uTF8Line = byteReadChannel3.readInt(c101733);
                if (uTF8Line == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iIntValue2 = ((Number) uTF8Line).intValue();
                obj2 = null;
                headersBuilder = new HeadersBuilder(0, 1, null);
                i = 0;
                if (i >= iIntValue2) {
                    c101733.L$0 = byteReadChannel3;
                    c101733.L$1 = str2;
                    c101733.L$2 = httpStatusCode;
                    c101733.L$3 = httpProtocolVersion;
                    c101733.L$4 = headersBuilder;
                    c101733.L$5 = obj2;
                    c101733.I$0 = iIntValue2;
                    c101733.I$1 = i;
                    c101733.label = 6;
                    Object uTF8Line2 = ByteReadChannelKt.readUTF8Line(byteReadChannel3, c101733);
                    if (uTF8Line2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteReadChannel4 = byteReadChannel3;
                    headersBuilder2 = headersBuilder;
                    httpProtocolVersion2 = httpProtocolVersion;
                    i2 = i;
                    httpStatusCode2 = httpStatusCode;
                    i3 = iIntValue2;
                    uTF8Line = uTF8Line2;
                    str3 = str2;
                    Intrinsics.checkNotNull(uTF8Line);
                    str4 = (String) uTF8Line;
                    c101733.L$0 = byteReadChannel4;
                    c101733.L$1 = str3;
                    c101733.L$2 = httpStatusCode2;
                    c101733.L$3 = httpProtocolVersion2;
                    c101733.L$4 = headersBuilder2;
                    c101733.L$5 = str4;
                    c101733.I$0 = i3;
                    c101733.I$1 = i2;
                    c101733.label = 7;
                    uTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel4, c101733);
                    if (uTF8Line == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ByteReadChannel byteReadChannel11 = byteReadChannel4;
                    HeadersBuilder headersBuilder6 = headersBuilder2;
                    byteReadChannel3 = byteReadChannel11;
                    Intrinsics.checkNotNull(uTF8Line);
                    headersBuilder6.append(str4, (String) uTF8Line);
                    iIntValue2 = i3;
                    httpStatusCode = httpStatusCode2;
                    str2 = str3;
                    obj2 = null;
                    i = i2 + 1;
                    httpProtocolVersion = httpProtocolVersion2;
                    headersBuilder = headersBuilder6;
                    if (i >= iIntValue2) {
                        c101733.L$0 = byteReadChannel3;
                        c101733.L$1 = str2;
                        c101733.L$2 = httpStatusCode;
                        c101733.L$3 = httpProtocolVersion;
                        c101733.L$4 = headersBuilder;
                        c101733.L$5 = null;
                        c101733.label = 8;
                        uTF8Line = byteReadChannel3.readLong(c101733);
                        if (uTF8Line == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel5 = byteReadChannel3;
                        httpStatusCode3 = httpStatusCode;
                        headersBuilder3 = headersBuilder;
                        str5 = str2;
                        httpProtocolVersion3 = httpProtocolVersion;
                        GMTDate = DateJvmKt.GMTDate((Long) uTF8Line);
                        c101733.L$0 = byteReadChannel5;
                        c101733.L$1 = str5;
                        c101733.L$2 = httpStatusCode3;
                        c101733.L$3 = httpProtocolVersion3;
                        c101733.L$4 = headersBuilder3;
                        c101733.L$5 = GMTDate;
                        c101733.label = 9;
                        uTF8Line = byteReadChannel5.readLong(c101733);
                        if (uTF8Line == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        GMTDate GMTDate3 = DateJvmKt.GMTDate((Long) uTF8Line);
                        c101733.L$0 = byteReadChannel5;
                        c101733.L$1 = str5;
                        c101733.L$2 = httpStatusCode3;
                        c101733.L$3 = httpProtocolVersion3;
                        c101733.L$4 = headersBuilder3;
                        c101733.L$5 = GMTDate;
                        c101733.L$6 = GMTDate3;
                        c101733.label = 10;
                        obj3 = byteReadChannel5.readLong(c101733);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel6 = byteReadChannel5;
                        httpStatusCode4 = httpStatusCode3;
                        headersBuilder4 = headersBuilder3;
                        gMTDate = GMTDate3;
                        uTF8Line = obj3;
                        str6 = str5;
                        httpProtocolVersion4 = httpProtocolVersion3;
                        gMTDate2 = GMTDate;
                        GMTDate2 = DateJvmKt.GMTDate((Long) uTF8Line);
                        c101733.L$0 = byteReadChannel6;
                        c101733.L$1 = str6;
                        c101733.L$2 = httpStatusCode4;
                        c101733.L$3 = httpProtocolVersion4;
                        c101733.L$4 = headersBuilder4;
                        c101733.L$5 = gMTDate2;
                        c101733.L$6 = gMTDate;
                        c101733.L$7 = GMTDate2;
                        c101733.label = 11;
                        uTF8Line = byteReadChannel6.readInt(c101733);
                        if (uTF8Line == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        iIntValue3 = ((Number) uTF8Line).intValue();
                        mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
                        map = mapCreateMapBuilder;
                        if (i7 < iIntValue3) {
                            c101733.L$0 = byteReadChannel6;
                            c101733.L$1 = str6;
                            c101733.L$2 = httpStatusCode4;
                            c101733.L$3 = httpProtocolVersion4;
                            c101733.L$4 = headersBuilder4;
                            c101733.L$5 = gMTDate2;
                            c101733.L$6 = gMTDate;
                            c101733.L$7 = GMTDate2;
                            c101733.L$8 = mapCreateMapBuilder;
                            c101733.L$9 = map;
                            c101733.L$10 = null;
                            c101733.I$0 = iIntValue3;
                            c101733.I$1 = i7;
                            c101733.label = 12;
                            Object uTF8Line3 = ByteReadChannelKt.readUTF8Line(byteReadChannel6, c101733);
                            if (uTF8Line3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            String str11 = str6;
                            gMTDate4 = GMTDate2;
                            byteReadChannel7 = byteReadChannel6;
                            gMTDate3 = gMTDate;
                            i4 = iIntValue3;
                            uTF8Line = uTF8Line3;
                            httpProtocolVersion5 = httpProtocolVersion4;
                            map2 = map;
                            headersBuilder5 = headersBuilder4;
                            httpStatusCode5 = httpStatusCode4;
                            map3 = mapCreateMapBuilder;
                            gMTDate5 = gMTDate2;
                            str7 = str11;
                            Intrinsics.checkNotNull(uTF8Line);
                            String str12 = (String) uTF8Line;
                            c101733.L$0 = byteReadChannel7;
                            c101733.L$1 = str7;
                            c101733.L$2 = httpStatusCode5;
                            c101733.L$3 = httpProtocolVersion5;
                            c101733.L$4 = headersBuilder5;
                            c101733.L$5 = gMTDate5;
                            c101733.L$6 = gMTDate3;
                            c101733.L$7 = gMTDate4;
                            c101733.L$8 = map3;
                            c101733.L$9 = map2;
                            c101733.L$10 = str12;
                            c101733.I$0 = i4;
                            c101733.I$1 = i7;
                            c101733.label = 13;
                            uTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel7, c101733);
                            if (uTF8Line != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            int i8 = i7;
                            str8 = str12;
                            c1017332 = c101733;
                            map4 = map2;
                            httpProtocolVersion4 = httpProtocolVersion5;
                            map5 = map3;
                            httpStatusCode4 = httpStatusCode5;
                            headersBuilder4 = headersBuilder5;
                            byteReadChannel8 = byteReadChannel7;
                            i5 = i8;
                            GMTDate gMTDate11 = gMTDate5;
                            String str13 = str7;
                            gMTDate2 = gMTDate11;
                            Intrinsics.checkNotNull(uTF8Line);
                            map4.put(str8, (String) uTF8Line);
                            i7 = i5 + 1;
                            iIntValue3 = i4;
                            GMTDate2 = gMTDate4;
                            gMTDate = gMTDate3;
                            str6 = str13;
                            byteReadChannel6 = byteReadChannel8;
                            mapCreateMapBuilder = map5;
                            map = map4;
                            c101733 = c1017332;
                            if (i7 < iIntValue3) {
                                Map mapBuild = MapsKt__MapsJVMKt.build(mapCreateMapBuilder);
                                c101733.L$0 = byteReadChannel6;
                                c101733.L$1 = str6;
                                c101733.L$2 = httpStatusCode4;
                                c101733.L$3 = httpProtocolVersion4;
                                c101733.L$4 = headersBuilder4;
                                c101733.L$5 = gMTDate2;
                                c101733.L$6 = gMTDate;
                                c101733.L$7 = GMTDate2;
                                c101733.L$8 = mapBuild;
                                c101733.L$9 = null;
                                c101733.L$10 = null;
                                c101733.label = 14;
                                Object obj4 = byteReadChannel6.readInt(c101733);
                                if (obj4 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                GMTDate gMTDate12 = gMTDate;
                                gMTDate6 = GMTDate2;
                                map6 = mapBuild;
                                uTF8Line = obj4;
                                gMTDate7 = gMTDate12;
                                bArr = new byte[((Number) uTF8Line).intValue()];
                                c101733.L$0 = str6;
                                c101733.L$1 = httpStatusCode4;
                                c101733.L$2 = httpProtocolVersion4;
                                c101733.L$3 = headersBuilder4;
                                c101733.L$4 = gMTDate2;
                                c101733.L$5 = gMTDate7;
                                c101733.L$6 = gMTDate6;
                                c101733.L$7 = map6;
                                c101733.L$8 = bArr;
                                c101733.label = 15;
                                if (ByteReadChannelKt.readFully(byteReadChannel6, bArr, c101733) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                map7 = map6;
                                bArr2 = bArr;
                                gMTDate8 = gMTDate6;
                                gMTDate9 = gMTDate7;
                                gMTDate10 = gMTDate2;
                                httpProtocolVersion6 = httpProtocolVersion4;
                                httpStatusCode6 = httpStatusCode4;
                                str9 = str6;
                                return new CachedResponseData(URLUtilsKt.Url(str9), httpStatusCode6, gMTDate10, gMTDate9, httpProtocolVersion6, gMTDate8, headersBuilder4.build(), map7, bArr2);
                            }
                        }
                    }
                }
            case 1:
                byteReadChannel9 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                Intrinsics.checkNotNull(uTF8Line);
                String str102 = (String) uTF8Line;
                c101733.L$0 = byteReadChannel9;
                c101733.L$1 = str102;
                c101733.label = 2;
                obj = byteReadChannel9.readInt(c101733);
                if (obj != coroutine_suspended) {
                }
                break;
            case 2:
                String str14 = (String) c101733.L$1;
                ByteReadChannel byteReadChannel12 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                byteReadChannel2 = byteReadChannel12;
                str = str14;
                iIntValue = ((Number) uTF8Line).intValue();
                c101733.L$0 = byteReadChannel2;
                c101733.L$1 = str;
                c101733.I$0 = iIntValue;
                c101733.label = 3;
                uTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel2, c101733);
                if (uTF8Line == coroutine_suspended) {
                }
                Intrinsics.checkNotNull(uTF8Line);
                HttpStatusCode httpStatusCode72 = new HttpStatusCode(iIntValue, (String) uTF8Line);
                companion = HttpProtocolVersion.INSTANCE;
                c101733.L$0 = byteReadChannel2;
                c101733.L$1 = str;
                c101733.L$2 = httpStatusCode72;
                c101733.L$3 = companion;
                c101733.label = 4;
                uTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel2, c101733);
                if (uTF8Line == coroutine_suspended) {
                }
                break;
            case 3:
                iIntValue = c101733.I$0;
                str = (String) c101733.L$1;
                byteReadChannel2 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                Intrinsics.checkNotNull(uTF8Line);
                HttpStatusCode httpStatusCode722 = new HttpStatusCode(iIntValue, (String) uTF8Line);
                companion = HttpProtocolVersion.INSTANCE;
                c101733.L$0 = byteReadChannel2;
                c101733.L$1 = str;
                c101733.L$2 = httpStatusCode722;
                c101733.L$3 = companion;
                c101733.label = 4;
                uTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel2, c101733);
                if (uTF8Line == coroutine_suspended) {
                }
                break;
            case 4:
                companion = (HttpProtocolVersion.Companion) c101733.L$3;
                httpStatusCode = (HttpStatusCode) c101733.L$2;
                str2 = (String) c101733.L$1;
                byteReadChannel3 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                Intrinsics.checkNotNull(uTF8Line);
                httpProtocolVersion = companion.parse((CharSequence) uTF8Line);
                c101733.L$0 = byteReadChannel3;
                c101733.L$1 = str2;
                c101733.L$2 = httpStatusCode;
                c101733.L$3 = httpProtocolVersion;
                c101733.label = 5;
                uTF8Line = byteReadChannel3.readInt(c101733);
                if (uTF8Line == coroutine_suspended) {
                }
                iIntValue2 = ((Number) uTF8Line).intValue();
                obj2 = null;
                headersBuilder = new HeadersBuilder(0, 1, null);
                i = 0;
                if (i >= iIntValue2) {
                }
                break;
            case 5:
                httpProtocolVersion = (HttpProtocolVersion) c101733.L$3;
                httpStatusCode = (HttpStatusCode) c101733.L$2;
                str2 = (String) c101733.L$1;
                byteReadChannel3 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                iIntValue2 = ((Number) uTF8Line).intValue();
                obj2 = null;
                headersBuilder = new HeadersBuilder(0, 1, null);
                i = 0;
                if (i >= iIntValue2) {
                }
                break;
            case 6:
                i2 = c101733.I$1;
                i3 = c101733.I$0;
                HeadersBuilder headersBuilder7 = (HeadersBuilder) c101733.L$4;
                HttpProtocolVersion httpProtocolVersion7 = (HttpProtocolVersion) c101733.L$3;
                HttpStatusCode httpStatusCode8 = (HttpStatusCode) c101733.L$2;
                String str15 = (String) c101733.L$1;
                ByteReadChannel byteReadChannel13 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                byteReadChannel4 = byteReadChannel13;
                str3 = str15;
                httpStatusCode2 = httpStatusCode8;
                httpProtocolVersion2 = httpProtocolVersion7;
                headersBuilder2 = headersBuilder7;
                Intrinsics.checkNotNull(uTF8Line);
                str4 = (String) uTF8Line;
                c101733.L$0 = byteReadChannel4;
                c101733.L$1 = str3;
                c101733.L$2 = httpStatusCode2;
                c101733.L$3 = httpProtocolVersion2;
                c101733.L$4 = headersBuilder2;
                c101733.L$5 = str4;
                c101733.I$0 = i3;
                c101733.I$1 = i2;
                c101733.label = 7;
                uTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel4, c101733);
                if (uTF8Line == coroutine_suspended) {
                }
                ByteReadChannel byteReadChannel112 = byteReadChannel4;
                HeadersBuilder headersBuilder62 = headersBuilder2;
                byteReadChannel3 = byteReadChannel112;
                Intrinsics.checkNotNull(uTF8Line);
                headersBuilder62.append(str4, (String) uTF8Line);
                iIntValue2 = i3;
                httpStatusCode = httpStatusCode2;
                str2 = str3;
                obj2 = null;
                i = i2 + 1;
                httpProtocolVersion = httpProtocolVersion2;
                headersBuilder = headersBuilder62;
                if (i >= iIntValue2) {
                }
                break;
            case 7:
                i2 = c101733.I$1;
                i3 = c101733.I$0;
                str4 = (String) c101733.L$5;
                headersBuilder2 = (HeadersBuilder) c101733.L$4;
                httpProtocolVersion2 = (HttpProtocolVersion) c101733.L$3;
                httpStatusCode2 = (HttpStatusCode) c101733.L$2;
                str3 = (String) c101733.L$1;
                byteReadChannel4 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                ByteReadChannel byteReadChannel1122 = byteReadChannel4;
                HeadersBuilder headersBuilder622 = headersBuilder2;
                byteReadChannel3 = byteReadChannel1122;
                Intrinsics.checkNotNull(uTF8Line);
                headersBuilder622.append(str4, (String) uTF8Line);
                iIntValue2 = i3;
                httpStatusCode = httpStatusCode2;
                str2 = str3;
                obj2 = null;
                i = i2 + 1;
                httpProtocolVersion = httpProtocolVersion2;
                headersBuilder = headersBuilder622;
                if (i >= iIntValue2) {
                }
                break;
            case 8:
                HeadersBuilder headersBuilder8 = (HeadersBuilder) c101733.L$4;
                HttpProtocolVersion httpProtocolVersion8 = (HttpProtocolVersion) c101733.L$3;
                HttpStatusCode httpStatusCode9 = (HttpStatusCode) c101733.L$2;
                String str16 = (String) c101733.L$1;
                ByteReadChannel byteReadChannel14 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                byteReadChannel5 = byteReadChannel14;
                str5 = str16;
                httpStatusCode3 = httpStatusCode9;
                httpProtocolVersion3 = httpProtocolVersion8;
                headersBuilder3 = headersBuilder8;
                GMTDate = DateJvmKt.GMTDate((Long) uTF8Line);
                c101733.L$0 = byteReadChannel5;
                c101733.L$1 = str5;
                c101733.L$2 = httpStatusCode3;
                c101733.L$3 = httpProtocolVersion3;
                c101733.L$4 = headersBuilder3;
                c101733.L$5 = GMTDate;
                c101733.label = 9;
                uTF8Line = byteReadChannel5.readLong(c101733);
                if (uTF8Line == coroutine_suspended) {
                }
                GMTDate GMTDate32 = DateJvmKt.GMTDate((Long) uTF8Line);
                c101733.L$0 = byteReadChannel5;
                c101733.L$1 = str5;
                c101733.L$2 = httpStatusCode3;
                c101733.L$3 = httpProtocolVersion3;
                c101733.L$4 = headersBuilder3;
                c101733.L$5 = GMTDate;
                c101733.L$6 = GMTDate32;
                c101733.label = 10;
                obj3 = byteReadChannel5.readLong(c101733);
                if (obj3 == coroutine_suspended) {
                }
                break;
            case 9:
                GMTDate = (GMTDate) c101733.L$5;
                headersBuilder3 = (HeadersBuilder) c101733.L$4;
                httpProtocolVersion3 = (HttpProtocolVersion) c101733.L$3;
                httpStatusCode3 = (HttpStatusCode) c101733.L$2;
                str5 = (String) c101733.L$1;
                byteReadChannel5 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                GMTDate GMTDate322 = DateJvmKt.GMTDate((Long) uTF8Line);
                c101733.L$0 = byteReadChannel5;
                c101733.L$1 = str5;
                c101733.L$2 = httpStatusCode3;
                c101733.L$3 = httpProtocolVersion3;
                c101733.L$4 = headersBuilder3;
                c101733.L$5 = GMTDate;
                c101733.L$6 = GMTDate322;
                c101733.label = 10;
                obj3 = byteReadChannel5.readLong(c101733);
                if (obj3 == coroutine_suspended) {
                }
                break;
            case 10:
                GMTDate gMTDate13 = (GMTDate) c101733.L$6;
                GMTDate gMTDate14 = (GMTDate) c101733.L$5;
                HeadersBuilder headersBuilder9 = (HeadersBuilder) c101733.L$4;
                HttpProtocolVersion httpProtocolVersion9 = (HttpProtocolVersion) c101733.L$3;
                HttpStatusCode httpStatusCode10 = (HttpStatusCode) c101733.L$2;
                String str17 = (String) c101733.L$1;
                ByteReadChannel byteReadChannel15 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                byteReadChannel6 = byteReadChannel15;
                str6 = str17;
                httpStatusCode4 = httpStatusCode10;
                httpProtocolVersion4 = httpProtocolVersion9;
                headersBuilder4 = headersBuilder9;
                gMTDate2 = gMTDate14;
                gMTDate = gMTDate13;
                GMTDate2 = DateJvmKt.GMTDate((Long) uTF8Line);
                c101733.L$0 = byteReadChannel6;
                c101733.L$1 = str6;
                c101733.L$2 = httpStatusCode4;
                c101733.L$3 = httpProtocolVersion4;
                c101733.L$4 = headersBuilder4;
                c101733.L$5 = gMTDate2;
                c101733.L$6 = gMTDate;
                c101733.L$7 = GMTDate2;
                c101733.label = 11;
                uTF8Line = byteReadChannel6.readInt(c101733);
                if (uTF8Line == coroutine_suspended) {
                }
                iIntValue3 = ((Number) uTF8Line).intValue();
                mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
                map = mapCreateMapBuilder;
                if (i7 < iIntValue3) {
                }
                break;
            case 11:
                GMTDate2 = (GMTDate) c101733.L$7;
                gMTDate = (GMTDate) c101733.L$6;
                gMTDate2 = (GMTDate) c101733.L$5;
                headersBuilder4 = (HeadersBuilder) c101733.L$4;
                httpProtocolVersion4 = (HttpProtocolVersion) c101733.L$3;
                httpStatusCode4 = (HttpStatusCode) c101733.L$2;
                str6 = (String) c101733.L$1;
                byteReadChannel6 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                iIntValue3 = ((Number) uTF8Line).intValue();
                mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
                map = mapCreateMapBuilder;
                if (i7 < iIntValue3) {
                }
                break;
            case 12:
                int i9 = c101733.I$1;
                i4 = c101733.I$0;
                Map map8 = (Map) c101733.L$9;
                Map map9 = (Map) c101733.L$8;
                GMTDate gMTDate15 = (GMTDate) c101733.L$7;
                GMTDate gMTDate16 = (GMTDate) c101733.L$6;
                GMTDate gMTDate17 = (GMTDate) c101733.L$5;
                HeadersBuilder headersBuilder10 = (HeadersBuilder) c101733.L$4;
                HttpProtocolVersion httpProtocolVersion10 = (HttpProtocolVersion) c101733.L$3;
                HttpStatusCode httpStatusCode11 = (HttpStatusCode) c101733.L$2;
                String str18 = (String) c101733.L$1;
                ByteReadChannel byteReadChannel16 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                i7 = i9;
                byteReadChannel7 = byteReadChannel16;
                httpProtocolVersion5 = httpProtocolVersion10;
                gMTDate3 = gMTDate16;
                map2 = map8;
                map3 = map9;
                str7 = str18;
                headersBuilder5 = headersBuilder10;
                gMTDate4 = gMTDate15;
                httpStatusCode5 = httpStatusCode11;
                gMTDate5 = gMTDate17;
                Intrinsics.checkNotNull(uTF8Line);
                String str122 = (String) uTF8Line;
                c101733.L$0 = byteReadChannel7;
                c101733.L$1 = str7;
                c101733.L$2 = httpStatusCode5;
                c101733.L$3 = httpProtocolVersion5;
                c101733.L$4 = headersBuilder5;
                c101733.L$5 = gMTDate5;
                c101733.L$6 = gMTDate3;
                c101733.L$7 = gMTDate4;
                c101733.L$8 = map3;
                c101733.L$9 = map2;
                c101733.L$10 = str122;
                c101733.I$0 = i4;
                c101733.I$1 = i7;
                c101733.label = 13;
                uTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel7, c101733);
                if (uTF8Line != coroutine_suspended) {
                }
                break;
            case 13:
                int i10 = c101733.I$1;
                i4 = c101733.I$0;
                str8 = (String) c101733.L$10;
                Map map10 = (Map) c101733.L$9;
                Map map11 = (Map) c101733.L$8;
                gMTDate4 = (GMTDate) c101733.L$7;
                gMTDate3 = (GMTDate) c101733.L$6;
                gMTDate5 = (GMTDate) c101733.L$5;
                HeadersBuilder headersBuilder11 = (HeadersBuilder) c101733.L$4;
                HttpProtocolVersion httpProtocolVersion11 = (HttpProtocolVersion) c101733.L$3;
                HttpStatusCode httpStatusCode12 = (HttpStatusCode) c101733.L$2;
                str7 = (String) c101733.L$1;
                ByteReadChannel byteReadChannel17 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                i5 = i10;
                c1017332 = c101733;
                map4 = map10;
                httpProtocolVersion4 = httpProtocolVersion11;
                map5 = map11;
                httpStatusCode4 = httpStatusCode12;
                headersBuilder4 = headersBuilder11;
                byteReadChannel8 = byteReadChannel17;
                GMTDate gMTDate112 = gMTDate5;
                String str132 = str7;
                gMTDate2 = gMTDate112;
                Intrinsics.checkNotNull(uTF8Line);
                map4.put(str8, (String) uTF8Line);
                i7 = i5 + 1;
                iIntValue3 = i4;
                GMTDate2 = gMTDate4;
                gMTDate = gMTDate3;
                str6 = str132;
                byteReadChannel6 = byteReadChannel8;
                mapCreateMapBuilder = map5;
                map = map4;
                c101733 = c1017332;
                if (i7 < iIntValue3) {
                }
                break;
            case 14:
                map6 = (Map) c101733.L$8;
                gMTDate6 = (GMTDate) c101733.L$7;
                gMTDate7 = (GMTDate) c101733.L$6;
                gMTDate2 = (GMTDate) c101733.L$5;
                headersBuilder4 = (HeadersBuilder) c101733.L$4;
                httpProtocolVersion4 = (HttpProtocolVersion) c101733.L$3;
                httpStatusCode4 = (HttpStatusCode) c101733.L$2;
                str6 = (String) c101733.L$1;
                byteReadChannel6 = (ByteReadChannel) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                bArr = new byte[((Number) uTF8Line).intValue()];
                c101733.L$0 = str6;
                c101733.L$1 = httpStatusCode4;
                c101733.L$2 = httpProtocolVersion4;
                c101733.L$3 = headersBuilder4;
                c101733.L$4 = gMTDate2;
                c101733.L$5 = gMTDate7;
                c101733.L$6 = gMTDate6;
                c101733.L$7 = map6;
                c101733.L$8 = bArr;
                c101733.label = 15;
                if (ByteReadChannelKt.readFully(byteReadChannel6, bArr, c101733) != coroutine_suspended) {
                }
                break;
            case 15:
                byte[] bArr3 = (byte[]) c101733.L$8;
                Map map12 = (Map) c101733.L$7;
                GMTDate gMTDate18 = (GMTDate) c101733.L$6;
                GMTDate gMTDate19 = (GMTDate) c101733.L$5;
                GMTDate gMTDate20 = (GMTDate) c101733.L$4;
                headersBuilder4 = (HeadersBuilder) c101733.L$3;
                HttpProtocolVersion httpProtocolVersion12 = (HttpProtocolVersion) c101733.L$2;
                HttpStatusCode httpStatusCode13 = (HttpStatusCode) c101733.L$1;
                str9 = (String) c101733.L$0;
                ResultKt.throwOnFailure(uTF8Line);
                bArr2 = bArr3;
                map7 = map12;
                gMTDate8 = gMTDate18;
                gMTDate9 = gMTDate19;
                gMTDate10 = gMTDate20;
                httpProtocolVersion6 = httpProtocolVersion12;
                httpStatusCode6 = httpStatusCode13;
                return new CachedResponseData(URLUtilsKt.Url(str9), httpStatusCode6, gMTDate10, gMTDate9, httpProtocolVersion6, gMTDate8, headersBuilder4.build(), map7, bArr2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
