package com.blackhub.bronline.game.theme;

import androidx.annotation.DimenRes;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontFamilyKt;
import androidx.compose.p003ui.text.font.FontKt;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Type.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0080\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ:\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJN\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JD\u0010\u0019\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJD\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJD\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ:\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u000eJX\u0010#\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020%H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'JD\u0010(\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001eJN\u0010*\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010+\u001a\u00020%H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0018J:\u0010-\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010\u000eJ:\u0010/\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u000eJD\u00101\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001bJ&\u00103\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105JN\u00106\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108JN\u00109\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u00108J:\u0010;\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010\u000eJ:\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010\u000eJ:\u0010?\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010\u000eJ:\u0010A\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010\u000eJ:\u0010C\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010\u000eJ:\u0010E\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bF\u0010\u000eJ:\u0010G\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010\u000eJ:\u0010I\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010\u000eJP\u0010K\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010MH\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ:\u0010P\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bQ\u0010\u000eJ:\u0010R\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bS\u0010\u000eJ:\u0010T\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010\u000eJ:\u0010V\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bW\u0010\u000eJ:\u0010X\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bY\u0010\u000eJ:\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b[\u0010\u000eJ:\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b]\u0010\u000eJ:\u0010^\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b_\u0010\u000eJ:\u0010`\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\ba\u0010\u000eJ:\u0010b\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bc\u0010\u000eJ:\u0010d\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\be\u0010\u000eJ:\u0010f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bg\u0010\u000eJ:\u0010h\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bi\u0010\u000eJ:\u0010j\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bk\u0010\u000eJ:\u0010l\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bm\u0010\u000eJ:\u0010n\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bo\u0010\u000eJ\\\u0010p\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010r2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010MH\u0007ø\u0001\u0000¢\u0006\u0004\bs\u0010tJ:\u0010u\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bv\u0010\u000eJ:\u0010w\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bx\u0010\u000eJ:\u0010y\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\bz\u0010\u000eJ:\u0010{\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b|\u0010\u000eJD\u0010}\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b~\u0010\u001bJj\u0010\u007f\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010r2\f\b\u0002\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J<\u0010\u0086\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u0087\u0001\u0010\u000eJ<\u0010\u0088\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u0089\u0001\u0010\u000eJ<\u0010\u008a\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u008b\u0001\u0010\u000eJ<\u0010\u008c\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u008d\u0001\u0010\u000eJ<\u0010\u008e\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u008f\u0001\u0010\u000eJU\u0010\u0090\u0001\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\b\u0002\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J<\u0010\u0093\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u0094\u0001\u0010\u000eJ<\u0010\u0095\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u0096\u0001\u0010\u000eJ<\u0010\u0097\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u0098\u0001\u0010\u000eJ<\u0010\u0099\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u009a\u0001\u0010\u000eJ<\u0010\u009b\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u009c\u0001\u0010\u000eJI\u0010\u009d\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010MH\u0007ø\u0001\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001JI\u0010 \u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010MH\u0007ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010\u009f\u0001JP\u0010¢\u0001\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0005\b£\u0001\u0010\u0018J<\u0010¤\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b¥\u0001\u0010\u000eJ<\u0010¦\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b§\u0001\u0010\u000eJ<\u0010¨\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b©\u0001\u0010\u000eJ<\u0010ª\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b«\u0001\u0010\u000eJ<\u0010¬\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u00ad\u0001\u0010\u000eJ<\u0010®\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b¯\u0001\u0010\u000eJ<\u0010°\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b±\u0001\u0010\u000eJ<\u0010²\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b³\u0001\u0010\u000eJ<\u0010´\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bµ\u0001\u0010\u000eJ<\u0010¶\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b·\u0001\u0010\u000eJ<\u0010¸\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b¹\u0001\u0010\u000eJF\u0010º\u0001\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b»\u0001\u0010\u001bJ<\u0010¼\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b½\u0001\u0010\u000eJ<\u0010¾\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b¿\u0001\u0010\u000eJ<\u0010À\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÁ\u0001\u0010\u000eJ<\u0010Â\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÃ\u0001\u0010\u000eJF\u0010Ä\u0001\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÅ\u0001\u0010\u001bJ<\u0010Æ\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÇ\u0001\u0010\u000eJ<\u0010È\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÉ\u0001\u0010\u000eJI\u0010Ê\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010rH\u0007ø\u0001\u0000¢\u0006\u0006\bË\u0001\u0010Ì\u0001JI\u0010Í\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010rH\u0007ø\u0001\u0000¢\u0006\u0006\bÎ\u0001\u0010Ì\u0001J<\u0010Ï\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÐ\u0001\u0010\u000eJ<\u0010Ñ\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÒ\u0001\u0010\u000eJ<\u0010Ó\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÔ\u0001\u0010\u000eJ<\u0010Õ\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÖ\u0001\u0010\u000eJ<\u0010×\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bØ\u0001\u0010\u000eJ<\u0010Ù\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÚ\u0001\u0010\u000eJ<\u0010Û\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÜ\u0001\u0010\u000eJ<\u0010Ý\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÞ\u0001\u0010\u000eJ<\u0010ß\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bà\u0001\u0010\u000eJS\u0010á\u0001\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010rH\u0007ø\u0001\u0000¢\u0006\u0006\bâ\u0001\u0010ã\u0001J<\u0010ä\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bå\u0001\u0010\u000eJ3\u0010æ\u0001\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0006\bç\u0001\u0010è\u0001JF\u0010æ\u0001\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bé\u0001\u0010\u001bJ<\u0010ê\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bë\u0001\u0010\u000eJ<\u0010ì\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bí\u0001\u0010\u000eJ<\u0010î\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bï\u0001\u0010\u000eJ<\u0010ð\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bñ\u0001\u0010\u000eJ<\u0010ò\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bó\u0001\u0010\u000eJ<\u0010ô\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bõ\u0001\u0010\u000eJ<\u0010ö\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b÷\u0001\u0010\u000eJF\u0010ø\u0001\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bù\u0001\u0010\u001bJ<\u0010ú\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bû\u0001\u0010\u000eJ<\u0010ü\u0001\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bý\u0001\u0010\u000eJF\u0010þ\u0001\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\bÿ\u0001\u0010\u001bJk\u0010\u0080\u0002\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010r2\f\b\u0002\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0081\u0002\u0010\u0085\u0001JU\u0010\u0082\u0002\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\b\u0002\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0084\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002JF\u0010\u0087\u0002\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0005\b\u0088\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0089\u0002"}, m7105d2 = {"Lcom/blackhub/bronline/game/theme/TypographyStyle;", "", "()V", "artegraRegularItalic16brsp", "Landroidx/compose/ui/text/TextStyle;", "color", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "shadowOffset", "Landroidx/compose/ui/geometry/Offset;", "shadowBlur", "", "artegraRegularItalic16brsp-67j0QOw", "(JIJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "artegraRegularItalic18spOr14ssp", "artegraRegularItalic18spOr14ssp-67j0QOw", "artegraRegularItalic25spOr19ssp", "artegraRegularItalic25spOr19ssp-67j0QOw", "artegraSansExBlackItalicCustomSp", TtmlNode.ATTR_TTS_FONT_SIZE, "", "shadowColor", "artegraSansExBlackItalicCustomSp-2884n0o", "(IJIJFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "artegraSansExBoldCustomSp", "artegraSansExBoldCustomSp-bl3sdaw", "(IJIJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "artegraSansExExtraBold24spOr18ssp", "artegraSansExExtraBold24spOr18ssp-OSQ5NHM", "(JIJFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "artegraSansExExtraBold40spOr31ssp", "artegraSansExExtraBold40spOr31ssp-OSQ5NHM", "artegraSansExExtraBold52spOr40ssp", "artegraSansExExtraBold52spOr40ssp-67j0QOw", "artegraSansExExtraBoldCustomSp", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "artegraSansExExtraBoldCustomSp-uQo3GSw", "(IJIJFJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "artegraSansExExtraBoldNoSize", "artegraSansExExtraBoldNoSize-OSQ5NHM", "artegraSansExMediumCustomSp", "lineHeight", "artegraSansExMediumCustomSp-_ILo--A", "artegraSansExtended10dpOr8ssp", "artegraSansExtended10dpOr8ssp-67j0QOw", "artegraSansExtended12dpOr9ssp", "artegraSansExtended12dpOr9ssp-67j0QOw", "artegraSansExtendedRegularCustomSp", "artegraSansExtendedRegularCustomSp-bl3sdaw", "defaultFontWithoutFontFamily", "defaultFontWithoutFontFamily-iJQMabo", "(IJLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "downcomeCustomSp", "downcomeCustomSp-cv9FZhg", "(IJIJFILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "jollyLodgerCyrillicCustomSp", "jollyLodgerCyrillicCustomSp-cv9FZhg", "montserratBlack12spOr9ssp", "montserratBlack12spOr9ssp-67j0QOw", "montserratBold10spOr8ssp", "montserratBold10spOr8ssp-67j0QOw", "montserratBold11sp", "montserratBold11sp-67j0QOw", "montserratBold11spOr8ssp", "montserratBold11spOr8ssp-67j0QOw", "montserratBold12brsp", "montserratBold12brsp-67j0QOw", "montserratBold12spOr9ssp", "montserratBold12spOr9ssp-67j0QOw", "montserratBold13spOr10ssp", "montserratBold13spOr10ssp-67j0QOw", "montserratBold14spOr11ssp", "montserratBold14spOr11ssp-67j0QOw", "montserratBold15spOr12ssp", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "montserratBold15spOr12ssp-1PwDTvk", "(JIJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "montserratBold16spOr13ssp", "montserratBold16spOr13ssp-67j0QOw", "montserratBold17spOr13ssp", "montserratBold17spOr13ssp-67j0QOw", "montserratBold18ssp", "montserratBold18ssp-67j0QOw", "montserratBold24spOr18ssp", "montserratBold24spOr18ssp-67j0QOw", "montserratBold30spOr23ssp", "montserratBold30spOr23ssp-67j0QOw", "montserratBold33spOr25ssp", "montserratBold33spOr25ssp-67j0QOw", "montserratBold42spOr32ssp", "montserratBold42spOr32ssp-67j0QOw", "montserratBold55spOr42ssp", "montserratBold55spOr42ssp-67j0QOw", "montserratBold5brsp", "montserratBold5brsp-67j0QOw", "montserratBold7brsp", "montserratBold7brsp-67j0QOw", "montserratBold7spOr5ssp", "montserratBold7spOr5ssp-67j0QOw", "montserratBold8brsp", "montserratBold8brsp-67j0QOw", "montserratBold8spOr6ssp", "montserratBold8spOr6ssp-67j0QOw", "montserratBold9brsp", "montserratBold9brsp-67j0QOw", "montserratBold9spOr7ssp", "montserratBold9spOr7ssp-67j0QOw", "montserratBold9ssp", "montserratBold9ssp-67j0QOw", "montserratBoldCustomSp", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", "montserratBoldCustomSp-IzzofJo", "(IJIJFLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "montserratBoldItalic10spOr8ssp", "montserratBoldItalic10spOr8ssp-67j0QOw", "montserratBoldItalic14spOr11ssp", "montserratBoldItalic14spOr11ssp-67j0QOw", "montserratBoldItalic18spOr14ssp", "montserratBoldItalic18spOr14ssp-67j0QOw", "montserratBoldItalic9spOr7ssp", "montserratBoldItalic9spOr7ssp-67j0QOw", "montserratBoldItalicCustomSp", "montserratBoldItalicCustomSp-bl3sdaw", "montserratCustomWeightCustomSp", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", "montserratCustomWeightCustomSp-qm9ESmE", "(ILandroidx/compose/ui/text/font/FontWeight;JIJFLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "montserratExtraBold10spOr8ssp", "montserratExtraBold10spOr8ssp-67j0QOw", "montserratExtraBold14spOr11ssp", "montserratExtraBold14spOr11ssp-67j0QOw", "montserratExtraBold16spOr12ssp", "montserratExtraBold16spOr12ssp-67j0QOw", "montserratExtraBold18spOr14ssp", "montserratExtraBold18spOr14ssp-67j0QOw", "montserratExtraBold21spOr16ssp", "montserratExtraBold21spOr16ssp-67j0QOw", "montserratExtraBoldCustomSp", "montserratExtraBoldCustomSp-5OKGny8", "(IJIJFLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "montserratExtraBoldItalic10spOr8ssp", "montserratExtraBoldItalic10spOr8ssp-67j0QOw", "montserratExtraBoldItalic12spOr9ssp", "montserratExtraBoldItalic12spOr9ssp-67j0QOw", "montserratExtraBoldItalic14spOr11ssp", "montserratExtraBoldItalic14spOr11ssp-67j0QOw", "montserratExtraBoldItalic18spOr14ssp", "montserratExtraBoldItalic18spOr14ssp-67j0QOw", "montserratExtraBoldItalic20spOr15ssp", "montserratExtraBoldItalic20spOr15ssp-67j0QOw", "montserratExtraBoldItalic24spOr18ssp", "montserratExtraBoldItalic24spOr18ssp-RHzUZ70", "(JIJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "montserratExtraBoldItalic25spOr19ssp", "montserratExtraBoldItalic25spOr19ssp-RHzUZ70", "montserratExtraBoldItalicCustomSp", "montserratExtraBoldItalicCustomSp-2884n0o", "montserratMedium10spOr8ssp", "montserratMedium10spOr8ssp-67j0QOw", "montserratMedium12brsp", "montserratMedium12brsp-67j0QOw", "montserratMedium12spOr9ssp", "montserratMedium12spOr9ssp-67j0QOw", "montserratMedium13SpOr10ssp", "montserratMedium13SpOr10ssp-67j0QOw", "montserratMedium15brsp", "montserratMedium15brsp-67j0QOw", "montserratMedium15spOr12ssp", "montserratMedium15spOr12ssp-67j0QOw", "montserratMedium6brsp", "montserratMedium6brsp-67j0QOw", "montserratMedium7brsp", "montserratMedium7brsp-67j0QOw", "montserratMedium7spOr5ssp", "montserratMedium7spOr5ssp-67j0QOw", "montserratMedium8spOr6ssp", "montserratMedium8spOr6ssp-67j0QOw", "montserratMedium9spOr7ssp", "montserratMedium9spOr7ssp-67j0QOw", "montserratMediumCustomSp", "montserratMediumCustomSp-bl3sdaw", "montserratRegular10sp8ssp", "montserratRegular10sp8ssp-67j0QOw", "montserratRegular7spOr5ssp", "montserratRegular7spOr5ssp-67j0QOw", "montserratRegular8spOr6ssp", "montserratRegular8spOr6ssp-67j0QOw", "montserratRegular9ssp", "montserratRegular9ssp-67j0QOw", "montserratRegularCustomSp", "montserratRegularCustomSp-bl3sdaw", "montserratSemiBold10spOr8ssp", "montserratSemiBold10spOr8ssp-67j0QOw", "montserratSemiBold12spOr9ssp", "montserratSemiBold12spOr9ssp-67j0QOw", "montserratSemiBold13spOr10ssp", "montserratSemiBold13spOr10ssp-RHzUZ70", "(JIJFLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "montserratSemiBold14spOr11ssp", "montserratSemiBold14spOr11ssp-RHzUZ70", "montserratSemiBold16spOr12ssp", "montserratSemiBold16spOr12ssp-67j0QOw", "montserratSemiBold16spOr13ssp", "montserratSemiBold16spOr13ssp-67j0QOw", "montserratSemiBold17spOr13ssp", "montserratSemiBold17spOr13ssp-67j0QOw", "montserratSemiBold18spOr14ssp", "montserratSemiBold18spOr14ssp-67j0QOw", "montserratSemiBold20spOr15ssp", "montserratSemiBold20spOr15ssp-67j0QOw", "montserratSemiBold6spOr5ssp", "montserratSemiBold6spOr5ssp-67j0QOw", "montserratSemiBold7spOr5ssp", "montserratSemiBold7spOr5ssp-67j0QOw", "montserratSemiBold8spOr6ssp", "montserratSemiBold8spOr6ssp-67j0QOw", "montserratSemiBold9spOr7ssp", "montserratSemiBold9spOr7ssp-67j0QOw", "montserratSemiBoldCustomSp", "montserratSemiBoldCustomSp-cv9FZhg", "(IJIJFLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "montserratSemiBoldItalic10spOr8ssp", "montserratSemiBoldItalic10spOr8ssp-67j0QOw", "montserratSemiBoldItalicCustomSp", "montserratSemiBoldItalicCustomSp-qcSRpps", "(IJILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "montserratSemiBoldItalicCustomSp-bl3sdaw", "mullerBold12sp9ssp", "mullerBold12sp9ssp-67j0QOw", "mullerBold13sp10ssp", "mullerBold13sp10ssp-67j0QOw", "mullerBold14sp11ssp", "mullerBold14sp11ssp-67j0QOw", "mullerBold16spOr12ssp", "mullerBold16spOr12ssp-67j0QOw", "mullerBold23spOr18ssp", "mullerBold23spOr18ssp-67j0QOw", "mullerBold30ssp", "mullerBold30ssp-67j0QOw", "mullerBold7ssp", "mullerBold7ssp-67j0QOw", "mullerBoldCustomSp", "mullerBoldCustomSp-bl3sdaw", "mullerRegular10sp7ssp", "mullerRegular10sp7ssp-67j0QOw", "mullerRegular11sp8ssp", "mullerRegular11sp8ssp-67j0QOw", "mullerRegularCustomSp", "mullerRegularCustomSp-bl3sdaw", "mullerRegularCustomWeightAndSp", "mullerRegularCustomWeightAndSp-qm9ESmE", "ruOrKzFont", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "ruOrKzFont-sMvkAmo", "(IJILandroidx/compose/ui/text/style/BaselineShift;JFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "uaOrByFont", "uaOrByFont-bl3sdaw", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class TypographyStyle {
    public static final int $stable = 0;

    @NotNull
    public static final TypographyStyle INSTANCE = new TypographyStyle();

    @Composable
    @NotNull
    /* renamed from: mullerRegularCustomWeightAndSp-qm9ESmE */
    public final TextStyle m14877mullerRegularCustomWeightAndSpqm9ESmE(@DimenRes int i, @NotNull FontWeight fontWeight, long j, int i2, long j2, float f, @Nullable TextDecoration textDecoration, @Nullable FontStyle fontStyle, @Nullable Composer composer, int i3, int i4) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        composer.startReplaceableGroup(-14401756);
        long jM11377getWhite0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 8) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jM11115getZeroF1C5BW0 = (i4 & 16) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i4 & 32) != 0 ? 0.0f : f;
        TextDecoration textDecoration2 = (i4 & 64) != 0 ? null : textDecoration;
        FontStyle fontStyle2 = (i4 & 128) != 0 ? null : fontStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-14401756, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerRegularCustomWeightAndSp (Type.kt:67)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), fontWeight, fontStyle2, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16732112, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExBoldCustomSp-bl3sdaw */
    public final TextStyle m14773artegraSansExBoldCustomSpbl3sdaw(@DimenRes int i, long j, int i2, long j2, float f, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-292882563);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13558getCentere0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13558getCentere0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292882563, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExBoldCustomSp (Type.kt:89)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13558getCentere0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExtendedRegularCustomSp-bl3sdaw */
    public final TextStyle m14782artegraSansExtendedRegularCustomSpbl3sdaw(@DimenRes int i, long j, int i2, long j2, float f, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-250470044);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13558getCentere0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13558getCentere0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-250470044, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExtendedRegularCustomSp (Type.kt:108)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13558getCentere0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExtended10dpOr8ssp-67j0QOw */
    public final TextStyle m14780artegraSansExtended10dpOr8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1133769607);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13558getCentere0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13558getCentere0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1133769607, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExtended10dpOr8ssp (Type.kt:126)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13558getCentere0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExtended12dpOr9ssp-67j0QOw */
    public final TextStyle m14781artegraSansExtended12dpOr9ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1141883130);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13558getCentere0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13558getCentere0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1141883130, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExtended12dpOr9ssp (Type.kt:144)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._9ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13558getCentere0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExMediumCustomSp-_ILo--A */
    public final TextStyle m14779artegraSansExMediumCustomSp_ILoA(@DimenRes int i, long j, int i2, long j2, float f, long j3, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-982226370);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13558getCentere0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13558getCentere0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 1.0f;
        long jM13868getUnspecifiedXSAIIZE = (i4 & 32) != 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-982226370, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExMediumCustomSp (Type.kt:164)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13558getCentere0LSkKk, 0, jM13868getUnspecifiedXSAIIZE, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16605148, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraRegularItalic16brsp-67j0QOw */
    public final TextStyle m14769artegraRegularItalic16brsp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1596193415);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1596193415, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraRegularItalic16brsp (Type.kt:183)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._16brsp, composer, 6)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_black, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraRegularItalic18spOr14ssp-67j0QOw */
    public final TextStyle m14770artegraRegularItalic18spOr14ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(32583871);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(32583871, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraRegularItalic18spOr14ssp (Type.kt:202)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._14ssp, composer, 6)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_black, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraRegularItalic25spOr19ssp-67j0QOw */
    public final TextStyle m14771artegraRegularItalic25spOr19ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(950155680);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(950155680, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraRegularItalic25spOr19ssp (Type.kt:221)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._19ssp, composer, 6)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_black, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratCustomWeightCustomSp-qm9ESmE */
    public final TextStyle m14817montserratCustomWeightCustomSpqm9ESmE(@DimenRes int i, @NotNull FontWeight fontWeight, long j, int i2, long j2, float f, @Nullable TextDecoration textDecoration, @Nullable FontStyle fontStyle, @Nullable Composer composer, int i3, int i4) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        composer.startReplaceableGroup(-1363041212);
        long jM11377getWhite0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 8) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jM11115getZeroF1C5BW0 = (i4 & 16) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i4 & 32) != 0 ? 0.0f : f;
        TextDecoration textDecoration2 = (i4 & 64) != 0 ? null : textDecoration;
        FontStyle fontStyle2 = (i4 & 128) != 0 ? null : fontStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363041212, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratCustomWeightCustomSp (Type.kt:244)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), fontWeight, fontStyle2, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16732112, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratRegularCustomSp-bl3sdaw */
    public final TextStyle m14848montserratRegularCustomSpbl3sdaw(@DimenRes int i, long j, int i2, long j2, float f, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(2106610157);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jM11115getZeroF1C5BW0 = (i4 & 8) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i4 & 16) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2106610157, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratRegularCustomSp (Type.kt:264)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratRegular7spOr5ssp-67j0QOw */
    public final TextStyle m14845montserratRegular7spOr5ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1317849358);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1317849358, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratRegular7spOr5ssp (Type.kt:282)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._5ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratRegular8spOr6ssp-67j0QOw */
    public final TextStyle m14846montserratRegular8spOr6ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1735997870);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735997870, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratRegular8spOr6ssp (Type.kt:300)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._6ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMediumCustomSp-bl3sdaw */
    public final TextStyle m14843montserratMediumCustomSpbl3sdaw(@DimenRes int i, long j, int i2, long j2, float f, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-34987810);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-34987810, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMediumCustomSp (Type.kt:321)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium7spOr5ssp-67j0QOw */
    public final TextStyle m14840montserratMedium7spOr5ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1434859587);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1434859587, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium7spOr5ssp (Type.kt:339)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._5ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium6brsp-67j0QOw */
    public final TextStyle m14838montserratMedium6brsp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1061484492);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1061484492, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium6brsp (Type.kt:358)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._6brsp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium7brsp-67j0QOw */
    public final TextStyle m14839montserratMedium7brsp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1252320725);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1252320725, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium7brsp (Type.kt:376)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._7brsp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium8spOr6ssp-67j0QOw */
    public final TextStyle m14841montserratMedium8spOr6ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1016711075);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1016711075, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium8spOr6ssp (Type.kt:394)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._6ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium9spOr7ssp-67j0QOw */
    public final TextStyle m14842montserratMedium9spOr7ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-598562563);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-598562563, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium9spOr7ssp (Type.kt:412)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._7ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium10spOr8ssp-67j0QOw */
    public final TextStyle m14832montserratMedium10spOr8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-458977800);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-458977800, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium10spOr8ssp (Type.kt:430)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium12spOr9ssp-67j0QOw */
    public final TextStyle m14834montserratMedium12spOr9ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1560336759);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1560336759, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium12spOr9ssp (Type.kt:448)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._9ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium12brsp-67j0QOw */
    public final TextStyle m14833montserratMedium12brsp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1656070113);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1656070113, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium12brsp (Type.kt:466)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._12brsp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium15spOr12ssp-67j0QOw */
    public final TextStyle m14837montserratMedium15spOr12ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-708499164);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-708499164, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium15spOr12ssp (Type.kt:484)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._12ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium15brsp-67j0QOw */
    public final TextStyle m14836montserratMedium15brsp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-990378242);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-990378242, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium15brsp (Type.kt:502)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._12brsp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBoldCustomSp-cv9FZhg */
    public final TextStyle m14862montserratSemiBoldCustomSpcv9FZhg(@DimenRes int i, long j, int i2, long j2, float f, @Nullable TextDecoration textDecoration, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(158822935);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 1.0f;
        TextDecoration textDecoration2 = (i4 & 32) != 0 ? null : textDecoration;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(158822935, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBoldCustomSp (Type.kt:523)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16732124, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold6spOr5ssp-67j0QOw */
    public final TextStyle m14858montserratSemiBold6spOr5ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(204036028);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(204036028, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold6spOr5ssp (Type.kt:542)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._5ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold8spOr6ssp-67j0QOw */
    public final TextStyle m14860montserratSemiBold8spOr6ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2071616709);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2071616709, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold8spOr6ssp (Type.kt:560)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._6ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold9spOr7ssp-67j0QOw */
    public final TextStyle m14861montserratSemiBold9spOr7ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1653468197);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1653468197, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold9spOr7ssp (Type.kt:579)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._7ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold7spOr5ssp-67j0QOw */
    public final TextStyle m14859montserratSemiBold7spOr5ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1805202075);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1805202075, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold7spOr5ssp (Type.kt:599)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._5ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold10spOr8ssp-67j0QOw */
    public final TextStyle m14849montserratSemiBold10spOr8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1198685914);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1198685914, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold10spOr8ssp (Type.kt:617)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold12spOr9ssp-67j0QOw */
    public final TextStyle m14850montserratSemiBold12spOr9ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1076966823);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1076966823, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold12spOr9ssp (Type.kt:635)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._9ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold13spOr10ssp-RHzUZ70 */
    public final TextStyle m14851montserratSemiBold13spOr10sspRHzUZ70(long j, int i, long j2, float f, @Nullable TextDecoration textDecoration, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(2100410521);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) == 0 ? f : 1.0f;
        TextDecoration textDecoration2 = (i3 & 16) != 0 ? null : textDecoration;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2100410521, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold13spOr10ssp (Type.kt:655)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._10ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16732124, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold14spOr11ssp-RHzUZ70 */
    public final TextStyle m14852montserratSemiBold14spOr11sspRHzUZ70(long j, int i, long j2, float f, @Nullable TextDecoration textDecoration, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1648032361);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) == 0 ? f : 1.0f;
        TextDecoration textDecoration2 = (i3 & 16) != 0 ? null : textDecoration;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1648032361, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold14spOr11ssp (Type.kt:675)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._11ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16732124, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold16spOr12ssp-67j0QOw */
    public final TextStyle m14853montserratSemiBold16spOr12ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1530975619);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1530975619, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold16spOr12ssp (Type.kt:694)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._12ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold17spOr13ssp-67j0QOw */
    public final TextStyle m14855montserratSemiBold17spOr13ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1555502011);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1555502011, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold17spOr13ssp (Type.kt:712)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._13ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold18spOr14ssp-67j0QOw */
    public final TextStyle m14856montserratSemiBold18spOr14ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-347012345);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-347012345, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold18spOr14ssp (Type.kt:730)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._14ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold20spOr15ssp-67j0QOw */
    public final TextStyle m14857montserratSemiBold20spOr15ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1935028191);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1935028191, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold20spOr15ssp (Type.kt:748)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._15ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBoldItalicCustomSp-bl3sdaw */
    public final TextStyle m14864montserratSemiBoldItalicCustomSpbl3sdaw(@DimenRes int i, long j, int i2, long j2, float f, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(383042416);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jM11115getZeroF1C5BW0 = (i4 & 8) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i4 & 16) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(383042416, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBoldItalicCustomSp (Type.kt:767)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBoldItalicCustomSp-qcSRpps */
    public final TextStyle m14865montserratSemiBoldItalicCustomSpqcSRpps(@DimenRes int i, long j, int i2, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-1379952019);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1379952019, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBoldItalicCustomSp (Type.kt:786)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744404, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBoldItalic10spOr8ssp-67j0QOw */
    public final TextStyle m14863montserratSemiBoldItalic10spOr8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1566921462);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1566921462, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBoldItalic10spOr8ssp (Type.kt:800)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBoldCustomSp-IzzofJo */
    public final TextStyle m14811montserratBoldCustomSpIzzofJo(@DimenRes int i, long j, int i2, long j2, float f, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1603351498);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jM11115getZeroF1C5BW0 = (i4 & 8) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i4 & 16) != 0 ? 0.0f : f;
        TextDecoration textDecoration2 = (i4 & 32) != 0 ? null : textDecoration;
        DrawStyle drawStyle2 = (i4 & 64) != 0 ? null : drawStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1603351498, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBoldCustomSp (Type.kt:823)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), drawStyle2, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16715740, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold5brsp-67j0QOw */
    public final TextStyle m14803montserratBold5brsp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(137585469);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(137585469, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold5brsp (Type.kt:843)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._5brsp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold7spOr5ssp-67j0QOw */
    public final TextStyle m14805montserratBold7spOr5ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1780290163);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1780290163, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold7spOr5ssp (Type.kt:861)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._5ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold7brsp-67j0QOw */
    public final TextStyle m14804montserratBold7brsp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-195057669);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-195057669, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold7brsp (Type.kt:879)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._7brsp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold8spOr6ssp-67j0QOw */
    public final TextStyle m14807montserratBold8spOr6ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1362141651);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1362141651, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold8spOr6ssp (Type.kt:897)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._6ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold9spOr7ssp-67j0QOw */
    public final TextStyle m14809montserratBold9spOr7ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-943993139);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-943993139, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold9spOr7ssp (Type.kt:916)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._7ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold10spOr8ssp-67j0QOw */
    public final TextStyle m14787montserratBold10spOr8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1717576232);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1717576232, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold10spOr8ssp (Type.kt:934)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold8brsp-67j0QOw */
    public final TextStyle m14806montserratBold8brsp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1786104410);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1786104410, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold8brsp (Type.kt:952)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8brsp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold9brsp-67j0QOw */
    public final TextStyle m14808montserratBold9brsp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-527700807);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-527700807, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold9brsp (Type.kt:970)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._9brsp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold11sp-67j0QOw */
    public final TextStyle m14788montserratBold11sp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2115924990);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2115924990, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold11sp (Type.kt:988)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._11brsp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold11spOr8ssp-67j0QOw */
    public final TextStyle m14789montserratBold11spOr8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-976225017);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jM11115getZeroF1C5BW0 = (i3 & 4) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-976225017, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold11spOr8ssp (Type.kt:1006)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold12brsp-67j0QOw */
    public final TextStyle m14790montserratBold12brsp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(71486481);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(71486481, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold12brsp (Type.kt:1024)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._12brsp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold12spOr9ssp-67j0QOw */
    public final TextStyle m14791montserratBold12spOr9ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-558076505);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-558076505, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold12spOr9ssp (Type.kt:1043)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._9ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold13spOr10ssp-67j0QOw */
    public final TextStyle m14792montserratBold13spOr10ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-76812944);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-76812944, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold13spOr10ssp (Type.kt:1061)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._10ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold14spOr11ssp-67j0QOw */
    public final TextStyle m14793montserratBold14spOr11ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1131676722);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1131676722, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold14spOr11ssp (Type.kt:1079)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._11ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold15spOr12ssp-1PwDTvk */
    public final TextStyle m14794montserratBold15spOr12ssp1PwDTvk(long j, int i, long j2, long j3, float f, @Nullable DrawStyle drawStyle, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(785901886);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jM11366getBlack0d7_KjU = (i3 & 4) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j2;
        long jOffset = (i3 & 8) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j3;
        float f2 = (i3 & 16) != 0 ? 1.0f : f;
        DrawStyle drawStyle2 = (i3 & 32) != 0 ? null : drawStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(785901886, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold15spOr12ssp (Type.kt:1099)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._12ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(jM11366getBlack0d7_KjU, jOffset, f2, null), drawStyle2, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16719836, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold16spOr13ssp-67j0QOw */
    public final TextStyle m14795montserratBold16spOr13ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-746311242);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-746311242, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold16spOr13ssp (Type.kt:1118)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._13ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold17spOr13ssp-67j0QOw */
    public final TextStyle m14796montserratBold17spOr13ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1645195959);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1645195959, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold17spOr13ssp (Type.kt:1136)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._13ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold30spOr23ssp-67j0QOw */
    public final TextStyle m14799montserratBold30spOr23ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(2015267917);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2015267917, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold30spOr23ssp (Type.kt:1154)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._23ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold33spOr25ssp-67j0QOw */
    public final TextStyle m14800montserratBold33spOr25ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1766180142);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1766180142, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold33spOr25ssp (Type.kt:1172)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._25ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBoldItalicCustomSp-bl3sdaw */
    public final TextStyle m14816montserratBoldItalicCustomSpbl3sdaw(@DimenRes int i, long j, int i2, long j2, float f, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-1203160898);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1203160898, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBoldItalicCustomSp (Type.kt:1192)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBoldItalic9spOr7ssp-67j0QOw */
    public final TextStyle m14815montserratBoldItalic9spOr7ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1163027171);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1163027171, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBoldItalic9spOr7ssp (Type.kt:1211)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._7ssp, composer, 6)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBoldItalic10spOr8ssp-67j0QOw */
    public final TextStyle m14812montserratBoldItalic10spOr8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-777511464);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-777511464, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBoldItalic10spOr8ssp (Type.kt:1230)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBoldItalic14spOr11ssp-67j0QOw */
    public final TextStyle m14813montserratBoldItalic14spOr11ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1093369474);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1093369474, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBoldItalic14spOr11ssp (Type.kt:1249)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._11ssp, composer, 6)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBoldItalic18spOr14ssp-67j0QOw */
    public final TextStyle m14814montserratBoldItalic18spOr14ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1479588919);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1479588919, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBoldItalic18spOr14ssp (Type.kt:1268)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._14ssp, composer, 6)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBoldCustomSp-5OKGny8 */
    public final TextStyle m14823montserratExtraBoldCustomSp5OKGny8(@DimenRes int i, long j, int i2, long j2, float f, @Nullable FontStyle fontStyle, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-540323190);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jM11115getZeroF1C5BW0 = (i4 & 8) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i4 & 16) != 0 ? 0.0f : f;
        FontStyle fontStyle2 = (i4 & 32) != 0 ? null : fontStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-540323190, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBoldCustomSp (Type.kt:1291)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, fontStyle2, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBold10spOr8ssp-67j0QOw */
    public final TextStyle m14818montserratExtraBold10spOr8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-442631410);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-442631410, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBold10spOr8ssp (Type.kt:1310)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBold14spOr11ssp-67j0QOw */
    public final TextStyle m14819montserratExtraBold14spOr11ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1410250740);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1410250740, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBold14spOr11ssp (Type.kt:1328)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._11ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBold16spOr12ssp-67j0QOw */
    public final TextStyle m14820montserratExtraBold16spOr12ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2105221169);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jM11115getZeroF1C5BW0 = (i3 & 4) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2105221169, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBold16spOr12ssp (Type.kt:1346)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._12ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBold18spOr14ssp-67j0QOw */
    public final TextStyle m14821montserratExtraBold18spOr14ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(311758163);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(311758163, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBold18spOr14ssp (Type.kt:1364)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._14ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBold21spOr16ssp-67j0QOw */
    public final TextStyle m14822montserratExtraBold21spOr16ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-492678931);
        long jColorResource = (i3 & 1) != 0 ? ColorResources_androidKt.colorResource(R.color.white, composer, 6) : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jM11115getZeroF1C5BW0 = (i3 & 4) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-492678931, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBold21spOr16ssp (Type.kt:1382)");
        }
        TextStyle textStyle = new TextStyle(jColorResource, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._16ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBoldItalicCustomSp-2884n0o */
    public final TextStyle m14831montserratExtraBoldItalicCustomSp2884n0o(@DimenRes int i, long j, int i2, long j2, float f, long j3, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-1027299141);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 0.0f;
        long jM11366getBlack0d7_KjU = (i4 & 32) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1027299141, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBoldItalicCustomSp (Type.kt:1404)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold_italic, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(jM11366getBlack0d7_KjU, jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBoldItalic10spOr8ssp-67j0QOw */
    public final TextStyle m14824montserratExtraBoldItalic10spOr8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-134401474);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jM11115getZeroF1C5BW0 = (i3 & 4) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-134401474, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBoldItalic10spOr8ssp (Type.kt:1422)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold_italic, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBoldItalic12spOr9ssp-67j0QOw */
    public final TextStyle m14825montserratExtraBoldItalic12spOr9ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1884913085);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jM11115getZeroF1C5BW0 = (i3 & 4) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1884913085, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBoldItalic12spOr9ssp (Type.kt:1440)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._9ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold_italic, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBoldItalic14spOr11ssp-67j0QOw */
    public final TextStyle m14826montserratExtraBoldItalic14spOr11ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-445057316);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-445057316, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBoldItalic14spOr11ssp (Type.kt:1458)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._11ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold_italic, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBoldItalic18spOr14ssp-67j0QOw */
    public final TextStyle m14827montserratExtraBoldItalic18spOr14ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1276951587);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1276951587, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBoldItalic18spOr14ssp (Type.kt:1476)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._14ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold_italic, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBoldItalic20spOr15ssp-67j0QOw */
    public final TextStyle m14828montserratExtraBoldItalic20spOr15ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-735975173);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-735975173, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBoldItalic20spOr15ssp (Type.kt:1494)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._15ssp, composer, 6)), (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold_italic, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBlack12spOr9ssp-67j0QOw */
    public final TextStyle m14786montserratBlack12spOr9ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(944166403);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(944166403, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBlack12spOr9ssp (Type.kt:1514)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._9ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_black, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold24spOr18ssp-67j0QOw */
    public final TextStyle m14798montserratBold24spOr18ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1732199528);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1732199528, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold24spOr18ssp (Type.kt:1532)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._18ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExExtraBoldCustomSp-uQo3GSw */
    public final TextStyle m14777artegraSansExExtraBoldCustomSpuQo3GSw(@DimenRes int i, long j, int i2, long j2, float f, long j3, long j4, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(910751471);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 0.0f;
        long jM11366getBlack0d7_KjU = (i4 & 32) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j3;
        long sp = (i4 & 64) != 0 ? TextUnitKt.getSp(0.63d) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(910751471, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExExtraBoldCustomSp (Type.kt:1553)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_extra_bold, null, 0, 0, 14, null)), (String) null, sp, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(jM11366getBlack0d7_KjU, jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736092, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExBlackItalicCustomSp-2884n0o */
    public final TextStyle m14772artegraSansExBlackItalicCustomSp2884n0o(@DimenRes int i, long j, int i2, long j2, float f, long j3, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1437962146);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 0.0f;
        long jM11366getBlack0d7_KjU = (i4 & 32) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1437962146, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExBlackItalicCustomSp (Type.kt:1574)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_black_it, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(jM11366getBlack0d7_KjU, jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExExtraBold24spOr18ssp-OSQ5NHM */
    public final TextStyle m14774artegraSansExExtraBold24spOr18sspOSQ5NHM(long j, int i, long j2, float f, long j3, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1907546552);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) == 0 ? f : 0.0f;
        long jM11366getBlack0d7_KjU = (i3 & 16) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1907546552, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExExtraBold24spOr18ssp (Type.kt:1593)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._18ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(jM11366getBlack0d7_KjU, jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExExtraBoldNoSize-OSQ5NHM */
    public final TextStyle m14778artegraSansExExtraBoldNoSizeOSQ5NHM(long j, int i, long j2, float f, long j3, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-620166901);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) == 0 ? f : 0.0f;
        long jM11366getBlack0d7_KjU = (i3 & 16) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-620166901, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExExtraBoldNoSize (Type.kt:1612)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(jM11366getBlack0d7_KjU, jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736222, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExExtraBold40spOr31ssp-OSQ5NHM */
    public final TextStyle m14775artegraSansExExtraBold40spOr31sspOSQ5NHM(long j, int i, long j2, float f, long j3, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(580695977);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) == 0 ? f : 0.0f;
        long jM11366getBlack0d7_KjU = (i3 & 16) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(580695977, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExExtraBold40spOr31ssp (Type.kt:1630)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._31ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(jM11366getBlack0d7_KjU, jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: artegraSansExExtraBold52spOr40ssp-67j0QOw */
    public final TextStyle m14776artegraSansExExtraBold52spOr40ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1521397039);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1521397039, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.artegraSansExExtraBold52spOr40ssp (Type.kt:1648)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._40ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_extra_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratMedium13SpOr10ssp-67j0QOw */
    public final TextStyle m14835montserratMedium13SpOr10ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1471782848);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1471782848, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratMedium13SpOr10ssp (Type.kt:1666)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._10ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerRegularCustomSp-bl3sdaw */
    public final TextStyle m14876mullerRegularCustomSpbl3sdaw(@DimenRes int i, long j, int i2, long j2, float f, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-1317157355);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1317157355, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerRegularCustomSp (Type.kt:1685)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerRegular10sp7ssp-67j0QOw */
    public final TextStyle m14874mullerRegular10sp7ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(854233297);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(854233297, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerRegular10sp7ssp (Type.kt:1703)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._7ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerRegular11sp8ssp-67j0QOw */
    public final TextStyle m14875mullerRegular11sp8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(897461553);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(897461553, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerRegular11sp8ssp (Type.kt:1721)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerBoldCustomSp-bl3sdaw */
    public final TextStyle m14873mullerBoldCustomSpbl3sdaw(@DimenRes int i, long j, int i2, long j2, float f, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1424795110);
        long jM11377getWhite0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i2;
        long jOffset = (i4 & 8) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i4 & 16) == 0 ? f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1424795110, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerBoldCustomSp (Type.kt:1740)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerBold12sp9ssp-67j0QOw */
    public final TextStyle m14866mullerBold12sp9ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1388103198);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388103198, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerBold12sp9ssp (Type.kt:1758)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._9ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerBold13sp10ssp-67j0QOw */
    public final TextStyle m14867mullerBold13sp10ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1224537301);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1224537301, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerBold13sp10ssp (Type.kt:1776)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._10ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerBold14sp11ssp-67j0QOw */
    public final TextStyle m14868mullerBold14sp11ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-599566377);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-599566377, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerBold14sp11ssp (Type.kt:1794)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._11ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerBold7ssp-67j0QOw */
    public final TextStyle m14872mullerBold7ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1767671646);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767671646, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerBold7ssp (Type.kt:1812)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._7ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerBold16spOr12ssp-67j0QOw */
    public final TextStyle m14869mullerBold16spOr12ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(2145739805);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(0.0f, 0.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2145739805, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerBold16spOr12ssp (Type.kt:1830)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._12ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerBold23spOr18ssp-67j0QOw */
    public final TextStyle m14870mullerBold23spOr18ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1880294079);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880294079, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerBold23spOr18ssp (Type.kt:1849)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._18ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratRegular9ssp-67j0QOw */
    public final TextStyle m14847montserratRegular9ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1802327527);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1802327527, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratRegular9ssp (Type.kt:1867)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._9ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratRegular10sp8ssp-67j0QOw */
    public final TextStyle m14844montserratRegular10sp8ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2037817750);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2037817750, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratRegular10sp8ssp (Type.kt:1885)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold9ssp-67j0QOw */
    public final TextStyle m14810montserratBold9ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1352393208);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1352393208, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold9ssp (Type.kt:1903)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._9ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: mullerBold30ssp-67j0QOw */
    public final TextStyle m14871mullerBold30ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(245109524);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(4.0f, 4.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245109524, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.mullerBold30ssp (Type.kt:1921)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._30ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold18ssp-67j0QOw */
    public final TextStyle m14797montserratBold18ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(2098427446);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(3.0f, 3.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098427446, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold18ssp (Type.kt:1939)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._18ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold42spOr32ssp-67j0QOw */
    public final TextStyle m14801montserratBold42spOr32ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1800160756);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(3.0f, 3.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1800160756, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold42spOr32ssp (Type.kt:1957)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._32ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratBold55spOr42ssp-67j0QOw */
    public final TextStyle m14802montserratBold55spOr42ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-112132467);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(3.0f, 3.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-112132467, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratBold55spOr42ssp (Type.kt:1975)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._42ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBoldItalic24spOr18ssp-RHzUZ70 */
    public final TextStyle m14829montserratExtraBoldItalic24spOr18sspRHzUZ70(long j, int i, long j2, float f, @Nullable DrawStyle drawStyle, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-145114557);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(3.0f, 3.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        DrawStyle drawStyle2 = (i3 & 16) != 0 ? null : drawStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-145114557, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBoldItalic24spOr18ssp (Type.kt:1994)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._18ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold_italic, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), drawStyle2, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16719836, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratExtraBoldItalic25spOr19ssp-RHzUZ70 */
    public final TextStyle m14830montserratExtraBoldItalic25spOr19sspRHzUZ70(long j, int i, long j2, float f, @Nullable DrawStyle drawStyle, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1376634501);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(3.0f, 3.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        DrawStyle drawStyle2 = (i3 & 16) != 0 ? null : drawStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376634501, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratExtraBoldItalic25spOr19ssp (Type.kt:2014)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._19ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_extra_bold_italic, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), drawStyle2, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16719836, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: montserratSemiBold16spOr13ssp-67j0QOw */
    public final TextStyle m14854montserratSemiBold16spOr13ssp67j0QOw(long j, int i, long j2, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(347958084);
        long jM11377getWhite0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13563getStarte0LSkKk = (i3 & 2) != 0 ? TextAlign.INSTANCE.m13563getStarte0LSkKk() : i;
        long jOffset = (i3 & 4) != 0 ? OffsetKt.Offset(1.0f, 1.0f) : j2;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(347958084, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.montserratSemiBold16spOr13ssp (Type.kt:2033)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._13ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jOffset, f2, null), (DrawStyle) null, iM13563getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: uaOrByFont-bl3sdaw */
    public final TextStyle m14879uaOrByFontbl3sdaw(@DimenRes int i, long j, int i2, long j2, float f, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(3223257);
        long jM11366getBlack0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j;
        int iM13558getCentere0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13558getCentere0LSkKk() : i2;
        long jM11115getZeroF1C5BW0 = (i4 & 8) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i4 & 16) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(3223257, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.uaOrByFont (Type.kt:2053)");
        }
        TextStyle textStyle = new TextStyle(jM11366getBlack0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.ua_font, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13558getCentere0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16736220, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: ruOrKzFont-sMvkAmo */
    public final TextStyle m14878ruOrKzFontsMvkAmo(@DimenRes int i, long j, int i2, @Nullable BaselineShift baselineShift, long j2, float f, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-754043111);
        long jM11366getBlack0d7_KjU = (i4 & 2) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j;
        int iM13558getCentere0LSkKk = (i4 & 4) != 0 ? TextAlign.INSTANCE.m13558getCentere0LSkKk() : i2;
        BaselineShift baselineShift2 = (i4 & 8) != 0 ? null : baselineShift;
        long jM11115getZeroF1C5BW0 = (i4 & 16) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i4 & 32) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-754043111, i3, -1, "com.blackhub.bronline.game.theme.TypographyStyle.ruOrKzFont (Type.kt:2073)");
        }
        TextStyle textStyle = new TextStyle(jM11366getBlack0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i3 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.plate, null, 0, 0, 14, null)), (String) null, 0L, baselineShift2, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13558getCentere0LSkKk, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16735964, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: downcomeCustomSp-cv9FZhg */
    public final TextStyle m14784downcomeCustomSpcv9FZhg(@DimenRes int i, long j, int i2, long j2, float f, @DimenRes int i3, @Nullable Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-180189155);
        long jM11377getWhite0d7_KjU = (i5 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13558getCentere0LSkKk = (i5 & 4) != 0 ? TextAlign.INSTANCE.m13558getCentere0LSkKk() : i2;
        long jM11115getZeroF1C5BW0 = (i5 & 8) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i5 & 16) != 0 ? 0.0f : f;
        int i6 = (i5 & 32) != 0 ? R.dimen._25wsp : i3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180189155, i4, -1, "com.blackhub.bronline.game.theme.TypographyStyle.downcomeCustomSp (Type.kt:2094)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i4 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.downcome, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13558getCentere0LSkKk, 0, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i6, composer, (i4 >> 15) & 14)), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16605148, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: jollyLodgerCyrillicCustomSp-cv9FZhg */
    public final TextStyle m14785jollyLodgerCyrillicCustomSpcv9FZhg(@DimenRes int i, long j, int i2, long j2, float f, @DimenRes int i3, @Nullable Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-391757935);
        long jM11377getWhite0d7_KjU = (i5 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        int iM13558getCentere0LSkKk = (i5 & 4) != 0 ? TextAlign.INSTANCE.m13558getCentere0LSkKk() : i2;
        long jM11115getZeroF1C5BW0 = (i5 & 8) != 0 ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j2;
        float f2 = (i5 & 16) != 0 ? 0.0f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-391757935, i4, -1, "com.blackhub.bronline.game.theme.TypographyStyle.jollyLodgerCyrillicCustomSp (Type.kt:2115)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i4 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.jolly_lodger_cyrillic, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(Color.INSTANCE.m11366getBlack0d7_KjU(), jM11115getZeroF1C5BW0, f2, null), (DrawStyle) null, iM13558getCentere0LSkKk, 0, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i3, composer, (i4 >> 15) & 14)), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16605148, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    @Composable
    @NotNull
    /* renamed from: defaultFontWithoutFontFamily-iJQMabo */
    public final TextStyle m14783defaultFontWithoutFontFamilyiJQMabo(@DimenRes int i, long j, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1716795534);
        long jM11377getWhite0d7_KjU = (i3 & 2) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1716795534, i2, -1, "com.blackhub.bronline.game.theme.TypographyStyle.defaultFontWithoutFontFamily (Type.kt:2132)");
        }
        TextStyle textStyle = new TextStyle(jM11377getWhite0d7_KjU, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(i, composer, i2 & 14)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }
}
