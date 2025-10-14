package com.blackhub.bronline.game.core.extension;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.Group;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewbinding.ViewBinding;
import coil.Coil;
import coil.ImageLoader;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.target.Target;
import com.blackhub.bronline.game.core.utils.AnimatedOnClickListener;
import com.blackhub.bronline.game.core.utils.DebouncedAndAnimatedOnClickListener;
import com.blackhub.bronline.game.core.utils.DebouncedOnClickListener;
import com.blackhub.bronline.game.core.utils.ViewDragShadowBuilder;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.PointViewListenerEnum;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDragAndDrop;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewExtension.kt */
@SourceDebugExtension({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Extensions.kt\ncoil/-SingletonExtensions\n+ 5 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,280:1\n338#2:281\n347#2:282\n356#2:283\n365#2:284\n13330#3,2:285\n54#4,3:287\n24#4:290\n59#4,6:291\n24#4:306\n845#5,9:297\n*S KotlinDebug\n*F\n+ 1 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n117#1:281\n118#1:282\n119#1:283\n120#1:284\n127#1:285,2\n260#1:287,3\n260#1:290\n260#1:291,6\n268#1:306\n273#1:297,9\n*E\n"})

public final class ViewExtensionKt {

    /* compiled from: ViewExtension.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointViewListenerEnum.values().length];
            try {
                iArr[PointViewListenerEnum.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointViewListenerEnum.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointViewListenerEnum.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointViewListenerEnum.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PointViewListenerEnum.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T extends ViewBinding> void invoke(@NotNull T t, @NotNull Function1<? super T, Unit> binding) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        binding.invoke(t);
    }

    public static final <T extends View> void invoke(@NotNull T t, @NotNull Function1<? super T, Unit> binding) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        binding.invoke(t);
    }

    @NotNull
    public static final Point getSizeWithScaleAndRotate(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        double radians = Math.toRadians(view.getRotation());
        int width = (int) (view.getWidth() * view.getScaleX());
        int height = (int) (view.getHeight() * view.getScaleY());
        double dAbs = Math.abs(Math.sin(radians));
        double dAbs2 = Math.abs(Math.cos(radians));
        double d = width;
        double d2 = height;
        return new Point((int) ((d * dAbs2) + (d2 * dAbs)), (int) ((d * dAbs) + (d2 * dAbs2)));
    }

    /* compiled from: ViewExtension.kt */
    @Metadata(m7104d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m7105d2 = {"com/blackhub/bronline/game/core/extension/ViewExtensionKt$setOnDebounceClickListener$1", "Lcom/blackhub/bronline/game/core/utils/DebouncedOnClickListener;", "onDebouncedClick", "", "v", "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.extension.ViewExtensionKt$setOnDebounceClickListener$1 */
    public static final class C35401 extends DebouncedOnClickListener {
        public final /* synthetic */ View.OnClickListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35401(long j, View.OnClickListener onClickListener) {
            super(j);
            onClickListener = onClickListener;
        }

        @Override // com.blackhub.bronline.game.core.utils.DebouncedOnClickListener
        public void onDebouncedClick(@Nullable View v) {
            View.OnClickListener onClickListener = onClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(v);
            }
        }
    }

    public static /* synthetic */ void setOnDebounceClickListener$default(View view, long j, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        setOnDebounceClickListener(view, j, onClickListener);
    }

    public static final void setOnDebounceClickListener(@NotNull View view, long j, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnClickListener(new DebouncedOnClickListener(j) { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt.setOnDebounceClickListener.1
            public final /* synthetic */ View.OnClickListener $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C35401(long j2, View.OnClickListener onClickListener2) {
                super(j2);
                onClickListener = onClickListener2;
            }

            @Override // com.blackhub.bronline.game.core.utils.DebouncedOnClickListener
            public void onDebouncedClick(@Nullable View v) {
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(v);
                }
            }
        });
    }

    public static /* synthetic */ void setOnDebounceAndAnimateClickListener$default(View view, long j, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        setOnDebounceAndAnimateClickListener(view, j, onClickListener);
    }

    /* compiled from: ViewExtension.kt */
    @Metadata(m7104d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m7105d2 = {"com/blackhub/bronline/game/core/extension/ViewExtensionKt$setOnDebounceAndAnimateClickListener$1", "Lcom/blackhub/bronline/game/core/utils/DebouncedAndAnimatedOnClickListener;", "onDebouncedClick", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.extension.ViewExtensionKt$setOnDebounceAndAnimateClickListener$1 */
    public static final class C35391 extends DebouncedAndAnimatedOnClickListener {
        public final /* synthetic */ View.OnClickListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35391(long j, View.OnClickListener onClickListener) {
            super(j);
            onClickListener = onClickListener;
        }

        @Override // com.blackhub.bronline.game.core.utils.DebouncedAndAnimatedOnClickListener
        public void onDebouncedClick(@Nullable View view) {
            View.OnClickListener onClickListener = onClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public static final void setOnDebounceAndAnimateClickListener(@NotNull View view, long j, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnClickListener(new DebouncedAndAnimatedOnClickListener(j) { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt.setOnDebounceAndAnimateClickListener.1
            public final /* synthetic */ View.OnClickListener $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C35391(long j2, View.OnClickListener onClickListener2) {
                super(j2);
                onClickListener = onClickListener2;
            }

            @Override // com.blackhub.bronline.game.core.utils.DebouncedAndAnimatedOnClickListener
            public void onDebouncedClick(@Nullable View view2) {
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view2);
                }
            }
        });
    }

    /* compiled from: ViewExtension.kt */
    @Metadata(m7104d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m7105d2 = {"com/blackhub/bronline/game/core/extension/ViewExtensionKt$setBeforeAnimateClickListener$1", "Lcom/blackhub/bronline/game/core/utils/AnimatedOnClickListener;", "onAnimateClick", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.extension.ViewExtensionKt$setBeforeAnimateClickListener$1 */
    public static final class C35381 extends AnimatedOnClickListener {
        public final /* synthetic */ View.OnClickListener $listener;

        public C35381(View.OnClickListener onClickListener) {
            onClickListener = onClickListener;
        }

        @Override // com.blackhub.bronline.game.core.utils.AnimatedOnClickListener
        public void onAnimateClick(@Nullable View view) {
            View.OnClickListener onClickListener = onClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public static final void setBeforeAnimateClickListener(@NotNull View view, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnClickListener(new AnimatedOnClickListener() { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt.setBeforeAnimateClickListener.1
            public final /* synthetic */ View.OnClickListener $listener;

            public C35381(View.OnClickListener onClickListener2) {
                onClickListener = onClickListener2;
            }

            @Override // com.blackhub.bronline.game.core.utils.AnimatedOnClickListener
            public void onAnimateClick(@Nullable View view2) {
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view2);
                }
            }
        });
    }

    @NotNull
    public static final Point getStartLocationViewOnScreen(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    @NotNull
    public static final PointFloat getStartLocationViewInWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getLocationInWindow(new int[2]);
        return new PointFloat(ArraysKt___ArraysKt.first(r0), ArraysKt___ArraysKt.last(r0));
    }

    /* compiled from: ViewExtension.kt */
    @Metadata(m7104d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m7105d2 = {"com/blackhub/bronline/game/core/extension/ViewExtensionKt$addViewObserver$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.extension.ViewExtensionKt$addViewObserver$1 */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC35351 implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ Function0<Unit> $function;
        public final /* synthetic */ View $view;

        public ViewTreeObserverOnGlobalLayoutListenerC35351(View view, Function0<Unit> function0) {
            view = view;
            function0 = function0;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            function0.invoke();
        }
    }

    public static final void addViewObserver(@NotNull View view, @NotNull Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt.addViewObserver.1
            public final /* synthetic */ Function0<Unit> $function;
            public final /* synthetic */ View $view;

            public ViewTreeObserverOnGlobalLayoutListenerC35351(View view2, Function0<Unit> function2) {
                view = view2;
                function0 = function2;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                function0.invoke();
            }
        });
    }

    public static final void setMargins(@NotNull View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void animateAlphaForAll(@NotNull Group group, float f) {
        Intrinsics.checkNotNullParameter(group, "<this>");
        int[] referencedIds = group.getReferencedIds();
        Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
        for (int i : referencedIds) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = group.getRootView().findViewById(i).animate();
            viewPropertyAnimatorAnimate.setDuration(200L);
            viewPropertyAnimatorAnimate.alpha(f);
        }
    }

    public static /* synthetic */ Point getPositionListener$default(View view, PointViewListenerEnum pointViewListenerEnum, int i, Object obj) {
        if ((i & 1) != 0) {
            pointViewListenerEnum = PointViewListenerEnum.CENTER;
        }
        return getPositionListener(view, pointViewListenerEnum);
    }

    @NotNull
    public static final Point getPositionListener(@NotNull View view, @Nullable PointViewListenerEnum pointViewListenerEnum) {
        Point point;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getHeight();
        view.getScaleY();
        view.getWidth();
        view.getScaleX();
        int x = (int) view.getX();
        int y = (int) view.getY();
        int i = pointViewListenerEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pointViewListenerEnum.ordinal()];
        if (i == 1) {
            return new Point(x, y);
        }
        if (i == 2) {
            point = new Point(x + (view.getWidth() / 2), y);
        } else if (i == 3) {
            point = new Point(x + (view.getWidth() / 2), y + (view.getHeight() / 2));
        } else if (i == 4) {
            point = new Point(x, y + view.getHeight());
        } else if (i == 5) {
            point = new Point(x + view.getWidth(), y + view.getHeight());
        } else {
            return new Point();
        }
        return point;
    }

    public static /* synthetic */ void setDragAndDrop$default(View view, DataDragAndDrop dataDragAndDrop, int i, Object obj) {
        if ((i & 1) != 0) {
            dataDragAndDrop = new DataDragAndDrop(0.0f, 0.0f, 0, 7, null);
        }
        setDragAndDrop(view, dataDragAndDrop);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static final void setDragAndDrop(@NotNull final View view, @NotNull final DataDragAndDrop data) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ViewExtensionKt.setDragAndDrop$lambda$3(data, view, view2, motionEvent);
            }
        });
    }

    public static final boolean setDragAndDrop$lambda$3(DataDragAndDrop data, View this_setDragAndDrop, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this_setDragAndDrop, "$this_setDragAndDrop");
        int action = motionEvent.getAction();
        if (action != 0) {
            return action == 1 || action == 2 || action == 3 || action == 5 || action == 6 || action == 11;
        }
        view.setRotation(data.getNewRotate());
        view.setScaleX(data.getNewScale());
        view.setScaleY(data.getNewScale());
        Intrinsics.checkNotNull(view);
        view.startDragAndDrop(ClipData.newPlainText(AnyExtensionKt.empty(this_setDragAndDrop), AnyExtensionKt.empty(this_setDragAndDrop)), new ViewDragShadowBuilder(view), view, 512);
        return true;
    }

    @NotNull
    public static final PointFloat getGlobalPointCustomView(@NotNull View view, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).getLocationInWindow(new int[2]);
        return new PointFloat(ArraysKt___ArraysKt.first(r0) + f + f3, ArraysKt___ArraysKt.last(r0) + f2 + f4);
    }

    @NotNull
    public static final PointFloat getGlobalCenterPoint(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).getLocationInWindow(new int[2]);
        return new PointFloat(ArraysKt___ArraysKt.first(r2) + view.getX() + (view.getWidth() / 2), ArraysKt___ArraysKt.last(r2) + view.getY() + (view.getHeight() / 2));
    }

    public static final void setBackgroundDrawableWithPadding(@NotNull AppCompatButton appCompatButton, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(appCompatButton, "<this>");
        int paddingStart = appCompatButton.getPaddingStart();
        int paddingTop = appCompatButton.getPaddingTop();
        int paddingEnd = appCompatButton.getPaddingEnd();
        int paddingBottom = appCompatButton.getPaddingBottom();
        appCompatButton.setBackgroundResource(i);
        appCompatButton.setPadding(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    /* compiled from: ViewExtension.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Lcoil/request/ImageRequest$Builder;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.extension.ViewExtensionKt$loadImage$1 */
    public static final class C35371 extends Lambda implements Function1<ImageRequest.Builder, Unit> {
        public static final C35371 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull ImageRequest.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageRequest.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadImage$default(ImageView imageView, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            i = R.drawable.img_logo_br_big;
        }
        if ((i2 & 4) != 0) {
            function1 = C35371.INSTANCE;
        }
        loadImage(imageView, obj, i, function1);
    }

    /* compiled from: ViewExtension.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Lcoil/request/ImageRequest$Builder;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.extension.ViewExtensionKt$loadBackground$1 */
    public static final class C35361 extends Lambda implements Function1<ImageRequest.Builder, Unit> {
        public static final C35361 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull ImageRequest.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageRequest.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Disposable loadBackground$default(View view, Object obj, ImageLoader imageLoader, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageLoader = Coil.imageLoader(context);
        }
        if ((i & 4) != 0) {
            function1 = C35361.INSTANCE;
        }
        return loadBackground(view, obj, imageLoader, function1);
    }

    @NotNull
    public static final Disposable loadBackground(@NotNull final View view, @Nullable Object obj, @NotNull ImageLoader imageLoader, @NotNull Function1<? super ImageRequest.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(context).data(obj).target(new Target() { // from class: com.blackhub.bronline.game.core.extension.ViewExtensionKt$loadBackground$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                view.setBackground(result);
            }
        });
        builder.invoke(builderTarget);
        return imageLoader.enqueue(builderTarget.build());
    }

    public static /* synthetic */ void setMargins$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        }
        if ((i5 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        }
        if ((i5 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        }
        if ((i5 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        }
        setMargins(view, i, i2, i3, i4);
    }

    public static final void loadImage(@NotNull ImageView imageView, @Nullable Object obj, int i, @NotNull Function1<? super ImageRequest.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(obj).target(imageView);
        builder.invoke(builderTarget);
        builderTarget.error(i);
        imageLoader.enqueue(builderTarget.build());
    }
}

