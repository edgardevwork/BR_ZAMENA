package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.UIContainer;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class InventoryDialogBinding implements ViewBinding {

    @NonNull
    public final View bottomBlack;

    @NonNull
    public final TextView helpText1;

    @NonNull
    public final TextView helpText2;

    @NonNull
    public final TextView helpText3;

    @NonNull
    public final UIContainer invContainer;

    @NonNull
    public final ImageButton invMainButtonExit;

    @NonNull
    public final RecyclerView invMainButtons;

    @NonNull
    public final View invMainButtonsBlock;

    @NonNull
    public final View leftBlack;

    @NonNull
    public final View rightBlack;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View topBlack;

    @NonNull
    public final View window;

    public InventoryDialogBinding(@NonNull ConstraintLayout rootView, @NonNull View bottomBlack, @NonNull TextView helpText1, @NonNull TextView helpText2, @NonNull TextView helpText3, @NonNull UIContainer invContainer, @NonNull ImageButton invMainButtonExit, @NonNull RecyclerView invMainButtons, @NonNull View invMainButtonsBlock, @NonNull View leftBlack, @NonNull View rightBlack, @NonNull View topBlack, @NonNull View window) {
        this.rootView = rootView;
        this.bottomBlack = bottomBlack;
        this.helpText1 = helpText1;
        this.helpText2 = helpText2;
        this.helpText3 = helpText3;
        this.invContainer = invContainer;
        this.invMainButtonExit = invMainButtonExit;
        this.invMainButtons = invMainButtons;
        this.invMainButtonsBlock = invMainButtonsBlock;
        this.leftBlack = leftBlack;
        this.rightBlack = rightBlack;
        this.topBlack = topBlack;
        this.window = window;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static InventoryDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static InventoryDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.inventory_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static InventoryDialogBinding bind(@NonNull View rootView) {
        int i = R.id.bottom_black;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_black);
        if (viewFindChildViewById != null) {
            i = R.id.help_text_1;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.help_text_1);
            if (textView != null) {
                i = R.id.help_text_2;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.help_text_2);
                if (textView2 != null) {
                    i = R.id.help_text_3;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.help_text_3);
                    if (textView3 != null) {
                        i = R.id.inv_container;
                        UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.inv_container);
                        if (uIContainer != null) {
                            i = R.id.inv_main_button_exit;
                            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.inv_main_button_exit);
                            if (imageButton != null) {
                                i = R.id.inv_main_buttons;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.inv_main_buttons);
                                if (recyclerView != null) {
                                    i = R.id.inv_main_buttons_block;
                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.inv_main_buttons_block);
                                    if (viewFindChildViewById2 != null) {
                                        i = R.id.left_black;
                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.left_black);
                                        if (viewFindChildViewById3 != null) {
                                            i = R.id.right_black;
                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.right_black);
                                            if (viewFindChildViewById4 != null) {
                                                i = R.id.top_black;
                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.top_black);
                                                if (viewFindChildViewById5 != null) {
                                                    i = R.id.window;
                                                    View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.window);
                                                    if (viewFindChildViewById6 != null) {
                                                        return new InventoryDialogBinding((ConstraintLayout) rootView, viewFindChildViewById, textView, textView2, textView3, uIContainer, imageButton, recyclerView, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6);
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
