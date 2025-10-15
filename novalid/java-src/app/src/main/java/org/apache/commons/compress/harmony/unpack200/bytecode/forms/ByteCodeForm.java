package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import androidx.core.location.GpsStatusWrapper;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.MetadataUtil;
import androidx.media3.extractor.p007ts.H262Reader;
import androidx.media3.extractor.p007ts.H263Reader;
import androidx.media3.extractor.p007ts.PsExtractor;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.http.HttpStatus;

/* loaded from: classes7.dex */
public abstract class ByteCodeForm {
    public static final boolean WIDENED = true;
    public static final ByteCodeForm[] byteCodeArray;
    public static final Map<String, ByteCodeForm> byteCodesByName = new HashMap(256);
    public int firstOperandIndex;
    public final String name;
    public final int opcode;
    public int operandLength;
    public final int[] rewrite;

    public void fixUpByteCodeTargets(ByteCode byteCode, CodeAttribute codeAttribute) {
    }

    public boolean hasNoOperand() {
        return false;
    }

    public boolean nestedMustStartClassPool() {
        return false;
    }

    public abstract void setByteCodeOperands(ByteCode byteCode, OperandManager operandManager, int i);

    static {
        ByteCodeForm[] byteCodeFormArr = new ByteCodeForm[256];
        byteCodeArray = byteCodeFormArr;
        byteCodeFormArr[0] = new NoArgumentForm(0, "nop");
        byteCodeFormArr[1] = new NoArgumentForm(1, "aconst_null");
        byteCodeFormArr[2] = new NoArgumentForm(2, "iconst_m1");
        byteCodeFormArr[3] = new NoArgumentForm(3, "iconst_0");
        byteCodeFormArr[4] = new NoArgumentForm(4, "iconst_1");
        byteCodeFormArr[5] = new NoArgumentForm(5, "iconst_2");
        byteCodeFormArr[6] = new NoArgumentForm(6, "iconst_3");
        byteCodeFormArr[7] = new NoArgumentForm(7, "iconst_4");
        byteCodeFormArr[8] = new NoArgumentForm(8, "iconst_5");
        byteCodeFormArr[9] = new NoArgumentForm(9, "lconst_0");
        byteCodeFormArr[10] = new NoArgumentForm(10, "lconst_1");
        byteCodeFormArr[11] = new NoArgumentForm(11, "fconst_0");
        byteCodeFormArr[12] = new NoArgumentForm(12, "fconst_1");
        byteCodeFormArr[13] = new NoArgumentForm(13, "fconst_2");
        byteCodeFormArr[14] = new NoArgumentForm(14, "dconst_0");
        byteCodeFormArr[15] = new NoArgumentForm(15, "dconst_1");
        byteCodeFormArr[16] = new ByteForm(16, "bipush", new int[]{16, -1});
        byteCodeFormArr[17] = new ShortForm(17, "sipush", new int[]{17, -1, -1});
        byteCodeFormArr[18] = new StringRefForm(18, "ldc", new int[]{18, -1});
        byteCodeFormArr[19] = new StringRefForm(19, "ldc_w", new int[]{19, -1, -1}, true);
        byteCodeFormArr[20] = new LongForm(20, "ldc2_w", new int[]{20, -1, -1});
        byteCodeFormArr[21] = new LocalForm(21, "iload", new int[]{21, -1});
        byteCodeFormArr[22] = new LocalForm(22, "lload", new int[]{22, -1});
        byteCodeFormArr[23] = new LocalForm(23, "fload", new int[]{23, -1});
        byteCodeFormArr[24] = new LocalForm(24, "dload", new int[]{24, -1});
        byteCodeFormArr[25] = new LocalForm(25, "aload", new int[]{25, -1});
        byteCodeFormArr[26] = new NoArgumentForm(26, "iload_0");
        byteCodeFormArr[27] = new NoArgumentForm(27, "iload_1");
        byteCodeFormArr[28] = new NoArgumentForm(28, "iload_2");
        byteCodeFormArr[29] = new NoArgumentForm(29, "iload_3");
        byteCodeFormArr[30] = new NoArgumentForm(30, "lload_0");
        byteCodeFormArr[31] = new NoArgumentForm(31, "lload_1");
        byteCodeFormArr[32] = new NoArgumentForm(32, "lload_2");
        byteCodeFormArr[33] = new NoArgumentForm(33, "lload_3");
        byteCodeFormArr[34] = new NoArgumentForm(34, "fload_0");
        byteCodeFormArr[35] = new NoArgumentForm(35, "fload_1");
        byteCodeFormArr[36] = new NoArgumentForm(36, "fload_2");
        byteCodeFormArr[37] = new NoArgumentForm(37, "fload_3");
        byteCodeFormArr[38] = new NoArgumentForm(38, "dload_0");
        byteCodeFormArr[39] = new NoArgumentForm(39, "dload_1");
        byteCodeFormArr[40] = new NoArgumentForm(40, "dload_2");
        byteCodeFormArr[41] = new NoArgumentForm(41, "dload_3");
        byteCodeFormArr[42] = new NoArgumentForm(42, "aload_0");
        byteCodeFormArr[43] = new NoArgumentForm(43, "aload_1");
        byteCodeFormArr[44] = new NoArgumentForm(44, "aload_2");
        byteCodeFormArr[45] = new NoArgumentForm(45, "aload_3");
        byteCodeFormArr[46] = new NoArgumentForm(46, "iaload");
        byteCodeFormArr[47] = new NoArgumentForm(47, "laload");
        byteCodeFormArr[48] = new NoArgumentForm(48, "faload");
        byteCodeFormArr[49] = new NoArgumentForm(49, "daload");
        byteCodeFormArr[50] = new NoArgumentForm(50, "aaload");
        byteCodeFormArr[51] = new NoArgumentForm(51, "baload");
        byteCodeFormArr[52] = new NoArgumentForm(52, "caload");
        byteCodeFormArr[53] = new NoArgumentForm(53, "saload");
        byteCodeFormArr[54] = new LocalForm(54, "istore", new int[]{54, -1});
        byteCodeFormArr[55] = new LocalForm(55, "lstore", new int[]{55, -1});
        byteCodeFormArr[56] = new LocalForm(56, "fstore", new int[]{56, -1});
        byteCodeFormArr[57] = new LocalForm(57, "dstore", new int[]{57, -1});
        byteCodeFormArr[58] = new LocalForm(58, "astore", new int[]{58, -1});
        byteCodeFormArr[59] = new NoArgumentForm(59, "istore_0");
        byteCodeFormArr[60] = new NoArgumentForm(60, "istore_1");
        byteCodeFormArr[61] = new NoArgumentForm(61, "istore_2");
        byteCodeFormArr[62] = new NoArgumentForm(62, "istore_3");
        byteCodeFormArr[63] = new NoArgumentForm(63, "lstore_0");
        byteCodeFormArr[64] = new NoArgumentForm(64, "lstore_1");
        byteCodeFormArr[65] = new NoArgumentForm(65, "lstore_2");
        byteCodeFormArr[66] = new NoArgumentForm(66, "lstore_3");
        byteCodeFormArr[67] = new NoArgumentForm(67, "fstore_0");
        byteCodeFormArr[68] = new NoArgumentForm(68, "fstore_1");
        byteCodeFormArr[69] = new NoArgumentForm(69, "fstore_2");
        byteCodeFormArr[70] = new NoArgumentForm(70, "fstore_3");
        byteCodeFormArr[71] = new NoArgumentForm(71, "dstore_0");
        byteCodeFormArr[72] = new NoArgumentForm(72, "dstore_1");
        byteCodeFormArr[73] = new NoArgumentForm(73, "dstore_2");
        byteCodeFormArr[74] = new NoArgumentForm(74, "dstore_3");
        byteCodeFormArr[75] = new NoArgumentForm(75, "astore_0");
        byteCodeFormArr[76] = new NoArgumentForm(76, "astore_1");
        byteCodeFormArr[77] = new NoArgumentForm(77, "astore_2");
        byteCodeFormArr[78] = new NoArgumentForm(78, "astore_3");
        byteCodeFormArr[79] = new NoArgumentForm(79, "iastore");
        byteCodeFormArr[80] = new NoArgumentForm(80, "lastore");
        byteCodeFormArr[81] = new NoArgumentForm(81, "fastore");
        byteCodeFormArr[82] = new NoArgumentForm(82, "dastore");
        byteCodeFormArr[83] = new NoArgumentForm(83, "aastore");
        byteCodeFormArr[84] = new NoArgumentForm(84, "bastore");
        byteCodeFormArr[85] = new NoArgumentForm(85, "castore");
        byteCodeFormArr[86] = new NoArgumentForm(86, "sastore");
        byteCodeFormArr[87] = new NoArgumentForm(87, "pop");
        byteCodeFormArr[88] = new NoArgumentForm(88, "pop2");
        byteCodeFormArr[89] = new NoArgumentForm(89, "dup");
        byteCodeFormArr[90] = new NoArgumentForm(90, "dup_x1");
        byteCodeFormArr[91] = new NoArgumentForm(91, "dup_x2");
        byteCodeFormArr[92] = new NoArgumentForm(92, "dup2");
        byteCodeFormArr[93] = new NoArgumentForm(93, "dup2_x1");
        byteCodeFormArr[94] = new NoArgumentForm(94, "dup2_x2");
        byteCodeFormArr[95] = new NoArgumentForm(95, "swap");
        byteCodeFormArr[96] = new NoArgumentForm(96, "iadd");
        byteCodeFormArr[97] = new NoArgumentForm(97, "ladd");
        byteCodeFormArr[98] = new NoArgumentForm(98, "fadd");
        byteCodeFormArr[99] = new NoArgumentForm(99, "dadd");
        byteCodeFormArr[100] = new NoArgumentForm(100, "isub");
        byteCodeFormArr[101] = new NoArgumentForm(101, "lsub");
        byteCodeFormArr[102] = new NoArgumentForm(102, "fsub");
        byteCodeFormArr[103] = new NoArgumentForm(103, "dsub");
        byteCodeFormArr[104] = new NoArgumentForm(104, "imul");
        byteCodeFormArr[105] = new NoArgumentForm(105, "lmul");
        byteCodeFormArr[106] = new NoArgumentForm(106, "fmul");
        byteCodeFormArr[107] = new NoArgumentForm(107, "dmul");
        byteCodeFormArr[108] = new NoArgumentForm(108, "idiv");
        byteCodeFormArr[109] = new NoArgumentForm(109, "ldiv");
        byteCodeFormArr[110] = new NoArgumentForm(110, "fdiv");
        byteCodeFormArr[111] = new NoArgumentForm(111, "ddiv");
        byteCodeFormArr[112] = new NoArgumentForm(112, "irem");
        byteCodeFormArr[113] = new NoArgumentForm(113, "lrem");
        byteCodeFormArr[114] = new NoArgumentForm(114, "frem");
        byteCodeFormArr[115] = new NoArgumentForm(115, "drem");
        byteCodeFormArr[116] = new NoArgumentForm(116, "");
        byteCodeFormArr[117] = new NoArgumentForm(117, "lneg");
        byteCodeFormArr[118] = new NoArgumentForm(118, "fneg");
        byteCodeFormArr[119] = new NoArgumentForm(119, "dneg");
        byteCodeFormArr[120] = new NoArgumentForm(120, "ishl");
        byteCodeFormArr[121] = new NoArgumentForm(121, "lshl");
        byteCodeFormArr[122] = new NoArgumentForm(122, "ishr");
        byteCodeFormArr[123] = new NoArgumentForm(123, "lshr");
        byteCodeFormArr[124] = new NoArgumentForm(124, "iushr");
        byteCodeFormArr[125] = new NoArgumentForm(125, "lushr");
        byteCodeFormArr[126] = new NoArgumentForm(126, "iand");
        byteCodeFormArr[127] = new NoArgumentForm(127, "land");
        byteCodeFormArr[128] = new NoArgumentForm(128, "ior");
        byteCodeFormArr[129] = new NoArgumentForm(129, "lor");
        byteCodeFormArr[130] = new NoArgumentForm(130, "ixor");
        byteCodeFormArr[131] = new NoArgumentForm(131, "lxor");
        byteCodeFormArr[132] = new IincForm(132, "iinc", new int[]{132, -1, -1});
        byteCodeFormArr[133] = new NoArgumentForm(Cea708Decoder.COMMAND_CW5, "i2l");
        byteCodeFormArr[134] = new NoArgumentForm(134, "i2f");
        byteCodeFormArr[135] = new NoArgumentForm(135, "i2d");
        byteCodeFormArr[136] = new NoArgumentForm(136, "l2i");
        byteCodeFormArr[137] = new NoArgumentForm(Cea708Decoder.COMMAND_DSW, "l2f");
        byteCodeFormArr[138] = new NoArgumentForm(138, "l2d");
        byteCodeFormArr[139] = new NoArgumentForm(139, "f2i");
        byteCodeFormArr[140] = new NoArgumentForm(Cea708Decoder.COMMAND_DLW, "f2l");
        byteCodeFormArr[141] = new NoArgumentForm(Cea708Decoder.COMMAND_DLY, "f2d");
        byteCodeFormArr[142] = new NoArgumentForm(Cea708Decoder.COMMAND_DLC, "d2i");
        byteCodeFormArr[143] = new NoArgumentForm(Cea708Decoder.COMMAND_RST, "d2l");
        byteCodeFormArr[144] = new NoArgumentForm(Cea708Decoder.COMMAND_SPA, "d2f");
        byteCodeFormArr[145] = new NoArgumentForm(Cea708Decoder.COMMAND_SPC, "i2b");
        byteCodeFormArr[146] = new NoArgumentForm(Cea708Decoder.COMMAND_SPL, "i2c");
        byteCodeFormArr[147] = new NoArgumentForm(147, "i2s");
        byteCodeFormArr[148] = new NoArgumentForm(TarConstants.CHKSUM_OFFSET, "lcmp");
        byteCodeFormArr[149] = new NoArgumentForm(149, "fcmpl");
        byteCodeFormArr[150] = new NoArgumentForm(150, "fcmpg");
        byteCodeFormArr[151] = new NoArgumentForm(Cea708Decoder.COMMAND_SWA, "dcmpl");
        byteCodeFormArr[152] = new NoArgumentForm(Cea708Decoder.COMMAND_DF0, "dcmpg");
        byteCodeFormArr[153] = new LabelForm(Cea708Decoder.COMMAND_DF1, "ifeq", new int[]{Cea708Decoder.COMMAND_DF1, -1, -1});
        byteCodeFormArr[154] = new LabelForm(Cea708Decoder.COMMAND_DF2, "ifne", new int[]{Cea708Decoder.COMMAND_DF2, -1, -1});
        byteCodeFormArr[155] = new LabelForm(155, "iflt", new int[]{155, -1, -1});
        byteCodeFormArr[156] = new LabelForm(156, "ifge", new int[]{156, -1, -1});
        byteCodeFormArr[157] = new LabelForm(157, "ifgt", new int[]{157, -1, -1});
        byteCodeFormArr[158] = new LabelForm(Cea708Decoder.COMMAND_DF6, "ifle", new int[]{Cea708Decoder.COMMAND_DF6, -1, -1});
        byteCodeFormArr[159] = new LabelForm(159, "if_icmpeq", new int[]{159, -1, -1});
        byteCodeFormArr[160] = new LabelForm(160, "if_icmpne", new int[]{160, -1, -1});
        byteCodeFormArr[161] = new LabelForm(MatroskaExtractor.ID_BLOCK, "if_icmplt", new int[]{MatroskaExtractor.ID_BLOCK, -1, -1});
        byteCodeFormArr[162] = new LabelForm(162, "if_icmpge", new int[]{162, -1, -1});
        byteCodeFormArr[163] = new LabelForm(MatroskaExtractor.ID_SIMPLE_BLOCK, "if_icmpgt", new int[]{MatroskaExtractor.ID_SIMPLE_BLOCK, -1, -1});
        byteCodeFormArr[164] = new LabelForm(164, "if_icmple", new int[]{164, -1, -1});
        byteCodeFormArr[165] = new LabelForm(MatroskaExtractor.ID_BLOCK_ADDITIONAL, "if_acmpeq", new int[]{MatroskaExtractor.ID_BLOCK_ADDITIONAL, -1, -1});
        byteCodeFormArr[166] = new LabelForm(MatroskaExtractor.ID_BLOCK_MORE, "if_acmpne", new int[]{MatroskaExtractor.ID_BLOCK_MORE, -1, -1});
        byteCodeFormArr[167] = new LabelForm(167, "goto", new int[]{167, -1, -1});
        byteCodeFormArr[168] = new LabelForm(168, "jsr", new int[]{168, -1, -1});
        byteCodeFormArr[169] = new LocalForm(MetadataUtil.TYPE_TOP_BYTE_COPYRIGHT, "ret", new int[]{MetadataUtil.TYPE_TOP_BYTE_COPYRIGHT, -1});
        byteCodeFormArr[170] = new TableSwitchForm(170, "tableswitch");
        byteCodeFormArr[171] = new LookupSwitchForm(BcBands.LOOKUPSWITCH, "lookupswitch");
        byteCodeFormArr[172] = new NoArgumentForm(TsExtractor.TS_STREAM_TYPE_AC4, "ireturn");
        byteCodeFormArr[173] = new NoArgumentForm(173, "lreturn");
        byteCodeFormArr[174] = new NoArgumentForm(MatroskaExtractor.ID_TRACK_ENTRY, "freturn");
        byteCodeFormArr[175] = new NoArgumentForm(HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, "dreturn");
        byteCodeFormArr[176] = new NoArgumentForm(176, "areturn");
        byteCodeFormArr[177] = new NoArgumentForm(177, "return");
        byteCodeFormArr[178] = new FieldRefForm(178, "getstatic", new int[]{178, -1, -1});
        byteCodeFormArr[179] = new FieldRefForm(179, "putstatic", new int[]{179, -1, -1});
        byteCodeFormArr[180] = new FieldRefForm(180, "getfield", new int[]{180, -1, -1});
        byteCodeFormArr[181] = new FieldRefForm(181, "putfield", new int[]{181, -1, -1});
        byteCodeFormArr[182] = new MethodRefForm(H263Reader.START_CODE_VALUE_VOP, "invokevirtual", new int[]{H263Reader.START_CODE_VALUE_VOP, -1, -1});
        byteCodeFormArr[183] = new MethodRefForm(MatroskaExtractor.ID_CUE_TRACK_POSITIONS, "invokespecial", new int[]{MatroskaExtractor.ID_CUE_TRACK_POSITIONS, -1, -1});
        byteCodeFormArr[184] = new MethodRefForm(H262Reader.START_GROUP, "invokestatic", new int[]{H262Reader.START_GROUP, -1, -1});
        byteCodeFormArr[185] = new IMethodRefForm(BcBands.INVOKEINTERFACE, "invokeinterface", new int[]{BcBands.INVOKEINTERFACE, -1, -1, -1, 0});
        byteCodeFormArr[186] = new NoArgumentForm(MatroskaExtractor.ID_PIXEL_HEIGHT, "xxxunusedxxx");
        byteCodeFormArr[187] = new NewClassRefForm(MatroskaExtractor.ID_CUE_POINT, "new", new int[]{MatroskaExtractor.ID_CUE_POINT, -1, -1});
        byteCodeFormArr[188] = new ByteForm(TsExtractor.TS_PACKET_SIZE, "newarray", new int[]{TsExtractor.TS_PACKET_SIZE, -1});
        byteCodeFormArr[189] = new ClassRefForm(PsExtractor.PRIVATE_STREAM_1, "anewarray", new int[]{PsExtractor.PRIVATE_STREAM_1, -1, -1});
        byteCodeFormArr[190] = new NoArgumentForm(190, "arraylength");
        byteCodeFormArr[191] = new NoArgumentForm(191, "athrow");
        byteCodeFormArr[192] = new ClassRefForm(192, "checkcast", new int[]{192, -1, -1});
        byteCodeFormArr[193] = new ClassRefForm(GpsStatusWrapper.QZSS_SVID_MIN, "instanceof", new int[]{GpsStatusWrapper.QZSS_SVID_MIN, -1, -1});
        byteCodeFormArr[194] = new NoArgumentForm(194, "monitorenter");
        byteCodeFormArr[195] = new NoArgumentForm(195, "monitorexit");
        byteCodeFormArr[196] = new WideForm(BcBands.WIDE, "wide");
        byteCodeFormArr[197] = new MultiANewArrayForm(BcBands.MULTIANEWARRAY, "multianewarray", new int[]{BcBands.MULTIANEWARRAY, -1, -1, -1});
        byteCodeFormArr[198] = new LabelForm(198, "ifnull", new int[]{198, -1, -1});
        byteCodeFormArr[199] = new LabelForm(199, "ifnonnull", new int[]{199, -1, -1});
        byteCodeFormArr[200] = new LabelForm(200, "goto_w", new int[]{200, -1, -1, -1, -1}, true);
        byteCodeFormArr[201] = new LabelForm(201, "jsr_w", new int[]{201, -1, -1, -1, -1}, true);
        byteCodeFormArr[202] = new ThisFieldRefForm(202, "getstatic_this", new int[]{178, -1, -1});
        byteCodeFormArr[203] = new ThisFieldRefForm(203, "putstatic_this", new int[]{179, -1, -1});
        byteCodeFormArr[204] = new ThisFieldRefForm(204, "getfield_this", new int[]{180, -1, -1});
        byteCodeFormArr[205] = new ThisFieldRefForm(HttpStatus.SC_RESET_CONTENT, "putfield_this", new int[]{181, -1, -1});
        byteCodeFormArr[206] = new ThisMethodRefForm(206, "invokevirtual_this", new int[]{H263Reader.START_CODE_VALUE_VOP, -1, -1});
        byteCodeFormArr[207] = new ThisMethodRefForm(207, "invokespecial_this", new int[]{MatroskaExtractor.ID_CUE_TRACK_POSITIONS, -1, -1});
        byteCodeFormArr[208] = new ThisMethodRefForm(208, "invokestatic_this", new int[]{H262Reader.START_GROUP, -1, -1});
        byteCodeFormArr[209] = new ThisFieldRefForm(Cea708Decoder.CueInfoBuilder.HORIZONTAL_SIZE, "aload_0_getstatic_this", new int[]{42, 178, -1, -1});
        byteCodeFormArr[210] = new ThisFieldRefForm(210, "aload_0_putstatic_this", new int[]{42, 179, -1, -1});
        byteCodeFormArr[211] = new ThisFieldRefForm(211, "aload_0_getfield_this", new int[]{42, 180, -1, -1});
        byteCodeFormArr[212] = new ThisFieldRefForm(212, "aload_0_putfield_this", new int[]{42, 181, -1, -1});
        byteCodeFormArr[213] = new ThisMethodRefForm(213, "aload_0_invokevirtual_this", new int[]{42, H263Reader.START_CODE_VALUE_VOP, -1, -1});
        byteCodeFormArr[214] = new ThisMethodRefForm(214, "aload_0_invokespecial_this", new int[]{42, MatroskaExtractor.ID_CUE_TRACK_POSITIONS, -1, -1});
        byteCodeFormArr[215] = new ThisMethodRefForm(MatroskaExtractor.ID_TRACK_NUMBER, "aload_0_invokestatic_this", new int[]{42, H262Reader.START_GROUP, -1, -1});
        byteCodeFormArr[216] = new SuperFieldRefForm(216, "getstatic_super", new int[]{178, -1, -1});
        byteCodeFormArr[217] = new SuperFieldRefForm(217, "putstatic_super", new int[]{179, -1, -1});
        byteCodeFormArr[218] = new SuperFieldRefForm(218, "getfield_super", new int[]{180, -1, -1});
        byteCodeFormArr[219] = new SuperFieldRefForm(219, "putfield_super", new int[]{181, -1, -1});
        byteCodeFormArr[220] = new SuperMethodRefForm(220, "invokevirtual_super", new int[]{H263Reader.START_CODE_VALUE_VOP, -1, -1});
        byteCodeFormArr[221] = new SuperMethodRefForm(221, "invokespecial_super", new int[]{MatroskaExtractor.ID_CUE_TRACK_POSITIONS, -1, -1});
        byteCodeFormArr[222] = new SuperMethodRefForm(222, "invokestatic_super", new int[]{H262Reader.START_GROUP, -1, -1});
        byteCodeFormArr[223] = new SuperFieldRefForm(223, "aload_0_getstatic_super", new int[]{42, 178, -1, -1});
        byteCodeFormArr[224] = new SuperFieldRefForm(224, "aload_0_putstatic_super", new int[]{42, 179, -1, -1});
        byteCodeFormArr[225] = new SuperFieldRefForm(225, "aload_0_getfield_super", new int[]{42, 180, -1, -1});
        byteCodeFormArr[226] = new SuperFieldRefForm(226, "aload_0_putfield_super", new int[]{42, 181, -1, -1});
        byteCodeFormArr[227] = new SuperMethodRefForm(227, "aload_0_invokevirtual_super", new int[]{42, H263Reader.START_CODE_VALUE_VOP, -1, -1});
        byteCodeFormArr[228] = new SuperMethodRefForm(228, "aload_0_invokespecial_super", new int[]{42, MatroskaExtractor.ID_CUE_TRACK_POSITIONS, -1, -1});
        byteCodeFormArr[229] = new SuperMethodRefForm(229, "aload_0_invokestatic_super", new int[]{42, H262Reader.START_GROUP, -1, -1});
        byteCodeFormArr[230] = new ThisInitMethodRefForm(230, "invokespecial_this_init", new int[]{MatroskaExtractor.ID_CUE_TRACK_POSITIONS, -1, -1});
        byteCodeFormArr[231] = new SuperInitMethodRefForm(MatroskaExtractor.ID_TIME_CODE, "invokespecial_super_init", new int[]{MatroskaExtractor.ID_CUE_TRACK_POSITIONS, -1, -1});
        byteCodeFormArr[232] = new NewInitMethodRefForm(232, "invokespecial_new_init", new int[]{MatroskaExtractor.ID_CUE_TRACK_POSITIONS, -1, -1});
        byteCodeFormArr[233] = new NarrowClassRefForm(233, "cldc", new int[]{18, -1});
        byteCodeFormArr[234] = new IntRefForm(ArjArchiveInputStream.ARJ_MAGIC_2, "ildc", new int[]{18, -1});
        byteCodeFormArr[235] = new FloatRefForm(235, "fldc", new int[]{18, -1});
        byteCodeFormArr[236] = new NarrowClassRefForm(236, "cldc_w", new int[]{19, -1, -1}, true);
        byteCodeFormArr[237] = new IntRefForm(237, "ildc_w", new int[]{19, -1, -1}, true);
        byteCodeFormArr[238] = new FloatRefForm(MatroskaExtractor.ID_BLOCK_ADD_ID, "fldc_w", new int[]{19, -1, -1}, true);
        byteCodeFormArr[239] = new DoubleForm(239, "dldc2_w", new int[]{20, -1, -1});
        byteCodeFormArr[254] = new NoArgumentForm(254, "impdep1");
        byteCodeFormArr[255] = new NoArgumentForm(255, "impdep2");
        for (ByteCodeForm byteCodeForm : byteCodeFormArr) {
            if (byteCodeForm != null) {
                byteCodesByName.put(byteCodeForm.getName(), byteCodeForm);
            }
        }
    }

    public ByteCodeForm(int i, String str) {
        this(i, str, new int[]{i});
    }

    public ByteCodeForm(int i, String str, int[] iArr) {
        this.opcode = i;
        this.name = str;
        this.rewrite = iArr;
        calculateOperandPosition();
    }

    public void calculateOperandPosition() {
        int i = -1;
        this.firstOperandIndex = -1;
        this.operandLength = -1;
        int length = 0;
        while (true) {
            int[] iArr = this.rewrite;
            if (length >= iArr.length) {
                break;
            }
            if (iArr[length] < 0) {
                this.firstOperandIndex = length;
                length = iArr.length;
            } else {
                length++;
            }
        }
        int i2 = this.firstOperandIndex;
        if (i2 == -1) {
            return;
        }
        while (true) {
            int[] iArr2 = this.rewrite;
            if (i2 >= iArr2.length) {
                break;
            }
            if (iArr2[i2] < 0) {
                i = i2;
            }
            i2++;
        }
        int i3 = i - this.firstOperandIndex;
        if (i3 < 0) {
            throw new Error("Logic error: not finding rewrite operands correctly");
        }
        this.operandLength = i3 + 1;
    }

    public static ByteCodeForm get(int i) {
        return byteCodeArray[i];
    }

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }

    public int getOpcode() {
        return this.opcode;
    }

    public String getName() {
        return this.name;
    }

    public int[] getRewrite() {
        return this.rewrite;
    }

    public int[] getRewriteCopy() {
        int[] iArr = this.rewrite;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public int firstOperandIndex() {
        return this.firstOperandIndex;
    }

    public int operandLength() {
        return this.operandLength;
    }

    public boolean hasMultipleByteCodes() {
        int[] iArr = this.rewrite;
        return iArr.length > 1 && iArr[0] == 42 && iArr[1] > 0;
    }
}
