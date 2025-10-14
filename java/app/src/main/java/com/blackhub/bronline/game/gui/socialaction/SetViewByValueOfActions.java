package com.blackhub.bronline.game.gui.socialaction;

import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.databinding.SocialInteractionBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SetViewByValueOfActions.kt */
@StabilityInferred(parameters = 0)

public final class SetViewByValueOfActions {
    public static final int $stable = 8;

    @Nullable
    public SocialInteraction actionFromButton1;

    @Nullable
    public SocialInteraction actionFromButton2;

    @Nullable
    public SocialInteraction actionFromButton3;

    @Nullable
    public SocialInteraction actionFromButton4;

    @Nullable
    public SocialInteraction actionFromButton5;

    @Nullable
    public SocialInteraction actionFromButton6;

    @Nullable
    public SocialInteraction actionFromButton7;

    @Nullable
    public final CharSequence backButtonsText;

    @NotNull
    public final SocialInteractionBinding binding;
    public final int iconAdditionally;
    public final int iconBack;
    public final int invisible;
    public final JNIActivity mainActivity;

    @Nullable
    public final Resources resource;

    @NotNull
    public final GUISocialInteraction root;

    @NotNull
    public List<SocialInteraction> thisActionsList;
    public final int visible;

    public SetViewByValueOfActions(@NotNull GUISocialInteraction root, @NotNull SocialInteractionBinding binding) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.root = root;
        this.binding = binding;
        JNIActivity context = JNIActivity.getContext();
        this.mainActivity = context;
        this.resource = context != null ? context.getResources() : null;
        this.invisible = 4;
        this.backButtonsText = context != null ? context.getText(R.string.common_back) : null;
        this.iconBack = R.drawable.ic_back_in_oval_red_s24;
        this.iconAdditionally = R.drawable.ic_additionally_s24;
        this.thisActionsList = new ArrayList();
    }

    @NotNull
    public final GUISocialInteraction getRoot() {
        return this.root;
    }

    @NotNull
    public final SocialInteractionBinding getBinding() {
        return this.binding;
    }

    @Nullable
    public final SocialInteraction getActionFromButton1() {
        return this.actionFromButton1;
    }

    @Nullable
    public final SocialInteraction getActionFromButton2() {
        return this.actionFromButton2;
    }

    @Nullable
    public final SocialInteraction getActionFromButton3() {
        return this.actionFromButton3;
    }

    @Nullable
    public final SocialInteraction getActionFromButton4() {
        return this.actionFromButton4;
    }

    @Nullable
    public final SocialInteraction getActionFromButton5() {
        return this.actionFromButton5;
    }

    @Nullable
    public final SocialInteraction getActionFromButton6() {
        return this.actionFromButton6;
    }

    @Nullable
    public final SocialInteraction getActionFromButton7() {
        return this.actionFromButton7;
    }

    public final void startLogicForSetView(int valueOfActions, boolean ifWithAdditionally, int type, @Nullable List<SocialInteraction> listWithActions) {
        setTextAndIconInButtons(valueOfActions, ifWithAdditionally, type, listWithActions);
        updateParameterForButton(valueOfActions);
        new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.socialaction.SetViewByValueOfActions$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SetViewByValueOfActions.startLogicForSetView$lambda$0(this.f$0);
            }
        }, 250L);
    }

    public static final void startLogicForSetView$lambda$0(SetViewByValueOfActions this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView button1 = this$0.binding.button1;
        Intrinsics.checkNotNullExpressionValue(button1, "button1");
        this$0.setMarque(button1);
        TextView button2 = this$0.binding.button2;
        Intrinsics.checkNotNullExpressionValue(button2, "button2");
        this$0.setMarque(button2);
        TextView button3 = this$0.binding.button3;
        Intrinsics.checkNotNullExpressionValue(button3, "button3");
        this$0.setMarque(button3);
        TextView button4 = this$0.binding.button4;
        Intrinsics.checkNotNullExpressionValue(button4, "button4");
        this$0.setMarque(button4);
        TextView button5 = this$0.binding.button5;
        Intrinsics.checkNotNullExpressionValue(button5, "button5");
        this$0.setMarque(button5);
        TextView button6 = this$0.binding.button6;
        Intrinsics.checkNotNullExpressionValue(button6, "button6");
        this$0.setMarque(button6);
        TextView button7 = this$0.binding.button7;
        Intrinsics.checkNotNullExpressionValue(button7, "button7");
        this$0.setMarque(button7);
    }

    public final void setTextAndIconInButtons(int valueOfActions, boolean ifWithAdditionally, int type, List<SocialInteraction> listWithActions) {
        int i = type != 1 ? type != 2 ? type != 3 ? 0 : R.drawable.ic_chat_1_s24 : R.drawable.ic_exchange_1_s24 : R.drawable.ic_star_1_s24;
        this.binding.button1.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.binding.button2.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.binding.button3.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.binding.button4.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.binding.button5.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.binding.button6.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.binding.button7.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        if (listWithActions == null || !listWithActions.isEmpty()) {
            switch (valueOfActions) {
                case 0:
                    this.binding.buttonWithNickname.setVisibility(this.visible);
                    this.binding.button1.setVisibility(this.invisible);
                    this.binding.button2.setVisibility(this.invisible);
                    this.binding.button3.setVisibility(this.invisible);
                    TextView textView = this.binding.button4;
                    textView.setVisibility(this.visible);
                    textView.setText(this.backButtonsText);
                    textView.setCompoundDrawablesWithIntrinsicBounds(this.iconBack, 0, 0, 0);
                    textView.invalidate();
                    this.binding.button5.setVisibility(this.invisible);
                    this.binding.button6.setVisibility(this.invisible);
                    this.binding.button7.setVisibility(this.invisible);
                    break;
                case 1:
                    this.binding.buttonWithNickname.setVisibility(this.visible);
                    this.binding.button1.setVisibility(this.invisible);
                    this.binding.button2.setVisibility(this.invisible);
                    TextView textView2 = this.binding.button3;
                    textView2.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView2.setText(listWithActions.get(0).getName());
                        this.actionFromButton3 = listWithActions.get(0);
                    }
                    textView2.invalidate();
                    this.binding.button4.setVisibility(this.invisible);
                    TextView textView3 = this.binding.button5;
                    textView3.setVisibility(this.visible);
                    textView3.setText(this.backButtonsText);
                    textView3.setCompoundDrawablesWithIntrinsicBounds(this.iconBack, 0, 0, 0);
                    textView3.invalidate();
                    this.binding.button6.setVisibility(this.invisible);
                    this.binding.button7.setVisibility(this.invisible);
                    break;
                case 2:
                    this.binding.buttonWithNickname.setVisibility(this.visible);
                    this.binding.button1.setVisibility(this.invisible);
                    TextView textView4 = this.binding.button2;
                    textView4.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView4.setText(listWithActions.get(1).getName());
                        this.actionFromButton2 = listWithActions.get(1);
                    }
                    textView4.invalidate();
                    this.binding.button3.setVisibility(this.invisible);
                    TextView textView5 = this.binding.button4;
                    textView5.setVisibility(this.visible);
                    textView5.setText(this.backButtonsText);
                    textView5.setCompoundDrawablesWithIntrinsicBounds(this.iconBack, 0, 0, 0);
                    textView5.invalidate();
                    this.binding.button5.setVisibility(this.invisible);
                    TextView textView6 = this.binding.button6;
                    textView6.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView6.setText(listWithActions.get(0).getName());
                        this.actionFromButton6 = listWithActions.get(0);
                    }
                    textView6.invalidate();
                    this.binding.button7.setVisibility(this.invisible);
                    break;
                case 3:
                    this.binding.buttonWithNickname.setVisibility(this.visible);
                    this.binding.button1.setVisibility(this.invisible);
                    TextView textView7 = this.binding.button2;
                    textView7.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView7.setText(listWithActions.get(2).getName());
                        this.actionFromButton2 = listWithActions.get(2);
                    }
                    textView7.invalidate();
                    TextView textView8 = this.binding.button3;
                    textView8.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView8.setText(listWithActions.get(1).getName());
                        this.actionFromButton3 = listWithActions.get(1);
                    }
                    textView8.invalidate();
                    this.binding.button4.setVisibility(this.invisible);
                    TextView textView9 = this.binding.button5;
                    textView9.setVisibility(this.visible);
                    textView9.setText(this.backButtonsText);
                    textView9.setCompoundDrawablesWithIntrinsicBounds(this.iconBack, 0, 0, 0);
                    textView9.invalidate();
                    TextView textView10 = this.binding.button6;
                    textView10.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView10.setText(listWithActions.get(0).getName());
                        this.actionFromButton6 = listWithActions.get(0);
                    }
                    textView10.invalidate();
                    this.binding.button7.setVisibility(this.invisible);
                    break;
                case 4:
                    this.binding.buttonWithNickname.setVisibility(this.visible);
                    TextView textView11 = this.binding.button1;
                    textView11.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView11.setText(listWithActions.get(3).getName());
                        this.actionFromButton1 = listWithActions.get(3);
                    }
                    textView11.invalidate();
                    this.binding.button2.setVisibility(this.invisible);
                    TextView textView12 = this.binding.button3;
                    textView12.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView12.setText(listWithActions.get(2).getName());
                        this.actionFromButton3 = listWithActions.get(2);
                    }
                    textView12.invalidate();
                    TextView textView13 = this.binding.button4;
                    textView13.setVisibility(this.visible);
                    textView13.setText(this.backButtonsText);
                    textView13.setCompoundDrawablesWithIntrinsicBounds(this.iconBack, 0, 0, 0);
                    textView13.invalidate();
                    TextView textView14 = this.binding.button5;
                    textView14.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView14.setText(listWithActions.get(1).getName());
                        this.actionFromButton5 = listWithActions.get(1);
                    }
                    textView14.invalidate();
                    this.binding.button6.setVisibility(this.invisible);
                    TextView textView15 = this.binding.button7;
                    textView15.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView15.setText(listWithActions.get(0).getName());
                        this.actionFromButton7 = listWithActions.get(0);
                    }
                    textView15.invalidate();
                    break;
                case 5:
                    this.binding.buttonWithNickname.setVisibility(this.visible);
                    TextView textView16 = this.binding.button1;
                    textView16.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView16.setText(listWithActions.get(4).getName());
                        this.actionFromButton1 = listWithActions.get(4);
                    }
                    textView16.invalidate();
                    TextView textView17 = this.binding.button2;
                    textView17.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView17.setText(listWithActions.get(3).getName());
                        this.actionFromButton2 = listWithActions.get(3);
                    }
                    textView17.invalidate();
                    TextView textView18 = this.binding.button3;
                    textView18.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView18.setText(listWithActions.get(2).getName());
                        this.actionFromButton3 = listWithActions.get(2);
                    }
                    textView18.invalidate();
                    this.binding.button4.setVisibility(this.invisible);
                    TextView textView19 = this.binding.button5;
                    textView19.setVisibility(this.visible);
                    textView19.setText(this.backButtonsText);
                    textView19.setCompoundDrawablesWithIntrinsicBounds(this.iconBack, 0, 0, 0);
                    textView19.invalidate();
                    TextView textView20 = this.binding.button6;
                    textView20.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView20.setText(listWithActions.get(1).getName());
                        this.actionFromButton6 = listWithActions.get(1);
                    }
                    textView20.invalidate();
                    TextView textView21 = this.binding.button7;
                    textView21.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView21.setText(listWithActions.get(0).getName());
                        this.actionFromButton7 = listWithActions.get(0);
                    }
                    textView21.invalidate();
                    break;
                case 6:
                    this.binding.buttonWithNickname.setVisibility(this.visible);
                    TextView textView22 = this.binding.button1;
                    textView22.setVisibility(this.visible);
                    if (ifWithAdditionally) {
                        if (listWithActions != null) {
                            textView22.setText(listWithActions.get(4).getName());
                            this.actionFromButton1 = listWithActions.get(4);
                        }
                    } else if (listWithActions != null) {
                        textView22.setText(listWithActions.get(5).getName());
                        this.actionFromButton1 = listWithActions.get(5);
                    }
                    textView22.invalidate();
                    TextView textView23 = this.binding.button2;
                    textView23.setVisibility(this.visible);
                    if (ifWithAdditionally) {
                        if (listWithActions != null) {
                            textView23.setText(listWithActions.get(3).getName());
                            this.actionFromButton2 = listWithActions.get(3);
                        }
                    } else if (listWithActions != null) {
                        textView23.setText(listWithActions.get(4).getName());
                        this.actionFromButton2 = listWithActions.get(4);
                    }
                    textView23.invalidate();
                    TextView textView24 = this.binding.button3;
                    textView24.setVisibility(this.visible);
                    if (ifWithAdditionally) {
                        textView24.setText(textView24.getContext().getText(R.string.social_interaction_if_with_additionally));
                        textView24.setCompoundDrawablesWithIntrinsicBounds(this.iconAdditionally, 0, 0, 0);
                    } else if (listWithActions != null) {
                        textView24.setText(listWithActions.get(3).getName());
                        this.actionFromButton3 = listWithActions.get(3);
                    }
                    textView24.invalidate();
                    TextView textView25 = this.binding.button4;
                    textView25.setVisibility(this.visible);
                    textView25.setText(this.backButtonsText);
                    textView25.setCompoundDrawablesWithIntrinsicBounds(this.iconBack, 0, 0, 0);
                    textView25.invalidate();
                    TextView textView26 = this.binding.button5;
                    textView26.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView26.setText(listWithActions.get(2).getName());
                        this.actionFromButton5 = listWithActions.get(2);
                    }
                    textView26.invalidate();
                    TextView textView27 = this.binding.button6;
                    textView27.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView27.setText(listWithActions.get(1).getName());
                        this.actionFromButton6 = listWithActions.get(1);
                    }
                    textView27.invalidate();
                    TextView textView28 = this.binding.button7;
                    textView28.setVisibility(this.visible);
                    if (listWithActions != null) {
                        textView28.setText(listWithActions.get(0).getName());
                        this.actionFromButton7 = listWithActions.get(0);
                    }
                    textView28.invalidate();
                    break;
            }
        }
    }

    public final void updateParameterForButton(int valueOfActions) {
        ViewGroup.LayoutParams layoutParams = this.binding.buttonWithNickname.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = this.binding.button1.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        ViewGroup.LayoutParams layoutParams5 = this.binding.button2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        ViewGroup.LayoutParams layoutParams7 = this.binding.button3.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        ViewGroup.LayoutParams layoutParams9 = this.binding.button4.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams9, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
        ViewGroup.LayoutParams layoutParams11 = this.binding.button5.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams11, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
        ViewGroup.LayoutParams layoutParams13 = this.binding.button6.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams13, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams14 = (ConstraintLayout.LayoutParams) layoutParams13;
        ViewGroup.LayoutParams layoutParams15 = this.binding.button7.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams15, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams15;
        int id = this.binding.closeInteraction.getId();
        switch (valueOfActions) {
            case 0:
                layoutParams2.startToStart = id;
                layoutParams2.endToEnd = id;
                layoutParams2.bottomToTop = id;
                layoutParams2.setMargins(0, 0, 0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_0_elements_0_4));
                layoutParams10.startToStart = id;
                layoutParams10.endToEnd = id;
                layoutParams10.topToBottom = id;
                layoutParams10.setMargins(0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_0_elements_0_4), 0, 0);
                break;
            case 1:
                layoutParams2.startToStart = id;
                layoutParams2.endToEnd = id;
                layoutParams2.bottomToTop = id;
                layoutParams2.setMargins(0, 0, 0, getMarginInPixel(R.dimen.margin_bottom_if_1_elements_0));
                layoutParams8.topToBottom = id;
                layoutParams8.startToEnd = id;
                layoutParams8.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_1_elements_3_5), getMarginInPixel(R.dimen.margin_bottom_and_top_if_1_elements_3_5), 0, 0);
                layoutParams12.topToBottom = id;
                layoutParams12.endToStart = id;
                layoutParams12.setMargins(0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_1_elements_3_5), getMarginInPixel(R.dimen.margin_end_and_start_if_1_elements_3_5), 0);
                break;
            case 2:
                layoutParams2.startToStart = id;
                layoutParams2.endToEnd = id;
                layoutParams2.bottomToTop = id;
                layoutParams2.setMargins(0, 0, 0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_2_elements_0_4));
                layoutParams10.startToStart = id;
                layoutParams10.endToEnd = id;
                layoutParams10.topToBottom = id;
                layoutParams10.setMargins(0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_2_elements_0_4), 0, 0);
                layoutParams6.topToTop = id;
                layoutParams6.bottomToBottom = id;
                layoutParams6.startToEnd = id;
                layoutParams6.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_2_elements_2_6), 0, 0, 0);
                layoutParams14.topToTop = id;
                layoutParams14.bottomToBottom = id;
                layoutParams14.endToStart = id;
                layoutParams14.setMargins(0, 0, getMarginInPixel(R.dimen.margin_end_and_start_if_2_elements_2_6), 0);
                break;
            case 3:
                layoutParams2.startToStart = id;
                layoutParams2.endToEnd = id;
                layoutParams2.bottomToTop = id;
                layoutParams2.setMargins(0, 0, 0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_3_elements_0));
                layoutParams6.topToTop = id;
                layoutParams6.bottomToBottom = id;
                layoutParams6.startToEnd = id;
                layoutParams6.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_3_elements_2_6), 0, 0, 0);
                layoutParams14.topToTop = id;
                layoutParams14.bottomToBottom = id;
                layoutParams14.endToStart = id;
                layoutParams14.setMargins(0, 0, getMarginInPixel(R.dimen.margin_end_and_start_if_3_elements_2_6), 0);
                layoutParams8.topToBottom = id;
                layoutParams8.startToEnd = id;
                layoutParams8.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_3_elements_3_5), getMarginInPixel(R.dimen.margin_top_if_3_elements_3_5), 0, 0);
                layoutParams12.topToBottom = id;
                layoutParams12.endToStart = id;
                layoutParams12.setMargins(0, getMarginInPixel(R.dimen.margin_top_if_3_elements_3_5), getMarginInPixel(R.dimen.margin_end_and_start_if_3_elements_3_5), 0);
                break;
            case 4:
                layoutParams2.startToStart = id;
                layoutParams2.endToEnd = id;
                layoutParams2.bottomToTop = id;
                layoutParams2.setMargins(0, 0, 0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_4_elements_0_4));
                layoutParams10.startToStart = id;
                layoutParams10.endToEnd = id;
                layoutParams10.topToBottom = id;
                layoutParams10.setMargins(0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_4_elements_0_4), 0, 0);
                layoutParams4.bottomToTop = id;
                layoutParams4.startToEnd = id;
                layoutParams4.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_4_elements_1_3_5_7), 0, 0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_4_elements_1_3_5_7));
                layoutParams16.bottomToTop = id;
                layoutParams16.endToStart = id;
                layoutParams16.setMargins(0, 0, getMarginInPixel(R.dimen.margin_end_and_start_if_4_elements_1_3_5_7), getMarginInPixel(R.dimen.margin_bottom_and_top_if_4_elements_1_3_5_7));
                layoutParams8.topToBottom = id;
                layoutParams8.startToEnd = id;
                layoutParams8.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_4_elements_1_3_5_7), getMarginInPixel(R.dimen.margin_bottom_and_top_if_4_elements_1_3_5_7), 0, 0);
                layoutParams12.topToBottom = id;
                layoutParams12.endToStart = id;
                layoutParams12.setMargins(0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_4_elements_1_3_5_7), getMarginInPixel(R.dimen.margin_end_and_start_if_4_elements_1_3_5_7), 0);
                break;
            case 5:
                layoutParams2.startToStart = id;
                layoutParams2.endToEnd = id;
                layoutParams2.bottomToTop = id;
                layoutParams2.setMargins(0, 0, 0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_5_elements_0));
                layoutParams4.bottomToTop = id;
                layoutParams4.startToEnd = id;
                layoutParams4.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_5_elements_1_2_6_7), 0, 0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_5_elements_1_2_6_7));
                layoutParams16.bottomToTop = id;
                layoutParams16.endToStart = id;
                layoutParams16.setMargins(0, 0, getMarginInPixel(R.dimen.margin_end_and_start_if_5_elements_1_2_6_7), getMarginInPixel(R.dimen.margin_bottom_and_top_if_5_elements_1_2_6_7));
                layoutParams6.topToTop = -1;
                layoutParams6.bottomToBottom = -1;
                layoutParams6.topToBottom = id;
                layoutParams6.startToEnd = id;
                layoutParams6.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_5_elements_1_2_6_7), getMarginInPixel(R.dimen.margin_bottom_and_top_if_5_elements_1_2_6_7), 0, 0);
                layoutParams14.topToTop = -1;
                layoutParams14.bottomToBottom = -1;
                layoutParams14.topToBottom = id;
                layoutParams14.endToStart = id;
                layoutParams14.setMargins(0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_5_elements_1_2_6_7), getMarginInPixel(R.dimen.margin_end_and_start_if_5_elements_1_2_6_7), 0);
                layoutParams8.topToBottom = id;
                layoutParams8.startToEnd = id;
                layoutParams8.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_5_elements_3_5), getMarginInPixel(R.dimen.margin_top_if_5_elements_3_5), 0, 0);
                layoutParams12.topToBottom = id;
                layoutParams12.endToStart = id;
                layoutParams12.setMargins(0, getMarginInPixel(R.dimen.margin_top_if_5_elements_3_5), getMarginInPixel(R.dimen.margin_end_and_start_if_5_elements_3_5), 0);
                break;
            case 6:
                layoutParams2.startToStart = id;
                layoutParams2.endToEnd = id;
                layoutParams2.bottomToTop = id;
                layoutParams2.setMargins(0, 0, 0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_6_elements_0_4));
                layoutParams10.startToStart = id;
                layoutParams10.endToEnd = id;
                layoutParams10.topToBottom = id;
                layoutParams10.setMargins(0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_6_elements_0_4), 0, 0);
                layoutParams4.bottomToTop = id;
                layoutParams4.startToEnd = id;
                layoutParams4.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_6_elements_1_3_5_7), 0, 0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_6_elements_1_3_5_7));
                layoutParams16.bottomToTop = id;
                layoutParams16.endToStart = id;
                layoutParams16.setMargins(0, 0, getMarginInPixel(R.dimen.margin_end_and_start_if_6_elements_1_3_5_7), getMarginInPixel(R.dimen.margin_bottom_and_top_if_6_elements_1_3_5_7));
                layoutParams6.topToTop = id;
                layoutParams6.bottomToBottom = id;
                layoutParams6.startToEnd = id;
                layoutParams6.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_6_elements_2_6), 0, 0, 0);
                layoutParams14.topToTop = id;
                layoutParams14.bottomToBottom = id;
                layoutParams14.endToStart = id;
                layoutParams14.setMargins(0, 0, getMarginInPixel(R.dimen.margin_end_and_start_if_6_elements_2_6), 0);
                layoutParams8.topToBottom = id;
                layoutParams8.startToEnd = id;
                layoutParams8.setMargins(getMarginInPixel(R.dimen.margin_end_and_start_if_6_elements_1_3_5_7), getMarginInPixel(R.dimen.margin_bottom_and_top_if_6_elements_1_3_5_7), 0, 0);
                layoutParams12.topToBottom = id;
                layoutParams12.endToStart = id;
                layoutParams12.setMargins(0, getMarginInPixel(R.dimen.margin_bottom_and_top_if_6_elements_1_3_5_7), getMarginInPixel(R.dimen.margin_end_and_start_if_6_elements_1_3_5_7), 0);
                break;
        }
    }

    public final void setMarque(TextView textButton) {
        if (textButton.getWidth() > getMarginInPixel(R.dimen.test_width)) {
            textButton.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textButton.setMarqueeRepeatLimit(-1);
            textButton.setSelected(true);
        } else {
            textButton.setEllipsize(null);
            textButton.setMarqueeRepeatLimit(-1);
            textButton.setSelected(false);
        }
    }

    public final int getMarginInPixel(int resourcesId) {
        return JNIActivity.getContext().getResources().getDimensionPixelSize(resourcesId);
    }

    public final void setStartButtons(@NotNull String playersNick, int playersId, int ifPlayerInOrganization) {
        Intrinsics.checkNotNullParameter(playersNick, "playersNick");
        if (ifPlayerInOrganization == 0) {
            startLogicForSetView(1, false, 0, null);
            this.binding.button3.setText("Общение");
            this.binding.button3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_chat_1_s24, 0, 0, 0);
            this.binding.button5.setText("Социальные");
            this.binding.button5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_exchange_1_s24, 0, 0, 0);
        } else {
            startLogicForSetView(2, false, 0, null);
            this.binding.button2.setText("Общение");
            this.binding.button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_chat_1_s24, 0, 0, 0);
            this.binding.button4.setText("Социальные");
            this.binding.button4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_exchange_1_s24, 0, 0, 0);
            this.binding.button6.setText("Рабочие");
            this.binding.button6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_star_1_s24, 0, 0, 0);
        }
        setPlayersInfo(playersNick, playersId);
    }

    public final void setPlayersInfo(@NotNull String playersNick, int playersId) {
        Intrinsics.checkNotNullParameter(playersNick, "playersNick");
        TextView textView = this.binding.buttonWithNickname;
        JNIActivity jNIActivity = this.mainActivity;
        textView.setText(jNIActivity != null ? jNIActivity.getString(R.string.common_str_with_str_in_baskets, playersNick, String.valueOf(playersId)) : null);
    }

    public final void updateButtonsText(int type, int i) {
        if (type == 1) {
            this.thisActionsList = this.root.getThisListWithOrganizationMain();
        } else if (type == 2) {
            this.thisActionsList = this.root.getThisListWithSocialMain();
        } else if (type == 3) {
            this.thisActionsList = this.root.getThisListWithCommunicationMain();
        } else if (type == 4) {
            setStartButtons(this.root.getPlayersNick(), this.root.getPlayersId(), this.root.getPlayerInOrganization());
            return;
        }
        int size = this.thisActionsList.size();
        boolean z = false;
        if (size <= 6) {
            startLogicForSetView(size, false, type, this.thisActionsList);
            return;
        }
        int i2 = 0;
        for (SocialInteraction socialInteraction : this.thisActionsList) {
            if (socialInteraction.getPage() == i) {
                i2++;
            }
            if (socialInteraction.getPage() > i) {
                z = true;
            }
        }
        if (z) {
            i2++;
        }
        startLogicForSetView(i2, z, type, getIntermediateListWithActions(this.thisActionsList, i));
    }

    public final List<SocialInteraction> getIntermediateListWithActions(List<SocialInteraction> listWithActions, int i) {
        ArrayList arrayList = new ArrayList();
        for (SocialInteraction socialInteraction : listWithActions) {
            if (socialInteraction.getPage() == i) {
                arrayList.add(socialInteraction);
            }
        }
        return arrayList;
    }
}

