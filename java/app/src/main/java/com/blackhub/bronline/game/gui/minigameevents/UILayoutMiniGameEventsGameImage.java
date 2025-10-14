package com.blackhub.bronline.game.gui.minigameevents;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UILayoutMiniGameEventsGameImage.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUILayoutMiniGameEventsGameImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutMiniGameEventsGameImage.kt\ncom/blackhub/bronline/game/gui/minigameevents/UILayoutMiniGameEventsGameImage\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,74:1\n54#2,3:75\n24#2:78\n59#2,6:79\n*S KotlinDebug\n*F\n+ 1 UILayoutMiniGameEventsGameImage.kt\ncom/blackhub/bronline/game/gui/minigameevents/UILayoutMiniGameEventsGameImage\n*L\n61#1:75,3\n61#1:78\n61#1:79,6\n*E\n"})

public final class UILayoutMiniGameEventsGameImage extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public ImageView mClose;

    @Nullable
    public ImageView mImage;

    @Nullable
    public GUIMiniGameEventsGame mRoot;

    @Nullable
    public View mViewRoot;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutMiniGameEventsGameImage(@Nullable GUIMiniGameEventsGame gUIMiniGameEventsGame) {
        this.mRoot = gUIMiniGameEventsGame;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    /* renamed from: getView, reason: from getter */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup viewGroup) throws JSONException {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        View viewInflate = inflater.inflate(R.layout.halloween_game_image, viewGroup, false);
        this.mViewRoot = viewInflate;
        this.mImage = viewInflate != null ? (ImageView) viewInflate.findViewById(R.id.ivHalloweenGameImage) : null;
        View view = this.mViewRoot;
        this.mClose = view != null ? (ImageView) view.findViewById(R.id.ivHalloweenGameClose) : null;
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        ImageView imageView = this.mClose;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGameImage$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UILayoutMiniGameEventsGameImage.onCreateView$lambda$0(this.f$0, jSONObject, view2);
                }
            });
        }
        return this.mViewRoot;
    }

    public static final void onCreateView$lambda$0(UILayoutMiniGameEventsGameImage this$0, JSONObject jsonObject, View view) {
        GUIManager guiManager;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(jsonObject, "$jsonObject");
        GUIMiniGameEventsGame gUIMiniGameEventsGame = this$0.mRoot;
        if (gUIMiniGameEventsGame != null && (guiManager = gUIMiniGameEventsGame.getGuiManager()) != null) {
            GUIMiniGameEventsGame gUIMiniGameEventsGame2 = this$0.mRoot;
            guiManager.sendJsonData(IntExtensionKt.getOrZero(gUIMiniGameEventsGame2 != null ? Integer.valueOf(gUIMiniGameEventsGame2.getScreenId()) : null), jsonObject);
        }
        GUIMiniGameEventsGame gUIMiniGameEventsGame3 = this$0.mRoot;
        if (gUIMiniGameEventsGame3 != null) {
            gUIMiniGameEventsGame3.close(null);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() throws Resources.NotFoundException {
        JNIActivity jNIActivity;
        LifecycleCoroutineScope lifecycleScope;
        JSONObject json;
        GUIMiniGameEventsGame gUIMiniGameEventsGame = this.mRoot;
        String strOptString = (gUIMiniGameEventsGame == null || (json = gUIMiniGameEventsGame.getJson()) == null) ? null : json.optString("imageName");
        if (strOptString == null) {
            strOptString = "";
        }
        String str = strOptString;
        float dimension = getContext().getResources().getDimension(R.dimen._13wdp);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(context, str, ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null);
        ImageView imageView = this.mImage;
        if (imageView != null) {
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(bitmapFromZip$default).target(imageView);
            builderTarget.transformations(new RoundedCornersTransformation(dimension));
            imageLoader.enqueue(builderTarget.build());
        }
        GUIMiniGameEventsGame gUIMiniGameEventsGame2 = this.mRoot;
        if (gUIMiniGameEventsGame2 == null || (jNIActivity = gUIMiniGameEventsGame2.mActivity) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(jNIActivity)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new C43692(null), 3, null);
    }

    /* compiled from: UILayoutMiniGameEventsGameImage.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGameImage$onLayoutShown$2", m7120f = "UILayoutMiniGameEventsGameImage.kt", m7121i = {}, m7122l = {66}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGameImage$onLayoutShown$2 */
    /* loaded from: classes7.dex */
    public static final class C43692 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43692(Continuation<? super C43692> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutMiniGameEventsGameImage.this.new C43692(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43692) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ImageView imageView = UILayoutMiniGameEventsGameImage.this.mClose;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }
}

