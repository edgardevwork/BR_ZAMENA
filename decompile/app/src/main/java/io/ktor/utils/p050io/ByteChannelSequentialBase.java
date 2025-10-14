package io.ktor.utils.p050io;

import androidx.concurrent.futures.C2081xc40028dd;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.GpsStatusWrapper;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassUtils;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p050io.core.Buffer;
import io.ktor.utils.p050io.core.BuffersKt;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.InputArraysKt;
import io.ktor.utils.p050io.core.InputPrimitivesKt;
import io.ktor.utils.p050io.core.Output;
import io.ktor.utils.p050io.core.OutputKt;
import io.ktor.utils.p050io.core.OutputPrimitivesKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.UTF8Kt;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import io.ktor.utils.p050io.internal.AwaitingSlot;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteChannelSequential.kt */
@Metadata(m7104d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b&\u0018\u00002\u00030Ö\u00012\u00030×\u00012\u00030Ø\u00012\u00020{2\u00030Ù\u00012\u00030Ú\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0010\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u0013\u0010\u0018\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0084@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b*\u0010$J\u000f\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J\u001b\u0010.\u001a\u0002002\u0006\u00101\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u00102J#\u00104\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000200H\u0082@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000bH\u0016¢\u0006\u0004\b6\u0010,J\u0017\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u0010\rJ\u000f\u00109\u001a\u00020\u000bH\u0002¢\u0006\u0004\b9\u0010,J\u000f\u0010:\u001a\u00020\u000bH\u0002¢\u0006\u0004\b:\u0010,J\u0017\u0010:\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000bH\u0016¢\u0006\u0004\b<\u0010,J\u000f\u0010=\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000bH\u0002¢\u0006\u0004\b?\u0010,JA\u0010G\u001a\u0002002\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u0002002\u0006\u0010C\u001a\u0002002\u0006\u0010D\u001a\u0002002\u0006\u00101\u001a\u000200H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020\u000bH\u0004¢\u0006\u0004\bH\u0010,J\u001b\u0010M\u001a\u00020\t2\u0006\u0010J\u001a\u00020IH\u0080@ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0001H\u0096@ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ+\u0010M\u001a\u00020\t2\u0006\u0010J\u001a\u00020O2\u0006\u0010C\u001a\u00020\t2\u0006\u0010P\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\bM\u0010QJ\u000f\u0010R\u001a\u00020\tH\u0004¢\u0006\u0004\bR\u0010SJ\u0013\u0010T\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\bT\u0010\u0019J\u0013\u0010U\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\bU\u0010\u0019J\u0013\u0010W\u001a\u00020VH\u0096@ø\u0001\u0000¢\u0006\u0004\bW\u0010\u0019J\u0013\u0010X\u001a\u00020VH\u0082@ø\u0001\u0000¢\u0006\u0004\bX\u0010\u0019J\u0013\u0010Z\u001a\u00020YH\u0096@ø\u0001\u0000¢\u0006\u0004\bZ\u0010\u0019J\u0013\u0010[\u001a\u00020YH\u0082@ø\u0001\u0000¢\u0006\u0004\b[\u0010\u0019J\u0013\u0010]\u001a\u00020\\H\u0096@ø\u0001\u0000¢\u0006\u0004\b]\u0010\u0019J\u0013\u0010^\u001a\u00020\\H\u0082@ø\u0001\u0000¢\u0006\u0004\b^\u0010\u0019J#\u0010_\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020I2\u0006\u0010-\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b_\u0010`J#\u0010_\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b_\u0010aJ+\u0010_\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020O2\u0006\u0010C\u001a\u00020\t2\u0006\u0010P\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b_\u0010QJ#\u0010b\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020I2\u0006\u0010-\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\bb\u0010`J+\u0010b\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020O2\u0006\u0010C\u001a\u00020\t2\u0006\u0010P\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\bb\u0010QJ\u0013\u0010c\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\bc\u0010\u0019J\u0013\u0010d\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\bd\u0010\u0019J\u0013\u0010e\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0004\be\u0010\u0019J\u0013\u0010f\u001a\u000200H\u0082@ø\u0001\u0000¢\u0006\u0004\bf\u0010\u0019J\u001b\u0010i\u001a\u00020h2\u0006\u0010g\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\bi\u0010\u0013J#\u0010k\u001a\u00020h2\u0006\u0010j\u001a\u00020&2\u0006\u0010g\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\bk\u0010lJ\u001b\u0010n\u001a\u00020h2\u0006\u0010m\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0004\bn\u00102J#\u0010o\u001a\u00020h2\u0006\u0010j\u001a\u00020&2\u0006\u0010m\u001a\u000200H\u0082@ø\u0001\u0000¢\u0006\u0004\bo\u0010pJ(\u0010u\u001a\u00020\u000b2\u0017\u0010t\u001a\u0013\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\u000b0q¢\u0006\u0002\bsH\u0017¢\u0006\u0004\bu\u0010vJ\u0013\u0010x\u001a\u00020wH\u0096@ø\u0001\u0000¢\u0006\u0004\bx\u0010\u0019J\u0013\u0010y\u001a\u00020wH\u0082@ø\u0001\u0000¢\u0006\u0004\by\u0010\u0019J<\u0010~\u001a\u00020\u000b2'\u0010t\u001a#\b\u0001\u0012\u0004\u0012\u00020{\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0|\u0012\u0006\u0012\u0004\u0018\u00010}0z¢\u0006\u0002\bsH\u0097@ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ \u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00012\u0006\u0010m\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0081\u0001\u0010\u0013J8\u0010\u0086\u0001\u001a\u00020\u0003\"\u000f\b\u0000\u0010\u0084\u0001*\b0\u0082\u0001j\u0003`\u0083\u00012\u0007\u0010\u0085\u0001\u001a\u00028\u00002\u0006\u0010m\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u0089\u0001J\u0012\u0010\u008b\u0001\u001a\u00020{H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\"\u0010\u008f\u0001\u001a\u0002002\u0006\u0010J\u001a\u00020\u00002\u0006\u0010m\u001a\u000200H\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001e\u0010\u0091\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\u0001H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0091\u0001\u0010NJ.\u0010\u0091\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020O2\u0006\u0010C\u001a\u00020\t2\u0006\u0010P\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0091\u0001\u0010QJ\u001e\u0010\u0092\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0005\b\u0092\u0001\u0010NJ.\u0010\u0092\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020O2\u0006\u0010C\u001a\u00020\t2\u0006\u0010P\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0005\b\u0092\u0001\u0010QJ\u001f\u0010\u0094\u0001\u001a\u00020\u000b2\u0007\u0010\u0093\u0001\u001a\u00020VH\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001f\u0010\u0097\u0001\u001a\u00020\u000b2\u0007\u0010\u0096\u0001\u001a\u00020YH\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001f\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u0099\u0001\u001a\u00020\\H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J7\u0010¡\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020@2\u0007\u0010\u009d\u0001\u001a\u00020\t2\u0007\u0010\u009e\u0001\u001a\u00020\tH\u0096@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001e\u0010¡\u0001\u001a\u00020\u000b2\u0007\u0010\u0090\u0001\u001a\u00020IH\u0096@ø\u0001\u0000¢\u0006\u0005\b¡\u0001\u0010LJ.\u0010¡\u0001\u001a\u00020\u000b2\u0007\u0010\u0090\u0001\u001a\u00020O2\u0006\u0010C\u001a\u00020\t2\u0006\u0010P\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0005\b¡\u0001\u0010QJ\u001e\u0010£\u0001\u001a\u00020\u000b2\u0007\u0010¢\u0001\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0005\b£\u0001\u0010\u0013J\u001e\u0010¥\u0001\u001a\u00020\u000b2\u0007\u0010¤\u0001\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0005\b¥\u0001\u00102J\u001f\u0010§\u0001\u001a\u00020\u000b2\u0007\u0010¦\u0001\u001a\u00020hH\u0096@ø\u0001\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001f\u0010ª\u0001\u001a\u00020\u000b2\u0007\u0010©\u0001\u001a\u00020wH\u0096@ø\u0001\u0000¢\u0006\u0006\bª\u0001\u0010«\u0001J?\u0010\u00ad\u0001\u001a\u00020\u000b2(\u0010¬\u0001\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0|\u0012\u0006\u0012\u0004\u0018\u00010}0z¢\u0006\u0002\bsH\u0097@ø\u0001\u0000¢\u0006\u0005\b\u00ad\u0001\u0010\u007fR\u001c\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0004\u0010®\u0001\u001a\u0005\b¯\u0001\u0010>R\u0016\u0010±\u0001\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010SR\u0016\u0010³\u0001\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010SR)\u0010¸\u0001\u001a\u00020\u00032\u0007\u0010´\u0001\u001a\u00020\u00038D@DX\u0084\u000e¢\u0006\u000f\u001a\u0005\bµ\u0001\u0010>\"\u0006\b¶\u0001\u0010·\u0001R.\u0010½\u0001\u001a\u0004\u0018\u00010!2\t\u0010´\u0001\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u0017\u0010¾\u0001\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001c\u0010Á\u0001\u001a\u00070}j\u0003`À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0016\u0010Ã\u0001\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010>R\u0016\u0010Ä\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010>R\u0016\u0010Å\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010>R\u001f\u0010Æ\u0001\u001a\u00020h8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Ë\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0017\u0010Ï\u0001\u001a\u0002008VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0017\u0010Ñ\u0001\u001a\u0002008VX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Î\u0001R\u001f\u0010Ò\u0001\u001a\u00020&8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bÒ\u0001\u0010¿\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006Õ\u0001"}, m7105d2 = {"Lio/ktor/utils/io/ByteChannelSequentialBase;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "initial", "", "autoFlush", "Lio/ktor/utils/io/pool/ObjectPool;", "pool", SegmentConstantPool.INITSTRING, "(Lio/ktor/utils/io/core/internal/ChunkBuffer;ZLio/ktor/utils/io/pool/ObjectPool;)V", "", CatchStreamerKeys.COUNT_KEY, "", "addBytesRead", "(I)V", "addBytesWritten", "afterRead", "afterWrite", "atLeast", "await", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitAtLeastNBytesAvailableForRead$ktor_io", "awaitAtLeastNBytesAvailableForRead", "awaitAtLeastNBytesAvailableForWrite$ktor_io", "awaitAtLeastNBytesAvailableForWrite", "awaitContent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFreeSpace", "awaitInternalAtLeast1$ktor_io", "awaitInternalAtLeast1", "awaitSuspend", "Lio/ktor/utils/io/WriterSuspendSession;", "beginWriteSession", "()Lio/ktor/utils/io/WriterSuspendSession;", "", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "remaining", "Lio/ktor/utils/io/core/BytePacketBuilder;", "closeable", "checkClosed", "(ILio/ktor/utils/io/core/BytePacketBuilder;)V", "close", "completeReading", "()V", "n", ClientCookie.DISCARD_ATTR, "(I)I", "", "max", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discarded0", "discardSuspend", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endReadSession", "written", "endWriteSession", "ensureNotClosed", "ensureNotFailed", "(Lio/ktor/utils/io/core/BytePacketBuilder;)V", "flush", "flushImpl", "()Z", "flushWrittenBytes", "Lio/ktor/utils/io/bits/Memory;", FirebaseAnalytics.Param.DESTINATION, "destinationOffset", TypedValues.CycleType.S_WAVE_OFFSET, "min", "peekTo-lBXzO7A", "(Ljava/nio/ByteBuffer;JJJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "peekTo", "prepareFlushedBytes", "Lio/ktor/utils/io/core/Buffer;", "dst", "readAvailable$ktor_io", "(Lio/ktor/utils/io/core/Buffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAvailable", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", CacheFileMetadataIndex.COLUMN_LENGTH, "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAvailableClosed", "()I", "readBoolean", "readBooleanSlow", "", "readByte", "readByteSlow", "", "readDouble", "readDoubleSlow", "", "readFloat", "readFloatSlow", "readFully", "(Lio/ktor/utils/io/core/Buffer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFullySuspend", "readInt", "readIntSlow", "readLong", "readLongSlow", "size", "Lio/ktor/utils/io/core/ByteReadPacket;", "readPacket", "builder", "readPacketSuspend", "(Lio/ktor/utils/io/core/BytePacketBuilder;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "limit", "readRemaining", "readRemainingSuspend", "(Lio/ktor/utils/io/core/BytePacketBuilder;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lio/ktor/utils/io/ReadSession;", "Lkotlin/ExtensionFunctionType;", "consumer", "readSession", "(Lkotlin/jvm/functions/Function1;)V", "", "readShort", "readShortSlow", "Lkotlin/Function2;", "Lio/ktor/utils/io/SuspendableReadSession;", "Lkotlin/coroutines/Continuation;", "", "readSuspendableSession", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "readUTF8Line", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "out", "readUTF8LineTo", "(Ljava/lang/Appendable;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "(I)Lio/ktor/utils/io/core/internal/ChunkBuffer;", "requestNextView", "startReadSession", "()Lio/ktor/utils/io/SuspendableReadSession;", "transferTo$ktor_io", "(Lio/ktor/utils/io/ByteChannelSequentialBase;J)J", "transferTo", "src", "writeAvailable", "writeAvailableSuspend", "b", "writeByte", "(BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "writeDouble", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "writeFloat", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "memory", "startIndex", "endIndex", "writeFully-JT6ljtQ", "(Ljava/nio/ByteBuffer;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeFully", "i", "writeInt", "l", "writeLong", "packet", "writePacket", "(Lio/ktor/utils/io/core/ByteReadPacket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "writeShort", "(SLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "visitor", "writeSuspendSession", "Z", "getAutoFlush", "getAvailableForRead", "availableForRead", "getAvailableForWrite", "availableForWrite", "<anonymous parameter 0>", "getClosed", "setClosed", "(Z)V", "closed", "getClosedCause", "()Ljava/lang/Throwable;", "setClosedCause", "(Ljava/lang/Throwable;)V", "closedCause", "flushBuffer", "Lio/ktor/utils/io/core/BytePacketBuilder;", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "flushMutex", "Ljava/lang/Object;", "isCancelled", "isClosedForRead", "isClosedForWrite", "readable", "Lio/ktor/utils/io/core/ByteReadPacket;", "getReadable", "()Lio/ktor/utils/io/core/ByteReadPacket;", "Lio/ktor/utils/io/internal/AwaitingSlot;", "slot", "Lio/ktor/utils/io/internal/AwaitingSlot;", "getTotalBytesRead", "()J", "totalBytesRead", "getTotalBytesWritten", "totalBytesWritten", "writable", "getWritable", "()Lio/ktor/utils/io/core/BytePacketBuilder;", "ktor-io", "Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lio/ktor/utils/io/HasReadSession;", "Lio/ktor/utils/io/HasWriteSession;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nByteChannelSequential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelSequential.kt\nio/ktor/utils/io/ByteChannelSequentialBase\n+ 2 AtomicFU.kt\nkotlinx/atomicfu/AtomicInt\n+ 3 AtomicFU.kt\nkotlinx/atomicfu/AtomicRef\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 6 Packet.kt\nio/ktor/utils/io/core/PacketKt\n*L\n1#1,855:1\n207#2,3:856\n302#2,2:874\n302#2,2:876\n295#2,2:878\n87#3,3:859\n1#4:862\n69#5:863\n69#5:864\n74#5:867\n74#5:868\n74#5:869\n69#5:870\n69#5:873\n43#6:865\n43#6:866\n43#6:871\n39#6:872\n*S KotlinDebug\n*F\n+ 1 ByteChannelSequential.kt\nio/ktor/utils/io/ByteChannelSequentialBase\n*L\n42#1:856,3\n838#1:874,2\n840#1:876,2\n849#1:878,2\n43#1:859,3\n194#1:863\n229#1:864\n483#1:867\n493#1:868\n504#1:869\n576#1:870\n651#1:873\n293#1:865\n315#1:866\n602#1:871\n640#1:872\n*E\n"})
/* loaded from: classes6.dex */
public abstract class ByteChannelSequentialBase implements ByteChannel, ByteReadChannel, ByteWriteChannel, SuspendableReadSession, HasReadSession, HasWriteSession {

    @NotNull
    private volatile /* synthetic */ int _availableForRead;

    @NotNull
    private volatile /* synthetic */ Object _closed;

    @NotNull
    private volatile /* synthetic */ Object _lastReadView;

    @NotNull
    private volatile /* synthetic */ long _totalBytesRead;

    @NotNull
    private volatile /* synthetic */ long _totalBytesWritten;
    public final boolean autoFlush;

    @NotNull
    private volatile /* synthetic */ int channelSize;

    @NotNull
    public final BytePacketBuilder flushBuffer;

    @NotNull
    public final Object flushMutex;

    @NotNull
    private volatile /* synthetic */ int lastReadAvailable$delegate;

    @NotNull
    private volatile /* synthetic */ Object lastReadView$delegate;

    @NotNull
    public final ByteReadPacket readable;

    @NotNull
    public final AwaitingSlot slot;

    @NotNull
    public final BytePacketBuilder writable;
    public static final /* synthetic */ AtomicLongFieldUpdater _totalBytesRead$FU = AtomicLongFieldUpdater.newUpdater(ByteChannelSequentialBase.class, "_totalBytesRead");
    public static final /* synthetic */ AtomicLongFieldUpdater _totalBytesWritten$FU = AtomicLongFieldUpdater.newUpdater(ByteChannelSequentialBase.class, "_totalBytesWritten");
    public static final /* synthetic */ AtomicIntegerFieldUpdater _availableForRead$FU = AtomicIntegerFieldUpdater.newUpdater(ByteChannelSequentialBase.class, "_availableForRead");
    public static final /* synthetic */ AtomicIntegerFieldUpdater channelSize$FU = AtomicIntegerFieldUpdater.newUpdater(ByteChannelSequentialBase.class, "channelSize");
    public static final /* synthetic */ AtomicReferenceFieldUpdater _closed$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannelSequentialBase.class, Object.class, "_closed");

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {799}, m7123m = "awaitFreeSpace$suspendImpl", m7124n = {"$this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$awaitFreeSpace$1 */
    /* loaded from: classes7.dex */
    public static final class C104261 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104261(Continuation<? super C104261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.awaitFreeSpace$suspendImpl(ByteChannelSequentialBase.this, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m7123m = "awaitSuspend", m7124n = {"this", "atLeast"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$awaitSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104271 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104271(Continuation<? super C104271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.awaitSuspend(0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0, 0}, m7122l = {BlackPassUtils.CAR_AWARD_ID_673}, m7123m = "discardSuspend", m7124n = {"this", "max", "discarded"}, m7125s = {"L$0", "J$0", "J$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$discardSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104291 extends ContinuationImpl {
        public long J$0;
        public long J$1;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104291(Continuation<? super C104291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.discardSuspend(0L, 0L, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {486}, m7123m = "readAvailable$ktor_io", m7124n = {"this", "dst"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$2 */
    /* loaded from: classes7.dex */
    public static final class C104302 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104302(Continuation<? super C104302> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readAvailable$ktor_io(null, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0, 0, 0}, m7122l = {530}, m7123m = "readAvailable$suspendImpl", m7124n = {"$this", "dst", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH}, m7125s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readAvailable$4 */
    /* loaded from: classes7.dex */
    public static final class C104314 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104314(Continuation<? super C104314> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.readAvailable$suspendImpl(ByteChannelSequentialBase.this, null, 0, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {570, 572}, m7123m = "readBooleanSlow", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readBooleanSlow$1 */
    /* loaded from: classes7.dex */
    public static final class C104321 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104321(Continuation<? super C104321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readBooleanSlow(this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {313}, m7123m = "readByteSlow", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readByteSlow$1 */
    /* loaded from: classes7.dex */
    public static final class C104331 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104331(Continuation<? super C104331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readByteSlow(this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {390}, m7123m = "readDoubleSlow", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readDoubleSlow$1 */
    /* loaded from: classes7.dex */
    public static final class C104341 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104341(Continuation<? super C104341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readDoubleSlow(this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {377}, m7123m = "readFloatSlow", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readFloatSlow$1 */
    /* loaded from: classes7.dex */
    public static final class C104351 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104351(Continuation<? super C104351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readFloatSlow(this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0, 0, 0}, m7122l = {544, 548}, m7123m = "readFully$suspendImpl", m7124n = {"$this", "dst", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH}, m7125s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readFully$6 */
    /* loaded from: classes7.dex */
    public static final class C104366 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104366(Continuation<? super C104366> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.readFully$suspendImpl(ByteChannelSequentialBase.this, null, 0, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0, 0}, m7122l = {519, 520}, m7123m = "readFullySuspend", m7124n = {"this", "dst", "n"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readFullySuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104371 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104371(Continuation<? super C104371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readFullySuspend(null, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0, 0, 0, 0}, m7122l = {555}, m7123m = "readFullySuspend", m7124n = {"this", "dst", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH, "written"}, m7125s = {"L$0", "L$1", "I$0", "I$1", "I$2"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readFullySuspend$2 */
    /* loaded from: classes7.dex */
    public static final class C104382 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104382(Continuation<? super C104382> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readFullySuspend(null, 0, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {349}, m7123m = "readIntSlow", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readIntSlow$1 */
    /* loaded from: classes7.dex */
    public static final class C104391 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104391(Continuation<? super C104391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readIntSlow(this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {364}, m7123m = "readLongSlow", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readLongSlow$1 */
    /* loaded from: classes7.dex */
    public static final class C104401 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104401(Continuation<? super C104401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readLongSlow(this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0, 0}, m7122l = {459}, m7123m = "readPacketSuspend", m7124n = {"this", "builder", "remaining"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readPacketSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104411 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104411(Continuation<? super C104411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readPacketSuspend(null, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0, 0}, m7122l = {TypedValues.CycleType.TYPE_WAVE_PHASE}, m7123m = "readRemainingSuspend", m7124n = {"this", "builder", "limit"}, m7125s = {"L$0", "L$1", "J$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readRemainingSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104421 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104421(Continuation<? super C104421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readRemainingSuspend(null, 0L, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {329}, m7123m = "readShortSlow", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readShortSlow$1 */
    /* loaded from: classes7.dex */
    public static final class C104431 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104431(Continuation<? super C104431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.readShortSlow(this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {TypedValues.TransitionType.TYPE_AUTO_TRANSITION}, m7123m = "readSuspendableSession$suspendImpl", m7124n = {"$this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readSuspendableSession$1 */
    /* loaded from: classes7.dex */
    public static final class C104441 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104441(Continuation<? super C104441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.readSuspendableSession$suspendImpl(ByteChannelSequentialBase.this, null, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {731}, m7123m = "readUTF8Line$suspendImpl", m7124n = {"builder"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readUTF8Line$1 */
    /* loaded from: classes7.dex */
    public static final class C104451 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104451(Continuation<? super C104451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.readUTF8Line$suspendImpl(ByteChannelSequentialBase.this, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {776, 777}, m7123m = "writeAvailableSuspend", m7124n = {"this", "src"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeAvailableSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104481 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104481(Continuation<? super C104481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.writeAvailableSuspend(null, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0, 0, 0}, m7122l = {781, 782}, m7123m = "writeAvailableSuspend", m7124n = {"this", "src", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH}, m7125s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeAvailableSuspend$2 */
    /* loaded from: classes7.dex */
    public static final class C104492 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104492(Continuation<? super C104492> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.this.writeAvailableSuspend(null, 0, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {150}, m7123m = "writeByte$suspendImpl", m7124n = {"$this", "b"}, m7125s = {"L$0", "B$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeByte$1 */
    /* loaded from: classes7.dex */
    public static final class C104501 extends ContinuationImpl {
        public byte B$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104501(Continuation<? super C104501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeByte$suspendImpl(ByteChannelSequentialBase.this, (byte) 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {180}, m7123m = "writeDouble$suspendImpl", m7124n = {"$this", "d"}, m7125s = {"L$0", "D$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeDouble$1 */
    /* loaded from: classes7.dex */
    public static final class C104511 extends ContinuationImpl {
        public double D$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104511(Continuation<? super C104511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeDouble$suspendImpl(ByteChannelSequentialBase.this, 0.0d, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {MatroskaExtractor.ID_TRACK_ENTRY}, m7123m = "writeFloat$suspendImpl", m7124n = {"$this", "f"}, m7125s = {"L$0", "F$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeFloat$1 */
    /* loaded from: classes7.dex */
    public static final class C104521 extends ContinuationImpl {
        public float F$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104521(Continuation<? super C104521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeFloat$suspendImpl(ByteChannelSequentialBase.this, 0.0f, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {GpsStatusWrapper.QZSS_SVID_MIN}, m7123m = "writeFully$suspendImpl", m7124n = {"$this", "src"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeFully$1 */
    /* loaded from: classes7.dex */
    public static final class C104531 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104531(Continuation<? super C104531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeFully$suspendImpl(ByteChannelSequentialBase.this, null, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0, 0, 0}, m7122l = {204}, m7123m = "writeFully$suspendImpl", m7124n = {"$this", "src", "currentIndex", "endIndex"}, m7125s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeFully$2 */
    /* loaded from: classes7.dex */
    public static final class C104542 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104542(Continuation<? super C104542> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeFully$suspendImpl(ByteChannelSequentialBase.this, null, 0, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0, 0, 0}, m7122l = {218}, m7123m = "writeFully-JT6ljtQ$suspendImpl", m7124n = {"$this", "memory", "endIndex", "currentIndex"}, m7125s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeFully$3 */
    /* loaded from: classes7.dex */
    public static final class C104553 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104553(Continuation<? super C104553> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.m15414writeFullyJT6ljtQ$suspendImpl(ByteChannelSequentialBase.this, null, 0, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {162}, m7123m = "writeInt$suspendImpl", m7124n = {"$this", "i"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeInt$1 */
    /* loaded from: classes7.dex */
    public static final class C104561 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104561(Continuation<? super C104561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeInt$suspendImpl(ByteChannelSequentialBase.this, 0, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {168}, m7123m = "writeLong$suspendImpl", m7124n = {"$this", "l"}, m7125s = {"L$0", "J$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeLong$1 */
    /* loaded from: classes7.dex */
    public static final class C104571 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104571(Continuation<? super C104571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeLong$suspendImpl(ByteChannelSequentialBase.this, 0L, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {MatroskaExtractor.ID_PIXEL_HEIGHT}, m7123m = "writePacket$suspendImpl", m7124n = {"$this", "packet"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writePacket$1 */
    /* loaded from: classes7.dex */
    public static final class C104581 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104581(Continuation<? super C104581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writePacket$suspendImpl(ByteChannelSequentialBase.this, null, this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase", m7120f = "ByteChannelSequential.kt", m7121i = {0, 0}, m7122l = {156}, m7123m = "writeShort$suspendImpl", m7124n = {"$this", "s"}, m7125s = {"L$0", "S$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$writeShort$1 */
    /* loaded from: classes7.dex */
    public static final class C104591 extends ContinuationImpl {
        public Object L$0;
        public short S$0;
        public int label;
        public /* synthetic */ Object result;

        public C104591(Continuation<? super C104591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialBase.writeShort$suspendImpl(ByteChannelSequentialBase.this, (short) 0, this);
        }
    }

    @Override // io.ktor.utils.p050io.SuspendableReadSession
    @Nullable
    public Object await(int i, @NotNull Continuation<? super Boolean> continuation) {
        return await$suspendImpl(this, i, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object awaitContent(@NotNull Continuation<? super Unit> continuation) {
        return awaitContent$suspendImpl(this, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object awaitFreeSpace(@NotNull Continuation<? super Unit> continuation) {
        return awaitFreeSpace$suspendImpl(this, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object discard(long j, @NotNull Continuation<? super Long> continuation) {
        return discard$suspendImpl(this, j, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readAvailable(@NotNull ChunkBuffer chunkBuffer, @NotNull Continuation<? super Integer> continuation) {
        return readAvailable$suspendImpl(this, chunkBuffer, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readAvailable(@NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Integer> continuation) {
        return readAvailable$suspendImpl(this, bArr, i, i2, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readBoolean(@NotNull Continuation<? super Boolean> continuation) {
        return readBoolean$suspendImpl(this, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readByte(@NotNull Continuation<? super Byte> continuation) {
        return readByte$suspendImpl(this, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readDouble(@NotNull Continuation<? super Double> continuation) {
        return readDouble$suspendImpl(this, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readFloat(@NotNull Continuation<? super Float> continuation) {
        return readFloat$suspendImpl(this, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readFully(@NotNull ChunkBuffer chunkBuffer, int i, @NotNull Continuation<? super Unit> continuation) {
        return readFully$suspendImpl(this, chunkBuffer, i, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readFully(@NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        return readFully$suspendImpl(this, bArr, i, i2, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readInt(@NotNull Continuation<? super Integer> continuation) {
        return readInt$suspendImpl(this, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readLong(@NotNull Continuation<? super Long> continuation) {
        return readLong$suspendImpl(this, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readPacket(int i, @NotNull Continuation<? super ByteReadPacket> continuation) {
        return readPacket$suspendImpl(this, i, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readRemaining(long j, @NotNull Continuation<? super ByteReadPacket> continuation) {
        return readRemaining$suspendImpl(this, j, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readShort(@NotNull Continuation<? super Short> continuation) {
        return readShort$suspendImpl(this, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Deprecated(message = "Use read instead.")
    @Nullable
    public Object readSuspendableSession(@NotNull Function2<? super SuspendableReadSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return readSuspendableSession$suspendImpl(this, function2, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readUTF8Line(int i, @NotNull Continuation<? super String> continuation) {
        return readUTF8Line$suspendImpl(this, i, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public <A extends Appendable> Object readUTF8LineTo(@NotNull A a2, int i, @NotNull Continuation<? super Boolean> continuation) {
        return readUTF8LineTo$suspendImpl(this, a2, i, continuation);
    }

    @Override // io.ktor.utils.p050io.HasReadSession
    @NotNull
    public SuspendableReadSession startReadSession() {
        return this;
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeAvailable(@NotNull ChunkBuffer chunkBuffer, @NotNull Continuation<? super Integer> continuation) {
        return writeAvailable$suspendImpl(this, chunkBuffer, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeAvailable(@NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Integer> continuation) {
        return writeAvailable$suspendImpl(this, bArr, i, i2, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeByte(byte b, @NotNull Continuation<? super Unit> continuation) {
        return writeByte$suspendImpl(this, b, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeDouble(double d, @NotNull Continuation<? super Unit> continuation) {
        return writeDouble$suspendImpl(this, d, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeFloat(float f, @NotNull Continuation<? super Unit> continuation) {
        return writeFloat$suspendImpl(this, f, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeFully(@NotNull Buffer buffer, @NotNull Continuation<? super Unit> continuation) {
        return writeFully$suspendImpl(this, buffer, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeFully(@NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        return writeFully$suspendImpl(this, bArr, i, i2, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    /* renamed from: writeFully-JT6ljtQ */
    public Object mo15413writeFullyJT6ljtQ(@NotNull ByteBuffer byteBuffer, int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        return m15414writeFullyJT6ljtQ$suspendImpl(this, byteBuffer, i, i2, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeInt(int i, @NotNull Continuation<? super Unit> continuation) {
        return writeInt$suspendImpl(this, i, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeLong(long j, @NotNull Continuation<? super Unit> continuation) {
        return writeLong$suspendImpl(this, j, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writePacket(@NotNull ByteReadPacket byteReadPacket, @NotNull Continuation<? super Unit> continuation) {
        return writePacket$suspendImpl(this, byteReadPacket, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeShort(short s, @NotNull Continuation<? super Unit> continuation) {
        return writeShort$suspendImpl(this, s, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Deprecated(message = "Use write { } instead.")
    @Nullable
    public Object writeSuspendSession(@NotNull Function2<? super WriterSuspendSession, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return writeSuspendSession$suspendImpl(this, function2, continuation);
    }

    public ByteChannelSequentialBase(@NotNull ChunkBuffer initial, boolean z, @NotNull ObjectPool<ChunkBuffer> pool) throws Throwable {
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.autoFlush = z;
        ChunkBuffer.Companion companion = ChunkBuffer.INSTANCE;
        this._lastReadView = companion.getEmpty();
        this._totalBytesRead = 0L;
        this._totalBytesWritten = 0L;
        this._availableForRead = 0;
        this.channelSize = 0;
        this._closed = null;
        this.writable = new BytePacketBuilder(pool);
        this.readable = new ByteReadPacket(initial, pool);
        this.lastReadAvailable$delegate = 0;
        this.lastReadView$delegate = companion.getEmpty();
        this.slot = new AwaitingSlot();
        this.flushMutex = new Object();
        this.flushBuffer = new BytePacketBuilder(null, 1, null);
        int iRemainingAll = (int) BuffersKt.remainingAll(initial);
        afterWrite(iRemainingAll);
        _availableForRead$FU.addAndGet(this, iRemainingAll);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    public boolean getAutoFlush() {
        return this.autoFlush;
    }

    public /* synthetic */ ByteChannelSequentialBase(ChunkBuffer chunkBuffer, boolean z, ObjectPool objectPool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(chunkBuffer, z, (i & 4) != 0 ? ChunkBuffer.INSTANCE.getPool() : objectPool);
    }

    public final boolean isCancelled() {
        CloseElement closeElement = (CloseElement) this._closed;
        return (closeElement != null ? closeElement.getCause() : null) != null;
    }

    public final boolean getClosed() {
        return this._closed != null;
    }

    public final void setClosed(boolean z) {
        throw new IllegalStateException("Setting is not allowed for closed".toString());
    }

    @NotNull
    public final BytePacketBuilder getWritable() {
        return this.writable;
    }

    @NotNull
    public final ByteReadPacket getReadable() {
        return this.readable;
    }

    /* renamed from: getLastReadAvailable, reason: from getter */
    public final int getLastReadAvailable$delegate() {
        return this.lastReadAvailable$delegate;
    }

    public final void setLastReadAvailable(int i) {
        this.lastReadAvailable$delegate = i;
    }

    public final ChunkBuffer getLastReadView() {
        return (ChunkBuffer) this.lastReadView$delegate;
    }

    public final void setLastReadView(ChunkBuffer chunkBuffer) {
        this.lastReadView$delegate = chunkBuffer;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    /* renamed from: getAvailableForRead, reason: from getter */
    public int get_availableForRead() {
        return this._availableForRead;
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    public int getAvailableForWrite() {
        return Math.max(0, 4088 - this.channelSize);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    public boolean isClosedForRead() {
        return isCancelled() || (getClosed() && this.channelSize == 0);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel, io.ktor.utils.p050io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return getClosed();
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    /* renamed from: getTotalBytesRead, reason: from getter */
    public long get_totalBytesRead() {
        return this._totalBytesRead;
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    /* renamed from: getTotalBytesWritten, reason: from getter */
    public long get_totalBytesWritten() {
        return this._totalBytesWritten;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel, io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public final Throwable getClosedCause() {
        CloseElement closeElement = (CloseElement) this._closed;
        if (closeElement != null) {
            return closeElement.getCause();
        }
        return null;
    }

    public final void setClosedCause(@Nullable Throwable th) {
        throw new IllegalStateException("Closed cause shouldn't be changed directly".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitAtLeastNBytesAvailableForWrite$ktor_io(final int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1 byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1;
        final ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1) {
            byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1 = (ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1) continuation;
            int i2 = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.label = i2 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1 = new ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1(this, continuation);
            }
        }
        Object obj = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialBase = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.I$0;
            byteChannelSequentialBase = (ByteChannelSequentialBase) byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (byteChannelSequentialBase.getAvailableForWrite() < i && !byteChannelSequentialBase.getClosed()) {
            if (!byteChannelSequentialBase.flushImpl()) {
                AwaitingSlot awaitingSlot = byteChannelSequentialBase.slot;
                Function0<Boolean> function0 = new Function0<Boolean>() { // from class: io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        return Boolean.valueOf(this.this$0.getAvailableForWrite() < i && !this.this$0.getClosed());
                    }
                };
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.L$0 = byteChannelSequentialBase;
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.I$0 = i;
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1.label = 1;
                if (awaitingSlot.sleep(function0, byteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitAtLeastNBytesAvailableForRead$ktor_io(final int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1 byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1;
        final ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1) {
            byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1 = (ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1) continuation;
            int i2 = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.label = i2 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1 = new ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1(this, continuation);
            }
        }
        Object obj = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialBase = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.I$0;
            byteChannelSequentialBase = (ByteChannelSequentialBase) byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (byteChannelSequentialBase.get_availableForRead() < i && !byteChannelSequentialBase.isClosedForRead()) {
            AwaitingSlot awaitingSlot = byteChannelSequentialBase.slot;
            Function0<Boolean> function0 = new Function0<Boolean>() { // from class: io.ktor.utils.io.ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(this.this$0.get_availableForRead() < i && !this.this$0.isClosedForRead());
                }
            };
            byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.L$0 = byteChannelSequentialBase;
            byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.I$0 = i;
            byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1.label = 1;
            if (awaitingSlot.sleep(function0, byteChannelSequentialBase$awaitAtLeastNBytesAvailableForRead$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    public void flush() {
        flushImpl();
    }

    public final boolean flushImpl() {
        if (this.writable.isEmpty()) {
            this.slot.resume();
            return false;
        }
        flushWrittenBytes();
        this.slot.resume();
        return true;
    }

    public final void flushWrittenBytes() {
        synchronized (this.flushMutex) {
            int size = this.writable.getSize();
            ChunkBuffer chunkBufferStealAll$ktor_io = this.writable.stealAll$ktor_io();
            Intrinsics.checkNotNull(chunkBufferStealAll$ktor_io);
            this.flushBuffer.writeChunkBuffer$ktor_io(chunkBufferStealAll$ktor_io);
            _availableForRead$FU.addAndGet(this, size);
        }
    }

    public final void prepareFlushedBytes() {
        synchronized (this.flushMutex) {
            UnsafeKt.unsafeAppend(this.readable, this.flushBuffer);
        }
    }

    public final void ensureNotClosed() throws Throwable {
        if (getClosed()) {
            Throwable closedCause = getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            throw new ClosedWriteChannelException("Channel " + this + " is already closed");
        }
    }

    public final void ensureNotFailed() throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public final void ensureNotFailed(BytePacketBuilder closeable) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause == null) {
            return;
        }
        closeable.release();
        throw closedCause;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeByte$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, byte b, Continuation<? super Unit> continuation) throws Throwable {
        C104501 c104501;
        if (continuation instanceof C104501) {
            c104501 = (C104501) continuation;
            int i = c104501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104501.label = i - Integer.MIN_VALUE;
            } else {
                c104501 = byteChannelSequentialBase.new C104501(continuation);
            }
        }
        Object obj = c104501.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104501.L$0 = byteChannelSequentialBase;
            c104501.B$0 = b;
            c104501.label = 1;
            if (byteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104501) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b = c104501.B$0;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104501.L$0;
            ResultKt.throwOnFailure(obj);
        }
        byteChannelSequentialBase.writable.writeByte(b);
        byteChannelSequentialBase.afterWrite(1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeShort$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, short s, Continuation<? super Unit> continuation) throws Throwable {
        C104591 c104591;
        if (continuation instanceof C104591) {
            c104591 = (C104591) continuation;
            int i = c104591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104591.label = i - Integer.MIN_VALUE;
            } else {
                c104591 = byteChannelSequentialBase.new C104591(continuation);
            }
        }
        Object obj = c104591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104591.L$0 = byteChannelSequentialBase;
            c104591.S$0 = s;
            c104591.label = 1;
            if (byteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(2, c104591) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s = c104591.S$0;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104591.L$0;
            ResultKt.throwOnFailure(obj);
        }
        OutputPrimitivesKt.writeShort(byteChannelSequentialBase.writable, s);
        byteChannelSequentialBase.afterWrite(2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeInt$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, int i, Continuation<? super Unit> continuation) throws Throwable {
        C104561 c104561;
        if (continuation instanceof C104561) {
            c104561 = (C104561) continuation;
            int i2 = c104561.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104561.label = i2 - Integer.MIN_VALUE;
            } else {
                c104561 = byteChannelSequentialBase.new C104561(continuation);
            }
        }
        Object obj = c104561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104561.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            c104561.L$0 = byteChannelSequentialBase;
            c104561.I$0 = i;
            c104561.label = 1;
            if (byteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(4, c104561) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c104561.I$0;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104561.L$0;
            ResultKt.throwOnFailure(obj);
        }
        OutputPrimitivesKt.writeInt(byteChannelSequentialBase.writable, i);
        byteChannelSequentialBase.afterWrite(4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeLong$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, long j, Continuation<? super Unit> continuation) throws Throwable {
        C104571 c104571;
        if (continuation instanceof C104571) {
            c104571 = (C104571) continuation;
            int i = c104571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104571.label = i - Integer.MIN_VALUE;
            } else {
                c104571 = byteChannelSequentialBase.new C104571(continuation);
            }
        }
        Object obj = c104571.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104571.L$0 = byteChannelSequentialBase;
            c104571.J$0 = j;
            c104571.label = 1;
            if (byteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(8, c104571) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c104571.J$0;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104571.L$0;
            ResultKt.throwOnFailure(obj);
        }
        OutputPrimitivesKt.writeLong(byteChannelSequentialBase.writable, j);
        byteChannelSequentialBase.afterWrite(8);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeFloat$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, float f, Continuation<? super Unit> continuation) throws Throwable {
        C104521 c104521;
        if (continuation instanceof C104521) {
            c104521 = (C104521) continuation;
            int i = c104521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104521.label = i - Integer.MIN_VALUE;
            } else {
                c104521 = byteChannelSequentialBase.new C104521(continuation);
            }
        }
        Object obj = c104521.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104521.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104521.L$0 = byteChannelSequentialBase;
            c104521.F$0 = f;
            c104521.label = 1;
            if (byteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(4, c104521) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = c104521.F$0;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104521.L$0;
            ResultKt.throwOnFailure(obj);
        }
        OutputPrimitivesKt.writeFloat(byteChannelSequentialBase.writable, f);
        byteChannelSequentialBase.afterWrite(4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeDouble$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, double d, Continuation<? super Unit> continuation) throws Throwable {
        C104511 c104511;
        if (continuation instanceof C104511) {
            c104511 = (C104511) continuation;
            int i = c104511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104511.label = i - Integer.MIN_VALUE;
            } else {
                c104511 = byteChannelSequentialBase.new C104511(continuation);
            }
        }
        Object obj = c104511.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104511.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104511.L$0 = byteChannelSequentialBase;
            c104511.D$0 = d;
            c104511.label = 1;
            if (byteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(8, c104511) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d = c104511.D$0;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104511.L$0;
            ResultKt.throwOnFailure(obj);
        }
        OutputPrimitivesKt.writeDouble(byteChannelSequentialBase.writable, d);
        byteChannelSequentialBase.afterWrite(8);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writePacket$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, ByteReadPacket byteReadPacket, Continuation<? super Unit> continuation) throws Throwable {
        C104581 c104581;
        if (continuation instanceof C104581) {
            c104581 = (C104581) continuation;
            int i = c104581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104581.label = i - Integer.MIN_VALUE;
            } else {
                c104581 = byteChannelSequentialBase.new C104581(continuation);
            }
        }
        Object obj = c104581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104581.L$0 = byteChannelSequentialBase;
            c104581.L$1 = byteReadPacket;
            c104581.label = 1;
            if (byteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104581) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadPacket = (ByteReadPacket) c104581.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104581.L$0;
            ResultKt.throwOnFailure(obj);
        }
        int remaining = (int) byteReadPacket.getRemaining();
        byteChannelSequentialBase.writable.writePacket(byteReadPacket);
        byteChannelSequentialBase.afterWrite(remaining);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeFully$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Buffer buffer, Continuation<? super Unit> continuation) throws Throwable {
        C104531 c104531;
        if (continuation instanceof C104531) {
            c104531 = (C104531) continuation;
            int i = c104531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104531.label = i - Integer.MIN_VALUE;
            } else {
                c104531 = byteChannelSequentialBase.new C104531(continuation);
            }
        }
        Object obj = c104531.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104531.L$0 = byteChannelSequentialBase;
            c104531.L$1 = buffer;
            c104531.label = 1;
            if (byteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104531) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buffer = (Buffer) c104531.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104531.L$0;
            ResultKt.throwOnFailure(obj);
        }
        int writePosition = buffer.getWritePosition() - buffer.getReadPosition();
        OutputKt.writeFully$default(byteChannelSequentialBase.writable, buffer, 0, 2, null);
        byteChannelSequentialBase.afterWrite(writePosition);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeFully$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) throws Throwable {
        C104542 c104542;
        ByteChannelSequentialBase byteChannelSequentialBase2;
        int i3;
        int i4;
        byte[] bArr2;
        if (continuation instanceof C104542) {
            c104542 = (C104542) continuation;
            int i5 = c104542.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c104542.label = i5 - Integer.MIN_VALUE;
            } else {
                c104542 = byteChannelSequentialBase.new C104542(continuation);
            }
        }
        Object obj = c104542.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c104542.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialBase2 = byteChannelSequentialBase;
            i3 = i2 + i;
            i4 = i;
            bArr2 = bArr;
            if (i4 < i3) {
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c104542.I$1;
            int i7 = c104542.I$0;
            bArr2 = (byte[]) c104542.L$1;
            ByteChannelSequentialBase byteChannelSequentialBase3 = (ByteChannelSequentialBase) c104542.L$0;
            ResultKt.throwOnFailure(obj);
            i4 = i7;
            byteChannelSequentialBase2 = byteChannelSequentialBase3;
            int iMin = Math.min(byteChannelSequentialBase2.getAvailableForWrite(), i3 - i4);
            OutputKt.writeFully((Output) byteChannelSequentialBase2.writable, bArr2, i4, iMin);
            i4 += iMin;
            byteChannelSequentialBase2.afterWrite(iMin);
            if (i4 < i3) {
                c104542.L$0 = byteChannelSequentialBase2;
                c104542.L$1 = bArr2;
                c104542.I$0 = i4;
                c104542.I$1 = i3;
                c104542.label = 1;
                if (byteChannelSequentialBase2.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104542) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int iMin2 = Math.min(byteChannelSequentialBase2.getAvailableForWrite(), i3 - i4);
                OutputKt.writeFully((Output) byteChannelSequentialBase2.writable, bArr2, i4, iMin2);
                i4 += iMin2;
                byteChannelSequentialBase2.afterWrite(iMin2);
                if (i4 < i3) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:19:0x0058). Please report as a decompilation issue!!! */
    /* renamed from: writeFully-JT6ljtQ$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m15414writeFullyJT6ljtQ$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, ByteBuffer byteBuffer, int i, int i2, Continuation<? super Unit> continuation) throws Throwable {
        C104553 c104553;
        if (continuation instanceof C104553) {
            c104553 = (C104553) continuation;
            int i3 = c104553.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c104553.label = i3 - Integer.MIN_VALUE;
            } else {
                c104553 = byteChannelSequentialBase.new C104553(continuation);
            }
        }
        Object obj = c104553.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c104553.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            if (i < i2) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = c104553.I$1;
            int i6 = c104553.I$0;
            ByteBuffer byteBuffer2 = (ByteBuffer) c104553.L$1;
            ByteChannelSequentialBase byteChannelSequentialBase2 = (ByteChannelSequentialBase) c104553.L$0;
            ResultKt.throwOnFailure(obj);
            i = i5;
            byteChannelSequentialBase = byteChannelSequentialBase2;
            i2 = i6;
            byteBuffer = byteBuffer2;
            int iMin = Math.min(byteChannelSequentialBase.getAvailableForWrite(), i2 - i);
            OutputKt.m15639writeFullyUAd2zVI((Output) byteChannelSequentialBase.writable, byteBuffer, i, iMin);
            i += iMin;
            byteChannelSequentialBase.afterWrite(iMin);
            if (i < i2) {
                c104553.L$0 = byteChannelSequentialBase;
                c104553.L$1 = byteBuffer;
                c104553.I$0 = i2;
                c104553.I$1 = i;
                c104553.label = 1;
                if (byteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104553) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int iMin2 = Math.min(byteChannelSequentialBase.getAvailableForWrite(), i2 - i);
                OutputKt.m15639writeFullyUAd2zVI((Output) byteChannelSequentialBase.writable, byteBuffer, i, iMin2);
                i += iMin2;
                byteChannelSequentialBase.afterWrite(iMin2);
                if (i < i2) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static /* synthetic */ Object writeAvailable$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        if (i2 == 0) {
            return Boxing.boxInt(0);
        }
        int iMin = Math.min(i2, byteChannelSequentialBase.getAvailableForWrite());
        if (iMin == 0) {
            return byteChannelSequentialBase.writeAvailableSuspend(bArr, i, i2, continuation);
        }
        OutputKt.writeFully((Output) byteChannelSequentialBase.writable, bArr, i, iMin);
        byteChannelSequentialBase.afterWrite(iMin);
        return Boxing.boxInt(iMin);
    }

    @Deprecated(message = "Use write { } instead.")
    public static /* synthetic */ Object writeSuspendSession$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Function2<? super WriterSuspendSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objInvoke = function2.invoke(byteChannelSequentialBase.beginWriteSession(), continuation);
        return objInvoke == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }

    @Override // io.ktor.utils.p050io.HasWriteSession
    @NotNull
    public WriterSuspendSession beginWriteSession() {
        return new WriterSuspendSession() { // from class: io.ktor.utils.io.ByteChannelSequentialBase.beginWriteSession.1
            @Override // io.ktor.utils.p050io.WriterSession
            @Nullable
            public ChunkBuffer request(int min) {
                if (ByteChannelSequentialBase.this.getAvailableForWrite() == 0) {
                    return null;
                }
                return ByteChannelSequentialBase.this.getWritable().prepareWriteHead(min);
            }

            @Override // io.ktor.utils.p050io.WriterSession
            public void written(int n) throws Throwable {
                ByteChannelSequentialBase.this.getWritable().afterHeadWrite();
                ByteChannelSequentialBase.this.afterWrite(n);
            }

            @Override // io.ktor.utils.p050io.WriterSession
            public void flush() {
                ByteChannelSequentialBase.this.flush();
            }

            @Override // io.ktor.utils.p050io.WriterSuspendSession
            @Nullable
            public Object tryAwait(int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
                if (ByteChannelSequentialBase.this.getAvailableForWrite() < i) {
                    Object objAwaitAtLeastNBytesAvailableForWrite$ktor_io = ByteChannelSequentialBase.this.awaitAtLeastNBytesAvailableForWrite$ktor_io(i, continuation);
                    return objAwaitAtLeastNBytesAvailableForWrite$ktor_io == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitAtLeastNBytesAvailableForWrite$ktor_io : Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // io.ktor.utils.p050io.HasWriteSession
    public void endWriteSession(int written) throws Throwable {
        this.writable.afterHeadWrite();
        afterWrite(written);
    }

    public static /* synthetic */ Object readByte$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Continuation<? super Byte> continuation) {
        if (!byteChannelSequentialBase.readable.getEndOfInput()) {
            byte b = byteChannelSequentialBase.readable.readByte();
            byteChannelSequentialBase.afterRead(1);
            return Boxing.boxByte(b);
        }
        return byteChannelSequentialBase.readByteSlow(continuation);
    }

    public static /* synthetic */ void checkClosed$default(ByteChannelSequentialBase byteChannelSequentialBase, int i, BytePacketBuilder bytePacketBuilder, int i2, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkClosed");
        }
        if ((i2 & 2) != 0) {
            bytePacketBuilder = null;
        }
        byteChannelSequentialBase.checkClosed(i, bytePacketBuilder);
    }

    public final void checkClosed(int remaining, BytePacketBuilder closeable) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            if (closeable != null) {
                closeable.close();
                throw closedCause;
            }
            throw closedCause;
        }
        if (!getClosed() || get_availableForRead() >= remaining) {
            return;
        }
        if (closeable != null) {
            closeable.close();
        }
        throw new EOFException(remaining + " bytes required but EOF reached");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readByteSlow(Continuation<? super Byte> continuation) throws Throwable {
        C104331 c104331;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104331) {
            c104331 = (C104331) continuation;
            int i = c104331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104331.label = i - Integer.MIN_VALUE;
            } else {
                c104331 = new C104331(continuation);
            }
        }
        Object obj = c104331.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104331.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialBase = this;
            c104331.L$0 = byteChannelSequentialBase;
            c104331.label = 1;
            if (byteChannelSequentialBase.awaitSuspend(1, c104331) == coroutine_suspended) {
            }
            if (!byteChannelSequentialBase.readable.getEndOfInput()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104331.L$0;
            ResultKt.throwOnFailure(obj);
            if (!byteChannelSequentialBase.readable.getEndOfInput()) {
                Byte bBoxByte = Boxing.boxByte(byteChannelSequentialBase.readable.readByte());
                bBoxByte.byteValue();
                byteChannelSequentialBase.afterRead(1);
                return bBoxByte;
            }
            checkClosed$default(byteChannelSequentialBase, 1, null, 2, null);
            c104331.L$0 = byteChannelSequentialBase;
            c104331.label = 1;
            if (byteChannelSequentialBase.awaitSuspend(1, c104331) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!byteChannelSequentialBase.readable.getEndOfInput()) {
            }
        }
    }

    public static /* synthetic */ Object readShort$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Continuation<? super Short> continuation) {
        if (byteChannelSequentialBase.readable.hasBytes(2)) {
            short s = InputPrimitivesKt.readShort(byteChannelSequentialBase.readable);
            byteChannelSequentialBase.afterRead(2);
            return Boxing.boxShort(s);
        }
        return byteChannelSequentialBase.readShortSlow(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readShortSlow(Continuation<? super Short> continuation) throws Throwable {
        C104431 c104431;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104431) {
            c104431 = (C104431) continuation;
            int i = c104431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104431.label = i - Integer.MIN_VALUE;
            } else {
                c104431 = new C104431(continuation);
            }
        }
        Object obj = c104431.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104431.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104431.L$0 = this;
            c104431.label = 1;
            if (awaitSuspend(2, c104431) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104431.L$0;
            ResultKt.throwOnFailure(obj);
        }
        short s = InputPrimitivesKt.readShort(byteChannelSequentialBase.readable);
        byteChannelSequentialBase.afterRead(2);
        return Boxing.boxShort(s);
    }

    public final void afterRead(int count) {
        addBytesRead(count);
        this.slot.resume();
    }

    public static /* synthetic */ Object readInt$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Continuation<? super Integer> continuation) {
        if (byteChannelSequentialBase.readable.hasBytes(4)) {
            int i = InputPrimitivesKt.readInt(byteChannelSequentialBase.readable);
            byteChannelSequentialBase.afterRead(4);
            return Boxing.boxInt(i);
        }
        return byteChannelSequentialBase.readIntSlow(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readIntSlow(Continuation<? super Integer> continuation) throws Throwable {
        C104391 c104391;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104391) {
            c104391 = (C104391) continuation;
            int i = c104391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104391.label = i - Integer.MIN_VALUE;
            } else {
                c104391 = new C104391(continuation);
            }
        }
        Object obj = c104391.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104391.L$0 = this;
            c104391.label = 1;
            if (awaitSuspend(4, c104391) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104391.L$0;
            ResultKt.throwOnFailure(obj);
        }
        int i3 = InputPrimitivesKt.readInt(byteChannelSequentialBase.readable);
        byteChannelSequentialBase.afterRead(4);
        return Boxing.boxInt(i3);
    }

    public static /* synthetic */ Object readLong$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Continuation<? super Long> continuation) {
        if (byteChannelSequentialBase.readable.hasBytes(8)) {
            long j = InputPrimitivesKt.readLong(byteChannelSequentialBase.readable);
            byteChannelSequentialBase.afterRead(8);
            return Boxing.boxLong(j);
        }
        return byteChannelSequentialBase.readLongSlow(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readLongSlow(Continuation<? super Long> continuation) throws Throwable {
        C104401 c104401;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104401) {
            c104401 = (C104401) continuation;
            int i = c104401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104401.label = i - Integer.MIN_VALUE;
            } else {
                c104401 = new C104401(continuation);
            }
        }
        Object obj = c104401.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104401.L$0 = this;
            c104401.label = 1;
            if (awaitSuspend(8, c104401) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104401.L$0;
            ResultKt.throwOnFailure(obj);
        }
        long j = InputPrimitivesKt.readLong(byteChannelSequentialBase.readable);
        byteChannelSequentialBase.afterRead(8);
        return Boxing.boxLong(j);
    }

    public static /* synthetic */ Object readFloat$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Continuation<? super Float> continuation) {
        if (byteChannelSequentialBase.readable.hasBytes(4)) {
            float f = InputPrimitivesKt.readFloat(byteChannelSequentialBase.readable);
            byteChannelSequentialBase.afterRead(4);
            return Boxing.boxFloat(f);
        }
        return byteChannelSequentialBase.readFloatSlow(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readFloatSlow(Continuation<? super Float> continuation) throws Throwable {
        C104351 c104351;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104351) {
            c104351 = (C104351) continuation;
            int i = c104351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104351.label = i - Integer.MIN_VALUE;
            } else {
                c104351 = new C104351(continuation);
            }
        }
        Object obj = c104351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104351.L$0 = this;
            c104351.label = 1;
            if (awaitSuspend(4, c104351) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104351.L$0;
            ResultKt.throwOnFailure(obj);
        }
        float f = InputPrimitivesKt.readFloat(byteChannelSequentialBase.readable);
        byteChannelSequentialBase.afterRead(4);
        return Boxing.boxFloat(f);
    }

    public static /* synthetic */ Object readDouble$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Continuation<? super Double> continuation) {
        if (byteChannelSequentialBase.readable.hasBytes(8)) {
            double d = InputPrimitivesKt.readDouble(byteChannelSequentialBase.readable);
            byteChannelSequentialBase.afterRead(8);
            return Boxing.boxDouble(d);
        }
        return byteChannelSequentialBase.readDoubleSlow(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDoubleSlow(Continuation<? super Double> continuation) throws Throwable {
        C104341 c104341;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104341) {
            c104341 = (C104341) continuation;
            int i = c104341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104341.label = i - Integer.MIN_VALUE;
            } else {
                c104341 = new C104341(continuation);
            }
        }
        Object obj = c104341.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104341.L$0 = this;
            c104341.label = 1;
            if (awaitSuspend(8, c104341) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104341.L$0;
            ResultKt.throwOnFailure(obj);
        }
        double d = InputPrimitivesKt.readDouble(byteChannelSequentialBase.readable);
        byteChannelSequentialBase.afterRead(8);
        return Boxing.boxDouble(d);
    }

    public static /* synthetic */ Object readRemaining$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, long j, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        byteChannelSequentialBase.ensureNotFailed();
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        long jMin = Math.min(j, byteChannelSequentialBase.readable.getRemaining());
        bytePacketBuilder.writePacket(byteChannelSequentialBase.readable, jMin);
        byteChannelSequentialBase.afterRead((int) jMin);
        if (j - bytePacketBuilder.getSize() == 0 || byteChannelSequentialBase.isClosedForRead()) {
            byteChannelSequentialBase.ensureNotFailed(bytePacketBuilder);
            return bytePacketBuilder.build();
        }
        return byteChannelSequentialBase.readRemainingSuspend(bytePacketBuilder, j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readRemainingSuspend(BytePacketBuilder bytePacketBuilder, long j, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        C104421 c104421;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104421) {
            c104421 = (C104421) continuation;
            int i = c104421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104421.label = i - Integer.MIN_VALUE;
            } else {
                c104421 = new C104421(continuation);
            }
        }
        Object obj = c104421.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104421.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialBase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = c104421.J$0;
            BytePacketBuilder bytePacketBuilder2 = (BytePacketBuilder) c104421.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104421.L$0;
            ResultKt.throwOnFailure(obj);
            bytePacketBuilder = bytePacketBuilder2;
            j = j2;
        }
        while (bytePacketBuilder.getSize() < j) {
            long jMin = Math.min(j - bytePacketBuilder.getSize(), byteChannelSequentialBase.readable.getRemaining());
            bytePacketBuilder.writePacket(byteChannelSequentialBase.readable, jMin);
            byteChannelSequentialBase.afterRead((int) jMin);
            byteChannelSequentialBase.ensureNotFailed(bytePacketBuilder);
            if (byteChannelSequentialBase.isClosedForRead() || bytePacketBuilder.getSize() == ((int) j)) {
                break;
            }
            c104421.L$0 = byteChannelSequentialBase;
            c104421.L$1 = bytePacketBuilder;
            c104421.J$0 = j;
            c104421.label = 1;
            if (byteChannelSequentialBase.awaitSuspend(1, c104421) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        byteChannelSequentialBase.ensureNotFailed(bytePacketBuilder);
        return bytePacketBuilder.build();
    }

    public static /* synthetic */ Object readPacket$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, int i, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        checkClosed$default(byteChannelSequentialBase, i, null, 2, null);
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        int iMin = (int) Math.min(i, byteChannelSequentialBase.readable.getRemaining());
        int i2 = i - iMin;
        bytePacketBuilder.writePacket(byteChannelSequentialBase.readable, iMin);
        byteChannelSequentialBase.afterRead(iMin);
        byteChannelSequentialBase.checkClosed(i2, bytePacketBuilder);
        if (i2 > 0) {
            return byteChannelSequentialBase.readPacketSuspend(bytePacketBuilder, i2, continuation);
        }
        return bytePacketBuilder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readPacketSuspend(BytePacketBuilder bytePacketBuilder, int i, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        C104411 c104411;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104411) {
            c104411 = (C104411) continuation;
            int i2 = c104411.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104411.label = i2 - Integer.MIN_VALUE;
            } else {
                c104411 = new C104411(continuation);
            }
        }
        Object obj = c104411.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104411.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialBase = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c104411.I$0;
            BytePacketBuilder bytePacketBuilder2 = (BytePacketBuilder) c104411.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104411.L$0;
            ResultKt.throwOnFailure(obj);
            i = i4;
            bytePacketBuilder = bytePacketBuilder2;
        }
        while (i > 0) {
            int iMin = (int) Math.min(i, byteChannelSequentialBase.readable.getRemaining());
            i -= iMin;
            bytePacketBuilder.writePacket(byteChannelSequentialBase.readable, iMin);
            byteChannelSequentialBase.afterRead(iMin);
            byteChannelSequentialBase.checkClosed(i, bytePacketBuilder);
            if (i > 0) {
                c104411.L$0 = byteChannelSequentialBase;
                c104411.L$1 = bytePacketBuilder;
                c104411.I$0 = i;
                c104411.label = 1;
                if (byteChannelSequentialBase.awaitSuspend(1, c104411) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        byteChannelSequentialBase.checkClosed(i, bytePacketBuilder);
        return bytePacketBuilder.build();
    }

    public final int readAvailableClosed() throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        if (get_availableForRead() <= 0) {
            return -1;
        }
        prepareFlushedBytes();
        return -1;
    }

    public static /* synthetic */ Object readAvailable$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) {
        Intrinsics.checkNotNull(chunkBuffer, "null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
        return byteChannelSequentialBase.readAvailable$ktor_io(chunkBuffer, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAvailable$ktor_io(@NotNull Buffer buffer, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        C104302 c104302;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104302) {
            c104302 = (C104302) continuation;
            int i = c104302.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104302.label = i - Integer.MIN_VALUE;
            } else {
                c104302 = new C104302(continuation);
            }
        }
        Object obj = c104302.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104302.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable closedCause = getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            if (getClosed() && get_availableForRead() == 0) {
                return Boxing.boxInt(-1);
            }
            if (buffer.getLimit() - buffer.getWritePosition() == 0) {
                return Boxing.boxInt(0);
            }
            if (get_availableForRead() == 0) {
                c104302.L$0 = this;
                c104302.L$1 = buffer;
                c104302.label = 1;
                if (awaitSuspend(1, c104302) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            byteChannelSequentialBase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buffer = (Buffer) c104302.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104302.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!byteChannelSequentialBase.readable.canRead()) {
            byteChannelSequentialBase.prepareFlushedBytes();
        }
        int iMin = (int) Math.min(buffer.getLimit() - buffer.getWritePosition(), byteChannelSequentialBase.readable.getRemaining());
        InputArraysKt.readFully(byteChannelSequentialBase.readable, buffer, iMin);
        byteChannelSequentialBase.afterRead(iMin);
        return Boxing.boxInt(iMin);
    }

    public static /* synthetic */ Object readFully$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, ChunkBuffer chunkBuffer, int i, Continuation<? super Unit> continuation) throws Throwable {
        Intrinsics.checkNotNull(chunkBuffer, "null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
        Object fully = byteChannelSequentialBase.readFully((Buffer) chunkBuffer, i, continuation);
        return fully == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? fully : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readFullySuspend(Buffer buffer, int i, Continuation<? super Unit> continuation) throws Throwable {
        C104371 c104371;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104371) {
            c104371 = (C104371) continuation;
            int i2 = c104371.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104371.label = i2 - Integer.MIN_VALUE;
            } else {
                c104371 = new C104371(continuation);
            }
        }
        Object obj = c104371.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104371.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            c104371.L$0 = this;
            c104371.L$1 = buffer;
            c104371.I$0 = i;
            c104371.label = 1;
            if (awaitSuspend(i, c104371) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            i = c104371.I$0;
            buffer = (Buffer) c104371.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104371.L$0;
            ResultKt.throwOnFailure(obj);
        }
        c104371.L$0 = null;
        c104371.L$1 = null;
        c104371.label = 2;
        if (byteChannelSequentialBase.readFully(buffer, i, c104371) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object readAvailable$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        C104314 c104314;
        if (continuation instanceof C104314) {
            c104314 = (C104314) continuation;
            int i3 = c104314.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c104314.label = i3 - Integer.MIN_VALUE;
            } else {
                c104314 = byteChannelSequentialBase.new C104314(continuation);
            }
        }
        Object obj = c104314.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c104314.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable closedCause = byteChannelSequentialBase.getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            if (byteChannelSequentialBase.getClosed() && byteChannelSequentialBase.get_availableForRead() == 0) {
                return Boxing.boxInt(-1);
            }
            if (i2 == 0) {
                return Boxing.boxInt(0);
            }
            if (byteChannelSequentialBase.get_availableForRead() == 0) {
                c104314.L$0 = byteChannelSequentialBase;
                c104314.L$1 = bArr;
                c104314.I$0 = i;
                c104314.I$1 = i2;
                c104314.label = 1;
                if (byteChannelSequentialBase.awaitSuspend(1, c104314) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c104314.I$1;
            i = c104314.I$0;
            bArr = (byte[]) c104314.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104314.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!byteChannelSequentialBase.readable.canRead()) {
            byteChannelSequentialBase.prepareFlushedBytes();
        }
        int iMin = (int) Math.min(i2, byteChannelSequentialBase.readable.getRemaining());
        InputArraysKt.readFully((Input) byteChannelSequentialBase.readable, bArr, i, iMin);
        byteChannelSequentialBase.afterRead(iMin);
        return Boxing.boxInt(iMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object readFully$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) throws Throwable {
        C104366 c104366;
        if (continuation instanceof C104366) {
            c104366 = (C104366) continuation;
            int i3 = c104366.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c104366.label = i3 - Integer.MIN_VALUE;
            } else {
                c104366 = byteChannelSequentialBase.new C104366(continuation);
            }
        }
        Object available = c104366.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c104366.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(available);
            c104366.L$0 = byteChannelSequentialBase;
            c104366.L$1 = bArr;
            c104366.I$0 = i;
            c104366.I$1 = i2;
            c104366.label = 1;
            available = byteChannelSequentialBase.readAvailable(bArr, i, i2, c104366);
            if (available == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(available);
                return Unit.INSTANCE;
            }
            i2 = c104366.I$1;
            i = c104366.I$0;
            bArr = (byte[]) c104366.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104366.L$0;
            ResultKt.throwOnFailure(available);
        }
        int iIntValue = ((Number) available).intValue();
        if (iIntValue == i2) {
            return Unit.INSTANCE;
        }
        if (iIntValue == -1) {
            throw new EOFException("Unexpected end of stream");
        }
        c104366.L$0 = null;
        c104366.L$1 = null;
        c104366.label = 2;
        if (byteChannelSequentialBase.readFullySuspend(bArr, i + iIntValue, i2 - iIntValue, c104366) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readFullySuspend(byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) throws Throwable {
        C104382 c104382;
        ByteChannelSequentialBase byteChannelSequentialBase;
        byte[] bArr2;
        int i3;
        int i4;
        int i5;
        if (continuation instanceof C104382) {
            c104382 = (C104382) continuation;
            int i6 = c104382.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c104382.label = i6 - Integer.MIN_VALUE;
            } else {
                c104382 = new C104382(continuation);
            }
        }
        Object obj = c104382.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c104382.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialBase = this;
            bArr2 = bArr;
            i3 = 0;
            i4 = i2;
            i5 = i;
            if (i3 >= i4) {
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c104382.I$2;
            int i8 = c104382.I$1;
            i5 = c104382.I$0;
            byte[] bArr3 = (byte[]) c104382.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104382.L$0;
            ResultKt.throwOnFailure(obj);
            C104382 c1043822 = c104382;
            int i9 = i8;
            bArr2 = bArr3;
            C104382 c1043823 = c1043822;
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue == -1) {
                i3 += iIntValue;
                i4 = i9;
                c104382 = c1043823;
                if (i3 >= i4) {
                    c104382.L$0 = byteChannelSequentialBase;
                    c104382.L$1 = bArr2;
                    c104382.I$0 = i5;
                    c104382.I$1 = i4;
                    c104382.I$2 = i3;
                    c104382.label = 1;
                    Object available = byteChannelSequentialBase.readAvailable(bArr2, i5 + i3, i4 - i3, c104382);
                    if (available == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c1043822 = c104382;
                    i9 = i4;
                    obj = available;
                    C104382 c10438232 = c1043822;
                    int iIntValue2 = ((Number) obj).intValue();
                    if (iIntValue2 == -1) {
                        throw new EOFException("Unexpected end of stream");
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static /* synthetic */ Object readBoolean$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Continuation<? super Boolean> continuation) {
        if (byteChannelSequentialBase.readable.canRead()) {
            boolean z = byteChannelSequentialBase.readable.readByte() == 1;
            byteChannelSequentialBase.afterRead(1);
            return Boxing.boxBoolean(z);
        }
        return byteChannelSequentialBase.readBooleanSlow(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readBooleanSlow(Continuation<? super Boolean> continuation) throws Throwable {
        C104321 c104321;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104321) {
            c104321 = (C104321) continuation;
            int i = c104321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104321.label = i - Integer.MIN_VALUE;
            } else {
                c104321 = new C104321(continuation);
            }
        }
        Object obj = c104321.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104321.L$0 = this;
            c104321.label = 1;
            if (awaitSuspend(1, c104321) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104321.L$0;
            ResultKt.throwOnFailure(obj);
        }
        checkClosed$default(byteChannelSequentialBase, 1, null, 2, null);
        c104321.L$0 = null;
        c104321.label = 2;
        obj = byteChannelSequentialBase.readBoolean(c104321);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }

    public final void completeReading() {
        ChunkBuffer lastReadView = getLastReadView();
        int lastReadAvailable$delegate = getLastReadAvailable$delegate() - (lastReadView.getWritePosition() - lastReadView.getReadPosition());
        if (getLastReadView() != Buffer.INSTANCE.getEmpty()) {
            UnsafeKt.completeReadHead(this.readable, getLastReadView());
        }
        if (lastReadAvailable$delegate > 0) {
            afterRead(lastReadAvailable$delegate);
        }
        setLastReadAvailable(0);
        setLastReadView(ChunkBuffer.INSTANCE.getEmpty());
    }

    public static /* synthetic */ Object await$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, int i, Continuation<? super Boolean> continuation) {
        if (i < 0) {
            throw new IllegalArgumentException(("atLeast parameter shouldn't be negative: " + i).toString());
        }
        long j = i;
        if (j > ByteChannelSequentialKt.EXPECTED_CAPACITY) {
            throw new IllegalArgumentException(("atLeast parameter shouldn't be larger than max buffer size of 4088: " + i).toString());
        }
        byteChannelSequentialBase.completeReading();
        if (i == 0) {
            return Boxing.boxBoolean(!byteChannelSequentialBase.isClosedForRead());
        }
        return byteChannelSequentialBase.readable.getRemaining() >= j ? Boxing.boxBoolean(true) : byteChannelSequentialBase.awaitSuspend(i, continuation);
    }

    @Nullable
    public final Object awaitInternalAtLeast1$ktor_io(@NotNull Continuation<? super Boolean> continuation) {
        if (!(!this.readable.getEndOfInput())) {
            return awaitSuspend(1, continuation);
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitSuspend(int i, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        C104271 c104271;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104271) {
            c104271 = (C104271) continuation;
            int i2 = c104271.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104271.label = i2 - Integer.MIN_VALUE;
            } else {
                c104271 = new C104271(continuation);
            }
        }
        Object obj = c104271.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104271.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (i < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c104271.L$0 = this;
            c104271.I$0 = i;
            c104271.label = 1;
            if (awaitAtLeastNBytesAvailableForRead$ktor_io(i, c104271) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c104271.I$0;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104271.L$0;
            ResultKt.throwOnFailure(obj);
        }
        byteChannelSequentialBase.prepareFlushedBytes();
        Throwable closedCause = byteChannelSequentialBase.getClosedCause();
        if (closedCause == null) {
            return Boxing.boxBoolean(!byteChannelSequentialBase.isClosedForRead() && byteChannelSequentialBase.get_availableForRead() >= i);
        }
        throw closedCause;
    }

    @Override // io.ktor.utils.p050io.ReadSession
    public int discard(int n) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        if (n == 0) {
            return 0;
        }
        int iDiscard = this.readable.discard(n);
        afterRead(n);
        requestNextView(1);
        return iDiscard;
    }

    @Override // io.ktor.utils.p050io.ReadSession
    @Nullable
    public ChunkBuffer request(int atLeast) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        completeReading();
        return requestNextView(atLeast);
    }

    public final ChunkBuffer requestNextView(int atLeast) {
        if (this.readable.getEndOfInput()) {
            prepareFlushedBytes();
        }
        ChunkBuffer chunkBufferPrepareReadHead$ktor_io = this.readable.prepareReadHead$ktor_io(atLeast);
        if (chunkBufferPrepareReadHead$ktor_io == null) {
            setLastReadView(ChunkBuffer.INSTANCE.getEmpty());
            setLastReadAvailable(0);
        } else {
            setLastReadView(chunkBufferPrepareReadHead$ktor_io);
            setLastReadAvailable(chunkBufferPrepareReadHead$ktor_io.getWritePosition() - chunkBufferPrepareReadHead$ktor_io.getReadPosition());
        }
        return chunkBufferPrepareReadHead$ktor_io;
    }

    public static /* synthetic */ Object discard$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, long j, Continuation<? super Long> continuation) throws Throwable {
        long jDiscard = byteChannelSequentialBase.readable.discard(j);
        byteChannelSequentialBase.afterRead((int) jDiscard);
        if (jDiscard == j || byteChannelSequentialBase.isClosedForRead()) {
            byteChannelSequentialBase.ensureNotFailed();
            return Boxing.boxLong(jDiscard);
        }
        return byteChannelSequentialBase.discardSuspend(j, jDiscard, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r2.isClosedForRead() == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object discardSuspend(long j, long j2, Continuation<? super Long> continuation) throws Throwable {
        C104291 c104291;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104291) {
            c104291 = (C104291) continuation;
            int i = c104291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104291.label = i - Integer.MIN_VALUE;
            } else {
                c104291 = new C104291(continuation);
            }
        }
        Object objAwait = c104291.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            byteChannelSequentialBase = this;
            c104291.L$0 = byteChannelSequentialBase;
            c104291.J$0 = j;
            c104291.J$1 = j2;
            c104291.label = 1;
            objAwait = byteChannelSequentialBase.await(1, c104291);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) objAwait).booleanValue()) {
            }
            byteChannelSequentialBase.ensureNotFailed();
            return Boxing.boxLong(j2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = c104291.J$1;
        long j4 = c104291.J$0;
        byteChannelSequentialBase = (ByteChannelSequentialBase) c104291.L$0;
        ResultKt.throwOnFailure(objAwait);
        j = j4;
        j2 = j3;
        if (((Boolean) objAwait).booleanValue()) {
            long jDiscard = byteChannelSequentialBase.readable.discard(j - j2);
            byteChannelSequentialBase.afterRead((int) jDiscard);
            j2 += jDiscard;
            if (j2 < j) {
            }
        }
        byteChannelSequentialBase.ensureNotFailed();
        return Boxing.boxLong(j2);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Deprecated(message = "Use read instead.")
    public void readSession(@NotNull Function1<? super ReadSession, Unit> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        try {
            consumer.invoke(this);
        } finally {
            completeReading();
        }
    }

    @Override // io.ktor.utils.p050io.HasReadSession
    public void endReadSession() {
        completeReading();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [io.ktor.utils.io.ByteChannelSequentialBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [io.ktor.utils.io.ByteChannelSequentialBase] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Unit] */
    @Deprecated(message = "Use read instead.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object readSuspendableSession$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Function2<? super SuspendableReadSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        C104441 c104441;
        ByteChannelSequentialBase byteChannelSequentialBase2;
        if (continuation instanceof C104441) {
            c104441 = (C104441) continuation;
            int i = c104441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104441.label = i - Integer.MIN_VALUE;
            } else {
                c104441 = new C104441(continuation);
            }
        }
        Object obj = c104441.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104441.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                c104441.L$0 = byteChannelSequentialBase;
                c104441.label = 1;
                Object objInvoke = function2.invoke(byteChannelSequentialBase, c104441);
                byteChannelSequentialBase2 = byteChannelSequentialBase;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ByteChannelSequentialBase byteChannelSequentialBase3 = (ByteChannelSequentialBase) c104441.L$0;
                ResultKt.throwOnFailure(obj);
                byteChannelSequentialBase2 = byteChannelSequentialBase3;
            }
            byteChannelSequentialBase2.completeReading();
            byteChannelSequentialBase = Unit.INSTANCE;
            return byteChannelSequentialBase;
        } catch (Throwable th) {
            byteChannelSequentialBase.completeReading();
            throw th;
        }
    }

    public static /* synthetic */ <A extends Appendable> Object readUTF8LineTo$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, A a2, int i, Continuation<? super Boolean> continuation) throws Throwable {
        if (byteChannelSequentialBase.isClosedForRead()) {
            Throwable closedCause = byteChannelSequentialBase.getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            return Boxing.boxBoolean(false);
        }
        return UTF8Kt.decodeUTF8LineLoopSuspend(a2, i, byteChannelSequentialBase.new C104462(null), new Function1<Integer, Unit>() { // from class: io.ktor.utils.io.ByteChannelSequentialBase.readUTF8LineTo.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i2) {
                ByteChannelSequentialBase.this.afterRead(i2);
            }
        }, continuation);
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\f\b\u0000\u0010\u0002*\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u008a@"}, m7105d2 = {"<anonymous>", "Lio/ktor/utils/io/core/Input;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "size", ""}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase$readUTF8LineTo$2", m7120f = "ByteChannelSequential.kt", m7121i = {}, m7122l = {721}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialBase$readUTF8LineTo$2 */
    /* loaded from: classes7.dex */
    public static final class C104462 extends SuspendLambda implements Function2<Integer, Continuation<? super Input>, Object> {
        public /* synthetic */ int I$0;
        public int label;

        public C104462(Continuation<? super C104462> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C104462 c104462 = ByteChannelSequentialBase.this.new C104462(continuation);
            c104462.I$0 = ((Number) obj).intValue();
            return c104462;
        }

        @Nullable
        public final Object invoke(int i, @Nullable Continuation<? super Input> continuation) {
            return ((C104462) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Input> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.I$0;
                ByteChannelSequentialBase byteChannelSequentialBase = ByteChannelSequentialBase.this;
                this.label = 1;
                obj = byteChannelSequentialBase.await(i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return ByteChannelSequentialBase.this.getReadable();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object readUTF8Line$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, int i, Continuation<? super String> continuation) throws Throwable {
        C104451 c104451;
        StringBuilder sb;
        if (continuation instanceof C104451) {
            c104451 = (C104451) continuation;
            int i2 = c104451.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104451.label = i2 - Integer.MIN_VALUE;
            } else {
                c104451 = byteChannelSequentialBase.new C104451(continuation);
            }
        }
        Object obj = c104451.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104451.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            StringBuilder sb2 = new StringBuilder();
            c104451.L$0 = sb2;
            c104451.label = 1;
            Object uTF8LineTo = byteChannelSequentialBase.readUTF8LineTo(sb2, i, c104451);
            if (uTF8LineTo == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = uTF8LineTo;
            sb = sb2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = (StringBuilder) c104451.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb.toString();
        }
        return null;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    public boolean cancel(@Nullable Throwable cause) {
        if (getClosedCause() != null || getClosed()) {
            return false;
        }
        if (cause == null) {
            cause = new CancellationException("Channel cancelled");
        }
        return close(cause);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    public boolean close(@Nullable Throwable cause) {
        if (!C2081xc40028dd.m347m(_closed$FU, this, null, cause == null ? CloseElementKt.getCLOSED_SUCCESS() : new CloseElement(cause))) {
            return false;
        }
        if (cause != null) {
            this.readable.release();
            this.writable.release();
            this.flushBuffer.release();
        } else {
            flush();
            this.writable.release();
        }
        this.slot.cancel(cause);
        return true;
    }

    public final long transferTo$ktor_io(@NotNull ByteChannelSequentialBase dst, long limit) throws Throwable {
        Intrinsics.checkNotNullParameter(dst, "dst");
        long remaining = this.readable.getRemaining();
        if (remaining > limit) {
            return 0L;
        }
        dst.writable.writePacket(this.readable);
        int i = (int) remaining;
        dst.afterWrite(i);
        afterRead(i);
        return remaining;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeAvailableSuspend(ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) throws Throwable {
        C104481 c104481;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104481) {
            c104481 = (C104481) continuation;
            int i = c104481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104481.label = i - Integer.MIN_VALUE;
            } else {
                c104481 = new C104481(continuation);
            }
        }
        Object objWriteAvailable = c104481.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104481.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWriteAvailable);
            c104481.L$0 = this;
            c104481.L$1 = chunkBuffer;
            c104481.label = 1;
            if (awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104481) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objWriteAvailable);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chunkBuffer = (ChunkBuffer) c104481.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104481.L$0;
            ResultKt.throwOnFailure(objWriteAvailable);
        }
        c104481.L$0 = null;
        c104481.L$1 = null;
        c104481.label = 2;
        objWriteAvailable = byteChannelSequentialBase.writeAvailable(chunkBuffer, c104481);
        return objWriteAvailable == coroutine_suspended ? coroutine_suspended : objWriteAvailable;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeAvailableSuspend(byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        C104492 c104492;
        ByteChannelSequentialBase byteChannelSequentialBase;
        if (continuation instanceof C104492) {
            c104492 = (C104492) continuation;
            int i3 = c104492.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c104492.label = i3 - Integer.MIN_VALUE;
            } else {
                c104492 = new C104492(continuation);
            }
        }
        Object objWriteAvailable = c104492.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c104492.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objWriteAvailable);
            c104492.L$0 = this;
            c104492.L$1 = bArr;
            c104492.I$0 = i;
            c104492.I$1 = i2;
            c104492.label = 1;
            if (awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104492) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialBase = this;
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.throwOnFailure(objWriteAvailable);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c104492.I$1;
            i = c104492.I$0;
            bArr = (byte[]) c104492.L$1;
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104492.L$0;
            ResultKt.throwOnFailure(objWriteAvailable);
        }
        c104492.L$0 = null;
        c104492.L$1 = null;
        c104492.label = 2;
        objWriteAvailable = byteChannelSequentialBase.writeAvailable(bArr, i, i2, c104492);
        return objWriteAvailable == coroutine_suspended ? coroutine_suspended : objWriteAvailable;
    }

    public final void afterWrite(int count) throws Throwable {
        addBytesWritten(count);
        if (getClosed()) {
            this.writable.release();
            ensureNotClosed();
        }
        if (getAutoFlush() || getAvailableForWrite() == 0) {
            flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object awaitFreeSpace$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Continuation<? super Unit> continuation) throws Throwable {
        C104261 c104261;
        if (continuation instanceof C104261) {
            c104261 = (C104261) continuation;
            int i = c104261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104261.label = i - Integer.MIN_VALUE;
            } else {
                c104261 = byteChannelSequentialBase.new C104261(continuation);
            }
        }
        Object obj = c104261.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialBase.flush();
            c104261.L$0 = byteChannelSequentialBase;
            c104261.label = 1;
            if (byteChannelSequentialBase.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104261) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannelSequentialBase = (ByteChannelSequentialBase) c104261.L$0;
            ResultKt.throwOnFailure(obj);
        }
        byteChannelSequentialBase.ensureNotClosed();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object awaitContent$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, Continuation<? super Unit> continuation) {
        Object objAwait = byteChannelSequentialBase.await(1, continuation);
        return objAwait == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    /* renamed from: peekTo-lBXzO7A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15412peekTolBXzO7A(@NotNull ByteBuffer byteBuffer, long j, long j2, long j3, long j4, @NotNull Continuation<? super Long> continuation) throws Throwable {
        ByteChannelSequentialBase$peekTo$1 byteChannelSequentialBase$peekTo$1;
        Ref.LongRef longRef;
        if (continuation instanceof ByteChannelSequentialBase$peekTo$1) {
            byteChannelSequentialBase$peekTo$1 = (ByteChannelSequentialBase$peekTo$1) continuation;
            int i = byteChannelSequentialBase$peekTo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$peekTo$1.label = i - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$peekTo$1 = new ByteChannelSequentialBase$peekTo$1(this, continuation);
            }
        }
        Object obj = byteChannelSequentialBase$peekTo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = byteChannelSequentialBase$peekTo$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef2 = new Ref.LongRef();
            Function2<? super SuspendableReadSession, ? super Continuation<? super Unit>, ? extends Object> byteChannelSequentialBase$peekTo$2 = new ByteChannelSequentialBase$peekTo$2(j3, j2, longRef2, j4, byteBuffer, j, null);
            byteChannelSequentialBase$peekTo$1.L$0 = longRef2;
            byteChannelSequentialBase$peekTo$1.label = 1;
            if (readSuspendableSession(byteChannelSequentialBase$peekTo$2, byteChannelSequentialBase$peekTo$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            longRef = longRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) byteChannelSequentialBase$peekTo$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxLong(longRef.element);
    }

    public static /* synthetic */ Object writeAvailable$suspendImpl(ByteChannelSequentialBase byteChannelSequentialBase, ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) throws Throwable {
        int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
        if (writePosition == 0) {
            return Boxing.boxInt(0);
        }
        int iMin = Math.min(writePosition, byteChannelSequentialBase.getAvailableForWrite());
        if (iMin == 0) {
            return byteChannelSequentialBase.writeAvailableSuspend(chunkBuffer, continuation);
        }
        OutputKt.writeFully(byteChannelSequentialBase.writable, chunkBuffer, iMin);
        byteChannelSequentialBase.afterWrite(iMin);
        return Boxing.boxInt(iMin);
    }

    public final Object readFully(Buffer buffer, int i, Continuation<? super Unit> continuation) throws Throwable {
        if (i > buffer.getLimit() - buffer.getWritePosition()) {
            throw new IllegalArgumentException(("Not enough space in the destination buffer to write " + i + " bytes").toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException("n shouldn't be negative".toString());
        }
        if (getClosedCause() != null) {
            Throwable closedCause = getClosedCause();
            Intrinsics.checkNotNull(closedCause);
            throw closedCause;
        }
        if (this.readable.getRemaining() >= i) {
            InputArraysKt.readFully(this.readable, buffer, i);
            Unit unit = Unit.INSTANCE;
            afterRead(i);
            return unit;
        }
        if (getClosed()) {
            throw new EOFException("Channel is closed and not enough bytes available: required " + i + " but " + get_availableForRead() + " available");
        }
        Object fullySuspend = readFullySuspend(buffer, i, continuation);
        return fullySuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? fullySuspend : Unit.INSTANCE;
    }

    public final void addBytesRead(int count) {
        if (count < 0) {
            throw new IllegalArgumentException(("Can't read negative amount of bytes: " + count).toString());
        }
        int i = -count;
        channelSize$FU.getAndAdd(this, i);
        _totalBytesRead$FU.addAndGet(this, count);
        _availableForRead$FU.getAndAdd(this, i);
        if (this.channelSize < 0) {
            throw new IllegalStateException(("Readable bytes count is negative: " + get_availableForRead() + ", " + count + " in " + this).toString());
        }
        if (get_availableForRead() >= 0) {
            return;
        }
        throw new IllegalStateException(("Readable bytes count is negative: " + get_availableForRead() + ", " + count + " in " + this).toString());
    }

    public final void addBytesWritten(int count) {
        if (count < 0) {
            throw new IllegalArgumentException(("Can't write negative amount of bytes: " + count).toString());
        }
        channelSize$FU.getAndAdd(this, count);
        _totalBytesWritten$FU.addAndGet(this, count);
        if (this.channelSize >= 0) {
            return;
        }
        throw new IllegalStateException(("Readable bytes count is negative: " + this.channelSize + ", " + count + " in " + this).toString());
    }
}
