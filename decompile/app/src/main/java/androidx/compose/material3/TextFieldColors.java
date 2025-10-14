package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldDefaults.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bS\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BÝ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0002\u0010/J-\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020gH\u0001¢\u0006\u0004\bh\u0010iJÀ\u0003\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\bk\u0010lJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010e\u001a\u00020dH\u0001¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020d2\b\u0010p\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010q\u001a\u00020rH\u0016J-\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020gH\u0001¢\u0006\u0004\bt\u0010iJ-\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020gH\u0001¢\u0006\u0004\bv\u0010iJ-\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020gH\u0001¢\u0006\u0004\bx\u0010iJ-\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020gH\u0001¢\u0006\u0004\bz\u0010iJ-\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020gH\u0001¢\u0006\u0004\b|\u0010iJ-\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020gH\u0001¢\u0006\u0004\b~\u0010iJ.\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020gH\u0001¢\u0006\u0005\b\u0080\u0001\u0010iJ/\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020gH\u0001¢\u0006\u0005\b\u0082\u0001\u0010iJ/\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020gH\u0001¢\u0006\u0005\b\u0084\u0001\u0010iJ%\u0010\u0085\u0001\u001a\u00020\u000e*\u0004\u0018\u00010\u000e2\u000e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0087\u0001H\u0000¢\u0006\u0003\b\u0088\u0001R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b3\u00101R\u0019\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b4\u00101R\u0019\u0010\u001d\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b5\u00101R\u0019\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b6\u00101R\u0019\u0010!\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b7\u00101R\u0019\u0010)\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b8\u00101R\u0019\u0010-\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b9\u00101R\u0019\u0010%\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b:\u00101R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b;\u00101R\u0019\u0010\u0019\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b<\u00101R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b=\u00101R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b>\u00101R\u0019\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b?\u00101R\u0019\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b@\u00101R\u0019\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bA\u00101R\u0019\u0010\"\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bB\u00101R\u0019\u0010*\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bC\u00101R\u0019\u0010.\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bD\u00101R\u0019\u0010&\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bE\u00101R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bF\u00101R\u0019\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bG\u00101R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bH\u00101R\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bI\u00101R\u0019\u0010\u001b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bJ\u00101R\u0019\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bK\u00101R\u0019\u0010\u001f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bL\u00101R\u0019\u0010'\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bM\u00101R\u0019\u0010+\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bN\u00101R\u0019\u0010#\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bO\u00101R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bP\u00101R\u0019\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bQ\u00101R\u0014\u0010R\u001a\u00020\u000e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bW\u00101R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bX\u00101R\u0019\u0010\u001c\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bY\u00101R\u0019\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bZ\u00101R\u0019\u0010 \u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b[\u00101R\u0019\u0010(\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b\\\u00101R\u0019\u0010,\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b]\u00101R\u0019\u0010$\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b^\u00101R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b_\u00101R\u0019\u0010\u0018\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b`\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0089\u0001²\u0006\u000b\u0010\u008a\u0001\u001a\u00020dX\u008a\u0084\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020dX\u008a\u0084\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020dX\u008a\u0084\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020dX\u008a\u0084\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020dX\u008a\u0084\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020dX\u008a\u0084\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020dX\u008a\u0084\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020dX\u008a\u0084\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020dX\u008a\u0084\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020dX\u008a\u0084\u0002"}, m7105d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "textSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCursorColor-0d7_KjU", "()J", "J", "getDisabledContainerColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "getDisabledLabelColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getDisabledPlaceholderColor-0d7_KjU", "getDisabledPrefixColor-0d7_KjU", "getDisabledSuffixColor-0d7_KjU", "getDisabledSupportingTextColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getErrorContainerColor-0d7_KjU", "getErrorCursorColor-0d7_KjU", "getErrorIndicatorColor-0d7_KjU", "getErrorLabelColor-0d7_KjU", "getErrorLeadingIconColor-0d7_KjU", "getErrorPlaceholderColor-0d7_KjU", "getErrorPrefixColor-0d7_KjU", "getErrorSuffixColor-0d7_KjU", "getErrorSupportingTextColor-0d7_KjU", "getErrorTextColor-0d7_KjU", "getErrorTrailingIconColor-0d7_KjU", "getFocusedContainerColor-0d7_KjU", "getFocusedIndicatorColor-0d7_KjU", "getFocusedLabelColor-0d7_KjU", "getFocusedLeadingIconColor-0d7_KjU", "getFocusedPlaceholderColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "getFocusedSuffixColor-0d7_KjU", "getFocusedSupportingTextColor-0d7_KjU", "getFocusedTextColor-0d7_KjU", "getFocusedTrailingIconColor-0d7_KjU", "selectionColors", "getSelectionColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getTextSelectionColors", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getUnfocusedContainerColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getUnfocusedLabelColor-0d7_KjU", "getUnfocusedLeadingIconColor-0d7_KjU", "getUnfocusedPlaceholderColor-0d7_KjU", "getUnfocusedPrefixColor-0d7_KjU", "getUnfocusedSuffixColor-0d7_KjU", "getUnfocusedSupportingTextColor-0d7_KjU", "getUnfocusedTextColor-0d7_KjU", "getUnfocusedTrailingIconColor-0d7_KjU", "containerColor", "Landroidx/compose/runtime/State;", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "containerColor$material3_release", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "copy", "copy-ejIjP34", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/TextFieldColors;", "cursorColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "indicatorColor", "indicatorColor$material3_release", "labelColor", "labelColor$material3_release", "leadingIconColor", "leadingIconColor$material3_release", "placeholderColor", "placeholderColor$material3_release", "prefixColor", "prefixColor$material3_release", "suffixColor", "suffixColor$material3_release", "supportingTextColor", "supportingTextColor$material3_release", "textColor", "textColor$material3_release", "trailingIconColor", "trailingIconColor$material3_release", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse$material3_release", "material3_release", "focused"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2400:1\n658#2:2401\n646#2:2402\n658#2:2403\n646#2:2404\n658#2:2405\n646#2:2406\n658#2:2407\n646#2:2408\n658#2:2409\n646#2:2410\n658#2:2411\n646#2:2412\n658#2:2413\n646#2:2414\n658#2:2415\n646#2:2416\n658#2:2417\n646#2:2418\n658#2:2419\n646#2:2420\n658#2:2421\n646#2:2422\n658#2:2423\n646#2:2424\n658#2:2425\n646#2:2426\n658#2:2427\n646#2:2428\n658#2:2429\n646#2:2430\n658#2:2431\n646#2:2432\n658#2:2433\n646#2:2434\n658#2:2435\n646#2:2436\n658#2:2437\n646#2:2438\n658#2:2439\n646#2:2440\n658#2:2441\n646#2:2442\n658#2:2443\n646#2:2444\n658#2:2445\n646#2:2446\n658#2:2447\n646#2:2448\n658#2:2449\n646#2:2450\n658#2:2451\n646#2:2452\n658#2:2453\n646#2:2454\n658#2:2455\n646#2:2456\n658#2:2457\n646#2:2458\n658#2:2459\n646#2:2460\n658#2:2461\n646#2:2462\n658#2:2463\n646#2:2464\n658#2:2465\n646#2:2466\n658#2:2467\n646#2:2468\n658#2:2469\n646#2:2470\n658#2:2471\n646#2:2472\n658#2:2473\n646#2:2474\n658#2:2475\n646#2:2476\n658#2:2477\n646#2:2478\n658#2:2479\n646#2:2480\n658#2:2481\n646#2:2482\n658#2:2483\n646#2:2484\n81#3:2485\n81#3:2486\n81#3:2487\n81#3:2488\n81#3:2489\n81#3:2490\n81#3:2491\n81#3:2492\n81#3:2493\n81#3:2494\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n*L\n1967#1:2401\n1967#1:2402\n1968#1:2403\n1968#1:2404\n1969#1:2405\n1969#1:2406\n1970#1:2407\n1970#1:2408\n1971#1:2409\n1971#1:2410\n1972#1:2411\n1972#1:2412\n1973#1:2413\n1973#1:2414\n1974#1:2415\n1974#1:2416\n1975#1:2417\n1975#1:2418\n1976#1:2419\n1976#1:2420\n1978#1:2421\n1978#1:2422\n1979#1:2423\n1979#1:2424\n1980#1:2425\n1980#1:2426\n1981#1:2427\n1981#1:2428\n1982#1:2429\n1982#1:2430\n1983#1:2431\n1983#1:2432\n1984#1:2433\n1984#1:2434\n1985#1:2435\n1985#1:2436\n1986#1:2437\n1986#1:2438\n1987#1:2439\n1987#1:2440\n1988#1:2441\n1988#1:2442\n1989#1:2443\n1989#1:2444\n1990#1:2445\n1990#1:2446\n1991#1:2447\n1991#1:2448\n1992#1:2449\n1992#1:2450\n1993#1:2451\n1993#1:2452\n1994#1:2453\n1994#1:2454\n1995#1:2455\n1995#1:2456\n1996#1:2457\n1996#1:2458\n1997#1:2459\n1997#1:2460\n1998#1:2461\n1998#1:2462\n1999#1:2463\n1999#1:2464\n2000#1:2465\n2000#1:2466\n2001#1:2467\n2001#1:2468\n2002#1:2469\n2002#1:2470\n2003#1:2471\n2003#1:2472\n2004#1:2473\n2004#1:2474\n2005#1:2475\n2005#1:2476\n2006#1:2477\n2006#1:2478\n2007#1:2479\n2007#1:2480\n2008#1:2481\n2008#1:2482\n2009#1:2483\n2009#1:2484\n2029#1:2485\n2055#1:2486\n2081#1:2487\n2110#1:2488\n2135#1:2489\n2160#1:2490\n2185#1:2491\n2202#1:2492\n2228#1:2493\n2253#1:2494\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldColors {
    public static final int $stable = 0;
    private final long cursorColor;
    private final long disabledContainerColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledPrefixColor;
    private final long disabledSuffixColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorContainerColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorPlaceholderColor;
    private final long errorPrefixColor;
    private final long errorSuffixColor;
    private final long errorSupportingTextColor;
    private final long errorTextColor;
    private final long errorTrailingIconColor;
    private final long focusedContainerColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedPlaceholderColor;
    private final long focusedPrefixColor;
    private final long focusedSuffixColor;
    private final long focusedSupportingTextColor;
    private final long focusedTextColor;
    private final long focusedTrailingIconColor;

    @NotNull
    private final SelectionColors textSelectionColors;
    private final long unfocusedContainerColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedPlaceholderColor;
    private final long unfocusedPrefixColor;
    private final long unfocusedSuffixColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTextColor;
    private final long unfocusedTrailingIconColor;

    public /* synthetic */ TextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, SelectionColors selectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, selectionColors, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42);
    }

    private TextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, SelectionColors selectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        this.focusedTextColor = j;
        this.unfocusedTextColor = j2;
        this.disabledTextColor = j3;
        this.errorTextColor = j4;
        this.focusedContainerColor = j5;
        this.unfocusedContainerColor = j6;
        this.disabledContainerColor = j7;
        this.errorContainerColor = j8;
        this.cursorColor = j9;
        this.errorCursorColor = j10;
        this.textSelectionColors = selectionColors;
        this.focusedIndicatorColor = j11;
        this.unfocusedIndicatorColor = j12;
        this.disabledIndicatorColor = j13;
        this.errorIndicatorColor = j14;
        this.focusedLeadingIconColor = j15;
        this.unfocusedLeadingIconColor = j16;
        this.disabledLeadingIconColor = j17;
        this.errorLeadingIconColor = j18;
        this.focusedTrailingIconColor = j19;
        this.unfocusedTrailingIconColor = j20;
        this.disabledTrailingIconColor = j21;
        this.errorTrailingIconColor = j22;
        this.focusedLabelColor = j23;
        this.unfocusedLabelColor = j24;
        this.disabledLabelColor = j25;
        this.errorLabelColor = j26;
        this.focusedPlaceholderColor = j27;
        this.unfocusedPlaceholderColor = j28;
        this.disabledPlaceholderColor = j29;
        this.errorPlaceholderColor = j30;
        this.focusedSupportingTextColor = j31;
        this.unfocusedSupportingTextColor = j32;
        this.disabledSupportingTextColor = j33;
        this.errorSupportingTextColor = j34;
        this.focusedPrefixColor = j35;
        this.unfocusedPrefixColor = j36;
        this.disabledPrefixColor = j37;
        this.errorPrefixColor = j38;
        this.focusedSuffixColor = j39;
        this.unfocusedSuffixColor = j40;
        this.disabledSuffixColor = j41;
        this.errorSuffixColor = j42;
    }

    /* renamed from: getFocusedTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedTextColor() {
        return this.focusedTextColor;
    }

    /* renamed from: getUnfocusedTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedTextColor() {
        return this.unfocusedTextColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* renamed from: getErrorTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorTextColor() {
        return this.errorTextColor;
    }

    /* renamed from: getFocusedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedContainerColor() {
        return this.focusedContainerColor;
    }

    /* renamed from: getUnfocusedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedContainerColor() {
        return this.unfocusedContainerColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* renamed from: getErrorContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorContainerColor() {
        return this.errorContainerColor;
    }

    /* renamed from: getCursorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCursorColor() {
        return this.cursorColor;
    }

    /* renamed from: getErrorCursorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorCursorColor() {
        return this.errorCursorColor;
    }

    @NotNull
    public final SelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* renamed from: getFocusedIndicatorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedIndicatorColor() {
        return this.focusedIndicatorColor;
    }

    /* renamed from: getUnfocusedIndicatorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedIndicatorColor() {
        return this.unfocusedIndicatorColor;
    }

    /* renamed from: getDisabledIndicatorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIndicatorColor() {
        return this.disabledIndicatorColor;
    }

    /* renamed from: getErrorIndicatorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorIndicatorColor() {
        return this.errorIndicatorColor;
    }

    /* renamed from: getFocusedLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedLeadingIconColor() {
        return this.focusedLeadingIconColor;
    }

    /* renamed from: getUnfocusedLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedLeadingIconColor() {
        return this.unfocusedLeadingIconColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLeadingIconColor() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getErrorLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorLeadingIconColor() {
        return this.errorLeadingIconColor;
    }

    /* renamed from: getFocusedTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedTrailingIconColor() {
        return this.focusedTrailingIconColor;
    }

    /* renamed from: getUnfocusedTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedTrailingIconColor() {
        return this.unfocusedTrailingIconColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTrailingIconColor() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getErrorTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorTrailingIconColor() {
        return this.errorTrailingIconColor;
    }

    /* renamed from: getFocusedLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedLabelColor() {
        return this.focusedLabelColor;
    }

    /* renamed from: getUnfocusedLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedLabelColor() {
        return this.unfocusedLabelColor;
    }

    /* renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLabelColor() {
        return this.disabledLabelColor;
    }

    /* renamed from: getErrorLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorLabelColor() {
        return this.errorLabelColor;
    }

    /* renamed from: getFocusedPlaceholderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedPlaceholderColor() {
        return this.focusedPlaceholderColor;
    }

    /* renamed from: getUnfocusedPlaceholderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedPlaceholderColor() {
        return this.unfocusedPlaceholderColor;
    }

    /* renamed from: getDisabledPlaceholderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledPlaceholderColor() {
        return this.disabledPlaceholderColor;
    }

    /* renamed from: getErrorPlaceholderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorPlaceholderColor() {
        return this.errorPlaceholderColor;
    }

    /* renamed from: getFocusedSupportingTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedSupportingTextColor() {
        return this.focusedSupportingTextColor;
    }

    /* renamed from: getUnfocusedSupportingTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedSupportingTextColor() {
        return this.unfocusedSupportingTextColor;
    }

    /* renamed from: getDisabledSupportingTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSupportingTextColor() {
        return this.disabledSupportingTextColor;
    }

    /* renamed from: getErrorSupportingTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorSupportingTextColor() {
        return this.errorSupportingTextColor;
    }

    /* renamed from: getFocusedPrefixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedPrefixColor() {
        return this.focusedPrefixColor;
    }

    /* renamed from: getUnfocusedPrefixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedPrefixColor() {
        return this.unfocusedPrefixColor;
    }

    /* renamed from: getDisabledPrefixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledPrefixColor() {
        return this.disabledPrefixColor;
    }

    /* renamed from: getErrorPrefixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorPrefixColor() {
        return this.errorPrefixColor;
    }

    /* renamed from: getFocusedSuffixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedSuffixColor() {
        return this.focusedSuffixColor;
    }

    /* renamed from: getUnfocusedSuffixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedSuffixColor() {
        return this.unfocusedSuffixColor;
    }

    /* renamed from: getDisabledSuffixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSuffixColor() {
        return this.disabledSuffixColor;
    }

    /* renamed from: getErrorSuffixColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorSuffixColor() {
        return this.errorSuffixColor;
    }

    @NotNull
    public final SelectionColors takeOrElse$material3_release(@Nullable SelectionColors selectionColors, @NotNull Function0<SelectionColors> function0) {
        return selectionColors == null ? function0.invoke() : selectionColors;
    }

    @Composable
    @NotNull
    public final State<Color> leadingIconColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(925127045);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(925127045, i, -1, "androidx.compose.material3.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:2027)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledLeadingIconColor;
        } else if (z2) {
            j = this.errorLeadingIconColor;
        } else {
            j = leadingIconColor$lambda$42(stateCollectIsFocusedAsState) ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> trailingIconColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-109504137);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-109504137, i, -1, "androidx.compose.material3.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:2053)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledTrailingIconColor;
        } else if (z2) {
            j = this.errorTrailingIconColor;
        } else {
            j = trailingIconColor$lambda$43(stateCollectIsFocusedAsState) ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> indicatorColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        State<Color> stateRememberUpdatedState;
        composer.startReplaceableGroup(-1877482635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877482635, i, -1, "androidx.compose.material3.TextFieldColors.indicatorColor (TextFieldDefaults.kt:2079)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledIndicatorColor;
        } else if (z2) {
            j = this.errorIndicatorColor;
        } else {
            j = indicatorColor$lambda$44(stateCollectIsFocusedAsState) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(715804770);
            stateRememberUpdatedState = SingleValueAnimationKt.m7665animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(715804875);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1921164569);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1921164569, i, -1, "androidx.compose.material3.TextFieldColors.containerColor (TextFieldDefaults.kt:2108)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledContainerColor;
        } else if (z2) {
            j = this.errorContainerColor;
        } else {
            j = containerColor$lambda$45(stateCollectIsFocusedAsState) ? this.focusedContainerColor : this.unfocusedContainerColor;
        }
        State<Color> stateM7665animateColorAsStateeuL9pac = SingleValueAnimationKt.m7665animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM7665animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    public final State<Color> placeholderColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(653850713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(653850713, i, -1, "androidx.compose.material3.TextFieldColors.placeholderColor (TextFieldDefaults.kt:2133)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledPlaceholderColor;
        } else if (z2) {
            j = this.errorPlaceholderColor;
        } else {
            j = placeholderColor$lambda$46(stateCollectIsFocusedAsState) ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> labelColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1167161306);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1167161306, i, -1, "androidx.compose.material3.TextFieldColors.labelColor (TextFieldDefaults.kt:2158)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledLabelColor;
        } else if (z2) {
            j = this.errorLabelColor;
        } else {
            j = labelColor$lambda$47(stateCollectIsFocusedAsState) ? this.focusedLabelColor : this.unfocusedLabelColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> textColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(68412911);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(68412911, i, -1, "androidx.compose.material3.TextFieldColors.textColor (TextFieldDefaults.kt:2183)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledTextColor;
        } else if (z2) {
            j = this.errorTextColor;
        } else {
            j = textColor$lambda$48(stateCollectIsFocusedAsState) ? this.focusedTextColor : this.unfocusedTextColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> supportingTextColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1464709698);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1464709698, i, -1, "androidx.compose.material3.TextFieldColors.supportingTextColor (TextFieldDefaults.kt:2200)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledSupportingTextColor;
        } else if (z2) {
            j = this.errorSupportingTextColor;
        } else {
            j = supportingTextColor$lambda$49(stateCollectIsFocusedAsState) ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> prefixColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(129569364);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(129569364, i, -1, "androidx.compose.material3.TextFieldColors.prefixColor (TextFieldDefaults.kt:2226)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledPrefixColor;
        } else if (z2) {
            j = this.errorPrefixColor;
        } else {
            j = prefixColor$lambda$50(stateCollectIsFocusedAsState) ? this.focusedPrefixColor : this.unfocusedPrefixColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> suffixColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1575329427);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575329427, i, -1, "androidx.compose.material3.TextFieldColors.suffixColor (TextFieldDefaults.kt:2251)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledSuffixColor;
        } else if (z2) {
            j = this.errorSuffixColor;
        } else {
            j = suffixColor$lambda$51(stateCollectIsFocusedAsState) ? this.focusedSuffixColor : this.unfocusedSuffixColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> cursorColor$material3_release(boolean z, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1885422187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1885422187, i, -1, "androidx.compose.material3.TextFieldColors.cursorColor (TextFieldDefaults.kt:2269)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(z ? this.errorCursorColor : this.cursorColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @JvmName(name = "getSelectionColors")
    @NotNull
    public final SelectionColors getSelectionColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(997785083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(997785083, i, -1, "androidx.compose.material3.TextFieldColors.<get-selectionColors> (TextFieldDefaults.kt:2277)");
        }
        SelectionColors selectionColors = this.textSelectionColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectionColors;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) other;
        return Color.m11341equalsimpl0(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.m11341equalsimpl0(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.m11341equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m11341equalsimpl0(this.errorTextColor, textFieldColors.errorTextColor) && Color.m11341equalsimpl0(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.m11341equalsimpl0(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.m11341equalsimpl0(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.m11341equalsimpl0(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.m11341equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m11341equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && Intrinsics.areEqual(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m11341equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m11341equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m11341equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m11341equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m11341equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m11341equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m11341equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m11341equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m11341equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m11341equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m11341equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m11341equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m11341equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m11341equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m11341equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m11341equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m11341equalsimpl0(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.m11341equalsimpl0(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.m11341equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m11341equalsimpl0(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.m11341equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m11341equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m11341equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m11341equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.m11341equalsimpl0(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.m11341equalsimpl0(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.m11341equalsimpl0(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.m11341equalsimpl0(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.m11341equalsimpl0(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.m11341equalsimpl0(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.m11341equalsimpl0(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.m11341equalsimpl0(this.errorSuffixColor, textFieldColors.errorSuffixColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m11347hashCodeimpl(this.focusedTextColor) * 31) + Color.m11347hashCodeimpl(this.unfocusedTextColor)) * 31) + Color.m11347hashCodeimpl(this.disabledTextColor)) * 31) + Color.m11347hashCodeimpl(this.errorTextColor)) * 31) + Color.m11347hashCodeimpl(this.focusedContainerColor)) * 31) + Color.m11347hashCodeimpl(this.unfocusedContainerColor)) * 31) + Color.m11347hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m11347hashCodeimpl(this.errorContainerColor)) * 31) + Color.m11347hashCodeimpl(this.cursorColor)) * 31) + Color.m11347hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m11347hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m11347hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m11347hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m11347hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m11347hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m11347hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m11347hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m11347hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m11347hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m11347hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m11347hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m11347hashCodeimpl(this.errorLabelColor)) * 31) + Color.m11347hashCodeimpl(this.focusedPlaceholderColor)) * 31) + Color.m11347hashCodeimpl(this.unfocusedPlaceholderColor)) * 31) + Color.m11347hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m11347hashCodeimpl(this.errorPlaceholderColor)) * 31) + Color.m11347hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m11347hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m11347hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m11347hashCodeimpl(this.errorSupportingTextColor)) * 31) + Color.m11347hashCodeimpl(this.focusedPrefixColor)) * 31) + Color.m11347hashCodeimpl(this.unfocusedPrefixColor)) * 31) + Color.m11347hashCodeimpl(this.disabledPrefixColor)) * 31) + Color.m11347hashCodeimpl(this.errorPrefixColor)) * 31) + Color.m11347hashCodeimpl(this.focusedSuffixColor)) * 31) + Color.m11347hashCodeimpl(this.unfocusedSuffixColor)) * 31) + Color.m11347hashCodeimpl(this.disabledSuffixColor)) * 31) + Color.m11347hashCodeimpl(this.errorSuffixColor);
    }

    @NotNull
    /* renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m9941copyejIjP34(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, @Nullable SelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        Color.Companion companion = Color.INSTANCE;
        return new TextFieldColors(focusedTextColor != companion.m11376getUnspecified0d7_KjU() ? focusedTextColor : this.focusedTextColor, unfocusedTextColor != companion.m11376getUnspecified0d7_KjU() ? unfocusedTextColor : this.unfocusedTextColor, disabledTextColor != companion.m11376getUnspecified0d7_KjU() ? disabledTextColor : this.disabledTextColor, errorTextColor != companion.m11376getUnspecified0d7_KjU() ? errorTextColor : this.errorTextColor, focusedContainerColor != companion.m11376getUnspecified0d7_KjU() ? focusedContainerColor : this.focusedContainerColor, unfocusedContainerColor != companion.m11376getUnspecified0d7_KjU() ? unfocusedContainerColor : this.unfocusedContainerColor, disabledContainerColor != companion.m11376getUnspecified0d7_KjU() ? disabledContainerColor : this.disabledContainerColor, errorContainerColor != companion.m11376getUnspecified0d7_KjU() ? errorContainerColor : this.errorContainerColor, cursorColor != companion.m11376getUnspecified0d7_KjU() ? cursorColor : this.cursorColor, errorCursorColor != companion.m11376getUnspecified0d7_KjU() ? errorCursorColor : this.errorCursorColor, takeOrElse$material3_release(textSelectionColors, new Function0<SelectionColors>() { // from class: androidx.compose.material3.TextFieldColors$copy$11
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SelectionColors invoke() {
                return this.this$0.getTextSelectionColors();
            }
        }), focusedIndicatorColor != companion.m11376getUnspecified0d7_KjU() ? focusedIndicatorColor : this.focusedIndicatorColor, unfocusedIndicatorColor != companion.m11376getUnspecified0d7_KjU() ? unfocusedIndicatorColor : this.unfocusedIndicatorColor, disabledIndicatorColor != companion.m11376getUnspecified0d7_KjU() ? disabledIndicatorColor : this.disabledIndicatorColor, errorIndicatorColor != companion.m11376getUnspecified0d7_KjU() ? errorIndicatorColor : this.errorIndicatorColor, focusedLeadingIconColor != companion.m11376getUnspecified0d7_KjU() ? focusedLeadingIconColor : this.focusedLeadingIconColor, unfocusedLeadingIconColor != companion.m11376getUnspecified0d7_KjU() ? unfocusedLeadingIconColor : this.unfocusedLeadingIconColor, disabledLeadingIconColor != companion.m11376getUnspecified0d7_KjU() ? disabledLeadingIconColor : this.disabledLeadingIconColor, errorLeadingIconColor != companion.m11376getUnspecified0d7_KjU() ? errorLeadingIconColor : this.errorLeadingIconColor, focusedTrailingIconColor != companion.m11376getUnspecified0d7_KjU() ? focusedTrailingIconColor : this.focusedTrailingIconColor, unfocusedTrailingIconColor != companion.m11376getUnspecified0d7_KjU() ? unfocusedTrailingIconColor : this.unfocusedTrailingIconColor, disabledTrailingIconColor != companion.m11376getUnspecified0d7_KjU() ? disabledTrailingIconColor : this.disabledTrailingIconColor, errorTrailingIconColor != companion.m11376getUnspecified0d7_KjU() ? errorTrailingIconColor : this.errorTrailingIconColor, focusedLabelColor != companion.m11376getUnspecified0d7_KjU() ? focusedLabelColor : this.focusedLabelColor, unfocusedLabelColor != companion.m11376getUnspecified0d7_KjU() ? unfocusedLabelColor : this.unfocusedLabelColor, disabledLabelColor != companion.m11376getUnspecified0d7_KjU() ? disabledLabelColor : this.disabledLabelColor, errorLabelColor != companion.m11376getUnspecified0d7_KjU() ? errorLabelColor : this.errorLabelColor, focusedPlaceholderColor != companion.m11376getUnspecified0d7_KjU() ? focusedPlaceholderColor : this.focusedPlaceholderColor, unfocusedPlaceholderColor != companion.m11376getUnspecified0d7_KjU() ? unfocusedPlaceholderColor : this.unfocusedPlaceholderColor, disabledPlaceholderColor != companion.m11376getUnspecified0d7_KjU() ? disabledPlaceholderColor : this.disabledPlaceholderColor, errorPlaceholderColor != companion.m11376getUnspecified0d7_KjU() ? errorPlaceholderColor : this.errorPlaceholderColor, focusedSupportingTextColor != companion.m11376getUnspecified0d7_KjU() ? focusedSupportingTextColor : this.focusedSupportingTextColor, unfocusedSupportingTextColor != companion.m11376getUnspecified0d7_KjU() ? unfocusedSupportingTextColor : this.unfocusedSupportingTextColor, disabledSupportingTextColor != companion.m11376getUnspecified0d7_KjU() ? disabledSupportingTextColor : this.disabledSupportingTextColor, errorSupportingTextColor != companion.m11376getUnspecified0d7_KjU() ? errorSupportingTextColor : this.errorSupportingTextColor, focusedPrefixColor != companion.m11376getUnspecified0d7_KjU() ? focusedPrefixColor : this.focusedPrefixColor, unfocusedPrefixColor != companion.m11376getUnspecified0d7_KjU() ? unfocusedPrefixColor : this.unfocusedPrefixColor, disabledPrefixColor != companion.m11376getUnspecified0d7_KjU() ? disabledPrefixColor : this.disabledPrefixColor, errorPrefixColor != companion.m11376getUnspecified0d7_KjU() ? errorPrefixColor : this.errorPrefixColor, focusedSuffixColor != companion.m11376getUnspecified0d7_KjU() ? focusedSuffixColor : this.focusedSuffixColor, unfocusedSuffixColor != companion.m11376getUnspecified0d7_KjU() ? unfocusedSuffixColor : this.unfocusedSuffixColor, disabledSuffixColor != companion.m11376getUnspecified0d7_KjU() ? disabledSuffixColor : this.disabledSuffixColor, errorSuffixColor != companion.m11376getUnspecified0d7_KjU() ? errorSuffixColor : this.errorSuffixColor, null);
    }

    private static final boolean leadingIconColor$lambda$42(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean trailingIconColor$lambda$43(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean indicatorColor$lambda$44(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean containerColor$lambda$45(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean placeholderColor$lambda$46(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$47(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean textColor$lambda$48(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean supportingTextColor$lambda$49(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean prefixColor$lambda$50(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean suffixColor$lambda$51(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
