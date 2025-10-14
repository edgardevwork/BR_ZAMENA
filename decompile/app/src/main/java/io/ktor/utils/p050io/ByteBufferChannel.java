package io.ktor.utils.p050io;

import androidx.concurrent.futures.C2081xc40028dd;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import androidx.media3.extractor.p007ts.TsBinarySearchSeeker;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.bits.MemoryJvmKt;
import io.ktor.utils.p050io.charsets.TooLongLineException;
import io.ktor.utils.p050io.charsets.UTFKt;
import io.ktor.utils.p050io.core.Buffer;
import io.ktor.utils.p050io.core.BufferPrimitivesJvmKt;
import io.ktor.utils.p050io.core.BufferUtilsJvmKt;
import io.ktor.utils.p050io.core.ByteBuffersKt;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Output;
import io.ktor.utils.p050io.core.OutputArraysJVMKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import io.ktor.utils.p050io.internal.CancellableReusableContinuation;
import io.ktor.utils.p050io.internal.ClosedElement;
import io.ktor.utils.p050io.internal.FailedLookAhead;
import io.ktor.utils.p050io.internal.JoiningState;
import io.ktor.utils.p050io.internal.ObjectPoolKt;
import io.ktor.utils.p050io.internal.ReadSessionImpl;
import io.ktor.utils.p050io.internal.ReadWriteBufferState;
import io.ktor.utils.p050io.internal.ReadWriteBufferStateKt;
import io.ktor.utils.p050io.internal.RingBufferCapacity;
import io.ktor.utils.p050io.internal.TerminatedLookAhead;
import io.ktor.utils.p050io.internal.WriteSessionImpl;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.http.cookie.ClientCookie;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteBufferChannel.kt */
@Metadata(m7104d1 = {"\u0000Ò\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0010\u0018\u0000 ó\u00022\u00030õ\u00022\u00030ö\u00022\u00030÷\u00022\u00020k2\u00030ø\u00022\u00030ù\u0002:\u0002ó\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0003\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ/\u0010\"\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140 H\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\nH\u0000¢\u0006\u0004\b(\u0010)J\u0019\u0010-\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b/\u0010.JP\u00105\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u000526\u00104\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u000501H\u0082\b¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u00108J-\u0010@\u001a\u00020:2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010<H\u0080@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010D\u001a\u00020AH\u0000¢\u0006\u0004\bB\u0010CJ,\u0010G\u001a\u00020\u00142\u0017\u0010F\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0002\bEH\u0082Hø\u0001\u0000¢\u0006\u0004\bG\u0010HJ4\u0010I\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0002\bEH\u0082Hø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010L\u001a\u00020:2\u0006\u0010K\u001a\u00020:H\u0096@ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ#\u0010O\u001a\u00020:2\u0006\u0010N\u001a\u00020:2\u0006\u0010K\u001a\u00020:H\u0082@ø\u0001\u0000¢\u0006\u0004\bO\u0010PJA\u0010S\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010R\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0002\bEH\u0082\b¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0014H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00142\u0006\u0010W\u001a\u00020\nH\u0016¢\u0006\u0004\bX\u00108J\u0017\u0010Y\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0014H\u0016¢\u0006\u0004\b[\u0010VJ\u0017\u0010]\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\nH\u0002¢\u0006\u0004\b]\u00108J\u0011\u0010`\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\b^\u0010_J#\u0010d\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00002\u0006\u0010a\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ+\u0010e\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00002\u0006\u0010a\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<H\u0082@ø\u0001\u0000¢\u0006\u0004\be\u0010fJ.\u0010i\u001a\u00028\u0000\"\u0004\b\u0000\u0010g2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0002\bEH\u0017¢\u0006\u0004\bi\u0010jJB\u0010n\u001a\u00028\u0000\"\u0004\b\u0000\u0010g2'\u00104\u001a#\b\u0001\u0012\u0004\u0012\u00020k\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000l\u0012\u0006\u0012\u0004\u0018\u00010m01¢\u0006\u0002\bEH\u0097@ø\u0001\u0000¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\bH\u0002¢\u0006\u0004\bp\u0010qJA\u0010x\u001a\u00020:2\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020:2\u0006\u0010u\u001a\u00020:2\u0006\u0010\u001f\u001a\u00020:2\u0006\u0010K\u001a\u00020:H\u0096@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bv\u0010wJ\u001f\u0010|\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010y\u001a\u00020\nH\u0000¢\u0006\u0004\bz\u0010{J/\u0010~\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140 H\u0096@ø\u0001\u0000¢\u0006\u0004\b~\u0010#J/\u0010\u0081\u0001\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\b\b\u0002\u00107\u001a\u00020\n2\b\b\u0002\u0010K\u001a\u00020\nH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0081\u0001\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\u0001H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001J-\u0010\u0081\u0001\u001a\u00020\n2\b\u0010\u0080\u0001\u001a\u00030\u0084\u00012\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0086\u0001J \u0010\u0088\u0001\u001a\u00020\n2\b\u0010\u0080\u0001\u001a\u00030\u0087\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001f\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u008a\u0001J1\u0010\u0088\u0001\u001a\u00020\n2\b\u0010\u0080\u0001\u001a\u00030\u0084\u00012\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u008b\u0001J.\u0010\u0088\u0001\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140 H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u008c\u0001J \u0010\u008d\u0001\u001a\u00020\n2\b\u0010\u0080\u0001\u001a\u00030\u0087\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u0089\u0001J\u001f\u0010\u008d\u0001\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008a\u0001J1\u0010\u008d\u0001\u001a\u00020\n2\b\u0010\u0080\u0001\u001a\u00030\u0084\u00012\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008b\u0001J1\u0010\u008e\u0001\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140 H\u0082@ø\u0001\u0000¢\u0006\u0005\b\u008e\u0001\u0010#J\u0015\u0010\u008f\u0001\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0005\b\u008f\u0001\u0010\u001cJ\u0016\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0086@ø\u0001\u0000¢\u0006\u0005\b\u0091\u0001\u0010\u001cJ\u0016\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0086@ø\u0001\u0000¢\u0006\u0005\b\u0093\u0001\u0010\u001cJ\u0016\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0086@ø\u0001\u0000¢\u0006\u0005\b\u0095\u0001\u0010\u001cJ(\u0010\u0096\u0001\u001a\u00020\u00142\b\u0010\u0080\u0001\u001a\u00030\u0087\u00012\u0006\u0010\u0017\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001f\u0010\u0096\u0001\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u008a\u0001J1\u0010\u0096\u0001\u001a\u00020\u00142\b\u0010\u0080\u0001\u001a\u00030\u0084\u00012\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u008b\u0001J(\u0010\u0098\u0001\u001a\u00020\u00142\b\u0010\u0080\u0001\u001a\u00030\u0087\u00012\u0006\u0010\u0017\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0097\u0001J(\u0010\u0098\u0001\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\u00012\u0007\u0010\u0099\u0001\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u009a\u0001J1\u0010\u0098\u0001\u001a\u00020\u00142\b\u0010\u0080\u0001\u001a\u00030\u0084\u00012\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u008b\u0001J\u0015\u0010\u009b\u0001\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u001cJ\u0015\u0010\u009c\u0001\u001a\u00020:H\u0086@ø\u0001\u0000¢\u0006\u0005\b\u009c\u0001\u0010\u001cJ\u001e\u0010\u009e\u0001\u001a\u00030\u009d\u00012\u0006\u0010Q\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u009e\u0001\u0010\u0019J1\u0010¡\u0001\u001a\u00030\u009d\u00012\u0006\u0010Q\u001a\u00020\n2\b\u0010 \u0001\u001a\u00030\u009f\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001JC\u0010¦\u0001\u001a\u00028\u0000\"\n\b\u0000\u0010¤\u0001*\u00030£\u00012\u0006\u0010Q\u001a\u00020\n2\u0018\u0010¥\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0002\bEH\u0082Hø\u0001\u0000¢\u0006\u0005\b¦\u0001\u0010#J\u001e\u0010§\u0001\u001a\u00030\u009d\u00012\u0006\u0010;\u001a\u00020:H\u0096@ø\u0001\u0000¢\u0006\u0005\b§\u0001\u0010MJ\u001e\u0010¨\u0001\u001a\u00030\u009d\u00012\u0006\u0010;\u001a\u00020:H\u0082@ø\u0001\u0000¢\u0006\u0005\b¨\u0001\u0010MJ,\u0010ª\u0001\u001a\u00020\u00142\u0018\u0010}\u001a\u0014\u0012\u0005\u0012\u00030©\u0001\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0002\bEH\u0017¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0016\u0010\u00ad\u0001\u001a\u00030¬\u0001H\u0086@ø\u0001\u0000¢\u0006\u0005\b\u00ad\u0001\u0010\u001cJ\u001d\u0010®\u0001\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0005\b®\u0001\u0010\u0019J\u001d\u0010¯\u0001\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0005\b¯\u0001\u0010\u0019J\u001d\u0010°\u0001\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0005\b°\u0001\u0010\u0019J\u001b\u0010±\u0001\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\nH\u0082\b¢\u0006\u0006\b±\u0001\u0010²\u0001J?\u0010´\u0001\u001a\u00020\u00142(\u0010}\u001a$\b\u0001\u0012\u0005\u0012\u00030³\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140l\u0012\u0006\u0012\u0004\u0018\u00010m01¢\u0006\u0002\bEH\u0097@ø\u0001\u0000¢\u0006\u0005\b´\u0001\u0010oJ \u0010¶\u0001\u001a\u0005\u0018\u00010µ\u00012\u0006\u0010;\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0005\b¶\u0001\u0010\u0019J8\u0010»\u0001\u001a\u00020\u0005\"\u000f\b\u0000\u0010¹\u0001*\b0·\u0001j\u0003`¸\u00012\u0007\u0010º\u0001\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0006\b»\u0001\u0010¼\u0001J-\u0010½\u0001\u001a\u00020\u00052\r\u0010º\u0001\u001a\b0·\u0001j\u0003`¸\u00012\u0006\u0010;\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0006\b½\u0001\u0010¼\u0001J-\u0010¾\u0001\u001a\u00020\u00052\r\u0010º\u0001\u001a\b0·\u0001j\u0003`¸\u00012\u0006\u0010;\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0006\b¾\u0001\u0010¼\u0001J2\u0010¿\u0001\u001a\u00020\u00052\u001d\u0010!\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000501¢\u0006\u0002\bEH\u0082\b¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u001a\u0010Á\u0001\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001b\u0010Ã\u0001\u001a\u00030\u009d\u00012\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J&\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010Å\u0001\u001a\u00020\n2\u0007\u0010Æ\u0001\u001a\u00020\nH\u0016¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0012\u0010Ë\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J&\u0010Î\u0001\u001a\u0004\u0018\u00010\u00002\u0007\u0010Ì\u0001\u001a\u00020\u00002\u0007\u0010Í\u0001\u001a\u00020<H\u0002¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0011\u0010Ð\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bÐ\u0001\u0010VJ\u0011\u0010Ò\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0005\bÑ\u0001\u0010VJ\u001c\u0010Ó\u0001\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0011\u0010Õ\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bÕ\u0001\u0010VJ#\u0010Õ\u0001\u001a\u00020\u00142\u000e\u0010×\u0001\u001a\t\u0012\u0004\u0012\u00020+0Ö\u0001H\u0082\b¢\u0006\u0006\bÕ\u0001\u0010Ø\u0001J\u0011\u0010Ù\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bÙ\u0001\u0010VJ#\u0010Û\u0001\u001a\u00020<2\u0007\u0010Ú\u0001\u001a\u00020\u00002\u0006\u0010a\u001a\u00020\u0005H\u0002¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0014\u0010Ý\u0001\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u0014\u0010à\u0001\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0006\bß\u0001\u0010Þ\u0001J\u0012\u0010á\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0006\bá\u0001\u0010â\u0001J\u0013\u0010ã\u0001\u001a\u00030³\u0001H\u0016¢\u0006\u0006\bã\u0001\u0010ä\u0001J(\u0010æ\u0001\u001a\u00020m2\u0006\u0010Q\u001a\u00020\n2\r\u0010å\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050lH\u0002¢\u0006\u0005\bæ\u0001\u0010\u0019J\u0013\u0010ç\u0001\u001a\u00030µ\u0001H\u0016¢\u0006\u0006\bç\u0001\u0010è\u0001J\u001a\u0010é\u0001\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u001b\u0010ì\u0001\u001a\u00020\u00052\u0007\u0010ë\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0006\bì\u0001\u0010í\u0001J\u0012\u0010ï\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0006\bî\u0001\u0010â\u0001J\u001c\u0010ñ\u0001\u001a\u00020\n2\b\u0010ð\u0001\u001a\u00030\u009d\u0001H\u0002¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\u001d\u0010ô\u0001\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0005\bó\u0001\u0010\u0019J1\u0010õ\u0001\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140 H\u0096@ø\u0001\u0000¢\u0006\u0005\bõ\u0001\u0010#J\u001a\u0010ö\u0001\u001a\u00020\n2\u0006\u00109\u001a\u00020\u007fH\u0002¢\u0006\u0006\bö\u0001\u0010÷\u0001J\u001a\u0010ö\u0001\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0001H\u0002¢\u0006\u0006\bö\u0001\u0010\u0083\u0001J,\u0010ö\u0001\u001a\u00020\n2\u0007\u00109\u001a\u00030\u0084\u00012\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\bö\u0001\u0010\u0086\u0001J\u001f\u0010ø\u0001\u001a\u00020\n2\u0007\u00109\u001a\u00030\u0087\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010\u0089\u0001J\u001e\u0010ø\u0001\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010\u008a\u0001J0\u0010ø\u0001\u001a\u00020\n2\u0007\u00109\u001a\u00030\u0084\u00012\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010\u008b\u0001J.\u0010ø\u0001\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140 H\u0016¢\u0006\u0006\bø\u0001\u0010\u008c\u0001J\u001f\u0010ù\u0001\u001a\u00020\n2\u0007\u00109\u001a\u00030\u0087\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\bù\u0001\u0010\u0089\u0001J\u001e\u0010ù\u0001\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\bù\u0001\u0010\u008a\u0001J \u0010û\u0001\u001a\u00020\u00142\b\u0010ú\u0001\u001a\u00030\u0090\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\bû\u0001\u0010ü\u0001J \u0010þ\u0001\u001a\u00020\u00142\b\u0010ý\u0001\u001a\u00030\u0092\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J \u0010\u0081\u0002\u001a\u00020\u00142\b\u0010\u0080\u0002\u001a\u00030\u0094\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J7\u0010\u0088\u0002\u001a\u00020\u00142\u0007\u0010\u0083\u0002\u001a\u00020r2\u0007\u0010\u0084\u0002\u001a\u00020\n2\u0007\u0010\u0085\u0002\u001a\u00020\nH\u0096@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002J\u001e\u0010\u0088\u0002\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u007fH\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J\u001e\u0010\u0088\u0002\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0088\u0002\u0010\u008a\u0001J0\u0010\u0088\u0002\u001a\u00020\u00142\u0007\u00109\u001a\u00030\u0084\u00012\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0088\u0002\u0010\u008b\u0001J\u001e\u0010\u008a\u0002\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u007fH\u0082@ø\u0001\u0000¢\u0006\u0006\b\u008a\u0002\u0010\u0089\u0002J\u001e\u0010\u008a\u0002\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u008a\u0002\u0010\u008a\u0001J0\u0010\u008a\u0002\u001a\u00020\u00142\u0007\u00109\u001a\u00030\u0084\u00012\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0001J\u001e\u0010\u008c\u0002\u001a\u00020\u00142\u0007\u0010\u008b\u0002\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u008c\u0002\u0010\u0019J\u001e\u0010\u008e\u0002\u001a\u00020\u00142\u0007\u0010\u008d\u0002\u001a\u00020:H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u008e\u0002\u0010MJ \u0010\u008f\u0002\u001a\u00020\u00142\b\u0010ð\u0001\u001a\u00030\u009d\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u008f\u0002\u0010\u0090\u0002J \u0010\u0091\u0002\u001a\u00020\u00142\b\u0010ð\u0001\u001a\u00030\u009d\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0091\u0002\u0010\u0090\u0002JQ\u0010\u0093\u0002\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\n2\u0017\u0010F\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0002\bE2\u0018\u0010\u0092\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0002\bEH\u0082Hø\u0001\u0000¢\u0006\u0006\b\u0093\u0002\u0010\u0094\u0002J \u0010\u0096\u0002\u001a\u00020\u00142\b\u0010\u0095\u0002\u001a\u00030¬\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002J0\u0010\u0098\u0002\u001a\u00020\n2\u0007\u00109\u001a\u00030\u0084\u00012\u0006\u0010u\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0006\b\u0098\u0002\u0010\u008b\u0001J\u001d\u0010\u0098\u0002\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0005\b\u0098\u0002\u0010\u0019J*\u0010\u009b\u0002\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\n2\u000e\u0010\u009a\u0002\u001a\t\u0012\u0004\u0012\u00020\u00140\u0099\u0002H\u0002¢\u0006\u0006\b\u009b\u0002\u0010\u009c\u0002J\u001a\u0010\u009d\u0002\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0006\b\u009d\u0002\u0010²\u0001J>\u0010\u009e\u0002\u001a\u00020\u00142'\u00104\u001a#\b\u0001\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140l\u0012\u0006\u0012\u0004\u0018\u00010m01¢\u0006\u0002\bEH\u0097@ø\u0001\u0000¢\u0006\u0005\b\u009e\u0002\u0010oJ)\u0010\u009f\u0002\u001a\u00020\u00142\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050 H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u009f\u0002\u0010HJ7\u0010 \u0002\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050 H\u0002¢\u0006\u0006\b \u0002\u0010¡\u0002J&\u0010¢\u0002\u001a\u00020\u00052\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050 H\u0002¢\u0006\u0006\b¢\u0002\u0010£\u0002J)\u0010¤\u0002\u001a\u00020\u00142\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050 H\u0082@ø\u0001\u0000¢\u0006\u0005\b¤\u0002\u0010HJ9\u0010¦\u0002\u001a\u00020\u00142$\u0010!\u001a \u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140¥\u0002¢\u0006\u0002\bEH\u0082\b¢\u0006\u0006\b¦\u0002\u0010§\u0002J%\u0010¨\u0002\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0005\b¨\u0002\u0010)J%\u0010©\u0002\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0005\b©\u0002\u0010)J\u0015\u0010ª\u0002\u001a\u00020\u0014*\u00020\u0001H\u0002¢\u0006\u0005\bª\u0002\u0010\u0004J\u001f\u0010¬\u0002\u001a\u00020\n*\u00020\u00012\u0007\u0010«\u0002\u001a\u00020\nH\u0002¢\u0006\u0006\b¬\u0002\u0010\u00ad\u0002J(\u0010°\u0002\u001a\u00020\u0014*\u00020\u00012\u0007\u0010®\u0002\u001a\u00020\n2\u0007\u0010¯\u0002\u001a\u00020\nH\u0002¢\u0006\u0006\b°\u0002\u0010±\u0002J\u001d\u0010²\u0002\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0005\b²\u0002\u0010{J@\u0010³\u0002\u001a\u00020\u0005*\u00020\u00012\u0006\u0010Q\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010R\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0002\bEH\u0082\b¢\u0006\u0006\b³\u0002\u0010´\u0002J]\u0010µ\u0002\u001a\u00020\u0014*\u00020\u00012\u0006\u0010Q\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010F\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0002\bE2\u0018\u0010\u0092\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0002\bEH\u0082Hø\u0001\u0000¢\u0006\u0006\bµ\u0002\u0010¶\u0002R\u001b\u0010·\u0002\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0002\u0010¸\u0002R\u001d\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0006\u0010¹\u0002\u001a\u0006\bº\u0002\u0010â\u0001R\u0017\u0010½\u0002\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0002\u0010¼\u0002R\u0017\u0010¿\u0002\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0002\u0010¼\u0002R0\u0010Æ\u0002\u001a\u0005\u0018\u00010À\u00022\n\u0010Á\u0002\u001a\u0005\u0018\u00010À\u00028B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bÂ\u0002\u0010Ã\u0002\"\u0006\bÄ\u0002\u0010Å\u0002R\u0019\u0010É\u0002\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010È\u0002R\u0017\u0010Ê\u0002\u001a\u00020\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0002\u0010â\u0001R\u0017\u0010Ë\u0002\u001a\u00020\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010â\u0001R\u001b\u0010Í\u0001\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Ì\u0002R\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Í\u0002R:\u0010Ò\u0002\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010l2\u000f\u0010Á\u0002\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010l8B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bÎ\u0002\u0010Ï\u0002\"\u0006\bÐ\u0002\u0010Ñ\u0002R\u0019\u0010Ó\u0002\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0002\u0010Ô\u0002R\u001f\u0010ª\u0001\u001a\u00030Õ\u00028\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bª\u0001\u0010Ö\u0002\u0012\u0005\b×\u0002\u0010VR\u001e\u0010Ù\u0002\u001a\t\u0012\u0004\u0012\u00020\u00050Ø\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0002\u0010Ú\u0002R\u001d\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u000b\u0010Ô\u0002\u001a\u0006\bÛ\u0002\u0010¼\u0002R\u0016\u0010Ý\u0002\u001a\u00020A8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0002\u0010CR2\u0010ß\u0002\u001a\u00020:2\u0007\u0010Þ\u0002\u001a\u00020:8\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\bß\u0002\u0010à\u0002\u001a\u0006\bá\u0002\u0010â\u0002\"\u0006\bã\u0002\u0010ä\u0002R2\u0010å\u0002\u001a\u00020:2\u0007\u0010Þ\u0002\u001a\u00020:8\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\bå\u0002\u0010à\u0002\u001a\u0006\bæ\u0002\u0010â\u0002\"\u0006\bç\u0002\u0010ä\u0002R:\u0010ê\u0002\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010l2\u000f\u0010Á\u0002\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010l8B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bè\u0002\u0010Ï\u0002\"\u0006\bé\u0002\u0010Ñ\u0002R\u0019\u0010ë\u0002\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0002\u0010Ô\u0002R\u0018\u0010í\u0002\u001a\u00030ì\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0002\u0010î\u0002R\u001e\u0010ï\u0002\u001a\t\u0012\u0004\u0012\u00020\u00140Ø\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0002\u0010Ú\u0002R)\u0010ð\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140l\u0012\u0004\u0012\u00020m0 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0002\u0010ñ\u0002R\u0019\u0010ò\u0002\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0002\u0010Ô\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006ô\u0002"}, m7105d2 = {"Lio/ktor/utils/io/ByteBufferChannel;", "Ljava/nio/ByteBuffer;", "content", SegmentConstantPool.INITSTRING, "(Ljava/nio/ByteBuffer;)V", "", "autoFlush", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/internal/ReadWriteBufferState$Initial;", "pool", "", "reservedSize", "(ZLio/ktor/utils/io/pool/ObjectPool;I)V", "buffer", "Lio/ktor/utils/io/internal/RingBufferCapacity;", "capacity", "afterBufferVisited", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/RingBufferCapacity;)I", "Lkotlinx/coroutines/Job;", "job", "", "attachJob", "(Lkotlinx/coroutines/Job;)V", "n", "awaitAtLeast", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitAtLeastSuspend", "awaitClose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitContent", "awaitFreeSpace", "min", "Lkotlin/Function1;", "block", "awaitFreeSpaceOrDelegate", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/WriterSuspendSession;", "beginWriteSession", "()Lio/ktor/utils/io/WriterSuspendSession;", CatchStreamerKeys.COUNT_KEY, "bytesWrittenFromSession$ktor_io", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/RingBufferCapacity;I)V", "bytesWrittenFromSession", "", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "close", "last", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "visitor", "consumeEachBufferRangeFast", "(ZLkotlin/jvm/functions/Function2;)Z", "consumed", "(I)V", "src", "", "limit", "Lio/ktor/utils/io/internal/JoiningState;", "joined", "copyDirect$ktor_io", "(Lio/ktor/utils/io/ByteBufferChannel;JLio/ktor/utils/io/internal/JoiningState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyDirect", "Lio/ktor/utils/io/internal/ReadWriteBufferState;", "currentState$ktor_io", "()Lio/ktor/utils/io/internal/ReadWriteBufferState;", "currentState", "Lkotlin/ExtensionFunctionType;", "channelWriter", "delegatePrimitive", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delegateSuspend", "(Lio/ktor/utils/io/internal/JoiningState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "max", ClientCookie.DISCARD_ATTR, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discarded0", "discardSuspend", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "size", "writer", "doWritePrimitive", "(ILjava/nio/ByteBuffer;Lio/ktor/utils/io/internal/RingBufferCapacity;Lkotlin/jvm/functions/Function1;)V", "endReadSession", "()V", "written", "endWriteSession", "ensureClosedJoined", "(Lio/ktor/utils/io/internal/JoiningState;)V", "flush", "minWriteSize", "flushImpl", "getJoining$ktor_io", "()Lio/ktor/utils/io/internal/JoiningState;", "getJoining", "delegateClose", "joinFrom$ktor_io", "(Lio/ktor/utils/io/ByteBufferChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinFrom", "joinFromSuspend", "(Lio/ktor/utils/io/ByteBufferChannel;ZLio/ktor/utils/io/internal/JoiningState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "Lio/ktor/utils/io/LookAheadSession;", "lookAhead", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lio/ktor/utils/io/LookAheadSuspendSession;", "Lkotlin/coroutines/Continuation;", "", "lookAheadSuspend", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newBuffer", "()Lio/ktor/utils/io/internal/ReadWriteBufferState$Initial;", "Lio/ktor/utils/io/bits/Memory;", FirebaseAnalytics.Param.DESTINATION, "destinationOffset", TypedValues.CycleType.S_WAVE_OFFSET, "peekTo-lBXzO7A", "(Ljava/nio/ByteBuffer;JJJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "peekTo", "lockedSpace", "prepareWriteBuffer$ktor_io", "(Ljava/nio/ByteBuffer;I)V", "prepareWriteBuffer", "consumer", "read", "Lio/ktor/utils/io/core/Buffer;", "dst", "readAsMuchAsPossible", "(Lio/ktor/utils/io/core/Buffer;II)I", "(Ljava/nio/ByteBuffer;)I", "", CacheFileMetadataIndex.COLUMN_LENGTH, "([BII)I", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "readAvailable", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(ILkotlin/jvm/functions/Function1;)I", "readAvailableSuspend", "readBlockSuspend", "readBoolean", "", "readByte", "", "readDouble", "", "readFloat", "readFully", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFullySuspend", "rc0", "(Ljava/nio/ByteBuffer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readInt", "readLong", "Lio/ktor/utils/io/core/ByteReadPacket;", "readPacket", "Lio/ktor/utils/io/core/BytePacketBuilder;", "builder", "readPacketSuspend", "(ILio/ktor/utils/io/core/BytePacketBuilder;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ExifInterface.GPS_DIRECTION_TRUE, "getter", "readPrimitive", "readRemaining", "readRemainingSuspend", "Lio/ktor/utils/io/ReadSession;", "readSession", "(Lkotlin/jvm/functions/Function1;)V", "", "readShort", "readSuspend", "readSuspendImpl", "readSuspendLoop", "readSuspendPredicate", "(I)Z", "Lio/ktor/utils/io/SuspendableReadSession;", "readSuspendableSession", "", "readUTF8Line", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "out", "readUTF8LineTo", "(Ljava/lang/Appendable;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readUTF8LineToAscii", "readUTF8LineToUtf8Suspend", "reading", "(Lkotlin/jvm/functions/Function2;)Z", "releaseBuffer", "(Lio/ktor/utils/io/internal/ReadWriteBufferState$Initial;)V", "remainingPacket", "(J)Lio/ktor/utils/io/core/ByteReadPacket;", "skip", "atLeast", "request", "(II)Ljava/nio/ByteBuffer;", "resolveChannelInstance$ktor_io", "()Lio/ktor/utils/io/ByteBufferChannel;", "resolveChannelInstance", "current", "joining", "resolveDelegation", "(Lio/ktor/utils/io/ByteBufferChannel;Lio/ktor/utils/io/internal/JoiningState;)Lio/ktor/utils/io/ByteBufferChannel;", "restoreStateAfterRead", "restoreStateAfterWrite$ktor_io", "restoreStateAfterWrite", "resumeClosed", "(Ljava/lang/Throwable;)V", "resumeReadOp", "Lkotlin/Function0;", "exception", "(Lkotlin/jvm/functions/Function0;)V", "resumeWriteOp", "delegate", "setupDelegateTo", "(Lio/ktor/utils/io/ByteBufferChannel;Z)Lio/ktor/utils/io/internal/JoiningState;", "setupStateForRead", "()Ljava/nio/ByteBuffer;", "setupStateForWrite$ktor_io", "setupStateForWrite", "shouldResumeReadOp", "()Z", "startReadSession", "()Lio/ktor/utils/io/SuspendableReadSession;", "continuation", "suspensionForSize", "toString", "()Ljava/lang/String;", "tryCompleteJoining", "(Lio/ktor/utils/io/internal/JoiningState;)Z", "forceTermination", "tryReleaseBuffer", "(Z)Z", "tryTerminate$ktor_io", "tryTerminate", "packet", "tryWritePacketPart", "(Lio/ktor/utils/io/core/ByteReadPacket;)I", "tryWriteSuspend$ktor_io", "tryWriteSuspend", "write", "writeAsMuchAsPossible", "(Lio/ktor/utils/io/core/Buffer;)I", "writeAvailable", "writeAvailableSuspend", "b", "writeByte", "(BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "writeDouble", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "writeFloat", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "memory", "startIndex", "endIndex", "writeFully-JT6ljtQ", "(Ljava/nio/ByteBuffer;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeFully", "(Lio/ktor/utils/io/core/Buffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeFullySuspend", "i", "writeInt", "l", "writeLong", "writePacket", "(Lio/ktor/utils/io/core/ByteReadPacket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writePacketSuspend", "bufferWriter", "writePrimitive", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "writeShort", "(SLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeSuspend", "Lkotlinx/coroutines/CancellableContinuation;", "c", "writeSuspendBlock", "(ILkotlinx/coroutines/CancellableContinuation;)V", "writeSuspendPredicate", "writeSuspendSession", "writeWhile", "writeWhileLoop", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/RingBufferCapacity;Lkotlin/jvm/functions/Function1;)Z", "writeWhileNoSuspend", "(Lkotlin/jvm/functions/Function1;)Z", "writeWhileSuspend", "Lkotlin/Function3;", "writing", "(Lkotlin/jvm/functions/Function3;)V", "bytesRead", "bytesWritten", "carry", "idx", "carryIndex", "(Ljava/nio/ByteBuffer;I)I", "position", "available", "prepareBuffer", "(Ljava/nio/ByteBuffer;II)V", "rollBytes", "tryWritePrimitive", "(Ljava/nio/ByteBuffer;ILio/ktor/utils/io/internal/RingBufferCapacity;Lkotlin/jvm/functions/Function1;)Z", "writeSuspendPrimitive", "(Ljava/nio/ByteBuffer;ILio/ktor/utils/io/internal/RingBufferCapacity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachedJob", "Lkotlinx/coroutines/Job;", "Z", "getAutoFlush", "getAvailableForRead", "()I", "availableForRead", "getAvailableForWrite", "availableForWrite", "Lio/ktor/utils/io/internal/ClosedElement;", "value", "getClosed", "()Lio/ktor/utils/io/internal/ClosedElement;", "setClosed", "(Lio/ktor/utils/io/internal/ClosedElement;)V", "closed", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "isClosedForWrite", "Lio/ktor/utils/io/internal/JoiningState;", "Lio/ktor/utils/io/pool/ObjectPool;", "getReadOp", "()Lkotlin/coroutines/Continuation;", "setReadOp", "(Lkotlin/coroutines/Continuation;)V", "readOp", "readPosition", "I", "Lio/ktor/utils/io/internal/ReadSessionImpl;", "Lio/ktor/utils/io/internal/ReadSessionImpl;", "getReadSession$annotations", "Lio/ktor/utils/io/internal/CancellableReusableContinuation;", "readSuspendContinuationCache", "Lio/ktor/utils/io/internal/CancellableReusableContinuation;", "getReservedSize$ktor_io", "getState", "state", "<set-?>", "totalBytesRead", "J", "getTotalBytesRead", "()J", "setTotalBytesRead$ktor_io", "(J)V", "totalBytesWritten", "getTotalBytesWritten", "setTotalBytesWritten$ktor_io", "getWriteOp", "setWriteOp", "writeOp", "writePosition", "Lio/ktor/utils/io/internal/WriteSessionImpl;", "writeSession", "Lio/ktor/utils/io/internal/WriteSessionImpl;", "writeSuspendContinuationCache", "writeSuspension", "Lkotlin/jvm/functions/Function1;", "writeSuspensionSize", "Companion", "ktor-io", "Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lio/ktor/utils/io/HasReadSession;", "Lio/ktor/utils/io/HasWriteSession;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nByteBufferChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteBufferChannel.kt\nio/ktor/utils/io/ByteBufferChannel\n+ 2 RingBufferCapacity.kt\nio/ktor/utils/io/internal/RingBufferCapacity\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 5 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 6 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 7 Packet.kt\nio/ktor/utils/io/core/PacketKt\n+ 8 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 9 Output.kt\nio/ktor/utils/io/core/OutputKt\n+ 10 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,2411:1\n2110#1,2:2436\n459#1,4:2443\n466#1,2:2448\n464#1:2450\n459#1,4:2451\n466#1,2:2456\n464#1:2458\n459#1,4:2463\n466#1,2:2468\n464#1:2470\n459#1,4:2472\n466#1,2:2477\n464#1:2479\n849#1,4:2481\n459#1,4:2485\n466#1,2:2490\n464#1:2492\n853#1,15:2493\n849#1,4:2508\n459#1,4:2512\n466#1,2:2517\n464#1:2519\n853#1,15:2520\n849#1,4:2535\n459#1,4:2539\n466#1,2:2544\n464#1:2546\n853#1,15:2547\n849#1,4:2562\n459#1,4:2566\n466#1,2:2571\n464#1:2573\n853#1,15:2574\n849#1,4:2589\n459#1,4:2593\n466#1,2:2598\n464#1:2600\n853#1,15:2601\n849#1,4:2616\n459#1,4:2620\n466#1,2:2625\n464#1:2627\n853#1,15:2628\n459#1,4:2643\n466#1,2:2648\n464#1:2650\n964#1:2651\n966#1:2653\n1036#1,7:2654\n929#1,2:2661\n1043#1,2:2663\n931#1:2665\n1045#1:2666\n967#1,76:2667\n929#1,2:2743\n1043#1,2:2745\n931#1:2747\n1045#1:2748\n1030#1,3:2749\n979#1,32:2752\n1033#1:2784\n972#1:2785\n964#1:2786\n966#1:2788\n1036#1,7:2789\n929#1,2:2796\n1043#1,2:2798\n931#1:2800\n1045#1:2801\n967#1,76:2802\n929#1,2:2878\n1043#1,2:2880\n931#1:2882\n1045#1:2883\n1030#1,3:2884\n979#1,32:2887\n1033#1:2919\n972#1:2920\n964#1:2921\n966#1:2923\n1036#1,7:2924\n929#1,2:2931\n1043#1,2:2933\n931#1:2935\n1045#1:2936\n967#1,76:2937\n929#1,2:3013\n1043#1,2:3015\n931#1:3017\n1045#1:3018\n1030#1,3:3019\n979#1,32:3022\n1033#1:3054\n972#1:3055\n964#1:3056\n966#1:3058\n1036#1,7:3059\n929#1,2:3066\n1043#1,2:3068\n931#1:3070\n1045#1:3071\n967#1,76:3072\n929#1,2:3148\n1043#1,2:3150\n931#1:3152\n1045#1:3153\n1030#1,3:3154\n979#1,32:3157\n1033#1:3189\n972#1:3190\n1036#1,7:3191\n929#1,2:3198\n1043#1,2:3200\n931#1:3202\n1045#1:3203\n979#1,32:3204\n1019#1,24:3236\n929#1,2:3260\n1043#1,2:3262\n931#1:3264\n1045#1:3265\n1030#1,3:3266\n979#1,32:3269\n1033#1:3301\n993#1,18:3302\n1036#1,7:3320\n929#1,2:3327\n1043#1,2:3329\n931#1:3331\n1045#1:3332\n979#1,32:3333\n929#1,3:3365\n440#1:3370\n441#1,7:3372\n459#1,4:3381\n466#1,2:3386\n464#1:3388\n449#1,8:3389\n440#1:3397\n441#1,7:3399\n449#1,8:3407\n440#1:3415\n441#1,7:3417\n449#1,8:3426\n440#1:3434\n441#1,7:3436\n449#1,8:3444\n440#1:3452\n441#1,16:3454\n440#1:3470\n441#1,16:3472\n440#1:3488\n441#1,16:3490\n459#1,4:3506\n466#1,2:3511\n464#1:3513\n459#1,4:3515\n466#1,2:3520\n464#1:3522\n459#1,4:3523\n466#1,2:3528\n464#1:3530\n440#1:3533\n441#1,16:3535\n459#1,4:3551\n466#1,2:3556\n464#1:3558\n459#1,4:3559\n466#1,2:3564\n464#1:3566\n459#1,4:3569\n466#1,2:3574\n464#1:3576\n2197#1,3:3628\n2201#1,3:3632\n2341#1,3:3636\n2345#1:3640\n2197#1,3:3641\n2201#1,3:3645\n2346#1,5:3648\n2197#1,7:3653\n2197#1,3:3660\n2201#1,3:3664\n2341#1,3:3679\n2345#1,6:3683\n12#2:2412\n18#2:2413\n18#2:2415\n12#2:2416\n18#2:2421\n12#2:2429\n12#2:2431\n12#2:2442\n12#2:2447\n12#2:2455\n12#2:2461\n12#2:2467\n12#2:2476\n12#2:2489\n12#2:2516\n12#2:2543\n12#2:2570\n12#2:2597\n12#2:2624\n12#2:2647\n18#2:3379\n18#2:3380\n12#2:3385\n18#2:3406\n18#2:3425\n18#2:3443\n12#2:3510\n12#2:3514\n12#2:3519\n12#2:3527\n12#2:3555\n12#2:3563\n12#2:3567\n12#2:3568\n12#2:3573\n12#2:3577\n12#2:3622\n12#2:3623\n12#2:3624\n12#2:3625\n12#2:3626\n12#2:3627\n12#2:3631\n12#2:3635\n12#2:3644\n12#2:3663\n18#2:3667\n1#3:2414\n1#3:2652\n1#3:2787\n1#3:2922\n1#3:3057\n1#3:3371\n1#3:3398\n1#3:3416\n1#3:3435\n1#3:3453\n1#3:3471\n1#3:3489\n1#3:3534\n1#3:3639\n1#3:3682\n186#4,4:2417\n186#4,4:2422\n186#4,3:2426\n189#4:2430\n186#4,4:2432\n164#4,4:2438\n74#5:2459\n74#5:2462\n69#5:3424\n74#5:3589\n74#5:3611\n361#6:2460\n361#6:2471\n361#6:2480\n355#6:3368\n355#6:3369\n43#7:3531\n43#7:3532\n12#8,7:3578\n19#8,4:3596\n12#8,7:3600\n19#8,4:3618\n488#9,4:3585\n492#9,6:3590\n488#9,4:3607\n492#9,6:3612\n314#10,11:3668\n*S KotlinDebug\n*F\n+ 1 ByteBufferChannel.kt\nio/ktor/utils/io/ByteBufferChannel\n*L\n377#1:2436,2\n474#1:2443,4\n474#1:2448,2\n474#1:2450\n512#1:2451,4\n512#1:2456,2\n512#1:2458\n539#1:2463,4\n539#1:2468,2\n539#1:2470\n637#1:2472,4\n637#1:2477,2\n637#1:2479\n822#1:2481,4\n822#1:2485,4\n822#1:2490,2\n822#1:2492\n822#1:2493,15\n826#1:2508,4\n826#1:2512,4\n826#1:2517,2\n826#1:2519\n826#1:2520,15\n830#1:2535,4\n830#1:2539,4\n830#1:2544,2\n830#1:2546\n830#1:2547,15\n834#1:2562,4\n834#1:2566,4\n834#1:2571,2\n834#1:2573\n834#1:2574,15\n838#1:2589,4\n838#1:2593,4\n838#1:2598,2\n838#1:2600\n838#1:2601,15\n842#1:2616,4\n842#1:2620,4\n842#1:2625,2\n842#1:2627\n842#1:2628,15\n852#1:2643,4\n852#1:2648,2\n852#1:2650\n936#1:2651\n936#1:2653\n936#1:2654,7\n936#1:2661,2\n936#1:2663,2\n936#1:2665\n936#1:2666\n936#1:2667,76\n936#1:2743,2\n936#1:2745,2\n936#1:2747\n936#1:2748\n936#1:2749,3\n936#1:2752,32\n936#1:2784\n936#1:2785\n940#1:2786\n940#1:2788\n940#1:2789,7\n940#1:2796,2\n940#1:2798,2\n940#1:2800\n940#1:2801\n940#1:2802,76\n940#1:2878,2\n940#1:2880,2\n940#1:2882\n940#1:2883\n940#1:2884,3\n940#1:2887,32\n940#1:2919\n940#1:2920\n944#1:2921\n944#1:2923\n944#1:2924,7\n944#1:2931,2\n944#1:2933,2\n944#1:2935\n944#1:2936\n944#1:2937,76\n944#1:3013,2\n944#1:3015,2\n944#1:3017\n944#1:3018\n944#1:3019,3\n944#1:3022,32\n944#1:3054\n944#1:3055\n948#1:3056\n948#1:3058\n948#1:3059,7\n948#1:3066,2\n948#1:3068,2\n948#1:3070\n948#1:3071\n948#1:3072,76\n948#1:3148,2\n948#1:3150,2\n948#1:3152\n948#1:3153\n948#1:3154,3\n948#1:3157,32\n948#1:3189\n948#1:3190\n966#1:3191,7\n966#1:3198,2\n966#1:3200,2\n966#1:3202\n966#1:3203\n969#1:3204,32\n970#1:3236,24\n970#1:3260,2\n970#1:3262,2\n970#1:3264\n970#1:3265\n970#1:3266,3\n970#1:3269,32\n970#1:3301\n983#1:3302,18\n1029#1:3320,7\n1029#1:3327,2\n1029#1:3329,2\n1029#1:3331\n1029#1:3332\n1032#1:3333,32\n1042#1:3365,3\n1196#1:3370\n1196#1:3372,7\n1209#1:3381,4\n1209#1:3386,2\n1209#1:3388\n1196#1:3389,8\n1322#1:3397\n1322#1:3399,7\n1322#1:3407,8\n1352#1:3415\n1352#1:3417,7\n1352#1:3426,8\n1376#1:3434\n1376#1:3436,7\n1376#1:3444,8\n1455#1:3452\n1455#1:3454,16\n1525#1:3470\n1525#1:3472,16\n1535#1:3488\n1535#1:3490,16\n1640#1:3506,4\n1640#1:3511,2\n1640#1:3513\n1675#1:3515,4\n1675#1:3520,2\n1675#1:3522\n1693#1:3523,4\n1693#1:3528,2\n1693#1:3530\n1754#1:3533\n1754#1:3535,16\n1775#1:3551,4\n1775#1:3556,2\n1775#1:3558\n1796#1:3559,4\n1796#1:3564,2\n1796#1:3566\n1902#1:3569,4\n1902#1:3574,2\n1902#1:3576\n2209#1:3628,3\n2209#1:3632,3\n2225#1:3636,3\n2225#1:3640\n2225#1:3641,3\n2225#1:3645,3\n2225#1:3648,5\n2225#1:3653,7\n2231#1:3660,3\n2231#1:3664,3\n2326#1:3679,3\n2326#1:3683,6\n95#1:2412\n98#1:2413\n181#1:2415\n182#1:2416\n269#1:2421\n302#1:2429\n309#1:2431\n462#1:2442\n474#1:2447\n512#1:2455\n531#1:2461\n539#1:2467\n637#1:2476\n822#1:2489\n826#1:2516\n830#1:2543\n834#1:2570\n838#1:2597\n842#1:2624\n852#1:2647\n1198#1:3379\n1202#1:3380\n1209#1:3385\n1338#1:3406\n1364#1:3425\n1387#1:3443\n1640#1:3510\n1641#1:3514\n1675#1:3519\n1693#1:3527\n1775#1:3555\n1796#1:3563\n1858#1:3567\n1880#1:3568\n1902#1:3573\n1930#1:3577\n2139#1:3622\n2158#1:3623\n2164#1:3624\n2179#1:3625\n2184#1:3626\n2199#1:3627\n2209#1:3631\n2221#1:3635\n2225#1:3644\n2231#1:3663\n2258#1:3667\n936#1:2652\n940#1:2787\n944#1:2922\n948#1:3057\n1196#1:3371\n1322#1:3398\n1352#1:3416\n1376#1:3435\n1455#1:3453\n1525#1:3471\n1535#1:3489\n1754#1:3534\n2225#1:3639\n2326#1:3682\n224#1:2417,4\n276#1:2422,4\n292#1:2426,3\n292#1:2430\n316#1:2432,4\n398#1:2438,4\n513#1:2459\n505#1:2462\n1356#1:3424\n2072#1:3589\n2087#1:3611\n531#1:2460\n607#1:2471\n723#1:2480\n1099#1:3368\n1122#1:3369\n1725#1:3531\n1741#1:3532\n2069#1:3578,7\n2069#1:3596,4\n2084#1:3600,7\n2084#1:3618,4\n2071#1:3585,4\n2071#1:3590,6\n2086#1:3607,4\n2086#1:3612,6\n2311#1:3668,11\n*E\n"})
/* loaded from: classes6.dex */
public class ByteBufferChannel implements ByteChannel, ByteReadChannel, ByteWriteChannel, LookAheadSuspendSession, HasReadSession, HasWriteSession {
    public static final int ReservedLongIndex = -8;

    @NotNull
    private volatile /* synthetic */ Object _closed;

    @NotNull
    private volatile /* synthetic */ Object _readOp;

    @NotNull
    private volatile /* synthetic */ Object _state;

    @NotNull
    volatile /* synthetic */ Object _writeOp;

    @Nullable
    private volatile Job attachedJob;
    public final boolean autoFlush;

    @Nullable
    private volatile JoiningState joining;

    @NotNull
    public final ObjectPool<ReadWriteBufferState.Initial> pool;
    public int readPosition;

    @NotNull
    public final ReadSessionImpl readSession;

    @NotNull
    public final CancellableReusableContinuation<Boolean> readSuspendContinuationCache;
    public final int reservedSize;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    public int writePosition;

    @NotNull
    public final WriteSessionImpl writeSession;

    @NotNull
    public final CancellableReusableContinuation<Unit> writeSuspendContinuationCache;

    @NotNull
    public final Function1<Continuation<? super Unit>, Object> writeSuspension;
    private volatile int writeSuspensionSize;
    public static final /* synthetic */ AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_state");
    public static final /* synthetic */ AtomicReferenceFieldUpdater _closed$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_closed");
    public static final /* synthetic */ AtomicReferenceFieldUpdater _readOp$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_readOp");
    public static final /* synthetic */ AtomicReferenceFieldUpdater _writeOp$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_writeOp");

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0}, m7122l = {1871}, m7123m = "awaitAtLeastSuspend", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$awaitAtLeastSuspend$1 */
    /* loaded from: classes5.dex */
    public static final class C103811 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C103811(Continuation<? super C103811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.awaitAtLeastSuspend(0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0}, m7122l = {1512, 1513}, m7123m = "awaitFreeSpaceOrDelegate", m7124n = {"this", "block", "min"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$awaitFreeSpaceOrDelegate$1 */
    /* loaded from: classes5.dex */
    public static final class C103821 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103821(Continuation<? super C103821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.awaitFreeSpaceOrDelegate(0, null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0}, m7122l = {1702}, m7123m = "discardSuspend", m7124n = {"this", "discarded", "max"}, m7125s = {"L$0", "L$1", "J$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$discardSuspend$1 */
    /* loaded from: classes5.dex */
    public static final class C103831 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103831(Continuation<? super C103831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.discardSuspend(0L, 0L, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0}, m7122l = {1163, 1171}, m7123m = "joinFromSuspend", m7124n = {"this", "src", "delegateClose"}, m7125s = {"L$0", "L$1", "Z$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$joinFromSuspend$1 */
    /* loaded from: classes5.dex */
    public static final class C103841 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C103841(Continuation<? super C103841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.joinFromSuspend(null, false, null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {2, 2, 2, 2, 5, 5}, m7122l = {1790, 1792, 1797, 1802, 1804, 1808}, m7123m = "lookAheadSuspend$suspendImpl", m7124n = {"$this", "visitor", "result", "this_$iv", "$this", "result"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$lookAheadSuspend$1 */
    /* loaded from: classes5.dex */
    public static final class C103851<R> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C103851(Continuation<? super C103851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.lookAheadSuspend$suspendImpl(ByteBufferChannel.this, null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0, 0}, m7122l = {729, 733}, m7123m = "readAvailableSuspend", m7124n = {"this", "dst", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH}, m7125s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$1 */
    /* loaded from: classes5.dex */
    public static final class C103861 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103861(Continuation<? super C103861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readAvailableSuspend(null, 0, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {737, 741}, m7123m = "readAvailableSuspend", m7124n = {"this", "dst"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$2 */
    /* loaded from: classes5.dex */
    public static final class C103872 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103872(Continuation<? super C103872> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readAvailableSuspend((ByteBuffer) null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {745, 749}, m7123m = "readAvailableSuspend", m7124n = {"this", "dst"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readAvailableSuspend$3 */
    /* loaded from: classes5.dex */
    public static final class C103883 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103883(Continuation<? super C103883> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readAvailableSuspend((ChunkBuffer) null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0}, m7122l = {1710, 1718}, m7123m = "readBlockSuspend", m7124n = {"this", "block", "min"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readBlockSuspend$1 */
    /* loaded from: classes5.dex */
    public static final class C103891 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103891(Continuation<? super C103891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readBlockSuspend(0, null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {}, m7122l = {818}, m7123m = "readBoolean", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readBoolean$1 */
    /* loaded from: classes5.dex */
    public static final class C103901 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C103901(Continuation<? super C103901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readBoolean(this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {2437}, m7123m = "readByte", m7124n = {"this_$iv", "size$iv"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readByte$1 */
    /* loaded from: classes5.dex */
    public static final class C103911 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C103911(Continuation<? super C103911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readByte(this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {2437}, m7123m = "readDouble", m7124n = {"this_$iv", "size$iv"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readDouble$1 */
    /* loaded from: classes5.dex */
    public static final class C103921 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C103921(Continuation<? super C103921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readDouble(this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {2437}, m7123m = "readFloat", m7124n = {"this_$iv", "size$iv"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readFloat$1 */
    /* loaded from: classes5.dex */
    public static final class C103931 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C103931(Continuation<? super C103931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readFloat(this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0}, m7122l = {585}, m7123m = "readFullySuspend", m7124n = {"this", "dst", "copied"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readFullySuspend$1 */
    /* loaded from: classes5.dex */
    public static final class C103941 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103941(Continuation<? super C103941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readFullySuspend((ByteBuffer) null, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0, 0}, m7122l = {TypedValues.MotionType.TYPE_DRAW_PATH}, m7123m = "readFullySuspend", m7124n = {"this", "dst", "n", "copied"}, m7125s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readFullySuspend$2 */
    /* loaded from: classes5.dex */
    public static final class C103952 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103952(Continuation<? super C103952> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readFullySuspend((ChunkBuffer) null, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0, 0, 0}, m7122l = {622}, m7123m = "readFullySuspend", m7124n = {"this", "dst", "currentOffset", "currentLength", "consumed"}, m7125s = {"L$0", "L$1", "I$0", "I$1", "I$2"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readFullySuspend$3 */
    /* loaded from: classes5.dex */
    public static final class C103963 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103963(Continuation<? super C103963> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readFullySuspend(null, 0, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {2437}, m7123m = "readInt", m7124n = {"this_$iv", "size$iv"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readInt$1 */
    /* loaded from: classes5.dex */
    public static final class C103971 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C103971(Continuation<? super C103971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readInt(this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {2437}, m7123m = "readLong", m7124n = {"this_$iv", "size$iv"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readLong$1 */
    /* loaded from: classes5.dex */
    public static final class C103981 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C103981(Continuation<? super C103981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readLong(this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0, 0}, m7122l = {800}, m7123m = "readPacketSuspend", m7124n = {"this", "builder", "buffer", "remaining"}, m7125s = {"L$0", "L$1", "L$2", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readPacketSuspend$1 */
    /* loaded from: classes5.dex */
    public static final class C103991 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C103991(Continuation<? super C103991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readPacketSuspend(0, null, null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0, 0, 0}, m7122l = {2093}, m7123m = "readRemainingSuspend", m7124n = {"this", "builder$iv", "remaining", "$this$writeWhile$iv", "tail$iv"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readRemainingSuspend$1 */
    /* loaded from: classes5.dex */
    public static final class C104001 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C104001(Continuation<? super C104001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readRemainingSuspend(0L, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {2437}, m7123m = "readShort", m7124n = {"this_$iv", "size$iv"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readShort$1 */
    /* loaded from: classes5.dex */
    public static final class C104021 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104021(Continuation<? super C104021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readShort(this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {2236}, m7123m = "readSuspendImpl", m7124n = {"this", "size"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readSuspendImpl$1 */
    /* loaded from: classes5.dex */
    public static final class C104031 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104031(Continuation<? super C104031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readSuspendImpl(0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {2189}, m7123m = "readSuspendLoop", m7124n = {"this", "size"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readSuspendLoop$1 */
    /* loaded from: classes5.dex */
    public static final class C104041 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104041(Continuation<? super C104041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readSuspendLoop(0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0}, m7122l = {2055}, m7123m = "readUTF8Line$suspendImpl", m7124n = {"sb"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readUTF8Line$1 */
    /* loaded from: classes5.dex */
    public static final class C104061 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104061(Continuation<? super C104061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.readUTF8Line$suspendImpl(ByteBufferChannel.this, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, m7122l = {1960, 2036}, m7123m = "readUTF8LineToUtf8Suspend", m7124n = {"this", "out", "consumed", "required", "caret", "newLine", P2ArtifactParser.RuleHandler.OUTPUT, "transferBuffer", "transferredRemaining", "limit", "this", "consumed", "caret", "newLine"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readUTF8LineToUtf8Suspend$1 */
    /* loaded from: classes5.dex */
    public static final class C104071 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C104071(Continuation<? super C104071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.readUTF8LineToUtf8Suspend(null, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0}, m7122l = {1507}, m7123m = "write$suspendImpl", m7124n = {"$this", "block", "min"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$write$1 */
    /* loaded from: classes5.dex */
    public static final class C104101 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104101(Continuation<? super C104101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.write$suspendImpl(ByteBufferChannel.this, 0, null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {1072, 1074, 1076}, m7123m = "writeAvailableSuspend", m7124n = {"this", "src"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeAvailableSuspend$1 */
    /* loaded from: classes5.dex */
    public static final class C104111 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104111(Continuation<? super C104111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeAvailableSuspend((ByteBuffer) null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {1080, 1082, 1084}, m7123m = "writeAvailableSuspend", m7124n = {"this", "src"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeAvailableSuspend$3 */
    /* loaded from: classes5.dex */
    public static final class C104123 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104123(Continuation<? super C104123> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeAvailableSuspend((ChunkBuffer) null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, m7122l = {936, 936, 936, 2426, 2481, 936, 936, 2508}, m7123m = "writeByte$suspendImpl", m7124n = {"joined$iv$iv", "this_$iv$iv$iv", "b", "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", "b", "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", "b"}, m7125s = {"L$0", "L$1", "B$0", "L$0", "L$1", "L$2", "B$0", "I$0", "L$0", "L$1", "B$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeByte$1 */
    /* loaded from: classes5.dex */
    public static final class C104131 extends ContinuationImpl {
        public byte B$0;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C104131(Continuation<? super C104131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.writeByte$suspendImpl(ByteBufferChannel.this, (byte) 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {1113, 1115}, m7123m = "writeFullySuspend", m7124n = {"this", "src"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104141 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104141(Continuation<? super C104141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeFullySuspend((ByteBuffer) null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {1123, 1125}, m7123m = "writeFullySuspend", m7124n = {"this", "src"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$3 */
    /* loaded from: classes7.dex */
    public static final class C104153 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104153(Continuation<? super C104153> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeFullySuspend((Buffer) null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0, 0}, m7122l = {1422}, m7123m = "writeFullySuspend", m7124n = {"this", "src", "currentOffset", "currentLength"}, m7125s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeFullySuspend$5 */
    /* loaded from: classes7.dex */
    public static final class C104165 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104165(Continuation<? super C104165> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeFullySuspend(null, 0, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, m7122l = {944, 944, 944, 2426, 2481, 944, 944, 2508}, m7123m = "writeInt$suspendImpl", m7124n = {"joined$iv$iv", "this_$iv$iv$iv", "i", "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", "i", "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", "i"}, m7125s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeInt$1 */
    /* loaded from: classes7.dex */
    public static final class C104171 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C104171(Continuation<? super C104171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.writeInt$suspendImpl(ByteBufferChannel.this, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, m7122l = {948, 948, 948, 2426, 2481, 948, 948, 2508}, m7123m = "writeLong$suspendImpl", m7124n = {"joined$iv$iv", "this_$iv$iv$iv", "l", "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", "l", "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", "l"}, m7125s = {"L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "J$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeLong$1 */
    /* loaded from: classes7.dex */
    public static final class C104181 extends ContinuationImpl {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C104181(Continuation<? super C104181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.writeLong$suspendImpl(ByteBufferChannel.this, 0L, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 1}, m7122l = {1742, 1744}, m7123m = "writePacketSuspend", m7124n = {"this", "packet", "packet"}, m7125s = {"L$0", "L$1", "L$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writePacketSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104191 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104191(Continuation<? super C104191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writePacketSuspend(null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {3, 3, 3, 4, 4, 4, 4, 4, 7, 7, 7}, m7122l = {TsBinarySearchSeeker.MINIMUM_SEARCH_RANGE_BYTES, TsBinarySearchSeeker.MINIMUM_SEARCH_RANGE_BYTES, TsBinarySearchSeeker.MINIMUM_SEARCH_RANGE_BYTES, 2426, 2481, TsBinarySearchSeeker.MINIMUM_SEARCH_RANGE_BYTES, TsBinarySearchSeeker.MINIMUM_SEARCH_RANGE_BYTES, 2508}, m7123m = "writeShort$suspendImpl", m7124n = {"joined$iv$iv", "this_$iv$iv$iv", "s", "capacity$iv", "this_$iv$iv", "$this$writeSuspendPrimitive$iv$iv", "s", "size$iv", "joined$iv$iv$iv", "this_$iv$iv$iv$iv", "s"}, m7125s = {"L$0", "L$1", "S$0", "L$0", "L$1", "L$2", "S$0", "I$0", "L$0", "L$1", "S$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeShort$1 */
    /* loaded from: classes7.dex */
    public static final class C104201 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public short S$0;
        public int label;
        public /* synthetic */ Object result;

        public C104201(Continuation<? super C104201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.writeShort$suspendImpl(ByteBufferChannel.this, (short) 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0, 0}, m7122l = {1439, 1441}, m7123m = "writeSuspend", m7124n = {"this", "src", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH}, m7125s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104211 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104211(Continuation<? super C104211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeSuspend(null, 0, 0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0}, m7122l = {2412}, m7123m = "writeSuspend", m7124n = {"this", "size"}, m7125s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeSuspend$3 */
    /* loaded from: classes7.dex */
    public static final class C104223 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104223(Continuation<? super C104223> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeSuspend(0, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0}, m7122l = {1835}, m7123m = "writeSuspendSession$suspendImpl", m7124n = {"session"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeSuspendSession$1 */
    /* loaded from: classes7.dex */
    public static final class C104231 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104231(Continuation<? super C104231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.writeSuspendSession$suspendImpl(ByteBufferChannel.this, null, this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {1537, 1549}, m7123m = "writeWhileSuspend", m7124n = {"this", "block", "continueWriting", "this_$iv", "current$iv", "capacity$iv", "capacity", "dst", "$this$writeWhileSuspend_u24lambda_u2497", "before$iv"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0"})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$writeWhileSuspend$1 */
    /* loaded from: classes7.dex */
    public static final class C104241 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C104241(Continuation<? super C104241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.writeWhileSuspend(null, this);
        }
    }

    public static /* synthetic */ void getReadSession$annotations() {
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
    @Deprecated(message = "Use read { } instead.")
    @Nullable
    public <R> Object lookAheadSuspend(@NotNull Function2<? super LookAheadSuspendSession, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        return lookAheadSuspend$suspendImpl(this, function2, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    /* renamed from: peekTo-lBXzO7A */
    public Object mo15412peekTolBXzO7A(@NotNull ByteBuffer byteBuffer, long j, long j2, long j3, long j4, @NotNull Continuation<? super Long> continuation) {
        return m15410peekTolBXzO7A$suspendImpl(this, byteBuffer, j, j2, j3, j4, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object read(int i, @NotNull Function1<? super ByteBuffer, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return read$suspendImpl(this, i, function1, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readAvailable(@NotNull ChunkBuffer chunkBuffer, @NotNull Continuation<? super Integer> continuation) {
        return readAvailable$suspendImpl(this, chunkBuffer, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readAvailable(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Integer> continuation) {
        return readAvailable$suspendImpl(this, byteBuffer, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readAvailable(@NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Integer> continuation) {
        return readAvailable$suspendImpl(this, bArr, i, i2, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readFully(@NotNull ChunkBuffer chunkBuffer, int i, @NotNull Continuation<? super Unit> continuation) {
        return readFully$suspendImpl(this, chunkBuffer, i, continuation);
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
    @Deprecated(message = "Use read { } instead.")
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
        return readUTF8LineToAscii(a2, i, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object write(int i, @NotNull Function1<? super ByteBuffer, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return write$suspendImpl(this, i, function1, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeAvailable(@NotNull ChunkBuffer chunkBuffer, @NotNull Continuation<? super Integer> continuation) {
        return writeAvailable$suspendImpl(this, chunkBuffer, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeAvailable(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Integer> continuation) {
        return writeAvailable$suspendImpl(this, byteBuffer, continuation);
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
    public Object writeFully(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Unit> continuation) {
        return writeFully$suspendImpl(this, byteBuffer, continuation);
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
        return m15411writeFullyJT6ljtQ$suspendImpl(this, byteBuffer, i, i2, continuation);
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

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeWhile(@NotNull Function1<? super ByteBuffer, Boolean> function1, @NotNull Continuation<? super Unit> continuation) {
        return writeWhile$suspendImpl(this, function1, continuation);
    }

    public ByteBufferChannel(boolean z, @NotNull ObjectPool<ReadWriteBufferState.Initial> pool, int i) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.autoFlush = z;
        this.pool = pool;
        this.reservedSize = i;
        this._state = ReadWriteBufferState.IdleEmpty.INSTANCE;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.readSession = new ReadSessionImpl(this);
        this.writeSession = new WriteSessionImpl(this);
        this.readSuspendContinuationCache = new CancellableReusableContinuation<>();
        this.writeSuspendContinuationCache = new CancellableReusableContinuation<>();
        this.writeSuspension = new Function1<Continuation<? super Unit>, Object>() { // from class: io.ktor.utils.io.ByteBufferChannel$writeSuspension$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Object invoke(@NotNull Continuation<? super Unit> ucont) throws Throwable {
                Throwable sendException;
                Intrinsics.checkNotNullParameter(ucont, "ucont");
                int i2 = this.this$0.writeSuspensionSize;
                while (true) {
                    ClosedElement closed = this.this$0.getClosed();
                    if (closed != null && (sendException = closed.getSendException()) != null) {
                        ByteBufferChannelKt.rethrowClosed(sendException);
                        throw new KotlinNothingValueException();
                    }
                    if (!this.this$0.writeSuspendPredicate(i2)) {
                        Result.Companion companion = Result.INSTANCE;
                        ucont.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
                        break;
                    }
                    ByteBufferChannel byteBufferChannel = this.this$0;
                    Continuation continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(ucont);
                    ByteBufferChannel byteBufferChannel2 = this.this$0;
                    while (byteBufferChannel.getWriteOp() == null) {
                        if (!byteBufferChannel2.writeSuspendPredicate(i2)) {
                            break;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ByteBufferChannel._writeOp$FU;
                        if (C2081xc40028dd.m347m(atomicReferenceFieldUpdater, byteBufferChannel, null, continuationIntercepted)) {
                            if (byteBufferChannel2.writeSuspendPredicate(i2) || !C2081xc40028dd.m347m(atomicReferenceFieldUpdater, byteBufferChannel, continuationIntercepted, null)) {
                                break;
                            }
                        }
                    }
                    throw new IllegalStateException("Operation is already in progress".toString());
                }
                this.this$0.flushImpl(i2);
                if (this.this$0.shouldResumeReadOp()) {
                    this.this$0.resumeReadOp();
                }
                return IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
        };
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    public boolean getAutoFlush() {
        return this.autoFlush;
    }

    public /* synthetic */ ByteBufferChannel(boolean z, ObjectPool objectPool, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? ObjectPoolKt.getBufferObjectPool() : objectPool, (i2 & 4) != 0 ? 8 : i);
    }

    /* renamed from: getReservedSize$ktor_io, reason: from getter */
    public final int getReservedSize() {
        return this.reservedSize;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel(@NotNull ByteBuffer content) {
        this(false, ObjectPoolKt.getBufferObjectNoPool(), 0);
        Intrinsics.checkNotNullParameter(content, "content");
        ByteBuffer byteBufferSlice = content.slice();
        Intrinsics.checkNotNullExpressionValue(byteBufferSlice, "content.slice()");
        ReadWriteBufferState.Initial initial = new ReadWriteBufferState.Initial(byteBufferSlice, 0);
        initial.capacity.resetForRead();
        this._state = initial.startWriting$ktor_io();
        restoreStateAfterWrite$ktor_io();
        ByteWriteChannelKt.close(this);
        tryTerminate$ktor_io();
    }

    public final ReadWriteBufferState getState() {
        return (ReadWriteBufferState) this._state;
    }

    public final ClosedElement getClosed() {
        return (ClosedElement) this._closed;
    }

    public final void setClosed(ClosedElement closedElement) {
        this._closed = closedElement;
    }

    public final Continuation<Boolean> getReadOp() {
        return (Continuation) this._readOp;
    }

    public final void setReadOp(Continuation<? super Boolean> continuation) {
        this._readOp = continuation;
    }

    public final Continuation<Unit> getWriteOp() {
        return (Continuation) this._writeOp;
    }

    public final void setWriteOp(Continuation<? super Unit> continuation) {
        this._writeOp = continuation;
    }

    @NotNull
    public final ReadWriteBufferState currentState$ktor_io() {
        return getState();
    }

    @Nullable
    /* renamed from: getJoining$ktor_io, reason: from getter */
    public final JoiningState getJoining() {
        return this.joining;
    }

    @Override // io.ktor.utils.p050io.ByteChannel
    @Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
    public void attachJob(@NotNull Job job) {
        Intrinsics.checkNotNullParameter(job, "job");
        Job job2 = this.attachedJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.attachedJob = job;
        Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new Function1<Throwable, Unit>() { // from class: io.ktor.utils.io.ByteBufferChannel.attachJob.1
            public C103801() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable Throwable th) {
                ByteBufferChannel.this.attachedJob = null;
                if (th == null) {
                    return;
                }
                ByteBufferChannel.this.cancel(ExceptionUtilsKt.unwrapCancellationException(th));
            }
        }, 2, null);
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "cause", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$attachJob$1 */
    /* loaded from: classes5.dex */
    public static final class C103801 extends Lambda implements Function1<Throwable, Unit> {
        public C103801() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@Nullable Throwable th) {
            ByteBufferChannel.this.attachedJob = null;
            if (th == null) {
                return;
            }
            ByteBufferChannel.this.cancel(ExceptionUtilsKt.unwrapCancellationException(th));
        }
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    /* renamed from: getAvailableForRead */
    public int get_availableForRead() {
        return getState().capacity._availableForRead$internal;
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    public int getAvailableForWrite() {
        return getState().capacity._availableForWrite$internal;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    public boolean isClosedForRead() {
        return getState() == ReadWriteBufferState.Terminated.INSTANCE && getClosed() != null;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel, io.ktor.utils.p050io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return getClosed() != null;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    public long getTotalBytesRead() {
        return this.totalBytesRead;
    }

    public void setTotalBytesRead$ktor_io(long j) {
        this.totalBytesRead = j;
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public void setTotalBytesWritten$ktor_io(long j) {
        this.totalBytesWritten = j;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel, io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Throwable getClosedCause() {
        ClosedElement closed = getClosed();
        if (closed != null) {
            return closed.getCause();
        }
        return null;
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    public boolean close(@Nullable Throwable cause) {
        ClosedElement closedElement;
        JoiningState joiningState;
        if (getClosed() != null) {
            return false;
        }
        if (cause == null) {
            closedElement = ClosedElement.INSTANCE.getEmptyCause();
        } else {
            closedElement = new ClosedElement(cause);
        }
        getState().capacity.flush();
        if (!C2081xc40028dd.m347m(_closed$FU, this, null, closedElement)) {
            return false;
        }
        getState().capacity.flush();
        if (getState().capacity.isEmpty() || cause != null) {
            tryTerminate$ktor_io();
        }
        resumeClosed(cause);
        if (getState() == ReadWriteBufferState.Terminated.INSTANCE && (joiningState = this.joining) != null) {
            ensureClosedJoined(joiningState);
        }
        if (cause != null) {
            Job job = this.attachedJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.readSuspendContinuationCache.close(cause);
            this.writeSuspendContinuationCache.close(cause);
            return true;
        }
        this.writeSuspendContinuationCache.close(new ClosedWriteChannelException(ByteBufferChannelKt.DEFAULT_CLOSE_MESSAGE));
        this.readSuspendContinuationCache.close((CancellableReusableContinuation<Boolean>) Boolean.valueOf(getState().capacity.flush()));
        return true;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    public boolean cancel(@Nullable Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel has been cancelled");
        }
        return close(cause);
    }

    public final void flushImpl(int minWriteSize) {
        ReadWriteBufferState state;
        ReadWriteBufferState.Terminated terminated;
        ByteBufferChannel delegatedTo;
        JoiningState joiningState = this.joining;
        if (joiningState != null && (delegatedTo = joiningState.getDelegatedTo()) != null) {
            delegatedTo.flush();
        }
        do {
            state = getState();
            terminated = ReadWriteBufferState.Terminated.INSTANCE;
            if (state == terminated) {
                return;
            } else {
                state.capacity.flush();
            }
        } while (state != getState());
        int i = state.capacity._availableForWrite$internal;
        if (state.capacity._availableForRead$internal >= 1) {
            resumeReadOp();
        }
        JoiningState joiningState2 = this.joining;
        if (i >= minWriteSize) {
            if (joiningState2 == null || getState() == terminated) {
                resumeWriteOp();
            }
        }
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    public void flush() {
        flushImpl(1);
    }

    public final void prepareWriteBuffer$ktor_io(@NotNull ByteBuffer buffer, int lockedSpace) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        prepareBuffer(buffer, this.writePosition, lockedSpace);
    }

    public final void prepareBuffer(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        byteBuffer.limit(RangesKt___RangesKt.coerceAtMost(i2 + i, byteBuffer.capacity() - this.reservedSize));
        byteBuffer.position(i);
    }

    @Nullable
    public final ByteBuffer setupStateForWrite$ktor_io() throws Throwable {
        Object obj;
        ReadWriteBufferState readWriteBufferState;
        ReadWriteBufferState.IdleEmpty idleEmpty;
        ReadWriteBufferState readWriteBufferStateStartWriting$ktor_io;
        Continuation<Unit> writeOp = getWriteOp();
        if (writeOp != null) {
            throw new IllegalStateException("Write operation is already in progress: " + writeOp);
        }
        ReadWriteBufferState readWriteBufferState2 = null;
        ReadWriteBufferState.Initial initialNewBuffer = null;
        do {
            obj = this._state;
            readWriteBufferState = (ReadWriteBufferState) obj;
            if (this.joining != null) {
                if (initialNewBuffer != null) {
                    releaseBuffer(initialNewBuffer);
                }
                return null;
            }
            if (getClosed() != null) {
                if (initialNewBuffer != null) {
                    releaseBuffer(initialNewBuffer);
                }
                ClosedElement closed = getClosed();
                Intrinsics.checkNotNull(closed);
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new KotlinNothingValueException();
            }
            idleEmpty = ReadWriteBufferState.IdleEmpty.INSTANCE;
            if (readWriteBufferState == idleEmpty) {
                if (initialNewBuffer == null) {
                    initialNewBuffer = newBuffer();
                }
                readWriteBufferStateStartWriting$ktor_io = initialNewBuffer.startWriting$ktor_io();
            } else {
                if (readWriteBufferState == ReadWriteBufferState.Terminated.INSTANCE) {
                    if (initialNewBuffer != null) {
                        releaseBuffer(initialNewBuffer);
                    }
                    if (this.joining != null) {
                        return null;
                    }
                    ClosedElement closed2 = getClosed();
                    Intrinsics.checkNotNull(closed2);
                    ByteBufferChannelKt.rethrowClosed(closed2.getSendException());
                    throw new KotlinNothingValueException();
                }
                readWriteBufferStateStartWriting$ktor_io = readWriteBufferState.startWriting$ktor_io();
            }
        } while (!C2081xc40028dd.m347m(_state$FU, this, obj, readWriteBufferStateStartWriting$ktor_io));
        if (getClosed() != null) {
            restoreStateAfterWrite$ktor_io();
            tryTerminate$ktor_io();
            ClosedElement closed3 = getClosed();
            Intrinsics.checkNotNull(closed3);
            ByteBufferChannelKt.rethrowClosed(closed3.getSendException());
            throw new KotlinNothingValueException();
        }
        ByteBuffer writeBuffer = readWriteBufferStateStartWriting$ktor_io.getWriteBuffer();
        if (initialNewBuffer != null) {
            if (readWriteBufferState == null) {
                Intrinsics.throwUninitializedPropertyAccessException("old");
            } else {
                readWriteBufferState2 = readWriteBufferState;
            }
            if (readWriteBufferState2 != idleEmpty) {
                releaseBuffer(initialNewBuffer);
            }
        }
        prepareBuffer(writeBuffer, this.writePosition, readWriteBufferStateStartWriting$ktor_io.capacity._availableForWrite$internal);
        return writeBuffer;
    }

    public final JoiningState setupDelegateTo(ByteBufferChannel delegate, boolean delegateClose) {
        if (this == delegate) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        JoiningState joiningState = new JoiningState(delegate, delegateClose);
        this.joining = joiningState;
        ClosedElement closed = getClosed();
        if (closed == null) {
            flush();
            return joiningState;
        }
        if (closed.getCause() != null) {
            delegate.close(closed.getCause());
        } else if (delegateClose && getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            ByteWriteChannelKt.close(delegate);
        } else {
            delegate.flush();
        }
        return joiningState;
    }

    public final boolean tryCompleteJoining(JoiningState joined) {
        if (!tryReleaseBuffer(true)) {
            return false;
        }
        ensureClosedJoined(joined);
        Continuation continuation = (Continuation) _readOp$FU.getAndSet(this, null);
        if (continuation != null) {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(new IllegalStateException("Joining is in progress"))));
        }
        resumeWriteOp();
        return true;
    }

    public final boolean tryTerminate$ktor_io() {
        if (getClosed() == null || !tryReleaseBuffer(false)) {
            return false;
        }
        JoiningState joiningState = this.joining;
        if (joiningState != null) {
            ensureClosedJoined(joiningState);
        }
        resumeReadOp();
        resumeWriteOp();
        return true;
    }

    public final int carryIndex(ByteBuffer byteBuffer, int i) {
        return i >= byteBuffer.capacity() - this.reservedSize ? i - (byteBuffer.capacity() - this.reservedSize) : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0035 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writing(Function3<? super ByteBufferChannel, ? super ByteBuffer, ? super RingBufferCapacity, Unit> block) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = this.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        if (byteBuffer == null) {
            return;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new KotlinNothingValueException();
            }
            block.invoke(byteBufferChannelResolveDelegation, byteBuffer, ringBufferCapacity);
        } finally {
            InlineMarker.finallyStart(1);
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            InlineMarker.finallyEnd(1);
        }
    }

    public final boolean reading(Function2<? super ByteBuffer, ? super RingBufferCapacity, Boolean> block) throws Throwable {
        ByteBuffer byteBuffer = setupStateForRead();
        if (byteBuffer == null) {
            return false;
        }
        RingBufferCapacity ringBufferCapacity = getState().capacity;
        try {
            if (ringBufferCapacity._availableForRead$internal == 0) {
                return false;
            }
            return block.invoke(byteBuffer, ringBufferCapacity).booleanValue();
        } finally {
            InlineMarker.finallyStart(1);
            restoreStateAfterRead();
            tryTerminate$ktor_io();
            InlineMarker.finallyEnd(1);
        }
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public final Object readFully(@NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        int asMuchAsPossible = readAsMuchAsPossible(bArr, i, i2);
        if (asMuchAsPossible < i2) {
            Object fullySuspend = readFullySuspend(bArr, i + asMuchAsPossible, i2 - asMuchAsPossible, continuation);
            return fullySuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? fullySuspend : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public final Object readFully(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        int asMuchAsPossible = readAsMuchAsPossible(byteBuffer);
        return !byteBuffer.hasRemaining() ? Boxing.boxInt(asMuchAsPossible) : readFullySuspend(byteBuffer, asMuchAsPossible, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0054 -> B:49:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readFullySuspend(ByteBuffer byteBuffer, int i, Continuation<? super Integer> continuation) throws Throwable {
        C103941 c103941;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C103941) {
            c103941 = (C103941) continuation;
            int i2 = c103941.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103941.label = i2 - Integer.MIN_VALUE;
            } else {
                c103941 = new C103941(continuation);
            }
        }
        Object suspend = c103941.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103941.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspend);
            byteBufferChannel = this;
            if (!byteBuffer.hasRemaining()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c103941.I$0;
            ByteBuffer byteBuffer2 = (ByteBuffer) c103941.L$1;
            byteBufferChannel = (ByteBufferChannel) c103941.L$0;
            ResultKt.throwOnFailure(suspend);
            if (!((Boolean) suspend).booleanValue()) {
                ByteBuffer byteBuffer3 = byteBuffer2;
                i = i4 + byteBufferChannel.readAsMuchAsPossible(byteBuffer2);
                byteBuffer = byteBuffer3;
                if (!byteBuffer.hasRemaining()) {
                    c103941.L$0 = byteBufferChannel;
                    c103941.L$1 = byteBuffer;
                    c103941.I$0 = i;
                    c103941.label = 1;
                    suspend = byteBufferChannel.readSuspend(1, c103941);
                    if (suspend == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i5 = i;
                    byteBuffer2 = byteBuffer;
                    i4 = i5;
                    if (!((Boolean) suspend).booleanValue()) {
                        throw new ClosedReceiveChannelException("Unexpected EOF: expected " + byteBuffer2.remaining() + " more bytes");
                    }
                } else {
                    return Boxing.boxInt(i);
                }
            }
        }
    }

    public static /* synthetic */ Object readFully$suspendImpl(ByteBufferChannel byteBufferChannel, ChunkBuffer chunkBuffer, int i, Continuation<? super Unit> continuation) throws Throwable {
        int asMuchAsPossible$default = readAsMuchAsPossible$default(byteBufferChannel, chunkBuffer, 0, i, 2, null);
        if (asMuchAsPossible$default == i) {
            return Unit.INSTANCE;
        }
        Object fullySuspend = byteBufferChannel.readFullySuspend(chunkBuffer, i - asMuchAsPossible$default, continuation);
        return fullySuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? fullySuspend : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0060 -> B:51:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readFullySuspend(ChunkBuffer chunkBuffer, int i, Continuation<? super Unit> continuation) throws Throwable {
        C103952 c103952;
        int asMuchAsPossible$default;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C103952) {
            c103952 = (C103952) continuation;
            int i2 = c103952.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103952.label = i2 - Integer.MIN_VALUE;
            } else {
                c103952 = new C103952(continuation);
            }
        }
        Object obj = c103952.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103952.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            asMuchAsPossible$default = 0;
            byteBufferChannel = this;
            if (chunkBuffer.getLimit() <= chunkBuffer.getWritePosition()) {
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i4 = c103952.I$1;
        i = c103952.I$0;
        ChunkBuffer chunkBuffer2 = (ChunkBuffer) c103952.L$1;
        ByteBufferChannel byteBufferChannel2 = (ByteBufferChannel) c103952.L$0;
        ResultKt.throwOnFailure(obj);
        ByteBufferChannel byteBufferChannel3 = byteBufferChannel2;
        if (!((Boolean) obj).booleanValue()) {
            byteBufferChannel = byteBufferChannel3;
            asMuchAsPossible$default = readAsMuchAsPossible$default(byteBufferChannel, chunkBuffer2, 0, i - i4, 2, null) + i4;
            chunkBuffer = chunkBuffer2;
            if (chunkBuffer.getLimit() <= chunkBuffer.getWritePosition() && asMuchAsPossible$default < i) {
                c103952.L$0 = byteBufferChannel;
                c103952.L$1 = chunkBuffer;
                c103952.I$0 = i;
                c103952.I$1 = asMuchAsPossible$default;
                c103952.label = 1;
                Object suspend = byteBufferChannel.readSuspend(1, c103952);
                if (suspend == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteBufferChannel3 = byteBufferChannel;
                chunkBuffer2 = chunkBuffer;
                i4 = asMuchAsPossible$default;
                obj = suspend;
                if (!((Boolean) obj).booleanValue()) {
                    throw new ClosedReceiveChannelException("Unexpected EOF: expected " + (i - i4) + " more bytes");
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0057 -> B:47:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readFullySuspend(byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) throws Throwable {
        C103963 c103963;
        int asMuchAsPossible;
        ByteBufferChannel byteBufferChannel;
        Object suspend;
        if (continuation instanceof C103963) {
            c103963 = (C103963) continuation;
            int i3 = c103963.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c103963.label = i3 - Integer.MIN_VALUE;
            } else {
                c103963 = new C103963(continuation);
            }
        }
        Object obj = c103963.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c103963.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            asMuchAsPossible = 0;
            byteBufferChannel = this;
            c103963.L$0 = byteBufferChannel;
            c103963.L$1 = bArr;
            c103963.I$0 = i;
            c103963.I$1 = i2;
            c103963.I$2 = asMuchAsPossible;
            c103963.label = 1;
            suspend = byteBufferChannel.readSuspend(1, c103963);
            if (suspend != coroutine_suspended) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = c103963.I$2;
            int i6 = c103963.I$1;
            int i7 = c103963.I$0;
            byte[] bArr2 = (byte[]) c103963.L$1;
            byteBufferChannel = (ByteBufferChannel) c103963.L$0;
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
                throw new ClosedReceiveChannelException("Unexpected EOF: expected " + i6 + " more bytes");
            }
            int i8 = i7 + i5;
            int i9 = i6 - i5;
            asMuchAsPossible = byteBufferChannel.readAsMuchAsPossible(bArr2, i8, i9);
            if (asMuchAsPossible < i9) {
                i = i8;
                i2 = i9;
                bArr = bArr2;
                c103963.L$0 = byteBufferChannel;
                c103963.L$1 = bArr;
                c103963.I$0 = i;
                c103963.I$1 = i2;
                c103963.I$2 = asMuchAsPossible;
                c103963.label = 1;
                suspend = byteBufferChannel.readSuspend(1, c103963);
                if (suspend != coroutine_suspended) {
                    return coroutine_suspended;
                }
                bArr2 = bArr;
                i5 = asMuchAsPossible;
                obj = suspend;
                int i10 = i2;
                i7 = i;
                i6 = i10;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ Object readAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        int asMuchAsPossible = byteBufferChannel.readAsMuchAsPossible(bArr, i, i2);
        if (asMuchAsPossible == 0 && byteBufferChannel.getClosed() != null) {
            asMuchAsPossible = byteBufferChannel.getState().capacity.flush() ? byteBufferChannel.readAsMuchAsPossible(bArr, i, i2) : -1;
        } else if (asMuchAsPossible <= 0 && i2 != 0) {
            return byteBufferChannel.readAvailableSuspend(bArr, i, i2, continuation);
        }
        return Boxing.boxInt(asMuchAsPossible);
    }

    public static /* synthetic */ Object readAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, ByteBuffer byteBuffer, Continuation<? super Integer> continuation) throws Throwable {
        int asMuchAsPossible = byteBufferChannel.readAsMuchAsPossible(byteBuffer);
        if (asMuchAsPossible == 0 && byteBufferChannel.getClosed() != null) {
            asMuchAsPossible = byteBufferChannel.getState().capacity.flush() ? byteBufferChannel.readAsMuchAsPossible(byteBuffer) : -1;
        } else if (asMuchAsPossible <= 0 && byteBuffer.hasRemaining()) {
            return byteBufferChannel.readAvailableSuspend(byteBuffer, continuation);
        }
        return Boxing.boxInt(asMuchAsPossible);
    }

    public static /* synthetic */ Object readAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) {
        int asMuchAsPossible$default = readAsMuchAsPossible$default(byteBufferChannel, chunkBuffer, 0, 0, 6, null);
        if (asMuchAsPossible$default == 0 && byteBufferChannel.getClosed() != null) {
            asMuchAsPossible$default = byteBufferChannel.getState().capacity.flush() ? readAsMuchAsPossible$default(byteBufferChannel, chunkBuffer, 0, 0, 6, null) : -1;
        } else if (asMuchAsPossible$default <= 0 && chunkBuffer.getLimit() > chunkBuffer.getWritePosition()) {
            return byteBufferChannel.readAvailableSuspend(chunkBuffer, continuation);
        }
        return Boxing.boxInt(asMuchAsPossible$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAvailableSuspend(byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        C103861 c103861;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C103861) {
            c103861 = (C103861) continuation;
            int i3 = c103861.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c103861.label = i3 - Integer.MIN_VALUE;
            } else {
                c103861 = new C103861(continuation);
            }
        }
        Object suspend = c103861.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c103861.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(suspend);
            c103861.L$0 = this;
            c103861.L$1 = bArr;
            c103861.I$0 = i;
            c103861.I$1 = i2;
            c103861.label = 1;
            suspend = readSuspend(1, c103861);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteBufferChannel = this;
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.throwOnFailure(suspend);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c103861.I$1;
            i = c103861.I$0;
            bArr = (byte[]) c103861.L$1;
            byteBufferChannel = (ByteBufferChannel) c103861.L$0;
            ResultKt.throwOnFailure(suspend);
        }
        if (!((Boolean) suspend).booleanValue()) {
            return Boxing.boxInt(-1);
        }
        c103861.L$0 = null;
        c103861.L$1 = null;
        c103861.label = 2;
        suspend = byteBufferChannel.readAvailable(bArr, i, i2, c103861);
        return suspend == coroutine_suspended ? coroutine_suspended : suspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAvailableSuspend(ByteBuffer byteBuffer, Continuation<? super Integer> continuation) throws Throwable {
        C103872 c103872;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C103872) {
            c103872 = (C103872) continuation;
            int i = c103872.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103872.label = i - Integer.MIN_VALUE;
            } else {
                c103872 = new C103872(continuation);
            }
        }
        Object suspend = c103872.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103872.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(suspend);
            c103872.L$0 = this;
            c103872.L$1 = byteBuffer;
            c103872.label = 1;
            suspend = readSuspend(1, c103872);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteBufferChannel = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(suspend);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = (ByteBuffer) c103872.L$1;
            byteBufferChannel = (ByteBufferChannel) c103872.L$0;
            ResultKt.throwOnFailure(suspend);
        }
        if (!((Boolean) suspend).booleanValue()) {
            return Boxing.boxInt(-1);
        }
        c103872.L$0 = null;
        c103872.L$1 = null;
        c103872.label = 2;
        suspend = byteBufferChannel.readAvailable(byteBuffer, c103872);
        return suspend == coroutine_suspended ? coroutine_suspended : suspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAvailableSuspend(ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) throws Throwable {
        C103883 c103883;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C103883) {
            c103883 = (C103883) continuation;
            int i = c103883.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103883.label = i - Integer.MIN_VALUE;
            } else {
                c103883 = new C103883(continuation);
            }
        }
        Object suspend = c103883.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103883.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(suspend);
            c103883.L$0 = this;
            c103883.L$1 = chunkBuffer;
            c103883.label = 1;
            suspend = readSuspend(1, c103883);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteBufferChannel = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(suspend);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chunkBuffer = (ChunkBuffer) c103883.L$1;
            byteBufferChannel = (ByteBufferChannel) c103883.L$0;
            ResultKt.throwOnFailure(suspend);
        }
        if (!((Boolean) suspend).booleanValue()) {
            return Boxing.boxInt(-1);
        }
        c103883.L$0 = null;
        c103883.L$1 = null;
        c103883.label = 2;
        suspend = byteBufferChannel.readAvailable(chunkBuffer, c103883);
        return suspend == coroutine_suspended ? coroutine_suspended : suspend;
    }

    public static /* synthetic */ Object readPacket$suspendImpl(ByteBufferChannel byteBufferChannel, int i, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        Throwable cause;
        ClosedElement closed = byteBufferChannel.getClosed();
        if (closed != null && (cause = closed.getCause()) != null) {
            ByteBufferChannelKt.rethrowClosed(cause);
            throw new KotlinNothingValueException();
        }
        if (i == 0) {
            return ByteReadPacket.INSTANCE.getEmpty();
        }
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        ByteBuffer byteBufferBorrow = ObjectPoolKt.getBufferPool().borrow();
        while (i > 0) {
            try {
                byteBufferBorrow.clear();
                if (byteBufferBorrow.remaining() > i) {
                    byteBufferBorrow.limit(i);
                }
                int asMuchAsPossible = byteBufferChannel.readAsMuchAsPossible(byteBufferBorrow);
                if (asMuchAsPossible == 0) {
                    break;
                }
                byteBufferBorrow.flip();
                OutputArraysJVMKt.writeFully(bytePacketBuilder, byteBufferBorrow);
                i -= asMuchAsPossible;
            } catch (Throwable th) {
                ObjectPoolKt.getBufferPool().recycle(byteBufferBorrow);
                bytePacketBuilder.release();
                throw th;
            }
        }
        if (i == 0) {
            ObjectPoolKt.getBufferPool().recycle(byteBufferBorrow);
            return bytePacketBuilder.build();
        }
        return byteBufferChannel.readPacketSuspend(i, bytePacketBuilder, byteBufferBorrow, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004a A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {all -> 0x0057, blocks: (B:71:0x006d, B:63:0x004a, B:65:0x0053, B:68:0x005c, B:72:0x007b), top: B:80:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007b A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:71:0x006d, B:63:0x004a, B:65:0x0053, B:68:0x005c, B:72:0x007b), top: B:80:0x006d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x006a -> B:80:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readPacketSuspend(int i, BytePacketBuilder bytePacketBuilder, ByteBuffer byteBuffer, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        C103991 c103991;
        ByteBufferChannel byteBufferChannel;
        Throwable th;
        if (continuation instanceof C103991) {
            c103991 = (C103991) continuation;
            int i2 = c103991.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103991.label = i2 - Integer.MIN_VALUE;
            } else {
                c103991 = new C103991(continuation);
            }
        }
        Object fully = c103991.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103991.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(fully);
            byteBufferChannel = this;
            if (i > 0) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c103991.I$0;
            ByteBuffer byteBuffer2 = (ByteBuffer) c103991.L$2;
            BytePacketBuilder bytePacketBuilder2 = (BytePacketBuilder) c103991.L$1;
            byteBufferChannel = (ByteBufferChannel) c103991.L$0;
            try {
                ResultKt.throwOnFailure(fully);
                byteBuffer = byteBuffer2;
                bytePacketBuilder = bytePacketBuilder2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    bytePacketBuilder2.release();
                    throw th;
                } finally {
                    ObjectPoolKt.getBufferPool().recycle(byteBuffer2);
                }
            }
            try {
                int iIntValue = ((Number) fully).intValue();
                byteBuffer.flip();
                OutputArraysJVMKt.writeFully(bytePacketBuilder, byteBuffer);
                i -= iIntValue;
                if (i > 0) {
                    byteBuffer2.clear();
                    if (byteBuffer2.remaining() > i) {
                        byteBuffer2.limit(i);
                    }
                    c103991.L$0 = byteBufferChannel;
                    c103991.L$1 = bytePacketBuilder;
                    c103991.L$2 = byteBuffer2;
                    c103991.I$0 = i;
                    c103991.label = 1;
                    fully = byteBufferChannel.readFully(byteBuffer2, c103991);
                    if (fully == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int iIntValue2 = ((Number) fully).intValue();
                    byteBuffer.flip();
                    OutputArraysJVMKt.writeFully(bytePacketBuilder, byteBuffer);
                    i -= iIntValue2;
                    if (i > 0) {
                        return bytePacketBuilder.build();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                ByteBuffer byteBuffer3 = byteBuffer;
                bytePacketBuilder2 = bytePacketBuilder;
                byteBuffer2 = byteBuffer3;
                bytePacketBuilder2.release();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readBoolean(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        C103901 c103901;
        if (continuation instanceof C103901) {
            c103901 = (C103901) continuation;
            int i = c103901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103901.label = i - Integer.MIN_VALUE;
            } else {
                c103901 = new C103901(continuation);
            }
        }
        Object obj = c103901.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103901.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c103901.label = 1;
            obj = readByte(c103901);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(((Number) obj).byteValue() != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a3  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Byte] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0097 -> B:92:0x009a). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readByte(@NotNull Continuation<? super Byte> continuation) throws Throwable {
        C103911 c103911;
        ByteBufferChannel byteBufferChannel;
        int i;
        ByteBuffer byteBuffer;
        boolean z;
        if (continuation instanceof C103911) {
            c103911 = (C103911) continuation;
            int i2 = c103911.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103911.label = i2 - Integer.MIN_VALUE;
            } else {
                c103911 = new C103911(continuation);
            }
        }
        Object suspend = c103911.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103911.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspend);
            byteBufferChannel = this;
            i = 1;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c103911.I$0;
            byteBufferChannel = (ByteBufferChannel) c103911.L$0;
            ResultKt.throwOnFailure(suspend);
            if (!((Boolean) suspend).booleanValue()) {
                throw new ClosedReceiveChannelException("EOF while " + i + " bytes expected");
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
                RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal != 0 && ringBufferCapacity.tryReadExact(i)) {
                        if (byteBuffer.remaining() < i) {
                            byteBufferChannel.rollBytes(byteBuffer, i);
                        }
                        objectRef2.element = Boxing.boxByte(byteBuffer.get());
                        byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, i);
                        z = true;
                    }
                } finally {
                    byteBufferChannel.restoreStateAfterRead();
                    byteBufferChannel.tryTerminate$ktor_io();
                }
            }
            if (z) {
                T t = objectRef2.element;
                if (t != 0) {
                    return (Number) t;
                }
                Intrinsics.throwUninitializedPropertyAccessException("result");
                return null;
            }
            c103911.L$0 = byteBufferChannel;
            c103911.I$0 = i;
            c103911.label = 1;
            suspend = byteBufferChannel.readSuspend(i, c103911);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) suspend).booleanValue()) {
            }
            Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a4  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Short] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0098 -> B:92:0x009b). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readShort(@NotNull Continuation<? super Short> continuation) throws Throwable {
        C104021 c104021;
        ByteBufferChannel byteBufferChannel;
        int i;
        ByteBuffer byteBuffer;
        boolean z;
        if (continuation instanceof C104021) {
            c104021 = (C104021) continuation;
            int i2 = c104021.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104021.label = i2 - Integer.MIN_VALUE;
            } else {
                c104021 = new C104021(continuation);
            }
        }
        Object suspend = c104021.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104021.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspend);
            byteBufferChannel = this;
            i = 2;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c104021.I$0;
            byteBufferChannel = (ByteBufferChannel) c104021.L$0;
            ResultKt.throwOnFailure(suspend);
            if (!((Boolean) suspend).booleanValue()) {
                throw new ClosedReceiveChannelException("EOF while " + i + " bytes expected");
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
                RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal != 0 && ringBufferCapacity.tryReadExact(i)) {
                        if (byteBuffer.remaining() < i) {
                            byteBufferChannel.rollBytes(byteBuffer, i);
                        }
                        objectRef2.element = Boxing.boxShort(byteBuffer.getShort());
                        byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, i);
                        z = true;
                    }
                } finally {
                    byteBufferChannel.restoreStateAfterRead();
                    byteBufferChannel.tryTerminate$ktor_io();
                }
            }
            if (z) {
                T t = objectRef2.element;
                if (t != 0) {
                    return (Number) t;
                }
                Intrinsics.throwUninitializedPropertyAccessException("result");
                return null;
            }
            c104021.L$0 = byteBufferChannel;
            c104021.I$0 = i;
            c104021.label = 1;
            suspend = byteBufferChannel.readSuspend(i, c104021);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) suspend).booleanValue()) {
            }
            Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a4  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0098 -> B:92:0x009b). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readInt(@NotNull Continuation<? super Integer> continuation) throws Throwable {
        C103971 c103971;
        ByteBufferChannel byteBufferChannel;
        int i;
        ByteBuffer byteBuffer;
        boolean z;
        if (continuation instanceof C103971) {
            c103971 = (C103971) continuation;
            int i2 = c103971.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103971.label = i2 - Integer.MIN_VALUE;
            } else {
                c103971 = new C103971(continuation);
            }
        }
        Object suspend = c103971.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103971.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspend);
            byteBufferChannel = this;
            i = 4;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c103971.I$0;
            byteBufferChannel = (ByteBufferChannel) c103971.L$0;
            ResultKt.throwOnFailure(suspend);
            if (!((Boolean) suspend).booleanValue()) {
                throw new ClosedReceiveChannelException("EOF while " + i + " bytes expected");
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
                RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal != 0 && ringBufferCapacity.tryReadExact(i)) {
                        if (byteBuffer.remaining() < i) {
                            byteBufferChannel.rollBytes(byteBuffer, i);
                        }
                        objectRef2.element = Boxing.boxInt(byteBuffer.getInt());
                        byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, i);
                        z = true;
                    }
                } finally {
                    byteBufferChannel.restoreStateAfterRead();
                    byteBufferChannel.tryTerminate$ktor_io();
                }
            }
            if (z) {
                T t = objectRef2.element;
                if (t != 0) {
                    return (Number) t;
                }
                Intrinsics.throwUninitializedPropertyAccessException("result");
                return null;
            }
            c103971.L$0 = byteBufferChannel;
            c103971.I$0 = i;
            c103971.label = 1;
            suspend = byteBufferChannel.readSuspend(i, c103971);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) suspend).booleanValue()) {
            }
            Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a5  */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0099 -> B:92:0x009c). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readLong(@NotNull Continuation<? super Long> continuation) throws Throwable {
        C103981 c103981;
        ByteBufferChannel byteBufferChannel;
        int i;
        ByteBuffer byteBuffer;
        boolean z;
        if (continuation instanceof C103981) {
            c103981 = (C103981) continuation;
            int i2 = c103981.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103981.label = i2 - Integer.MIN_VALUE;
            } else {
                c103981 = new C103981(continuation);
            }
        }
        Object suspend = c103981.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103981.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspend);
            byteBufferChannel = this;
            i = 8;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c103981.I$0;
            byteBufferChannel = (ByteBufferChannel) c103981.L$0;
            ResultKt.throwOnFailure(suspend);
            if (!((Boolean) suspend).booleanValue()) {
                throw new ClosedReceiveChannelException("EOF while " + i + " bytes expected");
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
                RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal != 0 && ringBufferCapacity.tryReadExact(i)) {
                        if (byteBuffer.remaining() < i) {
                            byteBufferChannel.rollBytes(byteBuffer, i);
                        }
                        objectRef2.element = Boxing.boxLong(byteBuffer.getLong());
                        byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, i);
                        z = true;
                    }
                } finally {
                    byteBufferChannel.restoreStateAfterRead();
                    byteBufferChannel.tryTerminate$ktor_io();
                }
            }
            if (z) {
                T t = objectRef2.element;
                if (t != 0) {
                    return (Number) t;
                }
                Intrinsics.throwUninitializedPropertyAccessException("result");
                return null;
            }
            c103981.L$0 = byteBufferChannel;
            c103981.I$0 = i;
            c103981.label = 1;
            suspend = byteBufferChannel.readSuspend(i, c103981);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) suspend).booleanValue()) {
            }
            Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b0  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x00a4 -> B:93:0x00a7). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readFloat(@NotNull Continuation<? super Float> continuation) throws Throwable {
        C103931 c103931;
        ByteBufferChannel byteBufferChannel;
        int i;
        ByteBuffer byteBuffer;
        boolean z;
        Number number;
        if (continuation instanceof C103931) {
            c103931 = (C103931) continuation;
            int i2 = c103931.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103931.label = i2 - Integer.MIN_VALUE;
            } else {
                c103931 = new C103931(continuation);
            }
        }
        Object suspend = c103931.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103931.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspend);
            byteBufferChannel = this;
            i = 4;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c103931.I$0;
            byteBufferChannel = (ByteBufferChannel) c103931.L$0;
            ResultKt.throwOnFailure(suspend);
            if (!((Boolean) suspend).booleanValue()) {
                throw new ClosedReceiveChannelException("EOF while " + i + " bytes expected");
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
                RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal != 0 && ringBufferCapacity.tryReadExact(i)) {
                        if (byteBuffer.remaining() < i) {
                            byteBufferChannel.rollBytes(byteBuffer, i);
                        }
                        objectRef2.element = Boxing.boxInt(byteBuffer.getInt());
                        byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, i);
                        z = true;
                    }
                } finally {
                    byteBufferChannel.restoreStateAfterRead();
                    byteBufferChannel.tryTerminate$ktor_io();
                }
            }
            if (z) {
                T t = objectRef2.element;
                if (t == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("result");
                    number = null;
                } else {
                    number = (Number) t;
                }
                return Boxing.boxFloat(Float.intBitsToFloat(number.intValue()));
            }
            c103931.L$0 = byteBufferChannel;
            c103931.I$0 = i;
            c103931.label = 1;
            suspend = byteBufferChannel.readSuspend(i, c103931);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) suspend).booleanValue()) {
            }
            Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b1  */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x00a5 -> B:93:0x00a8). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDouble(@NotNull Continuation<? super Double> continuation) throws Throwable {
        C103921 c103921;
        ByteBufferChannel byteBufferChannel;
        int i;
        ByteBuffer byteBuffer;
        boolean z;
        Number number;
        if (continuation instanceof C103921) {
            c103921 = (C103921) continuation;
            int i2 = c103921.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103921.label = i2 - Integer.MIN_VALUE;
            } else {
                c103921 = new C103921(continuation);
            }
        }
        Object suspend = c103921.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103921.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspend);
            byteBufferChannel = this;
            i = 8;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c103921.I$0;
            byteBufferChannel = (ByteBufferChannel) c103921.L$0;
            ResultKt.throwOnFailure(suspend);
            if (!((Boolean) suspend).booleanValue()) {
                throw new ClosedReceiveChannelException("EOF while " + i + " bytes expected");
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
                RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal != 0 && ringBufferCapacity.tryReadExact(i)) {
                        if (byteBuffer.remaining() < i) {
                            byteBufferChannel.rollBytes(byteBuffer, i);
                        }
                        objectRef2.element = Boxing.boxLong(byteBuffer.getLong());
                        byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, i);
                        z = true;
                    }
                } finally {
                    byteBufferChannel.restoreStateAfterRead();
                    byteBufferChannel.tryTerminate$ktor_io();
                }
            }
            if (z) {
                T t = objectRef2.element;
                if (t == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("result");
                    number = null;
                } else {
                    number = (Number) t;
                }
                return Boxing.boxDouble(Double.longBitsToDouble(number.longValue()));
            }
            c103921.L$0 = byteBufferChannel;
            c103921.I$0 = i;
            c103921.label = 1;
            suspend = byteBufferChannel.readSuspend(i, c103921);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) suspend).booleanValue()) {
            }
            Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
            byteBuffer = byteBufferChannel.setupStateForRead();
            z = false;
            if (byteBuffer != null) {
            }
            if (z) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Number> Object readPrimitive(int i, Function1<? super ByteBuffer, ? extends T> function1, Continuation<? super T> continuation) throws Throwable {
        boolean zBooleanValue;
        Object suspend;
        boolean z;
        do {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ByteBuffer byteBuffer = setupStateForRead();
            if (byteBuffer != null) {
                RingBufferCapacity ringBufferCapacity = getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal != 0) {
                        if (ringBufferCapacity.tryReadExact(i)) {
                            if (byteBuffer.remaining() < i) {
                                rollBytes(byteBuffer, i);
                            }
                            objectRef.element = function1.invoke(byteBuffer);
                            bytesRead(byteBuffer, ringBufferCapacity, i);
                            z = true;
                        } else {
                            z = false;
                        }
                        zBooleanValue = Boolean.valueOf(z).booleanValue();
                        InlineMarker.finallyStart(1);
                        restoreStateAfterRead();
                        tryTerminate$ktor_io();
                        InlineMarker.finallyEnd(1);
                    } else {
                        InlineMarker.finallyStart(1);
                        restoreStateAfterRead();
                        tryTerminate$ktor_io();
                        InlineMarker.finallyEnd(1);
                        zBooleanValue = false;
                    }
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    restoreStateAfterRead();
                    tryTerminate$ktor_io();
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                T t = objectRef.element;
                if (t != 0) {
                    return (Number) t;
                }
                Intrinsics.throwUninitializedPropertyAccessException("result");
                return null;
            }
            InlineMarker.mark(0);
            suspend = readSuspend(i, continuation);
            InlineMarker.mark(1);
        } while (((Boolean) suspend).booleanValue());
        throw new ClosedReceiveChannelException("EOF while " + i + " bytes expected");
    }

    public final void rollBytes(ByteBuffer byteBuffer, int i) {
        int iRemaining = byteBuffer.remaining();
        byteBuffer.limit(byteBuffer.position() + i);
        int i2 = i - iRemaining;
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byteBuffer.capacity() - 8) + i3, byteBuffer.get(i3));
        }
    }

    public final void carry(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - this.reservedSize;
        int iPosition = byteBuffer.position();
        for (int i = iCapacity; i < iPosition; i++) {
            byteBuffer.put(i - iCapacity, byteBuffer.get(i));
        }
    }

    public final void bytesWrittenFromSession$ktor_io(@NotNull ByteBuffer buffer, @NotNull RingBufferCapacity capacity, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(capacity, "capacity");
        bytesWritten(buffer, capacity, i);
    }

    public final void bytesWritten(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.writePosition = carryIndex(byteBuffer, this.writePosition + i);
        ringBufferCapacity.completeWrite(i);
        setTotalBytesWritten$ktor_io(getTotalBytesWritten() + i);
    }

    public final void bytesRead(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.readPosition = carryIndex(byteBuffer, this.readPosition + i);
        ringBufferCapacity.completeRead(i);
        setTotalBytesRead$ktor_io(getTotalBytesRead() + i);
        resumeWriteOp();
    }

    @NotNull
    public final ByteBufferChannel resolveChannelInstance$ktor_io() {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = this.joining;
        return (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) ? this : byteBufferChannelResolveDelegation;
    }

    public final ByteBufferChannel resolveDelegation(ByteBufferChannel current, JoiningState joining) {
        while (current.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            current = joining.getDelegatedTo();
            joining = current.joining;
            if (joining == null) {
                return current;
            }
        }
        return null;
    }

    public final Object delegateSuspend(JoiningState joiningState, Function1<? super ByteBufferChannel, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        while (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
            InlineMarker.mark(0);
            writeSuspend(1, continuation);
            InlineMarker.mark(1);
        }
        function1.invoke(joiningState.getDelegatedTo());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x00f3 -> B:155:0x00f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeByte$suspendImpl(ByteBufferChannel byteBufferChannel, byte b, Continuation<? super Unit> continuation) throws Throwable {
        C104131 c104131;
        RingBufferCapacity ringBufferCapacity;
        ByteBuffer byteBuffer;
        byte b2;
        int i;
        JoiningState joiningState;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        Throwable th;
        ByteBufferChannel byteBufferChannel2;
        JoiningState joiningState2;
        ByteBufferChannel byteBufferChannel3;
        byte b3;
        if (continuation instanceof C104131) {
            c104131 = (C104131) continuation;
            int i2 = c104131.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104131.label = i2 - Integer.MIN_VALUE;
            } else {
                c104131 = byteBufferChannel.new C104131(continuation);
            }
        }
        Object obj = c104131.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c104131.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                JoiningState joiningState3 = byteBufferChannel.joining;
                if (joiningState3 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState3)) == null) {
                    ByteBuffer byteBuffer2 = byteBufferChannel.setupStateForWrite$ktor_io();
                    if (byteBuffer2 == null) {
                        JoiningState joiningState4 = byteBufferChannel.joining;
                        Intrinsics.checkNotNull(joiningState4);
                        if (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                            c104131.label = 2;
                            if (joiningState4.getDelegatedTo().writeByte(b, c104131) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            joiningState = joiningState4;
                            while (byteBufferChannel.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                                c104131.L$0 = joiningState;
                                c104131.L$1 = byteBufferChannel;
                                c104131.B$0 = b;
                                c104131.label = 4;
                                if (byteBufferChannel.writeSuspend(1, c104131) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            c104131.L$0 = null;
                            c104131.L$1 = null;
                            c104131.label = 3;
                            if (joiningState.getDelegatedTo().writeByte(b, c104131) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        RingBufferCapacity ringBufferCapacity2 = byteBufferChannel.getState().capacity;
                        if (ringBufferCapacity2.tryWriteExact(1)) {
                            byteBufferChannel.prepareWriteBuffer$ktor_io(byteBuffer2, 1);
                            if (byteBuffer2.remaining() < 1) {
                                byteBuffer2.limit(byteBuffer2.capacity());
                                byteBuffer2.put(b);
                                byteBufferChannel.carry(byteBuffer2);
                            } else {
                                byteBuffer2.put(b);
                            }
                            byteBufferChannel.bytesWritten(byteBuffer2, ringBufferCapacity2, 1);
                            if (ringBufferCapacity2.isFull() || byteBufferChannel.getAutoFlush()) {
                                byteBufferChannel.flush();
                            }
                            byteBufferChannel.restoreStateAfterWrite$ktor_io();
                            byteBufferChannel.tryTerminate$ktor_io();
                        } else {
                            ringBufferCapacity = ringBufferCapacity2;
                            byteBuffer = byteBuffer2;
                            b2 = b;
                            i = 1;
                            try {
                                c104131.L$0 = ringBufferCapacity;
                                c104131.L$1 = byteBufferChannel;
                                c104131.L$2 = byteBuffer;
                                c104131.B$0 = b2;
                                c104131.I$0 = i;
                                c104131.label = 5;
                                if (byteBufferChannel.writeSuspend(i, c104131) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (byteBufferChannel.joining != null) {
                                    if (ringBufferCapacity.tryWriteExact(i)) {
                                        byteBufferChannel.prepareWriteBuffer$ktor_io(byteBuffer, i);
                                        if (byteBuffer.remaining() < i) {
                                            byteBuffer.limit(byteBuffer.capacity());
                                            byteBuffer.put(b2);
                                            byteBufferChannel.carry(byteBuffer);
                                        } else {
                                            byteBuffer.put(b2);
                                        }
                                        byteBufferChannel.bytesWritten(byteBuffer, ringBufferCapacity, i);
                                        if (ringBufferCapacity.isFull() || byteBufferChannel.getAutoFlush()) {
                                            byteBufferChannel.flush();
                                        }
                                        byteBufferChannel.restoreStateAfterWrite$ktor_io();
                                        byteBufferChannel.tryTerminate$ktor_io();
                                    }
                                    c104131.L$0 = ringBufferCapacity;
                                    c104131.L$1 = byteBufferChannel;
                                    c104131.L$2 = byteBuffer;
                                    c104131.B$0 = b2;
                                    c104131.I$0 = i;
                                    c104131.label = 5;
                                    if (byteBufferChannel.writeSuspend(i, c104131) == coroutine_suspended) {
                                    }
                                    if (byteBufferChannel.joining != null) {
                                        byteBufferChannel.restoreStateAfterWrite$ktor_io();
                                        JoiningState joiningState5 = byteBufferChannel.joining;
                                        Intrinsics.checkNotNull(joiningState5);
                                        if (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                                            c104131.L$0 = null;
                                            c104131.L$1 = null;
                                            c104131.L$2 = null;
                                            c104131.label = 6;
                                            if (joiningState5.getDelegatedTo().writeByte(b2, c104131) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            joiningState2 = joiningState5;
                                            byteBufferChannel3 = byteBufferChannel;
                                            b3 = b2;
                                            while (byteBufferChannel3.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                                                c104131.L$0 = joiningState2;
                                                c104131.L$1 = byteBufferChannel3;
                                                c104131.L$2 = null;
                                                c104131.B$0 = b3;
                                                c104131.label = 8;
                                                if (byteBufferChannel3.writeSuspend(1, c104131) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            c104131.L$0 = null;
                                            c104131.L$1 = null;
                                            c104131.L$2 = null;
                                            c104131.label = 7;
                                            if (joiningState2.getDelegatedTo().writeByte(b3, c104131) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                byteBufferChannel2 = byteBufferChannel;
                                th = th2;
                                byteBufferChannel2.restoreStateAfterWrite$ktor_io();
                                byteBufferChannel2.tryTerminate$ktor_io();
                                throw th;
                            }
                        }
                    }
                } else {
                    c104131.label = 1;
                    if (byteBufferChannelResolveDelegation.writeByte(b, c104131) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                byte b4 = c104131.B$0;
                ByteBufferChannel byteBufferChannel4 = (ByteBufferChannel) c104131.L$1;
                joiningState = (JoiningState) c104131.L$0;
                ResultKt.throwOnFailure(obj);
                b = b4;
                byteBufferChannel = byteBufferChannel4;
                while (byteBufferChannel.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                }
                c104131.L$0 = null;
                c104131.L$1 = null;
                c104131.label = 3;
                if (joiningState.getDelegatedTo().writeByte(b, c104131) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 5:
                int i3 = c104131.I$0;
                byte b5 = c104131.B$0;
                byteBuffer = (ByteBuffer) c104131.L$2;
                byteBufferChannel2 = (ByteBufferChannel) c104131.L$1;
                ringBufferCapacity = (RingBufferCapacity) c104131.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    b2 = b5;
                    i = i3;
                    byteBufferChannel = byteBufferChannel2;
                    if (byteBufferChannel.joining != null) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    byteBufferChannel2.restoreStateAfterWrite$ktor_io();
                    byteBufferChannel2.tryTerminate$ktor_io();
                    throw th;
                }
            case 8:
                b3 = c104131.B$0;
                byteBufferChannel3 = (ByteBufferChannel) c104131.L$1;
                joiningState2 = (JoiningState) c104131.L$0;
                ResultKt.throwOnFailure(obj);
                while (byteBufferChannel3.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                }
                c104131.L$0 = null;
                c104131.L$1 = null;
                c104131.L$2 = null;
                c104131.label = 7;
                if (joiningState2.getDelegatedTo().writeByte(b3, c104131) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0150  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x00f0 -> B:155:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeShort$suspendImpl(ByteBufferChannel byteBufferChannel, short s, Continuation<? super Unit> continuation) throws Throwable {
        C104201 c104201;
        ByteBuffer byteBuffer;
        int i;
        RingBufferCapacity ringBufferCapacity;
        JoiningState joiningState;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        Throwable th;
        ByteBufferChannel byteBufferChannel2;
        JoiningState joiningState2;
        ByteBufferChannel byteBufferChannel3;
        short s2;
        if (continuation instanceof C104201) {
            c104201 = (C104201) continuation;
            int i2 = c104201.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104201.label = i2 - Integer.MIN_VALUE;
            } else {
                c104201 = byteBufferChannel.new C104201(continuation);
            }
        }
        Object obj = c104201.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c104201.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                JoiningState joiningState3 = byteBufferChannel.joining;
                if (joiningState3 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState3)) == null) {
                    byteBuffer = byteBufferChannel.setupStateForWrite$ktor_io();
                    i = 2;
                    if (byteBuffer == null) {
                        JoiningState joiningState4 = byteBufferChannel.joining;
                        Intrinsics.checkNotNull(joiningState4);
                        if (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                            c104201.label = 2;
                            if (joiningState4.getDelegatedTo().writeShort(s, c104201) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            joiningState = joiningState4;
                            while (byteBufferChannel.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                                c104201.L$0 = joiningState;
                                c104201.L$1 = byteBufferChannel;
                                c104201.S$0 = s;
                                c104201.label = 4;
                                if (byteBufferChannel.writeSuspend(1, c104201) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            c104201.L$0 = null;
                            c104201.L$1 = null;
                            c104201.label = 3;
                            if (joiningState.getDelegatedTo().writeShort(s, c104201) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        RingBufferCapacity ringBufferCapacity2 = byteBufferChannel.getState().capacity;
                        if (ringBufferCapacity2.tryWriteExact(2)) {
                            byteBufferChannel.prepareWriteBuffer$ktor_io(byteBuffer, 2);
                            if (byteBuffer.remaining() < 2) {
                                byteBuffer.limit(byteBuffer.capacity());
                                byteBuffer.putShort(s);
                                byteBufferChannel.carry(byteBuffer);
                            } else {
                                byteBuffer.putShort(s);
                            }
                            byteBufferChannel.bytesWritten(byteBuffer, ringBufferCapacity2, 2);
                            if (ringBufferCapacity2.isFull() || byteBufferChannel.getAutoFlush()) {
                                byteBufferChannel.flush();
                            }
                            byteBufferChannel.restoreStateAfterWrite$ktor_io();
                            byteBufferChannel.tryTerminate$ktor_io();
                        } else {
                            ringBufferCapacity = ringBufferCapacity2;
                            try {
                                c104201.L$0 = ringBufferCapacity;
                                c104201.L$1 = byteBufferChannel;
                                c104201.L$2 = byteBuffer;
                                c104201.S$0 = s;
                                c104201.I$0 = i;
                                c104201.label = 5;
                                if (byteBufferChannel.writeSuspend(i, c104201) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (byteBufferChannel.joining != null) {
                                    if (ringBufferCapacity.tryWriteExact(i)) {
                                        byteBufferChannel.prepareWriteBuffer$ktor_io(byteBuffer, i);
                                        if (byteBuffer.remaining() < i) {
                                            byteBuffer.limit(byteBuffer.capacity());
                                            byteBuffer.putShort(s);
                                            byteBufferChannel.carry(byteBuffer);
                                        } else {
                                            byteBuffer.putShort(s);
                                        }
                                        byteBufferChannel.bytesWritten(byteBuffer, ringBufferCapacity, i);
                                        if (ringBufferCapacity.isFull() || byteBufferChannel.getAutoFlush()) {
                                            byteBufferChannel.flush();
                                        }
                                        byteBufferChannel.restoreStateAfterWrite$ktor_io();
                                        byteBufferChannel.tryTerminate$ktor_io();
                                    }
                                    c104201.L$0 = ringBufferCapacity;
                                    c104201.L$1 = byteBufferChannel;
                                    c104201.L$2 = byteBuffer;
                                    c104201.S$0 = s;
                                    c104201.I$0 = i;
                                    c104201.label = 5;
                                    if (byteBufferChannel.writeSuspend(i, c104201) == coroutine_suspended) {
                                    }
                                    if (byteBufferChannel.joining != null) {
                                        byteBufferChannel.restoreStateAfterWrite$ktor_io();
                                        JoiningState joiningState5 = byteBufferChannel.joining;
                                        Intrinsics.checkNotNull(joiningState5);
                                        if (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                                            c104201.L$0 = null;
                                            c104201.L$1 = null;
                                            c104201.L$2 = null;
                                            c104201.label = 6;
                                            if (joiningState5.getDelegatedTo().writeShort(s, c104201) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            joiningState2 = joiningState5;
                                            short s3 = s;
                                            byteBufferChannel3 = byteBufferChannel;
                                            s2 = s3;
                                            while (byteBufferChannel3.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                                                c104201.L$0 = joiningState2;
                                                c104201.L$1 = byteBufferChannel3;
                                                c104201.L$2 = null;
                                                c104201.S$0 = s2;
                                                c104201.label = 8;
                                                if (byteBufferChannel3.writeSuspend(1, c104201) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            c104201.L$0 = null;
                                            c104201.L$1 = null;
                                            c104201.L$2 = null;
                                            c104201.label = 7;
                                            if (joiningState2.getDelegatedTo().writeShort(s2, c104201) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                byteBufferChannel2 = byteBufferChannel;
                                th = th2;
                                byteBufferChannel2.restoreStateAfterWrite$ktor_io();
                                byteBufferChannel2.tryTerminate$ktor_io();
                                throw th;
                            }
                        }
                    }
                } else {
                    c104201.label = 1;
                    if (byteBufferChannelResolveDelegation.writeShort(s, c104201) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                short s4 = c104201.S$0;
                ByteBufferChannel byteBufferChannel4 = (ByteBufferChannel) c104201.L$1;
                joiningState = (JoiningState) c104201.L$0;
                ResultKt.throwOnFailure(obj);
                s = s4;
                byteBufferChannel = byteBufferChannel4;
                while (byteBufferChannel.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                }
                c104201.L$0 = null;
                c104201.L$1 = null;
                c104201.label = 3;
                if (joiningState.getDelegatedTo().writeShort(s, c104201) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 5:
                int i3 = c104201.I$0;
                s = c104201.S$0;
                ByteBuffer byteBuffer2 = (ByteBuffer) c104201.L$2;
                byteBufferChannel2 = (ByteBufferChannel) c104201.L$1;
                ringBufferCapacity = (RingBufferCapacity) c104201.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    byteBuffer = byteBuffer2;
                    i = i3;
                    byteBufferChannel = byteBufferChannel2;
                    if (byteBufferChannel.joining != null) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    byteBufferChannel2.restoreStateAfterWrite$ktor_io();
                    byteBufferChannel2.tryTerminate$ktor_io();
                    throw th;
                }
            case 8:
                s2 = c104201.S$0;
                byteBufferChannel3 = (ByteBufferChannel) c104201.L$1;
                joiningState2 = (JoiningState) c104201.L$0;
                ResultKt.throwOnFailure(obj);
                while (byteBufferChannel3.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                }
                c104201.L$0 = null;
                c104201.L$1 = null;
                c104201.L$2 = null;
                c104201.label = 7;
                if (joiningState2.getDelegatedTo().writeShort(s2, c104201) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x014c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x00ee -> B:155:0x00f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeInt$suspendImpl(ByteBufferChannel byteBufferChannel, int i, Continuation<? super Unit> continuation) throws Throwable {
        C104171 c104171;
        RingBufferCapacity ringBufferCapacity;
        ByteBuffer byteBuffer;
        JoiningState joiningState;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel delegatedTo;
        Throwable th;
        ByteBufferChannel byteBufferChannel2;
        JoiningState joiningState2;
        ByteBufferChannel byteBufferChannel3;
        int i2;
        ByteBufferChannel delegatedTo2;
        if (continuation instanceof C104171) {
            c104171 = (C104171) continuation;
            int i3 = c104171.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c104171.label = i3 - Integer.MIN_VALUE;
            } else {
                c104171 = byteBufferChannel.new C104171(continuation);
            }
        }
        Object obj = c104171.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = 4;
        switch (c104171.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                JoiningState joiningState3 = byteBufferChannel.joining;
                if (joiningState3 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState3)) == null) {
                    ByteBuffer byteBuffer2 = byteBufferChannel.setupStateForWrite$ktor_io();
                    if (byteBuffer2 == null) {
                        JoiningState joiningState4 = byteBufferChannel.joining;
                        Intrinsics.checkNotNull(joiningState4);
                        if (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                            ByteBufferChannel delegatedTo3 = joiningState4.getDelegatedTo();
                            c104171.label = 2;
                            if (delegatedTo3.writeInt(i, c104171) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            joiningState = joiningState4;
                            while (byteBufferChannel.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                                c104171.L$0 = joiningState;
                                c104171.L$1 = byteBufferChannel;
                                c104171.I$0 = i;
                                c104171.label = 4;
                                if (byteBufferChannel.writeSuspend(1, c104171) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            delegatedTo = joiningState.getDelegatedTo();
                            c104171.L$0 = null;
                            c104171.L$1 = null;
                            c104171.label = 3;
                            if (delegatedTo.writeInt(i, c104171) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        RingBufferCapacity ringBufferCapacity2 = byteBufferChannel.getState().capacity;
                        if (ringBufferCapacity2.tryWriteExact(4)) {
                            byteBufferChannel.prepareWriteBuffer$ktor_io(byteBuffer2, 4);
                            if (byteBuffer2.remaining() < 4) {
                                byteBuffer2.limit(byteBuffer2.capacity());
                                byteBuffer2.putInt(i);
                                byteBufferChannel.carry(byteBuffer2);
                            } else {
                                byteBuffer2.putInt(i);
                            }
                            byteBufferChannel.bytesWritten(byteBuffer2, ringBufferCapacity2, 4);
                            if (ringBufferCapacity2.isFull() || byteBufferChannel.getAutoFlush()) {
                                byteBufferChannel.flush();
                            }
                            byteBufferChannel.restoreStateAfterWrite$ktor_io();
                            byteBufferChannel.tryTerminate$ktor_io();
                        } else {
                            ringBufferCapacity = ringBufferCapacity2;
                            byteBuffer = byteBuffer2;
                            try {
                                c104171.L$0 = ringBufferCapacity;
                                c104171.L$1 = byteBufferChannel;
                                c104171.L$2 = byteBuffer;
                                c104171.I$0 = i;
                                c104171.I$1 = i4;
                                c104171.label = 5;
                                if (byteBufferChannel.writeSuspend(i4, c104171) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (byteBufferChannel.joining != null) {
                                    if (ringBufferCapacity.tryWriteExact(i4)) {
                                        byteBufferChannel.prepareWriteBuffer$ktor_io(byteBuffer, i4);
                                        if (byteBuffer.remaining() < i4) {
                                            byteBuffer.limit(byteBuffer.capacity());
                                            byteBuffer.putInt(i);
                                            byteBufferChannel.carry(byteBuffer);
                                        } else {
                                            byteBuffer.putInt(i);
                                        }
                                        byteBufferChannel.bytesWritten(byteBuffer, ringBufferCapacity, i4);
                                        if (ringBufferCapacity.isFull() || byteBufferChannel.getAutoFlush()) {
                                            byteBufferChannel.flush();
                                        }
                                        byteBufferChannel.restoreStateAfterWrite$ktor_io();
                                        byteBufferChannel.tryTerminate$ktor_io();
                                    }
                                    c104171.L$0 = ringBufferCapacity;
                                    c104171.L$1 = byteBufferChannel;
                                    c104171.L$2 = byteBuffer;
                                    c104171.I$0 = i;
                                    c104171.I$1 = i4;
                                    c104171.label = 5;
                                    if (byteBufferChannel.writeSuspend(i4, c104171) == coroutine_suspended) {
                                    }
                                    if (byteBufferChannel.joining != null) {
                                        byteBufferChannel.restoreStateAfterWrite$ktor_io();
                                        JoiningState joiningState5 = byteBufferChannel.joining;
                                        Intrinsics.checkNotNull(joiningState5);
                                        if (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                                            ByteBufferChannel delegatedTo4 = joiningState5.getDelegatedTo();
                                            c104171.L$0 = null;
                                            c104171.L$1 = null;
                                            c104171.L$2 = null;
                                            c104171.label = 6;
                                            if (delegatedTo4.writeInt(i, c104171) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            joiningState2 = joiningState5;
                                            int i5 = i;
                                            byteBufferChannel3 = byteBufferChannel;
                                            i2 = i5;
                                            while (byteBufferChannel3.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                                                c104171.L$0 = joiningState2;
                                                c104171.L$1 = byteBufferChannel3;
                                                c104171.L$2 = null;
                                                c104171.I$0 = i2;
                                                c104171.label = 8;
                                                if (byteBufferChannel3.writeSuspend(1, c104171) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            delegatedTo2 = joiningState2.getDelegatedTo();
                                            c104171.L$0 = null;
                                            c104171.L$1 = null;
                                            c104171.L$2 = null;
                                            c104171.label = 7;
                                            if (delegatedTo2.writeInt(i2, c104171) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                byteBufferChannel2 = byteBufferChannel;
                                th = th2;
                                byteBufferChannel2.restoreStateAfterWrite$ktor_io();
                                byteBufferChannel2.tryTerminate$ktor_io();
                                throw th;
                            }
                        }
                    }
                } else {
                    c104171.label = 1;
                    if (byteBufferChannelResolveDelegation.writeInt(i, c104171) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                int i6 = c104171.I$0;
                ByteBufferChannel byteBufferChannel4 = (ByteBufferChannel) c104171.L$1;
                joiningState = (JoiningState) c104171.L$0;
                ResultKt.throwOnFailure(obj);
                i = i6;
                byteBufferChannel = byteBufferChannel4;
                while (byteBufferChannel.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                }
                delegatedTo = joiningState.getDelegatedTo();
                c104171.L$0 = null;
                c104171.L$1 = null;
                c104171.label = 3;
                if (delegatedTo.writeInt(i, c104171) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 5:
                int i7 = c104171.I$1;
                i = c104171.I$0;
                byteBuffer = (ByteBuffer) c104171.L$2;
                byteBufferChannel2 = (ByteBufferChannel) c104171.L$1;
                ringBufferCapacity = (RingBufferCapacity) c104171.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    i4 = i7;
                    byteBufferChannel = byteBufferChannel2;
                    if (byteBufferChannel.joining != null) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    byteBufferChannel2.restoreStateAfterWrite$ktor_io();
                    byteBufferChannel2.tryTerminate$ktor_io();
                    throw th;
                }
            case 8:
                i2 = c104171.I$0;
                byteBufferChannel3 = (ByteBufferChannel) c104171.L$1;
                joiningState2 = (JoiningState) c104171.L$0;
                ResultKt.throwOnFailure(obj);
                while (byteBufferChannel3.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                }
                delegatedTo2 = joiningState2.getDelegatedTo();
                c104171.L$0 = null;
                c104171.L$1 = null;
                c104171.L$2 = null;
                c104171.label = 7;
                if (delegatedTo2.writeInt(i2, c104171) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x014e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x00f2 -> B:155:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeLong$suspendImpl(ByteBufferChannel byteBufferChannel, long j, Continuation<? super Unit> continuation) throws Throwable {
        C104181 c104181;
        RingBufferCapacity ringBufferCapacity;
        ByteBuffer byteBuffer;
        long j2;
        int i;
        JoiningState joiningState;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel delegatedTo;
        Throwable th;
        ByteBufferChannel byteBufferChannel2;
        JoiningState joiningState2;
        ByteBufferChannel byteBufferChannel3;
        long j3;
        ByteBufferChannel delegatedTo2;
        if (continuation instanceof C104181) {
            c104181 = (C104181) continuation;
            int i2 = c104181.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104181.label = i2 - Integer.MIN_VALUE;
            } else {
                c104181 = byteBufferChannel.new C104181(continuation);
            }
        }
        Object obj = c104181.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c104181.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                JoiningState joiningState3 = byteBufferChannel.joining;
                if (joiningState3 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState3)) == null) {
                    ByteBuffer byteBuffer2 = byteBufferChannel.setupStateForWrite$ktor_io();
                    if (byteBuffer2 == null) {
                        JoiningState joiningState4 = byteBufferChannel.joining;
                        Intrinsics.checkNotNull(joiningState4);
                        if (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                            ByteBufferChannel delegatedTo3 = joiningState4.getDelegatedTo();
                            c104181.label = 2;
                            if (delegatedTo3.writeLong(j, c104181) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            joiningState = joiningState4;
                            while (byteBufferChannel.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                                c104181.L$0 = joiningState;
                                c104181.L$1 = byteBufferChannel;
                                c104181.J$0 = j;
                                c104181.label = 4;
                                if (byteBufferChannel.writeSuspend(1, c104181) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            delegatedTo = joiningState.getDelegatedTo();
                            c104181.L$0 = null;
                            c104181.L$1 = null;
                            c104181.label = 3;
                            if (delegatedTo.writeLong(j, c104181) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        RingBufferCapacity ringBufferCapacity2 = byteBufferChannel.getState().capacity;
                        if (ringBufferCapacity2.tryWriteExact(8)) {
                            byteBufferChannel.prepareWriteBuffer$ktor_io(byteBuffer2, 8);
                            if (byteBuffer2.remaining() < 8) {
                                byteBuffer2.limit(byteBuffer2.capacity());
                                byteBuffer2.putLong(j);
                                byteBufferChannel.carry(byteBuffer2);
                            } else {
                                byteBuffer2.putLong(j);
                            }
                            byteBufferChannel.bytesWritten(byteBuffer2, ringBufferCapacity2, 8);
                            if (ringBufferCapacity2.isFull() || byteBufferChannel.getAutoFlush()) {
                                byteBufferChannel.flush();
                            }
                            byteBufferChannel.restoreStateAfterWrite$ktor_io();
                            byteBufferChannel.tryTerminate$ktor_io();
                        } else {
                            ringBufferCapacity = ringBufferCapacity2;
                            byteBuffer = byteBuffer2;
                            j2 = j;
                            i = 8;
                            try {
                                c104181.L$0 = ringBufferCapacity;
                                c104181.L$1 = byteBufferChannel;
                                c104181.L$2 = byteBuffer;
                                c104181.J$0 = j2;
                                c104181.I$0 = i;
                                c104181.label = 5;
                                if (byteBufferChannel.writeSuspend(i, c104181) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (byteBufferChannel.joining != null) {
                                    if (ringBufferCapacity.tryWriteExact(i)) {
                                        byteBufferChannel.prepareWriteBuffer$ktor_io(byteBuffer, i);
                                        if (byteBuffer.remaining() < i) {
                                            byteBuffer.limit(byteBuffer.capacity());
                                            byteBuffer.putLong(j2);
                                            byteBufferChannel.carry(byteBuffer);
                                        } else {
                                            byteBuffer.putLong(j2);
                                        }
                                        byteBufferChannel.bytesWritten(byteBuffer, ringBufferCapacity, i);
                                        if (ringBufferCapacity.isFull() || byteBufferChannel.getAutoFlush()) {
                                            byteBufferChannel.flush();
                                        }
                                        byteBufferChannel.restoreStateAfterWrite$ktor_io();
                                        byteBufferChannel.tryTerminate$ktor_io();
                                    }
                                    c104181.L$0 = ringBufferCapacity;
                                    c104181.L$1 = byteBufferChannel;
                                    c104181.L$2 = byteBuffer;
                                    c104181.J$0 = j2;
                                    c104181.I$0 = i;
                                    c104181.label = 5;
                                    if (byteBufferChannel.writeSuspend(i, c104181) == coroutine_suspended) {
                                    }
                                    if (byteBufferChannel.joining != null) {
                                        byteBufferChannel.restoreStateAfterWrite$ktor_io();
                                        JoiningState joiningState5 = byteBufferChannel.joining;
                                        Intrinsics.checkNotNull(joiningState5);
                                        if (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                                            ByteBufferChannel delegatedTo4 = joiningState5.getDelegatedTo();
                                            c104181.L$0 = null;
                                            c104181.L$1 = null;
                                            c104181.L$2 = null;
                                            c104181.label = 6;
                                            if (delegatedTo4.writeLong(j2, c104181) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            joiningState2 = joiningState5;
                                            long j4 = j2;
                                            byteBufferChannel3 = byteBufferChannel;
                                            j3 = j4;
                                            while (byteBufferChannel3.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                                                c104181.L$0 = joiningState2;
                                                c104181.L$1 = byteBufferChannel3;
                                                c104181.L$2 = null;
                                                c104181.J$0 = j3;
                                                c104181.label = 8;
                                                if (byteBufferChannel3.writeSuspend(1, c104181) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            delegatedTo2 = joiningState2.getDelegatedTo();
                                            c104181.L$0 = null;
                                            c104181.L$1 = null;
                                            c104181.L$2 = null;
                                            c104181.label = 7;
                                            if (delegatedTo2.writeLong(j3, c104181) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                byteBufferChannel2 = byteBufferChannel;
                                th = th2;
                                byteBufferChannel2.restoreStateAfterWrite$ktor_io();
                                byteBufferChannel2.tryTerminate$ktor_io();
                                throw th;
                            }
                        }
                    }
                } else {
                    c104181.label = 1;
                    if (byteBufferChannelResolveDelegation.writeLong(j, c104181) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                long j5 = c104181.J$0;
                ByteBufferChannel byteBufferChannel4 = (ByteBufferChannel) c104181.L$1;
                joiningState = (JoiningState) c104181.L$0;
                ResultKt.throwOnFailure(obj);
                byteBufferChannel = byteBufferChannel4;
                j = j5;
                while (byteBufferChannel.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                }
                delegatedTo = joiningState.getDelegatedTo();
                c104181.L$0 = null;
                c104181.L$1 = null;
                c104181.label = 3;
                if (delegatedTo.writeLong(j, c104181) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 5:
                int i3 = c104181.I$0;
                long j6 = c104181.J$0;
                byteBuffer = (ByteBuffer) c104181.L$2;
                byteBufferChannel2 = (ByteBufferChannel) c104181.L$1;
                ringBufferCapacity = (RingBufferCapacity) c104181.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    j2 = j6;
                    i = i3;
                    byteBufferChannel = byteBufferChannel2;
                    if (byteBufferChannel.joining != null) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    byteBufferChannel2.restoreStateAfterWrite$ktor_io();
                    byteBufferChannel2.tryTerminate$ktor_io();
                    throw th;
                }
            case 8:
                j3 = c104181.J$0;
                byteBufferChannel3 = (ByteBufferChannel) c104181.L$1;
                joiningState2 = (JoiningState) c104181.L$0;
                ResultKt.throwOnFailure(obj);
                while (byteBufferChannel3.getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                }
                delegatedTo2 = joiningState2.getDelegatedTo();
                c104181.L$0 = null;
                c104181.L$1 = null;
                c104181.L$2 = null;
                c104181.label = 7;
                if (delegatedTo2.writeLong(j3, c104181) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ Object writeDouble$suspendImpl(ByteBufferChannel byteBufferChannel, double d, Continuation<? super Unit> continuation) {
        Object objWriteLong = byteBufferChannel.writeLong(Double.doubleToRawLongBits(d), continuation);
        return objWriteLong == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteLong : Unit.INSTANCE;
    }

    public static /* synthetic */ Object writeFloat$suspendImpl(ByteBufferChannel byteBufferChannel, float f, Continuation<? super Unit> continuation) {
        Object objWriteInt = byteBufferChannel.writeInt(Float.floatToRawIntBits(f), continuation);
        return objWriteInt == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteInt : Unit.INSTANCE;
    }

    public final Object writePrimitive(int i, Function1<? super ByteBufferChannel, Unit> function1, Function1<? super ByteBuffer, Unit> function12, Continuation<? super Unit> continuation) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = this.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) != null) {
            function1.invoke(byteBufferChannelResolveDelegation);
            return Unit.INSTANCE;
        }
        ByteBuffer byteBuffer = setupStateForWrite$ktor_io();
        if (byteBuffer != null) {
            RingBufferCapacity ringBufferCapacity = getState().capacity;
            if (ringBufferCapacity.tryWriteExact(i)) {
                prepareWriteBuffer$ktor_io(byteBuffer, i);
                if (byteBuffer.remaining() < i) {
                    byteBuffer.limit(byteBuffer.capacity());
                    function12.invoke(byteBuffer);
                    carry(byteBuffer);
                } else {
                    function12.invoke(byteBuffer);
                }
                bytesWritten(byteBuffer, ringBufferCapacity, i);
                Unit unit = Unit.INSTANCE;
                if (ringBufferCapacity.isFull() || getAutoFlush()) {
                    flush();
                }
                return unit;
            }
            while (true) {
                try {
                    InlineMarker.mark(0);
                    writeSuspend(i, continuation);
                    InlineMarker.mark(1);
                    if (this.joining != null) {
                        restoreStateAfterWrite$ktor_io();
                        JoiningState joiningState2 = this.joining;
                        Intrinsics.checkNotNull(joiningState2);
                        if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                            function1.invoke(joiningState2.getDelegatedTo());
                            Unit unit2 = Unit.INSTANCE;
                        } else {
                            while (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                                InlineMarker.mark(0);
                                writeSuspend(1, continuation);
                                InlineMarker.mark(1);
                            }
                            function1.invoke(joiningState2.getDelegatedTo());
                            Unit unit3 = Unit.INSTANCE;
                        }
                        Unit unit4 = Unit.INSTANCE;
                    } else if (ringBufferCapacity.tryWriteExact(i)) {
                        prepareWriteBuffer$ktor_io(byteBuffer, i);
                        if (byteBuffer.remaining() < i) {
                            byteBuffer.limit(byteBuffer.capacity());
                            function12.invoke(byteBuffer);
                            carry(byteBuffer);
                        } else {
                            function12.invoke(byteBuffer);
                        }
                        bytesWritten(byteBuffer, ringBufferCapacity, i);
                        Unit unit5 = Unit.INSTANCE;
                        if (ringBufferCapacity.isFull() || getAutoFlush()) {
                            flush();
                        }
                    }
                } finally {
                    restoreStateAfterWrite$ktor_io();
                    tryTerminate$ktor_io();
                }
            }
            return Unit.INSTANCE;
        }
        JoiningState joiningState3 = this.joining;
        Intrinsics.checkNotNull(joiningState3);
        if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            function1.invoke(joiningState3.getDelegatedTo());
            Unit unit6 = Unit.INSTANCE;
        } else {
            while (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                InlineMarker.mark(0);
                writeSuspend(1, continuation);
                InlineMarker.mark(1);
            }
            function1.invoke(joiningState3.getDelegatedTo());
            Unit unit7 = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final boolean tryWritePrimitive(ByteBuffer byteBuffer, int i, RingBufferCapacity ringBufferCapacity, Function1<? super ByteBuffer, Unit> function1) {
        if (!ringBufferCapacity.tryWriteExact(i)) {
            return false;
        }
        prepareWriteBuffer$ktor_io(byteBuffer, i);
        if (byteBuffer.remaining() < i) {
            byteBuffer.limit(byteBuffer.capacity());
            function1.invoke(byteBuffer);
            carry(byteBuffer);
        } else {
            function1.invoke(byteBuffer);
        }
        bytesWritten(byteBuffer, ringBufferCapacity, i);
        if (ringBufferCapacity.isFull() || getAutoFlush()) {
            flush();
        }
        restoreStateAfterWrite$ktor_io();
        tryTerminate$ktor_io();
        return true;
    }

    public final void doWritePrimitive(int size, ByteBuffer buffer, RingBufferCapacity capacity, Function1<? super ByteBuffer, Unit> writer) {
        if (buffer.remaining() < size) {
            buffer.limit(buffer.capacity());
            writer.invoke(buffer);
            carry(buffer);
        } else {
            writer.invoke(buffer);
        }
        bytesWritten(buffer, capacity, size);
        if (capacity.isFull() || getAutoFlush()) {
            flush();
        }
        restoreStateAfterWrite$ktor_io();
        tryTerminate$ktor_io();
    }

    public final Object writeSuspendPrimitive(ByteBuffer byteBuffer, int i, RingBufferCapacity ringBufferCapacity, Function1<? super ByteBufferChannel, Unit> function1, Function1<? super ByteBuffer, Unit> function12, Continuation<? super Unit> continuation) throws Throwable {
        do {
            try {
                InlineMarker.mark(0);
                writeSuspend(i, continuation);
                InlineMarker.mark(1);
                if (this.joining != null) {
                    restoreStateAfterWrite$ktor_io();
                    JoiningState joiningState = this.joining;
                    Intrinsics.checkNotNull(joiningState);
                    if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                        function1.invoke(joiningState.getDelegatedTo());
                        Unit unit = Unit.INSTANCE;
                    } else {
                        while (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
                            InlineMarker.mark(0);
                            writeSuspend(1, continuation);
                            InlineMarker.mark(1);
                        }
                        function1.invoke(joiningState.getDelegatedTo());
                        Unit unit2 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            } finally {
                restoreStateAfterWrite$ktor_io();
                tryTerminate$ktor_io();
            }
        } while (!ringBufferCapacity.tryWriteExact(i));
        prepareWriteBuffer$ktor_io(byteBuffer, i);
        if (byteBuffer.remaining() < i) {
            byteBuffer.limit(byteBuffer.capacity());
            function12.invoke(byteBuffer);
            carry(byteBuffer);
        } else {
            function12.invoke(byteBuffer);
        }
        bytesWritten(byteBuffer, ringBufferCapacity, i);
        Unit unit3 = Unit.INSTANCE;
        if (ringBufferCapacity.isFull() || getAutoFlush()) {
            flush();
        }
        return unit3;
    }

    public final Object delegatePrimitive(Function1<? super ByteBufferChannel, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        JoiningState joiningState = this.joining;
        Intrinsics.checkNotNull(joiningState);
        if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            function1.invoke(joiningState.getDelegatedTo());
            return Unit.INSTANCE;
        }
        while (getState() != ReadWriteBufferState.Terminated.INSTANCE) {
            InlineMarker.mark(0);
            writeSuspend(1, continuation);
            InlineMarker.mark(1);
        }
        function1.invoke(joiningState.getDelegatedTo());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object awaitFreeSpace$suspendImpl(ByteBufferChannel byteBufferChannel, Continuation<? super Unit> continuation) throws Throwable {
        Object objWriteSuspend = byteBufferChannel.writeSuspend(1, continuation);
        return objWriteSuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteSuspend : Unit.INSTANCE;
    }

    public static /* synthetic */ Object writeAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, ByteBuffer byteBuffer, Continuation<? super Integer> continuation) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel byteBufferChannelResolveDelegation2;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation2 = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
            return byteBufferChannelResolveDelegation2.writeAvailable(byteBuffer, continuation);
        }
        int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(byteBuffer);
        if (iWriteAsMuchAsPossible > 0) {
            return Boxing.boxInt(iWriteAsMuchAsPossible);
        }
        JoiningState joiningState2 = byteBufferChannel.joining;
        return (joiningState2 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState2)) == null) ? byteBufferChannel.writeAvailableSuspend(byteBuffer, continuation) : byteBufferChannelResolveDelegation.writeAvailableSuspend(byteBuffer, continuation);
    }

    public static /* synthetic */ Object writeAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel byteBufferChannelResolveDelegation2;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation2 = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
            return byteBufferChannelResolveDelegation2.writeAvailable(chunkBuffer, continuation);
        }
        int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(chunkBuffer);
        if (iWriteAsMuchAsPossible > 0) {
            return Boxing.boxInt(iWriteAsMuchAsPossible);
        }
        JoiningState joiningState2 = byteBufferChannel.joining;
        return (joiningState2 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState2)) == null) ? byteBufferChannel.writeAvailableSuspend(chunkBuffer, continuation) : byteBufferChannelResolveDelegation.writeAvailableSuspend(chunkBuffer, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeAvailableSuspend(ByteBuffer byteBuffer, Continuation<? super Integer> continuation) throws Throwable {
        C104111 c104111;
        ByteBufferChannel byteBufferChannel;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        if (continuation instanceof C104111) {
            c104111 = (C104111) continuation;
            int i = c104111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104111.label = i - Integer.MIN_VALUE;
            } else {
                c104111 = new C104111(continuation);
            }
        }
        Object objWriteAvailable = c104111.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104111.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWriteAvailable);
            c104111.L$0 = this;
            c104111.L$1 = byteBuffer;
            c104111.label = 1;
            if (writeSuspend(1, c104111) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteBufferChannel = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objWriteAvailable);
                }
                if (i2 == 3) {
                    ResultKt.throwOnFailure(objWriteAvailable);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = (ByteBuffer) c104111.L$1;
            byteBufferChannel = (ByteBufferChannel) c104111.L$0;
            ResultKt.throwOnFailure(objWriteAvailable);
        }
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) == null) {
            c104111.L$0 = null;
            c104111.L$1 = null;
            c104111.label = 3;
            objWriteAvailable = byteBufferChannel.writeAvailable(byteBuffer, c104111);
            return objWriteAvailable == coroutine_suspended ? coroutine_suspended : objWriteAvailable;
        }
        c104111.L$0 = null;
        c104111.L$1 = null;
        c104111.label = 2;
        objWriteAvailable = byteBufferChannelResolveDelegation.writeAvailableSuspend(byteBuffer, c104111);
        return objWriteAvailable == coroutine_suspended ? coroutine_suspended : objWriteAvailable;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeAvailableSuspend(ChunkBuffer chunkBuffer, Continuation<? super Integer> continuation) throws Throwable {
        C104123 c104123;
        ByteBufferChannel byteBufferChannel;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        if (continuation instanceof C104123) {
            c104123 = (C104123) continuation;
            int i = c104123.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104123.label = i - Integer.MIN_VALUE;
            } else {
                c104123 = new C104123(continuation);
            }
        }
        Object objWriteAvailable = c104123.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104123.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWriteAvailable);
            c104123.L$0 = this;
            c104123.L$1 = chunkBuffer;
            c104123.label = 1;
            if (writeSuspend(1, c104123) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteBufferChannel = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objWriteAvailable);
                }
                if (i2 == 3) {
                    ResultKt.throwOnFailure(objWriteAvailable);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chunkBuffer = (ChunkBuffer) c104123.L$1;
            byteBufferChannel = (ByteBufferChannel) c104123.L$0;
            ResultKt.throwOnFailure(objWriteAvailable);
        }
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) == null) {
            c104123.L$0 = null;
            c104123.L$1 = null;
            c104123.label = 3;
            objWriteAvailable = byteBufferChannel.writeAvailable(chunkBuffer, c104123);
            return objWriteAvailable == coroutine_suspended ? coroutine_suspended : objWriteAvailable;
        }
        c104123.L$0 = null;
        c104123.L$1 = null;
        c104123.label = 2;
        objWriteAvailable = byteBufferChannelResolveDelegation.writeAvailableSuspend(chunkBuffer, c104123);
        return objWriteAvailable == coroutine_suspended ? coroutine_suspended : objWriteAvailable;
    }

    public static /* synthetic */ Object writeFully$suspendImpl(ByteBufferChannel byteBufferChannel, ByteBuffer byteBuffer, Continuation<? super Unit> continuation) throws Throwable {
        Object objWriteFullySuspend;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) == null) {
            byteBufferChannel.writeAsMuchAsPossible(byteBuffer);
            return (byteBuffer.hasRemaining() && (objWriteFullySuspend = byteBufferChannel.writeFullySuspend(byteBuffer, continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objWriteFullySuspend : Unit.INSTANCE;
        }
        Object objWriteFully = byteBufferChannelResolveDelegation.writeFully(byteBuffer, continuation);
        return objWriteFully == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFully : Unit.INSTANCE;
    }

    public static /* synthetic */ Object writeFully$suspendImpl(ByteBufferChannel byteBufferChannel, Buffer buffer, Continuation<? super Unit> continuation) throws Throwable {
        byteBufferChannel.writeAsMuchAsPossible(buffer);
        if (buffer.getWritePosition() <= buffer.getReadPosition()) {
            return Unit.INSTANCE;
        }
        Object objWriteFullySuspend = byteBufferChannel.writeFullySuspend(buffer, continuation);
        return objWriteFullySuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFullySuspend : Unit.INSTANCE;
    }

    /* renamed from: writeFully-JT6ljtQ$suspendImpl */
    public static /* synthetic */ Object m15411writeFullyJT6ljtQ$suspendImpl(ByteBufferChannel byteBufferChannel, ByteBuffer byteBuffer, int i, int i2, Continuation<? super Unit> continuation) {
        Object objWriteFully = byteBufferChannel.writeFully(Memory.m15433slice87lwejk(byteBuffer, i, i2 - i), continuation);
        return objWriteFully == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFully : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0054 -> B:56:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeFullySuspend(ByteBuffer byteBuffer, Continuation<? super Unit> continuation) throws Throwable {
        C104141 c104141;
        ByteBufferChannel byteBufferChannel;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        if (continuation instanceof C104141) {
            c104141 = (C104141) continuation;
            int i = c104141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104141.label = i - Integer.MIN_VALUE;
            } else {
                c104141 = new C104141(continuation);
            }
        }
        Object obj = c104141.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteBufferChannel = this;
            if (byteBuffer.hasRemaining()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            byteBuffer = (ByteBuffer) c104141.L$1;
            byteBufferChannel = (ByteBufferChannel) c104141.L$0;
            ResultKt.throwOnFailure(obj);
            JoiningState joiningState = byteBufferChannel.joining;
            if (joiningState == null && (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
                c104141.L$0 = null;
                c104141.L$1 = null;
                c104141.label = 2;
                if (byteBufferChannelResolveDelegation.writeFully(byteBuffer, c104141) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            byteBufferChannel.writeAsMuchAsPossible(byteBuffer);
            if (byteBuffer.hasRemaining()) {
                c104141.L$0 = byteBufferChannel;
                c104141.L$1 = byteBuffer;
                c104141.label = 1;
                if (byteBufferChannel.tryWriteSuspend$ktor_io(1, c104141) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                JoiningState joiningState2 = byteBufferChannel.joining;
                if (joiningState2 == null) {
                }
                byteBufferChannel.writeAsMuchAsPossible(byteBuffer);
                if (byteBuffer.hasRemaining()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0058 -> B:56:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeFullySuspend(Buffer buffer, Continuation<? super Unit> continuation) throws Throwable {
        C104153 c104153;
        ByteBufferChannel byteBufferChannel;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        if (continuation instanceof C104153) {
            c104153 = (C104153) continuation;
            int i = c104153.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104153.label = i - Integer.MIN_VALUE;
            } else {
                c104153 = new C104153(continuation);
            }
        }
        Object obj = c104153.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104153.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteBufferChannel = this;
            if (buffer.getWritePosition() > buffer.getReadPosition()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            buffer = (Buffer) c104153.L$1;
            byteBufferChannel = (ByteBufferChannel) c104153.L$0;
            ResultKt.throwOnFailure(obj);
            JoiningState joiningState = byteBufferChannel.joining;
            if (joiningState == null && (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
                c104153.L$0 = null;
                c104153.L$1 = null;
                c104153.label = 2;
                if (byteBufferChannelResolveDelegation.writeFully(buffer, c104153) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            byteBufferChannel.writeAsMuchAsPossible(buffer);
            if (buffer.getWritePosition() > buffer.getReadPosition()) {
                c104153.L$0 = byteBufferChannel;
                c104153.L$1 = buffer;
                c104153.label = 1;
                if (byteBufferChannel.tryWriteSuspend$ktor_io(1, c104153) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                JoiningState joiningState2 = byteBufferChannel.joining;
                if (joiningState2 == null) {
                }
                byteBufferChannel.writeAsMuchAsPossible(buffer);
                if (buffer.getWritePosition() > buffer.getReadPosition()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public final Object awaitClose(Continuation<? super Unit> continuation) {
        if (getClosed() != null) {
            return Unit.INSTANCE;
        }
        JoiningState joiningState = this.joining;
        if (joiningState == null) {
            if (getClosed() == null) {
                throw new IllegalStateException("Only works for joined.".toString());
            }
            return Unit.INSTANCE;
        }
        Object objAwaitClose = joiningState.awaitClose(continuation);
        return objAwaitClose == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitClose : Unit.INSTANCE;
    }

    @Nullable
    public final Object joinFrom$ktor_io(@NotNull ByteBufferChannel byteBufferChannel, boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        if (byteBufferChannel.getClosed() != null && byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            if (z) {
                ClosedElement closed = byteBufferChannel.getClosed();
                Intrinsics.checkNotNull(closed);
                close(closed.getCause());
            }
            return Unit.INSTANCE;
        }
        ClosedElement closed2 = getClosed();
        if (closed2 != null) {
            if (byteBufferChannel.getClosed() == null) {
                ByteBufferChannelKt.rethrowClosed(closed2.getSendException());
                throw new KotlinNothingValueException();
            }
            return Unit.INSTANCE;
        }
        JoiningState joiningState = byteBufferChannel.setupDelegateTo(this, z);
        if (byteBufferChannel.tryCompleteJoining(joiningState)) {
            Object objAwaitClose = byteBufferChannel.awaitClose(continuation);
            return objAwaitClose == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitClose : Unit.INSTANCE;
        }
        Object objJoinFromSuspend = joinFromSuspend(byteBufferChannel, z, joiningState, continuation);
        return objJoinFromSuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoinFromSuspend : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object joinFromSuspend(ByteBufferChannel byteBufferChannel, boolean z, JoiningState joiningState, Continuation<? super Unit> continuation) throws Throwable {
        C103841 c103841;
        ByteBufferChannel byteBufferChannel2;
        if (continuation instanceof C103841) {
            c103841 = (C103841) continuation;
            int i = c103841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103841.label = i - Integer.MIN_VALUE;
            } else {
                c103841 = new C103841(continuation);
            }
        }
        Object obj = c103841.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c103841.L$0 = this;
            c103841.L$1 = byteBufferChannel;
            c103841.Z$0 = z;
            c103841.label = 1;
            if (copyDirect$ktor_io(byteBufferChannel, Long.MAX_VALUE, joiningState, c103841) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteBufferChannel2 = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            z = c103841.Z$0;
            byteBufferChannel = (ByteBufferChannel) c103841.L$1;
            byteBufferChannel2 = (ByteBufferChannel) c103841.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (z && byteBufferChannel.isClosedForRead()) {
            ByteWriteChannelKt.close(byteBufferChannel2);
            return Unit.INSTANCE;
        }
        byteBufferChannel2.flush();
        c103841.L$0 = null;
        c103841.L$1 = null;
        c103841.label = 2;
        if (byteBufferChannel.awaitClose(c103841) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:471:0x015b, code lost:
    
        r4 = r28;
        r7 = r29;
        r8 = r30;
        r14 = r15;
        r12 = r16;
        r28 = r18;
        r11 = r20;
        r30 = r21;
        r16 = r0;
        r15 = r1;
        r0 = r2;
        r2 = r3;
        r3 = r31;
     */
    /* JADX WARN: Path cross not found for [B:376:0x030b, B:381:0x0316], limit reached: 233 */
    /* JADX WARN: Path cross not found for [B:381:0x0316, B:376:0x030b], limit reached: 233 */
    /* JADX WARN: Path cross not found for [B:387:0x0337, B:393:0x0356], limit reached: 233 */
    /* JADX WARN: Path cross not found for [B:393:0x0356, B:387:0x0337], limit reached: 233 */
    /* JADX WARN: Removed duplicated region for block: B:243:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0128 A[Catch: all -> 0x0056, TryCatch #12 {all -> 0x0056, blocks: (B:250:0x0047, B:285:0x0122, B:287:0x0128, B:289:0x012c, B:292:0x0133, B:387:0x0337, B:390:0x033f, B:392:0x034b, B:393:0x0356, B:395:0x035c, B:397:0x0365, B:401:0x038e, B:404:0x0398, B:415:0x03b4, B:417:0x03b8, B:408:0x03a1, B:295:0x013f, B:425:0x03f4, B:427:0x03fa, B:431:0x0405, B:432:0x0412, B:433:0x0418, B:429:0x0400, B:435:0x041b, B:436:0x041e, B:257:0x0075), top: B:466:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0161 A[Catch: all -> 0x01d2, TryCatch #10 {all -> 0x01d2, blocks: (B:299:0x015b, B:301:0x0161, B:303:0x0165), top: B:462:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01a9 A[Catch: all -> 0x01bb, TRY_LEAVE, TryCatch #14 {all -> 0x01bb, blocks: (B:310:0x01a5, B:312:0x01a9), top: B:469:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x030b A[Catch: all -> 0x0312, TryCatch #9 {all -> 0x0312, blocks: (B:374:0x0305, B:376:0x030b, B:383:0x031b, B:384:0x032a, B:381:0x0316), top: B:460:0x0305 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x031b A[Catch: all -> 0x0312, TryCatch #9 {all -> 0x0312, blocks: (B:374:0x0305, B:376:0x030b, B:383:0x031b, B:384:0x032a, B:381:0x0316), top: B:460:0x0305 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0337 A[Catch: all -> 0x0056, TRY_ENTER, TryCatch #12 {all -> 0x0056, blocks: (B:250:0x0047, B:285:0x0122, B:287:0x0128, B:289:0x012c, B:292:0x0133, B:387:0x0337, B:390:0x033f, B:392:0x034b, B:393:0x0356, B:395:0x035c, B:397:0x0365, B:401:0x038e, B:404:0x0398, B:415:0x03b4, B:417:0x03b8, B:408:0x03a1, B:295:0x013f, B:425:0x03f4, B:427:0x03fa, B:431:0x0405, B:432:0x0412, B:433:0x0418, B:429:0x0400, B:435:0x041b, B:436:0x041e, B:257:0x0075), top: B:466:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x035c A[Catch: all -> 0x0056, TryCatch #12 {all -> 0x0056, blocks: (B:250:0x0047, B:285:0x0122, B:287:0x0128, B:289:0x012c, B:292:0x0133, B:387:0x0337, B:390:0x033f, B:392:0x034b, B:393:0x0356, B:395:0x035c, B:397:0x0365, B:401:0x038e, B:404:0x0398, B:415:0x03b4, B:417:0x03b8, B:408:0x03a1, B:295:0x013f, B:425:0x03f4, B:427:0x03fa, B:431:0x0405, B:432:0x0412, B:433:0x0418, B:429:0x0400, B:435:0x041b, B:436:0x041e, B:257:0x0075), top: B:466:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x03b8 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #12 {all -> 0x0056, blocks: (B:250:0x0047, B:285:0x0122, B:287:0x0128, B:289:0x012c, B:292:0x0133, B:387:0x0337, B:390:0x033f, B:392:0x034b, B:393:0x0356, B:395:0x035c, B:397:0x0365, B:401:0x038e, B:404:0x0398, B:415:0x03b4, B:417:0x03b8, B:408:0x03a1, B:295:0x013f, B:425:0x03f4, B:427:0x03fa, B:431:0x0405, B:432:0x0412, B:433:0x0418, B:429:0x0400, B:435:0x041b, B:436:0x041e, B:257:0x0075), top: B:466:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x03fa A[Catch: all -> 0x0056, TryCatch #12 {all -> 0x0056, blocks: (B:250:0x0047, B:285:0x0122, B:287:0x0128, B:289:0x012c, B:292:0x0133, B:387:0x0337, B:390:0x033f, B:392:0x034b, B:393:0x0356, B:395:0x035c, B:397:0x0365, B:401:0x038e, B:404:0x0398, B:415:0x03b4, B:417:0x03b8, B:408:0x03a1, B:295:0x013f, B:425:0x03f4, B:427:0x03fa, B:431:0x0405, B:432:0x0412, B:433:0x0418, B:429:0x0400, B:435:0x041b, B:436:0x041e, B:257:0x0075), top: B:466:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0400 A[Catch: all -> 0x0056, TryCatch #12 {all -> 0x0056, blocks: (B:250:0x0047, B:285:0x0122, B:287:0x0128, B:289:0x012c, B:292:0x0133, B:387:0x0337, B:390:0x033f, B:392:0x034b, B:393:0x0356, B:395:0x035c, B:397:0x0365, B:401:0x038e, B:404:0x0398, B:415:0x03b4, B:417:0x03b8, B:408:0x03a1, B:295:0x013f, B:425:0x03f4, B:427:0x03fa, B:431:0x0405, B:432:0x0412, B:433:0x0418, B:429:0x0400, B:435:0x041b, B:436:0x041e, B:257:0x0075), top: B:466:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0405 A[Catch: all -> 0x0056, TryCatch #12 {all -> 0x0056, blocks: (B:250:0x0047, B:285:0x0122, B:287:0x0128, B:289:0x012c, B:292:0x0133, B:387:0x0337, B:390:0x033f, B:392:0x034b, B:393:0x0356, B:395:0x035c, B:397:0x0365, B:401:0x038e, B:404:0x0398, B:415:0x03b4, B:417:0x03b8, B:408:0x03a1, B:295:0x013f, B:425:0x03f4, B:427:0x03fa, B:431:0x0405, B:432:0x0412, B:433:0x0418, B:429:0x0400, B:435:0x041b, B:436:0x041e, B:257:0x0075), top: B:466:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x041b A[Catch: all -> 0x0056, TryCatch #12 {all -> 0x0056, blocks: (B:250:0x0047, B:285:0x0122, B:287:0x0128, B:289:0x012c, B:292:0x0133, B:387:0x0337, B:390:0x033f, B:392:0x034b, B:393:0x0356, B:395:0x035c, B:397:0x0365, B:401:0x038e, B:404:0x0398, B:415:0x03b4, B:417:0x03b8, B:408:0x03a1, B:295:0x013f, B:425:0x03f4, B:427:0x03fa, B:431:0x0405, B:432:0x0412, B:433:0x0418, B:429:0x0400, B:435:0x041b, B:436:0x041e, B:257:0x0075), top: B:466:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0288 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:392:0x034b -> B:285:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:416:0x03b6 -> B:420:0x03dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:418:0x03d9 -> B:420:0x03dc). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copyDirect$ktor_io(@NotNull ByteBufferChannel byteBufferChannel, long j, @Nullable JoiningState joiningState, @NotNull Continuation<? super Long> continuation) throws Throwable {
        ByteBufferChannel$copyDirect$1 byteBufferChannel$copyDirect$1;
        ByteBufferChannel byteBufferChannel2;
        ByteBufferChannel byteBufferChannel3;
        ByteBufferChannel$copyDirect$1 byteBufferChannel$copyDirect$12;
        Ref.LongRef longRef;
        JoiningState joiningState2;
        boolean z;
        long j2;
        ByteBufferChannel byteBufferChannel4;
        long j3;
        ByteBufferChannel byteBufferChannel5;
        ByteBufferChannel byteBufferChannel6;
        RingBufferCapacity ringBufferCapacity;
        Throwable th;
        long j4;
        long j5;
        Ref.LongRef longRef2;
        JoiningState joiningState3;
        ByteBufferChannel byteBufferChannel7;
        ByteBufferChannel byteBufferChannel8;
        Object obj;
        JoiningState joiningState4;
        long j6;
        JoiningState joiningState5;
        ByteBufferChannel byteBufferChannel9;
        RingBufferCapacity ringBufferCapacity2;
        ByteBuffer byteBuffer;
        ByteBufferChannel byteBufferChannel10;
        RingBufferCapacity ringBufferCapacity3;
        ByteBufferChannel byteBufferChannel11;
        RingBufferCapacity ringBufferCapacity4;
        ByteBuffer byteBuffer2;
        ByteBufferChannel byteBufferChannel12;
        long j7;
        ByteBufferChannel byteBufferChannel13;
        int i;
        boolean z2;
        int i2;
        RingBufferCapacity ringBufferCapacity5;
        ByteBufferChannel byteBufferChannel14;
        JoiningState joiningState6;
        int i3;
        ByteBufferChannel byteBufferChannel15;
        long j8;
        JoiningState joiningState7;
        ByteBufferChannel byteBufferChannel16;
        long j9;
        Ref.LongRef longRef3;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel byteBufferChannel17 = byteBufferChannel;
        if (continuation instanceof ByteBufferChannel$copyDirect$1) {
            byteBufferChannel$copyDirect$1 = (ByteBufferChannel$copyDirect$1) continuation;
            int i4 = byteBufferChannel$copyDirect$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                byteBufferChannel$copyDirect$1.label = i4 - Integer.MIN_VALUE;
            } else {
                byteBufferChannel$copyDirect$1 = new ByteBufferChannel$copyDirect$1(this, continuation);
            }
        }
        Object obj2 = byteBufferChannel$copyDirect$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = byteBufferChannel$copyDirect$1.label;
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj2);
                if (byteBufferChannel.isClosedForRead()) {
                    if (joiningState != null && !byteBufferChannel17.tryCompleteJoining(joiningState)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (byteBufferChannel.getClosedCause() != null) {
                        close(byteBufferChannel.getClosedCause());
                    }
                    return Boxing.boxLong(0L);
                }
                if (joiningState != null && byteBufferChannel17.tryCompleteJoining(joiningState)) {
                    return Boxing.boxLong(0L);
                }
                boolean autoFlush = getAutoFlush();
                try {
                    byteBufferChannel3 = this;
                    byteBufferChannel$copyDirect$12 = byteBufferChannel$copyDirect$1;
                    longRef = new Ref.LongRef();
                    joiningState2 = joiningState;
                    z = autoFlush;
                    j2 = j;
                    if (longRef.element < j2) {
                    }
                    if (z) {
                    }
                    return Boxing.boxLong(longRef.element);
                } catch (Throwable th2) {
                    th = th2;
                    byteBufferChannel2 = this;
                    byteBufferChannel2.close(th);
                    throw th;
                }
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    boolean z3 = byteBufferChannel$copyDirect$1.Z$0;
                    j9 = byteBufferChannel$copyDirect$1.J$0;
                    longRef3 = (Ref.LongRef) byteBufferChannel$copyDirect$1.L$3;
                    JoiningState joiningState8 = (JoiningState) byteBufferChannel$copyDirect$1.L$2;
                    byteBufferChannel16 = (ByteBufferChannel) byteBufferChannel$copyDirect$1.L$1;
                    byteBufferChannel3 = (ByteBufferChannel) byteBufferChannel$copyDirect$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    joiningState4 = joiningState8;
                    z = z3;
                    obj = coroutine_suspended;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                    coroutine_suspended = obj;
                    byteBufferChannel17 = byteBufferChannel16;
                    if (longRef.element < j2) {
                    }
                    if (z) {
                    }
                    return Boxing.boxLong(longRef.element);
                }
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z4 = byteBufferChannel$copyDirect$1.Z$0;
                long j10 = byteBufferChannel$copyDirect$1.J$0;
                Ref.LongRef longRef4 = (Ref.LongRef) byteBufferChannel$copyDirect$1.L$3;
                JoiningState joiningState9 = (JoiningState) byteBufferChannel$copyDirect$1.L$2;
                byteBufferChannel16 = (ByteBufferChannel) byteBufferChannel$copyDirect$1.L$1;
                byteBufferChannel3 = (ByteBufferChannel) byteBufferChannel$copyDirect$1.L$0;
                ResultKt.throwOnFailure(obj2);
                byteBufferChannel$copyDirect$12 = byteBufferChannel$copyDirect$1;
                joiningState2 = joiningState9;
                z = z4;
                obj = coroutine_suspended;
                longRef = longRef4;
                j2 = j10;
                coroutine_suspended = obj;
                byteBufferChannel17 = byteBufferChannel16;
                if (longRef.element < j2) {
                    JoiningState joiningState10 = byteBufferChannel3.joining;
                    if (joiningState10 == null || (byteBufferChannelResolveDelegation = byteBufferChannel3.resolveDelegation(byteBufferChannel3, joiningState10)) == null) {
                        byteBufferChannelResolveDelegation = byteBufferChannel3;
                    }
                    byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
                    if (byteBuffer == null) {
                        joiningState4 = joiningState2;
                        j6 = j2;
                        byteBufferChannel7 = byteBufferChannel17;
                        obj = coroutine_suspended;
                        if (joiningState4 != null) {
                            if (!byteBufferChannel7.tryCompleteJoining(joiningState4)) {
                                if (byteBufferChannel7.getState().capacity.flush()) {
                                    byteBufferChannel7.resumeWriteOp();
                                    coroutine_suspended = obj;
                                    byteBufferChannel17 = byteBufferChannel7;
                                    j2 = j6;
                                    joiningState2 = joiningState4;
                                    if (longRef.element < j2) {
                                    }
                                }
                            }
                        }
                        if (longRef.element < j6) {
                            byteBufferChannel3.flush();
                            if (byteBufferChannel7.get_availableForRead() == 0) {
                                byteBufferChannel$copyDirect$12.L$0 = byteBufferChannel3;
                                byteBufferChannel$copyDirect$12.L$1 = byteBufferChannel7;
                                byteBufferChannel$copyDirect$12.L$2 = joiningState4;
                                byteBufferChannel$copyDirect$12.L$3 = longRef;
                                byteBufferChannel$copyDirect$12.L$4 = null;
                                byteBufferChannel$copyDirect$12.L$5 = null;
                                byteBufferChannel$copyDirect$12.L$6 = null;
                                byteBufferChannel$copyDirect$12.L$7 = null;
                                byteBufferChannel$copyDirect$12.L$8 = null;
                                byteBufferChannel$copyDirect$12.L$9 = null;
                                byteBufferChannel$copyDirect$12.J$0 = j6;
                                byteBufferChannel$copyDirect$12.Z$0 = z;
                                byteBufferChannel$copyDirect$12.label = 2;
                                Object suspendImpl = byteBufferChannel7.readSuspendImpl(1, byteBufferChannel$copyDirect$12);
                                if (suspendImpl == obj) {
                                    return obj;
                                }
                                byteBufferChannel16 = byteBufferChannel7;
                                j9 = j6;
                                byteBufferChannel$copyDirect$1 = byteBufferChannel$copyDirect$12;
                                longRef3 = longRef;
                                obj2 = suspendImpl;
                                if (((Boolean) obj2).booleanValue()) {
                                    if (joiningState4 != null && byteBufferChannel16.tryCompleteJoining(joiningState4)) {
                                        longRef = longRef3;
                                    }
                                    longRef = longRef3;
                                    byteBufferChannel$copyDirect$12 = byteBufferChannel$copyDirect$1;
                                    j2 = j9;
                                    joiningState2 = joiningState4;
                                    if (byteBufferChannel3.joining != null) {
                                    }
                                } else {
                                    if (joiningState4 != null) {
                                        if (!byteBufferChannel16.tryCompleteJoining(joiningState4)) {
                                        }
                                        longRef = longRef3;
                                        byteBufferChannel$copyDirect$12 = byteBufferChannel$copyDirect$1;
                                        j2 = j9;
                                        joiningState2 = joiningState4;
                                        if (byteBufferChannel3.joining != null) {
                                            byteBufferChannel$copyDirect$12.L$0 = byteBufferChannel3;
                                            byteBufferChannel$copyDirect$12.L$1 = byteBufferChannel16;
                                            byteBufferChannel$copyDirect$12.L$2 = joiningState2;
                                            byteBufferChannel$copyDirect$12.L$3 = longRef;
                                            byteBufferChannel$copyDirect$12.L$4 = null;
                                            byteBufferChannel$copyDirect$12.L$5 = null;
                                            byteBufferChannel$copyDirect$12.L$6 = null;
                                            byteBufferChannel$copyDirect$12.L$7 = null;
                                            byteBufferChannel$copyDirect$12.L$8 = null;
                                            byteBufferChannel$copyDirect$12.L$9 = null;
                                            byteBufferChannel$copyDirect$12.J$0 = j2;
                                            byteBufferChannel$copyDirect$12.Z$0 = z;
                                            byteBufferChannel$copyDirect$12.label = 3;
                                            if (byteBufferChannel3.tryWriteSuspend$ktor_io(1, byteBufferChannel$copyDirect$12) == obj) {
                                                return obj;
                                            }
                                        }
                                    }
                                    longRef = longRef3;
                                }
                                coroutine_suspended = obj;
                                byteBufferChannel17 = byteBufferChannel16;
                                if (longRef.element < j2) {
                                }
                            } else {
                                byteBufferChannel16 = byteBufferChannel7;
                                j2 = j6;
                                joiningState2 = joiningState4;
                                if (byteBufferChannel3.joining != null) {
                                }
                                coroutine_suspended = obj;
                                byteBufferChannel17 = byteBufferChannel16;
                                if (longRef.element < j2) {
                                }
                            }
                        }
                    } else {
                        RingBufferCapacity ringBufferCapacity6 = byteBufferChannelResolveDelegation.getState().capacity;
                        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
                        try {
                            ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
                            if (closed != null) {
                                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                                throw new KotlinNothingValueException();
                            }
                            Object obj3 = coroutine_suspended;
                            boolean z5 = z;
                            ringBufferCapacity5 = ringBufferCapacity6;
                            long j11 = totalBytesWritten;
                            long j12 = j2;
                            ByteBufferChannel byteBufferChannel18 = byteBufferChannelResolveDelegation;
                            ByteBufferChannel byteBufferChannel19 = byteBufferChannel3;
                            longRef2 = longRef;
                            byteBufferChannel6 = byteBufferChannel18;
                            try {
                                if (longRef2.element < j12) {
                                    int i6 = ringBufferCapacity5._availableForWrite$internal;
                                    if (i6 == 0) {
                                        try {
                                            byteBufferChannel$copyDirect$12.L$0 = byteBufferChannel19;
                                            byteBufferChannel$copyDirect$12.L$1 = byteBufferChannel17;
                                            byteBufferChannel$copyDirect$12.L$2 = joiningState2;
                                            byteBufferChannel$copyDirect$12.L$3 = longRef2;
                                            byteBufferChannel$copyDirect$12.L$4 = byteBufferChannel3;
                                            byteBufferChannel$copyDirect$12.L$5 = byteBufferChannel6;
                                            byteBufferChannel$copyDirect$12.L$6 = ringBufferCapacity6;
                                            byteBufferChannel$copyDirect$12.L$7 = ringBufferCapacity5;
                                            byteBufferChannel$copyDirect$12.L$8 = byteBuffer;
                                            byteBufferChannel$copyDirect$12.L$9 = byteBufferChannel18;
                                            byteBufferChannel$copyDirect$12.J$0 = j12;
                                            z = z5;
                                            byteBufferChannel$copyDirect$12.Z$0 = z;
                                            byteBufferChannel$copyDirect$12.J$1 = j8;
                                            byteBufferChannel$copyDirect$12.label = 1;
                                            byteBufferChannel14 = byteBufferChannel17;
                                            coroutine_suspended = obj3;
                                            if (byteBufferChannel18.tryWriteSuspend$ktor_io(1, byteBufferChannel$copyDirect$12) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            j4 = j12;
                                            byteBufferChannel4 = byteBufferChannel15;
                                            ByteBufferChannel byteBufferChannel20 = byteBufferChannel18;
                                            joiningState6 = joiningState7;
                                            byteBufferChannel10 = byteBufferChannel20;
                                            byteBufferChannel$copyDirect$1 = byteBufferChannel$copyDirect$12;
                                            ringBufferCapacity = ringBufferCapacity6;
                                            j3 = j8;
                                            try {
                                                if (byteBufferChannel10.joining != null) {
                                                    try {
                                                        i3 = ringBufferCapacity5._availableForWrite$internal;
                                                        byteBufferChannel10.prepareBuffer(byteBuffer, byteBufferChannel10.writePosition, i6);
                                                        Ref.IntRef intRef = new Ref.IntRef();
                                                        ByteBufferChannel$copyDirect$1 byteBufferChannel$copyDirect$13 = byteBufferChannel$copyDirect$12;
                                                        byteBuffer2 = byteBufferChannel7.setupStateForRead();
                                                        if (byteBuffer2 != null) {
                                                            i = i6;
                                                            z2 = z;
                                                            byteBufferChannel12 = byteBufferChannel6;
                                                            j7 = j3;
                                                        } else {
                                                            try {
                                                                byteBufferChannel12 = byteBufferChannel6;
                                                                try {
                                                                    RingBufferCapacity ringBufferCapacity7 = byteBufferChannel7.getState().capacity;
                                                                    if (ringBufferCapacity7._availableForRead$internal != 0) {
                                                                        try {
                                                                            try {
                                                                                int iTryWriteAtMost = ringBufferCapacity3.tryWriteAtMost((int) Math.min(byteBuffer2.remaining(), Math.min(byteBuffer.remaining(), j4 - longRef2.element)));
                                                                                if (iTryWriteAtMost > 0) {
                                                                                    if (!ringBufferCapacity7.tryReadExact(iTryWriteAtMost)) {
                                                                                        throw new AssertionError();
                                                                                    }
                                                                                    byteBuffer2.limit(byteBuffer2.position() + iTryWriteAtMost);
                                                                                    byteBuffer.put(byteBuffer2);
                                                                                    intRef.element = iTryWriteAtMost;
                                                                                    byteBufferChannel7.bytesRead(byteBuffer2, ringBufferCapacity7, iTryWriteAtMost);
                                                                                }
                                                                                byteBufferChannel7.restoreStateAfterRead();
                                                                                byteBufferChannel7.tryTerminate$ktor_io();
                                                                                i2 = intRef.element;
                                                                                if (i2 > 0) {
                                                                                    try {
                                                                                        byteBufferChannel10.bytesWritten(byteBuffer, ringBufferCapacity3, i2);
                                                                                        long j13 = longRef2.element;
                                                                                        int i7 = intRef.element;
                                                                                        longRef2.element = j13 + i7;
                                                                                        if (i - i7 == 0 || z2) {
                                                                                            byteBufferChannel10.flush();
                                                                                            joiningState2 = joiningState5;
                                                                                            byteBufferChannel$copyDirect$12 = byteBufferChannel$copyDirect$13;
                                                                                            byteBufferChannel6 = byteBufferChannel12;
                                                                                            byteBufferChannel3 = byteBufferChannel9;
                                                                                            j12 = j4;
                                                                                            j11 = j7;
                                                                                            ringBufferCapacity6 = ringBufferCapacity4;
                                                                                            z5 = z2;
                                                                                            obj3 = obj;
                                                                                            ringBufferCapacity5 = ringBufferCapacity3;
                                                                                            byteBufferChannel17 = byteBufferChannel7;
                                                                                            byteBufferChannel18 = byteBufferChannel10;
                                                                                            byteBufferChannel19 = byteBufferChannel13;
                                                                                        } else {
                                                                                            joiningState2 = joiningState5;
                                                                                            byteBufferChannel$copyDirect$12 = byteBufferChannel$copyDirect$13;
                                                                                            byteBufferChannel6 = byteBufferChannel12;
                                                                                            byteBufferChannel3 = byteBufferChannel9;
                                                                                            j12 = j4;
                                                                                            j11 = j7;
                                                                                            ringBufferCapacity6 = ringBufferCapacity4;
                                                                                            z5 = z2;
                                                                                            obj3 = obj;
                                                                                            ringBufferCapacity5 = ringBufferCapacity3;
                                                                                            byteBufferChannel17 = byteBufferChannel7;
                                                                                            byteBufferChannel18 = byteBufferChannel10;
                                                                                            byteBufferChannel19 = byteBufferChannel13;
                                                                                        }
                                                                                        if (longRef2.element < j12) {
                                                                                        }
                                                                                    } catch (Throwable th3) {
                                                                                        th = th3;
                                                                                        byteBufferChannel6 = byteBufferChannel12;
                                                                                        byteBufferChannel5 = byteBufferChannel9;
                                                                                        j3 = j7;
                                                                                        ringBufferCapacity = ringBufferCapacity4;
                                                                                        if (ringBufferCapacity.isFull()) {
                                                                                        }
                                                                                        if (byteBufferChannel6 != byteBufferChannel5) {
                                                                                        }
                                                                                        byteBufferChannel6.restoreStateAfterWrite$ktor_io();
                                                                                        byteBufferChannel6.tryTerminate$ktor_io();
                                                                                        throw th;
                                                                                    }
                                                                                } else {
                                                                                    joiningState3 = joiningState5;
                                                                                    byteBufferChannel$copyDirect$12 = byteBufferChannel$copyDirect$13;
                                                                                    byteBufferChannel6 = byteBufferChannel12;
                                                                                    byteBufferChannel8 = byteBufferChannel13;
                                                                                    byteBufferChannel3 = byteBufferChannel9;
                                                                                    j5 = j7;
                                                                                    ringBufferCapacity6 = ringBufferCapacity4;
                                                                                    z = z2;
                                                                                    if (!ringBufferCapacity6.isFull()) {
                                                                                    }
                                                                                    byteBufferChannel6.flush();
                                                                                    if (byteBufferChannel6 != byteBufferChannel3) {
                                                                                    }
                                                                                    byteBufferChannel6.restoreStateAfterWrite$ktor_io();
                                                                                    byteBufferChannel6.tryTerminate$ktor_io();
                                                                                    byteBufferChannel3 = byteBufferChannel8;
                                                                                    joiningState4 = joiningState3;
                                                                                    longRef = longRef2;
                                                                                    j6 = j4;
                                                                                    if (joiningState4 != null) {
                                                                                    }
                                                                                    if (longRef.element < j6) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                ringBufferCapacity4 = ringBufferCapacity2;
                                                                                byteBufferChannel7.restoreStateAfterRead();
                                                                                byteBufferChannel7.tryTerminate$ktor_io();
                                                                                throw th;
                                                                            }
                                                                            byteBufferChannel13 = byteBufferChannel4;
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            byteBufferChannel7.restoreStateAfterRead();
                                                                            byteBufferChannel7.tryTerminate$ktor_io();
                                                                            throw th;
                                                                        }
                                                                        ringBufferCapacity4 = ringBufferCapacity2;
                                                                        i = i6;
                                                                        z2 = z;
                                                                    } else {
                                                                        try {
                                                                            byteBufferChannel7.restoreStateAfterRead();
                                                                            byteBufferChannel7.tryTerminate$ktor_io();
                                                                            i = i6;
                                                                            z2 = z;
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            byteBufferChannel6 = byteBufferChannel12;
                                                                            ringBufferCapacity = ringBufferCapacity2;
                                                                            byteBufferChannel5 = byteBufferChannel9;
                                                                            j3 = j7;
                                                                            if (ringBufferCapacity.isFull() || byteBufferChannel6.getAutoFlush()) {
                                                                                byteBufferChannel6.flush();
                                                                            }
                                                                            if (byteBufferChannel6 != byteBufferChannel5) {
                                                                                byteBufferChannel5.setTotalBytesWritten$ktor_io(byteBufferChannel5.getTotalBytesWritten() + (byteBufferChannel6.getTotalBytesWritten() - j3));
                                                                            }
                                                                            byteBufferChannel6.restoreStateAfterWrite$ktor_io();
                                                                            byteBufferChannel6.tryTerminate$ktor_io();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    byteBufferChannel11 = byteBufferChannel4;
                                                                    ringBufferCapacity4 = ringBufferCapacity2;
                                                                    byteBufferChannel6 = byteBufferChannel12;
                                                                    byteBufferChannel5 = byteBufferChannel9;
                                                                    ringBufferCapacity = ringBufferCapacity4;
                                                                    if (ringBufferCapacity.isFull()) {
                                                                    }
                                                                    if (byteBufferChannel6 != byteBufferChannel5) {
                                                                    }
                                                                    byteBufferChannel6.restoreStateAfterWrite$ktor_io();
                                                                    byteBufferChannel6.tryTerminate$ktor_io();
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                byteBufferChannel13 = byteBufferChannel4;
                                                            }
                                                            j7 = j3;
                                                        }
                                                        byteBufferChannel13 = byteBufferChannel4;
                                                        ringBufferCapacity4 = ringBufferCapacity2;
                                                        i2 = intRef.element;
                                                        if (i2 > 0) {
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        byteBufferChannel11 = byteBufferChannel4;
                                                        ringBufferCapacity4 = ringBufferCapacity2;
                                                    }
                                                    ringBufferCapacity3 = ringBufferCapacity5;
                                                    byteBufferChannel9 = byteBufferChannel3;
                                                    ringBufferCapacity2 = ringBufferCapacity;
                                                    byteBufferChannel$copyDirect$12 = byteBufferChannel$copyDirect$1;
                                                    JoiningState joiningState11 = joiningState6;
                                                    byteBufferChannel7 = byteBufferChannel14;
                                                    joiningState5 = joiningState11;
                                                    Object obj4 = coroutine_suspended;
                                                    i6 = i3;
                                                    obj = obj4;
                                                } else {
                                                    obj = coroutine_suspended;
                                                    byteBufferChannel8 = byteBufferChannel4;
                                                    j5 = j3;
                                                    ringBufferCapacity6 = ringBufferCapacity;
                                                    byteBufferChannel$copyDirect$12 = byteBufferChannel$copyDirect$1;
                                                    joiningState3 = joiningState6;
                                                    byteBufferChannel7 = byteBufferChannel14;
                                                    if (!ringBufferCapacity6.isFull()) {
                                                    }
                                                    byteBufferChannel6.flush();
                                                    if (byteBufferChannel6 != byteBufferChannel3) {
                                                    }
                                                    byteBufferChannel6.restoreStateAfterWrite$ktor_io();
                                                    byteBufferChannel6.tryTerminate$ktor_io();
                                                    byteBufferChannel3 = byteBufferChannel8;
                                                    joiningState4 = joiningState3;
                                                    longRef = longRef2;
                                                    j6 = j4;
                                                    if (joiningState4 != null) {
                                                    }
                                                    if (longRef.element < j6) {
                                                    }
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                byteBufferChannel5 = byteBufferChannel3;
                                                if (ringBufferCapacity.isFull()) {
                                                }
                                                if (byteBufferChannel6 != byteBufferChannel5) {
                                                }
                                                byteBufferChannel6.restoreStateAfterWrite$ktor_io();
                                                byteBufferChannel6.tryTerminate$ktor_io();
                                                throw th;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            ringBufferCapacity = ringBufferCapacity6;
                                            byteBufferChannel5 = byteBufferChannel3;
                                            j3 = j8;
                                            if (ringBufferCapacity.isFull()) {
                                                byteBufferChannel6.flush();
                                            }
                                            if (byteBufferChannel6 != byteBufferChannel5) {
                                            }
                                            byteBufferChannel6.restoreStateAfterWrite$ktor_io();
                                            byteBufferChannel6.tryTerminate$ktor_io();
                                            throw th;
                                        }
                                        byteBufferChannel15 = byteBufferChannel19;
                                        joiningState7 = joiningState2;
                                        j8 = j11;
                                    } else {
                                        z = z5;
                                        ByteBufferChannel byteBufferChannel21 = byteBufferChannel19;
                                        long j14 = j11;
                                        ByteBufferChannel byteBufferChannel22 = byteBufferChannel17;
                                        obj = obj3;
                                        j4 = j12;
                                        ringBufferCapacity3 = ringBufferCapacity5;
                                        byteBufferChannel4 = byteBufferChannel21;
                                        byteBufferChannel9 = byteBufferChannel3;
                                        ringBufferCapacity2 = ringBufferCapacity6;
                                        j3 = j14;
                                        byteBufferChannel10 = byteBufferChannel18;
                                        byteBufferChannel7 = byteBufferChannel22;
                                        joiningState5 = joiningState2;
                                        byteBufferChannel10.prepareBuffer(byteBuffer, byteBufferChannel10.writePosition, i6);
                                        Ref.IntRef intRef2 = new Ref.IntRef();
                                        ByteBufferChannel$copyDirect$1 byteBufferChannel$copyDirect$132 = byteBufferChannel$copyDirect$12;
                                        byteBuffer2 = byteBufferChannel7.setupStateForRead();
                                        if (byteBuffer2 != null) {
                                        }
                                        byteBufferChannel13 = byteBufferChannel4;
                                        ringBufferCapacity4 = ringBufferCapacity2;
                                        i2 = intRef2.element;
                                        if (i2 > 0) {
                                        }
                                    }
                                } else {
                                    z = z5;
                                    ByteBufferChannel byteBufferChannel23 = byteBufferChannel19;
                                    long j15 = j11;
                                    ByteBufferChannel byteBufferChannel24 = byteBufferChannel17;
                                    obj = obj3;
                                    byteBufferChannel7 = byteBufferChannel24;
                                    byteBufferChannel8 = byteBufferChannel23;
                                    j4 = j12;
                                    j5 = j15;
                                    joiningState3 = joiningState2;
                                    try {
                                        if (!ringBufferCapacity6.isFull() || byteBufferChannel6.getAutoFlush()) {
                                            byteBufferChannel6.flush();
                                        }
                                        if (byteBufferChannel6 != byteBufferChannel3) {
                                            byteBufferChannel3.setTotalBytesWritten$ktor_io(byteBufferChannel3.getTotalBytesWritten() + (byteBufferChannel6.getTotalBytesWritten() - j5));
                                        }
                                        byteBufferChannel6.restoreStateAfterWrite$ktor_io();
                                        byteBufferChannel6.tryTerminate$ktor_io();
                                        byteBufferChannel3 = byteBufferChannel8;
                                        joiningState4 = joiningState3;
                                        longRef = longRef2;
                                        j6 = j4;
                                        if (joiningState4 != null) {
                                        }
                                        if (longRef.element < j6) {
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        byteBufferChannel2 = byteBufferChannel8;
                                        byteBufferChannel2.close(th);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                byteBufferChannel15 = byteBufferChannel19;
                                j8 = j11;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            byteBufferChannel6 = byteBufferChannelResolveDelegation;
                            ringBufferCapacity = ringBufferCapacity6;
                            j3 = totalBytesWritten;
                            byteBufferChannel5 = byteBufferChannel3;
                            if (ringBufferCapacity.isFull()) {
                            }
                            if (byteBufferChannel6 != byteBufferChannel5) {
                            }
                            byteBufferChannel6.restoreStateAfterWrite$ktor_io();
                            byteBufferChannel6.tryTerminate$ktor_io();
                            throw th;
                        }
                    }
                }
                if (z) {
                    byteBufferChannel3.flush();
                }
                return Boxing.boxLong(longRef.element);
            }
            j3 = byteBufferChannel$copyDirect$1.J$1;
            boolean z6 = byteBufferChannel$copyDirect$1.Z$0;
            long j16 = byteBufferChannel$copyDirect$1.J$0;
            ByteBufferChannel byteBufferChannel25 = (ByteBufferChannel) byteBufferChannel$copyDirect$1.L$9;
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBufferChannel$copyDirect$1.L$8;
            ringBufferCapacity5 = (RingBufferCapacity) byteBufferChannel$copyDirect$1.L$7;
            ringBufferCapacity = (RingBufferCapacity) byteBufferChannel$copyDirect$1.L$6;
            byteBufferChannel6 = (ByteBufferChannel) byteBufferChannel$copyDirect$1.L$5;
            byteBufferChannel5 = (ByteBufferChannel) byteBufferChannel$copyDirect$1.L$4;
            longRef2 = (Ref.LongRef) byteBufferChannel$copyDirect$1.L$3;
            JoiningState joiningState12 = (JoiningState) byteBufferChannel$copyDirect$1.L$2;
            ByteBufferChannel byteBufferChannel26 = (ByteBufferChannel) byteBufferChannel$copyDirect$1.L$1;
            ByteBufferChannel byteBufferChannel27 = (ByteBufferChannel) byteBufferChannel$copyDirect$1.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
                byteBufferChannel10 = byteBufferChannel25;
                joiningState6 = joiningState12;
                z = z6;
                byteBufferChannel14 = byteBufferChannel26;
                byteBuffer = byteBuffer3;
                byteBufferChannel3 = byteBufferChannel5;
                byteBufferChannel4 = byteBufferChannel27;
                j4 = j16;
                if (byteBufferChannel10.joining != null) {
                }
            } catch (Throwable th15) {
                th = th15;
                if (ringBufferCapacity.isFull()) {
                }
                if (byteBufferChannel6 != byteBufferChannel5) {
                }
                byteBufferChannel6.restoreStateAfterWrite$ktor_io();
                byteBufferChannel6.tryTerminate$ktor_io();
                throw th;
            }
        } catch (Throwable th16) {
            th = th16;
        }
    }

    public final void ensureClosedJoined(JoiningState joined) {
        ClosedElement closed = getClosed();
        if (closed == null) {
            return;
        }
        this.joining = null;
        if (!joined.getDelegateClose()) {
            joined.getDelegatedTo().flush();
            joined.complete();
            return;
        }
        ReadWriteBufferState state = joined.getDelegatedTo().getState();
        boolean z = (state instanceof ReadWriteBufferState.Writing) || (state instanceof ReadWriteBufferState.ReadingWriting);
        if (closed.getCause() != null || !z) {
            joined.getDelegatedTo().close(closed.getCause());
        } else {
            joined.getDelegatedTo().flush();
        }
        joined.complete();
    }

    public static /* synthetic */ Object writeFully$suspendImpl(ByteBufferChannel byteBufferChannel, byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
            Object objWriteFully = byteBufferChannelResolveDelegation.writeFully(bArr, i, i2, continuation);
            return objWriteFully == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFully : Unit.INSTANCE;
        }
        while (i2 > 0) {
            int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(bArr, i, i2);
            if (iWriteAsMuchAsPossible == 0) {
                break;
            }
            i += iWriteAsMuchAsPossible;
            i2 -= iWriteAsMuchAsPossible;
        }
        if (i2 == 0) {
            return Unit.INSTANCE;
        }
        Object objWriteFullySuspend = byteBufferChannel.writeFullySuspend(bArr, i, i2, continuation);
        return objWriteFullySuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFullySuspend : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0054 -> B:43:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeFullySuspend(byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) throws Throwable {
        C104165 c104165;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C104165) {
            c104165 = (C104165) continuation;
            int i3 = c104165.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c104165.label = i3 - Integer.MIN_VALUE;
            } else {
                c104165 = new C104165(continuation);
            }
        }
        Object objWriteAvailable = c104165.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c104165.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objWriteAvailable);
            byteBufferChannel = this;
            if (i2 > 0) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = c104165.I$1;
            i = c104165.I$0;
            byte[] bArr2 = (byte[]) c104165.L$1;
            byteBufferChannel = (ByteBufferChannel) c104165.L$0;
            ResultKt.throwOnFailure(objWriteAvailable);
            int iIntValue = ((Number) objWriteAvailable).intValue();
            i += iIntValue;
            byte[] bArr3 = bArr2;
            i2 = i5 - iIntValue;
            bArr = bArr3;
            if (i2 > 0) {
                c104165.L$0 = byteBufferChannel;
                c104165.L$1 = bArr;
                c104165.I$0 = i;
                c104165.I$1 = i2;
                c104165.label = 1;
                objWriteAvailable = byteBufferChannel.writeAvailable(bArr, i, i2, c104165);
                if (objWriteAvailable == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i6 = i2;
                bArr2 = bArr;
                i5 = i6;
                int iIntValue2 = ((Number) objWriteAvailable).intValue();
                i += iIntValue2;
                byte[] bArr32 = bArr2;
                i2 = i5 - iIntValue2;
                bArr = bArr32;
                if (i2 > 0) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static /* synthetic */ Object writeAvailable$suspendImpl(ByteBufferChannel byteBufferChannel, byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
            return byteBufferChannelResolveDelegation.writeAvailable(bArr, i, i2, continuation);
        }
        int iWriteAsMuchAsPossible = byteBufferChannel.writeAsMuchAsPossible(bArr, i, i2);
        if (iWriteAsMuchAsPossible > 0) {
            return Boxing.boxInt(iWriteAsMuchAsPossible);
        }
        return byteBufferChannel.writeSuspend(bArr, i, i2, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0059 -> B:52:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object writeSuspend(byte[] r7, int r8, int r9, kotlin.coroutines.Continuation<? super java.lang.Integer> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.p050io.ByteBufferChannel.C104211
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteBufferChannel$writeSuspend$1 r0 = (io.ktor.utils.p050io.ByteBufferChannel.C104211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteBufferChannel$writeSuspend$1 r0 = new io.ktor.utils.io.ByteBufferChannel$writeSuspend$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r10)
            goto L74
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$1
            byte[] r9 = (byte[]) r9
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteBufferChannel r2 = (io.ktor.utils.p050io.ByteBufferChannel) r2
            kotlin.ResultKt.throwOnFailure(r10)
            r5 = r9
            r9 = r7
            r7 = r5
            goto L5c
        L47:
            kotlin.ResultKt.throwOnFailure(r10)
            r2 = r6
        L4b:
            r0.L$0 = r2
            r0.L$1 = r7
            r0.I$0 = r8
            r0.I$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.tryWriteSuspend$ktor_io(r4, r0)
            if (r10 != r1) goto L5c
            return r1
        L5c:
            io.ktor.utils.io.internal.JoiningState r10 = r2.joining
            if (r10 == 0) goto L75
            io.ktor.utils.io.ByteBufferChannel r10 = r2.resolveDelegation(r2, r10)
            if (r10 == 0) goto L75
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r10 = r10.writeSuspend(r7, r8, r9, r0)
            if (r10 != r1) goto L74
            return r1
        L74:
            return r10
        L75:
            int r10 = r2.writeAsMuchAsPossible(r7, r8, r9)
            if (r10 <= 0) goto L4b
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p050io.ByteBufferChannel.writeSuspend(byte[], int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object write$suspendImpl(ByteBufferChannel byteBufferChannel, int i, Function1<? super ByteBuffer, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        C104101 c104101;
        if (continuation instanceof C104101) {
            c104101 = (C104101) continuation;
            int i2 = c104101.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104101.label = i2 - Integer.MIN_VALUE;
            } else {
                c104101 = byteBufferChannel.new C104101(continuation);
            }
        }
        Object obj = c104101.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104101.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (i <= 0) {
                throw new IllegalArgumentException("min should be positive".toString());
            }
            if (i > 4088) {
                throw new IllegalArgumentException(("Min(" + i + ") should'nt be greater than (4088)").toString());
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c104101.I$0;
            Function1<? super ByteBuffer, Unit> function12 = (Function1) c104101.L$1;
            ByteBufferChannel byteBufferChannel2 = (ByteBufferChannel) c104101.L$0;
            ResultKt.throwOnFailure(obj);
            i = i4;
            byteBufferChannel = byteBufferChannel2;
            function1 = function12;
        }
        while (byteBufferChannel.writeAvailable(i, function1) < 0) {
            c104101.L$0 = byteBufferChannel;
            c104101.L$1 = function1;
            c104101.I$0 = i;
            c104101.label = 1;
            if (byteBufferChannel.awaitFreeSpaceOrDelegate(i, function1, c104101) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitFreeSpaceOrDelegate(int i, Function1<? super ByteBuffer, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        C103821 c103821;
        ByteBufferChannel byteBufferChannel;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        if (continuation instanceof C103821) {
            c103821 = (C103821) continuation;
            int i2 = c103821.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103821.label = i2 - Integer.MIN_VALUE;
            } else {
                c103821 = new C103821(continuation);
            }
        }
        Object obj = c103821.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103821.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            c103821.L$0 = this;
            c103821.L$1 = function1;
            c103821.I$0 = i;
            c103821.label = 1;
            if (writeSuspend(i, c103821) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteBufferChannel = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            i = c103821.I$0;
            function1 = (Function1) c103821.L$1;
            byteBufferChannel = (ByteBufferChannel) c103821.L$0;
            ResultKt.throwOnFailure(obj);
        }
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) == null) {
            return Unit.INSTANCE;
        }
        c103821.L$0 = null;
        c103821.L$1 = null;
        c103821.label = 2;
        if (byteBufferChannelResolveDelegation.write(i, function1, c103821) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object writeWhile$suspendImpl(ByteBufferChannel byteBufferChannel, Function1<? super ByteBuffer, Boolean> function1, Continuation<? super Unit> continuation) throws Throwable {
        if (!byteBufferChannel.writeWhileNoSuspend(function1)) {
            return Unit.INSTANCE;
        }
        ClosedElement closed = byteBufferChannel.getClosed();
        if (closed != null) {
            ByteBufferChannelKt.rethrowClosed(closed.getSendException());
            throw new KotlinNothingValueException();
        }
        Object objWriteWhileSuspend = byteBufferChannel.writeWhileSuspend(function1, continuation);
        return objWriteWhileSuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteWhileSuspend : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00d3, code lost:
    
        if (r4.getClosed() != null) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00c5 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:102:0x005f, B:123:0x00c1, B:125:0x00c5, B:127:0x00cb, B:128:0x00cf, B:120:0x00a4), top: B:168:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x00be -> B:123:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeWhileSuspend(Function1<? super ByteBuffer, Boolean> function1, Continuation<? super Unit> continuation) throws Throwable {
        C104241 c104241;
        ByteBufferChannel byteBufferChannel;
        RingBufferCapacity ringBufferCapacity;
        long totalBytesWritten;
        ByteBufferChannel byteBufferChannel2;
        Ref.BooleanRef booleanRef;
        ByteBufferChannel byteBufferChannel3;
        ByteBuffer byteBuffer;
        RingBufferCapacity ringBufferCapacity2;
        ByteBufferChannel byteBufferChannel4;
        Function1<? super ByteBuffer, Boolean> function12;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        if (continuation instanceof C104241) {
            c104241 = (C104241) continuation;
            int i = c104241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104241.label = i - Integer.MIN_VALUE;
            } else {
                c104241 = new C104241(continuation);
            }
        }
        Object obj = c104241.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104241.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            totalBytesWritten = c104241.J$0;
            byteBufferChannel4 = (ByteBufferChannel) c104241.L$8;
            byteBuffer = (ByteBuffer) c104241.L$7;
            ringBufferCapacity2 = (RingBufferCapacity) c104241.L$6;
            ringBufferCapacity = (RingBufferCapacity) c104241.L$5;
            byteBufferChannel = (ByteBufferChannel) c104241.L$4;
            byteBufferChannel2 = (ByteBufferChannel) c104241.L$3;
            booleanRef = (Ref.BooleanRef) c104241.L$2;
            Function1<? super ByteBuffer, Boolean> function13 = (Function1) c104241.L$1;
            byteBufferChannel3 = (ByteBufferChannel) c104241.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                function12 = function13;
                if (byteBufferChannel4.joining == null) {
                    if (!byteBufferChannel4.writeWhileLoop(byteBuffer, ringBufferCapacity2, function12)) {
                        booleanRef.element = false;
                    }
                }
                if (!ringBufferCapacity.isFull() || byteBufferChannel.getAutoFlush()) {
                    byteBufferChannel.flush();
                }
                if (byteBufferChannel != byteBufferChannel2) {
                    byteBufferChannel2.setTotalBytesWritten$ktor_io(byteBufferChannel2.getTotalBytesWritten() + (byteBufferChannel.getTotalBytesWritten() - totalBytesWritten));
                }
                byteBufferChannel.restoreStateAfterWrite$ktor_io();
                byteBufferChannel.tryTerminate$ktor_io();
                if (!booleanRef.element) {
                    return Unit.INSTANCE;
                }
                ClosedElement closed = byteBufferChannel3.getClosed();
                if (closed != null) {
                    ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                    throw new KotlinNothingValueException();
                }
                if (byteBufferChannel3.joining == null) {
                    return Unit.INSTANCE;
                }
                c104241.L$0 = null;
                c104241.L$1 = null;
                c104241.L$2 = null;
                c104241.L$3 = null;
                c104241.L$4 = null;
                c104241.L$5 = null;
                c104241.L$6 = null;
                c104241.L$7 = null;
                c104241.L$8 = null;
                c104241.label = 2;
                if (byteBufferChannel3.writeWhile(function12, c104241) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                if (!ringBufferCapacity.isFull() || byteBufferChannel.getAutoFlush()) {
                    byteBufferChannel.flush();
                }
                if (byteBufferChannel != byteBufferChannel2) {
                    byteBufferChannel2.setTotalBytesWritten$ktor_io(byteBufferChannel2.getTotalBytesWritten() + (byteBufferChannel.getTotalBytesWritten() - totalBytesWritten));
                }
                byteBufferChannel.restoreStateAfterWrite$ktor_io();
                byteBufferChannel.tryTerminate$ktor_io();
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        booleanRef2.element = true;
        JoiningState joiningState = this.joining;
        byteBufferChannel = (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) ? this : byteBufferChannelResolveDelegation;
        ByteBuffer byteBuffer2 = byteBufferChannel.setupStateForWrite$ktor_io();
        if (byteBuffer2 == null) {
            booleanRef = booleanRef2;
            byteBufferChannel3 = this;
            function12 = function1;
            if (!booleanRef.element) {
            }
        } else {
            ringBufferCapacity = byteBufferChannel.getState().capacity;
            totalBytesWritten = byteBufferChannel.getTotalBytesWritten();
            try {
                ClosedElement closed2 = byteBufferChannel.getClosed();
                if (closed2 != null) {
                    ByteBufferChannelKt.rethrowClosed(closed2.getSendException());
                    throw new KotlinNothingValueException();
                }
                booleanRef = booleanRef2;
                byteBufferChannel3 = this;
                byteBufferChannel2 = byteBufferChannel3;
                byteBuffer = byteBuffer2;
                ringBufferCapacity2 = ringBufferCapacity;
                byteBufferChannel4 = byteBufferChannel;
                function12 = function1;
                c104241.L$0 = byteBufferChannel3;
                c104241.L$1 = function12;
                c104241.L$2 = booleanRef;
                c104241.L$3 = byteBufferChannel2;
                c104241.L$4 = byteBufferChannel;
                c104241.L$5 = ringBufferCapacity;
                c104241.L$6 = ringBufferCapacity2;
                c104241.L$7 = byteBuffer;
                c104241.L$8 = byteBufferChannel4;
                c104241.J$0 = totalBytesWritten;
                c104241.label = 1;
                if (byteBufferChannel4.writeSuspend(1, c104241) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (byteBufferChannel4.joining == null) {
                }
                if (!ringBufferCapacity.isFull()) {
                    byteBufferChannel.flush();
                    if (byteBufferChannel != byteBufferChannel2) {
                    }
                    byteBufferChannel.restoreStateAfterWrite$ktor_io();
                    byteBufferChannel.tryTerminate$ktor_io();
                    if (!booleanRef.element) {
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                byteBufferChannel2 = this;
                if (!ringBufferCapacity.isFull()) {
                    byteBufferChannel.flush();
                }
                if (byteBufferChannel != byteBufferChannel2) {
                }
                byteBufferChannel.restoreStateAfterWrite$ktor_io();
                byteBufferChannel.tryTerminate$ktor_io();
                throw th;
            }
        }
    }

    public final boolean writeWhileLoop(ByteBuffer dst, RingBufferCapacity capacity, Function1<? super ByteBuffer, Boolean> block) {
        int iCapacity = dst.capacity() - this.reservedSize;
        boolean z = true;
        while (z) {
            int iTryWriteAtLeast = capacity.tryWriteAtLeast(1);
            if (iTryWriteAtLeast == 0) {
                break;
            }
            int i = this.writePosition;
            int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(i + iTryWriteAtLeast, iCapacity);
            dst.limit(iCoerceAtMost);
            dst.position(i);
            try {
                boolean zBooleanValue = block.invoke(dst).booleanValue();
                if (dst.limit() != iCoerceAtMost) {
                    throw new IllegalStateException("Buffer limit modified.".toString());
                }
                int iPosition = dst.position() - i;
                if (iPosition < 0) {
                    throw new IllegalStateException("Position has been moved backward: pushback is not supported.".toString());
                }
                bytesWritten(dst, capacity, iPosition);
                if (iPosition < iTryWriteAtLeast) {
                    capacity.completeRead(iTryWriteAtLeast - iPosition);
                }
                z = zBooleanValue;
            } catch (Throwable th) {
                capacity.completeRead(iTryWriteAtLeast);
                throw th;
            }
        }
        return z;
    }

    @Override // io.ktor.utils.p050io.HasReadSession
    @NotNull
    public SuspendableReadSession startReadSession() {
        return this.readSession;
    }

    @Override // io.ktor.utils.p050io.HasReadSession
    public void endReadSession() {
        this.readSession.completed();
        ReadWriteBufferState state = getState();
        if ((state instanceof ReadWriteBufferState.Reading) || (state instanceof ReadWriteBufferState.ReadingWriting)) {
            restoreStateAfterRead();
            tryTerminate$ktor_io();
        }
    }

    @Override // io.ktor.utils.p050io.HasWriteSession
    @Nullable
    public WriterSuspendSession beginWriteSession() {
        WriteSessionImpl writeSessionImpl = this.writeSession;
        writeSessionImpl.begin();
        return writeSessionImpl;
    }

    @Override // io.ktor.utils.p050io.HasWriteSession
    public void endWriteSession(int written) {
        this.writeSession.written(written);
        this.writeSession.complete();
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/LookAheadSession;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readSession$1 */
    /* loaded from: classes5.dex */
    public static final class C104011 extends Lambda implements Function1<LookAheadSession, Unit> {
        public final /* synthetic */ Function1<ReadSession, Unit> $consumer;
        public final /* synthetic */ ByteBufferChannel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C104011(Function1<? super ReadSession, Unit> function1, ByteBufferChannel byteBufferChannel) {
            super(1);
            function1 = function1;
            byteBufferChannel = byteBufferChannel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LookAheadSession lookAheadSession) {
            invoke2(lookAheadSession);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull LookAheadSession lookAhead) {
            Intrinsics.checkNotNullParameter(lookAhead, "$this$lookAhead");
            try {
                function1.invoke(byteBufferChannel.readSession);
            } finally {
                byteBufferChannel.readSession.completed();
            }
        }
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Deprecated(message = "Use read { } instead.")
    public void readSession(@NotNull Function1<? super ReadSession, Unit> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        lookAhead(new Function1<LookAheadSession, Unit>() { // from class: io.ktor.utils.io.ByteBufferChannel.readSession.1
            public final /* synthetic */ Function1<ReadSession, Unit> $consumer;
            public final /* synthetic */ ByteBufferChannel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C104011(Function1<? super ReadSession, Unit> consumer2, ByteBufferChannel this) {
                super(1);
                function1 = consumer2;
                byteBufferChannel = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LookAheadSession lookAheadSession) {
                invoke2(lookAheadSession);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull LookAheadSession lookAhead) {
                Intrinsics.checkNotNullParameter(lookAhead, "$this$lookAhead");
                try {
                    function1.invoke(byteBufferChannel.readSession);
                } finally {
                    byteBufferChannel.readSession.completed();
                }
            }
        });
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/LookAheadSuspendSession;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel$readSuspendableSession$2", m7120f = "ByteBufferChannel.kt", m7121i = {}, m7122l = {1630}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readSuspendableSession$2 */
    /* loaded from: classes7.dex */
    public static final class C104052 extends SuspendLambda implements Function2<LookAheadSuspendSession, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function2<SuspendableReadSession, Continuation<? super Unit>, Object> $consumer;
        public int label;
        public final /* synthetic */ ByteBufferChannel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C104052(Function2<? super SuspendableReadSession, ? super Continuation<? super Unit>, ? extends Object> function2, ByteBufferChannel byteBufferChannel, Continuation<? super C104052> continuation) {
            super(2, continuation);
            this.$consumer = function2;
            this.this$0 = byteBufferChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C104052(this.$consumer, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull LookAheadSuspendSession lookAheadSuspendSession, @Nullable Continuation<? super Unit> continuation) {
            return ((C104052) create(lookAheadSuspendSession, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2<SuspendableReadSession, Continuation<? super Unit>, Object> function2 = this.$consumer;
                    ReadSessionImpl readSessionImpl = this.this$0.readSession;
                    this.label = 1;
                    if (function2.invoke(readSessionImpl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.readSession.completed();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.readSession.completed();
                throw th;
            }
        }
    }

    @Deprecated(message = "Use read { } instead.")
    public static /* synthetic */ Object readSuspendableSession$suspendImpl(ByteBufferChannel byteBufferChannel, Function2<? super SuspendableReadSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objLookAheadSuspend = byteBufferChannel.lookAheadSuspend(new C104052(function2, byteBufferChannel, null), continuation);
        return objLookAheadSuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objLookAheadSuspend : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[PHI: r10 r12 r13
  PHI (r10v2 long) = (r10v1 long), (r10v6 long) binds: [B:59:0x003b, B:75:0x0080] A[DONT_GENERATE, DONT_INLINE]
  PHI (r12v2 kotlin.jvm.internal.Ref$LongRef) = (r12v1 kotlin.jvm.internal.Ref$LongRef), (r12v4 kotlin.jvm.internal.Ref$LongRef) binds: [B:59:0x003b, B:75:0x0080] A[DONT_GENERATE, DONT_INLINE]
  PHI (r13v1 io.ktor.utils.io.ByteBufferChannel) = (r13v0 io.ktor.utils.io.ByteBufferChannel), (r13v2 io.ktor.utils.io.ByteBufferChannel) binds: [B:59:0x003b, B:75:0x0080] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0077 -> B:74:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object discardSuspend(long j, long j2, Continuation<? super Long> continuation) throws Throwable {
        C103831 c103831;
        long j3;
        Ref.LongRef longRef;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C103831) {
            c103831 = (C103831) continuation;
            int i = c103831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103831.label = i - Integer.MIN_VALUE;
            } else {
                c103831 = new C103831(continuation);
            }
        }
        Object suspend = c103831.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(suspend);
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = j;
            j3 = j2;
            longRef = longRef2;
            byteBufferChannel = this;
            while (longRef.element < j3) {
            }
            return Boxing.boxLong(longRef.element);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j3 = c103831.J$0;
        longRef = (Ref.LongRef) c103831.L$1;
        byteBufferChannel = (ByteBufferChannel) c103831.L$0;
        ResultKt.throwOnFailure(suspend);
        if (((Boolean) suspend).booleanValue()) {
            while (longRef.element < j3) {
                ByteBuffer byteBuffer = byteBufferChannel.setupStateForRead();
                if (byteBuffer != null) {
                    RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
                    try {
                        if (ringBufferCapacity._availableForRead$internal != 0) {
                            int iTryReadAtMost = ringBufferCapacity.tryReadAtMost((int) Math.min(ParserMinimalBase.MAX_INT_L, j3 - longRef.element));
                            byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, iTryReadAtMost);
                            longRef.element += iTryReadAtMost;
                        }
                    } finally {
                        byteBufferChannel.restoreStateAfterRead();
                        byteBufferChannel.tryTerminate$ktor_io();
                    }
                }
                if (!byteBufferChannel.isClosedForRead()) {
                    c103831.L$0 = byteBufferChannel;
                    c103831.L$1 = longRef;
                    c103831.J$0 = j3;
                    c103831.label = 1;
                    suspend = byteBufferChannel.readSuspend(1, c103831);
                    if (suspend == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) suspend).booleanValue()) {
                    }
                }
            }
        }
        return Boxing.boxLong(longRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readBlockSuspend(int i, Function1<? super ByteBuffer, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        C103891 c103891;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C103891) {
            c103891 = (C103891) continuation;
            int i2 = c103891.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103891.label = i2 - Integer.MIN_VALUE;
            } else {
                c103891 = new C103891(continuation);
            }
        }
        Object suspend = c103891.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103891.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspend);
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, 1);
            c103891.L$0 = this;
            c103891.L$1 = function1;
            c103891.I$0 = i;
            c103891.label = 1;
            suspend = readSuspend(iCoerceAtLeast, c103891);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteBufferChannel = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(suspend);
                return Unit.INSTANCE;
            }
            i = c103891.I$0;
            function1 = (Function1) c103891.L$1;
            byteBufferChannel = (ByteBufferChannel) c103891.L$0;
            ResultKt.throwOnFailure(suspend);
        }
        if (((Boolean) suspend).booleanValue()) {
            c103891.L$0 = null;
            c103891.L$1 = null;
            c103891.label = 2;
            if (byteBufferChannel.read(i, function1, c103891) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i > 0) {
            throw new EOFException("Got EOF but at least " + i + " bytes were expected");
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object writePacket$suspendImpl(ByteBufferChannel byteBufferChannel, ByteReadPacket byteReadPacket, Continuation<? super Unit> continuation) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        ByteBufferChannel byteBufferChannelResolveDelegation2;
        JoiningState joiningState = byteBufferChannel.joining;
        if (joiningState != null && (byteBufferChannelResolveDelegation2 = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) != null) {
            Object objWritePacket = byteBufferChannelResolveDelegation2.writePacket(byteReadPacket, continuation);
            return objWritePacket == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWritePacket : Unit.INSTANCE;
        }
        while ((!byteReadPacket.getEndOfInput()) && byteBufferChannel.tryWritePacketPart(byteReadPacket) != 0) {
            try {
            } catch (Throwable th) {
                byteReadPacket.release();
                throw th;
            }
        }
        if (byteReadPacket.getRemaining() > 0) {
            JoiningState joiningState2 = byteBufferChannel.joining;
            if (joiningState2 == null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState2)) == null) {
                Object objWritePacketSuspend = byteBufferChannel.writePacketSuspend(byteReadPacket, continuation);
                return objWritePacketSuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWritePacketSuspend : Unit.INSTANCE;
            }
            Object objWritePacket2 = byteBufferChannelResolveDelegation.writePacket(byteReadPacket, continuation);
            return objWritePacket2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWritePacket2 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0051 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:59:0x002c, B:81:0x0076, B:66:0x0042, B:74:0x005e, B:76:0x0062, B:78:0x0068, B:84:0x007c, B:69:0x004a, B:71:0x0051), top: B:90:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x005b -> B:74:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writePacketSuspend(ByteReadPacket byteReadPacket, Continuation<? super Unit> continuation) throws Throwable {
        C104191 c104191;
        ByteBufferChannel byteBufferChannel;
        ByteBufferChannel byteBufferChannelResolveDelegation;
        if (continuation instanceof C104191) {
            c104191 = (C104191) continuation;
            int i = c104191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104191.label = i - Integer.MIN_VALUE;
            } else {
                c104191 = new C104191(continuation);
            }
        }
        Object obj = c104191.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104191.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                byteBufferChannel = this;
                if (!byteReadPacket.getEndOfInput()) {
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadPacket = (ByteReadPacket) c104191.L$0;
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                byteReadPacket = (ByteReadPacket) c104191.L$1;
                byteBufferChannel = (ByteBufferChannel) c104191.L$0;
                ResultKt.throwOnFailure(obj);
                JoiningState joiningState = byteBufferChannel.joining;
                if (joiningState != null || (byteBufferChannelResolveDelegation = byteBufferChannel.resolveDelegation(byteBufferChannel, joiningState)) == null) {
                    byteBufferChannel.tryWritePacketPart(byteReadPacket);
                    if (!byteReadPacket.getEndOfInput()) {
                        c104191.L$0 = byteBufferChannel;
                        c104191.L$1 = byteReadPacket;
                        c104191.label = 1;
                        if (byteBufferChannel.writeSuspend(1, c104191) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        JoiningState joiningState2 = byteBufferChannel.joining;
                        if (joiningState2 != null) {
                        }
                        byteBufferChannel.tryWritePacketPart(byteReadPacket);
                        if (!byteReadPacket.getEndOfInput()) {
                            byteReadPacket.release();
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    c104191.L$0 = byteReadPacket;
                    c104191.L$1 = null;
                    c104191.label = 2;
                    if (byteBufferChannelResolveDelegation.writePacket(byteReadPacket, c104191) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
        } finally {
            byteReadPacket.release();
        }
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Deprecated(message = "Use read { } instead.")
    public <R> R lookAhead(@NotNull Function1<? super LookAheadSession, ? extends R> visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            return visitor.invoke(new FailedLookAhead(closedCause));
        }
        if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            return visitor.invoke(TerminatedLookAhead.INSTANCE);
        }
        boolean z = false;
        R rInvoke = null;
        if (setupStateForRead() != null) {
            try {
                if (getState().capacity._availableForRead$internal != 0) {
                    rInvoke = visitor.invoke(this);
                    restoreStateAfterRead();
                    tryTerminate$ktor_io();
                    z = true;
                }
            } finally {
                restoreStateAfterRead();
                tryTerminate$ktor_io();
            }
        }
        if (!z) {
            Throwable closedCause2 = getClosedCause();
            return closedCause2 != null ? visitor.invoke(new FailedLookAhead(closedCause2)) : visitor.invoke(TerminatedLookAhead.INSTANCE);
        }
        Intrinsics.checkNotNull(rInvoke);
        return rInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0172  */
    @Deprecated(message = "Use read { } instead.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <R> Object lookAheadSuspend$suspendImpl(ByteBufferChannel byteBufferChannel, Function2<? super LookAheadSuspendSession, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) throws Throwable {
        C103851 c103851;
        Ref.ObjectRef objectRef;
        ByteBufferChannel byteBufferChannel2;
        Throwable th;
        ByteBufferChannel byteBufferChannel3;
        Function2<? super LookAheadSuspendSession, ? super Continuation<? super R>, ? extends Object> function22;
        Ref.ObjectRef objectRef2;
        T t;
        Ref.ObjectRef objectRef3;
        Object obj;
        Object obj2;
        ByteBufferChannel byteBufferChannel4;
        Throwable th2;
        Ref.ObjectRef objectRef4;
        T t2;
        Ref.ObjectRef objectRef5;
        Object obj3;
        Object obj4;
        ReadWriteBufferState state;
        ReadWriteBufferState state2;
        if (continuation instanceof C103851) {
            c103851 = (C103851) continuation;
            int i = c103851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103851.label = i - Integer.MIN_VALUE;
            } else {
                c103851 = byteBufferChannel.new C103851(continuation);
            }
        }
        Object obj5 = c103851.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch (c103851.label) {
            case 0:
                ResultKt.throwOnFailure(obj5);
                Throwable closedCause = byteBufferChannel.getClosedCause();
                if (closedCause != null) {
                    FailedLookAhead failedLookAhead = new FailedLookAhead(closedCause);
                    c103851.label = 1;
                    Object objInvoke = function2.invoke(failedLookAhead, c103851);
                    obj = objInvoke;
                    return objInvoke == coroutine_suspended ? coroutine_suspended : obj;
                }
                if (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                    TerminatedLookAhead terminatedLookAhead = TerminatedLookAhead.INSTANCE;
                    c103851.label = 2;
                    Object objInvoke2 = function2.invoke(terminatedLookAhead, c103851);
                    obj2 = objInvoke2;
                    return objInvoke2 == coroutine_suspended ? coroutine_suspended : obj2;
                }
                objectRef = new Ref.ObjectRef();
                if (byteBufferChannel.setupStateForRead() != null) {
                    try {
                        if (byteBufferChannel.getState().capacity._availableForRead$internal != 0) {
                            c103851.L$0 = byteBufferChannel;
                            c103851.L$1 = function2;
                            c103851.L$2 = objectRef;
                            c103851.L$3 = byteBufferChannel;
                            c103851.L$4 = objectRef;
                            c103851.label = 3;
                            Object objInvoke3 = function2.invoke(byteBufferChannel, c103851);
                            if (objInvoke3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteBufferChannel3 = byteBufferChannel;
                            function22 = function2;
                            byteBufferChannel2 = byteBufferChannel3;
                            objectRef2 = objectRef;
                            t = objInvoke3;
                            objectRef3 = objectRef2;
                            objectRef2.element = t;
                            byteBufferChannel2.restoreStateAfterRead();
                            byteBufferChannel2.tryTerminate$ktor_io();
                            objectRef = objectRef3;
                            function2 = function22;
                            byteBufferChannel = byteBufferChannel3;
                            if (!z) {
                                Throwable closedCause2 = byteBufferChannel.getClosedCause();
                                if (closedCause2 != null) {
                                    FailedLookAhead failedLookAhead2 = new FailedLookAhead(closedCause2);
                                    c103851.L$0 = null;
                                    c103851.L$1 = null;
                                    c103851.L$2 = null;
                                    c103851.L$3 = null;
                                    c103851.L$4 = null;
                                    c103851.label = 4;
                                    Object objInvoke4 = function2.invoke(failedLookAhead2, c103851);
                                    obj3 = objInvoke4;
                                    return objInvoke4 == coroutine_suspended ? coroutine_suspended : obj3;
                                }
                                if (byteBufferChannel.getState() == ReadWriteBufferState.Terminated.INSTANCE) {
                                    TerminatedLookAhead terminatedLookAhead2 = TerminatedLookAhead.INSTANCE;
                                    c103851.L$0 = null;
                                    c103851.L$1 = null;
                                    c103851.L$2 = null;
                                    c103851.L$3 = null;
                                    c103851.L$4 = null;
                                    c103851.label = 5;
                                    Object objInvoke5 = function2.invoke(terminatedLookAhead2, c103851);
                                    obj4 = objInvoke5;
                                    return objInvoke5 == coroutine_suspended ? coroutine_suspended : obj4;
                                }
                                try {
                                    c103851.L$0 = byteBufferChannel;
                                    c103851.L$1 = objectRef;
                                    c103851.L$2 = objectRef;
                                    c103851.L$3 = null;
                                    c103851.L$4 = null;
                                    c103851.label = 6;
                                    Object objInvoke6 = function2.invoke(byteBufferChannel, c103851);
                                    if (objInvoke6 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    byteBufferChannel4 = byteBufferChannel;
                                    objectRef4 = objectRef;
                                    t2 = objInvoke6;
                                    objectRef5 = objectRef4;
                                    objectRef4.element = t2;
                                    state2 = byteBufferChannel4.getState();
                                    if (!state2.getIdle() && state2 != ReadWriteBufferState.Terminated.INSTANCE) {
                                        if (!(state2 instanceof ReadWriteBufferState.Reading) || (state2 instanceof ReadWriteBufferState.ReadingWriting)) {
                                            byteBufferChannel4.restoreStateAfterRead();
                                        }
                                        byteBufferChannel4.tryTerminate$ktor_io();
                                    }
                                    objectRef = objectRef5;
                                } catch (Throwable th3) {
                                    byteBufferChannel4 = byteBufferChannel;
                                    th2 = th3;
                                    state = byteBufferChannel4.getState();
                                    if (!state.getIdle() && state != ReadWriteBufferState.Terminated.INSTANCE) {
                                        if (!(state instanceof ReadWriteBufferState.Reading) || (state instanceof ReadWriteBufferState.ReadingWriting)) {
                                            byteBufferChannel4.restoreStateAfterRead();
                                        }
                                        byteBufferChannel4.tryTerminate$ktor_io();
                                    }
                                    throw th2;
                                }
                            }
                            return objectRef.element;
                        }
                        byteBufferChannel.restoreStateAfterRead();
                        byteBufferChannel.tryTerminate$ktor_io();
                    } catch (Throwable th4) {
                        byteBufferChannel2 = byteBufferChannel;
                        th = th4;
                        byteBufferChannel2.restoreStateAfterRead();
                        byteBufferChannel2.tryTerminate$ktor_io();
                        throw th;
                    }
                }
                z = false;
                if (!z) {
                }
                return objectRef.element;
            case 1:
                ResultKt.throwOnFailure(obj5);
                obj = obj5;
            case 2:
                ResultKt.throwOnFailure(obj5);
                obj2 = obj5;
            case 3:
                objectRef2 = (Ref.ObjectRef) c103851.L$4;
                byteBufferChannel2 = (ByteBufferChannel) c103851.L$3;
                objectRef3 = (Ref.ObjectRef) c103851.L$2;
                function22 = (Function2) c103851.L$1;
                byteBufferChannel3 = (ByteBufferChannel) c103851.L$0;
                try {
                    ResultKt.throwOnFailure(obj5);
                    t = obj5;
                    objectRef2.element = t;
                    byteBufferChannel2.restoreStateAfterRead();
                    byteBufferChannel2.tryTerminate$ktor_io();
                    objectRef = objectRef3;
                    function2 = function22;
                    byteBufferChannel = byteBufferChannel3;
                    if (!z) {
                    }
                    return objectRef.element;
                } catch (Throwable th5) {
                    th = th5;
                    byteBufferChannel2.restoreStateAfterRead();
                    byteBufferChannel2.tryTerminate$ktor_io();
                    throw th;
                }
            case 4:
                ResultKt.throwOnFailure(obj5);
                obj3 = obj5;
            case 5:
                ResultKt.throwOnFailure(obj5);
                obj4 = obj5;
            case 6:
                objectRef4 = (Ref.ObjectRef) c103851.L$2;
                objectRef5 = (Ref.ObjectRef) c103851.L$1;
                byteBufferChannel4 = (ByteBufferChannel) c103851.L$0;
                try {
                    ResultKt.throwOnFailure(obj5);
                    t2 = obj5;
                    objectRef4.element = t2;
                    state2 = byteBufferChannel4.getState();
                    if (!state2.getIdle()) {
                        if (!(state2 instanceof ReadWriteBufferState.Reading)) {
                            byteBufferChannel4.restoreStateAfterRead();
                            byteBufferChannel4.tryTerminate$ktor_io();
                            break;
                        }
                        return objectRef.element;
                    }
                    objectRef = objectRef5;
                    return objectRef.element;
                } catch (Throwable th6) {
                    th2 = th6;
                    state = byteBufferChannel4.getState();
                    if (!state.getIdle()) {
                        if (!(state instanceof ReadWriteBufferState.Reading)) {
                            byteBufferChannel4.restoreStateAfterRead();
                            byteBufferChannel4.tryTerminate$ktor_io();
                            break;
                        }
                        break;
                    }
                    throw th2;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Unit] */
    @Deprecated(message = "Use write { } instead.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object writeSuspendSession$suspendImpl(ByteBufferChannel byteBufferChannel, Function2<? super WriterSuspendSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        C104231 c104231;
        WriteSessionImpl writeSessionImpl;
        if (continuation instanceof C104231) {
            c104231 = (C104231) continuation;
            int i = c104231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104231.label = i - Integer.MIN_VALUE;
            } else {
                c104231 = byteBufferChannel.new C104231(continuation);
            }
        }
        Object obj = c104231.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104231.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                writeSessionImpl = byteBufferChannel.writeSession;
                writeSessionImpl.begin();
                c104231.L$0 = writeSessionImpl;
                c104231.label = 1;
                if (function2.invoke(writeSessionImpl, c104231) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                writeSessionImpl = (WriteSessionImpl) c104231.L$0;
                ResultKt.throwOnFailure(obj);
            }
            writeSessionImpl.complete();
            byteBufferChannel = Unit.INSTANCE;
            return byteBufferChannel;
        } catch (Throwable th) {
            byteBufferChannel.complete();
            throw th;
        }
    }

    @Override // io.ktor.utils.p050io.LookAheadSession
    /* renamed from: consumed */
    public void mo15689consumed(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ReadWriteBufferState state = getState();
        if (state.capacity.tryReadExact(n)) {
            if (n > 0) {
                bytesRead(state.getReadBuffer(), state.capacity, n);
            }
        } else {
            throw new IllegalStateException("Unable to consume " + n + " bytes: not enough available bytes");
        }
    }

    @Override // io.ktor.utils.p050io.LookAheadSuspendSession
    @Nullable
    public final Object awaitAtLeast(int i, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        if (i < 0) {
            throw new IllegalArgumentException(("atLeast parameter shouldn't be negative: " + i).toString());
        }
        if (i > 4088) {
            throw new IllegalArgumentException(("atLeast parameter shouldn't be larger than max buffer size of 4088: " + i).toString());
        }
        if (getState().capacity._availableForRead$internal >= i) {
            if (getState().getIdle() || (getState() instanceof ReadWriteBufferState.Writing)) {
                setupStateForRead();
            }
            return Boxing.boxBoolean(true);
        }
        if (getState().getIdle() || (getState() instanceof ReadWriteBufferState.Writing)) {
            return awaitAtLeastSuspend(i, continuation);
        }
        if (i == 1) {
            return readSuspendImpl(1, continuation);
        }
        return readSuspend(i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitAtLeastSuspend(int i, Continuation<? super Boolean> continuation) throws Throwable {
        C103811 c103811;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C103811) {
            c103811 = (C103811) continuation;
            int i2 = c103811.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103811.label = i2 - Integer.MIN_VALUE;
            } else {
                c103811 = new C103811(continuation);
            }
        }
        Object suspend = c103811.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103811.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspend);
            c103811.L$0 = this;
            c103811.label = 1;
            suspend = readSuspend(i, c103811);
            if (suspend == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteBufferChannel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBufferChannel = (ByteBufferChannel) c103811.L$0;
            ResultKt.throwOnFailure(suspend);
        }
        boolean zBooleanValue = ((Boolean) suspend).booleanValue();
        if (zBooleanValue && byteBufferChannel.getState().getIdle()) {
            byteBufferChannel.setupStateForRead();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Override // io.ktor.utils.p050io.LookAheadSession
    @Nullable
    public ByteBuffer request(int skip, int atLeast) {
        ReadWriteBufferState state = getState();
        int i = state.capacity._availableForRead$internal;
        int i2 = this.readPosition;
        if (i < atLeast + skip) {
            return null;
        }
        if (state.getIdle() || (!(state instanceof ReadWriteBufferState.Reading) && !(state instanceof ReadWriteBufferState.ReadingWriting))) {
            if (setupStateForRead() == null) {
                return null;
            }
            return request(skip, atLeast);
        }
        ByteBuffer readBuffer = state.getReadBuffer();
        prepareBuffer(readBuffer, carryIndex(readBuffer, i2 + skip), i - skip);
        if (readBuffer.remaining() >= atLeast) {
            return readBuffer;
        }
        return null;
    }

    public final int afterBufferVisited(ByteBuffer buffer, RingBufferCapacity capacity) {
        int iPosition = buffer.position() - this.readPosition;
        if (iPosition > 0) {
            if (!capacity.tryReadExact(iPosition)) {
                throw new IllegalStateException("Consumed more bytes than available");
            }
            bytesRead(buffer, capacity, iPosition);
            prepareBuffer(buffer, this.readPosition, capacity._availableForRead$internal);
        }
        return iPosition;
    }

    public final Object readUTF8LineToAscii(Appendable appendable, int i, Continuation<? super Boolean> continuation) throws Throwable {
        if (getState() == ReadWriteBufferState.Terminated.INSTANCE) {
            Throwable closedCause = getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            return Boxing.boxBoolean(false);
        }
        return readUTF8LineToUtf8Suspend(appendable, i, continuation);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:152:0x0130
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0188  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x011f -> B:123:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readUTF8LineToUtf8Suspend(java.lang.Appendable r24, int r25, kotlin.coroutines.Continuation<? super java.lang.Boolean> r26) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p050io.ByteBufferChannel.readUTF8LineToUtf8Suspend(java.lang.Appendable, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "buffer", "Ljava/nio/ByteBuffer;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readUTF8LineToUtf8Suspend$2 */
    /* loaded from: classes5.dex */
    public static final class C104082 extends Lambda implements Function1<ByteBuffer, Unit> {
        public final /* synthetic */ Ref.BooleanRef $caret;
        public final /* synthetic */ Ref.IntRef $consumed;
        public final /* synthetic */ int $limit;
        public final /* synthetic */ Ref.BooleanRef $newLine;
        public final /* synthetic */ Appendable $out;
        public final /* synthetic */ char[] $output;
        public final /* synthetic */ Ref.IntRef $required;
        public final /* synthetic */ Ref.ObjectRef<ByteBuffer> $transferBuffer;
        public final /* synthetic */ Ref.IntRef $transferredRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104082(Ref.ObjectRef<ByteBuffer> objectRef, int i, char[] cArr, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Appendable appendable, Ref.IntRef intRef3) {
            super(1);
            objectRef = objectRef;
            i = i;
            cArr = cArr;
            intRef = intRef;
            intRef = intRef2;
            booleanRef = booleanRef;
            booleanRef = booleanRef2;
            appendable = appendable;
            intRef = intRef3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) throws IOException {
            invoke2(byteBuffer);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.Object] */
        /* renamed from: invoke */
        public final void invoke2(@NotNull ByteBuffer buffer) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int iPosition = buffer.position();
            ByteBuffer byteBuffer = objectRef.element;
            if (byteBuffer != null) {
                int iLimit = buffer.limit();
                buffer.limit(Math.min(buffer.limit(), buffer.position() + byteBuffer.remaining()));
                byteBuffer.put(buffer);
                byteBuffer.flip();
                buffer.limit(iLimit);
            } else {
                byteBuffer = buffer;
            }
            int i = i;
            long jDecodeUTF8Line = UTFKt.decodeUTF8Line(byteBuffer, cArr, 0, i == Integer.MAX_VALUE ? cArr.length : Math.min(cArr.length, i - intRef.element));
            Ref.ObjectRef<ByteBuffer> objectRef = objectRef;
            ByteBuffer byteBuffer2 = objectRef.element;
            if (byteBuffer2 != null) {
                Ref.IntRef intRef = intRef;
                buffer.position((iPosition + byteBuffer2.position()) - intRef.element);
                ObjectPoolKt.getBufferPool().recycle(byteBuffer2);
                objectRef.element = null;
                intRef.element = 0;
            }
            int i2 = (int) (jDecodeUTF8Line >> 32);
            int i3 = (int) (jDecodeUTF8Line & 4294967295L);
            intRef.element = Math.max(1, i3);
            if (i3 == -1) {
                booleanRef.element = true;
            }
            if (i3 != -1 && buffer.hasRemaining() && buffer.get(buffer.position()) == 13) {
                buffer.position(buffer.position() + 1);
                booleanRef.element = true;
            }
            if (i3 != -1 && buffer.hasRemaining() && buffer.get(buffer.position()) == 10) {
                buffer.position(buffer.position() + 1);
                booleanRef.element = true;
            }
            Appendable appendable = appendable;
            if (appendable instanceof StringBuilder) {
                ((StringBuilder) appendable).append(cArr, 0, i2);
            } else {
                appendable.append(CharBuffer.wrap(cArr, 0, i2), 0, i2);
            }
            intRef.element += i2;
            if (i2 == 0 && buffer.remaining() < i3) {
                Ref.ObjectRef<ByteBuffer> objectRef2 = objectRef;
                ?? Borrow = ObjectPoolKt.getBufferPool().borrow();
                intRef.element = buffer.remaining();
                ((ByteBuffer) Borrow).put(buffer);
                objectRef2.element = Borrow;
            }
            int i4 = i;
            if (i4 != Integer.MAX_VALUE && intRef.element >= i4 && !booleanRef.element) {
                throw new TooLongLineException("Line is longer than limit");
            }
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "Ljava/nio/ByteBuffer;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.utils.io.ByteBufferChannel$readUTF8LineToUtf8Suspend$3 */
    /* loaded from: classes5.dex */
    public static final class C104093 extends Lambda implements Function1<ByteBuffer, Unit> {
        public C104093() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
            invoke2(byteBuffer);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull ByteBuffer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.get(it.position()) == 10) {
                it.position(it.position() + 1);
                booleanRef.element = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object readUTF8Line$suspendImpl(ByteBufferChannel byteBufferChannel, int i, Continuation<? super String> continuation) throws Throwable {
        C104061 c104061;
        StringBuilder sb;
        if (continuation instanceof C104061) {
            c104061 = (C104061) continuation;
            int i2 = c104061.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104061.label = i2 - Integer.MIN_VALUE;
            } else {
                c104061 = byteBufferChannel.new C104061(continuation);
            }
        }
        Object obj = c104061.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104061.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            StringBuilder sb2 = new StringBuilder();
            c104061.L$0 = sb2;
            c104061.label = 1;
            Object uTF8LineTo = byteBufferChannel.readUTF8LineTo(sb2, i, c104061);
            if (uTF8LineTo == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = uTF8LineTo;
            sb = sb2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = (StringBuilder) c104061.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb.toString();
        }
        return null;
    }

    public static /* synthetic */ Object readRemaining$suspendImpl(ByteBufferChannel byteBufferChannel, long j, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        if (byteBufferChannel.isClosedForWrite()) {
            Throwable closedCause = byteBufferChannel.getClosedCause();
            if (closedCause != null) {
                ByteBufferChannelKt.rethrowClosed(closedCause);
                throw new KotlinNothingValueException();
            }
            return byteBufferChannel.remainingPacket(j);
        }
        return byteBufferChannel.readRemainingSuspend(j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0071 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:69:0x0039, B:89:0x00a7, B:95:0x00b6, B:78:0x0061, B:80:0x0071, B:81:0x0075, B:83:0x008b, B:85:0x0091), top: B:112:0x0039, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008b A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:69:0x0039, B:89:0x00a7, B:95:0x00b6, B:78:0x0061, B:80:0x0071, B:81:0x0075, B:83:0x008b, B:85:0x0091), top: B:112:0x0039, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b6 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #2 {all -> 0x003e, blocks: (B:69:0x0039, B:89:0x00a7, B:95:0x00b6, B:78:0x0061, B:80:0x0071, B:81:0x0075, B:83:0x008b, B:85:0x0091), top: B:112:0x0039, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bb A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #1 {all -> 0x00c9, blocks: (B:97:0x00bb, B:99:0x00c4, B:103:0x00cc, B:104:0x00cd, B:105:0x00d0, B:69:0x0039, B:89:0x00a7, B:95:0x00b6, B:78:0x0061, B:80:0x0071, B:81:0x0075, B:83:0x008b, B:85:0x0091), top: B:111:0x0021, inners: #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x00a4 -> B:89:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x00b3 -> B:94:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readRemainingSuspend(long j, Continuation<? super ByteReadPacket> continuation) throws Throwable {
        C104001 c104001;
        BytePacketBuilder bytePacketBuilder;
        BytePacketBuilder bytePacketBuilder2;
        ChunkBuffer chunkBufferPrepareWriteHead;
        Ref.LongRef longRef;
        ByteBufferChannel byteBufferChannel;
        boolean z;
        Output output;
        long limit;
        long j2;
        long asMuchAsPossible$default;
        Output output2;
        if (continuation instanceof C104001) {
            c104001 = (C104001) continuation;
            int i = c104001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104001.label = i - Integer.MIN_VALUE;
            } else {
                c104001 = new C104001(continuation);
            }
        }
        Object obj = c104001.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104001.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                bytePacketBuilder2 = new BytePacketBuilder(null, 1, null);
                try {
                    Ref.LongRef longRef2 = new Ref.LongRef();
                    longRef2.element = j;
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(bytePacketBuilder2, 1, null);
                    BytePacketBuilder bytePacketBuilder3 = bytePacketBuilder2;
                    longRef = longRef2;
                    byteBufferChannel = this;
                    bytePacketBuilder = bytePacketBuilder3;
                    output = bytePacketBuilder3;
                    limit = chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition();
                    j2 = longRef.element;
                    if (limit > j2) {
                    }
                    asMuchAsPossible$default = longRef.element - readAsMuchAsPossible$default(byteBufferChannel, chunkBufferPrepareWriteHead, 0, 0, 6, null);
                    longRef.element = asMuchAsPossible$default;
                    Output output3 = output;
                    if (asMuchAsPossible$default > 0) {
                    }
                    z = false;
                    output2 = output3;
                    if (z) {
                    }
                } catch (Throwable th) {
                    th = th;
                    bytePacketBuilder2.release();
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chunkBufferPrepareWriteHead = (ChunkBuffer) c104001.L$4;
                Output output4 = (Output) c104001.L$3;
                longRef = (Ref.LongRef) c104001.L$2;
                bytePacketBuilder = (BytePacketBuilder) c104001.L$1;
                ByteBufferChannel byteBufferChannel2 = (ByteBufferChannel) c104001.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    output4 = output4;
                    if (!((Boolean) obj).booleanValue()) {
                        byteBufferChannel = byteBufferChannel2;
                        z = true;
                        output2 = output4;
                        if (z) {
                            chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output2, 1, chunkBufferPrepareWriteHead);
                            output = output2;
                            limit = chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition();
                            j2 = longRef.element;
                            if (limit > j2) {
                                chunkBufferPrepareWriteHead.resetForWrite((int) j2);
                            }
                            asMuchAsPossible$default = longRef.element - readAsMuchAsPossible$default(byteBufferChannel, chunkBufferPrepareWriteHead, 0, 0, 6, null);
                            longRef.element = asMuchAsPossible$default;
                            Output output32 = output;
                            if (asMuchAsPossible$default > 0) {
                                output32 = output;
                                if (!byteBufferChannel.isClosedForRead()) {
                                    c104001.L$0 = byteBufferChannel;
                                    c104001.L$1 = bytePacketBuilder;
                                    c104001.L$2 = longRef;
                                    c104001.L$3 = output;
                                    c104001.L$4 = chunkBufferPrepareWriteHead;
                                    c104001.label = 1;
                                    Object suspend = byteBufferChannel.readSuspend(1, c104001);
                                    if (suspend == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    byteBufferChannel2 = byteBufferChannel;
                                    obj = suspend;
                                    output4 = output;
                                    if (!((Boolean) obj).booleanValue()) {
                                        byteBufferChannel = byteBufferChannel2;
                                        output32 = output4;
                                    }
                                }
                            }
                            z = false;
                            output2 = output32;
                            if (z) {
                                output2.afterHeadWrite();
                                Throwable closedCause = byteBufferChannel.getClosedCause();
                                if (closedCause != null) {
                                    throw closedCause;
                                }
                                return bytePacketBuilder.build();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    output4.afterHeadWrite();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bytePacketBuilder2 = bytePacketBuilder;
        }
    }

    public final void resumeReadOp() {
        Continuation continuation = (Continuation) _readOp$FU.getAndSet(this, null);
        if (continuation != null) {
            ClosedElement closed = getClosed();
            Throwable cause = closed != null ? closed.getCause() : null;
            if (cause != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(cause)));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                continuation.resumeWith(Result.m15699constructorimpl(Boolean.TRUE));
            }
        }
    }

    public final void resumeReadOp(Function0<? extends Throwable> exception) {
        Continuation continuation = (Continuation) _readOp$FU.getAndSet(this, null);
        if (continuation != null) {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(exception.invoke())));
        }
    }

    public final void resumeWriteOp() {
        Continuation<Unit> writeOp;
        ClosedElement closed;
        Object objCreateFailure;
        do {
            writeOp = getWriteOp();
            if (writeOp == null) {
                return;
            }
            closed = getClosed();
            if (closed == null && this.joining != null) {
                ReadWriteBufferState state = getState();
                if (!(state instanceof ReadWriteBufferState.Writing) && !(state instanceof ReadWriteBufferState.ReadingWriting) && state != ReadWriteBufferState.Terminated.INSTANCE) {
                    return;
                }
            }
        } while (!C2081xc40028dd.m347m(_writeOp$FU, this, writeOp, null));
        if (closed == null) {
            Result.Companion companion = Result.INSTANCE;
            objCreateFailure = Unit.INSTANCE;
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objCreateFailure = ResultKt.createFailure(closed.getSendException());
        }
        writeOp.resumeWith(Result.m15699constructorimpl(objCreateFailure));
    }

    public final void resumeClosed(Throwable cause) {
        Continuation continuation = (Continuation) _readOp$FU.getAndSet(this, null);
        if (continuation != null) {
            if (cause != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(cause)));
            } else {
                Boolean boolValueOf = Boolean.valueOf(getState().capacity._availableForRead$internal > 0);
                Result.Companion companion2 = Result.INSTANCE;
                continuation.resumeWith(Result.m15699constructorimpl(boolValueOf));
            }
        }
        Continuation continuation2 = (Continuation) _writeOp$FU.getAndSet(this, null);
        if (continuation2 != null) {
            Result.Companion companion3 = Result.INSTANCE;
            if (cause == null) {
                cause = new ClosedWriteChannelException(ByteBufferChannelKt.DEFAULT_CLOSE_MESSAGE);
            }
            continuation2.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(cause)));
        }
    }

    public static /* synthetic */ Object awaitContent$suspendImpl(ByteBufferChannel byteBufferChannel, Continuation<? super Unit> continuation) throws Throwable {
        Object suspend = byteBufferChannel.readSuspend(1, continuation);
        return suspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? suspend : Unit.INSTANCE;
    }

    public final Object readSuspend(int i, Continuation<? super Boolean> continuation) throws Throwable {
        if (getState().capacity._availableForRead$internal >= i) {
            return Boxing.boxBoolean(true);
        }
        ClosedElement closed = getClosed();
        if (closed == null) {
            if (i == 1) {
                return readSuspendImpl(1, continuation);
            }
            return readSuspendLoop(i, continuation);
        }
        Throwable cause = closed.getCause();
        if (cause != null) {
            ByteBufferChannelKt.rethrowClosed(cause);
            throw new KotlinNothingValueException();
        }
        RingBufferCapacity ringBufferCapacity = getState().capacity;
        boolean z = ringBufferCapacity.flush() && ringBufferCapacity._availableForRead$internal >= i;
        if (getReadOp() != null) {
            throw new IllegalStateException("Read operation is already in progress");
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0092 -> B:82:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readSuspendLoop(int i, Continuation<? super Boolean> continuation) throws Throwable {
        C104041 c104041;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C104041) {
            c104041 = (C104041) continuation;
            int i2 = c104041.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104041.label = i2 - Integer.MIN_VALUE;
            } else {
                c104041 = new C104041(continuation);
            }
        }
        Object suspendImpl = c104041.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104041.label;
        boolean z = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(suspendImpl);
            byteBufferChannel = this;
            if (byteBufferChannel.getState().capacity._availableForRead$internal >= i) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c104041.I$0;
            byteBufferChannel = (ByteBufferChannel) c104041.L$0;
            ResultKt.throwOnFailure(suspendImpl);
            if (!((Boolean) suspendImpl).booleanValue()) {
                return Boxing.boxBoolean(false);
            }
            if (byteBufferChannel.getState().capacity._availableForRead$internal >= i) {
                ClosedElement closed = byteBufferChannel.getClosed();
                if (closed != null) {
                    if (closed.getCause() != null) {
                        ByteBufferChannelKt.rethrowClosed(closed.getCause());
                        throw new KotlinNothingValueException();
                    }
                    RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
                    if (ringBufferCapacity.flush() && ringBufferCapacity._availableForRead$internal >= i) {
                        z = true;
                    }
                    if (byteBufferChannel.getReadOp() != null) {
                        throw new IllegalStateException("Read operation is already in progress");
                    }
                    return Boxing.boxBoolean(z);
                }
                c104041.L$0 = byteBufferChannel;
                c104041.I$0 = i;
                c104041.label = 1;
                suspendImpl = byteBufferChannel.readSuspendImpl(i, c104041);
                if (suspendImpl == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) suspendImpl).booleanValue()) {
                }
                if (byteBufferChannel.getState().capacity._availableForRead$internal >= i) {
                    return Boxing.boxBoolean(true);
                }
            }
        }
    }

    public final boolean readSuspendPredicate(int size) {
        ReadWriteBufferState state = getState();
        return state.capacity._availableForRead$internal < size && (this.joining == null || getWriteOp() == null || !(state == ReadWriteBufferState.IdleEmpty.INSTANCE || (state instanceof ReadWriteBufferState.IdleNonEmpty)));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readSuspendImpl(int i, Continuation<? super Boolean> continuation) throws Throwable {
        C104031 c104031;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof C104031) {
            c104031 = (C104031) continuation;
            int i2 = c104031.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104031.label = i2 - Integer.MIN_VALUE;
            } else {
                c104031 = new C104031(continuation);
            }
        }
        Object objCompleteSuspendBlock = c104031.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104031.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBufferChannel = (ByteBufferChannel) c104031.L$0;
            try {
                ResultKt.throwOnFailure(objCompleteSuspendBlock);
            } catch (Throwable th) {
                th = th;
                byteBufferChannel.setReadOp(null);
                throw th;
            }
        }
        ResultKt.throwOnFailure(objCompleteSuspendBlock);
        ReadWriteBufferState state = getState();
        if (state.capacity._availableForRead$internal >= i || (this.joining != null && getWriteOp() != null && (state == ReadWriteBufferState.IdleEmpty.INSTANCE || (state instanceof ReadWriteBufferState.IdleNonEmpty)))) {
            return Boxing.boxBoolean(true);
        }
        try {
            c104031.L$0 = this;
            c104031.I$0 = i;
            c104031.label = 1;
            CancellableReusableContinuation<Boolean> cancellableReusableContinuation = this.readSuspendContinuationCache;
            suspensionForSize(i, cancellableReusableContinuation);
            objCompleteSuspendBlock = cancellableReusableContinuation.completeSuspendBlock(IntrinsicsKt__IntrinsicsJvmKt.intercepted(c104031));
            if (objCompleteSuspendBlock == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(c104031);
            }
            return objCompleteSuspendBlock == coroutine_suspended ? coroutine_suspended : objCompleteSuspendBlock;
        } catch (Throwable th2) {
            th = th2;
            byteBufferChannel = this;
            byteBufferChannel.setReadOp(null);
            throw th;
        }
    }

    public final boolean shouldResumeReadOp() {
        return this.joining != null && (getState() == ReadWriteBufferState.IdleEmpty.INSTANCE || (getState() instanceof ReadWriteBufferState.IdleNonEmpty));
    }

    public final boolean writeSuspendPredicate(int size) {
        JoiningState joiningState = this.joining;
        ReadWriteBufferState state = getState();
        if (getClosed() != null) {
            return false;
        }
        if (joiningState != null) {
            if (state == ReadWriteBufferState.Terminated.INSTANCE || (state instanceof ReadWriteBufferState.Writing) || (state instanceof ReadWriteBufferState.ReadingWriting)) {
                return false;
            }
        } else if (state.capacity._availableForWrite$internal >= size || state == ReadWriteBufferState.IdleEmpty.INSTANCE) {
            return false;
        }
        return true;
    }

    @Nullable
    public final Object tryWriteSuspend$ktor_io(int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Throwable sendException;
        if (!writeSuspendPredicate(i)) {
            ClosedElement closed = getClosed();
            if (closed != null && (sendException = closed.getSendException()) != null) {
                ByteBufferChannelKt.rethrowClosed(sendException);
                throw new KotlinNothingValueException();
            }
            return Unit.INSTANCE;
        }
        this.writeSuspensionSize = i;
        if (this.attachedJob != null) {
            Object objInvoke = this.writeSuspension.invoke(continuation);
            if (objInvoke == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objInvoke == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        }
        CancellableReusableContinuation<Unit> cancellableReusableContinuation = this.writeSuspendContinuationCache;
        this.writeSuspension.invoke(cancellableReusableContinuation);
        Object objCompleteSuspendBlock = cancellableReusableContinuation.completeSuspendBlock(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (objCompleteSuspendBlock == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objCompleteSuspendBlock == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCompleteSuspendBlock : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeSuspend(int i, Continuation<? super Unit> continuation) throws Throwable {
        C104223 c104223;
        ByteBufferChannel byteBufferChannel;
        Throwable sendException;
        if (continuation instanceof C104223) {
            c104223 = (C104223) continuation;
            int i2 = c104223.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104223.label = i2 - Integer.MIN_VALUE;
            } else {
                c104223 = new C104223(continuation);
            }
        }
        Object obj = c104223.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104223.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            byteBufferChannel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c104223.I$0;
            byteBufferChannel = (ByteBufferChannel) c104223.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (byteBufferChannel.writeSuspendPredicate(i)) {
            c104223.L$0 = byteBufferChannel;
            c104223.I$0 = i;
            c104223.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(c104223), 1);
            cancellableContinuationImpl.initCancellability();
            byteBufferChannel.writeSuspendBlock(i, cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(c104223);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ClosedElement closed = byteBufferChannel.getClosed();
        if (closed != null && (sendException = closed.getSendException()) != null) {
            ByteBufferChannelKt.rethrowClosed(sendException);
            throw new KotlinNothingValueException();
        }
        return Unit.INSTANCE;
    }

    public final void writeSuspendBlock(int size, CancellableContinuation<? super Unit> c) throws Throwable {
        Throwable sendException;
        while (true) {
            ClosedElement closed = getClosed();
            if (closed != null && (sendException = closed.getSendException()) != null) {
                ByteBufferChannelKt.rethrowClosed(sendException);
                throw new KotlinNothingValueException();
            }
            if (!writeSuspendPredicate(size)) {
                Result.Companion companion = Result.INSTANCE;
                c.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
                break;
            }
            while (getWriteOp() == null) {
                if (!writeSuspendPredicate(size)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _writeOp$FU;
                if (C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, null, c)) {
                    if (writeSuspendPredicate(size) || !C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, c, null)) {
                        break;
                    }
                }
            }
            throw new IllegalStateException("Operation is already in progress".toString());
        }
        flushImpl(size);
        if (shouldResumeReadOp()) {
            resumeReadOp();
        }
    }

    public final ReadWriteBufferState.Initial newBuffer() {
        ReadWriteBufferState.Initial initialBorrow = this.pool.borrow();
        initialBorrow.capacity.resetForWrite();
        return initialBorrow;
    }

    public final void releaseBuffer(ReadWriteBufferState.Initial buffer) {
        this.pool.recycle(buffer);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0017  */
    /* renamed from: peekTo-lBXzO7A$suspendImpl */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m15410peekTolBXzO7A$suspendImpl(ByteBufferChannel byteBufferChannel, final ByteBuffer byteBuffer, final long j, final long j2, long j3, final long j4, Continuation<? super Long> continuation) throws Throwable {
        ByteBufferChannel$peekTo$1 byteBufferChannel$peekTo$1;
        Ref.IntRef intRef;
        if (continuation instanceof ByteBufferChannel$peekTo$1) {
            byteBufferChannel$peekTo$1 = (ByteBufferChannel$peekTo$1) continuation;
            int i = byteBufferChannel$peekTo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteBufferChannel$peekTo$1.label = i - Integer.MIN_VALUE;
            } else {
                byteBufferChannel$peekTo$1 = new ByteBufferChannel$peekTo$1(byteBufferChannel, continuation);
            }
        }
        Object obj = byteBufferChannel$peekTo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = byteBufferChannel$peekTo$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.IntRef intRef2 = new Ref.IntRef();
            int iCoerceAtMost = (int) RangesKt___RangesKt.coerceAtMost(j3 + j2, ByteChannelSequentialKt.EXPECTED_CAPACITY);
            try {
                Function1<? super ByteBuffer, Unit> function1 = new Function1<ByteBuffer, Unit>() { // from class: io.ktor.utils.io.ByteBufferChannel$peekTo$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer2) {
                        invoke2(byteBuffer2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ByteBuffer nioBuffer) {
                        Intrinsics.checkNotNullParameter(nioBuffer, "nioBuffer");
                        if (nioBuffer.remaining() > j2) {
                            ByteBuffer byteBufferDuplicate = nioBuffer.duplicate();
                            Intrinsics.checkNotNull(byteBufferDuplicate);
                            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) j2));
                            int iLimit = byteBufferDuplicate.limit();
                            byteBufferDuplicate.limit((int) Math.min(byteBufferDuplicate.limit(), Math.min(j4, byteBuffer.limit() - j) + j2));
                            intRef2.element = byteBufferDuplicate.remaining();
                            MemoryJvmKt.m15444copyToSG11BkQ(byteBufferDuplicate, byteBuffer, (int) j);
                            byteBufferDuplicate.limit(iLimit);
                        }
                    }
                };
                byteBufferChannel$peekTo$1.L$0 = intRef2;
                byteBufferChannel$peekTo$1.label = 1;
                if (byteBufferChannel.read(iCoerceAtMost, function1, byteBufferChannel$peekTo$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (EOFException unused) {
            }
            intRef = intRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) byteBufferChannel$peekTo$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (EOFException unused2) {
            }
        }
        return Boxing.boxLong(intRef.element);
    }

    @NotNull
    public String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + getState() + ')';
    }

    public final void restoreStateAfterWrite$ktor_io() {
        Object obj;
        ReadWriteBufferState readWriteBufferStateStopWriting$ktor_io;
        ReadWriteBufferState.IdleNonEmpty idleNonEmpty;
        ReadWriteBufferState readWriteBufferState = null;
        do {
            obj = this._state;
            readWriteBufferStateStopWriting$ktor_io = ((ReadWriteBufferState) obj).stopWriting$ktor_io();
            if ((readWriteBufferStateStopWriting$ktor_io instanceof ReadWriteBufferState.IdleNonEmpty) && readWriteBufferStateStopWriting$ktor_io.capacity.isEmpty()) {
                readWriteBufferStateStopWriting$ktor_io = ReadWriteBufferState.IdleEmpty.INSTANCE;
                readWriteBufferState = readWriteBufferStateStopWriting$ktor_io;
            }
        } while (!C2081xc40028dd.m347m(_state$FU, this, obj, readWriteBufferStateStopWriting$ktor_io));
        if (readWriteBufferStateStopWriting$ktor_io != ReadWriteBufferState.IdleEmpty.INSTANCE || (idleNonEmpty = (ReadWriteBufferState.IdleNonEmpty) readWriteBufferState) == null) {
            return;
        }
        releaseBuffer(idleNonEmpty.getInitial());
    }

    public final ByteBuffer setupStateForRead() throws Throwable {
        Object obj;
        Throwable cause;
        ReadWriteBufferState readWriteBufferStateStartReading$ktor_io;
        Throwable cause2;
        do {
            obj = this._state;
            ReadWriteBufferState readWriteBufferState = (ReadWriteBufferState) obj;
            if (Intrinsics.areEqual(readWriteBufferState, ReadWriteBufferState.Terminated.INSTANCE) ? true : Intrinsics.areEqual(readWriteBufferState, ReadWriteBufferState.IdleEmpty.INSTANCE)) {
                ClosedElement closed = getClosed();
                if (closed == null || (cause = closed.getCause()) == null) {
                    return null;
                }
                ByteBufferChannelKt.rethrowClosed(cause);
                throw new KotlinNothingValueException();
            }
            ClosedElement closed2 = getClosed();
            if (closed2 != null && (cause2 = closed2.getCause()) != null) {
                ByteBufferChannelKt.rethrowClosed(cause2);
                throw new KotlinNothingValueException();
            }
            if (readWriteBufferState.capacity._availableForRead$internal == 0) {
                return null;
            }
            readWriteBufferStateStartReading$ktor_io = readWriteBufferState.startReading$ktor_io();
        } while (!C2081xc40028dd.m347m(_state$FU, this, obj, readWriteBufferStateStartReading$ktor_io));
        ByteBuffer readBuffer = readWriteBufferStateStartReading$ktor_io.getReadBuffer();
        prepareBuffer(readBuffer, this.readPosition, readWriteBufferStateStartReading$ktor_io.capacity._availableForRead$internal);
        return readBuffer;
    }

    public final void restoreStateAfterRead() {
        Object obj;
        ReadWriteBufferState readWriteBufferStateStopReading$ktor_io;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ReadWriteBufferState readWriteBufferState = null;
        do {
            obj = this._state;
            ReadWriteBufferState readWriteBufferState2 = (ReadWriteBufferState) obj;
            ReadWriteBufferState.IdleNonEmpty idleNonEmpty = (ReadWriteBufferState.IdleNonEmpty) readWriteBufferState;
            if (idleNonEmpty != null) {
                idleNonEmpty.capacity.resetForWrite();
                resumeWriteOp();
                readWriteBufferState = null;
            }
            readWriteBufferStateStopReading$ktor_io = readWriteBufferState2.stopReading$ktor_io();
            if ((readWriteBufferStateStopReading$ktor_io instanceof ReadWriteBufferState.IdleNonEmpty) && getState() == readWriteBufferState2 && readWriteBufferStateStopReading$ktor_io.capacity.tryLockForRelease()) {
                readWriteBufferStateStopReading$ktor_io = ReadWriteBufferState.IdleEmpty.INSTANCE;
                readWriteBufferState = readWriteBufferStateStopReading$ktor_io;
            }
            atomicReferenceFieldUpdater = _state$FU;
        } while (!C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, obj, readWriteBufferStateStopReading$ktor_io));
        ReadWriteBufferState.IdleEmpty idleEmpty = ReadWriteBufferState.IdleEmpty.INSTANCE;
        if (readWriteBufferStateStopReading$ktor_io == idleEmpty) {
            ReadWriteBufferState.IdleNonEmpty idleNonEmpty2 = (ReadWriteBufferState.IdleNonEmpty) readWriteBufferState;
            if (idleNonEmpty2 != null) {
                releaseBuffer(idleNonEmpty2.getInitial());
            }
            resumeWriteOp();
            return;
        }
        if ((readWriteBufferStateStopReading$ktor_io instanceof ReadWriteBufferState.IdleNonEmpty) && readWriteBufferStateStopReading$ktor_io.capacity.isEmpty() && readWriteBufferStateStopReading$ktor_io.capacity.tryLockForRelease() && C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, readWriteBufferStateStopReading$ktor_io, idleEmpty)) {
            readWriteBufferStateStopReading$ktor_io.capacity.resetForWrite();
            releaseBuffer(((ReadWriteBufferState.IdleNonEmpty) readWriteBufferStateStopReading$ktor_io).getInitial());
            resumeWriteOp();
        }
    }

    public final boolean tryReleaseBuffer(boolean forceTermination) {
        Object obj;
        ReadWriteBufferState.Terminated terminated;
        ReadWriteBufferState.Initial initial = null;
        do {
            obj = this._state;
            ReadWriteBufferState readWriteBufferState = (ReadWriteBufferState) obj;
            ClosedElement closed = getClosed();
            if (initial != null) {
                if ((closed != null ? closed.getCause() : null) == null) {
                    initial.capacity.resetForWrite();
                }
                resumeWriteOp();
                initial = null;
            }
            terminated = ReadWriteBufferState.Terminated.INSTANCE;
            if (readWriteBufferState == terminated) {
                return true;
            }
            if (readWriteBufferState != ReadWriteBufferState.IdleEmpty.INSTANCE) {
                if (closed != null && (readWriteBufferState instanceof ReadWriteBufferState.IdleNonEmpty) && (readWriteBufferState.capacity.tryLockForRelease() || closed.getCause() != null)) {
                    if (closed.getCause() != null) {
                        readWriteBufferState.capacity.forceLockForRelease();
                    }
                    initial = ((ReadWriteBufferState.IdleNonEmpty) readWriteBufferState).getInitial();
                } else {
                    if (!forceTermination || !(readWriteBufferState instanceof ReadWriteBufferState.IdleNonEmpty) || !readWriteBufferState.capacity.tryLockForRelease()) {
                        return false;
                    }
                    initial = ((ReadWriteBufferState.IdleNonEmpty) readWriteBufferState).getInitial();
                }
            }
        } while (!C2081xc40028dd.m347m(_state$FU, this, obj, terminated));
        if (initial != null && getState() == terminated) {
            releaseBuffer(initial);
        }
        return true;
    }

    public final int readAsMuchAsPossible(ByteBuffer dst) throws Throwable {
        ByteBuffer byteBuffer = setupStateForRead();
        int i = 0;
        if (byteBuffer != null) {
            RingBufferCapacity ringBufferCapacity = getState().capacity;
            try {
                if (ringBufferCapacity._availableForRead$internal != 0) {
                    int iCapacity = byteBuffer.capacity() - this.reservedSize;
                    while (true) {
                        int iRemaining = dst.remaining();
                        if (iRemaining == 0) {
                            break;
                        }
                        int i2 = this.readPosition;
                        int iTryReadAtMost = ringBufferCapacity.tryReadAtMost(Math.min(iCapacity - i2, iRemaining));
                        if (iTryReadAtMost == 0) {
                            break;
                        }
                        byteBuffer.limit(i2 + iTryReadAtMost);
                        byteBuffer.position(i2);
                        dst.put(byteBuffer);
                        bytesRead(byteBuffer, ringBufferCapacity, iTryReadAtMost);
                        i += iTryReadAtMost;
                    }
                }
            } finally {
                restoreStateAfterRead();
                tryTerminate$ktor_io();
            }
        }
        return i;
    }

    public final int readAsMuchAsPossible(Buffer dst, int consumed, int max) throws Throwable {
        int iTryReadAtMost;
        do {
            ByteBuffer byteBuffer = setupStateForRead();
            boolean z = false;
            if (byteBuffer == null) {
                iTryReadAtMost = 0;
            } else {
                RingBufferCapacity ringBufferCapacity = getState().capacity;
                try {
                    if (ringBufferCapacity._availableForRead$internal == 0) {
                        restoreStateAfterRead();
                        tryTerminate$ktor_io();
                        iTryReadAtMost = 0;
                    } else {
                        int limit = dst.getLimit() - dst.getWritePosition();
                        iTryReadAtMost = ringBufferCapacity.tryReadAtMost(Math.min(byteBuffer.remaining(), Math.min(limit, max)));
                        if (iTryReadAtMost > 0) {
                            if (limit < byteBuffer.remaining()) {
                                byteBuffer.limit(byteBuffer.position() + limit);
                            }
                            BufferPrimitivesJvmKt.writeFully(dst, byteBuffer);
                            bytesRead(byteBuffer, ringBufferCapacity, iTryReadAtMost);
                            z = true;
                        }
                    }
                } finally {
                    restoreStateAfterRead();
                    tryTerminate$ktor_io();
                }
            }
            consumed += iTryReadAtMost;
            max -= iTryReadAtMost;
            if (!z || dst.getLimit() <= dst.getWritePosition()) {
                break;
            }
        } while (getState().capacity._availableForRead$internal > 0);
        return consumed;
    }

    public static /* synthetic */ int readAsMuchAsPossible$default(ByteBufferChannel byteBufferChannel, Buffer buffer, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsMuchAsPossible");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = buffer.getLimit() - buffer.getWritePosition();
        }
        return byteBufferChannel.readAsMuchAsPossible(buffer, i, i2);
    }

    public final int readAsMuchAsPossible(byte[] dst, int i, int i2) throws Throwable {
        ByteBuffer byteBuffer = setupStateForRead();
        int i3 = 0;
        if (byteBuffer != null) {
            RingBufferCapacity ringBufferCapacity = getState().capacity;
            try {
                if (ringBufferCapacity._availableForRead$internal != 0) {
                    int iCapacity = byteBuffer.capacity() - this.reservedSize;
                    while (true) {
                        int i4 = i2 - i3;
                        if (i4 == 0) {
                            break;
                        }
                        int i5 = this.readPosition;
                        int iTryReadAtMost = ringBufferCapacity.tryReadAtMost(Math.min(iCapacity - i5, i4));
                        if (iTryReadAtMost == 0) {
                            break;
                        }
                        byteBuffer.limit(i5 + iTryReadAtMost);
                        byteBuffer.position(i5);
                        byteBuffer.get(dst, i + i3, iTryReadAtMost);
                        bytesRead(byteBuffer, ringBufferCapacity, iTryReadAtMost);
                        i3 += iTryReadAtMost;
                    }
                }
            } finally {
                restoreStateAfterRead();
                tryTerminate$ktor_io();
            }
        }
        return i3;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    public int readAvailable(int min, @NotNull Function1<? super ByteBuffer, Unit> block) throws Throwable {
        int i;
        Intrinsics.checkNotNullParameter(block, "block");
        if (min <= 0) {
            throw new IllegalArgumentException("min should be positive".toString());
        }
        if (min > 4088) {
            throw new IllegalArgumentException(("Min(" + min + ") shouldn't be greater than 4088").toString());
        }
        ByteBuffer byteBuffer = setupStateForRead();
        boolean z = false;
        if (byteBuffer == null) {
            i = 0;
        } else {
            RingBufferCapacity ringBufferCapacity = getState().capacity;
            try {
                if (ringBufferCapacity._availableForRead$internal != 0) {
                    int iTryReadAtLeast = ringBufferCapacity.tryReadAtLeast(min);
                    if (iTryReadAtLeast <= 0 || iTryReadAtLeast < min) {
                        i = 0;
                    } else {
                        int iPosition = byteBuffer.position();
                        int iLimit = byteBuffer.limit();
                        block.invoke(byteBuffer);
                        if (iLimit != byteBuffer.limit()) {
                            throw new IllegalStateException("Buffer limit shouldn't be modified.".toString());
                        }
                        int iPosition2 = byteBuffer.position() - iPosition;
                        if (iPosition2 < 0) {
                            throw new IllegalStateException("Position shouldn't been moved backwards.".toString());
                        }
                        bytesRead(byteBuffer, ringBufferCapacity, iPosition2);
                        if (iPosition2 < iTryReadAtLeast) {
                            ringBufferCapacity.completeWrite(iTryReadAtLeast - iPosition2);
                            ringBufferCapacity.flush();
                        }
                        z = true;
                        i = iPosition2;
                    }
                } else {
                    restoreStateAfterRead();
                    tryTerminate$ktor_io();
                    i = 0;
                }
            } finally {
                restoreStateAfterRead();
                tryTerminate$ktor_io();
            }
        }
        if (z) {
            return i;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0066, code lost:
    
        r11.limit(r6);
        r0.bytesWritten(r1, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0070, code lost:
    
        if (r3.isFull() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0076, code lost:
    
        if (r0.getAutoFlush() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0078, code lost:
    
        r0.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x007b, code lost:
    
        if (r0 == r10) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007d, code lost:
    
        setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (r0.getTotalBytesWritten() - r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x008a, code lost:
    
        r0.restoreStateAfterWrite$ktor_io();
        r0.tryTerminate$ktor_io();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0090, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int writeAsMuchAsPossible(ByteBuffer src) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        int iTryWriteAtMost;
        JoiningState joiningState = this.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        int i = 0;
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new KotlinNothingValueException();
            }
            int iLimit = src.limit();
            while (true) {
                int iPosition = iLimit - src.position();
                if (iPosition == 0 || (iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost(Math.min(iPosition, byteBuffer.remaining()))) == 0) {
                    break;
                }
                if (iTryWriteAtMost <= 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                src.limit(src.position() + iTryWriteAtMost);
                byteBuffer.put(src);
                i += iTryWriteAtMost;
                byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer, byteBufferChannelResolveDelegation.carryIndex(byteBuffer, byteBufferChannelResolveDelegation.writePosition + i), ringBufferCapacity._availableForWrite$internal);
            }
        } catch (Throwable th) {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            throw th;
        }
    }

    public final int writeAsMuchAsPossible(Buffer src) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = this.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        int i = 0;
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new KotlinNothingValueException();
            }
            while (true) {
                int iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost(Math.min(src.getWritePosition() - src.getReadPosition(), byteBuffer.remaining()));
                if (iTryWriteAtMost == 0) {
                    break;
                }
                BufferUtilsJvmKt.readFully(src, byteBuffer, iTryWriteAtMost);
                i += iTryWriteAtMost;
                byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer, byteBufferChannelResolveDelegation.carryIndex(byteBuffer, byteBufferChannelResolveDelegation.writePosition + i), ringBufferCapacity._availableForWrite$internal);
            }
            byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, i);
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            return i;
        } catch (Throwable th) {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            throw th;
        }
    }

    public final int writeAsMuchAsPossible(byte[] src, int i, int i2) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = this.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        int i3 = 0;
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new KotlinNothingValueException();
            }
            while (true) {
                int iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost(Math.min(i2 - i3, byteBuffer.remaining()));
                if (iTryWriteAtMost == 0) {
                    byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, i3);
                    if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                        byteBufferChannelResolveDelegation.flush();
                    }
                    if (byteBufferChannelResolveDelegation != this) {
                        setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
                    }
                    byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
                    byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
                    return i3;
                }
                if (iTryWriteAtMost <= 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                byteBuffer.put(src, i + i3, iTryWriteAtMost);
                i3 += iTryWriteAtMost;
                byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer, byteBufferChannelResolveDelegation.carryIndex(byteBuffer, byteBufferChannelResolveDelegation.writePosition + i3), ringBufferCapacity._availableForWrite$internal);
            }
        } catch (Throwable th) {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0074 A[DONT_GENERATE] */
    @Override // io.ktor.utils.p050io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int writeAvailable(int min, @NotNull Function1<? super ByteBuffer, Unit> block) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        int i;
        Intrinsics.checkNotNullParameter(block, "block");
        if (min <= 0) {
            throw new IllegalArgumentException("min should be positive".toString());
        }
        if (min > 4088) {
            throw new IllegalArgumentException(("Min(" + min + ") shouldn't be greater than 4088").toString());
        }
        JoiningState joiningState = this.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        boolean z = false;
        if (byteBuffer == null) {
            i = 0;
        } else {
            RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
            long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
            try {
                ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
                if (closed != null) {
                    ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                    throw new KotlinNothingValueException();
                }
                int iTryWriteAtLeast = ringBufferCapacity.tryWriteAtLeast(min);
                if (iTryWriteAtLeast <= 0) {
                    i = 0;
                } else {
                    byteBufferChannelResolveDelegation.prepareBuffer(byteBuffer, byteBufferChannelResolveDelegation.writePosition, iTryWriteAtLeast);
                    int iPosition = byteBuffer.position();
                    int iLimit = byteBuffer.limit();
                    block.invoke(byteBuffer);
                    if (iLimit != byteBuffer.limit()) {
                        throw new IllegalStateException("Buffer limit modified".toString());
                    }
                    int iPosition2 = byteBuffer.position() - iPosition;
                    if (iPosition2 < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported".toString());
                    }
                    if (iPosition2 < 0) {
                        throw new IllegalStateException();
                    }
                    byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, iPosition2);
                    if (iPosition2 < iTryWriteAtLeast) {
                        ringBufferCapacity.completeRead(iTryWriteAtLeast - iPosition2);
                    }
                    z = true;
                    i = iPosition2;
                }
            } finally {
                if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                    byteBufferChannelResolveDelegation.flush();
                }
                if (byteBufferChannelResolveDelegation != this) {
                    setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
                }
                byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
                byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
            }
        }
        if (z) {
            return i;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0033 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean writeWhileNoSuspend(Function1<? super ByteBuffer, Boolean> block) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = this.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        if (byteBuffer == null) {
            return true;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new KotlinNothingValueException();
            }
            return byteBufferChannelResolveDelegation.writeWhileLoop(byteBuffer, ringBufferCapacity, block);
        } finally {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
        }
    }

    public static /* synthetic */ Object read$suspendImpl(ByteBufferChannel byteBufferChannel, int i, Function1<? super ByteBuffer, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        int i2;
        if (i < 0) {
            throw new IllegalArgumentException("min should be positive or zero".toString());
        }
        ByteBuffer byteBuffer = byteBufferChannel.setupStateForRead();
        boolean z = false;
        if (byteBuffer != null) {
            RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
            try {
                if (ringBufferCapacity._availableForRead$internal != 0 && (i2 = ringBufferCapacity._availableForRead$internal) > 0 && i2 >= i) {
                    int iPosition = byteBuffer.position();
                    int iLimit = byteBuffer.limit();
                    function1.invoke(byteBuffer);
                    if (iLimit != byteBuffer.limit()) {
                        throw new IllegalStateException("Buffer limit modified.".toString());
                    }
                    int iPosition2 = byteBuffer.position() - iPosition;
                    if (iPosition2 < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported.".toString());
                    }
                    if (!ringBufferCapacity.tryReadExact(iPosition2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, iPosition2);
                    z = true;
                }
            } finally {
                byteBufferChannel.restoreStateAfterRead();
                byteBufferChannel.tryTerminate$ktor_io();
            }
        }
        if (!z) {
            if (byteBufferChannel.isClosedForRead() && i > 0) {
                throw new EOFException("Got EOF but at least " + i + " bytes were expected");
            }
            Object blockSuspend = byteBufferChannel.readBlockSuspend(i, function1, continuation);
            return blockSuspend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? blockSuspend : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object discard$suspendImpl(ByteBufferChannel byteBufferChannel, long j, Continuation<? super Long> continuation) throws Throwable {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("max shouldn't be negative: " + j).toString());
        }
        ByteBuffer byteBuffer = byteBufferChannel.setupStateForRead();
        if (byteBuffer != null) {
            RingBufferCapacity ringBufferCapacity = byteBufferChannel.getState().capacity;
            try {
                if (ringBufferCapacity._availableForRead$internal != 0) {
                    int iTryReadAtMost = ringBufferCapacity.tryReadAtMost((int) Math.min(ParserMinimalBase.MAX_INT_L, j));
                    byteBufferChannel.bytesRead(byteBuffer, ringBufferCapacity, iTryReadAtMost);
                    j2 = iTryReadAtMost;
                }
            } finally {
                byteBufferChannel.restoreStateAfterRead();
                byteBufferChannel.tryTerminate$ktor_io();
            }
        }
        long j3 = j2;
        if (j3 == j || byteBufferChannel.isClosedForRead()) {
            return Boxing.boxLong(j3);
        }
        return byteBufferChannel.discardSuspend(j3, j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0054 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int tryWritePacketPart(ByteReadPacket packet) throws Throwable {
        ByteBufferChannel byteBufferChannelResolveDelegation;
        JoiningState joiningState = this.joining;
        if (joiningState == null || (byteBufferChannelResolveDelegation = resolveDelegation(this, joiningState)) == null) {
            byteBufferChannelResolveDelegation = this;
        }
        ByteBuffer byteBuffer = byteBufferChannelResolveDelegation.setupStateForWrite$ktor_io();
        if (byteBuffer == null) {
            return 0;
        }
        RingBufferCapacity ringBufferCapacity = byteBufferChannelResolveDelegation.getState().capacity;
        long totalBytesWritten = byteBufferChannelResolveDelegation.getTotalBytesWritten();
        try {
            ClosedElement closed = byteBufferChannelResolveDelegation.getClosed();
            if (closed != null) {
                ByteBufferChannelKt.rethrowClosed(closed.getSendException());
                throw new KotlinNothingValueException();
            }
            int iTryWriteAtMost = ringBufferCapacity.tryWriteAtMost((int) Math.min(packet.getRemaining(), byteBuffer.remaining()));
            if (iTryWriteAtMost > 0) {
                byteBuffer.limit(byteBuffer.position() + iTryWriteAtMost);
                ByteBuffersKt.readFully(packet, byteBuffer);
                byteBufferChannelResolveDelegation.bytesWritten(byteBuffer, ringBufferCapacity, iTryWriteAtMost);
            }
            return iTryWriteAtMost;
        } finally {
            if (ringBufferCapacity.isFull() || byteBufferChannelResolveDelegation.getAutoFlush()) {
                byteBufferChannelResolveDelegation.flush();
            }
            if (byteBufferChannelResolveDelegation != this) {
                setTotalBytesWritten$ktor_io(getTotalBytesWritten() + (byteBufferChannelResolveDelegation.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelResolveDelegation.restoreStateAfterWrite$ktor_io();
            byteBufferChannelResolveDelegation.tryTerminate$ktor_io();
        }
    }

    public final boolean consumeEachBufferRangeFast(boolean last, Function2<? super ByteBuffer, ? super Boolean, Boolean> visitor) throws Throwable {
        ByteBuffer byteBuffer = setupStateForRead();
        if (byteBuffer == null) {
            last = false;
        } else {
            RingBufferCapacity ringBufferCapacity = getState().capacity;
            try {
                if (ringBufferCapacity._availableForRead$internal != 0) {
                    while (true) {
                        if (!byteBuffer.hasRemaining() && !last) {
                            break;
                        }
                        boolean zBooleanValue = visitor.invoke(byteBuffer, Boolean.valueOf(last)).booleanValue();
                        afterBufferVisited(byteBuffer, ringBufferCapacity);
                        if (!zBooleanValue || (last && !byteBuffer.hasRemaining())) {
                            break;
                        }
                    }
                    InlineMarker.finallyStart(2);
                    restoreStateAfterRead();
                    tryTerminate$ktor_io();
                    InlineMarker.finallyEnd(2);
                    return true;
                }
                last = false;
            } finally {
                InlineMarker.finallyStart(1);
                restoreStateAfterRead();
                tryTerminate$ktor_io();
                InlineMarker.finallyEnd(1);
            }
        }
        if (last || getClosed() == null) {
            return last;
        }
        visitor.invoke(ReadWriteBufferStateKt.getEmptyByteBuffer(), Boolean.TRUE);
        return true;
    }

    public final ByteReadPacket remainingPacket(long limit) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(bytePacketBuilder, 1, null);
            while (true) {
                try {
                    if (chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition() > limit) {
                        chunkBufferPrepareWriteHead.resetForWrite((int) limit);
                    }
                    limit -= readAsMuchAsPossible$default(this, chunkBufferPrepareWriteHead, 0, 0, 6, null);
                    if (limit <= 0 || isClosedForRead()) {
                        break;
                    }
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(bytePacketBuilder, 1, chunkBufferPrepareWriteHead);
                } catch (Throwable th) {
                    bytePacketBuilder.afterHeadWrite();
                    throw th;
                }
            }
            bytePacketBuilder.afterHeadWrite();
            return bytePacketBuilder.build();
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x00d5, code lost:
    
        r5 = kotlin.Result.INSTANCE;
        r6.resumeWith(kotlin.Result.m15699constructorimpl(java.lang.Boolean.TRUE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00e4, code lost:
    
        return kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspensionForSize(int size, Continuation<? super Boolean> continuation) {
        while (true) {
            ReadWriteBufferState state = getState();
            if (state.capacity._availableForRead$internal >= size || !(this.joining == null || getWriteOp() == null || (state != ReadWriteBufferState.IdleEmpty.INSTANCE && !(state instanceof ReadWriteBufferState.IdleNonEmpty)))) {
                break;
            }
            ClosedElement closed = getClosed();
            if (closed != null) {
                if (closed.getCause() != null) {
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(closed.getCause())));
                    return IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                }
                boolean zFlush = getState().capacity.flush();
                boolean z = false;
                boolean z2 = getState().capacity._availableForRead$internal >= size;
                Result.Companion companion2 = Result.INSTANCE;
                if (zFlush && z2) {
                    z = true;
                }
                continuation.resumeWith(Result.m15699constructorimpl(Boolean.valueOf(z)));
                return IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            while (getReadOp() == null) {
                if (getClosed() == null) {
                    ReadWriteBufferState state2 = getState();
                    if (state2.capacity._availableForRead$internal >= size || !(this.joining == null || getWriteOp() == null || (state2 != ReadWriteBufferState.IdleEmpty.INSTANCE && !(state2 instanceof ReadWriteBufferState.IdleNonEmpty)))) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _readOp$FU;
                    if (C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, null, continuation)) {
                        if (getClosed() == null) {
                            ReadWriteBufferState state3 = getState();
                            if (state3.capacity._availableForRead$internal < size && (this.joining == null || getWriteOp() == null || (state3 != ReadWriteBufferState.IdleEmpty.INSTANCE && !(state3 instanceof ReadWriteBufferState.IdleNonEmpty)))) {
                                break;
                            }
                        }
                        if (!C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, continuation, null)) {
                            break;
                        }
                    }
                }
            }
            throw new IllegalStateException("Operation is already in progress".toString());
        }
    }
}
