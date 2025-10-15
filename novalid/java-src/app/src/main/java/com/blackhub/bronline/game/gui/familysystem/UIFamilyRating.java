package com.blackhub.bronline.game.gui.familysystem;

import android.annotation.SuppressLint;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesRatingLayoutBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyRatingAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyTopData;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIFamilyRating.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J,\u0010\u001e\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\u0006\u0010#\u001a\u00020 H\u0002J\u0006\u0010$\u001a\u00020\u001aJ4\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\u0006\u0010#\u001a\u00020 H\u0007J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020 H\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020 H\u0002J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020 H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/familysystem/UIFamilyRating;", "Lcom/blackhub/bronline/game/common/UILayout;", "mainRoot", "Lcom/blackhub/bronline/game/gui/familysystem/GUIFamilySystem;", "mainActivity", "Lcom/blackhub/bronline/game/core/JNIActivity;", "(Lcom/blackhub/bronline/game/gui/familysystem/GUIFamilySystem;Lcom/blackhub/bronline/game/core/JNIActivity;)V", "anim", "Landroid/view/animation/Animation;", "binding", "Lcom/blackhub/bronline/databinding/FamiliesRatingLayoutBinding;", "familyTopAdapter", "Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyRatingAdapter;", "familyTopList", "", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyTopData;", "myFamilyTopAdapter", "myFamilyTopList", "getView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLayoutClose", "", "onLayoutShown", "setCurrentFamilyTop", "setDataInTopList", "setListOfOtherFamilies", "otherFamiliesTopValues", "", "otherFamiliesTopNames", "Landroid/text/Spanned;", "myRating", "setNullableParameters", "setStartParameters", "myFamily", "setVisibleFirstPosition", "valueOfVisible", "setVisibleOtherPosition", "setVisibleTopBlock", "isFirstThreePositions", "", "updateMainTopStatus", "thisPosition", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class UIFamilyRating extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public Animation anim;
    public FamiliesRatingLayoutBinding binding;

    @Nullable
    public FamilyRatingAdapter familyTopAdapter;

    @NotNull
    public final List<FamilyTopData> familyTopList;

    @Nullable
    public final JNIActivity mainActivity;

    @NotNull
    public final GUIFamilySystem mainRoot;

    @Nullable
    public FamilyRatingAdapter myFamilyTopAdapter;

    @NotNull
    public final List<FamilyTopData> myFamilyTopList;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UIFamilyRating(@NotNull GUIFamilySystem mainRoot, @Nullable JNIActivity jNIActivity) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.mainActivity = jNIActivity;
        this.familyTopList = new ArrayList();
        this.myFamilyTopList = new ArrayList();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setStartParameters(@NotNull FamilyTopData myFamily, @NotNull List<Integer> otherFamiliesTopValues, @NotNull List<Spanned> otherFamiliesTopNames, int myRating) {
        Intrinsics.checkNotNullParameter(myFamily, "myFamily");
        Intrinsics.checkNotNullParameter(otherFamiliesTopValues, "otherFamiliesTopValues");
        Intrinsics.checkNotNullParameter(otherFamiliesTopNames, "otherFamiliesTopNames");
        List<FamilyTopData> list = this.myFamilyTopList;
        list.clear();
        list.add(myFamily);
        updateMainTopStatus(this.myFamilyTopList.get(0).getPosition());
        this.familyTopList.clear();
        setListOfOtherFamilies(otherFamiliesTopValues, otherFamiliesTopNames, myRating);
        FamilyRatingAdapter familyRatingAdapter = this.familyTopAdapter;
        if (familyRatingAdapter != null) {
            familyRatingAdapter.notifyDataSetChanged();
        }
        FamilyRatingAdapter familyRatingAdapter2 = this.myFamilyTopAdapter;
        if (familyRatingAdapter2 != null) {
            familyRatingAdapter2.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setListOfOtherFamilies(List<Integer> otherFamiliesTopValues, List<Spanned> otherFamiliesTopNames, int myRating) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        int i6 = 1;
        int i7 = 2;
        while (i5 < otherFamiliesTopValues.size() - 1) {
            arrayList.add(otherFamiliesTopValues.get(i5));
            arrayList2.add(otherFamiliesTopValues.get(i6));
            arrayList3.add(otherFamiliesTopValues.get(i7));
            i5 += 3;
            i6 += 3;
            i7 += 3;
        }
        if (arrayList.size() == arrayList2.size() && arrayList.size() == arrayList3.size() && arrayList.size() == otherFamiliesTopNames.size()) {
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                int i9 = i8 + 1;
                if (i9 == 1) {
                    i = R.drawable.ic_top_1_left_bracket;
                    i2 = R.drawable.ic_top_1_right_bracket;
                } else if (i9 == 2) {
                    i = R.drawable.ic_top_2_left_bracket;
                    i2 = R.drawable.ic_top_2_right_bracket;
                } else if (i9 != 3) {
                    i3 = 0;
                    i4 = 0;
                    if (i9 != myRating) {
                        this.familyTopList.add(new FamilyTopData(i9, otherFamiliesTopNames.get(i8), ((Number) arrayList3.get(i8)).intValue(), ((Number) arrayList.get(i8)).intValue(), ((Number) arrayList2.get(i8)).intValue(), R.color.black, i3, i4, false, true, 256, null));
                    } else {
                        this.familyTopList.add(new FamilyTopData(i9, otherFamiliesTopNames.get(i8), ((Number) arrayList3.get(i8)).intValue(), ((Number) arrayList.get(i8)).intValue(), ((Number) arrayList2.get(i8)).intValue(), R.color.black, i3, i4, false, false, 256, null));
                    }
                    i8 = i9;
                } else {
                    i = R.drawable.ic_top_3_left_bracket;
                    i2 = R.drawable.ic_top_3_right_bracket;
                }
                i3 = i;
                i4 = i2;
                if (i9 != myRating) {
                }
                i8 = i9;
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    /* renamed from: getView */
    public View getMViewRoot() {
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding = this.binding;
        if (familiesRatingLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesRatingLayoutBinding = null;
        }
        ConstraintLayout root = familiesRatingLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FamiliesRatingLayoutBinding familiesRatingLayoutBindingInflate = FamiliesRatingLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(familiesRatingLayoutBindingInflate, "inflate(...)");
        this.binding = familiesRatingLayoutBindingInflate;
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding = null;
        if (familiesRatingLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesRatingLayoutBindingInflate = null;
        }
        this.anim = AnimationUtils.loadAnimation(familiesRatingLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        setDataInTopList();
        setCurrentFamilyTop();
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding2 = this.binding;
        if (familiesRatingLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesRatingLayoutBinding2 = null;
        }
        familiesRatingLayoutBinding2.buttonTopPrices.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIFamilyRating$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIFamilyRating.onCreateView$lambda$2(this.f$0, view);
            }
        });
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding3 = this.binding;
        if (familiesRatingLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesRatingLayoutBinding = familiesRatingLayoutBinding3;
        }
        ConstraintLayout root = familiesRatingLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void onCreateView$lambda$2(final UIFamilyRating this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation animation = this$0.anim;
        if (animation != null) {
            AnyExtensionKt.setActionOnAnimationEnd(animation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIFamilyRating$onCreateView$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.mainRoot.listenerLayout(2);
                }
            });
        }
        view.startAnimation(this$0.anim);
    }

    public final void setDataInTopList() {
        FamilyRatingAdapter familyRatingAdapter = new FamilyRatingAdapter(this.familyTopList, this.mainActivity);
        this.familyTopAdapter = familyRatingAdapter;
        familyRatingAdapter.setHasStableIds(true);
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding = this.binding;
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding2 = null;
        if (familiesRatingLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesRatingLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesRatingLayoutBinding.familyTop;
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding3 = this.binding;
        if (familiesRatingLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesRatingLayoutBinding2 = familiesRatingLayoutBinding3;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesRatingLayoutBinding2.getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.familyTopAdapter);
        recyclerView.setItemViewCacheSize(20);
    }

    public final void setCurrentFamilyTop() {
        this.myFamilyTopAdapter = new FamilyRatingAdapter(this.myFamilyTopList, this.mainActivity);
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding = this.binding;
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding2 = null;
        if (familiesRatingLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesRatingLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesRatingLayoutBinding.currentFamily;
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding3 = this.binding;
        if (familiesRatingLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesRatingLayoutBinding2 = familiesRatingLayoutBinding3;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesRatingLayoutBinding2.getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.myFamilyTopAdapter);
    }

    public final void updateMainTopStatus(int thisPosition) {
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding = null;
        if (thisPosition == 1) {
            setVisibleTopBlock(true);
            FamiliesRatingLayoutBinding familiesRatingLayoutBinding2 = this.binding;
            if (familiesRatingLayoutBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                familiesRatingLayoutBinding = familiesRatingLayoutBinding2;
            }
            familiesRatingLayoutBinding.topIcon.setImageResource(R.drawable.img_top_1);
            return;
        }
        if (thisPosition == 2) {
            setVisibleTopBlock(true);
            FamiliesRatingLayoutBinding familiesRatingLayoutBinding3 = this.binding;
            if (familiesRatingLayoutBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                familiesRatingLayoutBinding = familiesRatingLayoutBinding3;
            }
            familiesRatingLayoutBinding.topIcon.setImageResource(R.drawable.img_top_2);
            return;
        }
        if (thisPosition == 3) {
            setVisibleTopBlock(true);
            FamiliesRatingLayoutBinding familiesRatingLayoutBinding4 = this.binding;
            if (familiesRatingLayoutBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                familiesRatingLayoutBinding = familiesRatingLayoutBinding4;
            }
            familiesRatingLayoutBinding.topIcon.setImageResource(R.drawable.img_top_3);
            return;
        }
        setVisibleTopBlock(false);
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding5 = this.binding;
        if (familiesRatingLayoutBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesRatingLayoutBinding = familiesRatingLayoutBinding5;
        }
        familiesRatingLayoutBinding.valueOtherTop.setText(getContext().getString(R.string.common_top_position, Integer.valueOf(thisPosition)));
    }

    private final void setVisibleTopBlock(boolean isFirstThreePositions) {
        if (isFirstThreePositions) {
            setVisibleFirstPosition(0);
            setVisibleOtherPosition(4);
        } else {
            setVisibleFirstPosition(4);
            setVisibleOtherPosition(0);
        }
    }

    private final void setVisibleFirstPosition(int valueOfVisible) {
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding = this.binding;
        if (familiesRatingLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesRatingLayoutBinding = null;
        }
        familiesRatingLayoutBinding.topIcon.setVisibility(valueOfVisible);
        familiesRatingLayoutBinding.titleRating.setVisibility(valueOfVisible);
    }

    private final void setVisibleOtherPosition(int valueOfVisible) {
        FamiliesRatingLayoutBinding familiesRatingLayoutBinding = this.binding;
        if (familiesRatingLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesRatingLayoutBinding = null;
        }
        familiesRatingLayoutBinding.titleOtherTop.setVisibility(valueOfVisible);
        familiesRatingLayoutBinding.otherTopIcon.setVisibility(valueOfVisible);
        familiesRatingLayoutBinding.valueOtherTop.setVisibility(valueOfVisible);
        familiesRatingLayoutBinding.titleRatingOther.setVisibility(valueOfVisible);
    }

    public final void setNullableParameters() {
        this.anim = null;
        this.familyTopAdapter = null;
        this.myFamilyTopAdapter = null;
        this.familyTopList.clear();
        this.myFamilyTopList.clear();
    }
}
