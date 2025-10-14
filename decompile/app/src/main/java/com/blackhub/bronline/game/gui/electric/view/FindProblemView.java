package com.blackhub.bronline.game.gui.electric.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.draganddrop.ViewTouchResultListener;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import com.bless.client.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FindProblemView.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010 \u0001\u001a\u00030¡\u00012\b\u0010¢\u0001\u001a\u00030£\u0001H\u0002J\u0014\u0010¤\u0001\u001a\u00030¡\u00012\b\u0010¢\u0001\u001a\u00030£\u0001H\u0002J\u0014\u0010¥\u0001\u001a\u00030¡\u00012\b\u0010¢\u0001\u001a\u00030£\u0001H\u0002J\n\u0010¦\u0001\u001a\u00030¡\u0001H\u0002J\n\u0010§\u0001\u001a\u00030¡\u0001H\u0002J\u0014\u0010¨\u0001\u001a\u00030©\u00012\b\u0010ª\u0001\u001a\u00030©\u0001H\u0002J\u0014\u0010«\u0001\u001a\u00030©\u00012\b\u0010ª\u0001\u001a\u00030©\u0001H\u0002J\u0014\u0010¬\u0001\u001a\u00030¡\u00012\b\u0010¢\u0001\u001a\u00030£\u0001H\u0014J.\u0010\u00ad\u0001\u001a\u00030¡\u00012\u0007\u0010®\u0001\u001a\u00020\t2\u0007\u0010¯\u0001\u001a\u00020\t2\u0007\u0010°\u0001\u001a\u00020\t2\u0007\u0010±\u0001\u001a\u00020\tH\u0014J\u0015\u0010²\u0001\u001a\u00020[2\n\u0010³\u0001\u001a\u0005\u0018\u00010´\u0001H\u0017J\n\u0010µ\u0001\u001a\u00030¡\u0001H\u0002J\n\u0010¶\u0001\u001a\u00030¡\u0001H\u0002J\u0012\u0010·\u0001\u001a\u00030¡\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001J\n\u0010¸\u0001\u001a\u00030¡\u0001H\u0002J\n\u0010¹\u0001\u001a\u00030¡\u0001H\u0002R\u0014\u0010\u000b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001a\u0010*\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010-\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\u0011\u00100\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0012R\u001b\u00102\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0018\u001a\u0004\b3\u0010\u0016R\u001b\u00105\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0018\u001a\u0004\b6\u0010\u0016R\u000e\u00108\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\u001a\u0010<\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\u001a\u0010?\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R\u001a\u0010B\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R\u001a\u0010E\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010$\"\u0004\bG\u0010&R\u001a\u0010H\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&R\u001a\u0010K\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010$\"\u0004\bM\u0010&R\u001a\u0010N\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R\u001a\u0010Q\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010$\"\u0004\bS\u0010&R\u001a\u0010T\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010$\"\u0004\bV\u0010&R\u001a\u0010W\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010$\"\u0004\bY\u0010&R\u001a\u0010Z\u001a\u00020[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\\\"\u0004\b]\u0010^R\u001a\u0010_\u001a\u00020[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\\\"\u0004\b`\u0010^R\u001a\u0010a\u001a\u00020[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\\\"\u0004\bb\u0010^R\u001a\u0010c\u001a\u00020[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\\\"\u0004\bd\u0010^R\u001a\u0010e\u001a\u00020[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\\\"\u0004\bf\u0010^R\u001a\u0010g\u001a\u00020[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\\\"\u0004\bh\u0010^R\u001a\u0010i\u001a\u00020[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\\\"\u0004\bj\u0010^R\u001a\u0010k\u001a\u00020[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\\\"\u0004\bl\u0010^R\u000e\u0010m\u001a\u00020nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020qX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010t\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010$\"\u0004\bv\u0010&R\u001a\u0010w\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010$\"\u0004\by\u0010&R\u001a\u0010z\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010$\"\u0004\b|\u0010&R\u001a\u0010}\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010$\"\u0004\b\u007f\u0010&R\u001d\u0010\u0080\u0001\u001a\u00020\"X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010$\"\u0005\b\u0082\u0001\u0010&R\u001d\u0010\u0083\u0001\u001a\u00020\"X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010$\"\u0005\b\u0085\u0001\u0010&R\u001d\u0010\u0086\u0001\u001a\u00020\"X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010$\"\u0005\b\u0088\u0001\u0010&R\u0012\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u008c\u0001\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0018\u001a\u0005\b\u008d\u0001\u0010\u0016R\u000f\u0010\u008f\u0001\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0090\u0001\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0018\u001a\u0005\b\u0091\u0001\u0010\u0016R\u000f\u0010\u0093\u0001\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0094\u0001\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0018\u001a\u0005\b\u0095\u0001\u0010\u0016R\u000f\u0010\u0097\u0001\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0098\u0001\u001a\u00020\u0010¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010\u0012R\u001e\u0010\u009a\u0001\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0018\u001a\u0005\b\u009b\u0001\u0010\u0016R\u001e\u0010\u009d\u0001\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0018\u001a\u0005\b\u009e\u0001\u0010\u0016¨\u0006º\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/view/FindProblemView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "elevationBlackPoint", "getElevationBlackPoint", "()I", "errorTouch", "fuseBlackBitmap", "Landroid/graphics/Bitmap;", "getFuseBlackBitmap", "()Landroid/graphics/Bitmap;", "fuseFourMatrix", "Landroid/graphics/Matrix;", "getFuseFourMatrix", "()Landroid/graphics/Matrix;", "fuseFourMatrix$delegate", "Lkotlin/Lazy;", "fuseGrayBitmap", "getFuseGrayBitmap", "fuseHeightCenter", "fuseOneMatrix", "getFuseOneMatrix", "fuseOneMatrix$delegate", "fusePaint", "Landroid/graphics/Paint;", "fusePointFour", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/PointFloat;", "getFusePointFour", "()Lcom/blackhub/bronline/game/core/utils/draganddrop/model/PointFloat;", "setFusePointFour", "(Lcom/blackhub/bronline/game/core/utils/draganddrop/model/PointFloat;)V", "fusePointOne", "getFusePointOne", "setFusePointOne", "fusePointThree", "getFusePointThree", "setFusePointThree", "fusePointTwo", "getFusePointTwo", "setFusePointTwo", "fuseRedBitmap", "getFuseRedBitmap", "fuseThreeMatrix", "getFuseThreeMatrix", "fuseThreeMatrix$delegate", "fuseTwoMatrix", "getFuseTwoMatrix", "fuseTwoMatrix$delegate", "fuseWidthCenter", "globalFusePointFour", "getGlobalFusePointFour", "setGlobalFusePointFour", "globalFusePointOne", "getGlobalFusePointOne", "setGlobalFusePointOne", "globalFusePointThree", "getGlobalFusePointThree", "setGlobalFusePointThree", "globalFusePointTwo", "getGlobalFusePointTwo", "setGlobalFusePointTwo", "globalVoltagePointFiveCenter", "getGlobalVoltagePointFiveCenter", "setGlobalVoltagePointFiveCenter", "globalVoltagePointFourCenter", "getGlobalVoltagePointFourCenter", "setGlobalVoltagePointFourCenter", "globalVoltagePointOneCenter", "getGlobalVoltagePointOneCenter", "setGlobalVoltagePointOneCenter", "globalVoltagePointSevenCenter", "getGlobalVoltagePointSevenCenter", "setGlobalVoltagePointSevenCenter", "globalVoltagePointSixCenter", "getGlobalVoltagePointSixCenter", "setGlobalVoltagePointSixCenter", "globalVoltagePointThreeCenter", "getGlobalVoltagePointThreeCenter", "setGlobalVoltagePointThreeCenter", "globalVoltagePointTwoCenter", "getGlobalVoltagePointTwoCenter", "setGlobalVoltagePointTwoCenter", "isFuseGrayFourVisible", "", "()Z", "setFuseGrayFourVisible", "(Z)V", "isFuseGrayOneVisible", "setFuseGrayOneVisible", "isFuseGrayThreeVisible", "setFuseGrayThreeVisible", "isFuseGrayTwoVisible", "setFuseGrayTwoVisible", "isFuseRedFourVisible", "setFuseRedFourVisible", "isFuseRedOneVisible", "setFuseRedOneVisible", "isFuseRedThreeVisible", "setFuseRedThreeVisible", "isFuseRedTwoVisible", "setFuseRedTwoVisible", "lineDashPathEffect", "Landroid/graphics/DashPathEffect;", "linePaint", "linePath", "Landroid/graphics/Path;", "parentHeight", "parentWidth", "pointFive", "getPointFive", "setPointFive", "pointFour", "getPointFour", "setPointFour", "pointOne", "getPointOne", "setPointOne", "pointSeven", "getPointSeven", "setPointSeven", "pointSix", "getPointSix", "setPointSix", "pointThree", "getPointThree", "setPointThree", "pointTwo", "getPointTwo", "setPointTwo", "viewTouchResultListener", "Lcom/blackhub/bronline/game/core/utils/draganddrop/ViewTouchResultListener;", "voltagePointBlackBitmap", "voltagePointBlackMatrix", "getVoltagePointBlackMatrix", "voltagePointBlackMatrix$delegate", "voltagePointCenter", "voltagePointFourMatrix", "getVoltagePointFourMatrix", "voltagePointFourMatrix$delegate", "voltagePointGreyBitmap", "voltagePointOneMatrix", "getVoltagePointOneMatrix", "voltagePointOneMatrix$delegate", "voltagePointPaint", "voltagePointRedBitmap", "getVoltagePointRedBitmap", "voltagePointThreeMatrix", "getVoltagePointThreeMatrix", "voltagePointThreeMatrix$delegate", "voltagePointTwoMatrix", "getVoltagePointTwoMatrix", "voltagePointTwoMatrix$delegate", "drawFuse", "", "canvas", "Landroid/graphics/Canvas;", "drawLine", "drawVoltagePoint", "getFusePoint", "getPercentPoint", "getPercentX", "", "percent", "getPercentY", "onDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setFuseMatrix", "setGlobalPoint", "setTouchResultListener", "setVoltagePointBlack", "setVoltagePointRed", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class FindProblemView extends View {
    public static final int $stable = 8;
    public final int elevationBlackPoint;
    public final int errorTouch;

    @NotNull
    public final Bitmap fuseBlackBitmap;

    /* renamed from: fuseFourMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fuseFourMatrix;

    @NotNull
    public final Bitmap fuseGrayBitmap;
    public int fuseHeightCenter;

    /* renamed from: fuseOneMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fuseOneMatrix;

    @NotNull
    public final Paint fusePaint;

    @NotNull
    public PointFloat fusePointFour;

    @NotNull
    public PointFloat fusePointOne;

    @NotNull
    public PointFloat fusePointThree;

    @NotNull
    public PointFloat fusePointTwo;

    @NotNull
    public final Bitmap fuseRedBitmap;

    /* renamed from: fuseThreeMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fuseThreeMatrix;

    /* renamed from: fuseTwoMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fuseTwoMatrix;
    public int fuseWidthCenter;

    @NotNull
    public PointFloat globalFusePointFour;

    @NotNull
    public PointFloat globalFusePointOne;

    @NotNull
    public PointFloat globalFusePointThree;

    @NotNull
    public PointFloat globalFusePointTwo;

    @NotNull
    public PointFloat globalVoltagePointFiveCenter;

    @NotNull
    public PointFloat globalVoltagePointFourCenter;

    @NotNull
    public PointFloat globalVoltagePointOneCenter;

    @NotNull
    public PointFloat globalVoltagePointSevenCenter;

    @NotNull
    public PointFloat globalVoltagePointSixCenter;

    @NotNull
    public PointFloat globalVoltagePointThreeCenter;

    @NotNull
    public PointFloat globalVoltagePointTwoCenter;
    public boolean isFuseGrayFourVisible;
    public boolean isFuseGrayOneVisible;
    public boolean isFuseGrayThreeVisible;
    public boolean isFuseGrayTwoVisible;
    public boolean isFuseRedFourVisible;
    public boolean isFuseRedOneVisible;
    public boolean isFuseRedThreeVisible;
    public boolean isFuseRedTwoVisible;

    @NotNull
    public DashPathEffect lineDashPathEffect;

    @NotNull
    public final Paint linePaint;

    @NotNull
    public final Path linePath;
    public int parentHeight;
    public int parentWidth;

    @NotNull
    public PointFloat pointFive;

    @NotNull
    public PointFloat pointFour;

    @NotNull
    public PointFloat pointOne;

    @NotNull
    public PointFloat pointSeven;

    @NotNull
    public PointFloat pointSix;

    @NotNull
    public PointFloat pointThree;

    @NotNull
    public PointFloat pointTwo;

    @Nullable
    public ViewTouchResultListener viewTouchResultListener;

    @NotNull
    public final Bitmap voltagePointBlackBitmap;

    /* renamed from: voltagePointBlackMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy voltagePointBlackMatrix;
    public int voltagePointCenter;

    /* renamed from: voltagePointFourMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy voltagePointFourMatrix;

    @NotNull
    public final Bitmap voltagePointGreyBitmap;

    /* renamed from: voltagePointOneMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy voltagePointOneMatrix;

    @NotNull
    public final Paint voltagePointPaint;

    @NotNull
    public final Bitmap voltagePointRedBitmap;

    /* renamed from: voltagePointThreeMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy voltagePointThreeMatrix;

    /* renamed from: voltagePointTwoMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy voltagePointTwoMatrix;

    public FindProblemView(@Nullable Context context) throws Resources.NotFoundException {
        super(context);
        this.errorTouch = 50;
        this.voltagePointPaint = new Paint();
        this.fusePaint = new Paint();
        Paint paint = new Paint();
        this.linePaint = paint;
        this.linePath = new Path();
        this.voltagePointBlackMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointBlackMatrix$2.INSTANCE);
        this.voltagePointOneMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointOneMatrix$2.INSTANCE);
        this.voltagePointTwoMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointTwoMatrix$2.INSTANCE);
        this.voltagePointThreeMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointThreeMatrix$2.INSTANCE);
        this.voltagePointFourMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointFourMatrix$2.INSTANCE);
        this.fuseOneMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseOneMatrix$2.INSTANCE);
        this.fuseTwoMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseTwoMatrix$2.INSTANCE);
        this.fuseThreeMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseThreeMatrix$2.INSTANCE);
        this.fuseFourMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseFourMatrix$2.INSTANCE);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.voltagePointGreyBitmap = BitmapUtilsKt.getBitmap(resources, R.drawable.ic_voltage_point_grey);
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        this.voltagePointBlackBitmap = BitmapUtilsKt.getBitmap(resources2, R.drawable.ic_voltage_point_black);
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        Bitmap bitmap = BitmapUtilsKt.getBitmap(resources3, R.drawable.ic_fuse_red);
        this.fuseRedBitmap = bitmap;
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        this.fuseGrayBitmap = BitmapUtilsKt.getBitmap(resources4, R.drawable.ic_fuse_gray);
        Resources resources5 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
        this.fuseBlackBitmap = BitmapUtilsKt.getBitmap(resources5, R.drawable.ic_fuse_black);
        Resources resources6 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
        Bitmap bitmap2 = BitmapUtilsKt.getBitmap(resources6, R.drawable.ic_voltage_point_red);
        this.voltagePointRedBitmap = bitmap2;
        this.elevationBlackPoint = 6;
        this.pointOne = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointTwo = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointThree = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointFour = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointFive = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointSix = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointSeven = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointOneCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointTwoCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointThreeCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointFourCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointFiveCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointSixCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointSevenCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointOne = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointTwo = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointThree = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointFour = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointOne = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointTwo = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointThree = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointFour = new PointFloat(0.0f, 0.0f, 3, null);
        this.isFuseGrayOneVisible = true;
        this.isFuseGrayTwoVisible = true;
        this.isFuseGrayThreeVisible = true;
        this.isFuseGrayFourVisible = true;
        this.isFuseRedOneVisible = true;
        this.isFuseRedTwoVisible = true;
        this.isFuseRedThreeVisible = true;
        this.isFuseRedFourVisible = true;
        float[] fArr = {getResources().getDimension(R.dimen._8sdp), getResources().getDimension(R.dimen._4sdp)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.light_gray_blue));
        paint.setStrokeWidth(getResources().getDimension(R.dimen._2sdp));
        DashPathEffect dashPathEffect = new DashPathEffect(fArr, 0.0f);
        this.lineDashPathEffect = dashPathEffect;
        paint.setPathEffect(dashPathEffect);
        this.voltagePointCenter = bitmap2.getHeight() / 2;
        this.fuseHeightCenter = bitmap.getHeight() / 2;
        this.fuseWidthCenter = bitmap.getWidth() / 2;
    }

    public FindProblemView(@Nullable Context context, @Nullable AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.errorTouch = 50;
        this.voltagePointPaint = new Paint();
        this.fusePaint = new Paint();
        Paint paint = new Paint();
        this.linePaint = paint;
        this.linePath = new Path();
        this.voltagePointBlackMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointBlackMatrix$2.INSTANCE);
        this.voltagePointOneMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointOneMatrix$2.INSTANCE);
        this.voltagePointTwoMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointTwoMatrix$2.INSTANCE);
        this.voltagePointThreeMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointThreeMatrix$2.INSTANCE);
        this.voltagePointFourMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointFourMatrix$2.INSTANCE);
        this.fuseOneMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseOneMatrix$2.INSTANCE);
        this.fuseTwoMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseTwoMatrix$2.INSTANCE);
        this.fuseThreeMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseThreeMatrix$2.INSTANCE);
        this.fuseFourMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseFourMatrix$2.INSTANCE);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.voltagePointGreyBitmap = BitmapUtilsKt.getBitmap(resources, R.drawable.ic_voltage_point_grey);
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        this.voltagePointBlackBitmap = BitmapUtilsKt.getBitmap(resources2, R.drawable.ic_voltage_point_black);
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        Bitmap bitmap = BitmapUtilsKt.getBitmap(resources3, R.drawable.ic_fuse_red);
        this.fuseRedBitmap = bitmap;
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        this.fuseGrayBitmap = BitmapUtilsKt.getBitmap(resources4, R.drawable.ic_fuse_gray);
        Resources resources5 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
        this.fuseBlackBitmap = BitmapUtilsKt.getBitmap(resources5, R.drawable.ic_fuse_black);
        Resources resources6 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
        Bitmap bitmap2 = BitmapUtilsKt.getBitmap(resources6, R.drawable.ic_voltage_point_red);
        this.voltagePointRedBitmap = bitmap2;
        this.elevationBlackPoint = 6;
        this.pointOne = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointTwo = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointThree = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointFour = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointFive = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointSix = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointSeven = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointOneCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointTwoCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointThreeCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointFourCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointFiveCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointSixCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointSevenCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointOne = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointTwo = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointThree = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointFour = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointOne = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointTwo = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointThree = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointFour = new PointFloat(0.0f, 0.0f, 3, null);
        this.isFuseGrayOneVisible = true;
        this.isFuseGrayTwoVisible = true;
        this.isFuseGrayThreeVisible = true;
        this.isFuseGrayFourVisible = true;
        this.isFuseRedOneVisible = true;
        this.isFuseRedTwoVisible = true;
        this.isFuseRedThreeVisible = true;
        this.isFuseRedFourVisible = true;
        float[] fArr = {getResources().getDimension(R.dimen._8sdp), getResources().getDimension(R.dimen._4sdp)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.light_gray_blue));
        paint.setStrokeWidth(getResources().getDimension(R.dimen._2sdp));
        DashPathEffect dashPathEffect = new DashPathEffect(fArr, 0.0f);
        this.lineDashPathEffect = dashPathEffect;
        paint.setPathEffect(dashPathEffect);
        this.voltagePointCenter = bitmap2.getHeight() / 2;
        this.fuseHeightCenter = bitmap.getHeight() / 2;
        this.fuseWidthCenter = bitmap.getWidth() / 2;
    }

    public FindProblemView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.errorTouch = 50;
        this.voltagePointPaint = new Paint();
        this.fusePaint = new Paint();
        Paint paint = new Paint();
        this.linePaint = paint;
        this.linePath = new Path();
        this.voltagePointBlackMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointBlackMatrix$2.INSTANCE);
        this.voltagePointOneMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointOneMatrix$2.INSTANCE);
        this.voltagePointTwoMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointTwoMatrix$2.INSTANCE);
        this.voltagePointThreeMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointThreeMatrix$2.INSTANCE);
        this.voltagePointFourMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$voltagePointFourMatrix$2.INSTANCE);
        this.fuseOneMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseOneMatrix$2.INSTANCE);
        this.fuseTwoMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseTwoMatrix$2.INSTANCE);
        this.fuseThreeMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseThreeMatrix$2.INSTANCE);
        this.fuseFourMatrix = LazyKt__LazyJVMKt.lazy(FindProblemView$fuseFourMatrix$2.INSTANCE);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.voltagePointGreyBitmap = BitmapUtilsKt.getBitmap(resources, R.drawable.ic_voltage_point_grey);
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        this.voltagePointBlackBitmap = BitmapUtilsKt.getBitmap(resources2, R.drawable.ic_voltage_point_black);
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        Bitmap bitmap = BitmapUtilsKt.getBitmap(resources3, R.drawable.ic_fuse_red);
        this.fuseRedBitmap = bitmap;
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        this.fuseGrayBitmap = BitmapUtilsKt.getBitmap(resources4, R.drawable.ic_fuse_gray);
        Resources resources5 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
        this.fuseBlackBitmap = BitmapUtilsKt.getBitmap(resources5, R.drawable.ic_fuse_black);
        Resources resources6 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
        Bitmap bitmap2 = BitmapUtilsKt.getBitmap(resources6, R.drawable.ic_voltage_point_red);
        this.voltagePointRedBitmap = bitmap2;
        this.elevationBlackPoint = 6;
        this.pointOne = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointTwo = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointThree = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointFour = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointFive = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointSix = new PointFloat(0.0f, 0.0f, 3, null);
        this.pointSeven = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointOneCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointTwoCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointThreeCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointFourCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointFiveCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointSixCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalVoltagePointSevenCenter = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointOne = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointTwo = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointThree = new PointFloat(0.0f, 0.0f, 3, null);
        this.fusePointFour = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointOne = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointTwo = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointThree = new PointFloat(0.0f, 0.0f, 3, null);
        this.globalFusePointFour = new PointFloat(0.0f, 0.0f, 3, null);
        this.isFuseGrayOneVisible = true;
        this.isFuseGrayTwoVisible = true;
        this.isFuseGrayThreeVisible = true;
        this.isFuseGrayFourVisible = true;
        this.isFuseRedOneVisible = true;
        this.isFuseRedTwoVisible = true;
        this.isFuseRedThreeVisible = true;
        this.isFuseRedFourVisible = true;
        float[] fArr = {getResources().getDimension(R.dimen._8sdp), getResources().getDimension(R.dimen._4sdp)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.light_gray_blue));
        paint.setStrokeWidth(getResources().getDimension(R.dimen._2sdp));
        DashPathEffect dashPathEffect = new DashPathEffect(fArr, 0.0f);
        this.lineDashPathEffect = dashPathEffect;
        paint.setPathEffect(dashPathEffect);
        this.voltagePointCenter = bitmap2.getHeight() / 2;
        this.fuseHeightCenter = bitmap.getHeight() / 2;
        this.fuseWidthCenter = bitmap.getWidth() / 2;
    }

    private final Matrix getVoltagePointBlackMatrix() {
        return (Matrix) this.voltagePointBlackMatrix.getValue();
    }

    private final Matrix getVoltagePointOneMatrix() {
        return (Matrix) this.voltagePointOneMatrix.getValue();
    }

    private final Matrix getVoltagePointTwoMatrix() {
        return (Matrix) this.voltagePointTwoMatrix.getValue();
    }

    private final Matrix getVoltagePointThreeMatrix() {
        return (Matrix) this.voltagePointThreeMatrix.getValue();
    }

    private final Matrix getVoltagePointFourMatrix() {
        return (Matrix) this.voltagePointFourMatrix.getValue();
    }

    private final Matrix getFuseOneMatrix() {
        return (Matrix) this.fuseOneMatrix.getValue();
    }

    private final Matrix getFuseTwoMatrix() {
        return (Matrix) this.fuseTwoMatrix.getValue();
    }

    private final Matrix getFuseThreeMatrix() {
        return (Matrix) this.fuseThreeMatrix.getValue();
    }

    private final Matrix getFuseFourMatrix() {
        return (Matrix) this.fuseFourMatrix.getValue();
    }

    @NotNull
    public final Bitmap getFuseRedBitmap() {
        return this.fuseRedBitmap;
    }

    @NotNull
    public final Bitmap getFuseGrayBitmap() {
        return this.fuseGrayBitmap;
    }

    @NotNull
    public final Bitmap getFuseBlackBitmap() {
        return this.fuseBlackBitmap;
    }

    @NotNull
    public final Bitmap getVoltagePointRedBitmap() {
        return this.voltagePointRedBitmap;
    }

    public final int getElevationBlackPoint() {
        return this.elevationBlackPoint;
    }

    @NotNull
    public final PointFloat getPointOne() {
        return this.pointOne;
    }

    public final void setPointOne(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.pointOne = pointFloat;
    }

    @NotNull
    public final PointFloat getPointTwo() {
        return this.pointTwo;
    }

    public final void setPointTwo(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.pointTwo = pointFloat;
    }

    @NotNull
    public final PointFloat getPointThree() {
        return this.pointThree;
    }

    public final void setPointThree(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.pointThree = pointFloat;
    }

    @NotNull
    public final PointFloat getPointFour() {
        return this.pointFour;
    }

    public final void setPointFour(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.pointFour = pointFloat;
    }

    @NotNull
    public final PointFloat getPointFive() {
        return this.pointFive;
    }

    public final void setPointFive(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.pointFive = pointFloat;
    }

    @NotNull
    public final PointFloat getPointSix() {
        return this.pointSix;
    }

    public final void setPointSix(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.pointSix = pointFloat;
    }

    @NotNull
    public final PointFloat getPointSeven() {
        return this.pointSeven;
    }

    public final void setPointSeven(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.pointSeven = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalVoltagePointOneCenter() {
        return this.globalVoltagePointOneCenter;
    }

    public final void setGlobalVoltagePointOneCenter(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalVoltagePointOneCenter = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalVoltagePointTwoCenter() {
        return this.globalVoltagePointTwoCenter;
    }

    public final void setGlobalVoltagePointTwoCenter(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalVoltagePointTwoCenter = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalVoltagePointThreeCenter() {
        return this.globalVoltagePointThreeCenter;
    }

    public final void setGlobalVoltagePointThreeCenter(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalVoltagePointThreeCenter = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalVoltagePointFourCenter() {
        return this.globalVoltagePointFourCenter;
    }

    public final void setGlobalVoltagePointFourCenter(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalVoltagePointFourCenter = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalVoltagePointFiveCenter() {
        return this.globalVoltagePointFiveCenter;
    }

    public final void setGlobalVoltagePointFiveCenter(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalVoltagePointFiveCenter = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalVoltagePointSixCenter() {
        return this.globalVoltagePointSixCenter;
    }

    public final void setGlobalVoltagePointSixCenter(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalVoltagePointSixCenter = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalVoltagePointSevenCenter() {
        return this.globalVoltagePointSevenCenter;
    }

    public final void setGlobalVoltagePointSevenCenter(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalVoltagePointSevenCenter = pointFloat;
    }

    @NotNull
    public final PointFloat getFusePointOne() {
        return this.fusePointOne;
    }

    public final void setFusePointOne(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.fusePointOne = pointFloat;
    }

    @NotNull
    public final PointFloat getFusePointTwo() {
        return this.fusePointTwo;
    }

    public final void setFusePointTwo(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.fusePointTwo = pointFloat;
    }

    @NotNull
    public final PointFloat getFusePointThree() {
        return this.fusePointThree;
    }

    public final void setFusePointThree(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.fusePointThree = pointFloat;
    }

    @NotNull
    public final PointFloat getFusePointFour() {
        return this.fusePointFour;
    }

    public final void setFusePointFour(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.fusePointFour = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalFusePointOne() {
        return this.globalFusePointOne;
    }

    public final void setGlobalFusePointOne(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalFusePointOne = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalFusePointTwo() {
        return this.globalFusePointTwo;
    }

    public final void setGlobalFusePointTwo(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalFusePointTwo = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalFusePointThree() {
        return this.globalFusePointThree;
    }

    public final void setGlobalFusePointThree(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalFusePointThree = pointFloat;
    }

    @NotNull
    public final PointFloat getGlobalFusePointFour() {
        return this.globalFusePointFour;
    }

    public final void setGlobalFusePointFour(@NotNull PointFloat pointFloat) {
        Intrinsics.checkNotNullParameter(pointFloat, "<set-?>");
        this.globalFusePointFour = pointFloat;
    }

    /* renamed from: isFuseGrayOneVisible, reason: from getter */
    public final boolean getIsFuseGrayOneVisible() {
        return this.isFuseGrayOneVisible;
    }

    public final void setFuseGrayOneVisible(boolean z) {
        this.isFuseGrayOneVisible = z;
    }

    /* renamed from: isFuseGrayTwoVisible, reason: from getter */
    public final boolean getIsFuseGrayTwoVisible() {
        return this.isFuseGrayTwoVisible;
    }

    public final void setFuseGrayTwoVisible(boolean z) {
        this.isFuseGrayTwoVisible = z;
    }

    /* renamed from: isFuseGrayThreeVisible, reason: from getter */
    public final boolean getIsFuseGrayThreeVisible() {
        return this.isFuseGrayThreeVisible;
    }

    public final void setFuseGrayThreeVisible(boolean z) {
        this.isFuseGrayThreeVisible = z;
    }

    /* renamed from: isFuseGrayFourVisible, reason: from getter */
    public final boolean getIsFuseGrayFourVisible() {
        return this.isFuseGrayFourVisible;
    }

    public final void setFuseGrayFourVisible(boolean z) {
        this.isFuseGrayFourVisible = z;
    }

    /* renamed from: isFuseRedOneVisible, reason: from getter */
    public final boolean getIsFuseRedOneVisible() {
        return this.isFuseRedOneVisible;
    }

    public final void setFuseRedOneVisible(boolean z) {
        this.isFuseRedOneVisible = z;
    }

    /* renamed from: isFuseRedTwoVisible, reason: from getter */
    public final boolean getIsFuseRedTwoVisible() {
        return this.isFuseRedTwoVisible;
    }

    public final void setFuseRedTwoVisible(boolean z) {
        this.isFuseRedTwoVisible = z;
    }

    /* renamed from: isFuseRedThreeVisible, reason: from getter */
    public final boolean getIsFuseRedThreeVisible() {
        return this.isFuseRedThreeVisible;
    }

    public final void setFuseRedThreeVisible(boolean z) {
        this.isFuseRedThreeVisible = z;
    }

    /* renamed from: isFuseRedFourVisible, reason: from getter */
    public final boolean getIsFuseRedFourVisible() {
        return this.isFuseRedFourVisible;
    }

    public final void setFuseRedFourVisible(boolean z) {
        this.isFuseRedFourVisible = z;
    }

    public final float getPercentX(float percent) {
        return (this.parentWidth * percent) - (this.voltagePointGreyBitmap.getWidth() / 2);
    }

    public final float getPercentY(float percent) {
        return (this.parentHeight * percent) - (this.voltagePointGreyBitmap.getHeight() / 2);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        ViewTouchResultListener viewTouchResultListener;
        ViewTouchResultListener viewTouchResultListener2;
        ViewTouchResultListener viewTouchResultListener3;
        ViewTouchResultListener viewTouchResultListener4;
        if (event != null) {
            if (!this.isFuseRedOneVisible) {
                float x = this.fusePointOne.getX() - this.errorTouch;
                float x2 = this.fusePointOne.getX() + this.errorTouch;
                float x3 = event.getX();
                if (x <= x3 && x3 <= x2) {
                    float y = this.fusePointOne.getY() - this.errorTouch;
                    float y2 = this.fusePointOne.getY() + this.errorTouch;
                    float y3 = event.getY();
                    if (y <= y3 && y3 <= y2 && (viewTouchResultListener4 = this.viewTouchResultListener) != null) {
                        viewTouchResultListener4.onTouchResult(CurrentTargetArea.TARGET_AREA_FUSE_ONE);
                    }
                }
            }
            if (!this.isFuseRedTwoVisible) {
                float x4 = this.fusePointTwo.getX() - this.errorTouch;
                float x5 = this.fusePointTwo.getX() + this.errorTouch;
                float x6 = event.getX();
                if (x4 <= x6 && x6 <= x5) {
                    float y4 = this.fusePointTwo.getY() - this.errorTouch;
                    float y5 = this.fusePointTwo.getY() + this.errorTouch;
                    float y6 = event.getY();
                    if (y4 <= y6 && y6 <= y5 && (viewTouchResultListener3 = this.viewTouchResultListener) != null) {
                        viewTouchResultListener3.onTouchResult(CurrentTargetArea.TARGET_AREA_FUSE_TWO);
                    }
                }
            }
            if (!this.isFuseRedThreeVisible) {
                float x7 = this.fusePointThree.getX() - this.errorTouch;
                float x8 = this.fusePointThree.getX() + this.errorTouch;
                float x9 = event.getX();
                if (x7 <= x9 && x9 <= x8) {
                    float y7 = this.fusePointThree.getY() - this.errorTouch;
                    float y8 = this.fusePointThree.getY() + this.errorTouch;
                    float y9 = event.getY();
                    if (y7 <= y9 && y9 <= y8 && (viewTouchResultListener2 = this.viewTouchResultListener) != null) {
                        viewTouchResultListener2.onTouchResult(CurrentTargetArea.TARGET_AREA_FUSE_THREE);
                    }
                }
            }
            if (!this.isFuseRedFourVisible) {
                float x10 = this.fusePointFour.getX() - this.errorTouch;
                float x11 = this.fusePointFour.getX() + this.errorTouch;
                float x12 = event.getX();
                if (x10 <= x12 && x12 <= x11) {
                    float y10 = this.fusePointFour.getY() - this.errorTouch;
                    float y11 = this.fusePointFour.getY() + this.errorTouch;
                    float y12 = event.getY();
                    if (y10 <= y12 && y12 <= y11 && (viewTouchResultListener = this.viewTouchResultListener) != null) {
                        viewTouchResultListener.onTouchResult(CurrentTargetArea.TARGET_AREA_FUSE_FOUR);
                    }
                }
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setTouchResultListener(@NotNull ViewTouchResultListener viewTouchResultListener) {
        Intrinsics.checkNotNullParameter(viewTouchResultListener, "viewTouchResultListener");
        this.viewTouchResultListener = viewTouchResultListener;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.parentWidth = getWidth();
        this.parentHeight = getHeight();
        getPercentPoint();
        getFusePoint();
        setGlobalPoint();
        setVoltagePointBlack();
        setVoltagePointRed();
        setFuseMatrix();
    }

    private final void getPercentPoint() {
        this.pointOne = new PointFloat(getPercentX(0.33f), getPercentY(0.2f));
        this.pointTwo = new PointFloat(getPercentX(0.9f), getPercentY(0.2f));
        this.pointThree = new PointFloat(getPercentX(0.46f), getPercentY(0.46f));
        this.pointFour = new PointFloat(getPercentX(0.64f), getPercentY(0.46f));
        this.pointFive = new PointFloat(getPercentX(0.18f), getPercentY(0.58f));
        this.pointSix = new PointFloat(getPercentX(0.38f), getPercentY(0.74f));
        this.pointSeven = new PointFloat(getPercentX(0.74f), getPercentY(0.74f));
    }

    private final void getFusePoint() {
        float f = 2;
        this.fusePointOne = new PointFloat(this.pointOne.getX() + this.voltagePointCenter, this.pointTwo.getY() + this.voltagePointCenter + ((this.pointThree.getY() - this.pointTwo.getY()) / f));
        this.fusePointTwo = new PointFloat(this.pointFour.getX() + this.voltagePointCenter + ((getPercentX(1.0f) - this.pointFour.getX()) / f), this.pointFour.getY() + this.voltagePointCenter);
        this.fusePointThree = new PointFloat(this.pointFive.getX() + this.voltagePointCenter, this.pointFive.getY() + this.voltagePointCenter + ((getPercentY(1.0f) - this.pointFive.getY()) / f));
        this.fusePointFour = new PointFloat(this.pointSix.getX() + this.voltagePointCenter + ((this.pointSeven.getX() - this.pointSix.getX()) / f), this.pointSeven.getY() + this.voltagePointCenter);
    }

    public final void setGlobalPoint() {
        this.globalVoltagePointOneCenter = ViewExtensionKt.getGlobalPointCustomView(this, this.pointOne.getX(), this.pointOne.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
        this.globalVoltagePointTwoCenter = ViewExtensionKt.getGlobalPointCustomView(this, this.pointTwo.getX(), this.pointTwo.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
        this.globalVoltagePointThreeCenter = ViewExtensionKt.getGlobalPointCustomView(this, this.pointThree.getX(), this.pointThree.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
        this.globalVoltagePointFourCenter = ViewExtensionKt.getGlobalPointCustomView(this, this.pointFour.getX(), this.pointFour.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
        this.globalVoltagePointFiveCenter = ViewExtensionKt.getGlobalPointCustomView(this, this.pointFive.getX(), this.pointFive.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
        this.globalVoltagePointSixCenter = ViewExtensionKt.getGlobalPointCustomView(this, this.pointSix.getX(), this.pointSix.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
        this.globalVoltagePointSevenCenter = ViewExtensionKt.getGlobalPointCustomView(this, this.pointSeven.getX(), this.pointSeven.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
        this.globalFusePointOne = ViewExtensionKt.getGlobalPointCustomView(this, this.fusePointOne.getX(), this.fusePointOne.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
        this.globalFusePointTwo = ViewExtensionKt.getGlobalPointCustomView(this, this.fusePointTwo.getX(), this.fusePointTwo.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
        this.globalFusePointThree = ViewExtensionKt.getGlobalPointCustomView(this, this.fusePointThree.getX(), this.fusePointThree.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
        this.globalFusePointFour = ViewExtensionKt.getGlobalPointCustomView(this, this.fusePointFour.getX(), this.fusePointFour.getY(), this.voltagePointRedBitmap.getWidth() / 2, this.voltagePointRedBitmap.getHeight() / 2);
    }

    public final void setFuseMatrix() {
        getFuseOneMatrix().setTranslate(this.fusePointOne.getX() - this.fuseWidthCenter, this.fusePointOne.getY() - this.fuseHeightCenter);
        Matrix fuseTwoMatrix = getFuseTwoMatrix();
        fuseTwoMatrix.setTranslate(this.fusePointTwo.getX() + this.fuseHeightCenter, this.fusePointTwo.getY() - this.fuseWidthCenter);
        fuseTwoMatrix.preRotate(90.0f);
        getFuseThreeMatrix().setTranslate(this.fusePointThree.getX() - this.fuseWidthCenter, this.fusePointThree.getY() - this.fuseHeightCenter);
        Matrix fuseFourMatrix = getFuseFourMatrix();
        fuseFourMatrix.setTranslate(this.fusePointFour.getX() + this.fuseHeightCenter, this.fusePointFour.getY() - this.fuseWidthCenter);
        fuseFourMatrix.preRotate(90.0f);
    }

    public final void setVoltagePointBlack() {
        getVoltagePointBlackMatrix().setTranslate(this.pointTwo.getX(), this.pointTwo.getY());
    }

    public final void setVoltagePointRed() {
        getVoltagePointOneMatrix().setTranslate(this.pointOne.getX(), this.pointOne.getY());
        getVoltagePointTwoMatrix().setTranslate(this.pointFour.getX(), this.pointFour.getY());
        getVoltagePointThreeMatrix().setTranslate(this.pointFive.getX(), this.pointFive.getY());
        getVoltagePointFourMatrix().setTranslate(this.pointSeven.getX(), this.pointSeven.getY());
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawLine(canvas);
        drawVoltagePoint(canvas);
    }

    public final void drawLine(Canvas canvas) {
        this.linePath.moveTo(0.0f, this.pointOne.getY() + this.voltagePointCenter);
        this.linePath.lineTo(this.pointOne.getX() + this.voltagePointCenter, this.pointOne.getY() + this.voltagePointCenter);
        this.linePath.lineTo(this.pointOne.getX() + this.voltagePointCenter, this.pointThree.getY() + this.voltagePointCenter);
        this.linePath.lineTo(this.pointThree.getX() + this.voltagePointCenter, this.pointThree.getY() + this.voltagePointCenter);
        this.linePath.lineTo(this.pointThree.getX() + this.voltagePointCenter, 0.0f);
        this.linePath.moveTo(this.pointFour.getX() + this.voltagePointCenter, 0.0f);
        this.linePath.lineTo(this.pointFour.getX() + this.voltagePointCenter, this.pointFour.getY() + this.voltagePointCenter);
        this.linePath.lineTo(getPercentX(this.voltagePointCenter + 1.0f), this.pointFour.getY() + this.voltagePointCenter);
        this.linePath.moveTo(0.0f, this.pointFive.getY() + this.voltagePointCenter);
        this.linePath.lineTo(this.pointFive.getX() + this.voltagePointCenter, this.pointFive.getY() + this.voltagePointCenter);
        this.linePath.lineTo(this.pointFive.getX() + this.voltagePointCenter, getPercentY(1.0f) + this.voltagePointCenter);
        this.linePath.moveTo(this.pointSix.getX() + this.voltagePointCenter, getPercentY(1.0f) + this.voltagePointCenter);
        this.linePath.lineTo(this.pointSix.getX() + this.voltagePointCenter, this.pointSix.getY() + this.voltagePointCenter);
        this.linePath.lineTo(this.pointSeven.getX() + this.voltagePointCenter, this.pointSeven.getY() + this.voltagePointCenter);
        this.linePath.lineTo(this.pointSeven.getX() + this.voltagePointCenter, getPercentY(1.0f) + this.voltagePointCenter);
        canvas.drawPath(this.linePath, this.linePaint);
    }

    public final void drawFuse(Canvas canvas) {
        canvas.drawBitmap(this.fuseBlackBitmap, getFuseOneMatrix(), this.fusePaint);
        if (this.isFuseGrayOneVisible) {
            canvas.drawBitmap(this.fuseGrayBitmap, getFuseOneMatrix(), this.fusePaint);
        }
        if (this.isFuseRedOneVisible) {
            canvas.drawBitmap(this.fuseRedBitmap, getFuseOneMatrix(), this.fusePaint);
        }
        canvas.drawBitmap(this.fuseBlackBitmap, getFuseTwoMatrix(), this.fusePaint);
        if (this.isFuseGrayTwoVisible) {
            canvas.drawBitmap(this.fuseGrayBitmap, getFuseTwoMatrix(), this.fusePaint);
        }
        if (this.isFuseRedTwoVisible) {
            canvas.drawBitmap(this.fuseRedBitmap, getFuseTwoMatrix(), this.fusePaint);
        }
        canvas.drawBitmap(this.fuseBlackBitmap, getFuseThreeMatrix(), this.fusePaint);
        if (this.isFuseGrayThreeVisible) {
            canvas.drawBitmap(this.fuseGrayBitmap, getFuseThreeMatrix(), this.fusePaint);
        }
        if (this.isFuseRedThreeVisible) {
            canvas.drawBitmap(this.fuseRedBitmap, getFuseThreeMatrix(), this.fusePaint);
        }
        canvas.drawBitmap(this.fuseBlackBitmap, getFuseFourMatrix(), this.fusePaint);
        if (this.isFuseGrayFourVisible) {
            canvas.drawBitmap(this.fuseGrayBitmap, getFuseFourMatrix(), this.fusePaint);
        }
        if (this.isFuseRedFourVisible) {
            canvas.drawBitmap(this.fuseRedBitmap, getFuseFourMatrix(), this.fusePaint);
        }
    }

    public final void drawVoltagePoint(Canvas canvas) {
        canvas.drawBitmap(this.voltagePointGreyBitmap, this.pointThree.getX(), this.pointThree.getY(), this.voltagePointPaint);
        canvas.drawBitmap(this.voltagePointGreyBitmap, this.pointSix.getX(), this.pointSix.getY(), this.voltagePointPaint);
    }
}
