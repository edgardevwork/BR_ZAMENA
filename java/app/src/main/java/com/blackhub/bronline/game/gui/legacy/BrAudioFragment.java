package com.blackhub.bronline.game.gui.legacy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.JNIHelper;
import com.bless.client.R;

/* loaded from: classes.dex */
public class BrAudioFragment extends Fragment {
    public static int mIsActivePlaying;
    public String mActiveName;
    public Animation mAnim;
    public Button mBack;
    public byte mButtStatus;
    public LinearLayout mCurrent;
    public ImageView mCurrentBut;
    public ImageView mCurrentExp;
    public TextView mCurrentName;
    public boolean mIsActiveEXP;
    public boolean mIsArtistsList;
    public boolean mIsInited;
    public Button mLeftArrow;
    public String[] mMusicNames;
    public int mNum;
    public int mPage;
    public TextView mPageText;
    public BrAudioDialog mParent;
    public int[] mPrice;
    public Button mRightArrow;
    public FrameLayout mSearchBut;
    public EditText mSearchLine;
    public int mType;
    public JNIActivity mContext = null;
    public LinearLayout[] mElems = new LinearLayout[4];
    public TextView[] mNames = new TextView[4];
    public FrameLayout[] mFrames = new FrameLayout[4];
    public ImageView[] mDownloads = new ImageView[4];

    public static BrAudioFragment createInstance(int type, BrAudioDialog parent) {
        BrAudioFragment brAudioFragment = new BrAudioFragment();
        brAudioFragment.mType = type;
        brAudioFragment.mParent = parent;
        return brAudioFragment;
    }

    public void updatePlayAct() {
        if (mIsActivePlaying == this.mType) {
            this.mCurrentBut.setImageResource(R.drawable.ic_pause);
        } else {
            this.mCurrentBut.setImageResource(R.drawable.ic_play);
        }
    }

    public void setParametrs(int page, boolean isArtists, int num, byte butts, String sActiveName, boolean isEXP, String[] aNames, int[] aPrice) {
        int[] iArr;
        this.mNum = num;
        this.mActiveName = sActiveName;
        this.mButtStatus = butts;
        this.mIsActiveEXP = isEXP;
        this.mMusicNames = aNames;
        this.mPrice = aPrice;
        this.mPage = page;
        this.mIsArtistsList = isArtists;
        this.mSearchLine.setCursorVisible(false);
        ((InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(this.mSearchLine.getWindowToken(), 0);
        this.mBack.setVisibility(4);
        this.mLeftArrow.setAlpha(0.4f);
        this.mRightArrow.setAlpha(0.4f);
        if ((this.mButtStatus & 1) == 1) {
            this.mRightArrow.setAlpha(1.0f);
        }
        if (((this.mButtStatus >> 1) & 1) == 1) {
            this.mLeftArrow.setAlpha(1.0f);
        }
        if (((this.mButtStatus >> 2) & 1) == 1) {
            this.mBack.setVisibility(0);
        }
        this.mPageText.setText("Страница " + this.mPage);
        this.mCurrent.setVisibility(0);
        this.mCurrentName.setText(this.mActiveName);
        if (this.mActiveName != "") {
            if (this.mIsActiveEXP) {
                this.mCurrentExp.setVisibility(0);
            } else {
                this.mCurrentExp.setVisibility(4);
            }
            if (mIsActivePlaying == this.mType) {
                this.mCurrentBut.setImageResource(R.drawable.ic_pause);
            } else {
                this.mCurrentBut.setImageResource(R.drawable.ic_play);
            }
        } else {
            this.mCurrentExp.setVisibility(4);
            this.mCurrentBut.setImageResource(R.drawable.ic_play);
        }
        for (int i = 0; i < 4; i++) {
            this.mElems[i].setVisibility(4);
        }
        for (int i2 = 0; i2 < this.mNum; i2++) {
            this.mElems[i2].setVisibility(0);
            this.mNames[i2].setText(this.mMusicNames[i2]);
            this.mFrames[i2].setVisibility(0);
            boolean z = this.mIsArtistsList;
            if (!z && (iArr = this.mPrice) != null && iArr[i2] != 0) {
                this.mDownloads[i2].setVisibility(0);
                TextView textView = (TextView) this.mFrames[i2].getChildAt(0);
                ImageView imageView = (ImageView) this.mFrames[i2].getChildAt(1);
                textView.setVisibility(0);
                textView.setText("" + this.mPrice[i2] + " ₽");
                imageView.setVisibility(4);
            } else if (!z) {
                this.mDownloads[i2].setVisibility(4);
                TextView textView2 = (TextView) this.mFrames[i2].getChildAt(0);
                ImageView imageView2 = (ImageView) this.mFrames[i2].getChildAt(1);
                textView2.setVisibility(4);
                imageView2.setVisibility(0);
                if (this.mNames[i2].getText() == this.mActiveName && mIsActivePlaying == this.mType) {
                    imageView2.setImageResource(R.drawable.ic_pause_gradient);
                } else {
                    imageView2.setImageResource(R.drawable.ic_play_gradient);
                }
            } else {
                this.mFrames[i2].setVisibility(4);
                this.mDownloads[i2].setVisibility(4);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mContext = (JNIActivity) getActivity();
        View viewInflate = inflater.inflate(R.layout.br_audio_fragment, container, false);
        this.mAnim = AnimationUtils.loadAnimation(getContext(), R.anim.button_click);
        EditText editText = (EditText) viewInflate.findViewById(R.id.br_audio_search);
        this.mSearchLine = editText;
        JNIHelper.fixEditTextForAndroid10Xiaomi(editText);
        this.mPageText = (TextView) viewInflate.findViewById(R.id.br_audio_page);
        this.mLeftArrow = (Button) viewInflate.findViewById(R.id.br_audio_left_arrow);
        this.mRightArrow = (Button) viewInflate.findViewById(R.id.br_audio_right_arrow);
        this.mBack = (Button) viewInflate.findViewById(R.id.br_audio_back);
        this.mCurrent = (LinearLayout) viewInflate.findViewById(R.id.br_audio_current);
        this.mCurrentName = (TextView) viewInflate.findViewById(R.id.br_audio_current_name);
        this.mCurrentExp = (ImageView) viewInflate.findViewById(R.id.br_audio_current_exp);
        this.mCurrentBut = (ImageView) viewInflate.findViewById(R.id.br_audio_current_but);
        this.mSearchBut = (FrameLayout) viewInflate.findViewById(R.id.br_audio_search_but);
        this.mElems[0] = (LinearLayout) viewInflate.findViewById(R.id.br_audio_elem_0);
        this.mElems[1] = (LinearLayout) viewInflate.findViewById(R.id.br_audio_elem_1);
        this.mElems[2] = (LinearLayout) viewInflate.findViewById(R.id.br_audio_elem_2);
        this.mElems[3] = (LinearLayout) viewInflate.findViewById(R.id.br_audio_elem_3);
        this.mNames[0] = (TextView) viewInflate.findViewById(R.id.br_audio_name_0);
        this.mNames[1] = (TextView) viewInflate.findViewById(R.id.br_audio_name_1);
        this.mNames[2] = (TextView) viewInflate.findViewById(R.id.br_audio_name_2);
        this.mNames[3] = (TextView) viewInflate.findViewById(R.id.br_audio_name_3);
        this.mFrames[0] = (FrameLayout) viewInflate.findViewById(R.id.br_audio_frame_0);
        this.mFrames[1] = (FrameLayout) viewInflate.findViewById(R.id.br_audio_frame_1);
        this.mFrames[2] = (FrameLayout) viewInflate.findViewById(R.id.br_audio_frame_2);
        this.mFrames[3] = (FrameLayout) viewInflate.findViewById(R.id.br_audio_frame_3);
        this.mDownloads[0] = (ImageView) viewInflate.findViewById(R.id.br_audio_download_0);
        this.mDownloads[1] = (ImageView) viewInflate.findViewById(R.id.br_audio_download_1);
        this.mDownloads[2] = (ImageView) viewInflate.findViewById(R.id.br_audio_download_2);
        this.mDownloads[3] = (ImageView) viewInflate.findViewById(R.id.br_audio_download_3);
        if (this.mType == 1) {
            ((ViewGroup) viewInflate.findViewById(R.id.br_audio_search_layout)).setVisibility(4);
        }
        for (int i = 0; i < 4; i++) {
            this.mElems[i].setVisibility(4);
        }
        this.mCurrent.setVisibility(4);
        this.mBack.setVisibility(4);
        this.mSearchLine.clearFocus();
        this.mSearchLine.setCursorVisible(false);
        this.mSearchLine.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrAudioFragment.1
            public ViewOnClickListenerC42121() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BrAudioFragment.this.mSearchLine.setCursorVisible(true);
            }
        });
        this.mLeftArrow.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrAudioFragment.2
            public ViewOnClickListenerC42132() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view.getAlpha() == 1.0f) {
                    BrAudioFragment.this.mSearchLine.setCursorVisible(false);
                    ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    view.startAnimation(BrAudioFragment.this.mAnim);
                    BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, 5, "");
                }
            }
        });
        this.mRightArrow.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrAudioFragment.3
            public ViewOnClickListenerC42143() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view.getAlpha() == 1.0f) {
                    BrAudioFragment.this.mSearchLine.setCursorVisible(false);
                    ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    view.startAnimation(BrAudioFragment.this.mAnim);
                    BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, 6, "");
                }
            }
        });
        this.mBack.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrAudioFragment.4
            public ViewOnClickListenerC42154() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BrAudioFragment.this.mSearchLine.setCursorVisible(false);
                ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                view.startAnimation(BrAudioFragment.this.mAnim);
                BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, 7, "");
            }
        });
        this.mCurrentBut.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrAudioFragment.5
            public ViewOnClickListenerC42165() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BrAudioFragment.this.mSearchLine.setCursorVisible(false);
                ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                view.startAnimation(BrAudioFragment.this.mAnim);
                BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, 4, "");
            }
        });
        this.mSearchBut.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrAudioFragment.6
            public ViewOnClickListenerC42176() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BrAudioFragment.this.mSearchLine.setCursorVisible(false);
                ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                view.startAnimation(BrAudioFragment.this.mAnim);
                BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, 8, BrAudioFragment.this.mSearchLine.getText().toString());
            }
        });
        for (int i2 = 0; i2 < 4; i2++) {
            this.mElems[i2].setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrAudioFragment.7
                public ViewOnClickListenerC42187() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    BrAudioFragment.this.mSearchLine.setCursorVisible(false);
                    ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    boolean unused = BrAudioFragment.this.mIsArtistsList;
                    int i3 = 0;
                    for (int i4 = 0; i4 < 4; i4++) {
                        if (BrAudioFragment.this.mElems[i4] == view) {
                            i3 = i4;
                        }
                    }
                    view.startAnimation(BrAudioFragment.this.mAnim);
                    BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, (byte) i3, "");
                }
            });
        }
        this.mIsInited = true;
        return viewInflate;
    }

    /* renamed from: com.blackhub.bronline.game.gui.legacy.BrAudioFragment$1 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC42121 implements View.OnClickListener {
        public ViewOnClickListenerC42121() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BrAudioFragment.this.mSearchLine.setCursorVisible(true);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.legacy.BrAudioFragment$2 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC42132 implements View.OnClickListener {
        public ViewOnClickListenerC42132() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getAlpha() == 1.0f) {
                BrAudioFragment.this.mSearchLine.setCursorVisible(false);
                ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                view.startAnimation(BrAudioFragment.this.mAnim);
                BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, 5, "");
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.legacy.BrAudioFragment$3 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC42143 implements View.OnClickListener {
        public ViewOnClickListenerC42143() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getAlpha() == 1.0f) {
                BrAudioFragment.this.mSearchLine.setCursorVisible(false);
                ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                view.startAnimation(BrAudioFragment.this.mAnim);
                BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, 6, "");
            }
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.legacy.BrAudioFragment$4 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC42154 implements View.OnClickListener {
        public ViewOnClickListenerC42154() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BrAudioFragment.this.mSearchLine.setCursorVisible(false);
            ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            view.startAnimation(BrAudioFragment.this.mAnim);
            BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, 7, "");
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.legacy.BrAudioFragment$5 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC42165 implements View.OnClickListener {
        public ViewOnClickListenerC42165() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BrAudioFragment.this.mSearchLine.setCursorVisible(false);
            ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            view.startAnimation(BrAudioFragment.this.mAnim);
            BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, 4, "");
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.legacy.BrAudioFragment$6 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC42176 implements View.OnClickListener {
        public ViewOnClickListenerC42176() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BrAudioFragment.this.mSearchLine.setCursorVisible(false);
            ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            view.startAnimation(BrAudioFragment.this.mAnim);
            BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, 8, BrAudioFragment.this.mSearchLine.getText().toString());
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.legacy.BrAudioFragment$7 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC42187 implements View.OnClickListener {
        public ViewOnClickListenerC42187() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BrAudioFragment.this.mSearchLine.setCursorVisible(false);
            ((InputMethodManager) BrAudioFragment.this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            boolean unused = BrAudioFragment.this.mIsArtistsList;
            int i3 = 0;
            for (int i4 = 0; i4 < 4; i4++) {
                if (BrAudioFragment.this.mElems[i4] == view) {
                    i3 = i4;
                }
            }
            view.startAnimation(BrAudioFragment.this.mAnim);
            BrAudioFragment.this.mParent.onAudioGuiButClicked((byte) BrAudioFragment.this.mType, (byte) i3, "");
        }
    }
}
