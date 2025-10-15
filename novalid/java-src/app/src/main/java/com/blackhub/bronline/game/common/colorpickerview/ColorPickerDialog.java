package com.blackhub.bronline.game.common.colorpickerview;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import com.blackhub.bronline.databinding.LayoutColorpickerColorpickerviewSkydovesBinding;
import com.blackhub.bronline.game.common.colorpickerview.ColorPickerDialog;
import com.blackhub.bronline.game.common.colorpickerview.listeners.ColorEnvelopeListener;
import com.blackhub.bronline.game.common.colorpickerview.listeners.ColorListener;
import com.blackhub.bronline.game.common.colorpickerview.listeners.ColorPickerViewListener;
import com.blackhub.bronline.game.common.colorpickerview.preference.ColorPickerPreferenceManager;
import com.blackhub.bronline.game.common.colorpickerview.sliders.AlphaSlideBar;
import com.blackhub.bronline.game.common.colorpickerview.sliders.BrightnessSlideBar;

/* loaded from: classes7.dex */
public class ColorPickerDialog extends AlertDialog {
    public ColorPickerView colorPickerView;

    public ColorPickerDialog(Context context) {
        super(context);
    }

    /* loaded from: classes3.dex */
    public static class Builder extends AlertDialog.Builder {
        public int bottomSpace;
        public ColorPickerView colorPickerView;
        public LayoutColorpickerColorpickerviewSkydovesBinding dialogBinding;
        public boolean shouldAttachAlphaSlideBar;
        public boolean shouldAttachBrightnessSlideBar;

        public static /* synthetic */ void lambda$onCreate$0(ColorEnvelope colorEnvelope, boolean z) {
        }

        public Builder(Context context) {
            super(context);
            this.shouldAttachAlphaSlideBar = true;
            this.shouldAttachBrightnessSlideBar = true;
            this.bottomSpace = SizeUtils.dp2Px(getContext(), 10);
            onCreate();
        }

        public Builder(Context context, int themeResId) {
            super(context, themeResId);
            this.shouldAttachAlphaSlideBar = true;
            this.shouldAttachBrightnessSlideBar = true;
            this.bottomSpace = SizeUtils.dp2Px(getContext(), 10);
            onCreate();
        }

        public final void onCreate() {
            LayoutColorpickerColorpickerviewSkydovesBinding layoutColorpickerColorpickerviewSkydovesBindingInflate = LayoutColorpickerColorpickerviewSkydovesBinding.inflate(LayoutInflater.from(getContext()), null, false);
            this.dialogBinding = layoutColorpickerColorpickerviewSkydovesBindingInflate;
            ColorPickerView colorPickerView = layoutColorpickerColorpickerviewSkydovesBindingInflate.colorPickerView;
            this.colorPickerView = colorPickerView;
            colorPickerView.attachAlphaSlider(layoutColorpickerColorpickerviewSkydovesBindingInflate.alphaSlideBar);
            this.colorPickerView.attachBrightnessSlider(this.dialogBinding.brightnessSlideBar);
            this.colorPickerView.setColorListener(new ColorEnvelopeListener() { // from class: com.blackhub.bronline.game.common.colorpickerview.ColorPickerDialog$Builder$$ExternalSyntheticLambda0
                @Override // com.blackhub.bronline.game.common.colorpickerview.listeners.ColorEnvelopeListener
                public final void onColorSelected(ColorEnvelope colorEnvelope, boolean z) {
                    ColorPickerDialog.Builder.lambda$onCreate$0(colorEnvelope, z);
                }
            });
            super.setView((View) this.dialogBinding.getRoot());
        }

        public ColorPickerView getColorPickerView() {
            return this.colorPickerView;
        }

        public Builder setColorPickerView(ColorPickerView colorPickerView) {
            this.dialogBinding.containerColorPicker.removeAllViews();
            this.dialogBinding.containerColorPicker.addView(colorPickerView);
            return this;
        }

        public Builder attachAlphaSlideBar(boolean value) {
            this.shouldAttachAlphaSlideBar = value;
            return this;
        }

        public Builder attachBrightnessSlideBar(boolean value) {
            this.shouldAttachBrightnessSlideBar = value;
            return this;
        }

        public Builder setPreferenceName(String preferenceName) {
            if (getColorPickerView() != null) {
                getColorPickerView().setPreferenceName(preferenceName);
            }
            return this;
        }

        public Builder setBottomSpace(int bottomSpace) {
            this.bottomSpace = SizeUtils.dp2Px(getContext(), bottomSpace);
            return this;
        }

        public Builder setPositiveButton(int textId, final ColorPickerViewListener colorListener) {
            super.setPositiveButton(textId, getOnClickListener(colorListener));
            return this;
        }

        public Builder setPositiveButton(CharSequence text, final ColorPickerViewListener colorListener) {
            super.setPositiveButton(text, getOnClickListener(colorListener));
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setNegativeButton(int textId, DialogInterface.OnClickListener listener) {
            super.setNegativeButton(textId, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setNegativeButton(CharSequence text, DialogInterface.OnClickListener listener) {
            super.setNegativeButton(text, listener);
            return this;
        }

        public final DialogInterface.OnClickListener getOnClickListener(final ColorPickerViewListener colorListener) {
            return new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.game.common.colorpickerview.ColorPickerDialog$Builder$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f$0.lambda$getOnClickListener$1(colorListener, dialogInterface, i);
                }
            };
        }

        public final /* synthetic */ void lambda$getOnClickListener$1(ColorPickerViewListener colorPickerViewListener, DialogInterface dialogInterface, int i) {
            if (colorPickerViewListener instanceof ColorListener) {
                ((ColorListener) colorPickerViewListener).onColorSelected(getColorPickerView().getColor(), true);
            } else if (colorPickerViewListener instanceof ColorEnvelopeListener) {
                ((ColorEnvelopeListener) colorPickerViewListener).onColorSelected(getColorPickerView().getColorEnvelope(), true);
            }
            if (getColorPickerView() != null) {
                ColorPickerPreferenceManager.getInstance(getContext()).saveColorPickerData(getColorPickerView());
            }
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        @NonNull
        public AlertDialog create() {
            if (getColorPickerView() != null) {
                this.dialogBinding.containerColorPicker.removeAllViews();
                this.dialogBinding.containerColorPicker.addView(getColorPickerView());
                AlphaSlideBar alphaSlideBar = getColorPickerView().getAlphaSlideBar();
                boolean z = this.shouldAttachAlphaSlideBar;
                if (z && alphaSlideBar != null) {
                    this.dialogBinding.containerAlphaSlideBar.removeAllViews();
                    this.dialogBinding.containerAlphaSlideBar.addView(alphaSlideBar);
                    getColorPickerView().attachAlphaSlider(alphaSlideBar);
                } else if (!z) {
                    this.dialogBinding.containerAlphaSlideBar.removeAllViews();
                }
                BrightnessSlideBar brightnessSlider = getColorPickerView().getBrightnessSlider();
                boolean z2 = this.shouldAttachBrightnessSlideBar;
                if (z2 && brightnessSlider != null) {
                    this.dialogBinding.containerBrightnessSlideBar.removeAllViews();
                    this.dialogBinding.containerBrightnessSlideBar.addView(brightnessSlider);
                    getColorPickerView().attachBrightnessSlider(brightnessSlider);
                } else if (!z2) {
                    this.dialogBinding.containerBrightnessSlideBar.removeAllViews();
                }
                if (!this.shouldAttachAlphaSlideBar && !this.shouldAttachBrightnessSlideBar) {
                    this.dialogBinding.spaceBottom.setVisibility(8);
                } else {
                    this.dialogBinding.spaceBottom.setVisibility(0);
                    this.dialogBinding.spaceBottom.getLayoutParams().height = this.bottomSpace;
                }
            }
            super.setView((View) this.dialogBinding.getRoot());
            return super.create();
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setTitle(int titleId) {
            super.setTitle(titleId);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setTitle(CharSequence title) {
            super.setTitle(title);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setCustomTitle(View customTitleView) {
            super.setCustomTitle(customTitleView);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setMessage(int messageId) {
            super.setMessage((CharSequence) getContext().getString(messageId));
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setMessage(CharSequence message) {
            super.setMessage(message);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setIcon(int iconId) {
            super.setIcon(iconId);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setIcon(Drawable icon) {
            super.setIcon(icon);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setIconAttribute(int attrId) {
            super.setIconAttribute(attrId);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setCancelable(boolean cancelable) {
            super.setCancelable(cancelable);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            super.setOnCancelListener(onCancelListener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            super.setOnDismissListener(onDismissListener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            super.setOnKeyListener(onKeyListener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setPositiveButton(int textId, DialogInterface.OnClickListener listener) {
            super.setPositiveButton(textId, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setPositiveButton(CharSequence text, DialogInterface.OnClickListener listener) {
            super.setPositiveButton(text, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setNeutralButton(int textId, DialogInterface.OnClickListener listener) {
            super.setNeutralButton(textId, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setNeutralButton(CharSequence text, DialogInterface.OnClickListener listener) {
            super.setNeutralButton(text, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setItems(int itemsId, DialogInterface.OnClickListener listener) {
            super.setItems(itemsId, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setItems(CharSequence[] items, DialogInterface.OnClickListener listener) {
            super.setItems(items, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setAdapter(ListAdapter adapter, DialogInterface.OnClickListener listener) {
            super.setAdapter(adapter, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener listener, String labelColumn) {
            super.setCursor(cursor, listener, labelColumn);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setMultiChoiceItems(int itemsId, boolean[] checkedItems, DialogInterface.OnMultiChoiceClickListener listener) {
            super.setMultiChoiceItems(itemsId, checkedItems, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setMultiChoiceItems(CharSequence[] items, boolean[] checkedItems, DialogInterface.OnMultiChoiceClickListener listener) {
            super.setMultiChoiceItems(items, checkedItems, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setMultiChoiceItems(Cursor cursor, String isCheckedColumn, String labelColumn, DialogInterface.OnMultiChoiceClickListener listener) {
            super.setMultiChoiceItems(cursor, isCheckedColumn, labelColumn, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setSingleChoiceItems(int itemsId, int checkedItem, DialogInterface.OnClickListener listener) {
            super.setSingleChoiceItems(itemsId, checkedItem, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setSingleChoiceItems(Cursor cursor, int checkedItem, String labelColumn, DialogInterface.OnClickListener listener) {
            super.setSingleChoiceItems(cursor, checkedItem, labelColumn, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setSingleChoiceItems(CharSequence[] items, int checkedItem, DialogInterface.OnClickListener listener) {
            super.setSingleChoiceItems(items, checkedItem, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setSingleChoiceItems(ListAdapter adapter, int checkedItem, DialogInterface.OnClickListener listener) {
            super.setSingleChoiceItems(adapter, checkedItem, listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener listener) {
            super.setOnItemSelectedListener(listener);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setView(int layoutResId) {
            super.setView(layoutResId);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public Builder setView(View view) {
            super.setView(view);
            return this;
        }
    }
}
