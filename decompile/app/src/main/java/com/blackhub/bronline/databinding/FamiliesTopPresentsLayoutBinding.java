package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FamiliesTopPresentsLayoutBinding implements ViewBinding {

    @NonNull
    public final View accessories1Bg;

    @NonNull
    public final ImageView accessories1Item;

    @NonNull
    public final TextView accessories1Title;

    @NonNull
    public final TextView accessories1ValueDays;

    @NonNull
    public final View accessories2Bg;

    @NonNull
    public final ImageView accessories2Item;

    @NonNull
    public final TextView accessories2Title;

    @NonNull
    public final TextView accessories2ValueDays;

    @NonNull
    public final View accessories3Bg;

    @NonNull
    public final ImageView accessories3Item;

    @NonNull
    public final TextView accessories3Title;

    @NonNull
    public final TextView accessories3ValueDays;

    @NonNull
    public final ImageView cup1;

    @NonNull
    public final ImageView cup2;

    @NonNull
    public final ImageView cup3;

    @NonNull
    public final RecyclerView presents1;

    @NonNull
    public final RecyclerView presents2;

    @NonNull
    public final RecyclerView presents3;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView title1;

    @NonNull
    public final TextView title2;

    @NonNull
    public final TextView title3;

    @NonNull
    public final View top1Position;

    @NonNull
    public final View top2Position;

    @NonNull
    public final View top3Position;

    public FamiliesTopPresentsLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View accessories1Bg, @NonNull ImageView accessories1Item, @NonNull TextView accessories1Title, @NonNull TextView accessories1ValueDays, @NonNull View accessories2Bg, @NonNull ImageView accessories2Item, @NonNull TextView accessories2Title, @NonNull TextView accessories2ValueDays, @NonNull View accessories3Bg, @NonNull ImageView accessories3Item, @NonNull TextView accessories3Title, @NonNull TextView accessories3ValueDays, @NonNull ImageView cup1, @NonNull ImageView cup2, @NonNull ImageView cup3, @NonNull RecyclerView presents1, @NonNull RecyclerView presents2, @NonNull RecyclerView presents3, @NonNull TextView title1, @NonNull TextView title2, @NonNull TextView title3, @NonNull View top1Position, @NonNull View top2Position, @NonNull View top3Position) {
        this.rootView = rootView;
        this.accessories1Bg = accessories1Bg;
        this.accessories1Item = accessories1Item;
        this.accessories1Title = accessories1Title;
        this.accessories1ValueDays = accessories1ValueDays;
        this.accessories2Bg = accessories2Bg;
        this.accessories2Item = accessories2Item;
        this.accessories2Title = accessories2Title;
        this.accessories2ValueDays = accessories2ValueDays;
        this.accessories3Bg = accessories3Bg;
        this.accessories3Item = accessories3Item;
        this.accessories3Title = accessories3Title;
        this.accessories3ValueDays = accessories3ValueDays;
        this.cup1 = cup1;
        this.cup2 = cup2;
        this.cup3 = cup3;
        this.presents1 = presents1;
        this.presents2 = presents2;
        this.presents3 = presents3;
        this.title1 = title1;
        this.title2 = title2;
        this.title3 = title3;
        this.top1Position = top1Position;
        this.top2Position = top2Position;
        this.top3Position = top3Position;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesTopPresentsLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesTopPresentsLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.families_top_presents_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FamiliesTopPresentsLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.accessories_1_bg;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.accessories_1_bg);
        if (viewFindChildViewById != null) {
            i = R.id.accessories_1_item;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.accessories_1_item);
            if (imageView != null) {
                i = R.id.accessories_1_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.accessories_1_title);
                if (textView != null) {
                    i = R.id.accessories_1_value_days;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.accessories_1_value_days);
                    if (textView2 != null) {
                        i = R.id.accessories_2_bg;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.accessories_2_bg);
                        if (viewFindChildViewById2 != null) {
                            i = R.id.accessories_2_item;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.accessories_2_item);
                            if (imageView2 != null) {
                                i = R.id.accessories_2_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.accessories_2_title);
                                if (textView3 != null) {
                                    i = R.id.accessories_2_value_days;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.accessories_2_value_days);
                                    if (textView4 != null) {
                                        i = R.id.accessories_3_bg;
                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.accessories_3_bg);
                                        if (viewFindChildViewById3 != null) {
                                            i = R.id.accessories_3_item;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.accessories_3_item);
                                            if (imageView3 != null) {
                                                i = R.id.accessories_3_title;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.accessories_3_title);
                                                if (textView5 != null) {
                                                    i = R.id.accessories_3_value_days;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.accessories_3_value_days);
                                                    if (textView6 != null) {
                                                        i = R.id.cup_1;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cup_1);
                                                        if (imageView4 != null) {
                                                            i = R.id.cup_2;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cup_2);
                                                            if (imageView5 != null) {
                                                                i = R.id.cup_3;
                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cup_3);
                                                                if (imageView6 != null) {
                                                                    i = R.id.presents_1;
                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.presents_1);
                                                                    if (recyclerView != null) {
                                                                        i = R.id.presents_2;
                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.presents_2);
                                                                        if (recyclerView2 != null) {
                                                                            i = R.id.presents_3;
                                                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.presents_3);
                                                                            if (recyclerView3 != null) {
                                                                                i = R.id.title_1;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_1);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.title_2;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_2);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.title_3;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_3);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.top_1_position;
                                                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.top_1_position);
                                                                                            if (viewFindChildViewById4 != null) {
                                                                                                i = R.id.top_2_position;
                                                                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.top_2_position);
                                                                                                if (viewFindChildViewById5 != null) {
                                                                                                    i = R.id.top_3_position;
                                                                                                    View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.top_3_position);
                                                                                                    if (viewFindChildViewById6 != null) {
                                                                                                        return new FamiliesTopPresentsLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, imageView, textView, textView2, viewFindChildViewById2, imageView2, textView3, textView4, viewFindChildViewById3, imageView3, textView5, textView6, imageView4, imageView5, imageView6, recyclerView, recyclerView2, recyclerView3, textView7, textView8, textView9, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
