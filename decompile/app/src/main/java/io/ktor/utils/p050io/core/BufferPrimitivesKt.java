package io.ktor.utils.p050io.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.bits.MemoryJvmKt;
import io.ktor.utils.p050io.bits.PrimitiveArraysJvmKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferPrimitives.kt */
@Metadata(m7104d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0014\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\bø\u0001\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a3\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00122\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00182\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\u001b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a)\u0010\u0006\u001a\u00020\u0007*\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0086\b\u001a\n\u0010\u001f\u001a\u00020 *\u00020\u0002\u001a\r\u0010\u001f\u001a\u00020 *\u00020\u001eH\u0086\b\u001as\u0010!\u001a\u0002H\"\"\u0004\b\u0000\u0010\"*\u00020\u00022\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%26\u0010\u0003\u001a2\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b$\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b(\u0012\b\b$\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\"0&H\u0081\bø\u0001\u0000ø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0002\u0010*\u001a\n\u0010+\u001a\u00020,*\u00020\u0002\u001a\r\u0010+\u001a\u00020,*\u00020\u001eH\u0086\b\u001a\u001c\u0010-\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a3\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00122\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b.\u0010/\u001a3\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b0\u00101\u001a3\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00182\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u00103\u001a3\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u001b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u00105\u001a)\u0010-\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0086\b\u001a\n\u00106\u001a\u00020\u0007*\u00020\u0002\u001a\r\u00106\u001a\u00020\u0007*\u00020\u001eH\u0086\b\u001a\n\u00107\u001a\u000208*\u00020\u0002\u001a\r\u00107\u001a\u000208*\u00020\u001eH\u0086\b\u001a\n\u00109\u001a\u00020:*\u00020\u0002\u001a\r\u00109\u001a\u00020:*\u00020\u001eH\u0086\b\u001a\u0012\u0010;\u001a\u00020<*\u00020\u0002ø\u0001\u0002¢\u0006\u0002\u0010=\u001a\u0015\u0010;\u001a\u00020<*\u00020\u001eH\u0086\bø\u0001\u0002¢\u0006\u0002\u0010>\u001a\u0012\u0010?\u001a\u00020@*\u00020\u0002ø\u0001\u0002¢\u0006\u0002\u0010A\u001a\u0015\u0010?\u001a\u00020@*\u00020\u001eH\u0086\bø\u0001\u0002¢\u0006\u0002\u0010B\u001a\u0012\u0010C\u001a\u00020D*\u00020\u0002ø\u0001\u0002¢\u0006\u0002\u0010E\u001a\u0015\u0010C\u001a\u00020D*\u00020\u001eH\u0086\bø\u0001\u0002¢\u0006\u0002\u0010F\u001a\u0012\u0010G\u001a\u00020H*\u00020\u0002ø\u0001\u0002¢\u0006\u0002\u0010I\u001a\u0015\u0010G\u001a\u00020H*\u00020\u001eH\u0086\bø\u0001\u0002¢\u0006\u0002\u0010J\u001a\u0012\u0010K\u001a\u00020\u0001*\u00020\u00022\u0006\u0010L\u001a\u00020 \u001a\u0015\u0010K\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010L\u001a\u00020 H\u0086\b\u001ah\u0010M\u001a\u00020\u0001*\u00020\u00022\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%26\u0010\u0003\u001a2\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b$\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b(\u0012\b\b$\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010&H\u0081\bø\u0001\u0000ø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001\u001a\u0012\u0010N\u001a\u00020\u0001*\u00020\u00022\u0006\u0010L\u001a\u00020,\u001a\u0015\u0010N\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010L\u001a\u00020,H\u0086\b\u001a\u0012\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010P\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007\u001a&\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010Q\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010Q\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010Q\u001a\u00020\u000e2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010Q\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a&\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a3\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00122\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bR\u0010/\u001a3\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bS\u00101\u001a3\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00182\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bT\u00103\u001a3\u0010O\u001a\u00020\u0001*\u00020\u00022\u0006\u0010Q\u001a\u00020\u001b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bU\u00105\u001a)\u0010O\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010Q\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0086\b\u001a\u0012\u0010V\u001a\u00020\u0001*\u00020\u00022\u0006\u0010L\u001a\u00020\u0007\u001a\u0015\u0010V\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010L\u001a\u00020\u0007H\u0086\b\u001a\u0012\u0010W\u001a\u00020\u0001*\u00020\u00022\u0006\u0010L\u001a\u000208\u001a\u0015\u0010W\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010L\u001a\u000208H\u0086\b\u001a\u0012\u0010X\u001a\u00020\u0001*\u00020\u00022\u0006\u0010L\u001a\u00020:\u001a\u0015\u0010X\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010L\u001a\u00020:H\u0086\b\u001a\u001f\u0010Y\u001a\u00020\u0001*\u00020\u00022\u0006\u0010L\u001a\u00020<ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bZ\u0010[\u001a\u001f\u0010Y\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010L\u001a\u00020<ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bZ\u0010\\\u001a\u001f\u0010]\u001a\u00020\u0001*\u00020\u00022\u0006\u0010L\u001a\u00020@ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b^\u0010_\u001a\"\u0010]\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010L\u001a\u00020@H\u0086\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b^\u0010`\u001a\u001f\u0010a\u001a\u00020\u0001*\u00020\u00022\u0006\u0010L\u001a\u00020Dø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bb\u0010c\u001a\"\u0010a\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010L\u001a\u00020DH\u0086\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bb\u0010d\u001a\u001f\u0010e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010L\u001a\u00020Hø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bf\u0010g\u001a\"\u0010e\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010L\u001a\u00020HH\u0086\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bf\u0010h\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006i"}, m7105d2 = {"forEach", "", "Lio/ktor/utils/io/core/Buffer;", "block", "Lkotlin/Function1;", "", "readAvailable", "", "dst", CacheFileMetadataIndex.COLUMN_LENGTH, FirebaseAnalytics.Param.DESTINATION, "", TypedValues.CycleType.S_WAVE_OFFSET, "", "", "", "", "", "Lkotlin/UByteArray;", "readAvailable-o1GoV1E", "(Lio/ktor/utils/io/core/Buffer;[BII)I", "Lkotlin/UIntArray;", "readAvailable-o2ZM2JE", "(Lio/ktor/utils/io/core/Buffer;[III)I", "Lkotlin/ULongArray;", "readAvailable-pqYNikA", "(Lio/ktor/utils/io/core/Buffer;[JII)I", "Lkotlin/UShortArray;", "readAvailable-Wt3Bwxc", "(Lio/ktor/utils/io/core/Buffer;[SII)I", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "readDouble", "", "readExact", "R", "size", "name", "", "Lkotlin/Function2;", "Lio/ktor/utils/io/bits/Memory;", "Lkotlin/ParameterName;", "memory", "(Lio/ktor/utils/io/core/Buffer;ILjava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "readFloat", "", "readFully", "readFully-o1GoV1E", "(Lio/ktor/utils/io/core/Buffer;[BII)V", "readFully-o2ZM2JE", "(Lio/ktor/utils/io/core/Buffer;[III)V", "readFully-pqYNikA", "(Lio/ktor/utils/io/core/Buffer;[JII)V", "readFully-Wt3Bwxc", "(Lio/ktor/utils/io/core/Buffer;[SII)V", "readInt", "readLong", "", "readShort", "", "readUByte", "Lkotlin/UByte;", "(Lio/ktor/utils/io/core/Buffer;)B", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;)B", "readUInt", "Lkotlin/UInt;", "(Lio/ktor/utils/io/core/Buffer;)I", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;)I", "readULong", "Lkotlin/ULong;", "(Lio/ktor/utils/io/core/Buffer;)J", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;)J", "readUShort", "Lkotlin/UShort;", "(Lio/ktor/utils/io/core/Buffer;)S", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;)S", "writeDouble", "value", "writeExact", "writeFloat", "writeFully", "src", "source", "writeFully-o1GoV1E", "writeFully-o2ZM2JE", "writeFully-pqYNikA", "writeFully-Wt3Bwxc", "writeInt", "writeLong", "writeShort", "writeUByte", "writeUByte-EK-6454", "(Lio/ktor/utils/io/core/Buffer;B)V", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;B)V", "writeUInt", "writeUInt-Qn1smSk", "(Lio/ktor/utils/io/core/Buffer;I)V", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;I)V", "writeULong", "writeULong-2TYgG_w", "(Lio/ktor/utils/io/core/Buffer;J)V", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;J)V", "writeUShort", "writeUShort-i8woANY", "(Lio/ktor/utils/io/core/Buffer;S)V", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;S)V", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBufferPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferPrimitives.kt\nio/ktor/utils/io/core/BufferPrimitivesKt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 3 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n+ 4 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 5 MemoryPrimitivesJvm.kt\nio/ktor/utils/io/bits/MemoryPrimitivesJvmKt\n+ 6 MemoryPrimitives.kt\nio/ktor/utils/io/bits/MemoryPrimitivesKt\n+ 7 PrimiteArrays.kt\nio/ktor/utils/io/bits/PrimiteArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 10 MemoryFactoryJvm.kt\nio/ktor/utils/io/bits/MemoryFactoryJvmKt\n*L\n1#1,797:1\n762#1,7:807\n769#1,5:819\n774#1:825\n777#1:828\n762#1,7:829\n769#1,5:841\n774#1:848\n777#1:851\n762#1,7:852\n769#1,5:864\n774#1:870\n777#1:873\n762#1,7:874\n769#1,5:886\n774#1:893\n777#1:896\n762#1,7:897\n769#1,5:909\n774#1:915\n777#1:918\n762#1,7:919\n769#1,5:931\n774#1:938\n777#1:941\n762#1,7:942\n769#1,5:954\n774#1:960\n777#1:963\n762#1,7:964\n769#1,5:976\n774#1:982\n777#1:985\n784#1,5:986\n789#1,5:996\n794#1:1003\n796#1:1006\n784#1,5:1007\n789#1,5:1017\n794#1:1025\n796#1:1028\n784#1,5:1029\n789#1,5:1039\n794#1:1046\n796#1:1049\n784#1,5:1050\n789#1,5:1060\n794#1:1068\n796#1:1071\n784#1,5:1072\n789#1,5:1082\n794#1:1089\n796#1:1092\n784#1,5:1093\n789#1,5:1103\n794#1:1111\n796#1:1114\n784#1,5:1115\n789#1,5:1125\n794#1:1132\n796#1:1135\n784#1,5:1136\n789#1,5:1146\n794#1:1153\n796#1:1156\n762#1,7:1157\n769#1,5:1169\n774#1:1176\n777#1:1179\n784#1,5:1183\n789#1,5:1193\n794#1:1206\n796#1:1209\n762#1,7:1210\n769#1,6:1222\n777#1:1230\n784#1,5:1233\n789#1,6:1243\n796#1:1251\n762#1,7:1252\n769#1,6:1264\n777#1:1272\n784#1,5:1275\n789#1,6:1285\n796#1:1293\n762#1,7:1294\n769#1,6:1306\n777#1:1314\n784#1,5:1317\n789#1,6:1327\n796#1:1335\n762#1,7:1336\n769#1,6:1348\n777#1:1356\n784#1,5:1359\n789#1,6:1369\n796#1:1377\n762#1,7:1378\n769#1,6:1390\n777#1:1398\n784#1,5:1401\n789#1,6:1411\n796#1:1419\n762#1,7:1421\n769#1,6:1433\n777#1:1441\n762#1,7:1446\n769#1,6:1458\n777#1:1466\n784#1,5:1469\n789#1,6:1479\n796#1:1487\n784#1,5:1492\n789#1,6:1502\n796#1:1510\n372#2,5:798\n377#2,2:805\n372#2,5:814\n377#2,2:826\n372#2,5:836\n377#2,2:849\n372#2,5:859\n377#2,2:871\n372#2,5:881\n377#2,2:894\n372#2,5:904\n377#2,2:916\n372#2,5:926\n377#2,2:939\n372#2,5:949\n377#2,2:961\n372#2,5:971\n377#2,2:983\n390#2,5:991\n395#2,2:1004\n390#2,5:1012\n395#2,2:1026\n390#2,5:1034\n395#2,2:1047\n390#2,5:1055\n395#2,2:1069\n390#2,5:1077\n395#2,2:1090\n390#2,5:1098\n395#2,2:1112\n390#2,5:1120\n395#2,2:1133\n390#2,5:1141\n395#2,2:1154\n372#2,5:1164\n377#2,2:1177\n355#2:1181\n390#2,5:1188\n395#2,2:1207\n372#2,5:1217\n377#2,2:1228\n355#2:1231\n390#2,5:1238\n395#2,2:1249\n372#2,5:1259\n377#2,2:1270\n355#2:1273\n390#2,5:1280\n395#2,2:1291\n372#2,5:1301\n377#2,2:1312\n355#2:1315\n390#2,5:1322\n395#2,2:1333\n372#2,5:1343\n377#2,2:1354\n355#2:1357\n390#2,5:1364\n395#2,2:1375\n372#2,5:1385\n377#2,2:1396\n355#2:1399\n390#2,5:1406\n395#2,2:1417\n372#2,5:1428\n377#2,2:1439\n355#2:1443\n372#2,5:1453\n377#2,2:1464\n390#2,5:1474\n395#2,2:1485\n390#2,5:1497\n395#2,2:1508\n372#2,7:1511\n390#2,7:1518\n84#3:803\n26#4:804\n8#5:824\n8#5:847\n16#5:869\n16#5:892\n24#5:914\n24#5:937\n32#5:959\n40#5:981\n65#5,2:1001\n65#5,2:1023\n51#5,2:1044\n51#5,2:1066\n79#5,2:1087\n79#5,2:1109\n93#5,2:1130\n107#5,2:1151\n28#6:846\n68#6:891\n108#6:936\n38#6:1022\n78#6:1065\n118#6:1108\n15#7,2:1174\n282#7:1198\n283#7,3:1203\n1#8:1180\n69#9:1182\n69#9:1232\n69#9:1274\n69#9:1316\n69#9:1358\n69#9:1400\n74#9:1420\n74#9:1442\n74#9:1444\n69#9:1445\n74#9:1467\n69#9:1468\n69#9:1488\n69#9:1489\n74#9:1490\n74#9:1491\n17#10,4:1199\n*S KotlinDebug\n*F\n+ 1 BufferPrimitives.kt\nio/ktor/utils/io/core/BufferPrimitivesKt\n*L\n49#1:807,7\n49#1:819,5\n49#1:825\n49#1:828\n61#1:829,7\n61#1:841,5\n61#1:848\n61#1:851\n73#1:852,7\n73#1:864,5\n73#1:870\n73#1:873\n85#1:874,7\n85#1:886,5\n85#1:893\n85#1:896\n97#1:897,7\n97#1:909,5\n97#1:915\n97#1:918\n109#1:919,7\n109#1:931,5\n109#1:938\n109#1:941\n121#1:942,7\n121#1:954,5\n121#1:960\n121#1:963\n133#1:964,7\n133#1:976,5\n133#1:982\n133#1:985\n145#1:986,5\n145#1:996,5\n145#1:1003\n145#1:1006\n158#1:1007,5\n158#1:1017,5\n158#1:1025\n158#1:1028\n170#1:1029,5\n170#1:1039,5\n170#1:1046\n170#1:1049\n182#1:1050,5\n182#1:1060,5\n182#1:1068\n182#1:1071\n194#1:1072,5\n194#1:1082,5\n194#1:1089\n194#1:1092\n206#1:1093,5\n206#1:1103,5\n206#1:1111\n206#1:1114\n219#1:1115,5\n219#1:1125,5\n219#1:1132\n219#1:1135\n235#1:1136,5\n235#1:1146,5\n235#1:1153\n235#1:1156\n250#1:1157,7\n250#1:1169,5\n250#1:1176\n250#1:1179\n324#1:1183,5\n324#1:1193,5\n324#1:1206\n324#1:1209\n349#1:1210,7\n349#1:1222,6\n349#1:1230\n415#1:1233,5\n415#1:1243,6\n415#1:1251\n436#1:1252,7\n436#1:1264,6\n436#1:1272\n494#1:1275,5\n494#1:1285,6\n494#1:1293\n515#1:1294,7\n515#1:1306,6\n515#1:1314\n577#1:1317,5\n577#1:1327,6\n577#1:1335\n598#1:1336,7\n598#1:1348,6\n598#1:1356\n636#1:1359,5\n636#1:1369,6\n636#1:1377\n647#1:1378,7\n647#1:1390,6\n647#1:1398\n685#1:1401,5\n685#1:1411,6\n685#1:1419\n699#1:1421,7\n699#1:1433,6\n699#1:1441\n717#1:1446,7\n717#1:1458,6\n717#1:1466\n732#1:1469,5\n732#1:1479,6\n732#1:1487\n752#1:1492,5\n752#1:1502,6\n752#1:1510\n14#1:798,5\n14#1:805,2\n49#1:814,5\n49#1:826,2\n61#1:836,5\n61#1:849,2\n73#1:859,5\n73#1:871,2\n85#1:881,5\n85#1:894,2\n97#1:904,5\n97#1:916,2\n109#1:926,5\n109#1:939,2\n121#1:949,5\n121#1:961,2\n133#1:971,5\n133#1:983,2\n145#1:991,5\n145#1:1004,2\n158#1:1012,5\n158#1:1026,2\n170#1:1034,5\n170#1:1047,2\n182#1:1055,5\n182#1:1069,2\n194#1:1077,5\n194#1:1090,2\n206#1:1098,5\n206#1:1112,2\n219#1:1120,5\n219#1:1133,2\n235#1:1141,5\n235#1:1154,2\n250#1:1164,5\n250#1:1177,2\n288#1:1181\n324#1:1188,5\n324#1:1207,2\n349#1:1217,5\n349#1:1228,2\n385#1:1231\n415#1:1238,5\n415#1:1249,2\n436#1:1259,5\n436#1:1270,2\n468#1:1273\n494#1:1280,5\n494#1:1291,2\n515#1:1301,5\n515#1:1312,2\n547#1:1315\n577#1:1322,5\n577#1:1333,2\n598#1:1343,5\n598#1:1354,2\n624#1:1357\n636#1:1364,5\n636#1:1375,2\n647#1:1385,5\n647#1:1396,2\n673#1:1399\n685#1:1406,5\n685#1:1417,2\n699#1:1428,5\n699#1:1439,2\n713#1:1443\n717#1:1453,5\n717#1:1464,2\n732#1:1474,5\n732#1:1485,2\n752#1:1497,5\n752#1:1508,2\n768#1:1511,7\n788#1:1518,7\n16#1:803\n16#1:804\n50#1:824\n62#1:847\n74#1:869\n86#1:892\n98#1:914\n110#1:937\n122#1:959\n134#1:981\n146#1:1001,2\n159#1:1023,2\n171#1:1044,2\n183#1:1066,2\n195#1:1087,2\n207#1:1109,2\n220#1:1130,2\n236#1:1151,2\n62#1:846\n86#1:891\n110#1:936\n159#1:1022\n183#1:1065\n207#1:1108\n251#1:1174,2\n325#1:1198\n325#1:1203,3\n289#1:1182\n386#1:1232\n469#1:1274\n548#1:1316\n625#1:1358\n674#1:1400\n697#1:1420\n695#1:1442\n715#1:1444\n715#1:1445\n712#1:1467\n730#1:1468\n745#1:1488\n746#1:1489\n748#1:1490\n749#1:1491\n325#1:1199,4\n*E\n"})
/* loaded from: classes8.dex */
public final class BufferPrimitivesKt {
    public static final byte readUByte(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return UByte.m15716constructorimpl(buffer.readByte());
    }

    public static final byte readUByte(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return readUByte((Buffer) chunkBuffer);
    }

    /* renamed from: writeUByte-EK-6454 */
    public static final void m15593writeUByteEK6454(@NotNull Buffer writeUByte, byte b) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeUByte, "$this$writeUByte");
        writeUByte.writeByte(b);
    }

    /* renamed from: writeUByte-EK-6454 */
    public static final void m15594writeUByteEK6454(@NotNull ChunkBuffer writeUByte, byte b) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeUByte, "$this$writeUByte");
        m15593writeUByteEK6454((Buffer) writeUByte, b);
    }

    public static final short readShort(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return readShort((Buffer) chunkBuffer);
    }

    public static final short readUShort(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return readUShort((Buffer) chunkBuffer);
    }

    public static final int readInt(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return readInt((Buffer) chunkBuffer);
    }

    public static final int readUInt(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return readUInt((Buffer) chunkBuffer);
    }

    public static final long readLong(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return readLong((Buffer) chunkBuffer);
    }

    public static final long readULong(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return readULong((Buffer) chunkBuffer);
    }

    public static final float readFloat(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return readFloat((Buffer) chunkBuffer);
    }

    public static final double readDouble(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return readDouble((Buffer) chunkBuffer);
    }

    public static final void writeShort(@NotNull ChunkBuffer chunkBuffer, short s) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        writeShort((Buffer) chunkBuffer, s);
    }

    /* renamed from: writeUShort-i8woANY */
    public static final void m15600writeUShorti8woANY(@NotNull ChunkBuffer writeUShort, short s) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeUShort, "$this$writeUShort");
        m15599writeUShorti8woANY((Buffer) writeUShort, s);
    }

    public static final void writeInt(@NotNull ChunkBuffer chunkBuffer, int i) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        writeInt((Buffer) chunkBuffer, i);
    }

    /* renamed from: writeUInt-Qn1smSk */
    public static final void m15596writeUIntQn1smSk(@NotNull ChunkBuffer writeUInt, int i) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeUInt, "$this$writeUInt");
        m15595writeUIntQn1smSk((Buffer) writeUInt, i);
    }

    public static final void writeLong(@NotNull ChunkBuffer chunkBuffer, long j) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        writeLong((Buffer) chunkBuffer, j);
    }

    /* renamed from: writeULong-2TYgG_w */
    public static final void m15598writeULong2TYgG_w(@NotNull ChunkBuffer writeULong, long j) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeULong, "$this$writeULong");
        m15597writeULong2TYgG_w((Buffer) writeULong, j);
    }

    public static final void writeFloat(@NotNull ChunkBuffer chunkBuffer, float f) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        writeFloat((Buffer) chunkBuffer, f);
    }

    public static final void writeDouble(@NotNull ChunkBuffer chunkBuffer, double d) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        writeDouble((Buffer) chunkBuffer, d);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        readFully(buffer, bArr, i, i2);
    }

    public static /* synthetic */ void readFully$default(ChunkBuffer chunkBuffer, byte[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = destination.length - i;
        }
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        readFully((Buffer) chunkBuffer, destination, i, i2);
    }

    public static final void readFully(@NotNull ChunkBuffer chunkBuffer, @NotNull byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        readFully((Buffer) chunkBuffer, destination, i, i2);
    }

    /* renamed from: readFully-o1GoV1E$default */
    public static /* synthetic */ void m15580readFullyo1GoV1E$default(Buffer buffer, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m15776getSizeimpl(bArr) - i;
        }
        m15579readFullyo1GoV1E(buffer, bArr, i, i2);
    }

    /* renamed from: readFully-o1GoV1E */
    public static final void m15579readFullyo1GoV1E(@NotNull Buffer readFully, @NotNull byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(readFully, "$this$readFully");
        Intrinsics.checkNotNullParameter(destination, "destination");
        readFully(readFully, destination, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        return readAvailable(buffer, bArr, i, i2);
    }

    public static final int readAvailable(@NotNull Buffer buffer, @NotNull byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i < 0) {
            throw new IllegalArgumentException(("offset shouldn't be negative: " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("length shouldn't be negative: " + i2).toString());
        }
        if (i + i2 <= destination.length) {
            if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                return -1;
            }
            int iMin = Math.min(i2, buffer.getWritePosition() - buffer.getReadPosition());
            readFully(buffer, destination, i, iMin);
            return iMin;
        }
        throw new IllegalArgumentException(("offset + length should be less than the destination size: " + i + " + " + i2 + " > " + destination.length).toString());
    }

    public static /* synthetic */ int readAvailable$default(ChunkBuffer chunkBuffer, byte[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = destination.length - i;
        }
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return readAvailable((Buffer) chunkBuffer, destination, i, i2);
    }

    public static final int readAvailable(@NotNull ChunkBuffer chunkBuffer, @NotNull byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return readAvailable((Buffer) chunkBuffer, destination, i, i2);
    }

    /* renamed from: readAvailable-o1GoV1E$default */
    public static /* synthetic */ int m15572readAvailableo1GoV1E$default(Buffer buffer, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m15776getSizeimpl(bArr) - i;
        }
        return m15571readAvailableo1GoV1E(buffer, bArr, i, i2);
    }

    /* renamed from: readAvailable-o1GoV1E */
    public static final int m15571readAvailableo1GoV1E(@NotNull Buffer readAvailable, @NotNull byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailable, "$this$readAvailable");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return readAvailable(readAvailable, destination, i, i2);
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, byte[] bArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        writeFully(buffer, bArr, i, i2);
    }

    public static /* synthetic */ void writeFully$default(ChunkBuffer chunkBuffer, byte[] source, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = source.length - i;
        }
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFully((Buffer) chunkBuffer, source, i, i2);
    }

    public static final void writeFully(@NotNull ChunkBuffer chunkBuffer, @NotNull byte[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFully((Buffer) chunkBuffer, source, i, i2);
    }

    /* renamed from: writeFully-o1GoV1E$default */
    public static /* synthetic */ void m15588writeFullyo1GoV1E$default(Buffer buffer, byte[] bArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m15776getSizeimpl(bArr) - i;
        }
        m15587writeFullyo1GoV1E(buffer, bArr, i, i2);
    }

    /* renamed from: writeFully-o1GoV1E */
    public static final void m15587writeFullyo1GoV1E(@NotNull Buffer writeFully, @NotNull byte[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeFully, "$this$writeFully");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFully(writeFully, source, i, i2);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        readFully(buffer, sArr, i, i2);
    }

    /* renamed from: readFully-Wt3Bwxc$default */
    public static /* synthetic */ void m15578readFullyWt3Bwxc$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m16039getSizeimpl(sArr) - i;
        }
        m15577readFullyWt3Bwxc(buffer, sArr, i, i2);
    }

    /* renamed from: readFully-Wt3Bwxc */
    public static final void m15577readFullyWt3Bwxc(@NotNull Buffer readFully, @NotNull short[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(readFully, "$this$readFully");
        Intrinsics.checkNotNullParameter(destination, "destination");
        readFully(readFully, destination, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        return readAvailable(buffer, sArr, i, i2);
    }

    public static final int readAvailable(@NotNull Buffer buffer, @NotNull short[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i < 0) {
            throw new IllegalArgumentException(("offset shouldn't be negative: " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("length shouldn't be negative: " + i2).toString());
        }
        if (i + i2 <= destination.length) {
            if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                return -1;
            }
            int iMin = Math.min(i2 / 2, buffer.getWritePosition() - buffer.getReadPosition());
            readFully(buffer, destination, i, iMin);
            return iMin;
        }
        throw new IllegalArgumentException(("offset + length should be less than the destination size: " + i + " + " + i2 + " > " + destination.length).toString());
    }

    /* renamed from: readAvailable-Wt3Bwxc$default */
    public static /* synthetic */ int m15570readAvailableWt3Bwxc$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m16039getSizeimpl(sArr) - i;
        }
        return m15569readAvailableWt3Bwxc(buffer, sArr, i, i2);
    }

    /* renamed from: readAvailable-Wt3Bwxc */
    public static final int m15569readAvailableWt3Bwxc(@NotNull Buffer readAvailable, @NotNull short[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailable, "$this$readAvailable");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return readAvailable(readAvailable, destination, i, i2);
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        writeFully(buffer, sArr, i, i2);
    }

    /* renamed from: writeFully-Wt3Bwxc$default */
    public static /* synthetic */ void m15586writeFullyWt3Bwxc$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m16039getSizeimpl(sArr) - i;
        }
        m15585writeFullyWt3Bwxc(buffer, sArr, i, i2);
    }

    /* renamed from: writeFully-Wt3Bwxc */
    public static final void m15585writeFullyWt3Bwxc(@NotNull Buffer writeFully, @NotNull short[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeFully, "$this$writeFully");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFully(writeFully, source, i, i2);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        readFully(buffer, iArr, i, i2);
    }

    /* renamed from: readFully-o2ZM2JE$default */
    public static /* synthetic */ void m15582readFullyo2ZM2JE$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UIntArray.m15855getSizeimpl(iArr) - i;
        }
        m15581readFullyo2ZM2JE(buffer, iArr, i, i2);
    }

    /* renamed from: readFully-o2ZM2JE */
    public static final void m15581readFullyo2ZM2JE(@NotNull Buffer readFully, @NotNull int[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(readFully, "$this$readFully");
        Intrinsics.checkNotNullParameter(destination, "destination");
        readFully(readFully, destination, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        return readAvailable(buffer, iArr, i, i2);
    }

    public static final int readAvailable(@NotNull Buffer buffer, @NotNull int[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i < 0) {
            throw new IllegalArgumentException(("offset shouldn't be negative: " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("length shouldn't be negative: " + i2).toString());
        }
        if (i + i2 <= destination.length) {
            if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                return -1;
            }
            int iMin = Math.min(i2 / 4, buffer.getWritePosition() - buffer.getReadPosition());
            readFully(buffer, destination, i, iMin);
            return iMin;
        }
        throw new IllegalArgumentException(("offset + length should be less than the destination size: " + i + " + " + i2 + " > " + destination.length).toString());
    }

    /* renamed from: readAvailable-o2ZM2JE$default */
    public static /* synthetic */ int m15574readAvailableo2ZM2JE$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UIntArray.m15855getSizeimpl(iArr) - i;
        }
        return m15573readAvailableo2ZM2JE(buffer, iArr, i, i2);
    }

    /* renamed from: readAvailable-o2ZM2JE */
    public static final int m15573readAvailableo2ZM2JE(@NotNull Buffer readAvailable, @NotNull int[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailable, "$this$readAvailable");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return readAvailable(readAvailable, destination, i, i2);
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        writeFully(buffer, iArr, i, i2);
    }

    /* renamed from: writeFully-o2ZM2JE$default */
    public static /* synthetic */ void m15590writeFullyo2ZM2JE$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UIntArray.m15855getSizeimpl(iArr) - i;
        }
        m15589writeFullyo2ZM2JE(buffer, iArr, i, i2);
    }

    /* renamed from: writeFully-o2ZM2JE */
    public static final void m15589writeFullyo2ZM2JE(@NotNull Buffer writeFully, @NotNull int[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeFully, "$this$writeFully");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFully(writeFully, source, i, i2);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        readFully(buffer, jArr, i, i2);
    }

    /* renamed from: readFully-pqYNikA$default */
    public static /* synthetic */ void m15584readFullypqYNikA$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m15934getSizeimpl(jArr) - i;
        }
        m15583readFullypqYNikA(buffer, jArr, i, i2);
    }

    /* renamed from: readFully-pqYNikA */
    public static final void m15583readFullypqYNikA(@NotNull Buffer readFully, @NotNull long[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(readFully, "$this$readFully");
        Intrinsics.checkNotNullParameter(destination, "destination");
        readFully(readFully, destination, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        return readAvailable(buffer, jArr, i, i2);
    }

    public static final int readAvailable(@NotNull Buffer buffer, @NotNull long[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i < 0) {
            throw new IllegalArgumentException(("offset shouldn't be negative: " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("length shouldn't be negative: " + i2).toString());
        }
        if (i + i2 <= destination.length) {
            if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                return -1;
            }
            int iMin = Math.min(i2 / 8, buffer.getWritePosition() - buffer.getReadPosition());
            readFully(buffer, destination, i, iMin);
            return iMin;
        }
        throw new IllegalArgumentException(("offset + length should be less than the destination size: " + i + " + " + i2 + " > " + destination.length).toString());
    }

    /* renamed from: readAvailable-pqYNikA$default */
    public static /* synthetic */ int m15576readAvailablepqYNikA$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m15934getSizeimpl(jArr) - i;
        }
        return m15575readAvailablepqYNikA(buffer, jArr, i, i2);
    }

    /* renamed from: readAvailable-pqYNikA */
    public static final int m15575readAvailablepqYNikA(@NotNull Buffer readAvailable, @NotNull long[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailable, "$this$readAvailable");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return readAvailable(readAvailable, destination, i, i2);
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        writeFully(buffer, jArr, i, i2);
    }

    /* renamed from: writeFully-pqYNikA$default */
    public static /* synthetic */ void m15592writeFullypqYNikA$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m15934getSizeimpl(jArr) - i;
        }
        m15591writeFullypqYNikA(buffer, jArr, i, i2);
    }

    /* renamed from: writeFully-pqYNikA */
    public static final void m15591writeFullypqYNikA(@NotNull Buffer writeFully, @NotNull long[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeFully, "$this$writeFully");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFully(writeFully, source, i, i2);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, float[] fArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        readFully(buffer, fArr, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        return readAvailable(buffer, fArr, i, i2);
    }

    public static final int readAvailable(@NotNull Buffer buffer, @NotNull float[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i < 0) {
            throw new IllegalArgumentException(("offset shouldn't be negative: " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("length shouldn't be negative: " + i2).toString());
        }
        if (i + i2 <= destination.length) {
            if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                return -1;
            }
            int iMin = Math.min(i2 / 4, buffer.getWritePosition() - buffer.getReadPosition());
            readFully(buffer, destination, i, iMin);
            return iMin;
        }
        throw new IllegalArgumentException(("offset + length should be less than the destination size: " + i + " + " + i2 + " > " + destination.length).toString());
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, float[] fArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        writeFully(buffer, fArr, i, i2);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, double[] dArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        readFully(buffer, dArr, i, i2);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        return readAvailable(buffer, dArr, i, i2);
    }

    public static final int readAvailable(@NotNull Buffer buffer, @NotNull double[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i < 0) {
            throw new IllegalArgumentException(("offset shouldn't be negative: " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("length shouldn't be negative: " + i2).toString());
        }
        if (i + i2 <= destination.length) {
            if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                return -1;
            }
            int iMin = Math.min(i2 / 8, buffer.getWritePosition() - buffer.getReadPosition());
            readFully(buffer, destination, i, iMin);
            return iMin;
        }
        throw new IllegalArgumentException(("offset + length should be less than the destination size: " + i + " + " + i2 + " > " + destination.length).toString());
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, double[] dArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        writeFully(buffer, dArr, i, i2);
    }

    public static final int readFully(@NotNull Buffer buffer, @NotNull Buffer dst, int i) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i > dst.getLimit() - dst.getWritePosition()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i) {
            Memory.m15424copyToJT6ljtQ(memory, dst.getMemory(), readPosition, i, dst.getWritePosition());
            dst.commitWritten(i);
            Unit unit = Unit.INSTANCE;
            buffer.discardExact(i);
            return i;
        }
        throw new EOFException("Not enough bytes to read a buffer content of size " + i + '.');
    }

    public static final void forEach(@NotNull Buffer buffer, @NotNull Function1<? super Byte, Unit> block) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        for (int i = readPosition; i < writePosition; i++) {
            block.invoke(Byte.valueOf(memory.get(i)));
        }
        buffer.discardExact(writePosition - readPosition);
    }

    public static final short readShort(@NotNull Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= 2) {
            Short shValueOf = Short.valueOf(memory.getShort(readPosition));
            buffer.discardExact(2);
            return shValueOf.shortValue();
        }
        throw new EOFException("Not enough bytes to read a short integer of size 2.");
    }

    public static final short readUShort(@NotNull Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= 2) {
            UShort uShortM15974boximpl = UShort.m15974boximpl(UShort.m15979constructorimpl(memory.getShort(readPosition)));
            buffer.discardExact(2);
            return uShortM15974boximpl.getData();
        }
        throw new EOFException("Not enough bytes to read a short unsigned integer of size 2.");
    }

    public static final int readInt(@NotNull Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= 4) {
            Integer numValueOf = Integer.valueOf(memory.getInt(readPosition));
            buffer.discardExact(4);
            return numValueOf.intValue();
        }
        throw new EOFException("Not enough bytes to read a regular integer of size 4.");
    }

    public static final int readUInt(@NotNull Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= 4) {
            UInt uIntM15788boximpl = UInt.m15788boximpl(UInt.m15793constructorimpl(memory.getInt(readPosition)));
            buffer.discardExact(4);
            return uIntM15788boximpl.getData();
        }
        throw new EOFException("Not enough bytes to read a regular unsigned integer of size 4.");
    }

    public static final long readLong(@NotNull Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= 8) {
            Long lValueOf = Long.valueOf(memory.getLong(readPosition));
            buffer.discardExact(8);
            return lValueOf.longValue();
        }
        throw new EOFException("Not enough bytes to read a long integer of size 8.");
    }

    public static final long readULong(@NotNull Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= 8) {
            ULong uLongM15867boximpl = ULong.m15867boximpl(ULong.m15872constructorimpl(memory.getLong(readPosition)));
            buffer.discardExact(8);
            return uLongM15867boximpl.getData();
        }
        throw new EOFException("Not enough bytes to read a long unsigned integer of size 8.");
    }

    public static final float readFloat(@NotNull Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= 4) {
            Float fValueOf = Float.valueOf(memory.getFloat(readPosition));
            buffer.discardExact(4);
            return fValueOf.floatValue();
        }
        throw new EOFException("Not enough bytes to read a floating point number of size 4.");
    }

    public static final double readDouble(@NotNull Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= 8) {
            Double dValueOf = Double.valueOf(memory.getDouble(readPosition));
            buffer.discardExact(8);
            return dValueOf.doubleValue();
        }
        throw new EOFException("Not enough bytes to read a long floating point number of size 8.");
    }

    public static final void writeShort(@NotNull Buffer buffer, short s) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 2) {
            throw new InsufficientSpaceException("short integer", 2, limit);
        }
        memory.putShort(writePosition, s);
        buffer.commitWritten(2);
    }

    /* renamed from: writeUShort-i8woANY */
    public static final void m15599writeUShorti8woANY(@NotNull Buffer writeUShort, short s) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeUShort, "$this$writeUShort");
        ByteBuffer memory = writeUShort.getMemory();
        int writePosition = writeUShort.getWritePosition();
        int limit = writeUShort.getLimit() - writePosition;
        if (limit < 2) {
            throw new InsufficientSpaceException("short unsigned integer", 2, limit);
        }
        memory.putShort(writePosition, s);
        writeUShort.commitWritten(2);
    }

    public static final void writeInt(@NotNull Buffer buffer, int i) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 4) {
            throw new InsufficientSpaceException("regular integer", 4, limit);
        }
        memory.putInt(writePosition, i);
        buffer.commitWritten(4);
    }

    /* renamed from: writeUInt-Qn1smSk */
    public static final void m15595writeUIntQn1smSk(@NotNull Buffer writeUInt, int i) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeUInt, "$this$writeUInt");
        ByteBuffer memory = writeUInt.getMemory();
        int writePosition = writeUInt.getWritePosition();
        int limit = writeUInt.getLimit() - writePosition;
        if (limit < 4) {
            throw new InsufficientSpaceException("regular unsigned integer", 4, limit);
        }
        memory.putInt(writePosition, i);
        writeUInt.commitWritten(4);
    }

    public static final void writeLong(@NotNull Buffer buffer, long j) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 8) {
            throw new InsufficientSpaceException("long integer", 8, limit);
        }
        memory.putLong(writePosition, j);
        buffer.commitWritten(8);
    }

    /* renamed from: writeULong-2TYgG_w */
    public static final void m15597writeULong2TYgG_w(@NotNull Buffer writeULong, long j) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeULong, "$this$writeULong");
        ByteBuffer memory = writeULong.getMemory();
        int writePosition = writeULong.getWritePosition();
        int limit = writeULong.getLimit() - writePosition;
        if (limit < 8) {
            throw new InsufficientSpaceException("long unsigned integer", 8, limit);
        }
        memory.putLong(writePosition, j);
        writeULong.commitWritten(8);
    }

    public static final void writeFloat(@NotNull Buffer buffer, float f) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 4) {
            throw new InsufficientSpaceException("floating point number", 4, limit);
        }
        memory.putFloat(writePosition, f);
        buffer.commitWritten(4);
    }

    public static final void writeDouble(@NotNull Buffer buffer, double d) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 8) {
            throw new InsufficientSpaceException("long floating point number", 8, limit);
        }
        memory.putDouble(writePosition, d);
        buffer.commitWritten(8);
    }

    public static final void readFully(@NotNull Buffer buffer, @NotNull byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < i2) {
            throw new EOFException("Not enough bytes to read a byte array of size " + i2 + '.');
        }
        MemoryJvmKt.m15442copyTo9zorpBc(memory, destination, readPosition, i2, i);
        Unit unit = Unit.INSTANCE;
        buffer.discardExact(i2);
    }

    public static final void writeFully(@NotNull Buffer buffer, @NotNull byte[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < i2) {
            throw new InsufficientSpaceException("byte array", i2, limit);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m15424copyToJT6ljtQ(Memory.m15423constructorimpl(byteBufferOrder), memory, 0, i2, writePosition);
        buffer.commitWritten(i2);
    }

    public static final void readFully(@NotNull Buffer buffer, @NotNull short[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int i3 = i2 * 2;
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i3) {
            PrimitiveArraysJvmKt.m15543loadShortArray9zorpBc(memory, readPosition, destination, i, i2);
            Unit unit = Unit.INSTANCE;
            buffer.discardExact(i3);
        } else {
            throw new EOFException("Not enough bytes to read a short integers array of size " + i3 + '.');
        }
    }

    public static final void writeFully(@NotNull Buffer buffer, @NotNull short[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 * 2;
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i3) {
            PrimitiveArraysJvmKt.m15563storeShortArray9zorpBc(memory, writePosition, source, i, i2);
            buffer.commitWritten(i3);
            return;
        }
        throw new InsufficientSpaceException("short integers array", i3, limit);
    }

    public static final void readFully(@NotNull Buffer buffer, @NotNull int[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int i3 = i2 * 4;
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i3) {
            PrimitiveArraysJvmKt.m15535loadIntArray9zorpBc(memory, readPosition, destination, i, i2);
            Unit unit = Unit.INSTANCE;
            buffer.discardExact(i3);
        } else {
            throw new EOFException("Not enough bytes to read a integers array of size " + i3 + '.');
        }
    }

    public static final void writeFully(@NotNull Buffer buffer, @NotNull int[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 * 4;
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i3) {
            PrimitiveArraysJvmKt.m15555storeIntArray9zorpBc(memory, writePosition, source, i, i2);
            buffer.commitWritten(i3);
            return;
        }
        throw new InsufficientSpaceException("integers array", i3, limit);
    }

    public static final void readFully(@NotNull Buffer buffer, @NotNull long[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int i3 = i2 * 8;
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i3) {
            PrimitiveArraysJvmKt.m15539loadLongArray9zorpBc(memory, readPosition, destination, i, i2);
            Unit unit = Unit.INSTANCE;
            buffer.discardExact(i3);
        } else {
            throw new EOFException("Not enough bytes to read a long integers array of size " + i3 + '.');
        }
    }

    public static final void writeFully(@NotNull Buffer buffer, @NotNull long[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 * 8;
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i3) {
            PrimitiveArraysJvmKt.m15559storeLongArray9zorpBc(memory, writePosition, source, i, i2);
            buffer.commitWritten(i3);
            return;
        }
        throw new InsufficientSpaceException("long integers array", i3, limit);
    }

    public static final void readFully(@NotNull Buffer buffer, @NotNull float[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int i3 = i2 * 4;
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i3) {
            PrimitiveArraysJvmKt.m15531loadFloatArray9zorpBc(memory, readPosition, destination, i, i2);
            Unit unit = Unit.INSTANCE;
            buffer.discardExact(i3);
        } else {
            throw new EOFException("Not enough bytes to read a floating point numbers array of size " + i3 + '.');
        }
    }

    public static final void writeFully(@NotNull Buffer buffer, @NotNull float[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 * 4;
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i3) {
            PrimitiveArraysJvmKt.m15551storeFloatArray9zorpBc(memory, writePosition, source, i, i2);
            buffer.commitWritten(i3);
            return;
        }
        throw new InsufficientSpaceException("floating point numbers array", i3, limit);
    }

    public static final void readFully(@NotNull Buffer buffer, @NotNull double[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int i3 = i2 * 8;
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i3) {
            PrimitiveArraysJvmKt.m15527loadDoubleArray9zorpBc(memory, readPosition, destination, i, i2);
            Unit unit = Unit.INSTANCE;
            buffer.discardExact(i3);
        } else {
            throw new EOFException("Not enough bytes to read a floating point numbers array of size " + i3 + '.');
        }
    }

    public static final void writeFully(@NotNull Buffer buffer, @NotNull double[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 * 8;
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i3) {
            PrimitiveArraysJvmKt.m15547storeDoubleArray9zorpBc(memory, writePosition, source, i, i2);
            buffer.commitWritten(i3);
            return;
        }
        throw new InsufficientSpaceException("floating point numbers array", i3, limit);
    }

    public static /* synthetic */ int readFully$default(Buffer buffer, Buffer buffer2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = buffer2.getLimit() - buffer2.getWritePosition();
        }
        return readFully(buffer, buffer2, i);
    }

    public static final int readAvailable(@NotNull Buffer buffer, @NotNull Buffer dst, int i) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (buffer.getWritePosition() <= buffer.getReadPosition()) {
            return -1;
        }
        int iMin = Math.min(dst.getLimit() - dst.getWritePosition(), Math.min(buffer.getWritePosition() - buffer.getReadPosition(), i));
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= iMin) {
            Memory.m15424copyToJT6ljtQ(memory, dst.getMemory(), readPosition, iMin, dst.getWritePosition());
            dst.commitWritten(iMin);
            Unit unit = Unit.INSTANCE;
            buffer.discardExact(iMin);
            return iMin;
        }
        throw new EOFException("Not enough bytes to read a buffer content of size " + iMin + '.');
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, Buffer buffer2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = buffer2.getLimit() - buffer2.getWritePosition();
        }
        return readAvailable(buffer, buffer2, i);
    }

    public static final void writeFully(@NotNull Buffer buffer, @NotNull Buffer src) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        int writePosition = src.getWritePosition() - src.getReadPosition();
        ByteBuffer memory = buffer.getMemory();
        int writePosition2 = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition2;
        if (limit >= writePosition) {
            Memory.m15424copyToJT6ljtQ(src.getMemory(), memory, src.getReadPosition(), writePosition, writePosition2);
            src.discardExact(writePosition);
            buffer.commitWritten(writePosition);
            return;
        }
        throw new InsufficientSpaceException("buffer readable content", writePosition, limit);
    }

    public static final void writeFully(@NotNull Buffer buffer, @NotNull Buffer src, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        if (i < 0) {
            throw new IllegalArgumentException(("length shouldn't be negative: " + i).toString());
        }
        if (i > src.getWritePosition() - src.getReadPosition()) {
            throw new IllegalArgumentException(("length shouldn't be greater than the source read remaining: " + i + " > " + (src.getWritePosition() - src.getReadPosition())).toString());
        }
        if (i > buffer.getLimit() - buffer.getWritePosition()) {
            throw new IllegalArgumentException(("length shouldn't be greater than the destination write remaining space: " + i + " > " + (buffer.getLimit() - buffer.getWritePosition())).toString());
        }
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i) {
            Memory.m15424copyToJT6ljtQ(src.getMemory(), memory, src.getReadPosition(), i, writePosition);
            src.discardExact(i);
            buffer.commitWritten(i);
            return;
        }
        throw new InsufficientSpaceException("buffer readable content", i, limit);
    }

    @PublishedApi
    public static final <R> R readExact(@NotNull Buffer buffer, int i, @NotNull String name, @NotNull Function2<? super Memory, ? super Integer, ? extends R> block) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < i) {
            throw new EOFException("Not enough bytes to read a " + name + " of size " + i + '.');
        }
        R rInvoke = block.invoke(Memory.m15422boximpl(memory), Integer.valueOf(readPosition));
        buffer.discardExact(i);
        return rInvoke;
    }

    @PublishedApi
    public static final void writeExact(@NotNull Buffer buffer, int i, @NotNull String name, @NotNull Function2<? super Memory, ? super Integer, Unit> block) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < i) {
            throw new InsufficientSpaceException(name, i, limit);
        }
        block.invoke(Memory.m15422boximpl(memory), Integer.valueOf(writePosition));
        buffer.commitWritten(i);
    }
}
