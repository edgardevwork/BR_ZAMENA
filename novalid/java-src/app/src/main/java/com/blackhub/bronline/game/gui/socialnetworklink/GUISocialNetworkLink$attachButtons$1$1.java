package com.blackhub.bronline.game.gui.socialnetworklink;

import android.view.View;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.socialnetworklink.viewmodel.SocialNetworkLinkViewModel;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: GUISocialNetworkLink.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "buttonId", "", SVG.View.NODE_NAME, "Landroid/view/View;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class GUISocialNetworkLink$attachButtons$1$1 extends Lambda implements Function2<Integer, View, Unit> {
    public final /* synthetic */ GUISocialNetworkLink this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUISocialNetworkLink$attachButtons$1$1(GUISocialNetworkLink gUISocialNetworkLink) {
        super(2);
        this.this$0 = gUISocialNetworkLink;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, View view) {
        invoke(num.intValue(), view);
        return Unit.INSTANCE;
    }

    public final void invoke(final int i, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        final GUISocialNetworkLink gUISocialNetworkLink = this.this$0;
        ViewExtensionKt.setOnDebounceAndAnimateClickListener$default(view, 0L, new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink$attachButtons$1$1$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GUISocialNetworkLink$attachButtons$1$1.invoke$lambda$1(gUISocialNetworkLink, i, view2);
            }
        }, 1, null);
    }

    public static final void invoke$lambda$1(GUISocialNetworkLink this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SocialNetworkLinkViewModel viewModel = this$0.getViewModel();
        viewModel.clickOnButton(i);
        viewModel.closeInterface();
    }
}
