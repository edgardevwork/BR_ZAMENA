package org.apache.commons.compress.compressors.bzip2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.GpsStatusWrapper;
import androidx.core.view.InputDeviceCompat;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.MetadataUtil;
import androidx.media3.extractor.p007ts.H262Reader;
import androidx.media3.extractor.p007ts.H263Reader;
import androidx.media3.extractor.p007ts.PsExtractor;
import androidx.media3.extractor.p007ts.TsBinarySearchSeeker;
import androidx.media3.extractor.p007ts.UserDataReader;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassUtils;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.apache.http.HttpStatus;

/* loaded from: classes6.dex */
public final class Rand {
    public static final int[] RNUMS = {619, 720, 127, 481, 931, 816, 813, 233, 566, 247, 985, 724, HttpStatus.SC_RESET_CONTENT, 454, 863, 491, 741, 242, 949, 214, 733, 859, 335, 708, 621, 574, 73, 654, 730, 472, HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 436, 278, 496, 867, 210, 399, 680, 480, 51, 878, 465, 811, MetadataUtil.TYPE_TOP_BYTE_COPYRIGHT, 869, 675, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, 697, 867, 561, 862, 687, 507, 283, 482, 129, 807, 591, 733, 623, 150, MatroskaExtractor.ID_BLOCK_ADD_ID, 59, 379, 684, 877, 625, MetadataUtil.TYPE_TOP_BYTE_COPYRIGHT, Constants.ID_TACKLE_2, 105, 170, TypedValues.MotionType.TYPE_PATHMOTION_ARC, 520, 932, 727, TarConstants.XSTAR_ATIME_OFFSET, 693, TypedValues.CycleType.TYPE_WAVE_PHASE, MatroskaExtractor.ID_TRACK_ENTRY, 647, 73, 122, 335, 530, PsExtractor.PACK_START_CODE, 853, 695, GifHeaderParser.LABEL_GRAPHIC_CONTROL_EXTENSION, 445, 515, 909, 545, 703, 919, 874, 474, 882, 500, 594, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 641, 801, 220, 162, 819, 984, 589, InputDeviceCompat.SOURCE_DPAD, 495, 799, MatroskaExtractor.ID_BLOCK, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, 958, 533, 221, 400, 386, 867, 600, 782, 382, 596, HttpStatus.SC_REQUEST_URI_TOO_LONG, BcBands.LOOKUPSWITCH, 516, 375, 682, 485, 911, 276, 98, 553, MatroskaExtractor.ID_SIMPLE_BLOCK, 354, 666, 933, 424, 341, 533, 870, 227, 730, 475, MatroskaExtractor.ID_PIXEL_HEIGHT, TarConstants.VERSION_OFFSET, 647, 537, 686, 600, 224, 469, 68, 770, 919, 190, 373, 294, 822, 808, 206, H262Reader.START_GROUP, 943, 795, 384, 383, 461, 404, 758, 839, 887, 715, 67, 618, 276, 204, 918, 873, 777, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, 560, 951, 160, 578, 722, 79, 804, 96, HttpStatus.SC_CONFLICT, 713, TsBinarySearchSeeker.MINIMUM_SEARCH_RANGE_BYTES, 652, 934, 970, 447, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 353, 859, BlackPassUtils.CAR_AWARD_ID_672, 112, 785, Constants.ID_TACKLE_4, 863, 803, 350, 139, 93, 354, 99, 820, 908, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 772, Cea708Decoder.COMMAND_DF2, DefaultImageHeaderParser.ORIENTATION_TAG_TYPE, 580, H262Reader.START_GROUP, 79, 626, 630, 742, 653, 282, 762, 623, 680, 81, 927, 626, 789, 125, HttpStatus.SC_LENGTH_REQUIRED, 521, 938, 300, 821, 78, 343, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 128, 250, 170, 774, 972, 275, 999, 639, 495, 78, 352, 126, 857, 956, 358, 619, 580, 124, 737, 594, TypedValues.TransitionType.TYPE_FROM, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 669, 112, 134, 694, 363, 992, 809, 743, 168, 974, 944, 375, 748, 52, 600, 747, Constants.ID_TACKLE_1, H263Reader.START_CODE_VALUE_VOP, 862, 81, 344, 805, 988, 739, 511, 655, 814, 334, GifHeaderParser.LABEL_GRAPHIC_CONTROL_EXTENSION, 515, 897, 955, 664, 981, 649, 113, 974, 459, 893, 228, 433, 837, 553, 268, 926, 240, 102, 654, 459, 51, 686, 754, 806, 760, UnixStat.DEFAULT_DIR_PERM, 403, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, 394, 687, 700, 946, BlackPassUtils.CAR_AWARD_ID_670, 656, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 738, 392, 760, 799, 887, 653, 978, 321, MpegAudioUtil.SAMPLES_PER_FRAME_L3_V2, 617, 626, 502, 894, 679, 243, 440, 680, 879, 194, 572, 640, 724, 926, 56, 204, 700, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, Cea708Decoder.COMMAND_SWA, 457, 449, 797, 195, 791, 558, 945, 679, 297, 59, 87, 824, 713, 663, HttpStatus.SC_PRECONDITION_FAILED, 693, 342, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO, 134, 108, 571, 364, 631, 212, MatroskaExtractor.ID_TRACK_ENTRY, Constants.ID_TACKLE_2, 304, 329, 343, 97, 430, 751, 497, 314, 983, 374, 822, 928, Cea708Decoder.COMMAND_DLW, 206, 73, TarConstants.VERSION_OFFSET, 980, 736, 876, 478, 430, 305, 170, 514, 364, 692, 829, 82, 855, 953, 676, 246, 369, 970, 294, 750, 807, 827, 150, 790, 288, 923, 804, 378, MatroskaExtractor.ID_TRACK_NUMBER, 828, 592, 281, 565, 555, 710, 82, 896, 831, 547, 261, 524, 462, 293, 465, 502, 56, 661, 821, 976, 991, 658, 869, TypedValues.Custom.TYPE_DIMENSION, 758, 745, GpsStatusWrapper.QZSS_SVID_MIN, 768, LauncherConstants.ADDITIONAL_FREE_SPACE, TypedValues.MotionType.TYPE_DRAW_PATH, 933, 378, 286, MatroskaExtractor.ID_TRACK_NUMBER, 979, 792, 961, 61, 688, 793, Constants.ID_TACKLE_3, 986, 403, 106, 366, TypedValues.Custom.TYPE_DIMENSION, Constants.ID_TACKLE_3, 372, 567, 466, UserDataReader.USER_DATA_START_CODE, Constants.ID_TACKLE_4, 210, 389, LauncherConstants.ADDITIONAL_FREE_SPACE, 919, 135, 780, 773, 635, 389, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 100, 626, 958, MatroskaExtractor.ID_BLOCK_ADDITIONAL, 504, 920, 176, GpsStatusWrapper.QZSS_SVID_MIN, 713, 857, 265, 203, 50, 668, 108, Constants.ID_TACKLE_4, 990, 626, BcBands.MULTIANEWARRAY, TypedValues.PositionType.TYPE_POSITION_TYPE, 357, 358, 850, 858, 364, 936, 638};

    public static int rNums(int i) {
        return RNUMS[i];
    }
}
