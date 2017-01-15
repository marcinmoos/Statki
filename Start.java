package statki;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Start extends javax.swing.JFrame implements ActionListener{

    boolean EditorUnitPosition, currentFileChooser, playerMapOk, computerMapOk, currentPlayer;
    JButton[] jMapEditorTab, jMapGameTab;
    Icon water, land, redX, blackX, p, s, t;
    Jednostka currentUsedEditorUnit;
    Path editorPlayerfilePath;
    char[] createdMap, computerMap;
    Random losownik;
    FabrykaJednostek fabryka;
    int remainingFields, playerPoints, computerPoints, shots;
    
    
    public Start() {
        fabryka = new FabrykaJednostek();
        this.losownik = new Random();
        this.createdMap = new char[308];
        this.computerMap = new char[308];
        this.jMapEditorTab = new JButton[308];
        this.jMapGameTab = new JButton[616];
        this.EditorUnitPosition = true;
        this.currentPlayer = true;
        this.playerMapOk = false;
        this.computerMapOk = false;
        water = new ImageIcon("icons/blue.jpg");
        land = new ImageIcon("icons/orange.jpg");
        redX = new ImageIcon("icons/XR.png");
        blackX = new ImageIcon("icons/XB.png");
        initComponents();
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("Statki plansza", "map"));
        
        addMapFieldsToTab();
        addGameFieldsToTab();
        MapFieldsActionListener(); 
        createBlankMap(createdMap);
    }
    
    final void addGameFieldsToTab(){
        int i = 0;
            jMapGameTab[i++] = jGameFieldButton22;
            jMapGameTab[i++] = jGameFieldButton21;
            jMapGameTab[i++] = jGameFieldButton20;
            jMapGameTab[i++] = jGameFieldButton19;
            jMapGameTab[i++] = jGameFieldButton18;
            jMapGameTab[i++] = jGameFieldButton17;
            jMapGameTab[i++] = jGameFieldButton16;
            jMapGameTab[i++] = jGameFieldButton15;
            jMapGameTab[i++] = jGameFieldButton14;
            jMapGameTab[i++] = jGameFieldButton13;
            jMapGameTab[i++] = jGameFieldButton12;
            jMapGameTab[i++] = jGameFieldButton11;
            jMapGameTab[i++] = jGameFieldButton10;
            jMapGameTab[i++] = jGameFieldButton9;
            jMapGameTab[i++] = jGameFieldButton8;
            jMapGameTab[i++] = jGameFieldButton7;
            jMapGameTab[i++] = jGameFieldButton6;
            jMapGameTab[i++] = jGameFieldButton5;
            jMapGameTab[i++] = jGameFieldButton4;
            jMapGameTab[i++] = jGameFieldButton3;
            jMapGameTab[i++] = jGameFieldButton2;
            jMapGameTab[i++] = jGameFieldButton1;
            jMapGameTab[i++] = jGameFieldButton44;
            jMapGameTab[i++] = jGameFieldButton43;
            jMapGameTab[i++] = jGameFieldButton42;
            jMapGameTab[i++] = jGameFieldButton41;
            jMapGameTab[i++] = jGameFieldButton40;
            jMapGameTab[i++] = jGameFieldButton39;
            jMapGameTab[i++] = jGameFieldButton38;
            jMapGameTab[i++] = jGameFieldButton37;
            jMapGameTab[i++] = jGameFieldButton36;
            jMapGameTab[i++] = jGameFieldButton35;
            jMapGameTab[i++] = jGameFieldButton34;
            jMapGameTab[i++] = jGameFieldButton33;
            jMapGameTab[i++] = jGameFieldButton32;
            jMapGameTab[i++] = jGameFieldButton31;
            jMapGameTab[i++] = jGameFieldButton30;
            jMapGameTab[i++] = jGameFieldButton29;
            jMapGameTab[i++] = jGameFieldButton28;
            jMapGameTab[i++] = jGameFieldButton27;
            jMapGameTab[i++] = jGameFieldButton26;
            jMapGameTab[i++] = jGameFieldButton25;
            jMapGameTab[i++] = jGameFieldButton24;
            jMapGameTab[i++] = jGameFieldButton23;
            jMapGameTab[i++] = jGameFieldButton66;
            jMapGameTab[i++] = jGameFieldButton65;
            jMapGameTab[i++] = jGameFieldButton64;
            jMapGameTab[i++] = jGameFieldButton63;
            jMapGameTab[i++] = jGameFieldButton62;
            jMapGameTab[i++] = jGameFieldButton61;
            jMapGameTab[i++] = jGameFieldButton60;
            jMapGameTab[i++] = jGameFieldButton59;
            jMapGameTab[i++] = jGameFieldButton58;
            jMapGameTab[i++] = jGameFieldButton57;
            jMapGameTab[i++] = jGameFieldButton56;
            jMapGameTab[i++] = jGameFieldButton55;
            jMapGameTab[i++] = jGameFieldButton54;
            jMapGameTab[i++] = jGameFieldButton53;
            jMapGameTab[i++] = jGameFieldButton52;
            jMapGameTab[i++] = jGameFieldButton51;
            jMapGameTab[i++] = jGameFieldButton50;
            jMapGameTab[i++] = jGameFieldButton49;
            jMapGameTab[i++] = jGameFieldButton48;
            jMapGameTab[i++] = jGameFieldButton47;
            jMapGameTab[i++] = jGameFieldButton46;
            jMapGameTab[i++] = jGameFieldButton45;
            jMapGameTab[i++] = jGameFieldButton88;
            jMapGameTab[i++] = jGameFieldButton87;
            jMapGameTab[i++] = jGameFieldButton86;
            jMapGameTab[i++] = jGameFieldButton85;
            jMapGameTab[i++] = jGameFieldButton84;
            jMapGameTab[i++] = jGameFieldButton83;
            jMapGameTab[i++] = jGameFieldButton82;
            jMapGameTab[i++] = jGameFieldButton81;
            jMapGameTab[i++] = jGameFieldButton80;
            jMapGameTab[i++] = jGameFieldButton79;
            jMapGameTab[i++] = jGameFieldButton78;
            jMapGameTab[i++] = jGameFieldButton77;
            jMapGameTab[i++] = jGameFieldButton76;
            jMapGameTab[i++] = jGameFieldButton75;
            jMapGameTab[i++] = jGameFieldButton74;
            jMapGameTab[i++] = jGameFieldButton73;
            jMapGameTab[i++] = jGameFieldButton72;
            jMapGameTab[i++] = jGameFieldButton71;
            jMapGameTab[i++] = jGameFieldButton70;
            jMapGameTab[i++] = jGameFieldButton69;
            jMapGameTab[i++] = jGameFieldButton68;
            jMapGameTab[i++] = jGameFieldButton67;
            jMapGameTab[i++] = jGameFieldButton110;
            jMapGameTab[i++] = jGameFieldButton109;
            jMapGameTab[i++] = jGameFieldButton108;
            jMapGameTab[i++] = jGameFieldButton107;
            jMapGameTab[i++] = jGameFieldButton106;
            jMapGameTab[i++] = jGameFieldButton105;
            jMapGameTab[i++] = jGameFieldButton104;
            jMapGameTab[i++] = jGameFieldButton103;
            jMapGameTab[i++] = jGameFieldButton102;
            jMapGameTab[i++] = jGameFieldButton101;
            jMapGameTab[i++] = jGameFieldButton100;
            jMapGameTab[i++] = jGameFieldButton99;
            jMapGameTab[i++] = jGameFieldButton98;
            jMapGameTab[i++] = jGameFieldButton97;
            jMapGameTab[i++] = jGameFieldButton96;
            jMapGameTab[i++] = jGameFieldButton95;
            jMapGameTab[i++] = jGameFieldButton94;
            jMapGameTab[i++] = jGameFieldButton93;
            jMapGameTab[i++] = jGameFieldButton92;
            jMapGameTab[i++] = jGameFieldButton91;
            jMapGameTab[i++] = jGameFieldButton90;
            jMapGameTab[i++] = jGameFieldButton89;
            jMapGameTab[i++] = jGameFieldButton132;
            jMapGameTab[i++] = jGameFieldButton131;
            jMapGameTab[i++] = jGameFieldButton130;
            jMapGameTab[i++] = jGameFieldButton129;
            jMapGameTab[i++] = jGameFieldButton128;
            jMapGameTab[i++] = jGameFieldButton127;
            jMapGameTab[i++] = jGameFieldButton126;
            jMapGameTab[i++] = jGameFieldButton125;
            jMapGameTab[i++] = jGameFieldButton124;
            jMapGameTab[i++] = jGameFieldButton123;
            jMapGameTab[i++] = jGameFieldButton122;
            jMapGameTab[i++] = jGameFieldButton121;
            jMapGameTab[i++] = jGameFieldButton120;
            jMapGameTab[i++] = jGameFieldButton119;
            jMapGameTab[i++] = jGameFieldButton118;
            jMapGameTab[i++] = jGameFieldButton117;
            jMapGameTab[i++] = jGameFieldButton116;
            jMapGameTab[i++] = jGameFieldButton115;
            jMapGameTab[i++] = jGameFieldButton114;
            jMapGameTab[i++] = jGameFieldButton113;
            jMapGameTab[i++] = jGameFieldButton112;
            jMapGameTab[i++] = jGameFieldButton111;
            jMapGameTab[i++] = jGameFieldButton154;
            jMapGameTab[i++] = jGameFieldButton153;
            jMapGameTab[i++] = jGameFieldButton152;
            jMapGameTab[i++] = jGameFieldButton151;
            jMapGameTab[i++] = jGameFieldButton150;
            jMapGameTab[i++] = jGameFieldButton149;
            jMapGameTab[i++] = jGameFieldButton148;
            jMapGameTab[i++] = jGameFieldButton147;
            jMapGameTab[i++] = jGameFieldButton146;
            jMapGameTab[i++] = jGameFieldButton145;
            jMapGameTab[i++] = jGameFieldButton144;
            jMapGameTab[i++] = jGameFieldButton143;
            jMapGameTab[i++] = jGameFieldButton142;
            jMapGameTab[i++] = jGameFieldButton141;
            jMapGameTab[i++] = jGameFieldButton140;
            jMapGameTab[i++] = jGameFieldButton139;
            jMapGameTab[i++] = jGameFieldButton138;
            jMapGameTab[i++] = jGameFieldButton137;
            jMapGameTab[i++] = jGameFieldButton136;
            jMapGameTab[i++] = jGameFieldButton135;
            jMapGameTab[i++] = jGameFieldButton134;
            jMapGameTab[i++] = jGameFieldButton133;
            jMapGameTab[i++] = jGameFieldButton176;
            jMapGameTab[i++] = jGameFieldButton175;
            jMapGameTab[i++] = jGameFieldButton174;
            jMapGameTab[i++] = jGameFieldButton173;
            jMapGameTab[i++] = jGameFieldButton172;
            jMapGameTab[i++] = jGameFieldButton171;
            jMapGameTab[i++] = jGameFieldButton170;
            jMapGameTab[i++] = jGameFieldButton169;
            jMapGameTab[i++] = jGameFieldButton168;
            jMapGameTab[i++] = jGameFieldButton167;
            jMapGameTab[i++] = jGameFieldButton166;
            jMapGameTab[i++] = jGameFieldButton165;
            jMapGameTab[i++] = jGameFieldButton164;
            jMapGameTab[i++] = jGameFieldButton163;
            jMapGameTab[i++] = jGameFieldButton162;
            jMapGameTab[i++] = jGameFieldButton161;
            jMapGameTab[i++] = jGameFieldButton160;
            jMapGameTab[i++] = jGameFieldButton159;
            jMapGameTab[i++] = jGameFieldButton158;
            jMapGameTab[i++] = jGameFieldButton157;
            jMapGameTab[i++] = jGameFieldButton156;
            jMapGameTab[i++] = jGameFieldButton155;
            jMapGameTab[i++] = jGameFieldButton198;
            jMapGameTab[i++] = jGameFieldButton197;
            jMapGameTab[i++] = jGameFieldButton196;
            jMapGameTab[i++] = jGameFieldButton195;
            jMapGameTab[i++] = jGameFieldButton194;
            jMapGameTab[i++] = jGameFieldButton193;
            jMapGameTab[i++] = jGameFieldButton192;
            jMapGameTab[i++] = jGameFieldButton191;
            jMapGameTab[i++] = jGameFieldButton190;
            jMapGameTab[i++] = jGameFieldButton189;
            jMapGameTab[i++] = jGameFieldButton188;
            jMapGameTab[i++] = jGameFieldButton187;
            jMapGameTab[i++] = jGameFieldButton186;
            jMapGameTab[i++] = jGameFieldButton185;
            jMapGameTab[i++] = jGameFieldButton184;
            jMapGameTab[i++] = jGameFieldButton183;
            jMapGameTab[i++] = jGameFieldButton182;
            jMapGameTab[i++] = jGameFieldButton181;
            jMapGameTab[i++] = jGameFieldButton180;
            jMapGameTab[i++] = jGameFieldButton179;
            jMapGameTab[i++] = jGameFieldButton178;
            jMapGameTab[i++] = jGameFieldButton177;
            jMapGameTab[i++] = jGameFieldButton220;
            jMapGameTab[i++] = jGameFieldButton219;
            jMapGameTab[i++] = jGameFieldButton218;
            jMapGameTab[i++] = jGameFieldButton217;
            jMapGameTab[i++] = jGameFieldButton216;
            jMapGameTab[i++] = jGameFieldButton215;
            jMapGameTab[i++] = jGameFieldButton214;
            jMapGameTab[i++] = jGameFieldButton213;
            jMapGameTab[i++] = jGameFieldButton212;
            jMapGameTab[i++] = jGameFieldButton211;
            jMapGameTab[i++] = jGameFieldButton210;
            jMapGameTab[i++] = jGameFieldButton209;
            jMapGameTab[i++] = jGameFieldButton208;
            jMapGameTab[i++] = jGameFieldButton207;
            jMapGameTab[i++] = jGameFieldButton206;
            jMapGameTab[i++] = jGameFieldButton205;
            jMapGameTab[i++] = jGameFieldButton204;
            jMapGameTab[i++] = jGameFieldButton203;
            jMapGameTab[i++] = jGameFieldButton202;
            jMapGameTab[i++] = jGameFieldButton201;
            jMapGameTab[i++] = jGameFieldButton200;
            jMapGameTab[i++] = jGameFieldButton199;
            jMapGameTab[i++] = jGameFieldButton242;
            jMapGameTab[i++] = jGameFieldButton241;
            jMapGameTab[i++] = jGameFieldButton240;
            jMapGameTab[i++] = jGameFieldButton239;
            jMapGameTab[i++] = jGameFieldButton238;
            jMapGameTab[i++] = jGameFieldButton237;
            jMapGameTab[i++] = jGameFieldButton236;
            jMapGameTab[i++] = jGameFieldButton235;
            jMapGameTab[i++] = jGameFieldButton234;
            jMapGameTab[i++] = jGameFieldButton233;
            jMapGameTab[i++] = jGameFieldButton232;
            jMapGameTab[i++] = jGameFieldButton231;
            jMapGameTab[i++] = jGameFieldButton230;
            jMapGameTab[i++] = jGameFieldButton229;
            jMapGameTab[i++] = jGameFieldButton228;
            jMapGameTab[i++] = jGameFieldButton227;
            jMapGameTab[i++] = jGameFieldButton226;
            jMapGameTab[i++] = jGameFieldButton225;
            jMapGameTab[i++] = jGameFieldButton224;
            jMapGameTab[i++] = jGameFieldButton223;
            jMapGameTab[i++] = jGameFieldButton222;
            jMapGameTab[i++] = jGameFieldButton221;
            jMapGameTab[i++] = jGameFieldButton264;
            jMapGameTab[i++] = jGameFieldButton263;
            jMapGameTab[i++] = jGameFieldButton262;
            jMapGameTab[i++] = jGameFieldButton261;
            jMapGameTab[i++] = jGameFieldButton260;
            jMapGameTab[i++] = jGameFieldButton259;
            jMapGameTab[i++] = jGameFieldButton258;
            jMapGameTab[i++] = jGameFieldButton257;
            jMapGameTab[i++] = jGameFieldButton256;
            jMapGameTab[i++] = jGameFieldButton255;
            jMapGameTab[i++] = jGameFieldButton254;
            jMapGameTab[i++] = jGameFieldButton253;
            jMapGameTab[i++] = jGameFieldButton252;
            jMapGameTab[i++] = jGameFieldButton251;
            jMapGameTab[i++] = jGameFieldButton250;
            jMapGameTab[i++] = jGameFieldButton249;
            jMapGameTab[i++] = jGameFieldButton248;
            jMapGameTab[i++] = jGameFieldButton247;
            jMapGameTab[i++] = jGameFieldButton246;
            jMapGameTab[i++] = jGameFieldButton245;
            jMapGameTab[i++] = jGameFieldButton244;
            jMapGameTab[i++] = jGameFieldButton243;
            jMapGameTab[i++] = jGameFieldButton286;
            jMapGameTab[i++] = jGameFieldButton285;
            jMapGameTab[i++] = jGameFieldButton284;
            jMapGameTab[i++] = jGameFieldButton283;
            jMapGameTab[i++] = jGameFieldButton282;
            jMapGameTab[i++] = jGameFieldButton281;
            jMapGameTab[i++] = jGameFieldButton280;
            jMapGameTab[i++] = jGameFieldButton279;
            jMapGameTab[i++] = jGameFieldButton278;
            jMapGameTab[i++] = jGameFieldButton277;
            jMapGameTab[i++] = jGameFieldButton276;
            jMapGameTab[i++] = jGameFieldButton275;
            jMapGameTab[i++] = jGameFieldButton274;
            jMapGameTab[i++] = jGameFieldButton273;
            jMapGameTab[i++] = jGameFieldButton272;
            jMapGameTab[i++] = jGameFieldButton271;
            jMapGameTab[i++] = jGameFieldButton270;
            jMapGameTab[i++] = jGameFieldButton269;
            jMapGameTab[i++] = jGameFieldButton268;
            jMapGameTab[i++] = jGameFieldButton267;
            jMapGameTab[i++] = jGameFieldButton266;
            jMapGameTab[i++] = jGameFieldButton265;
            jMapGameTab[i++] = jGameFieldButton308;
            jMapGameTab[i++] = jGameFieldButton307;
            jMapGameTab[i++] = jGameFieldButton306;
            jMapGameTab[i++] = jGameFieldButton305;
            jMapGameTab[i++] = jGameFieldButton304;
            jMapGameTab[i++] = jGameFieldButton303;
            jMapGameTab[i++] = jGameFieldButton302;
            jMapGameTab[i++] = jGameFieldButton301;
            jMapGameTab[i++] = jGameFieldButton300;
            jMapGameTab[i++] = jGameFieldButton299;
            jMapGameTab[i++] = jGameFieldButton298;
            jMapGameTab[i++] = jGameFieldButton297;
            jMapGameTab[i++] = jGameFieldButton296;
            jMapGameTab[i++] = jGameFieldButton295;
            jMapGameTab[i++] = jGameFieldButton294;
            jMapGameTab[i++] = jGameFieldButton293;
            jMapGameTab[i++] = jGameFieldButton292;
            jMapGameTab[i++] = jGameFieldButton291;
            jMapGameTab[i++] = jGameFieldButton290;
            jMapGameTab[i++] = jGameFieldButton289;
            jMapGameTab[i++] = jGameFieldButton288;
            jMapGameTab[i++] = jGameFieldButton287;
            jMapGameTab[i++] = jGameFieldButton330;
            jMapGameTab[i++] = jGameFieldButton329;
            jMapGameTab[i++] = jGameFieldButton328;
            jMapGameTab[i++] = jGameFieldButton327;
            jMapGameTab[i++] = jGameFieldButton326;
            jMapGameTab[i++] = jGameFieldButton325;
            jMapGameTab[i++] = jGameFieldButton324;
            jMapGameTab[i++] = jGameFieldButton323;
            jMapGameTab[i++] = jGameFieldButton322;
            jMapGameTab[i++] = jGameFieldButton321;
            jMapGameTab[i++] = jGameFieldButton320;
            jMapGameTab[i++] = jGameFieldButton319;
            jMapGameTab[i++] = jGameFieldButton318;
            jMapGameTab[i++] = jGameFieldButton317;
            jMapGameTab[i++] = jGameFieldButton316;
            jMapGameTab[i++] = jGameFieldButton315;
            jMapGameTab[i++] = jGameFieldButton314;
            jMapGameTab[i++] = jGameFieldButton313;
            jMapGameTab[i++] = jGameFieldButton312;
            jMapGameTab[i++] = jGameFieldButton311;
            jMapGameTab[i++] = jGameFieldButton310;
            jMapGameTab[i++] = jGameFieldButton309;
            jMapGameTab[i++] = jGameFieldButton352;
            jMapGameTab[i++] = jGameFieldButton351;
            jMapGameTab[i++] = jGameFieldButton350;
            jMapGameTab[i++] = jGameFieldButton349;
            jMapGameTab[i++] = jGameFieldButton348;
            jMapGameTab[i++] = jGameFieldButton347;
            jMapGameTab[i++] = jGameFieldButton346;
            jMapGameTab[i++] = jGameFieldButton345;
            jMapGameTab[i++] = jGameFieldButton344;
            jMapGameTab[i++] = jGameFieldButton343;
            jMapGameTab[i++] = jGameFieldButton342;
            jMapGameTab[i++] = jGameFieldButton341;
            jMapGameTab[i++] = jGameFieldButton340;
            jMapGameTab[i++] = jGameFieldButton339;
            jMapGameTab[i++] = jGameFieldButton338;
            jMapGameTab[i++] = jGameFieldButton337;
            jMapGameTab[i++] = jGameFieldButton336;
            jMapGameTab[i++] = jGameFieldButton335;
            jMapGameTab[i++] = jGameFieldButton334;
            jMapGameTab[i++] = jGameFieldButton333;
            jMapGameTab[i++] = jGameFieldButton332;
            jMapGameTab[i++] = jGameFieldButton331;
            jMapGameTab[i++] = jGameFieldButton374;
            jMapGameTab[i++] = jGameFieldButton373;
            jMapGameTab[i++] = jGameFieldButton372;
            jMapGameTab[i++] = jGameFieldButton371;
            jMapGameTab[i++] = jGameFieldButton370;
            jMapGameTab[i++] = jGameFieldButton369;
            jMapGameTab[i++] = jGameFieldButton368;
            jMapGameTab[i++] = jGameFieldButton367;
            jMapGameTab[i++] = jGameFieldButton366;
            jMapGameTab[i++] = jGameFieldButton365;
            jMapGameTab[i++] = jGameFieldButton364;
            jMapGameTab[i++] = jGameFieldButton363;
            jMapGameTab[i++] = jGameFieldButton362;
            jMapGameTab[i++] = jGameFieldButton361;
            jMapGameTab[i++] = jGameFieldButton360;
            jMapGameTab[i++] = jGameFieldButton359;
            jMapGameTab[i++] = jGameFieldButton358;
            jMapGameTab[i++] = jGameFieldButton357;
            jMapGameTab[i++] = jGameFieldButton356;
            jMapGameTab[i++] = jGameFieldButton355;
            jMapGameTab[i++] = jGameFieldButton354;
            jMapGameTab[i++] = jGameFieldButton353;
            jMapGameTab[i++] = jGameFieldButton396;
            jMapGameTab[i++] = jGameFieldButton395;
            jMapGameTab[i++] = jGameFieldButton394;
            jMapGameTab[i++] = jGameFieldButton393;
            jMapGameTab[i++] = jGameFieldButton392;
            jMapGameTab[i++] = jGameFieldButton391;
            jMapGameTab[i++] = jGameFieldButton390;
            jMapGameTab[i++] = jGameFieldButton389;
            jMapGameTab[i++] = jGameFieldButton388;
            jMapGameTab[i++] = jGameFieldButton387;
            jMapGameTab[i++] = jGameFieldButton386;
            jMapGameTab[i++] = jGameFieldButton385;
            jMapGameTab[i++] = jGameFieldButton384;
            jMapGameTab[i++] = jGameFieldButton383;
            jMapGameTab[i++] = jGameFieldButton382;
            jMapGameTab[i++] = jGameFieldButton381;
            jMapGameTab[i++] = jGameFieldButton380;
            jMapGameTab[i++] = jGameFieldButton379;
            jMapGameTab[i++] = jGameFieldButton378;
            jMapGameTab[i++] = jGameFieldButton377;
            jMapGameTab[i++] = jGameFieldButton376;
            jMapGameTab[i++] = jGameFieldButton375;
            jMapGameTab[i++] = jGameFieldButton418;
            jMapGameTab[i++] = jGameFieldButton417;
            jMapGameTab[i++] = jGameFieldButton416;
            jMapGameTab[i++] = jGameFieldButton415;
            jMapGameTab[i++] = jGameFieldButton414;
            jMapGameTab[i++] = jGameFieldButton413;
            jMapGameTab[i++] = jGameFieldButton412;
            jMapGameTab[i++] = jGameFieldButton411;
            jMapGameTab[i++] = jGameFieldButton410;
            jMapGameTab[i++] = jGameFieldButton409;
            jMapGameTab[i++] = jGameFieldButton408;
            jMapGameTab[i++] = jGameFieldButton407;
            jMapGameTab[i++] = jGameFieldButton406;
            jMapGameTab[i++] = jGameFieldButton405;
            jMapGameTab[i++] = jGameFieldButton404;
            jMapGameTab[i++] = jGameFieldButton403;
            jMapGameTab[i++] = jGameFieldButton402;
            jMapGameTab[i++] = jGameFieldButton401;
            jMapGameTab[i++] = jGameFieldButton400;
            jMapGameTab[i++] = jGameFieldButton399;
            jMapGameTab[i++] = jGameFieldButton398;
            jMapGameTab[i++] = jGameFieldButton397;
            jMapGameTab[i++] = jGameFieldButton440;
            jMapGameTab[i++] = jGameFieldButton439;
            jMapGameTab[i++] = jGameFieldButton438;
            jMapGameTab[i++] = jGameFieldButton437;
            jMapGameTab[i++] = jGameFieldButton436;
            jMapGameTab[i++] = jGameFieldButton435;
            jMapGameTab[i++] = jGameFieldButton434;
            jMapGameTab[i++] = jGameFieldButton433;
            jMapGameTab[i++] = jGameFieldButton432;
            jMapGameTab[i++] = jGameFieldButton431;
            jMapGameTab[i++] = jGameFieldButton430;
            jMapGameTab[i++] = jGameFieldButton429;
            jMapGameTab[i++] = jGameFieldButton428;
            jMapGameTab[i++] = jGameFieldButton427;
            jMapGameTab[i++] = jGameFieldButton426;
            jMapGameTab[i++] = jGameFieldButton425;
            jMapGameTab[i++] = jGameFieldButton424;
            jMapGameTab[i++] = jGameFieldButton423;
            jMapGameTab[i++] = jGameFieldButton422;
            jMapGameTab[i++] = jGameFieldButton421;
            jMapGameTab[i++] = jGameFieldButton420;
            jMapGameTab[i++] = jGameFieldButton419;
            jMapGameTab[i++] = jGameFieldButton462;
            jMapGameTab[i++] = jGameFieldButton461;
            jMapGameTab[i++] = jGameFieldButton460;
            jMapGameTab[i++] = jGameFieldButton459;
            jMapGameTab[i++] = jGameFieldButton458;
            jMapGameTab[i++] = jGameFieldButton457;
            jMapGameTab[i++] = jGameFieldButton456;
            jMapGameTab[i++] = jGameFieldButton455;
            jMapGameTab[i++] = jGameFieldButton454;
            jMapGameTab[i++] = jGameFieldButton453;
            jMapGameTab[i++] = jGameFieldButton452;
            jMapGameTab[i++] = jGameFieldButton451;
            jMapGameTab[i++] = jGameFieldButton450;
            jMapGameTab[i++] = jGameFieldButton449;
            jMapGameTab[i++] = jGameFieldButton448;
            jMapGameTab[i++] = jGameFieldButton447;
            jMapGameTab[i++] = jGameFieldButton446;
            jMapGameTab[i++] = jGameFieldButton445;
            jMapGameTab[i++] = jGameFieldButton444;
            jMapGameTab[i++] = jGameFieldButton443;
            jMapGameTab[i++] = jGameFieldButton442;
            jMapGameTab[i++] = jGameFieldButton441;
            jMapGameTab[i++] = jGameFieldButton484;
            jMapGameTab[i++] = jGameFieldButton483;
            jMapGameTab[i++] = jGameFieldButton482;
            jMapGameTab[i++] = jGameFieldButton481;
            jMapGameTab[i++] = jGameFieldButton480;
            jMapGameTab[i++] = jGameFieldButton479;
            jMapGameTab[i++] = jGameFieldButton478;
            jMapGameTab[i++] = jGameFieldButton477;
            jMapGameTab[i++] = jGameFieldButton476;
            jMapGameTab[i++] = jGameFieldButton475;
            jMapGameTab[i++] = jGameFieldButton474;
            jMapGameTab[i++] = jGameFieldButton473;
            jMapGameTab[i++] = jGameFieldButton472;
            jMapGameTab[i++] = jGameFieldButton471;
            jMapGameTab[i++] = jGameFieldButton470;
            jMapGameTab[i++] = jGameFieldButton469;
            jMapGameTab[i++] = jGameFieldButton468;
            jMapGameTab[i++] = jGameFieldButton467;
            jMapGameTab[i++] = jGameFieldButton466;
            jMapGameTab[i++] = jGameFieldButton465;
            jMapGameTab[i++] = jGameFieldButton464;
            jMapGameTab[i++] = jGameFieldButton463;
            jMapGameTab[i++] = jGameFieldButton506;
            jMapGameTab[i++] = jGameFieldButton505;
            jMapGameTab[i++] = jGameFieldButton504;
            jMapGameTab[i++] = jGameFieldButton503;
            jMapGameTab[i++] = jGameFieldButton502;
            jMapGameTab[i++] = jGameFieldButton501;
            jMapGameTab[i++] = jGameFieldButton500;
            jMapGameTab[i++] = jGameFieldButton499;
            jMapGameTab[i++] = jGameFieldButton498;
            jMapGameTab[i++] = jGameFieldButton497;
            jMapGameTab[i++] = jGameFieldButton496;
            jMapGameTab[i++] = jGameFieldButton495;
            jMapGameTab[i++] = jGameFieldButton494;
            jMapGameTab[i++] = jGameFieldButton493;
            jMapGameTab[i++] = jGameFieldButton492;
            jMapGameTab[i++] = jGameFieldButton491;
            jMapGameTab[i++] = jGameFieldButton490;
            jMapGameTab[i++] = jGameFieldButton489;
            jMapGameTab[i++] = jGameFieldButton488;
            jMapGameTab[i++] = jGameFieldButton487;
            jMapGameTab[i++] = jGameFieldButton486;
            jMapGameTab[i++] = jGameFieldButton485;
            jMapGameTab[i++] = jGameFieldButton528;
            jMapGameTab[i++] = jGameFieldButton527;
            jMapGameTab[i++] = jGameFieldButton526;
            jMapGameTab[i++] = jGameFieldButton525;
            jMapGameTab[i++] = jGameFieldButton524;
            jMapGameTab[i++] = jGameFieldButton523;
            jMapGameTab[i++] = jGameFieldButton522;
            jMapGameTab[i++] = jGameFieldButton521;
            jMapGameTab[i++] = jGameFieldButton520;
            jMapGameTab[i++] = jGameFieldButton519;
            jMapGameTab[i++] = jGameFieldButton518;
            jMapGameTab[i++] = jGameFieldButton517;
            jMapGameTab[i++] = jGameFieldButton516;
            jMapGameTab[i++] = jGameFieldButton515;
            jMapGameTab[i++] = jGameFieldButton514;
            jMapGameTab[i++] = jGameFieldButton513;
            jMapGameTab[i++] = jGameFieldButton512;
            jMapGameTab[i++] = jGameFieldButton511;
            jMapGameTab[i++] = jGameFieldButton510;
            jMapGameTab[i++] = jGameFieldButton509;
            jMapGameTab[i++] = jGameFieldButton508;
            jMapGameTab[i++] = jGameFieldButton507;
            jMapGameTab[i++] = jGameFieldButton550;
            jMapGameTab[i++] = jGameFieldButton549;
            jMapGameTab[i++] = jGameFieldButton548;
            jMapGameTab[i++] = jGameFieldButton547;
            jMapGameTab[i++] = jGameFieldButton546;
            jMapGameTab[i++] = jGameFieldButton545;
            jMapGameTab[i++] = jGameFieldButton544;
            jMapGameTab[i++] = jGameFieldButton543;
            jMapGameTab[i++] = jGameFieldButton542;
            jMapGameTab[i++] = jGameFieldButton541;
            jMapGameTab[i++] = jGameFieldButton540;
            jMapGameTab[i++] = jGameFieldButton539;
            jMapGameTab[i++] = jGameFieldButton538;
            jMapGameTab[i++] = jGameFieldButton537;
            jMapGameTab[i++] = jGameFieldButton536;
            jMapGameTab[i++] = jGameFieldButton535;
            jMapGameTab[i++] = jGameFieldButton534;
            jMapGameTab[i++] = jGameFieldButton533;
            jMapGameTab[i++] = jGameFieldButton532;
            jMapGameTab[i++] = jGameFieldButton531;
            jMapGameTab[i++] = jGameFieldButton530;
            jMapGameTab[i++] = jGameFieldButton529;
            jMapGameTab[i++] = jGameFieldButton572;
            jMapGameTab[i++] = jGameFieldButton571;
            jMapGameTab[i++] = jGameFieldButton570;
            jMapGameTab[i++] = jGameFieldButton569;
            jMapGameTab[i++] = jGameFieldButton568;
            jMapGameTab[i++] = jGameFieldButton567;
            jMapGameTab[i++] = jGameFieldButton566;
            jMapGameTab[i++] = jGameFieldButton565;
            jMapGameTab[i++] = jGameFieldButton564;
            jMapGameTab[i++] = jGameFieldButton563;
            jMapGameTab[i++] = jGameFieldButton562;
            jMapGameTab[i++] = jGameFieldButton561;
            jMapGameTab[i++] = jGameFieldButton560;
            jMapGameTab[i++] = jGameFieldButton559;
            jMapGameTab[i++] = jGameFieldButton558;
            jMapGameTab[i++] = jGameFieldButton557;
            jMapGameTab[i++] = jGameFieldButton556;
            jMapGameTab[i++] = jGameFieldButton555;
            jMapGameTab[i++] = jGameFieldButton554;
            jMapGameTab[i++] = jGameFieldButton553;
            jMapGameTab[i++] = jGameFieldButton552;
            jMapGameTab[i++] = jGameFieldButton551;
            jMapGameTab[i++] = jGameFieldButton594;
            jMapGameTab[i++] = jGameFieldButton593;
            jMapGameTab[i++] = jGameFieldButton592;
            jMapGameTab[i++] = jGameFieldButton591;
            jMapGameTab[i++] = jGameFieldButton590;
            jMapGameTab[i++] = jGameFieldButton589;
            jMapGameTab[i++] = jGameFieldButton588;
            jMapGameTab[i++] = jGameFieldButton587;
            jMapGameTab[i++] = jGameFieldButton586;
            jMapGameTab[i++] = jGameFieldButton585;
            jMapGameTab[i++] = jGameFieldButton584;
            jMapGameTab[i++] = jGameFieldButton583;
            jMapGameTab[i++] = jGameFieldButton582;
            jMapGameTab[i++] = jGameFieldButton581;
            jMapGameTab[i++] = jGameFieldButton580;
            jMapGameTab[i++] = jGameFieldButton579;
            jMapGameTab[i++] = jGameFieldButton578;
            jMapGameTab[i++] = jGameFieldButton577;
            jMapGameTab[i++] = jGameFieldButton576;
            jMapGameTab[i++] = jGameFieldButton575;
            jMapGameTab[i++] = jGameFieldButton574;
            jMapGameTab[i++] = jGameFieldButton573;
            jMapGameTab[i++] = jGameFieldButton616;
            jMapGameTab[i++] = jGameFieldButton615;
            jMapGameTab[i++] = jGameFieldButton614;
            jMapGameTab[i++] = jGameFieldButton613;
            jMapGameTab[i++] = jGameFieldButton612;
            jMapGameTab[i++] = jGameFieldButton611;
            jMapGameTab[i++] = jGameFieldButton610;
            jMapGameTab[i++] = jGameFieldButton609;
            jMapGameTab[i++] = jGameFieldButton608;
            jMapGameTab[i++] = jGameFieldButton607;
            jMapGameTab[i++] = jGameFieldButton606;
            jMapGameTab[i++] = jGameFieldButton605;
            jMapGameTab[i++] = jGameFieldButton604;
            jMapGameTab[i++] = jGameFieldButton603;
            jMapGameTab[i++] = jGameFieldButton602;
            jMapGameTab[i++] = jGameFieldButton601;
            jMapGameTab[i++] = jGameFieldButton600;
            jMapGameTab[i++] = jGameFieldButton599;
            jMapGameTab[i++] = jGameFieldButton598;
            jMapGameTab[i++] = jGameFieldButton597;
            jMapGameTab[i++] = jGameFieldButton596;
            jMapGameTab[i++] = jGameFieldButton595;
    }
    
    final void addMapFieldsToTab(){
        int i = 0;
            jMapEditorTab[i++] = jMapField1x1;
            jMapEditorTab[i++] = jMapField1x2;
            jMapEditorTab[i++] = jMapField1x3;
            jMapEditorTab[i++] = jMapField1x4;
            jMapEditorTab[i++] = jMapField1x5;
            jMapEditorTab[i++] = jMapField1x6;
            jMapEditorTab[i++] = jMapField1x7;
            jMapEditorTab[i++] = jMapField1x8;
            jMapEditorTab[i++] = jMapField1x9;
            jMapEditorTab[i++] = jMapField1x10;
            jMapEditorTab[i++] = jMapField1x11;
            jMapEditorTab[i++] = jMapField1x12;
            jMapEditorTab[i++] = jMapField1x13;
            jMapEditorTab[i++] = jMapField1x14;
            jMapEditorTab[i++] = jMapField1x15;
            jMapEditorTab[i++] = jMapField1x16;
            jMapEditorTab[i++] = jMapField1x17;
            jMapEditorTab[i++] = jMapField1x18;
            jMapEditorTab[i++] = jMapField1x19;
            jMapEditorTab[i++] = jMapField1x20;
            jMapEditorTab[i++] = jMapField1x21;
            jMapEditorTab[i++] = jMapField1x22;
            jMapEditorTab[i++] = jMapField1x23;
            jMapEditorTab[i++] = jMapField1x24;
            jMapEditorTab[i++] = jMapField1x25;
            jMapEditorTab[i++] = jMapField1x26;
            jMapEditorTab[i++] = jMapField1x27;
            jMapEditorTab[i++] = jMapField1x28;
            jMapEditorTab[i++] = jMapField1x29;
            jMapEditorTab[i++] = jMapField1x30;
            jMapEditorTab[i++] = jMapField1x31;
            jMapEditorTab[i++] = jMapField1x32;
            jMapEditorTab[i++] = jMapField1x33;
            jMapEditorTab[i++] = jMapField1x34;
            jMapEditorTab[i++] = jMapField1x35;
            jMapEditorTab[i++] = jMapField1x36;
            jMapEditorTab[i++] = jMapField1x37;
            jMapEditorTab[i++] = jMapField1x38;
            jMapEditorTab[i++] = jMapField1x39;
            jMapEditorTab[i++] = jMapField1x40;
            jMapEditorTab[i++] = jMapField1x41;
            jMapEditorTab[i++] = jMapField1x42;
            jMapEditorTab[i++] = jMapField1x43;
            jMapEditorTab[i++] = jMapField1x44;
            jMapEditorTab[i++] = jMapField1x45;
            jMapEditorTab[i++] = jMapField1x46;
            jMapEditorTab[i++] = jMapField1x47;
            jMapEditorTab[i++] = jMapField1x48;
            jMapEditorTab[i++] = jMapField1x49;
            jMapEditorTab[i++] = jMapField1x50;
            jMapEditorTab[i++] = jMapField1x51;
            jMapEditorTab[i++] = jMapField1x52;
            jMapEditorTab[i++] = jMapField1x53;
            jMapEditorTab[i++] = jMapField1x54;
            jMapEditorTab[i++] = jMapField1x55;
            jMapEditorTab[i++] = jMapField1x56;
            jMapEditorTab[i++] = jMapField1x57;
            jMapEditorTab[i++] = jMapField1x58;
            jMapEditorTab[i++] = jMapField1x59;
            jMapEditorTab[i++] = jMapField1x60;
            jMapEditorTab[i++] = jMapField1x61;
            jMapEditorTab[i++] = jMapField1x62;
            jMapEditorTab[i++] = jMapField1x63;
            jMapEditorTab[i++] = jMapField1x64;
            jMapEditorTab[i++] = jMapField1x65;
            jMapEditorTab[i++] = jMapField1x66;
            jMapEditorTab[i++] = jMapField1x67;
            jMapEditorTab[i++] = jMapField1x68;
            jMapEditorTab[i++] = jMapField1x69;
            jMapEditorTab[i++] = jMapField1x70;
            jMapEditorTab[i++] = jMapField1x71;
            jMapEditorTab[i++] = jMapField1x72;
            jMapEditorTab[i++] = jMapField1x73;
            jMapEditorTab[i++] = jMapField1x74;
            jMapEditorTab[i++] = jMapField1x75;
            jMapEditorTab[i++] = jMapField1x76;
            jMapEditorTab[i++] = jMapField1x77;
            jMapEditorTab[i++] = jMapField1x78;
            jMapEditorTab[i++] = jMapField1x79;
            jMapEditorTab[i++] = jMapField1x80;
            jMapEditorTab[i++] = jMapField1x81;
            jMapEditorTab[i++] = jMapField1x82;
            jMapEditorTab[i++] = jMapField1x83;
            jMapEditorTab[i++] = jMapField1x84;
            jMapEditorTab[i++] = jMapField1x85;
            jMapEditorTab[i++] = jMapField1x86;
            jMapEditorTab[i++] = jMapField1x87;
            jMapEditorTab[i++] = jMapField1x88;
            jMapEditorTab[i++] = jMapField1x89;
            jMapEditorTab[i++] = jMapField1x90;
            jMapEditorTab[i++] = jMapField1x91;
            jMapEditorTab[i++] = jMapField1x92;
            jMapEditorTab[i++] = jMapField1x93;
            jMapEditorTab[i++] = jMapField1x94;
            jMapEditorTab[i++] = jMapField1x95;
            jMapEditorTab[i++] = jMapField1x96;
            jMapEditorTab[i++] = jMapField1x97;
            jMapEditorTab[i++] = jMapField1x98;
            jMapEditorTab[i++] = jMapField1x99;
            jMapEditorTab[i++] = jMapField1x100;
            jMapEditorTab[i++] = jMapField1x101;
            jMapEditorTab[i++] = jMapField1x102;
            jMapEditorTab[i++] = jMapField1x103;
            jMapEditorTab[i++] = jMapField1x104;
            jMapEditorTab[i++] = jMapField1x105;
            jMapEditorTab[i++] = jMapField1x106;
            jMapEditorTab[i++] = jMapField1x107;
            jMapEditorTab[i++] = jMapField1x108;
            jMapEditorTab[i++] = jMapField1x109;
            jMapEditorTab[i++] = jMapField1x110;
            jMapEditorTab[i++] = jMapField1x111;
            jMapEditorTab[i++] = jMapField1x112;
            jMapEditorTab[i++] = jMapField1x113;
            jMapEditorTab[i++] = jMapField1x114;
            jMapEditorTab[i++] = jMapField1x115;
            jMapEditorTab[i++] = jMapField1x116;
            jMapEditorTab[i++] = jMapField1x117;
            jMapEditorTab[i++] = jMapField1x118;
            jMapEditorTab[i++] = jMapField1x119;
            jMapEditorTab[i++] = jMapField1x120;
            jMapEditorTab[i++] = jMapField1x121;
            jMapEditorTab[i++] = jMapField1x122;
            jMapEditorTab[i++] = jMapField1x123;
            jMapEditorTab[i++] = jMapField1x124;
            jMapEditorTab[i++] = jMapField1x125;
            jMapEditorTab[i++] = jMapField1x126;
            jMapEditorTab[i++] = jMapField1x127;
            jMapEditorTab[i++] = jMapField1x128;
            jMapEditorTab[i++] = jMapField1x129;
            jMapEditorTab[i++] = jMapField1x130;
            jMapEditorTab[i++] = jMapField1x131;
            jMapEditorTab[i++] = jMapField1x132;
            jMapEditorTab[i++] = jMapField1x133;
            jMapEditorTab[i++] = jMapField1x134;
            jMapEditorTab[i++] = jMapField1x135;
            jMapEditorTab[i++] = jMapField1x136;
            jMapEditorTab[i++] = jMapField1x137;
            jMapEditorTab[i++] = jMapField1x138;
            jMapEditorTab[i++] = jMapField1x139;
            jMapEditorTab[i++] = jMapField1x140;
            jMapEditorTab[i++] = jMapField1x141;
            jMapEditorTab[i++] = jMapField1x142;
            jMapEditorTab[i++] = jMapField1x143;
            jMapEditorTab[i++] = jMapField1x144;
            jMapEditorTab[i++] = jMapField1x145;
            jMapEditorTab[i++] = jMapField1x146;
            jMapEditorTab[i++] = jMapField1x147;
            jMapEditorTab[i++] = jMapField1x148;
            jMapEditorTab[i++] = jMapField1x149;
            jMapEditorTab[i++] = jMapField1x150;
            jMapEditorTab[i++] = jMapField1x151;
            jMapEditorTab[i++] = jMapField1x152;
            jMapEditorTab[i++] = jMapField1x153;
            jMapEditorTab[i++] = jMapField1x154;
            jMapEditorTab[i++] = jMapField1x155;
            jMapEditorTab[i++] = jMapField1x156;
            jMapEditorTab[i++] = jMapField1x157;
            jMapEditorTab[i++] = jMapField1x158;
            jMapEditorTab[i++] = jMapField1x159;
            jMapEditorTab[i++] = jMapField1x160;
            jMapEditorTab[i++] = jMapField1x161;
            jMapEditorTab[i++] = jMapField1x162;
            jMapEditorTab[i++] = jMapField1x163;
            jMapEditorTab[i++] = jMapField1x164;
            jMapEditorTab[i++] = jMapField1x165;
            jMapEditorTab[i++] = jMapField1x166;
            jMapEditorTab[i++] = jMapField1x167;
            jMapEditorTab[i++] = jMapField1x168;
            jMapEditorTab[i++] = jMapField1x169;
            jMapEditorTab[i++] = jMapField1x170;
            jMapEditorTab[i++] = jMapField1x171;
            jMapEditorTab[i++] = jMapField1x172;
            jMapEditorTab[i++] = jMapField1x173;
            jMapEditorTab[i++] = jMapField1x174;
            jMapEditorTab[i++] = jMapField1x175;
            jMapEditorTab[i++] = jMapField1x176;
            jMapEditorTab[i++] = jMapField1x177;
            jMapEditorTab[i++] = jMapField1x178;
            jMapEditorTab[i++] = jMapField1x179;
            jMapEditorTab[i++] = jMapField1x180;
            jMapEditorTab[i++] = jMapField1x181;
            jMapEditorTab[i++] = jMapField1x182;
            jMapEditorTab[i++] = jMapField1x183;
            jMapEditorTab[i++] = jMapField1x184;
            jMapEditorTab[i++] = jMapField1x185;
            jMapEditorTab[i++] = jMapField1x186;
            jMapEditorTab[i++] = jMapField1x187;
            jMapEditorTab[i++] = jMapField1x188;
            jMapEditorTab[i++] = jMapField1x189;
            jMapEditorTab[i++] = jMapField1x190;
            jMapEditorTab[i++] = jMapField1x191;
            jMapEditorTab[i++] = jMapField1x192;
            jMapEditorTab[i++] = jMapField1x193;
            jMapEditorTab[i++] = jMapField1x194;
            jMapEditorTab[i++] = jMapField1x195;
            jMapEditorTab[i++] = jMapField1x196;
            jMapEditorTab[i++] = jMapField1x197;
            jMapEditorTab[i++] = jMapField1x198;
            jMapEditorTab[i++] = jMapField1x199;
            jMapEditorTab[i++] = jMapField1x200;
            jMapEditorTab[i++] = jMapField1x201;
            jMapEditorTab[i++] = jMapField1x202;
            jMapEditorTab[i++] = jMapField1x203;
            jMapEditorTab[i++] = jMapField1x204;
            jMapEditorTab[i++] = jMapField1x205;
            jMapEditorTab[i++] = jMapField1x206;
            jMapEditorTab[i++] = jMapField1x207;
            jMapEditorTab[i++] = jMapField1x208;
            jMapEditorTab[i++] = jMapField1x209;
            jMapEditorTab[i++] = jMapField1x210;
            jMapEditorTab[i++] = jMapField1x211;
            jMapEditorTab[i++] = jMapField1x212;
            jMapEditorTab[i++] = jMapField1x213;
            jMapEditorTab[i++] = jMapField1x214;
            jMapEditorTab[i++] = jMapField1x215;
            jMapEditorTab[i++] = jMapField1x216;
            jMapEditorTab[i++] = jMapField1x217;
            jMapEditorTab[i++] = jMapField1x218;
            jMapEditorTab[i++] = jMapField1x219;
            jMapEditorTab[i++] = jMapField1x220;
            jMapEditorTab[i++] = jMapField1x221;
            jMapEditorTab[i++] = jMapField1x222;
            jMapEditorTab[i++] = jMapField1x223;
            jMapEditorTab[i++] = jMapField1x224;
            jMapEditorTab[i++] = jMapField1x225;
            jMapEditorTab[i++] = jMapField1x226;
            jMapEditorTab[i++] = jMapField1x227;
            jMapEditorTab[i++] = jMapField1x228;
            jMapEditorTab[i++] = jMapField1x229;
            jMapEditorTab[i++] = jMapField1x230;
            jMapEditorTab[i++] = jMapField1x231;
            jMapEditorTab[i++] = jMapField1x232;
            jMapEditorTab[i++] = jMapField1x233;
            jMapEditorTab[i++] = jMapField1x234;
            jMapEditorTab[i++] = jMapField1x235;
            jMapEditorTab[i++] = jMapField1x236;
            jMapEditorTab[i++] = jMapField1x237;
            jMapEditorTab[i++] = jMapField1x238;
            jMapEditorTab[i++] = jMapField1x239;
            jMapEditorTab[i++] = jMapField1x240;
            jMapEditorTab[i++] = jMapField1x241;
            jMapEditorTab[i++] = jMapField1x242;
            jMapEditorTab[i++] = jMapField1x243;
            jMapEditorTab[i++] = jMapField1x244;
            jMapEditorTab[i++] = jMapField1x245;
            jMapEditorTab[i++] = jMapField1x246;
            jMapEditorTab[i++] = jMapField1x247;
            jMapEditorTab[i++] = jMapField1x248;
            jMapEditorTab[i++] = jMapField1x249;
            jMapEditorTab[i++] = jMapField1x250;
            jMapEditorTab[i++] = jMapField1x251;
            jMapEditorTab[i++] = jMapField1x252;
            jMapEditorTab[i++] = jMapField1x253;
            jMapEditorTab[i++] = jMapField1x254;
            jMapEditorTab[i++] = jMapField1x255;
            jMapEditorTab[i++] = jMapField1x256;
            jMapEditorTab[i++] = jMapField1x257;
            jMapEditorTab[i++] = jMapField1x258;
            jMapEditorTab[i++] = jMapField1x259;
            jMapEditorTab[i++] = jMapField1x260;
            jMapEditorTab[i++] = jMapField1x261;
            jMapEditorTab[i++] = jMapField1x262;
            jMapEditorTab[i++] = jMapField1x263;
            jMapEditorTab[i++] = jMapField1x264;
            jMapEditorTab[i++] = jMapField1x265;
            jMapEditorTab[i++] = jMapField1x266;
            jMapEditorTab[i++] = jMapField1x267;
            jMapEditorTab[i++] = jMapField1x268;
            jMapEditorTab[i++] = jMapField1x269;
            jMapEditorTab[i++] = jMapField1x270;
            jMapEditorTab[i++] = jMapField1x271;
            jMapEditorTab[i++] = jMapField1x272;
            jMapEditorTab[i++] = jMapField1x273;
            jMapEditorTab[i++] = jMapField1x274;
            jMapEditorTab[i++] = jMapField1x275;
            jMapEditorTab[i++] = jMapField1x276;
            jMapEditorTab[i++] = jMapField1x277;
            jMapEditorTab[i++] = jMapField1x278;
            jMapEditorTab[i++] = jMapField1x279;
            jMapEditorTab[i++] = jMapField1x280;
            jMapEditorTab[i++] = jMapField1x281;
            jMapEditorTab[i++] = jMapField1x282;
            jMapEditorTab[i++] = jMapField1x283;
            jMapEditorTab[i++] = jMapField1x284;
            jMapEditorTab[i++] = jMapField1x285;
            jMapEditorTab[i++] = jMapField1x286;
            jMapEditorTab[i++] = jMapField1x287;
            jMapEditorTab[i++] = jMapField1x288;
            jMapEditorTab[i++] = jMapField1x289;
            jMapEditorTab[i++] = jMapField1x290;
            jMapEditorTab[i++] = jMapField1x291;
            jMapEditorTab[i++] = jMapField1x292;
            jMapEditorTab[i++] = jMapField1x293;
            jMapEditorTab[i++] = jMapField1x294;
            jMapEditorTab[i++] = jMapField1x295;
            jMapEditorTab[i++] = jMapField1x296;
            jMapEditorTab[i++] = jMapField1x297;
            jMapEditorTab[i++] = jMapField1x298;
            jMapEditorTab[i++] = jMapField1x299;
            jMapEditorTab[i++] = jMapField1x300;
            jMapEditorTab[i++] = jMapField1x301;
            jMapEditorTab[i++] = jMapField1x302;
            jMapEditorTab[i++] = jMapField1x303;
            jMapEditorTab[i++] = jMapField1x304;
            jMapEditorTab[i++] = jMapField1x305;
            jMapEditorTab[i++] = jMapField1x306;
            jMapEditorTab[i++] = jMapField1x307;
            jMapEditorTab[i++] = jMapField1x308;

    }
    
    final void MapFieldsActionListener(){
        for(int i = 0; i<308; i++){
            jMapEditorTab[i].addActionListener(this);
            jMapGameTab[i].addActionListener(this);
        }
    }
    
    final int hitTest(int field){
        char hit;
        char tab[];
        if(currentPlayer)tab = computerMap;
        else tab = createdMap;
        hit = tab[field];
        if(hit == 'n'){
            tab[field] = 'h';
            return 1;
        }
        else if( hit == 'h'){ 
            return 0;
        }
        else{
            if(currentPlayer){
                playerPoints++;
                jPlayerScore.setText(Integer.toString(playerPoints));
                if(playerPoints == 30) jWinnerLabel.setText("Wygrałeś");
            }
            else{
                computerPoints++;
                jComputerScore.setText(Integer.toString(computerPoints));
                if(computerPoints == 30) jWinnerLabel.setText("Przegrałeś");
            }
            tab[field] = 'h';
            return 2;
        }
    }
    
    final int computerRound(){
        int temp;
        do{
            temp = losownik.nextInt(308);
        }while(createdMap[temp] == 'h');
        return temp;
    }
    
    final void generateRandomMap(char[] mapTab){
        createBlankMap(mapTab);
        int type;
        int size;
        while(remainingFields > 0){
            type = losownik.nextInt(3);
            size = losownik.nextInt(4 - type) + 2;
            EditorUnitPosition = losownik.nextBoolean();
            if(type == 2)size = 4;
            currentUsedEditorUnit = fabryka.ProdukcjaJednostek(type, size);
            addUnitToMap(losownik.nextInt(308), mapTab);
        }
    }
    
    final void newGameConfig(){
        computerPoints = 0;
        shots = 0;
        jShotCounterLabel.setText(Integer.toString(shots));
        playerPoints = 0;
        jPlayerScore.setText(Integer.toString(playerPoints));
        jComputerScore.setText(Integer.toString(computerPoints));
        char[]currentUsedTab;
        int j;
        for(int i = 0;i<616;i++){
             if(i < 308){
                 currentUsedTab = computerMap;
                 j = i;
             }else{
                 currentUsedTab = createdMap;
                 j = 615 - i;
             }
             char switchChar = currentUsedTab[j];
             if(i < 308)switchChar = 'n';
             switch(switchChar){
                 case 'n':{
                     if(i<154 || i>461)jMapGameTab[i].setIcon(land);
                     else jMapGameTab[i].setIcon(water);
                 }
                 break;
                 case 'p':{
                     jMapGameTab[i].setIcon(fabryka.ProdukcjaJednostek(1,1).getIcon());
                 }
                 break;
                 case 's':{
                     jMapGameTab[i].setIcon(fabryka.ProdukcjaJednostek(0,1).getIcon());
                 }
                 break;
                 case 't':{
                     jMapGameTab[i].setIcon(fabryka.ProdukcjaJednostek(2,1).getIcon());
                 }
             }
        }
    }
    
    final void createBlankMap(char[] tab){
        remainingFields = 30;
        jRemainingFieldsLabel.setText("Pozostało: " + remainingFields);
        for(int i = 0; i<308; i++){
            if(i<154)jMapEditorTab[i].setIcon(land);
            else jMapEditorTab[i].setIcon(water);
            tab[i] = 'n';
        }
    }
    
    void addUnitToMap(int field, char[] mapTab){
        int size = currentUsedEditorUnit.getSize();
        int[] fields = new int[size];
        char type = currentUsedEditorUnit.getType();
        for(int i = 0; i<size ;i++){
            fields[i] = field;
            if(EditorUnitPosition|| type == 't')field++;
            else field += 22;
            if(i == 2 && type =='t')field += 20;
        }
        if(isCorrect(fields, mapTab)){
            Icon icon = currentUsedEditorUnit.getIcon();
            for(int j = 0; j<size ;j++){
                int temp = fields[j];
                jMapEditorTab[temp].setIcon(icon);
                mapTab[temp] = type;
            }
            remainingFields -= size;
            jRemainingFieldsLabel.setText("Pozostało: " + remainingFields);
        } 
    }
    
    boolean isCorrect(int[] unit, char[] mapTab){
        int unitLength = unit.length;
        int lastField = unit[unitLength - 1];
        int firstField = unit[0];
        char type = currentUsedEditorUnit.getType();
        if(remainingFields < unitLength || remainingFields - unitLength == 1)return false;
        if(lastField > 307)return false;
        if(type == 'p' && lastField > 153) return false;
        if(type == 's' && firstField < 154) return false;
        if(EditorUnitPosition && type != 't' && firstField/22 != lastField/22)return false;
        if(type == 't' && firstField/22 != unit[2]/22)return false;
        for(int i = 0; i<308; i++){
            for(int j = 0; j<unitLength; j++){
                int difference = Math.abs(unit[j] - i);
                if(mapTab[i] != 'n' ){
                    if(difference == 22)return false;
                    if(difference < 2 && Math.abs((unit[j] % 22) - (i % 22)) < 2)return false;
                } 
            }
        }
        return true;
    }
    
    void distableeButton(JButton button){
        jPojazd2Button.setEnabled(true);
        jPojazd3Button.setEnabled(true);
        jPojazd4Button.setEnabled(true);
        jStatek2Button.setEnabled(true);
        jStatek3Button.setEnabled(true);
        jStatek4Button.setEnabled(true);
        jStatek5Button.setEnabled(true);
        jSamolotButton.setEnabled(true);
        button.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMapEditorFrame = new javax.swing.JFrame();
        jMapField1x1 = new javax.swing.JButton();
        jMapField1x2 = new javax.swing.JButton();
        jMapField1x3 = new javax.swing.JButton();
        jMapField1x4 = new javax.swing.JButton();
        jMapField1x5 = new javax.swing.JButton();
        jMapField1x6 = new javax.swing.JButton();
        jMapField1x7 = new javax.swing.JButton();
        jMapField1x8 = new javax.swing.JButton();
        jMapField1x9 = new javax.swing.JButton();
        jMapField1x10 = new javax.swing.JButton();
        jMapField1x11 = new javax.swing.JButton();
        jMapField1x12 = new javax.swing.JButton();
        jMapField1x13 = new javax.swing.JButton();
        jMapField1x14 = new javax.swing.JButton();
        jMapField1x15 = new javax.swing.JButton();
        jMapField1x16 = new javax.swing.JButton();
        jMapField1x17 = new javax.swing.JButton();
        jMapField1x18 = new javax.swing.JButton();
        jMapField1x19 = new javax.swing.JButton();
        jMapField1x20 = new javax.swing.JButton();
        jMapField1x21 = new javax.swing.JButton();
        jMapField1x22 = new javax.swing.JButton();
        jMapField1x23 = new javax.swing.JButton();
        jMapField1x24 = new javax.swing.JButton();
        jMapField1x25 = new javax.swing.JButton();
        jMapField1x26 = new javax.swing.JButton();
        jMapField1x27 = new javax.swing.JButton();
        jMapField1x28 = new javax.swing.JButton();
        jMapField1x29 = new javax.swing.JButton();
        jMapField1x30 = new javax.swing.JButton();
        jMapField1x31 = new javax.swing.JButton();
        jMapField1x32 = new javax.swing.JButton();
        jMapField1x33 = new javax.swing.JButton();
        jMapField1x34 = new javax.swing.JButton();
        jMapField1x35 = new javax.swing.JButton();
        jMapField1x36 = new javax.swing.JButton();
        jMapField1x37 = new javax.swing.JButton();
        jMapField1x38 = new javax.swing.JButton();
        jMapField1x39 = new javax.swing.JButton();
        jMapField1x40 = new javax.swing.JButton();
        jMapField1x41 = new javax.swing.JButton();
        jMapField1x42 = new javax.swing.JButton();
        jMapField1x43 = new javax.swing.JButton();
        jMapField1x44 = new javax.swing.JButton();
        jMapField1x45 = new javax.swing.JButton();
        jMapField1x46 = new javax.swing.JButton();
        jMapField1x47 = new javax.swing.JButton();
        jMapField1x48 = new javax.swing.JButton();
        jMapField1x49 = new javax.swing.JButton();
        jMapField1x50 = new javax.swing.JButton();
        jMapField1x51 = new javax.swing.JButton();
        jMapField1x52 = new javax.swing.JButton();
        jMapField1x53 = new javax.swing.JButton();
        jMapField1x54 = new javax.swing.JButton();
        jMapField1x55 = new javax.swing.JButton();
        jMapField1x56 = new javax.swing.JButton();
        jMapField1x57 = new javax.swing.JButton();
        jMapField1x58 = new javax.swing.JButton();
        jMapField1x59 = new javax.swing.JButton();
        jMapField1x60 = new javax.swing.JButton();
        jMapField1x61 = new javax.swing.JButton();
        jMapField1x62 = new javax.swing.JButton();
        jMapField1x63 = new javax.swing.JButton();
        jMapField1x64 = new javax.swing.JButton();
        jMapField1x65 = new javax.swing.JButton();
        jMapField1x66 = new javax.swing.JButton();
        jMapField1x67 = new javax.swing.JButton();
        jMapField1x68 = new javax.swing.JButton();
        jMapField1x69 = new javax.swing.JButton();
        jMapField1x70 = new javax.swing.JButton();
        jMapField1x71 = new javax.swing.JButton();
        jMapField1x72 = new javax.swing.JButton();
        jMapField1x73 = new javax.swing.JButton();
        jMapField1x74 = new javax.swing.JButton();
        jMapField1x75 = new javax.swing.JButton();
        jMapField1x76 = new javax.swing.JButton();
        jMapField1x77 = new javax.swing.JButton();
        jMapField1x78 = new javax.swing.JButton();
        jMapField1x79 = new javax.swing.JButton();
        jMapField1x80 = new javax.swing.JButton();
        jMapField1x81 = new javax.swing.JButton();
        jMapField1x82 = new javax.swing.JButton();
        jMapField1x83 = new javax.swing.JButton();
        jMapField1x84 = new javax.swing.JButton();
        jMapField1x85 = new javax.swing.JButton();
        jMapField1x86 = new javax.swing.JButton();
        jMapField1x87 = new javax.swing.JButton();
        jMapField1x88 = new javax.swing.JButton();
        jMapField1x89 = new javax.swing.JButton();
        jMapField1x90 = new javax.swing.JButton();
        jMapField1x91 = new javax.swing.JButton();
        jMapField1x92 = new javax.swing.JButton();
        jMapField1x93 = new javax.swing.JButton();
        jMapField1x94 = new javax.swing.JButton();
        jMapField1x95 = new javax.swing.JButton();
        jMapField1x96 = new javax.swing.JButton();
        jMapField1x97 = new javax.swing.JButton();
        jMapField1x98 = new javax.swing.JButton();
        jMapField1x99 = new javax.swing.JButton();
        jMapField1x100 = new javax.swing.JButton();
        jMapField1x101 = new javax.swing.JButton();
        jMapField1x102 = new javax.swing.JButton();
        jMapField1x103 = new javax.swing.JButton();
        jMapField1x104 = new javax.swing.JButton();
        jMapField1x105 = new javax.swing.JButton();
        jMapField1x106 = new javax.swing.JButton();
        jMapField1x107 = new javax.swing.JButton();
        jMapField1x108 = new javax.swing.JButton();
        jMapField1x109 = new javax.swing.JButton();
        jMapField1x110 = new javax.swing.JButton();
        jMapField1x111 = new javax.swing.JButton();
        jMapField1x112 = new javax.swing.JButton();
        jMapField1x113 = new javax.swing.JButton();
        jMapField1x114 = new javax.swing.JButton();
        jMapField1x115 = new javax.swing.JButton();
        jMapField1x116 = new javax.swing.JButton();
        jMapField1x117 = new javax.swing.JButton();
        jMapField1x118 = new javax.swing.JButton();
        jMapField1x119 = new javax.swing.JButton();
        jMapField1x120 = new javax.swing.JButton();
        jMapField1x121 = new javax.swing.JButton();
        jMapField1x122 = new javax.swing.JButton();
        jMapField1x123 = new javax.swing.JButton();
        jMapField1x124 = new javax.swing.JButton();
        jMapField1x125 = new javax.swing.JButton();
        jMapField1x126 = new javax.swing.JButton();
        jMapField1x127 = new javax.swing.JButton();
        jMapField1x128 = new javax.swing.JButton();
        jMapField1x129 = new javax.swing.JButton();
        jMapField1x130 = new javax.swing.JButton();
        jMapField1x131 = new javax.swing.JButton();
        jMapField1x132 = new javax.swing.JButton();
        jMapField1x133 = new javax.swing.JButton();
        jMapField1x134 = new javax.swing.JButton();
        jMapField1x135 = new javax.swing.JButton();
        jMapField1x136 = new javax.swing.JButton();
        jMapField1x137 = new javax.swing.JButton();
        jMapField1x138 = new javax.swing.JButton();
        jMapField1x139 = new javax.swing.JButton();
        jMapField1x140 = new javax.swing.JButton();
        jMapField1x141 = new javax.swing.JButton();
        jMapField1x142 = new javax.swing.JButton();
        jMapField1x143 = new javax.swing.JButton();
        jMapField1x144 = new javax.swing.JButton();
        jMapField1x145 = new javax.swing.JButton();
        jMapField1x146 = new javax.swing.JButton();
        jMapField1x147 = new javax.swing.JButton();
        jMapField1x148 = new javax.swing.JButton();
        jMapField1x149 = new javax.swing.JButton();
        jMapField1x150 = new javax.swing.JButton();
        jMapField1x151 = new javax.swing.JButton();
        jMapField1x152 = new javax.swing.JButton();
        jMapField1x153 = new javax.swing.JButton();
        jMapField1x154 = new javax.swing.JButton();
        jMapField1x155 = new javax.swing.JButton();
        jMapField1x156 = new javax.swing.JButton();
        jMapField1x157 = new javax.swing.JButton();
        jMapField1x158 = new javax.swing.JButton();
        jMapField1x159 = new javax.swing.JButton();
        jMapField1x160 = new javax.swing.JButton();
        jMapField1x161 = new javax.swing.JButton();
        jMapField1x162 = new javax.swing.JButton();
        jMapField1x163 = new javax.swing.JButton();
        jMapField1x164 = new javax.swing.JButton();
        jMapField1x165 = new javax.swing.JButton();
        jMapField1x166 = new javax.swing.JButton();
        jMapField1x167 = new javax.swing.JButton();
        jMapField1x168 = new javax.swing.JButton();
        jMapField1x169 = new javax.swing.JButton();
        jMapField1x170 = new javax.swing.JButton();
        jMapField1x171 = new javax.swing.JButton();
        jMapField1x172 = new javax.swing.JButton();
        jMapField1x173 = new javax.swing.JButton();
        jMapField1x174 = new javax.swing.JButton();
        jMapField1x175 = new javax.swing.JButton();
        jMapField1x176 = new javax.swing.JButton();
        jMapField1x177 = new javax.swing.JButton();
        jMapField1x178 = new javax.swing.JButton();
        jMapField1x179 = new javax.swing.JButton();
        jMapField1x180 = new javax.swing.JButton();
        jMapField1x181 = new javax.swing.JButton();
        jMapField1x182 = new javax.swing.JButton();
        jMapField1x183 = new javax.swing.JButton();
        jMapField1x184 = new javax.swing.JButton();
        jMapField1x185 = new javax.swing.JButton();
        jMapField1x186 = new javax.swing.JButton();
        jMapField1x187 = new javax.swing.JButton();
        jMapField1x188 = new javax.swing.JButton();
        jMapField1x189 = new javax.swing.JButton();
        jMapField1x190 = new javax.swing.JButton();
        jMapField1x191 = new javax.swing.JButton();
        jMapField1x192 = new javax.swing.JButton();
        jMapField1x193 = new javax.swing.JButton();
        jMapField1x194 = new javax.swing.JButton();
        jMapField1x195 = new javax.swing.JButton();
        jMapField1x196 = new javax.swing.JButton();
        jMapField1x197 = new javax.swing.JButton();
        jMapField1x198 = new javax.swing.JButton();
        jMapField1x199 = new javax.swing.JButton();
        jMapField1x200 = new javax.swing.JButton();
        jMapField1x201 = new javax.swing.JButton();
        jMapField1x202 = new javax.swing.JButton();
        jMapField1x203 = new javax.swing.JButton();
        jMapField1x204 = new javax.swing.JButton();
        jMapField1x205 = new javax.swing.JButton();
        jMapField1x206 = new javax.swing.JButton();
        jMapField1x207 = new javax.swing.JButton();
        jMapField1x208 = new javax.swing.JButton();
        jMapField1x209 = new javax.swing.JButton();
        jMapField1x210 = new javax.swing.JButton();
        jMapField1x211 = new javax.swing.JButton();
        jMapField1x212 = new javax.swing.JButton();
        jMapField1x213 = new javax.swing.JButton();
        jMapField1x214 = new javax.swing.JButton();
        jMapField1x215 = new javax.swing.JButton();
        jMapField1x216 = new javax.swing.JButton();
        jMapField1x217 = new javax.swing.JButton();
        jMapField1x218 = new javax.swing.JButton();
        jMapField1x219 = new javax.swing.JButton();
        jMapField1x220 = new javax.swing.JButton();
        jMapField1x221 = new javax.swing.JButton();
        jMapField1x222 = new javax.swing.JButton();
        jMapField1x223 = new javax.swing.JButton();
        jMapField1x224 = new javax.swing.JButton();
        jMapField1x225 = new javax.swing.JButton();
        jMapField1x226 = new javax.swing.JButton();
        jMapField1x227 = new javax.swing.JButton();
        jMapField1x228 = new javax.swing.JButton();
        jMapField1x229 = new javax.swing.JButton();
        jMapField1x230 = new javax.swing.JButton();
        jMapField1x231 = new javax.swing.JButton();
        jMapField1x232 = new javax.swing.JButton();
        jMapField1x233 = new javax.swing.JButton();
        jMapField1x234 = new javax.swing.JButton();
        jMapField1x235 = new javax.swing.JButton();
        jMapField1x236 = new javax.swing.JButton();
        jMapField1x237 = new javax.swing.JButton();
        jMapField1x238 = new javax.swing.JButton();
        jMapField1x239 = new javax.swing.JButton();
        jMapField1x240 = new javax.swing.JButton();
        jMapField1x241 = new javax.swing.JButton();
        jMapField1x242 = new javax.swing.JButton();
        jMapField1x243 = new javax.swing.JButton();
        jMapField1x244 = new javax.swing.JButton();
        jMapField1x245 = new javax.swing.JButton();
        jMapField1x246 = new javax.swing.JButton();
        jMapField1x247 = new javax.swing.JButton();
        jMapField1x248 = new javax.swing.JButton();
        jMapField1x249 = new javax.swing.JButton();
        jMapField1x250 = new javax.swing.JButton();
        jMapField1x251 = new javax.swing.JButton();
        jMapField1x252 = new javax.swing.JButton();
        jMapField1x253 = new javax.swing.JButton();
        jMapField1x254 = new javax.swing.JButton();
        jMapField1x255 = new javax.swing.JButton();
        jMapField1x256 = new javax.swing.JButton();
        jMapField1x257 = new javax.swing.JButton();
        jMapField1x258 = new javax.swing.JButton();
        jMapField1x259 = new javax.swing.JButton();
        jMapField1x260 = new javax.swing.JButton();
        jMapField1x261 = new javax.swing.JButton();
        jMapField1x262 = new javax.swing.JButton();
        jMapField1x263 = new javax.swing.JButton();
        jMapField1x264 = new javax.swing.JButton();
        jMapField1x265 = new javax.swing.JButton();
        jMapField1x266 = new javax.swing.JButton();
        jMapField1x267 = new javax.swing.JButton();
        jMapField1x268 = new javax.swing.JButton();
        jMapField1x269 = new javax.swing.JButton();
        jMapField1x270 = new javax.swing.JButton();
        jMapField1x271 = new javax.swing.JButton();
        jMapField1x272 = new javax.swing.JButton();
        jMapField1x273 = new javax.swing.JButton();
        jMapField1x274 = new javax.swing.JButton();
        jMapField1x275 = new javax.swing.JButton();
        jMapField1x276 = new javax.swing.JButton();
        jMapField1x277 = new javax.swing.JButton();
        jMapField1x278 = new javax.swing.JButton();
        jMapField1x279 = new javax.swing.JButton();
        jMapField1x280 = new javax.swing.JButton();
        jMapField1x281 = new javax.swing.JButton();
        jMapField1x282 = new javax.swing.JButton();
        jMapField1x283 = new javax.swing.JButton();
        jMapField1x284 = new javax.swing.JButton();
        jMapField1x285 = new javax.swing.JButton();
        jMapField1x286 = new javax.swing.JButton();
        jMapField1x287 = new javax.swing.JButton();
        jMapField1x288 = new javax.swing.JButton();
        jMapField1x289 = new javax.swing.JButton();
        jMapField1x290 = new javax.swing.JButton();
        jMapField1x291 = new javax.swing.JButton();
        jMapField1x292 = new javax.swing.JButton();
        jMapField1x293 = new javax.swing.JButton();
        jMapField1x294 = new javax.swing.JButton();
        jMapField1x295 = new javax.swing.JButton();
        jMapField1x296 = new javax.swing.JButton();
        jMapField1x297 = new javax.swing.JButton();
        jMapField1x298 = new javax.swing.JButton();
        jMapField1x299 = new javax.swing.JButton();
        jMapField1x300 = new javax.swing.JButton();
        jMapField1x301 = new javax.swing.JButton();
        jMapField1x302 = new javax.swing.JButton();
        jMapField1x303 = new javax.swing.JButton();
        jMapField1x304 = new javax.swing.JButton();
        jMapField1x305 = new javax.swing.JButton();
        jMapField1x306 = new javax.swing.JButton();
        jMapField1x307 = new javax.swing.JButton();
        jMapField1x308 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPoziomoButton = new javax.swing.JButton();
        jPionowoButton = new javax.swing.JButton();
        jPojazd2Button = new javax.swing.JButton();
        jPojazd3Button = new javax.swing.JButton();
        jPojazd4Button = new javax.swing.JButton();
        jStatek2Button = new javax.swing.JButton();
        jStatek3Button = new javax.swing.JButton();
        jStatek4Button = new javax.swing.JButton();
        jStatek5Button = new javax.swing.JButton();
        jSamolotButton = new javax.swing.JButton();
        jEditorSaveButton = new javax.swing.JButton();
        jResetMapButton = new javax.swing.JButton();
        jRemainingFieldsLabel = new javax.swing.JLabel();
        jRandomMapButton = new javax.swing.JButton();
        FileChooserFrame = new javax.swing.JFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        jGameFrame = new javax.swing.JFrame();
        jGameFieldButton1 = new javax.swing.JButton();
        jGameFieldButton2 = new javax.swing.JButton();
        jGameFieldButton3 = new javax.swing.JButton();
        jGameFieldButton4 = new javax.swing.JButton();
        jGameFieldButton5 = new javax.swing.JButton();
        jGameFieldButton6 = new javax.swing.JButton();
        jGameFieldButton7 = new javax.swing.JButton();
        jGameFieldButton8 = new javax.swing.JButton();
        jGameFieldButton9 = new javax.swing.JButton();
        jGameFieldButton10 = new javax.swing.JButton();
        jGameFieldButton11 = new javax.swing.JButton();
        jGameFieldButton12 = new javax.swing.JButton();
        jGameFieldButton13 = new javax.swing.JButton();
        jGameFieldButton14 = new javax.swing.JButton();
        jGameFieldButton15 = new javax.swing.JButton();
        jGameFieldButton16 = new javax.swing.JButton();
        jGameFieldButton17 = new javax.swing.JButton();
        jGameFieldButton18 = new javax.swing.JButton();
        jGameFieldButton19 = new javax.swing.JButton();
        jGameFieldButton20 = new javax.swing.JButton();
        jGameFieldButton21 = new javax.swing.JButton();
        jGameFieldButton22 = new javax.swing.JButton();
        jGameFieldButton23 = new javax.swing.JButton();
        jGameFieldButton24 = new javax.swing.JButton();
        jGameFieldButton25 = new javax.swing.JButton();
        jGameFieldButton26 = new javax.swing.JButton();
        jGameFieldButton27 = new javax.swing.JButton();
        jGameFieldButton28 = new javax.swing.JButton();
        jGameFieldButton29 = new javax.swing.JButton();
        jGameFieldButton30 = new javax.swing.JButton();
        jGameFieldButton31 = new javax.swing.JButton();
        jGameFieldButton32 = new javax.swing.JButton();
        jGameFieldButton33 = new javax.swing.JButton();
        jGameFieldButton34 = new javax.swing.JButton();
        jGameFieldButton35 = new javax.swing.JButton();
        jGameFieldButton36 = new javax.swing.JButton();
        jGameFieldButton37 = new javax.swing.JButton();
        jGameFieldButton38 = new javax.swing.JButton();
        jGameFieldButton39 = new javax.swing.JButton();
        jGameFieldButton40 = new javax.swing.JButton();
        jGameFieldButton41 = new javax.swing.JButton();
        jGameFieldButton42 = new javax.swing.JButton();
        jGameFieldButton43 = new javax.swing.JButton();
        jGameFieldButton44 = new javax.swing.JButton();
        jGameFieldButton45 = new javax.swing.JButton();
        jGameFieldButton46 = new javax.swing.JButton();
        jGameFieldButton47 = new javax.swing.JButton();
        jGameFieldButton48 = new javax.swing.JButton();
        jGameFieldButton49 = new javax.swing.JButton();
        jGameFieldButton50 = new javax.swing.JButton();
        jGameFieldButton51 = new javax.swing.JButton();
        jGameFieldButton52 = new javax.swing.JButton();
        jGameFieldButton53 = new javax.swing.JButton();
        jGameFieldButton54 = new javax.swing.JButton();
        jGameFieldButton55 = new javax.swing.JButton();
        jGameFieldButton56 = new javax.swing.JButton();
        jGameFieldButton57 = new javax.swing.JButton();
        jGameFieldButton58 = new javax.swing.JButton();
        jGameFieldButton59 = new javax.swing.JButton();
        jGameFieldButton60 = new javax.swing.JButton();
        jGameFieldButton61 = new javax.swing.JButton();
        jGameFieldButton62 = new javax.swing.JButton();
        jGameFieldButton63 = new javax.swing.JButton();
        jGameFieldButton64 = new javax.swing.JButton();
        jGameFieldButton65 = new javax.swing.JButton();
        jGameFieldButton66 = new javax.swing.JButton();
        jGameFieldButton67 = new javax.swing.JButton();
        jGameFieldButton68 = new javax.swing.JButton();
        jGameFieldButton69 = new javax.swing.JButton();
        jGameFieldButton70 = new javax.swing.JButton();
        jGameFieldButton71 = new javax.swing.JButton();
        jGameFieldButton72 = new javax.swing.JButton();
        jGameFieldButton73 = new javax.swing.JButton();
        jGameFieldButton74 = new javax.swing.JButton();
        jGameFieldButton75 = new javax.swing.JButton();
        jGameFieldButton76 = new javax.swing.JButton();
        jGameFieldButton77 = new javax.swing.JButton();
        jGameFieldButton78 = new javax.swing.JButton();
        jGameFieldButton79 = new javax.swing.JButton();
        jGameFieldButton80 = new javax.swing.JButton();
        jGameFieldButton81 = new javax.swing.JButton();
        jGameFieldButton82 = new javax.swing.JButton();
        jGameFieldButton83 = new javax.swing.JButton();
        jGameFieldButton84 = new javax.swing.JButton();
        jGameFieldButton85 = new javax.swing.JButton();
        jGameFieldButton86 = new javax.swing.JButton();
        jGameFieldButton87 = new javax.swing.JButton();
        jGameFieldButton88 = new javax.swing.JButton();
        jGameFieldButton89 = new javax.swing.JButton();
        jGameFieldButton90 = new javax.swing.JButton();
        jGameFieldButton91 = new javax.swing.JButton();
        jGameFieldButton92 = new javax.swing.JButton();
        jGameFieldButton93 = new javax.swing.JButton();
        jGameFieldButton94 = new javax.swing.JButton();
        jGameFieldButton95 = new javax.swing.JButton();
        jGameFieldButton96 = new javax.swing.JButton();
        jGameFieldButton97 = new javax.swing.JButton();
        jGameFieldButton98 = new javax.swing.JButton();
        jGameFieldButton99 = new javax.swing.JButton();
        jGameFieldButton100 = new javax.swing.JButton();
        jGameFieldButton101 = new javax.swing.JButton();
        jGameFieldButton102 = new javax.swing.JButton();
        jGameFieldButton103 = new javax.swing.JButton();
        jGameFieldButton104 = new javax.swing.JButton();
        jGameFieldButton105 = new javax.swing.JButton();
        jGameFieldButton106 = new javax.swing.JButton();
        jGameFieldButton107 = new javax.swing.JButton();
        jGameFieldButton108 = new javax.swing.JButton();
        jGameFieldButton109 = new javax.swing.JButton();
        jGameFieldButton110 = new javax.swing.JButton();
        jGameFieldButton111 = new javax.swing.JButton();
        jGameFieldButton112 = new javax.swing.JButton();
        jGameFieldButton113 = new javax.swing.JButton();
        jGameFieldButton114 = new javax.swing.JButton();
        jGameFieldButton115 = new javax.swing.JButton();
        jGameFieldButton116 = new javax.swing.JButton();
        jGameFieldButton117 = new javax.swing.JButton();
        jGameFieldButton118 = new javax.swing.JButton();
        jGameFieldButton119 = new javax.swing.JButton();
        jGameFieldButton120 = new javax.swing.JButton();
        jGameFieldButton121 = new javax.swing.JButton();
        jGameFieldButton122 = new javax.swing.JButton();
        jGameFieldButton123 = new javax.swing.JButton();
        jGameFieldButton124 = new javax.swing.JButton();
        jGameFieldButton125 = new javax.swing.JButton();
        jGameFieldButton126 = new javax.swing.JButton();
        jGameFieldButton127 = new javax.swing.JButton();
        jGameFieldButton128 = new javax.swing.JButton();
        jGameFieldButton129 = new javax.swing.JButton();
        jGameFieldButton130 = new javax.swing.JButton();
        jGameFieldButton131 = new javax.swing.JButton();
        jGameFieldButton132 = new javax.swing.JButton();
        jGameFieldButton133 = new javax.swing.JButton();
        jGameFieldButton134 = new javax.swing.JButton();
        jGameFieldButton135 = new javax.swing.JButton();
        jGameFieldButton136 = new javax.swing.JButton();
        jGameFieldButton137 = new javax.swing.JButton();
        jGameFieldButton138 = new javax.swing.JButton();
        jGameFieldButton139 = new javax.swing.JButton();
        jGameFieldButton140 = new javax.swing.JButton();
        jGameFieldButton141 = new javax.swing.JButton();
        jGameFieldButton142 = new javax.swing.JButton();
        jGameFieldButton143 = new javax.swing.JButton();
        jGameFieldButton144 = new javax.swing.JButton();
        jGameFieldButton145 = new javax.swing.JButton();
        jGameFieldButton146 = new javax.swing.JButton();
        jGameFieldButton147 = new javax.swing.JButton();
        jGameFieldButton148 = new javax.swing.JButton();
        jGameFieldButton149 = new javax.swing.JButton();
        jGameFieldButton150 = new javax.swing.JButton();
        jGameFieldButton151 = new javax.swing.JButton();
        jGameFieldButton152 = new javax.swing.JButton();
        jGameFieldButton153 = new javax.swing.JButton();
        jGameFieldButton154 = new javax.swing.JButton();
        jGameFieldButton155 = new javax.swing.JButton();
        jGameFieldButton156 = new javax.swing.JButton();
        jGameFieldButton157 = new javax.swing.JButton();
        jGameFieldButton158 = new javax.swing.JButton();
        jGameFieldButton159 = new javax.swing.JButton();
        jGameFieldButton160 = new javax.swing.JButton();
        jGameFieldButton161 = new javax.swing.JButton();
        jGameFieldButton162 = new javax.swing.JButton();
        jGameFieldButton163 = new javax.swing.JButton();
        jGameFieldButton164 = new javax.swing.JButton();
        jGameFieldButton165 = new javax.swing.JButton();
        jGameFieldButton166 = new javax.swing.JButton();
        jGameFieldButton167 = new javax.swing.JButton();
        jGameFieldButton168 = new javax.swing.JButton();
        jGameFieldButton169 = new javax.swing.JButton();
        jGameFieldButton170 = new javax.swing.JButton();
        jGameFieldButton171 = new javax.swing.JButton();
        jGameFieldButton172 = new javax.swing.JButton();
        jGameFieldButton173 = new javax.swing.JButton();
        jGameFieldButton174 = new javax.swing.JButton();
        jGameFieldButton175 = new javax.swing.JButton();
        jGameFieldButton176 = new javax.swing.JButton();
        jGameFieldButton177 = new javax.swing.JButton();
        jGameFieldButton178 = new javax.swing.JButton();
        jGameFieldButton179 = new javax.swing.JButton();
        jGameFieldButton180 = new javax.swing.JButton();
        jGameFieldButton181 = new javax.swing.JButton();
        jGameFieldButton182 = new javax.swing.JButton();
        jGameFieldButton183 = new javax.swing.JButton();
        jGameFieldButton184 = new javax.swing.JButton();
        jGameFieldButton185 = new javax.swing.JButton();
        jGameFieldButton186 = new javax.swing.JButton();
        jGameFieldButton187 = new javax.swing.JButton();
        jGameFieldButton188 = new javax.swing.JButton();
        jGameFieldButton189 = new javax.swing.JButton();
        jGameFieldButton190 = new javax.swing.JButton();
        jGameFieldButton191 = new javax.swing.JButton();
        jGameFieldButton192 = new javax.swing.JButton();
        jGameFieldButton193 = new javax.swing.JButton();
        jGameFieldButton194 = new javax.swing.JButton();
        jGameFieldButton195 = new javax.swing.JButton();
        jGameFieldButton196 = new javax.swing.JButton();
        jGameFieldButton197 = new javax.swing.JButton();
        jGameFieldButton198 = new javax.swing.JButton();
        jGameFieldButton199 = new javax.swing.JButton();
        jGameFieldButton200 = new javax.swing.JButton();
        jGameFieldButton201 = new javax.swing.JButton();
        jGameFieldButton202 = new javax.swing.JButton();
        jGameFieldButton203 = new javax.swing.JButton();
        jGameFieldButton204 = new javax.swing.JButton();
        jGameFieldButton205 = new javax.swing.JButton();
        jGameFieldButton206 = new javax.swing.JButton();
        jGameFieldButton207 = new javax.swing.JButton();
        jGameFieldButton208 = new javax.swing.JButton();
        jGameFieldButton209 = new javax.swing.JButton();
        jGameFieldButton210 = new javax.swing.JButton();
        jGameFieldButton211 = new javax.swing.JButton();
        jGameFieldButton212 = new javax.swing.JButton();
        jGameFieldButton213 = new javax.swing.JButton();
        jGameFieldButton214 = new javax.swing.JButton();
        jGameFieldButton215 = new javax.swing.JButton();
        jGameFieldButton216 = new javax.swing.JButton();
        jGameFieldButton217 = new javax.swing.JButton();
        jGameFieldButton218 = new javax.swing.JButton();
        jGameFieldButton219 = new javax.swing.JButton();
        jGameFieldButton220 = new javax.swing.JButton();
        jGameFieldButton221 = new javax.swing.JButton();
        jGameFieldButton222 = new javax.swing.JButton();
        jGameFieldButton223 = new javax.swing.JButton();
        jGameFieldButton224 = new javax.swing.JButton();
        jGameFieldButton225 = new javax.swing.JButton();
        jGameFieldButton226 = new javax.swing.JButton();
        jGameFieldButton227 = new javax.swing.JButton();
        jGameFieldButton228 = new javax.swing.JButton();
        jGameFieldButton229 = new javax.swing.JButton();
        jGameFieldButton230 = new javax.swing.JButton();
        jGameFieldButton231 = new javax.swing.JButton();
        jGameFieldButton232 = new javax.swing.JButton();
        jGameFieldButton233 = new javax.swing.JButton();
        jGameFieldButton234 = new javax.swing.JButton();
        jGameFieldButton235 = new javax.swing.JButton();
        jGameFieldButton236 = new javax.swing.JButton();
        jGameFieldButton237 = new javax.swing.JButton();
        jGameFieldButton238 = new javax.swing.JButton();
        jGameFieldButton239 = new javax.swing.JButton();
        jGameFieldButton240 = new javax.swing.JButton();
        jGameFieldButton241 = new javax.swing.JButton();
        jGameFieldButton242 = new javax.swing.JButton();
        jGameFieldButton243 = new javax.swing.JButton();
        jGameFieldButton244 = new javax.swing.JButton();
        jGameFieldButton245 = new javax.swing.JButton();
        jGameFieldButton246 = new javax.swing.JButton();
        jGameFieldButton247 = new javax.swing.JButton();
        jGameFieldButton248 = new javax.swing.JButton();
        jGameFieldButton249 = new javax.swing.JButton();
        jGameFieldButton250 = new javax.swing.JButton();
        jGameFieldButton251 = new javax.swing.JButton();
        jGameFieldButton252 = new javax.swing.JButton();
        jGameFieldButton253 = new javax.swing.JButton();
        jGameFieldButton254 = new javax.swing.JButton();
        jGameFieldButton255 = new javax.swing.JButton();
        jGameFieldButton256 = new javax.swing.JButton();
        jGameFieldButton257 = new javax.swing.JButton();
        jGameFieldButton258 = new javax.swing.JButton();
        jGameFieldButton259 = new javax.swing.JButton();
        jGameFieldButton260 = new javax.swing.JButton();
        jGameFieldButton261 = new javax.swing.JButton();
        jGameFieldButton262 = new javax.swing.JButton();
        jGameFieldButton263 = new javax.swing.JButton();
        jGameFieldButton264 = new javax.swing.JButton();
        jGameFieldButton265 = new javax.swing.JButton();
        jGameFieldButton266 = new javax.swing.JButton();
        jGameFieldButton267 = new javax.swing.JButton();
        jGameFieldButton268 = new javax.swing.JButton();
        jGameFieldButton269 = new javax.swing.JButton();
        jGameFieldButton270 = new javax.swing.JButton();
        jGameFieldButton271 = new javax.swing.JButton();
        jGameFieldButton272 = new javax.swing.JButton();
        jGameFieldButton273 = new javax.swing.JButton();
        jGameFieldButton274 = new javax.swing.JButton();
        jGameFieldButton275 = new javax.swing.JButton();
        jGameFieldButton276 = new javax.swing.JButton();
        jGameFieldButton277 = new javax.swing.JButton();
        jGameFieldButton278 = new javax.swing.JButton();
        jGameFieldButton279 = new javax.swing.JButton();
        jGameFieldButton280 = new javax.swing.JButton();
        jGameFieldButton281 = new javax.swing.JButton();
        jGameFieldButton282 = new javax.swing.JButton();
        jGameFieldButton283 = new javax.swing.JButton();
        jGameFieldButton284 = new javax.swing.JButton();
        jGameFieldButton285 = new javax.swing.JButton();
        jGameFieldButton286 = new javax.swing.JButton();
        jGameFieldButton287 = new javax.swing.JButton();
        jGameFieldButton288 = new javax.swing.JButton();
        jGameFieldButton289 = new javax.swing.JButton();
        jGameFieldButton290 = new javax.swing.JButton();
        jGameFieldButton291 = new javax.swing.JButton();
        jGameFieldButton292 = new javax.swing.JButton();
        jGameFieldButton293 = new javax.swing.JButton();
        jGameFieldButton294 = new javax.swing.JButton();
        jGameFieldButton295 = new javax.swing.JButton();
        jGameFieldButton296 = new javax.swing.JButton();
        jGameFieldButton297 = new javax.swing.JButton();
        jGameFieldButton298 = new javax.swing.JButton();
        jGameFieldButton299 = new javax.swing.JButton();
        jGameFieldButton300 = new javax.swing.JButton();
        jGameFieldButton301 = new javax.swing.JButton();
        jGameFieldButton302 = new javax.swing.JButton();
        jGameFieldButton303 = new javax.swing.JButton();
        jGameFieldButton304 = new javax.swing.JButton();
        jGameFieldButton305 = new javax.swing.JButton();
        jGameFieldButton306 = new javax.swing.JButton();
        jGameFieldButton307 = new javax.swing.JButton();
        jGameFieldButton308 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPlayerScore = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComputerScore = new javax.swing.JLabel();
        jGameFieldButton309 = new javax.swing.JButton();
        jGameFieldButton310 = new javax.swing.JButton();
        jGameFieldButton311 = new javax.swing.JButton();
        jGameFieldButton312 = new javax.swing.JButton();
        jGameFieldButton313 = new javax.swing.JButton();
        jGameFieldButton314 = new javax.swing.JButton();
        jGameFieldButton315 = new javax.swing.JButton();
        jGameFieldButton316 = new javax.swing.JButton();
        jGameFieldButton317 = new javax.swing.JButton();
        jGameFieldButton318 = new javax.swing.JButton();
        jGameFieldButton319 = new javax.swing.JButton();
        jGameFieldButton320 = new javax.swing.JButton();
        jGameFieldButton321 = new javax.swing.JButton();
        jGameFieldButton322 = new javax.swing.JButton();
        jGameFieldButton323 = new javax.swing.JButton();
        jGameFieldButton324 = new javax.swing.JButton();
        jGameFieldButton325 = new javax.swing.JButton();
        jGameFieldButton326 = new javax.swing.JButton();
        jGameFieldButton327 = new javax.swing.JButton();
        jGameFieldButton328 = new javax.swing.JButton();
        jGameFieldButton329 = new javax.swing.JButton();
        jGameFieldButton330 = new javax.swing.JButton();
        jGameFieldButton331 = new javax.swing.JButton();
        jGameFieldButton332 = new javax.swing.JButton();
        jGameFieldButton333 = new javax.swing.JButton();
        jGameFieldButton334 = new javax.swing.JButton();
        jGameFieldButton335 = new javax.swing.JButton();
        jGameFieldButton336 = new javax.swing.JButton();
        jGameFieldButton337 = new javax.swing.JButton();
        jGameFieldButton338 = new javax.swing.JButton();
        jGameFieldButton339 = new javax.swing.JButton();
        jGameFieldButton340 = new javax.swing.JButton();
        jGameFieldButton341 = new javax.swing.JButton();
        jGameFieldButton342 = new javax.swing.JButton();
        jGameFieldButton343 = new javax.swing.JButton();
        jGameFieldButton344 = new javax.swing.JButton();
        jGameFieldButton345 = new javax.swing.JButton();
        jGameFieldButton346 = new javax.swing.JButton();
        jGameFieldButton347 = new javax.swing.JButton();
        jGameFieldButton348 = new javax.swing.JButton();
        jGameFieldButton349 = new javax.swing.JButton();
        jGameFieldButton350 = new javax.swing.JButton();
        jGameFieldButton351 = new javax.swing.JButton();
        jGameFieldButton352 = new javax.swing.JButton();
        jGameFieldButton353 = new javax.swing.JButton();
        jGameFieldButton354 = new javax.swing.JButton();
        jGameFieldButton355 = new javax.swing.JButton();
        jGameFieldButton356 = new javax.swing.JButton();
        jGameFieldButton357 = new javax.swing.JButton();
        jGameFieldButton358 = new javax.swing.JButton();
        jGameFieldButton359 = new javax.swing.JButton();
        jGameFieldButton360 = new javax.swing.JButton();
        jGameFieldButton361 = new javax.swing.JButton();
        jGameFieldButton362 = new javax.swing.JButton();
        jGameFieldButton363 = new javax.swing.JButton();
        jGameFieldButton364 = new javax.swing.JButton();
        jGameFieldButton365 = new javax.swing.JButton();
        jGameFieldButton366 = new javax.swing.JButton();
        jGameFieldButton367 = new javax.swing.JButton();
        jGameFieldButton368 = new javax.swing.JButton();
        jGameFieldButton369 = new javax.swing.JButton();
        jGameFieldButton370 = new javax.swing.JButton();
        jGameFieldButton371 = new javax.swing.JButton();
        jGameFieldButton372 = new javax.swing.JButton();
        jGameFieldButton373 = new javax.swing.JButton();
        jGameFieldButton374 = new javax.swing.JButton();
        jGameFieldButton375 = new javax.swing.JButton();
        jGameFieldButton376 = new javax.swing.JButton();
        jGameFieldButton377 = new javax.swing.JButton();
        jGameFieldButton378 = new javax.swing.JButton();
        jGameFieldButton379 = new javax.swing.JButton();
        jGameFieldButton380 = new javax.swing.JButton();
        jGameFieldButton381 = new javax.swing.JButton();
        jGameFieldButton382 = new javax.swing.JButton();
        jGameFieldButton383 = new javax.swing.JButton();
        jGameFieldButton384 = new javax.swing.JButton();
        jGameFieldButton385 = new javax.swing.JButton();
        jGameFieldButton386 = new javax.swing.JButton();
        jGameFieldButton387 = new javax.swing.JButton();
        jGameFieldButton388 = new javax.swing.JButton();
        jGameFieldButton389 = new javax.swing.JButton();
        jGameFieldButton390 = new javax.swing.JButton();
        jGameFieldButton391 = new javax.swing.JButton();
        jGameFieldButton392 = new javax.swing.JButton();
        jGameFieldButton393 = new javax.swing.JButton();
        jGameFieldButton394 = new javax.swing.JButton();
        jGameFieldButton395 = new javax.swing.JButton();
        jGameFieldButton396 = new javax.swing.JButton();
        jGameFieldButton397 = new javax.swing.JButton();
        jGameFieldButton398 = new javax.swing.JButton();
        jGameFieldButton399 = new javax.swing.JButton();
        jGameFieldButton400 = new javax.swing.JButton();
        jGameFieldButton401 = new javax.swing.JButton();
        jGameFieldButton402 = new javax.swing.JButton();
        jGameFieldButton403 = new javax.swing.JButton();
        jGameFieldButton404 = new javax.swing.JButton();
        jGameFieldButton405 = new javax.swing.JButton();
        jGameFieldButton406 = new javax.swing.JButton();
        jGameFieldButton407 = new javax.swing.JButton();
        jGameFieldButton408 = new javax.swing.JButton();
        jGameFieldButton409 = new javax.swing.JButton();
        jGameFieldButton410 = new javax.swing.JButton();
        jGameFieldButton411 = new javax.swing.JButton();
        jGameFieldButton412 = new javax.swing.JButton();
        jGameFieldButton413 = new javax.swing.JButton();
        jGameFieldButton414 = new javax.swing.JButton();
        jGameFieldButton415 = new javax.swing.JButton();
        jGameFieldButton416 = new javax.swing.JButton();
        jGameFieldButton417 = new javax.swing.JButton();
        jGameFieldButton418 = new javax.swing.JButton();
        jGameFieldButton419 = new javax.swing.JButton();
        jGameFieldButton420 = new javax.swing.JButton();
        jGameFieldButton421 = new javax.swing.JButton();
        jGameFieldButton422 = new javax.swing.JButton();
        jGameFieldButton423 = new javax.swing.JButton();
        jGameFieldButton424 = new javax.swing.JButton();
        jGameFieldButton425 = new javax.swing.JButton();
        jGameFieldButton426 = new javax.swing.JButton();
        jGameFieldButton427 = new javax.swing.JButton();
        jGameFieldButton428 = new javax.swing.JButton();
        jGameFieldButton429 = new javax.swing.JButton();
        jGameFieldButton430 = new javax.swing.JButton();
        jGameFieldButton431 = new javax.swing.JButton();
        jGameFieldButton432 = new javax.swing.JButton();
        jGameFieldButton433 = new javax.swing.JButton();
        jGameFieldButton434 = new javax.swing.JButton();
        jGameFieldButton435 = new javax.swing.JButton();
        jGameFieldButton436 = new javax.swing.JButton();
        jGameFieldButton437 = new javax.swing.JButton();
        jGameFieldButton438 = new javax.swing.JButton();
        jGameFieldButton439 = new javax.swing.JButton();
        jGameFieldButton440 = new javax.swing.JButton();
        jGameFieldButton441 = new javax.swing.JButton();
        jGameFieldButton442 = new javax.swing.JButton();
        jGameFieldButton443 = new javax.swing.JButton();
        jGameFieldButton444 = new javax.swing.JButton();
        jGameFieldButton445 = new javax.swing.JButton();
        jGameFieldButton446 = new javax.swing.JButton();
        jGameFieldButton447 = new javax.swing.JButton();
        jGameFieldButton448 = new javax.swing.JButton();
        jGameFieldButton449 = new javax.swing.JButton();
        jGameFieldButton450 = new javax.swing.JButton();
        jGameFieldButton451 = new javax.swing.JButton();
        jGameFieldButton452 = new javax.swing.JButton();
        jGameFieldButton453 = new javax.swing.JButton();
        jGameFieldButton454 = new javax.swing.JButton();
        jGameFieldButton455 = new javax.swing.JButton();
        jGameFieldButton456 = new javax.swing.JButton();
        jGameFieldButton457 = new javax.swing.JButton();
        jGameFieldButton458 = new javax.swing.JButton();
        jGameFieldButton459 = new javax.swing.JButton();
        jGameFieldButton460 = new javax.swing.JButton();
        jGameFieldButton461 = new javax.swing.JButton();
        jGameFieldButton462 = new javax.swing.JButton();
        jGameFieldButton463 = new javax.swing.JButton();
        jGameFieldButton464 = new javax.swing.JButton();
        jGameFieldButton465 = new javax.swing.JButton();
        jGameFieldButton466 = new javax.swing.JButton();
        jGameFieldButton467 = new javax.swing.JButton();
        jGameFieldButton468 = new javax.swing.JButton();
        jGameFieldButton469 = new javax.swing.JButton();
        jGameFieldButton470 = new javax.swing.JButton();
        jGameFieldButton471 = new javax.swing.JButton();
        jGameFieldButton472 = new javax.swing.JButton();
        jGameFieldButton473 = new javax.swing.JButton();
        jGameFieldButton474 = new javax.swing.JButton();
        jGameFieldButton475 = new javax.swing.JButton();
        jGameFieldButton476 = new javax.swing.JButton();
        jGameFieldButton477 = new javax.swing.JButton();
        jGameFieldButton478 = new javax.swing.JButton();
        jGameFieldButton479 = new javax.swing.JButton();
        jGameFieldButton480 = new javax.swing.JButton();
        jGameFieldButton481 = new javax.swing.JButton();
        jGameFieldButton482 = new javax.swing.JButton();
        jGameFieldButton483 = new javax.swing.JButton();
        jGameFieldButton484 = new javax.swing.JButton();
        jGameFieldButton485 = new javax.swing.JButton();
        jGameFieldButton486 = new javax.swing.JButton();
        jGameFieldButton487 = new javax.swing.JButton();
        jGameFieldButton488 = new javax.swing.JButton();
        jGameFieldButton489 = new javax.swing.JButton();
        jGameFieldButton490 = new javax.swing.JButton();
        jGameFieldButton491 = new javax.swing.JButton();
        jGameFieldButton492 = new javax.swing.JButton();
        jGameFieldButton493 = new javax.swing.JButton();
        jGameFieldButton494 = new javax.swing.JButton();
        jGameFieldButton495 = new javax.swing.JButton();
        jGameFieldButton496 = new javax.swing.JButton();
        jGameFieldButton497 = new javax.swing.JButton();
        jGameFieldButton498 = new javax.swing.JButton();
        jGameFieldButton499 = new javax.swing.JButton();
        jGameFieldButton500 = new javax.swing.JButton();
        jGameFieldButton501 = new javax.swing.JButton();
        jGameFieldButton502 = new javax.swing.JButton();
        jGameFieldButton503 = new javax.swing.JButton();
        jGameFieldButton504 = new javax.swing.JButton();
        jGameFieldButton505 = new javax.swing.JButton();
        jGameFieldButton506 = new javax.swing.JButton();
        jGameFieldButton507 = new javax.swing.JButton();
        jGameFieldButton508 = new javax.swing.JButton();
        jGameFieldButton509 = new javax.swing.JButton();
        jGameFieldButton510 = new javax.swing.JButton();
        jGameFieldButton511 = new javax.swing.JButton();
        jGameFieldButton512 = new javax.swing.JButton();
        jGameFieldButton513 = new javax.swing.JButton();
        jGameFieldButton514 = new javax.swing.JButton();
        jGameFieldButton515 = new javax.swing.JButton();
        jGameFieldButton516 = new javax.swing.JButton();
        jGameFieldButton517 = new javax.swing.JButton();
        jGameFieldButton518 = new javax.swing.JButton();
        jGameFieldButton519 = new javax.swing.JButton();
        jGameFieldButton520 = new javax.swing.JButton();
        jGameFieldButton521 = new javax.swing.JButton();
        jGameFieldButton522 = new javax.swing.JButton();
        jGameFieldButton523 = new javax.swing.JButton();
        jGameFieldButton524 = new javax.swing.JButton();
        jGameFieldButton525 = new javax.swing.JButton();
        jGameFieldButton526 = new javax.swing.JButton();
        jGameFieldButton527 = new javax.swing.JButton();
        jGameFieldButton528 = new javax.swing.JButton();
        jGameFieldButton529 = new javax.swing.JButton();
        jGameFieldButton530 = new javax.swing.JButton();
        jGameFieldButton531 = new javax.swing.JButton();
        jGameFieldButton532 = new javax.swing.JButton();
        jGameFieldButton533 = new javax.swing.JButton();
        jGameFieldButton534 = new javax.swing.JButton();
        jGameFieldButton535 = new javax.swing.JButton();
        jGameFieldButton536 = new javax.swing.JButton();
        jGameFieldButton537 = new javax.swing.JButton();
        jGameFieldButton538 = new javax.swing.JButton();
        jGameFieldButton539 = new javax.swing.JButton();
        jGameFieldButton540 = new javax.swing.JButton();
        jGameFieldButton541 = new javax.swing.JButton();
        jGameFieldButton542 = new javax.swing.JButton();
        jGameFieldButton543 = new javax.swing.JButton();
        jGameFieldButton544 = new javax.swing.JButton();
        jGameFieldButton545 = new javax.swing.JButton();
        jGameFieldButton546 = new javax.swing.JButton();
        jGameFieldButton547 = new javax.swing.JButton();
        jGameFieldButton548 = new javax.swing.JButton();
        jGameFieldButton549 = new javax.swing.JButton();
        jGameFieldButton550 = new javax.swing.JButton();
        jGameFieldButton551 = new javax.swing.JButton();
        jGameFieldButton552 = new javax.swing.JButton();
        jGameFieldButton553 = new javax.swing.JButton();
        jGameFieldButton554 = new javax.swing.JButton();
        jGameFieldButton555 = new javax.swing.JButton();
        jGameFieldButton556 = new javax.swing.JButton();
        jGameFieldButton557 = new javax.swing.JButton();
        jGameFieldButton558 = new javax.swing.JButton();
        jGameFieldButton559 = new javax.swing.JButton();
        jGameFieldButton560 = new javax.swing.JButton();
        jGameFieldButton561 = new javax.swing.JButton();
        jGameFieldButton562 = new javax.swing.JButton();
        jGameFieldButton563 = new javax.swing.JButton();
        jGameFieldButton564 = new javax.swing.JButton();
        jGameFieldButton565 = new javax.swing.JButton();
        jGameFieldButton566 = new javax.swing.JButton();
        jGameFieldButton567 = new javax.swing.JButton();
        jGameFieldButton568 = new javax.swing.JButton();
        jGameFieldButton569 = new javax.swing.JButton();
        jGameFieldButton570 = new javax.swing.JButton();
        jGameFieldButton571 = new javax.swing.JButton();
        jGameFieldButton572 = new javax.swing.JButton();
        jGameFieldButton573 = new javax.swing.JButton();
        jGameFieldButton574 = new javax.swing.JButton();
        jGameFieldButton575 = new javax.swing.JButton();
        jGameFieldButton576 = new javax.swing.JButton();
        jGameFieldButton577 = new javax.swing.JButton();
        jGameFieldButton578 = new javax.swing.JButton();
        jGameFieldButton579 = new javax.swing.JButton();
        jGameFieldButton580 = new javax.swing.JButton();
        jGameFieldButton581 = new javax.swing.JButton();
        jGameFieldButton582 = new javax.swing.JButton();
        jGameFieldButton583 = new javax.swing.JButton();
        jGameFieldButton584 = new javax.swing.JButton();
        jGameFieldButton585 = new javax.swing.JButton();
        jGameFieldButton586 = new javax.swing.JButton();
        jGameFieldButton587 = new javax.swing.JButton();
        jGameFieldButton588 = new javax.swing.JButton();
        jGameFieldButton589 = new javax.swing.JButton();
        jGameFieldButton590 = new javax.swing.JButton();
        jGameFieldButton591 = new javax.swing.JButton();
        jGameFieldButton592 = new javax.swing.JButton();
        jGameFieldButton593 = new javax.swing.JButton();
        jGameFieldButton594 = new javax.swing.JButton();
        jGameFieldButton595 = new javax.swing.JButton();
        jGameFieldButton596 = new javax.swing.JButton();
        jGameFieldButton597 = new javax.swing.JButton();
        jGameFieldButton598 = new javax.swing.JButton();
        jGameFieldButton599 = new javax.swing.JButton();
        jGameFieldButton600 = new javax.swing.JButton();
        jGameFieldButton601 = new javax.swing.JButton();
        jGameFieldButton602 = new javax.swing.JButton();
        jGameFieldButton603 = new javax.swing.JButton();
        jGameFieldButton604 = new javax.swing.JButton();
        jGameFieldButton605 = new javax.swing.JButton();
        jGameFieldButton606 = new javax.swing.JButton();
        jGameFieldButton607 = new javax.swing.JButton();
        jGameFieldButton608 = new javax.swing.JButton();
        jGameFieldButton609 = new javax.swing.JButton();
        jGameFieldButton610 = new javax.swing.JButton();
        jGameFieldButton611 = new javax.swing.JButton();
        jGameFieldButton612 = new javax.swing.JButton();
        jGameFieldButton613 = new javax.swing.JButton();
        jGameFieldButton614 = new javax.swing.JButton();
        jGameFieldButton615 = new javax.swing.JButton();
        jGameFieldButton616 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jShotCounterLabel = new javax.swing.JLabel();
        jWinnerLabel = new javax.swing.JLabel();
        jNewMapButton = new javax.swing.JButton();
        jStartGameButton = new javax.swing.JButton();
        jOpenComputerMap = new javax.swing.JButton();
        jSelectFileButton = new javax.swing.JButton();
        jRandOmPlayerMapButton = new javax.swing.JButton();
        jRandomComputerMapButton = new javax.swing.JButton();

        jMapEditorFrame.setAlwaysOnTop(true);
        jMapEditorFrame.setBounds(new java.awt.Rectangle(0, 0, 1035, 545));
        jMapEditorFrame.setResizable(false);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPoziomoButton.setText("Poziomo");
        jPoziomoButton.setEnabled(false);
        jPoziomoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPoziomoButtonActionPerformed(evt);
            }
        });

        jPionowoButton.setText("Pionowo");
        jPionowoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPionowoButtonActionPerformed(evt);
            }
        });

        jPojazd2Button.setText("Pojazd 2");
        jPojazd2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPojazd2ButtonActionPerformed(evt);
            }
        });

        jPojazd3Button.setText("Pojazd 3");
        jPojazd3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPojazd3ButtonActionPerformed(evt);
            }
        });

        jPojazd4Button.setText("Pojazd 4");
        jPojazd4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPojazd4ButtonActionPerformed(evt);
            }
        });

        jStatek2Button.setText("Statek 2");
        jStatek2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatek2ButtonActionPerformed(evt);
            }
        });

        jStatek3Button.setText("Statek 3");
        jStatek3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatek3ButtonActionPerformed(evt);
            }
        });

        jStatek4Button.setText("Statek4");
        jStatek4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatek4ButtonActionPerformed(evt);
            }
        });

        jStatek5Button.setText("Statek 5");
        jStatek5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatek5ButtonActionPerformed(evt);
            }
        });

        jSamolotButton.setText("Samolot 4");
        jSamolotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSamolotButtonActionPerformed(evt);
            }
        });

        jEditorSaveButton.setText("Zapisz");
        jEditorSaveButton.setEnabled(false);
        jEditorSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditorSaveButtonActionPerformed(evt);
            }
        });

        jResetMapButton.setText("Reset");
        jResetMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetMapButtonActionPerformed(evt);
            }
        });

        jRemainingFieldsLabel.setText(" ");

        jRandomMapButton.setText("Losuj");
        jRandomMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRandomMapButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMapEditorFrameLayout = new javax.swing.GroupLayout(jMapEditorFrame.getContentPane());
        jMapEditorFrame.getContentPane().setLayout(jMapEditorFrameLayout);
        jMapEditorFrameLayout.setHorizontalGroup(
            jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x88, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x89, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x90, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x91, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x93, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x94, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x95, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x96, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x97, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x98, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x99, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x103, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x104, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x105, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x106, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x107, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x108, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x109, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x110, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x111, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x112, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x113, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x114, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x115, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x116, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x117, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x118, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x119, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x120, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x121, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x122, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x123, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x124, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x125, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x126, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x127, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x128, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x129, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x131, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x132, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x133, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x134, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x135, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x136, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x137, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x138, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x139, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x140, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x141, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x142, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x143, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x144, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x146, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x147, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x148, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x149, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x150, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x151, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x152, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x153, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x154, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x155, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x156, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x157, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x158, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x159, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x160, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x161, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x162, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x163, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x164, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x165, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x166, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x167, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x168, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x169, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x170, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x171, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x172, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x173, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x174, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x175, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x176, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x177, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x178, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x179, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x180, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x181, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x182, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x183, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x184, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x185, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x186, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x187, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x188, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x189, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x190, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x191, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x192, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x193, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x194, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x195, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x196, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x197, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x198, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x199, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x200, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x201, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x202, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x203, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x204, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x205, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x206, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x207, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x208, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x209, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x210, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x211, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x212, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x213, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x214, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x215, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x216, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x217, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x218, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x219, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x220, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x221, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x222, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x223, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x224, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x225, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x226, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x227, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x228, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x229, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x230, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x231, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x232, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x233, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x234, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x235, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x236, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x237, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x238, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x239, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x240, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x241, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x242, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x243, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x244, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x245, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x246, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x247, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x248, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x249, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x250, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x251, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x252, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x253, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x254, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x255, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x256, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x257, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x258, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x259, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x260, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x261, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x262, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x263, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x264, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x265, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x266, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x267, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x268, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x269, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x270, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x271, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x272, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x273, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x274, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x275, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x276, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x277, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x278, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x279, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x280, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x281, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x282, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x283, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x284, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x285, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x286, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jMapField1x287, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x288, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x289, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x290, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x291, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x292, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x293, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x294, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x295, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x296, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x297, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x298, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x299, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x300, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x301, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x302, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x303, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x304, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x305, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x306, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x307, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMapField1x308, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPojazd2Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMapEditorFrameLayout.createSequentialGroup()
                        .addComponent(jPoziomoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPionowoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPojazd3Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPojazd4Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jStatek2Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jStatek3Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jStatek4Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jStatek5Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSamolotButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEditorSaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jResetMapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRemainingFieldsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRandomMapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jMapEditorFrameLayout.setVerticalGroup(
            jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x88, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x110, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x109, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x108, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x107, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x106, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x105, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x104, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x103, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x99, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x98, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x97, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x96, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x95, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x94, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x93, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x91, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x90, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x89, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x132, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x131, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x129, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x128, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x127, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x126, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x125, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x124, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x123, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x122, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x121, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x120, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x119, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x118, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x117, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x116, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x115, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x114, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x113, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x112, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x111, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x154, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x153, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x152, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x151, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x150, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x149, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x148, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x147, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x146, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x144, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x143, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x142, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x141, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x140, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x139, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x138, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x137, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x136, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x135, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x134, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x133, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x176, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x175, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x174, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x173, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x172, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x171, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x170, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x169, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x168, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x167, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x166, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x165, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x164, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x163, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x162, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x161, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x160, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x159, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x158, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x157, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x156, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x155, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x198, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x197, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x196, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x195, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x194, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x193, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x192, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x191, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x190, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x189, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x188, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x187, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x186, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x185, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x184, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x183, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x182, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x181, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x180, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x179, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x178, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x177, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x220, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x219, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x218, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x217, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x216, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x215, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x214, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x213, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x212, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x211, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x210, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x209, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x208, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x207, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x206, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x205, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x204, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x203, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x202, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x201, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x200, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x199, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x242, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x241, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x240, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x239, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x238, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x237, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x236, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x235, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x234, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x233, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x232, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x231, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x230, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x229, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x228, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x227, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x226, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x225, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x224, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x223, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x222, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x221, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x264, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x263, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x262, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x261, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x260, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x259, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x258, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x257, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x256, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x255, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x254, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x253, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x252, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x251, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x250, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x249, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x248, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x247, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x246, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x245, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x244, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x243, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x286, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x285, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x284, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x283, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x282, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x281, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x280, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x279, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x278, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x277, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x276, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x275, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x274, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x273, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x272, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x271, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x270, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x269, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x268, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x267, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x266, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x265, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMapField1x308, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x307, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x306, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x305, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x304, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x303, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x302, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x301, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x300, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x299, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x298, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x297, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x296, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x295, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x294, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x293, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x292, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x291, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x290, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x289, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x288, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMapField1x287, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jMapEditorFrameLayout.createSequentialGroup()
                        .addGroup(jMapEditorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPoziomoButton)
                            .addComponent(jPionowoButton))
                        .addGap(18, 18, 18)
                        .addComponent(jPojazd2Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPojazd3Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPojazd4Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jStatek2Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jStatek3Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jStatek4Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jStatek5Button)
                        .addGap(28, 28, 28)
                        .addComponent(jSamolotButton)
                        .addGap(18, 18, 18)
                        .addComponent(jRemainingFieldsLabel)
                        .addGap(19, 19, 19)
                        .addComponent(jRandomMapButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jResetMapButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEditorSaveButton)))
                .addContainerGap())
        );

        FileChooserFrame.setAlwaysOnTop(true);
        FileChooserFrame.setBounds(new java.awt.Rectangle(300, 200, 550, 350));
        FileChooserFrame.setResizable(false);

        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        jFileChooser1.setApproveButtonText("Wybierz");
        jFileChooser1.setApproveButtonToolTipText("");
        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\"));
            jFileChooser1.setDialogTitle("Wskaż plik");
            jFileChooser1.setFileHidingEnabled(true);
            jFileChooser1.setToolTipText("");
            jFileChooser1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jFileChooser1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout FileChooserFrameLayout = new javax.swing.GroupLayout(FileChooserFrame.getContentPane());
            FileChooserFrame.getContentPane().setLayout(FileChooserFrameLayout);
            FileChooserFrameLayout.setHorizontalGroup(
                FileChooserFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 588, Short.MAX_VALUE)
                .addGroup(FileChooserFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FileChooserFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );
            FileChooserFrameLayout.setVerticalGroup(
                FileChooserFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 397, Short.MAX_VALUE)
                .addGroup(FileChooserFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FileChooserFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );

            jGameFrame.setTitle("Gra");
            jGameFrame.setBounds(new java.awt.Rectangle(0, 0, 975, 690));
            jGameFrame.setPreferredSize(new java.awt.Dimension(975, 690));
            jGameFrame.setResizable(false);
            jGameFrame.setSize(new java.awt.Dimension(975, 690));

            jLabel1.setText("Twoje punkty");

            jLabel3.setText("Punkty przeciwnika");

            jLabel2.setText("Strzały");

            javax.swing.GroupLayout jGameFrameLayout = new javax.swing.GroupLayout(jGameFrame.getContentPane());
            jGameFrame.getContentPane().setLayout(jGameFrameLayout);
            jGameFrameLayout.setHorizontalGroup(
                jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jGameFrameLayout.createSequentialGroup()
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton128, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton134, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton135, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton139, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton140, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton146, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton147, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton148, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton154, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton151, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton149, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton150, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton152, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton153, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton155, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton156, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton157, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton159, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton160, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton161, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton162, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton163, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton164, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton165, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton166, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton167, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton168, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton169, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton170, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton176, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton173, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton171, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton172, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton174, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton175, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton158, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton177, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton178, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton179, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton181, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton182, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton183, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton184, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton185, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton186, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton187, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton188, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton189, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton190, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton191, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton192, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton198, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton195, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton193, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton194, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton196, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton197, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton180, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton199, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton200, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton201, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton203, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton204, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton205, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton206, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton207, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton208, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton209, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton210, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton211, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton212, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton213, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton214, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton220, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton217, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton215, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton216, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton218, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton219, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton202, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton221, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton222, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton223, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton225, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton226, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton227, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton228, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton229, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton231, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton232, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton233, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton234, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton235, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton236, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton242, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton239, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton237, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton238, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton240, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton241, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton224, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton243, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton244, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton245, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton247, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton248, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton249, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton250, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton251, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton252, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton253, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton254, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton255, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton256, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton257, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton258, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton264, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton261, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton259, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton260, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton262, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton263, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton246, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton265, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton266, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton267, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton269, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton270, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton271, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton272, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton273, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton274, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton275, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton276, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton277, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton278, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton279, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton280, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton286, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton283, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton281, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton282, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton284, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton285, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton268, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jGameFrameLayout.createSequentialGroup()
                            .addComponent(jGameFieldButton288, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jGameFrameLayout.createSequentialGroup()
                            .addComponent(jGameFieldButton289, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPlayerScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jGameFrameLayout.createSequentialGroup()
                            .addComponent(jGameFieldButton292, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComputerScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jGameFrameLayout.createSequentialGroup()
                            .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jGameFrameLayout.createSequentialGroup()
                                    .addComponent(jGameFieldButton294, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2))
                                .addComponent(jGameFieldButton287, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jGameFrameLayout.createSequentialGroup()
                                    .addComponent(jGameFieldButton291, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3))
                                .addComponent(jGameFieldButton293, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jGameFrameLayout.createSequentialGroup()
                                    .addComponent(jGameFieldButton295, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jShotCounterLabel))
                                .addComponent(jGameFieldButton296, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jGameFrameLayout.createSequentialGroup()
                                    .addComponent(jGameFieldButton297, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jWinnerLabel))
                                .addComponent(jGameFieldButton298, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton299, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton300, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton301, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton302, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton308, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton305, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton303, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton304, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton306, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton307, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGameFieldButton290, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton309, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton310, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton311, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton313, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton314, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton315, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton316, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton317, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton318, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton319, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton320, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton321, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton322, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton323, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton324, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton330, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton327, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton325, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton326, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton328, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton329, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton312, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton331, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton332, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton333, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton335, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton336, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton337, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton338, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton339, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton340, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton341, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton342, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton343, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton344, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton345, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton346, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton352, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton349, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton347, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton348, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton350, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton351, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton334, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton353, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton354, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton355, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton357, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton358, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton359, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton360, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton361, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton362, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton363, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton364, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton365, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton366, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton367, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton368, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton374, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton371, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton369, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton370, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton372, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton373, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton356, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton375, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton376, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton377, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton379, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton380, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton381, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton382, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton383, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton384, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton385, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton386, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton387, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton388, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton389, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton390, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton396, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton393, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton391, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton392, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton394, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton395, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton378, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton397, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton398, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton399, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton401, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton402, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton403, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton404, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton405, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton406, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton407, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton408, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton409, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton410, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton411, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton412, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton418, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton415, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton413, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton414, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton416, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton417, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton400, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton419, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton420, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton421, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton423, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton424, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton425, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton426, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton427, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton428, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton429, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton430, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton431, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton432, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton433, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton434, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton440, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton437, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton435, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton436, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton438, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton439, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton422, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton441, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton442, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton443, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton445, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton446, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton447, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton448, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton449, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton450, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton451, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton452, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton453, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton454, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton455, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton456, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton462, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton459, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton457, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton458, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton460, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton461, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton444, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton463, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton464, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton465, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton467, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton468, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton469, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton470, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton471, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton472, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton473, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton474, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton475, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton476, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton477, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton478, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton484, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton481, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton479, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton480, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton482, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton483, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton466, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton485, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton486, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton487, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton489, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton490, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton491, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton492, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton493, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton494, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton495, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton496, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton497, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton498, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton499, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton500, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton506, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton503, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton501, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton502, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton504, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton505, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton488, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton507, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton508, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton509, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton511, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton512, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton513, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton514, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton515, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton516, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton517, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton518, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton519, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton520, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton521, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton522, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton528, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton525, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton523, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton524, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton526, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton527, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton510, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton529, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton531, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton533, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton534, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton535, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton536, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton537, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton538, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton539, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton540, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton541, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton542, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton543, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton544, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton550, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton547, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton545, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton546, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton548, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton549, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton532, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton551, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton552, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton553, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton555, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton556, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton557, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton558, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton559, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton560, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton561, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton562, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton563, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton564, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton565, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton566, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton572, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton569, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton567, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton568, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton570, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton571, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton554, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton573, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton574, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton575, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton577, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton578, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton579, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton580, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton581, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton582, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton583, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton584, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton585, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton586, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton587, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton588, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton594, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton591, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton589, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton590, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton592, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton593, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton576, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jGameFieldButton595, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton596, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton597, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton599, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton600, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton601, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton602, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton603, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton604, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton605, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton606, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton607, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton608, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton609, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton610, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton616, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton613, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton611, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton612, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton614, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton615, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGameFieldButton598, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(49, 49, 49))
            );
            jGameFrameLayout.setVerticalGroup(
                jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jGameFrameLayout.createSequentialGroup()
                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jGameFrameLayout.createSequentialGroup()
                            .addComponent(jGameFieldButton595, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton596, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton597, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton598, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton599, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton600, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton601, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton602, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton603, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton604, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton605, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton606, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton607, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton608, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton609, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton610, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton611, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton612, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton613, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton614, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton615, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jGameFieldButton616, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jGameFrameLayout.createSequentialGroup()
                                    .addComponent(jGameFieldButton331, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton332, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton333, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton334, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton335, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton336, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton337, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton338, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton339, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton340, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton341, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton342, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton343, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton344, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton345, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton346, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton347, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton348, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton349, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton350, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton351, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jGameFieldButton352, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jGameFrameLayout.createSequentialGroup()
                                            .addComponent(jGameFieldButton221, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton222, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton223, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton224, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton225, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton226, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton227, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton228, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton229, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton231, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton232, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton233, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton234, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton235, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton236, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton237, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton238, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton239, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton240, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton241, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jGameFieldButton242, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                                        .addComponent(jGameFieldButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                                        .addComponent(jGameFieldButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, 0)
                                                .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jGameFieldButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jGameFieldButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, 0)
                                                .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                                        .addComponent(jGameFieldButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                                        .addComponent(jGameFieldButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                                        .addComponent(jGameFieldButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                                        .addComponent(jGameFieldButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, 0)
                                                .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jGameFieldButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jGameFieldButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, 0)
                                                .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                                        .addComponent(jGameFieldButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                                        .addComponent(jGameFieldButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jGameFieldButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addComponent(jGameFieldButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addComponent(jGameFieldButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton128, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addComponent(jGameFieldButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton134, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton135, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton139, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton140, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton146, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton147, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton148, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton149, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton150, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton151, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton152, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton153, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton154, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addComponent(jGameFieldButton155, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton156, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton157, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton158, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton159, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton160, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton161, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton162, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton163, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton164, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton165, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton166, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton167, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton168, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton169, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton170, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton171, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton172, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton173, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton174, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton175, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton176, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addComponent(jGameFieldButton177, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton178, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton179, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton180, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton181, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton182, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton183, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton184, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton185, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton186, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton187, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton188, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton189, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton190, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton191, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton192, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton193, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton194, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton195, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton196, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton197, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton198, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addComponent(jGameFieldButton199, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton200, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton201, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton202, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton203, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton204, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton205, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton206, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton207, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton208, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton209, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton210, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton211, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton212, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton213, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton214, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton215, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton216, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton217, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton218, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton219, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton220, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                        .addComponent(jGameFieldButton243, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton244, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton245, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton246, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton247, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton248, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton249, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton250, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton251, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton252, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton253, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton254, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton255, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton256, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton257, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton258, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton259, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton260, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton261, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton262, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton263, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton264, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                        .addComponent(jGameFieldButton265, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton266, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton267, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton268, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton269, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton270, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton271, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton272, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton273, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton274, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton275, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton276, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton277, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton278, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton279, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton280, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton281, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton282, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton283, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton284, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton285, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton286, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                        .addComponent(jGameFieldButton287, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jGameFieldButton288, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1))
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton289, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jPlayerScore))
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton290, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jGameFieldButton291, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3))
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton292, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jComputerScore))
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton293, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                                .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jGameFieldButton294, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(6, 6, 6)))
                                                .addGap(0, 0, 0)
                                                .addComponent(jGameFieldButton295, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jShotCounterLabel))
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton296, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addGroup(jGameFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jGameFieldButton297, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jWinnerLabel))
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton298, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton299, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton300, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton301, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton302, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton303, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton304, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton305, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton306, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton307, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton308, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jGameFrameLayout.createSequentialGroup()
                                        .addComponent(jGameFieldButton309, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton310, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton311, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton312, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton313, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton314, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton315, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton316, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton317, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton318, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton319, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton320, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton321, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton322, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton323, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton324, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton325, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton326, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton327, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton328, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton329, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jGameFieldButton330, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton353, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton354, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton355, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton356, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton357, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton358, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton359, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton360, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton361, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton362, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton363, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton364, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton365, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton366, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton367, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton368, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton369, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton370, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton371, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton372, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton373, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton374, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton375, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton376, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton377, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton378, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton379, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton380, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton381, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton382, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton383, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton384, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton385, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton386, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton387, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton388, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton389, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton390, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton391, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton392, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton393, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton394, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton395, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton396, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton397, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton398, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton399, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton400, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton401, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton402, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton403, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton404, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton405, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton406, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton407, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton408, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton409, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton410, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton411, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton412, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton413, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton414, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton415, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton416, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton417, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton418, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton419, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton420, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton421, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton422, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton423, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton424, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton425, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton426, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton427, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton428, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton429, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton430, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton431, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton432, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton433, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton434, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton435, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton436, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton437, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton438, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton439, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton440, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton441, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton442, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton443, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton444, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton445, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton446, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton447, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton448, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton449, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton450, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton451, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton452, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton453, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton454, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton455, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton456, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton457, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton458, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton459, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton460, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton461, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton462, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton463, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton464, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton465, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton466, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton467, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton468, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton469, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton470, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton471, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton472, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton473, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton474, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton475, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton476, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton477, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton478, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton479, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton480, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton481, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton482, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton483, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton484, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton485, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton486, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton487, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton488, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton489, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton490, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton491, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton492, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton493, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton494, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton495, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton496, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton497, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton498, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton499, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton500, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton501, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton502, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton503, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton504, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton505, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton506, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton507, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton508, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton509, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton510, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton511, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton512, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton513, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton514, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton515, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton516, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton517, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton518, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton519, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton520, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton521, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton522, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton523, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton524, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton525, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton526, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton527, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton528, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton529, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton531, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton532, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton533, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton534, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton535, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton536, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton537, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton538, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton539, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton540, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton541, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton542, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton543, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton544, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton545, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton546, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton547, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton548, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton549, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton550, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton551, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton552, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton553, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton554, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton555, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton556, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton557, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton558, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton559, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton560, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton561, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton562, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton563, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton564, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton565, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton566, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton567, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton568, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton569, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton570, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton571, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton572, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jGameFrameLayout.createSequentialGroup()
                                .addComponent(jGameFieldButton573, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton574, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton575, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton576, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton577, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton578, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton579, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton580, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton581, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton582, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton583, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton584, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton585, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton586, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton587, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton588, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton589, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton590, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton591, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton592, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton593, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jGameFieldButton594, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(30, Short.MAX_VALUE))
            );

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Gra w statki");
            setBounds(new java.awt.Rectangle(300, 200, 175, 200));
            setResizable(false);

            jNewMapButton.setText("Edytuj planszę");
            jNewMapButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jNewMapButtonActionPerformed(evt);
                }
            });

            jStartGameButton.setText("Rozpocznij grę");
            jStartGameButton.setEnabled(false);
            jStartGameButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jStartGameButtonActionPerformed(evt);
                }
            });

            jOpenComputerMap.setText("Otwórz planszę komputera");
            jOpenComputerMap.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jOpenComputerMapActionPerformed(evt);
                }
            });

            jSelectFileButton.setText("Wybierz plik do zapisu / planszę gracza");
            jSelectFileButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jSelectFileButtonActionPerformed(evt);
                }
            });

            jRandOmPlayerMapButton.setText("Losuj");
            jRandOmPlayerMapButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRandOmPlayerMapButtonActionPerformed(evt);
                }
            });

            jRandomComputerMapButton.setText("Losuj");
            jRandomComputerMapButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRandomComputerMapButtonActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jStartGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jNewMapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jOpenComputerMap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSelectFileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRandOmPlayerMapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRandomComputerMapButton, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jNewMapButton)
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSelectFileButton)
                        .addComponent(jRandOmPlayerMapButton))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jOpenComputerMap)
                        .addComponent(jRandomComputerMapButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                    .addComponent(jStartGameButton)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jPoziomoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPoziomoButtonActionPerformed
        EditorUnitPosition = true;
        jPoziomoButton.setEnabled(false);
        jPionowoButton.setEnabled(true);
    }//GEN-LAST:event_jPoziomoButtonActionPerformed

    private void jEditorSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditorSaveButtonActionPerformed
        jMapEditorFrame.setVisible(false);
        FileSaver.inst(editorPlayerfilePath).saveData(createdMap);
    }//GEN-LAST:event_jEditorSaveButtonActionPerformed

    private void jPionowoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPionowoButtonActionPerformed
        EditorUnitPosition = false;
        jPoziomoButton.setEnabled(true);
        jPionowoButton.setEnabled(false);
    }//GEN-LAST:event_jPionowoButtonActionPerformed

    private void jNewMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewMapButtonActionPerformed
        jMapEditorFrame.setVisible(true);
        createBlankMap(createdMap);
    }//GEN-LAST:event_jNewMapButtonActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        if(evt.getActionCommand().equals("ApproveSelection")){
            Path tempFilePath = jFileChooser1.getSelectedFile().toPath();
            String fileName = tempFilePath.getFileName().toString();
            int fileNameLength = fileName.length();
            if(fileNameLength<4 || !fileName.substring(fileNameLength - 4).equals(".map")){
                tempFilePath = tempFilePath.getParent().resolve(fileName+".map");
            }
            if(currentFileChooser){
                editorPlayerfilePath = tempFilePath;
                if(Files.exists(tempFilePath)){
                    createdMap = (char[]) FileSaver.inst(tempFilePath).OpenData();
                    playerMapOk = true;
                }
            }else{
                if(Files.exists(tempFilePath)){
                    computerMap = (char[]) FileSaver.inst(tempFilePath).OpenData();
                    computerMapOk = true;
                }
            }
            FileChooserFrame.setVisible(false);
            if(computerMapOk && playerMapOk)jStartGameButton.setEnabled(true);
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jSelectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectFileButtonActionPerformed
        FileChooserFrame.setVisible(true);
        currentFileChooser = true;
    }//GEN-LAST:event_jSelectFileButtonActionPerformed

    private void jPojazd2ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jPojazd2ButtonActionPerformed
    {//GEN-HEADEREND:event_jPojazd2ButtonActionPerformed
        currentUsedEditorUnit = fabryka.ProdukcjaJednostek(1, 2);
        distableeButton(jPojazd2Button);
    }//GEN-LAST:event_jPojazd2ButtonActionPerformed

    private void jPojazd3ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jPojazd3ButtonActionPerformed
    {//GEN-HEADEREND:event_jPojazd3ButtonActionPerformed
        currentUsedEditorUnit = fabryka.ProdukcjaJednostek(1, 3);
        distableeButton(jPojazd3Button);        
    }//GEN-LAST:event_jPojazd3ButtonActionPerformed

    private void jPojazd4ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jPojazd4ButtonActionPerformed
    {//GEN-HEADEREND:event_jPojazd4ButtonActionPerformed
        currentUsedEditorUnit = fabryka.ProdukcjaJednostek(1, 4);
        distableeButton(jPojazd4Button);
    }//GEN-LAST:event_jPojazd4ButtonActionPerformed

    private void jStatek2ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jStatek2ButtonActionPerformed
    {//GEN-HEADEREND:event_jStatek2ButtonActionPerformed
        currentUsedEditorUnit = fabryka.ProdukcjaJednostek(0, 2);
        distableeButton(jStatek2Button);
    }//GEN-LAST:event_jStatek2ButtonActionPerformed

    private void jStatek3ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jStatek3ButtonActionPerformed
    {//GEN-HEADEREND:event_jStatek3ButtonActionPerformed
        currentUsedEditorUnit = fabryka.ProdukcjaJednostek(0, 3);
        distableeButton(jStatek3Button);
    }//GEN-LAST:event_jStatek3ButtonActionPerformed

    private void jStatek4ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jStatek4ButtonActionPerformed
    {//GEN-HEADEREND:event_jStatek4ButtonActionPerformed
        currentUsedEditorUnit = fabryka.ProdukcjaJednostek(0, 4);
        distableeButton(jStatek4Button);
    }//GEN-LAST:event_jStatek4ButtonActionPerformed

    private void jStatek5ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jStatek5ButtonActionPerformed
    {//GEN-HEADEREND:event_jStatek5ButtonActionPerformed
        currentUsedEditorUnit = fabryka.ProdukcjaJednostek(0, 5);
        distableeButton(jStatek5Button);
    }//GEN-LAST:event_jStatek5ButtonActionPerformed

    private void jSamolotButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jSamolotButtonActionPerformed
    {//GEN-HEADEREND:event_jSamolotButtonActionPerformed
        currentUsedEditorUnit = fabryka.ProdukcjaJednostek(2, 4);
        distableeButton(jSamolotButton);
    }//GEN-LAST:event_jSamolotButtonActionPerformed

    private void jResetMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetMapButtonActionPerformed
        createBlankMap(createdMap);
    }//GEN-LAST:event_jResetMapButtonActionPerformed

    private void jStartGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartGameButtonActionPerformed
        jGameFrame.setVisible(true);
        newGameConfig();
    }//GEN-LAST:event_jStartGameButtonActionPerformed

    private void jOpenComputerMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpenComputerMapActionPerformed
        FileChooserFrame.setVisible(true);
        currentFileChooser = false;
    }//GEN-LAST:event_jOpenComputerMapActionPerformed

    private void jRandomMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRandomMapButtonActionPerformed
        jEditorSaveButton.setEnabled(true);
        generateRandomMap(createdMap);
        playerMapOk = true;
        if(computerMapOk)jStartGameButton.setEnabled(true);
    }//GEN-LAST:event_jRandomMapButtonActionPerformed

    private void jRandOmPlayerMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRandOmPlayerMapButtonActionPerformed
        generateRandomMap(createdMap);
        playerMapOk = true;
        if(computerMapOk)jStartGameButton.setEnabled(true);
    }//GEN-LAST:event_jRandOmPlayerMapButtonActionPerformed

    private void jRandomComputerMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRandomComputerMapButtonActionPerformed
        generateRandomMap(computerMap);
        computerMapOk = true;
        if(playerMapOk)jStartGameButton.setEnabled(true);
    }//GEN-LAST:event_jRandomComputerMapButtonActionPerformed

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(jMapEditorFrame.isVisible()){
            for(int button = 0;button < 308; button++){
                if(e.getSource() == jMapEditorTab[button] && currentUsedEditorUnit != null){
                    addUnitToMap(button, createdMap);
                    break;
                }
            }
            if(remainingFields == 0){
                playerMapOk = true;
                if(computerMapOk)jStartGameButton.setEnabled(true);
            }
            if(editorPlayerfilePath != null )jEditorSaveButton.setEnabled(true);
        }else if(jGameFrame.isVisible() && playerPoints < 30 && computerPoints < 30){
            for(int button = 0;button < 308; button++){
                if(e.getSource() == jMapGameTab[button]){
                    int playerHit = hitTest(button);
                    if(playerHit != 0){
                        if(playerHit == 2)jMapGameTab[button].setIcon(redX);
                        else jMapGameTab[button].setIcon(blackX);
                        currentPlayer = false;
                        shots++;
                        int compRound = computerRound();
                        int compHit = hitTest(compRound);
                        if(compHit == 2)jMapGameTab[615 - compRound].setIcon(redX);
                        else if(compHit == 1) jMapGameTab[615 - compRound].setIcon(blackX);
                        else System.err.println("blad");
                        currentPlayer = true;
                        jShotCounterLabel.setText(Integer.toString(shots));
                    }

                    break;
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FileChooserFrame;
    private javax.swing.JLabel jComputerScore;
    private javax.swing.JButton jEditorSaveButton;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JButton jGameFieldButton1;
    private javax.swing.JButton jGameFieldButton10;
    private javax.swing.JButton jGameFieldButton100;
    private javax.swing.JButton jGameFieldButton101;
    private javax.swing.JButton jGameFieldButton102;
    private javax.swing.JButton jGameFieldButton103;
    private javax.swing.JButton jGameFieldButton104;
    private javax.swing.JButton jGameFieldButton105;
    private javax.swing.JButton jGameFieldButton106;
    private javax.swing.JButton jGameFieldButton107;
    private javax.swing.JButton jGameFieldButton108;
    private javax.swing.JButton jGameFieldButton109;
    private javax.swing.JButton jGameFieldButton11;
    private javax.swing.JButton jGameFieldButton110;
    private javax.swing.JButton jGameFieldButton111;
    private javax.swing.JButton jGameFieldButton112;
    private javax.swing.JButton jGameFieldButton113;
    private javax.swing.JButton jGameFieldButton114;
    private javax.swing.JButton jGameFieldButton115;
    private javax.swing.JButton jGameFieldButton116;
    private javax.swing.JButton jGameFieldButton117;
    private javax.swing.JButton jGameFieldButton118;
    private javax.swing.JButton jGameFieldButton119;
    private javax.swing.JButton jGameFieldButton12;
    private javax.swing.JButton jGameFieldButton120;
    private javax.swing.JButton jGameFieldButton121;
    private javax.swing.JButton jGameFieldButton122;
    private javax.swing.JButton jGameFieldButton123;
    private javax.swing.JButton jGameFieldButton124;
    private javax.swing.JButton jGameFieldButton125;
    private javax.swing.JButton jGameFieldButton126;
    private javax.swing.JButton jGameFieldButton127;
    private javax.swing.JButton jGameFieldButton128;
    private javax.swing.JButton jGameFieldButton129;
    private javax.swing.JButton jGameFieldButton13;
    private javax.swing.JButton jGameFieldButton130;
    private javax.swing.JButton jGameFieldButton131;
    private javax.swing.JButton jGameFieldButton132;
    private javax.swing.JButton jGameFieldButton133;
    private javax.swing.JButton jGameFieldButton134;
    private javax.swing.JButton jGameFieldButton135;
    private javax.swing.JButton jGameFieldButton136;
    private javax.swing.JButton jGameFieldButton137;
    private javax.swing.JButton jGameFieldButton138;
    private javax.swing.JButton jGameFieldButton139;
    private javax.swing.JButton jGameFieldButton14;
    private javax.swing.JButton jGameFieldButton140;
    private javax.swing.JButton jGameFieldButton141;
    private javax.swing.JButton jGameFieldButton142;
    private javax.swing.JButton jGameFieldButton143;
    private javax.swing.JButton jGameFieldButton144;
    private javax.swing.JButton jGameFieldButton145;
    private javax.swing.JButton jGameFieldButton146;
    private javax.swing.JButton jGameFieldButton147;
    private javax.swing.JButton jGameFieldButton148;
    private javax.swing.JButton jGameFieldButton149;
    private javax.swing.JButton jGameFieldButton15;
    private javax.swing.JButton jGameFieldButton150;
    private javax.swing.JButton jGameFieldButton151;
    private javax.swing.JButton jGameFieldButton152;
    private javax.swing.JButton jGameFieldButton153;
    private javax.swing.JButton jGameFieldButton154;
    private javax.swing.JButton jGameFieldButton155;
    private javax.swing.JButton jGameFieldButton156;
    private javax.swing.JButton jGameFieldButton157;
    private javax.swing.JButton jGameFieldButton158;
    private javax.swing.JButton jGameFieldButton159;
    private javax.swing.JButton jGameFieldButton16;
    private javax.swing.JButton jGameFieldButton160;
    private javax.swing.JButton jGameFieldButton161;
    private javax.swing.JButton jGameFieldButton162;
    private javax.swing.JButton jGameFieldButton163;
    private javax.swing.JButton jGameFieldButton164;
    private javax.swing.JButton jGameFieldButton165;
    private javax.swing.JButton jGameFieldButton166;
    private javax.swing.JButton jGameFieldButton167;
    private javax.swing.JButton jGameFieldButton168;
    private javax.swing.JButton jGameFieldButton169;
    private javax.swing.JButton jGameFieldButton17;
    private javax.swing.JButton jGameFieldButton170;
    private javax.swing.JButton jGameFieldButton171;
    private javax.swing.JButton jGameFieldButton172;
    private javax.swing.JButton jGameFieldButton173;
    private javax.swing.JButton jGameFieldButton174;
    private javax.swing.JButton jGameFieldButton175;
    private javax.swing.JButton jGameFieldButton176;
    private javax.swing.JButton jGameFieldButton177;
    private javax.swing.JButton jGameFieldButton178;
    private javax.swing.JButton jGameFieldButton179;
    private javax.swing.JButton jGameFieldButton18;
    private javax.swing.JButton jGameFieldButton180;
    private javax.swing.JButton jGameFieldButton181;
    private javax.swing.JButton jGameFieldButton182;
    private javax.swing.JButton jGameFieldButton183;
    private javax.swing.JButton jGameFieldButton184;
    private javax.swing.JButton jGameFieldButton185;
    private javax.swing.JButton jGameFieldButton186;
    private javax.swing.JButton jGameFieldButton187;
    private javax.swing.JButton jGameFieldButton188;
    private javax.swing.JButton jGameFieldButton189;
    private javax.swing.JButton jGameFieldButton19;
    private javax.swing.JButton jGameFieldButton190;
    private javax.swing.JButton jGameFieldButton191;
    private javax.swing.JButton jGameFieldButton192;
    private javax.swing.JButton jGameFieldButton193;
    private javax.swing.JButton jGameFieldButton194;
    private javax.swing.JButton jGameFieldButton195;
    private javax.swing.JButton jGameFieldButton196;
    private javax.swing.JButton jGameFieldButton197;
    private javax.swing.JButton jGameFieldButton198;
    private javax.swing.JButton jGameFieldButton199;
    private javax.swing.JButton jGameFieldButton2;
    private javax.swing.JButton jGameFieldButton20;
    private javax.swing.JButton jGameFieldButton200;
    private javax.swing.JButton jGameFieldButton201;
    private javax.swing.JButton jGameFieldButton202;
    private javax.swing.JButton jGameFieldButton203;
    private javax.swing.JButton jGameFieldButton204;
    private javax.swing.JButton jGameFieldButton205;
    private javax.swing.JButton jGameFieldButton206;
    private javax.swing.JButton jGameFieldButton207;
    private javax.swing.JButton jGameFieldButton208;
    private javax.swing.JButton jGameFieldButton209;
    private javax.swing.JButton jGameFieldButton21;
    private javax.swing.JButton jGameFieldButton210;
    private javax.swing.JButton jGameFieldButton211;
    private javax.swing.JButton jGameFieldButton212;
    private javax.swing.JButton jGameFieldButton213;
    private javax.swing.JButton jGameFieldButton214;
    private javax.swing.JButton jGameFieldButton215;
    private javax.swing.JButton jGameFieldButton216;
    private javax.swing.JButton jGameFieldButton217;
    private javax.swing.JButton jGameFieldButton218;
    private javax.swing.JButton jGameFieldButton219;
    private javax.swing.JButton jGameFieldButton22;
    private javax.swing.JButton jGameFieldButton220;
    private javax.swing.JButton jGameFieldButton221;
    private javax.swing.JButton jGameFieldButton222;
    private javax.swing.JButton jGameFieldButton223;
    private javax.swing.JButton jGameFieldButton224;
    private javax.swing.JButton jGameFieldButton225;
    private javax.swing.JButton jGameFieldButton226;
    private javax.swing.JButton jGameFieldButton227;
    private javax.swing.JButton jGameFieldButton228;
    private javax.swing.JButton jGameFieldButton229;
    private javax.swing.JButton jGameFieldButton23;
    private javax.swing.JButton jGameFieldButton230;
    private javax.swing.JButton jGameFieldButton231;
    private javax.swing.JButton jGameFieldButton232;
    private javax.swing.JButton jGameFieldButton233;
    private javax.swing.JButton jGameFieldButton234;
    private javax.swing.JButton jGameFieldButton235;
    private javax.swing.JButton jGameFieldButton236;
    private javax.swing.JButton jGameFieldButton237;
    private javax.swing.JButton jGameFieldButton238;
    private javax.swing.JButton jGameFieldButton239;
    private javax.swing.JButton jGameFieldButton24;
    private javax.swing.JButton jGameFieldButton240;
    private javax.swing.JButton jGameFieldButton241;
    private javax.swing.JButton jGameFieldButton242;
    private javax.swing.JButton jGameFieldButton243;
    private javax.swing.JButton jGameFieldButton244;
    private javax.swing.JButton jGameFieldButton245;
    private javax.swing.JButton jGameFieldButton246;
    private javax.swing.JButton jGameFieldButton247;
    private javax.swing.JButton jGameFieldButton248;
    private javax.swing.JButton jGameFieldButton249;
    private javax.swing.JButton jGameFieldButton25;
    private javax.swing.JButton jGameFieldButton250;
    private javax.swing.JButton jGameFieldButton251;
    private javax.swing.JButton jGameFieldButton252;
    private javax.swing.JButton jGameFieldButton253;
    private javax.swing.JButton jGameFieldButton254;
    private javax.swing.JButton jGameFieldButton255;
    private javax.swing.JButton jGameFieldButton256;
    private javax.swing.JButton jGameFieldButton257;
    private javax.swing.JButton jGameFieldButton258;
    private javax.swing.JButton jGameFieldButton259;
    private javax.swing.JButton jGameFieldButton26;
    private javax.swing.JButton jGameFieldButton260;
    private javax.swing.JButton jGameFieldButton261;
    private javax.swing.JButton jGameFieldButton262;
    private javax.swing.JButton jGameFieldButton263;
    private javax.swing.JButton jGameFieldButton264;
    private javax.swing.JButton jGameFieldButton265;
    private javax.swing.JButton jGameFieldButton266;
    private javax.swing.JButton jGameFieldButton267;
    private javax.swing.JButton jGameFieldButton268;
    private javax.swing.JButton jGameFieldButton269;
    private javax.swing.JButton jGameFieldButton27;
    private javax.swing.JButton jGameFieldButton270;
    private javax.swing.JButton jGameFieldButton271;
    private javax.swing.JButton jGameFieldButton272;
    private javax.swing.JButton jGameFieldButton273;
    private javax.swing.JButton jGameFieldButton274;
    private javax.swing.JButton jGameFieldButton275;
    private javax.swing.JButton jGameFieldButton276;
    private javax.swing.JButton jGameFieldButton277;
    private javax.swing.JButton jGameFieldButton278;
    private javax.swing.JButton jGameFieldButton279;
    private javax.swing.JButton jGameFieldButton28;
    private javax.swing.JButton jGameFieldButton280;
    private javax.swing.JButton jGameFieldButton281;
    private javax.swing.JButton jGameFieldButton282;
    private javax.swing.JButton jGameFieldButton283;
    private javax.swing.JButton jGameFieldButton284;
    private javax.swing.JButton jGameFieldButton285;
    private javax.swing.JButton jGameFieldButton286;
    private javax.swing.JButton jGameFieldButton287;
    private javax.swing.JButton jGameFieldButton288;
    private javax.swing.JButton jGameFieldButton289;
    private javax.swing.JButton jGameFieldButton29;
    private javax.swing.JButton jGameFieldButton290;
    private javax.swing.JButton jGameFieldButton291;
    private javax.swing.JButton jGameFieldButton292;
    private javax.swing.JButton jGameFieldButton293;
    private javax.swing.JButton jGameFieldButton294;
    private javax.swing.JButton jGameFieldButton295;
    private javax.swing.JButton jGameFieldButton296;
    private javax.swing.JButton jGameFieldButton297;
    private javax.swing.JButton jGameFieldButton298;
    private javax.swing.JButton jGameFieldButton299;
    private javax.swing.JButton jGameFieldButton3;
    private javax.swing.JButton jGameFieldButton30;
    private javax.swing.JButton jGameFieldButton300;
    private javax.swing.JButton jGameFieldButton301;
    private javax.swing.JButton jGameFieldButton302;
    private javax.swing.JButton jGameFieldButton303;
    private javax.swing.JButton jGameFieldButton304;
    private javax.swing.JButton jGameFieldButton305;
    private javax.swing.JButton jGameFieldButton306;
    private javax.swing.JButton jGameFieldButton307;
    private javax.swing.JButton jGameFieldButton308;
    private javax.swing.JButton jGameFieldButton309;
    private javax.swing.JButton jGameFieldButton31;
    private javax.swing.JButton jGameFieldButton310;
    private javax.swing.JButton jGameFieldButton311;
    private javax.swing.JButton jGameFieldButton312;
    private javax.swing.JButton jGameFieldButton313;
    private javax.swing.JButton jGameFieldButton314;
    private javax.swing.JButton jGameFieldButton315;
    private javax.swing.JButton jGameFieldButton316;
    private javax.swing.JButton jGameFieldButton317;
    private javax.swing.JButton jGameFieldButton318;
    private javax.swing.JButton jGameFieldButton319;
    private javax.swing.JButton jGameFieldButton32;
    private javax.swing.JButton jGameFieldButton320;
    private javax.swing.JButton jGameFieldButton321;
    private javax.swing.JButton jGameFieldButton322;
    private javax.swing.JButton jGameFieldButton323;
    private javax.swing.JButton jGameFieldButton324;
    private javax.swing.JButton jGameFieldButton325;
    private javax.swing.JButton jGameFieldButton326;
    private javax.swing.JButton jGameFieldButton327;
    private javax.swing.JButton jGameFieldButton328;
    private javax.swing.JButton jGameFieldButton329;
    private javax.swing.JButton jGameFieldButton33;
    private javax.swing.JButton jGameFieldButton330;
    private javax.swing.JButton jGameFieldButton331;
    private javax.swing.JButton jGameFieldButton332;
    private javax.swing.JButton jGameFieldButton333;
    private javax.swing.JButton jGameFieldButton334;
    private javax.swing.JButton jGameFieldButton335;
    private javax.swing.JButton jGameFieldButton336;
    private javax.swing.JButton jGameFieldButton337;
    private javax.swing.JButton jGameFieldButton338;
    private javax.swing.JButton jGameFieldButton339;
    private javax.swing.JButton jGameFieldButton34;
    private javax.swing.JButton jGameFieldButton340;
    private javax.swing.JButton jGameFieldButton341;
    private javax.swing.JButton jGameFieldButton342;
    private javax.swing.JButton jGameFieldButton343;
    private javax.swing.JButton jGameFieldButton344;
    private javax.swing.JButton jGameFieldButton345;
    private javax.swing.JButton jGameFieldButton346;
    private javax.swing.JButton jGameFieldButton347;
    private javax.swing.JButton jGameFieldButton348;
    private javax.swing.JButton jGameFieldButton349;
    private javax.swing.JButton jGameFieldButton35;
    private javax.swing.JButton jGameFieldButton350;
    private javax.swing.JButton jGameFieldButton351;
    private javax.swing.JButton jGameFieldButton352;
    private javax.swing.JButton jGameFieldButton353;
    private javax.swing.JButton jGameFieldButton354;
    private javax.swing.JButton jGameFieldButton355;
    private javax.swing.JButton jGameFieldButton356;
    private javax.swing.JButton jGameFieldButton357;
    private javax.swing.JButton jGameFieldButton358;
    private javax.swing.JButton jGameFieldButton359;
    private javax.swing.JButton jGameFieldButton36;
    private javax.swing.JButton jGameFieldButton360;
    private javax.swing.JButton jGameFieldButton361;
    private javax.swing.JButton jGameFieldButton362;
    private javax.swing.JButton jGameFieldButton363;
    private javax.swing.JButton jGameFieldButton364;
    private javax.swing.JButton jGameFieldButton365;
    private javax.swing.JButton jGameFieldButton366;
    private javax.swing.JButton jGameFieldButton367;
    private javax.swing.JButton jGameFieldButton368;
    private javax.swing.JButton jGameFieldButton369;
    private javax.swing.JButton jGameFieldButton37;
    private javax.swing.JButton jGameFieldButton370;
    private javax.swing.JButton jGameFieldButton371;
    private javax.swing.JButton jGameFieldButton372;
    private javax.swing.JButton jGameFieldButton373;
    private javax.swing.JButton jGameFieldButton374;
    private javax.swing.JButton jGameFieldButton375;
    private javax.swing.JButton jGameFieldButton376;
    private javax.swing.JButton jGameFieldButton377;
    private javax.swing.JButton jGameFieldButton378;
    private javax.swing.JButton jGameFieldButton379;
    private javax.swing.JButton jGameFieldButton38;
    private javax.swing.JButton jGameFieldButton380;
    private javax.swing.JButton jGameFieldButton381;
    private javax.swing.JButton jGameFieldButton382;
    private javax.swing.JButton jGameFieldButton383;
    private javax.swing.JButton jGameFieldButton384;
    private javax.swing.JButton jGameFieldButton385;
    private javax.swing.JButton jGameFieldButton386;
    private javax.swing.JButton jGameFieldButton387;
    private javax.swing.JButton jGameFieldButton388;
    private javax.swing.JButton jGameFieldButton389;
    private javax.swing.JButton jGameFieldButton39;
    private javax.swing.JButton jGameFieldButton390;
    private javax.swing.JButton jGameFieldButton391;
    private javax.swing.JButton jGameFieldButton392;
    private javax.swing.JButton jGameFieldButton393;
    private javax.swing.JButton jGameFieldButton394;
    private javax.swing.JButton jGameFieldButton395;
    private javax.swing.JButton jGameFieldButton396;
    private javax.swing.JButton jGameFieldButton397;
    private javax.swing.JButton jGameFieldButton398;
    private javax.swing.JButton jGameFieldButton399;
    private javax.swing.JButton jGameFieldButton4;
    private javax.swing.JButton jGameFieldButton40;
    private javax.swing.JButton jGameFieldButton400;
    private javax.swing.JButton jGameFieldButton401;
    private javax.swing.JButton jGameFieldButton402;
    private javax.swing.JButton jGameFieldButton403;
    private javax.swing.JButton jGameFieldButton404;
    private javax.swing.JButton jGameFieldButton405;
    private javax.swing.JButton jGameFieldButton406;
    private javax.swing.JButton jGameFieldButton407;
    private javax.swing.JButton jGameFieldButton408;
    private javax.swing.JButton jGameFieldButton409;
    private javax.swing.JButton jGameFieldButton41;
    private javax.swing.JButton jGameFieldButton410;
    private javax.swing.JButton jGameFieldButton411;
    private javax.swing.JButton jGameFieldButton412;
    private javax.swing.JButton jGameFieldButton413;
    private javax.swing.JButton jGameFieldButton414;
    private javax.swing.JButton jGameFieldButton415;
    private javax.swing.JButton jGameFieldButton416;
    private javax.swing.JButton jGameFieldButton417;
    private javax.swing.JButton jGameFieldButton418;
    private javax.swing.JButton jGameFieldButton419;
    private javax.swing.JButton jGameFieldButton42;
    private javax.swing.JButton jGameFieldButton420;
    private javax.swing.JButton jGameFieldButton421;
    private javax.swing.JButton jGameFieldButton422;
    private javax.swing.JButton jGameFieldButton423;
    private javax.swing.JButton jGameFieldButton424;
    private javax.swing.JButton jGameFieldButton425;
    private javax.swing.JButton jGameFieldButton426;
    private javax.swing.JButton jGameFieldButton427;
    private javax.swing.JButton jGameFieldButton428;
    private javax.swing.JButton jGameFieldButton429;
    private javax.swing.JButton jGameFieldButton43;
    private javax.swing.JButton jGameFieldButton430;
    private javax.swing.JButton jGameFieldButton431;
    private javax.swing.JButton jGameFieldButton432;
    private javax.swing.JButton jGameFieldButton433;
    private javax.swing.JButton jGameFieldButton434;
    private javax.swing.JButton jGameFieldButton435;
    private javax.swing.JButton jGameFieldButton436;
    private javax.swing.JButton jGameFieldButton437;
    private javax.swing.JButton jGameFieldButton438;
    private javax.swing.JButton jGameFieldButton439;
    private javax.swing.JButton jGameFieldButton44;
    private javax.swing.JButton jGameFieldButton440;
    private javax.swing.JButton jGameFieldButton441;
    private javax.swing.JButton jGameFieldButton442;
    private javax.swing.JButton jGameFieldButton443;
    private javax.swing.JButton jGameFieldButton444;
    private javax.swing.JButton jGameFieldButton445;
    private javax.swing.JButton jGameFieldButton446;
    private javax.swing.JButton jGameFieldButton447;
    private javax.swing.JButton jGameFieldButton448;
    private javax.swing.JButton jGameFieldButton449;
    private javax.swing.JButton jGameFieldButton45;
    private javax.swing.JButton jGameFieldButton450;
    private javax.swing.JButton jGameFieldButton451;
    private javax.swing.JButton jGameFieldButton452;
    private javax.swing.JButton jGameFieldButton453;
    private javax.swing.JButton jGameFieldButton454;
    private javax.swing.JButton jGameFieldButton455;
    private javax.swing.JButton jGameFieldButton456;
    private javax.swing.JButton jGameFieldButton457;
    private javax.swing.JButton jGameFieldButton458;
    private javax.swing.JButton jGameFieldButton459;
    private javax.swing.JButton jGameFieldButton46;
    private javax.swing.JButton jGameFieldButton460;
    private javax.swing.JButton jGameFieldButton461;
    private javax.swing.JButton jGameFieldButton462;
    private javax.swing.JButton jGameFieldButton463;
    private javax.swing.JButton jGameFieldButton464;
    private javax.swing.JButton jGameFieldButton465;
    private javax.swing.JButton jGameFieldButton466;
    private javax.swing.JButton jGameFieldButton467;
    private javax.swing.JButton jGameFieldButton468;
    private javax.swing.JButton jGameFieldButton469;
    private javax.swing.JButton jGameFieldButton47;
    private javax.swing.JButton jGameFieldButton470;
    private javax.swing.JButton jGameFieldButton471;
    private javax.swing.JButton jGameFieldButton472;
    private javax.swing.JButton jGameFieldButton473;
    private javax.swing.JButton jGameFieldButton474;
    private javax.swing.JButton jGameFieldButton475;
    private javax.swing.JButton jGameFieldButton476;
    private javax.swing.JButton jGameFieldButton477;
    private javax.swing.JButton jGameFieldButton478;
    private javax.swing.JButton jGameFieldButton479;
    private javax.swing.JButton jGameFieldButton48;
    private javax.swing.JButton jGameFieldButton480;
    private javax.swing.JButton jGameFieldButton481;
    private javax.swing.JButton jGameFieldButton482;
    private javax.swing.JButton jGameFieldButton483;
    private javax.swing.JButton jGameFieldButton484;
    private javax.swing.JButton jGameFieldButton485;
    private javax.swing.JButton jGameFieldButton486;
    private javax.swing.JButton jGameFieldButton487;
    private javax.swing.JButton jGameFieldButton488;
    private javax.swing.JButton jGameFieldButton489;
    private javax.swing.JButton jGameFieldButton49;
    private javax.swing.JButton jGameFieldButton490;
    private javax.swing.JButton jGameFieldButton491;
    private javax.swing.JButton jGameFieldButton492;
    private javax.swing.JButton jGameFieldButton493;
    private javax.swing.JButton jGameFieldButton494;
    private javax.swing.JButton jGameFieldButton495;
    private javax.swing.JButton jGameFieldButton496;
    private javax.swing.JButton jGameFieldButton497;
    private javax.swing.JButton jGameFieldButton498;
    private javax.swing.JButton jGameFieldButton499;
    private javax.swing.JButton jGameFieldButton5;
    private javax.swing.JButton jGameFieldButton50;
    private javax.swing.JButton jGameFieldButton500;
    private javax.swing.JButton jGameFieldButton501;
    private javax.swing.JButton jGameFieldButton502;
    private javax.swing.JButton jGameFieldButton503;
    private javax.swing.JButton jGameFieldButton504;
    private javax.swing.JButton jGameFieldButton505;
    private javax.swing.JButton jGameFieldButton506;
    private javax.swing.JButton jGameFieldButton507;
    private javax.swing.JButton jGameFieldButton508;
    private javax.swing.JButton jGameFieldButton509;
    private javax.swing.JButton jGameFieldButton51;
    private javax.swing.JButton jGameFieldButton510;
    private javax.swing.JButton jGameFieldButton511;
    private javax.swing.JButton jGameFieldButton512;
    private javax.swing.JButton jGameFieldButton513;
    private javax.swing.JButton jGameFieldButton514;
    private javax.swing.JButton jGameFieldButton515;
    private javax.swing.JButton jGameFieldButton516;
    private javax.swing.JButton jGameFieldButton517;
    private javax.swing.JButton jGameFieldButton518;
    private javax.swing.JButton jGameFieldButton519;
    private javax.swing.JButton jGameFieldButton52;
    private javax.swing.JButton jGameFieldButton520;
    private javax.swing.JButton jGameFieldButton521;
    private javax.swing.JButton jGameFieldButton522;
    private javax.swing.JButton jGameFieldButton523;
    private javax.swing.JButton jGameFieldButton524;
    private javax.swing.JButton jGameFieldButton525;
    private javax.swing.JButton jGameFieldButton526;
    private javax.swing.JButton jGameFieldButton527;
    private javax.swing.JButton jGameFieldButton528;
    private javax.swing.JButton jGameFieldButton529;
    private javax.swing.JButton jGameFieldButton53;
    private javax.swing.JButton jGameFieldButton530;
    private javax.swing.JButton jGameFieldButton531;
    private javax.swing.JButton jGameFieldButton532;
    private javax.swing.JButton jGameFieldButton533;
    private javax.swing.JButton jGameFieldButton534;
    private javax.swing.JButton jGameFieldButton535;
    private javax.swing.JButton jGameFieldButton536;
    private javax.swing.JButton jGameFieldButton537;
    private javax.swing.JButton jGameFieldButton538;
    private javax.swing.JButton jGameFieldButton539;
    private javax.swing.JButton jGameFieldButton54;
    private javax.swing.JButton jGameFieldButton540;
    private javax.swing.JButton jGameFieldButton541;
    private javax.swing.JButton jGameFieldButton542;
    private javax.swing.JButton jGameFieldButton543;
    private javax.swing.JButton jGameFieldButton544;
    private javax.swing.JButton jGameFieldButton545;
    private javax.swing.JButton jGameFieldButton546;
    private javax.swing.JButton jGameFieldButton547;
    private javax.swing.JButton jGameFieldButton548;
    private javax.swing.JButton jGameFieldButton549;
    private javax.swing.JButton jGameFieldButton55;
    private javax.swing.JButton jGameFieldButton550;
    private javax.swing.JButton jGameFieldButton551;
    private javax.swing.JButton jGameFieldButton552;
    private javax.swing.JButton jGameFieldButton553;
    private javax.swing.JButton jGameFieldButton554;
    private javax.swing.JButton jGameFieldButton555;
    private javax.swing.JButton jGameFieldButton556;
    private javax.swing.JButton jGameFieldButton557;
    private javax.swing.JButton jGameFieldButton558;
    private javax.swing.JButton jGameFieldButton559;
    private javax.swing.JButton jGameFieldButton56;
    private javax.swing.JButton jGameFieldButton560;
    private javax.swing.JButton jGameFieldButton561;
    private javax.swing.JButton jGameFieldButton562;
    private javax.swing.JButton jGameFieldButton563;
    private javax.swing.JButton jGameFieldButton564;
    private javax.swing.JButton jGameFieldButton565;
    private javax.swing.JButton jGameFieldButton566;
    private javax.swing.JButton jGameFieldButton567;
    private javax.swing.JButton jGameFieldButton568;
    private javax.swing.JButton jGameFieldButton569;
    private javax.swing.JButton jGameFieldButton57;
    private javax.swing.JButton jGameFieldButton570;
    private javax.swing.JButton jGameFieldButton571;
    private javax.swing.JButton jGameFieldButton572;
    private javax.swing.JButton jGameFieldButton573;
    private javax.swing.JButton jGameFieldButton574;
    private javax.swing.JButton jGameFieldButton575;
    private javax.swing.JButton jGameFieldButton576;
    private javax.swing.JButton jGameFieldButton577;
    private javax.swing.JButton jGameFieldButton578;
    private javax.swing.JButton jGameFieldButton579;
    private javax.swing.JButton jGameFieldButton58;
    private javax.swing.JButton jGameFieldButton580;
    private javax.swing.JButton jGameFieldButton581;
    private javax.swing.JButton jGameFieldButton582;
    private javax.swing.JButton jGameFieldButton583;
    private javax.swing.JButton jGameFieldButton584;
    private javax.swing.JButton jGameFieldButton585;
    private javax.swing.JButton jGameFieldButton586;
    private javax.swing.JButton jGameFieldButton587;
    private javax.swing.JButton jGameFieldButton588;
    private javax.swing.JButton jGameFieldButton589;
    private javax.swing.JButton jGameFieldButton59;
    private javax.swing.JButton jGameFieldButton590;
    private javax.swing.JButton jGameFieldButton591;
    private javax.swing.JButton jGameFieldButton592;
    private javax.swing.JButton jGameFieldButton593;
    private javax.swing.JButton jGameFieldButton594;
    private javax.swing.JButton jGameFieldButton595;
    private javax.swing.JButton jGameFieldButton596;
    private javax.swing.JButton jGameFieldButton597;
    private javax.swing.JButton jGameFieldButton598;
    private javax.swing.JButton jGameFieldButton599;
    private javax.swing.JButton jGameFieldButton6;
    private javax.swing.JButton jGameFieldButton60;
    private javax.swing.JButton jGameFieldButton600;
    private javax.swing.JButton jGameFieldButton601;
    private javax.swing.JButton jGameFieldButton602;
    private javax.swing.JButton jGameFieldButton603;
    private javax.swing.JButton jGameFieldButton604;
    private javax.swing.JButton jGameFieldButton605;
    private javax.swing.JButton jGameFieldButton606;
    private javax.swing.JButton jGameFieldButton607;
    private javax.swing.JButton jGameFieldButton608;
    private javax.swing.JButton jGameFieldButton609;
    private javax.swing.JButton jGameFieldButton61;
    private javax.swing.JButton jGameFieldButton610;
    private javax.swing.JButton jGameFieldButton611;
    private javax.swing.JButton jGameFieldButton612;
    private javax.swing.JButton jGameFieldButton613;
    private javax.swing.JButton jGameFieldButton614;
    private javax.swing.JButton jGameFieldButton615;
    private javax.swing.JButton jGameFieldButton616;
    private javax.swing.JButton jGameFieldButton62;
    private javax.swing.JButton jGameFieldButton63;
    private javax.swing.JButton jGameFieldButton64;
    private javax.swing.JButton jGameFieldButton65;
    private javax.swing.JButton jGameFieldButton66;
    private javax.swing.JButton jGameFieldButton67;
    private javax.swing.JButton jGameFieldButton68;
    private javax.swing.JButton jGameFieldButton69;
    private javax.swing.JButton jGameFieldButton7;
    private javax.swing.JButton jGameFieldButton70;
    private javax.swing.JButton jGameFieldButton71;
    private javax.swing.JButton jGameFieldButton72;
    private javax.swing.JButton jGameFieldButton73;
    private javax.swing.JButton jGameFieldButton74;
    private javax.swing.JButton jGameFieldButton75;
    private javax.swing.JButton jGameFieldButton76;
    private javax.swing.JButton jGameFieldButton77;
    private javax.swing.JButton jGameFieldButton78;
    private javax.swing.JButton jGameFieldButton79;
    private javax.swing.JButton jGameFieldButton8;
    private javax.swing.JButton jGameFieldButton80;
    private javax.swing.JButton jGameFieldButton81;
    private javax.swing.JButton jGameFieldButton82;
    private javax.swing.JButton jGameFieldButton83;
    private javax.swing.JButton jGameFieldButton84;
    private javax.swing.JButton jGameFieldButton85;
    private javax.swing.JButton jGameFieldButton86;
    private javax.swing.JButton jGameFieldButton87;
    private javax.swing.JButton jGameFieldButton88;
    private javax.swing.JButton jGameFieldButton89;
    private javax.swing.JButton jGameFieldButton9;
    private javax.swing.JButton jGameFieldButton90;
    private javax.swing.JButton jGameFieldButton91;
    private javax.swing.JButton jGameFieldButton92;
    private javax.swing.JButton jGameFieldButton93;
    private javax.swing.JButton jGameFieldButton94;
    private javax.swing.JButton jGameFieldButton95;
    private javax.swing.JButton jGameFieldButton96;
    private javax.swing.JButton jGameFieldButton97;
    private javax.swing.JButton jGameFieldButton98;
    private javax.swing.JButton jGameFieldButton99;
    private javax.swing.JFrame jGameFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JFrame jMapEditorFrame;
    private javax.swing.JButton jMapField1x1;
    private javax.swing.JButton jMapField1x10;
    private javax.swing.JButton jMapField1x100;
    private javax.swing.JButton jMapField1x101;
    private javax.swing.JButton jMapField1x102;
    private javax.swing.JButton jMapField1x103;
    private javax.swing.JButton jMapField1x104;
    private javax.swing.JButton jMapField1x105;
    private javax.swing.JButton jMapField1x106;
    private javax.swing.JButton jMapField1x107;
    private javax.swing.JButton jMapField1x108;
    private javax.swing.JButton jMapField1x109;
    private javax.swing.JButton jMapField1x11;
    private javax.swing.JButton jMapField1x110;
    private javax.swing.JButton jMapField1x111;
    private javax.swing.JButton jMapField1x112;
    private javax.swing.JButton jMapField1x113;
    private javax.swing.JButton jMapField1x114;
    private javax.swing.JButton jMapField1x115;
    private javax.swing.JButton jMapField1x116;
    private javax.swing.JButton jMapField1x117;
    private javax.swing.JButton jMapField1x118;
    private javax.swing.JButton jMapField1x119;
    private javax.swing.JButton jMapField1x12;
    private javax.swing.JButton jMapField1x120;
    private javax.swing.JButton jMapField1x121;
    private javax.swing.JButton jMapField1x122;
    private javax.swing.JButton jMapField1x123;
    private javax.swing.JButton jMapField1x124;
    private javax.swing.JButton jMapField1x125;
    private javax.swing.JButton jMapField1x126;
    private javax.swing.JButton jMapField1x127;
    private javax.swing.JButton jMapField1x128;
    private javax.swing.JButton jMapField1x129;
    private javax.swing.JButton jMapField1x13;
    private javax.swing.JButton jMapField1x130;
    private javax.swing.JButton jMapField1x131;
    private javax.swing.JButton jMapField1x132;
    private javax.swing.JButton jMapField1x133;
    private javax.swing.JButton jMapField1x134;
    private javax.swing.JButton jMapField1x135;
    private javax.swing.JButton jMapField1x136;
    private javax.swing.JButton jMapField1x137;
    private javax.swing.JButton jMapField1x138;
    private javax.swing.JButton jMapField1x139;
    private javax.swing.JButton jMapField1x14;
    private javax.swing.JButton jMapField1x140;
    private javax.swing.JButton jMapField1x141;
    private javax.swing.JButton jMapField1x142;
    private javax.swing.JButton jMapField1x143;
    private javax.swing.JButton jMapField1x144;
    private javax.swing.JButton jMapField1x145;
    private javax.swing.JButton jMapField1x146;
    private javax.swing.JButton jMapField1x147;
    private javax.swing.JButton jMapField1x148;
    private javax.swing.JButton jMapField1x149;
    private javax.swing.JButton jMapField1x15;
    private javax.swing.JButton jMapField1x150;
    private javax.swing.JButton jMapField1x151;
    private javax.swing.JButton jMapField1x152;
    private javax.swing.JButton jMapField1x153;
    private javax.swing.JButton jMapField1x154;
    private javax.swing.JButton jMapField1x155;
    private javax.swing.JButton jMapField1x156;
    private javax.swing.JButton jMapField1x157;
    private javax.swing.JButton jMapField1x158;
    private javax.swing.JButton jMapField1x159;
    private javax.swing.JButton jMapField1x16;
    private javax.swing.JButton jMapField1x160;
    private javax.swing.JButton jMapField1x161;
    private javax.swing.JButton jMapField1x162;
    private javax.swing.JButton jMapField1x163;
    private javax.swing.JButton jMapField1x164;
    private javax.swing.JButton jMapField1x165;
    private javax.swing.JButton jMapField1x166;
    private javax.swing.JButton jMapField1x167;
    private javax.swing.JButton jMapField1x168;
    private javax.swing.JButton jMapField1x169;
    private javax.swing.JButton jMapField1x17;
    private javax.swing.JButton jMapField1x170;
    private javax.swing.JButton jMapField1x171;
    private javax.swing.JButton jMapField1x172;
    private javax.swing.JButton jMapField1x173;
    private javax.swing.JButton jMapField1x174;
    private javax.swing.JButton jMapField1x175;
    private javax.swing.JButton jMapField1x176;
    private javax.swing.JButton jMapField1x177;
    private javax.swing.JButton jMapField1x178;
    private javax.swing.JButton jMapField1x179;
    private javax.swing.JButton jMapField1x18;
    private javax.swing.JButton jMapField1x180;
    private javax.swing.JButton jMapField1x181;
    private javax.swing.JButton jMapField1x182;
    private javax.swing.JButton jMapField1x183;
    private javax.swing.JButton jMapField1x184;
    private javax.swing.JButton jMapField1x185;
    private javax.swing.JButton jMapField1x186;
    private javax.swing.JButton jMapField1x187;
    private javax.swing.JButton jMapField1x188;
    private javax.swing.JButton jMapField1x189;
    private javax.swing.JButton jMapField1x19;
    private javax.swing.JButton jMapField1x190;
    private javax.swing.JButton jMapField1x191;
    private javax.swing.JButton jMapField1x192;
    private javax.swing.JButton jMapField1x193;
    private javax.swing.JButton jMapField1x194;
    private javax.swing.JButton jMapField1x195;
    private javax.swing.JButton jMapField1x196;
    private javax.swing.JButton jMapField1x197;
    private javax.swing.JButton jMapField1x198;
    private javax.swing.JButton jMapField1x199;
    private javax.swing.JButton jMapField1x2;
    private javax.swing.JButton jMapField1x20;
    private javax.swing.JButton jMapField1x200;
    private javax.swing.JButton jMapField1x201;
    private javax.swing.JButton jMapField1x202;
    private javax.swing.JButton jMapField1x203;
    private javax.swing.JButton jMapField1x204;
    private javax.swing.JButton jMapField1x205;
    private javax.swing.JButton jMapField1x206;
    private javax.swing.JButton jMapField1x207;
    private javax.swing.JButton jMapField1x208;
    private javax.swing.JButton jMapField1x209;
    private javax.swing.JButton jMapField1x21;
    private javax.swing.JButton jMapField1x210;
    private javax.swing.JButton jMapField1x211;
    private javax.swing.JButton jMapField1x212;
    private javax.swing.JButton jMapField1x213;
    private javax.swing.JButton jMapField1x214;
    private javax.swing.JButton jMapField1x215;
    private javax.swing.JButton jMapField1x216;
    private javax.swing.JButton jMapField1x217;
    private javax.swing.JButton jMapField1x218;
    private javax.swing.JButton jMapField1x219;
    private javax.swing.JButton jMapField1x22;
    private javax.swing.JButton jMapField1x220;
    private javax.swing.JButton jMapField1x221;
    private javax.swing.JButton jMapField1x222;
    private javax.swing.JButton jMapField1x223;
    private javax.swing.JButton jMapField1x224;
    private javax.swing.JButton jMapField1x225;
    private javax.swing.JButton jMapField1x226;
    private javax.swing.JButton jMapField1x227;
    private javax.swing.JButton jMapField1x228;
    private javax.swing.JButton jMapField1x229;
    private javax.swing.JButton jMapField1x23;
    private javax.swing.JButton jMapField1x230;
    private javax.swing.JButton jMapField1x231;
    private javax.swing.JButton jMapField1x232;
    private javax.swing.JButton jMapField1x233;
    private javax.swing.JButton jMapField1x234;
    private javax.swing.JButton jMapField1x235;
    private javax.swing.JButton jMapField1x236;
    private javax.swing.JButton jMapField1x237;
    private javax.swing.JButton jMapField1x238;
    private javax.swing.JButton jMapField1x239;
    private javax.swing.JButton jMapField1x24;
    private javax.swing.JButton jMapField1x240;
    private javax.swing.JButton jMapField1x241;
    private javax.swing.JButton jMapField1x242;
    private javax.swing.JButton jMapField1x243;
    private javax.swing.JButton jMapField1x244;
    private javax.swing.JButton jMapField1x245;
    private javax.swing.JButton jMapField1x246;
    private javax.swing.JButton jMapField1x247;
    private javax.swing.JButton jMapField1x248;
    private javax.swing.JButton jMapField1x249;
    private javax.swing.JButton jMapField1x25;
    private javax.swing.JButton jMapField1x250;
    private javax.swing.JButton jMapField1x251;
    private javax.swing.JButton jMapField1x252;
    private javax.swing.JButton jMapField1x253;
    private javax.swing.JButton jMapField1x254;
    private javax.swing.JButton jMapField1x255;
    private javax.swing.JButton jMapField1x256;
    private javax.swing.JButton jMapField1x257;
    private javax.swing.JButton jMapField1x258;
    private javax.swing.JButton jMapField1x259;
    private javax.swing.JButton jMapField1x26;
    private javax.swing.JButton jMapField1x260;
    private javax.swing.JButton jMapField1x261;
    private javax.swing.JButton jMapField1x262;
    private javax.swing.JButton jMapField1x263;
    private javax.swing.JButton jMapField1x264;
    private javax.swing.JButton jMapField1x265;
    private javax.swing.JButton jMapField1x266;
    private javax.swing.JButton jMapField1x267;
    private javax.swing.JButton jMapField1x268;
    private javax.swing.JButton jMapField1x269;
    private javax.swing.JButton jMapField1x27;
    private javax.swing.JButton jMapField1x270;
    private javax.swing.JButton jMapField1x271;
    private javax.swing.JButton jMapField1x272;
    private javax.swing.JButton jMapField1x273;
    private javax.swing.JButton jMapField1x274;
    private javax.swing.JButton jMapField1x275;
    private javax.swing.JButton jMapField1x276;
    private javax.swing.JButton jMapField1x277;
    private javax.swing.JButton jMapField1x278;
    private javax.swing.JButton jMapField1x279;
    private javax.swing.JButton jMapField1x28;
    private javax.swing.JButton jMapField1x280;
    private javax.swing.JButton jMapField1x281;
    private javax.swing.JButton jMapField1x282;
    private javax.swing.JButton jMapField1x283;
    private javax.swing.JButton jMapField1x284;
    private javax.swing.JButton jMapField1x285;
    private javax.swing.JButton jMapField1x286;
    private javax.swing.JButton jMapField1x287;
    private javax.swing.JButton jMapField1x288;
    private javax.swing.JButton jMapField1x289;
    private javax.swing.JButton jMapField1x29;
    private javax.swing.JButton jMapField1x290;
    private javax.swing.JButton jMapField1x291;
    private javax.swing.JButton jMapField1x292;
    private javax.swing.JButton jMapField1x293;
    private javax.swing.JButton jMapField1x294;
    private javax.swing.JButton jMapField1x295;
    private javax.swing.JButton jMapField1x296;
    private javax.swing.JButton jMapField1x297;
    private javax.swing.JButton jMapField1x298;
    private javax.swing.JButton jMapField1x299;
    private javax.swing.JButton jMapField1x3;
    private javax.swing.JButton jMapField1x30;
    private javax.swing.JButton jMapField1x300;
    private javax.swing.JButton jMapField1x301;
    private javax.swing.JButton jMapField1x302;
    private javax.swing.JButton jMapField1x303;
    private javax.swing.JButton jMapField1x304;
    private javax.swing.JButton jMapField1x305;
    private javax.swing.JButton jMapField1x306;
    private javax.swing.JButton jMapField1x307;
    private javax.swing.JButton jMapField1x308;
    private javax.swing.JButton jMapField1x31;
    private javax.swing.JButton jMapField1x32;
    private javax.swing.JButton jMapField1x33;
    private javax.swing.JButton jMapField1x34;
    private javax.swing.JButton jMapField1x35;
    private javax.swing.JButton jMapField1x36;
    private javax.swing.JButton jMapField1x37;
    private javax.swing.JButton jMapField1x38;
    private javax.swing.JButton jMapField1x39;
    private javax.swing.JButton jMapField1x4;
    private javax.swing.JButton jMapField1x40;
    private javax.swing.JButton jMapField1x41;
    private javax.swing.JButton jMapField1x42;
    private javax.swing.JButton jMapField1x43;
    private javax.swing.JButton jMapField1x44;
    private javax.swing.JButton jMapField1x45;
    private javax.swing.JButton jMapField1x46;
    private javax.swing.JButton jMapField1x47;
    private javax.swing.JButton jMapField1x48;
    private javax.swing.JButton jMapField1x49;
    private javax.swing.JButton jMapField1x5;
    private javax.swing.JButton jMapField1x50;
    private javax.swing.JButton jMapField1x51;
    private javax.swing.JButton jMapField1x52;
    private javax.swing.JButton jMapField1x53;
    private javax.swing.JButton jMapField1x54;
    private javax.swing.JButton jMapField1x55;
    private javax.swing.JButton jMapField1x56;
    private javax.swing.JButton jMapField1x57;
    private javax.swing.JButton jMapField1x58;
    private javax.swing.JButton jMapField1x59;
    private javax.swing.JButton jMapField1x6;
    private javax.swing.JButton jMapField1x60;
    private javax.swing.JButton jMapField1x61;
    private javax.swing.JButton jMapField1x62;
    private javax.swing.JButton jMapField1x63;
    private javax.swing.JButton jMapField1x64;
    private javax.swing.JButton jMapField1x65;
    private javax.swing.JButton jMapField1x66;
    private javax.swing.JButton jMapField1x67;
    private javax.swing.JButton jMapField1x68;
    private javax.swing.JButton jMapField1x69;
    private javax.swing.JButton jMapField1x7;
    private javax.swing.JButton jMapField1x70;
    private javax.swing.JButton jMapField1x71;
    private javax.swing.JButton jMapField1x72;
    private javax.swing.JButton jMapField1x73;
    private javax.swing.JButton jMapField1x74;
    private javax.swing.JButton jMapField1x75;
    private javax.swing.JButton jMapField1x76;
    private javax.swing.JButton jMapField1x77;
    private javax.swing.JButton jMapField1x78;
    private javax.swing.JButton jMapField1x79;
    private javax.swing.JButton jMapField1x8;
    private javax.swing.JButton jMapField1x80;
    private javax.swing.JButton jMapField1x81;
    private javax.swing.JButton jMapField1x82;
    private javax.swing.JButton jMapField1x83;
    private javax.swing.JButton jMapField1x84;
    private javax.swing.JButton jMapField1x85;
    private javax.swing.JButton jMapField1x86;
    private javax.swing.JButton jMapField1x87;
    private javax.swing.JButton jMapField1x88;
    private javax.swing.JButton jMapField1x89;
    private javax.swing.JButton jMapField1x9;
    private javax.swing.JButton jMapField1x90;
    private javax.swing.JButton jMapField1x91;
    private javax.swing.JButton jMapField1x92;
    private javax.swing.JButton jMapField1x93;
    private javax.swing.JButton jMapField1x94;
    private javax.swing.JButton jMapField1x95;
    private javax.swing.JButton jMapField1x96;
    private javax.swing.JButton jMapField1x97;
    private javax.swing.JButton jMapField1x98;
    private javax.swing.JButton jMapField1x99;
    private javax.swing.JButton jNewMapButton;
    private javax.swing.JButton jOpenComputerMap;
    private javax.swing.JButton jPionowoButton;
    private javax.swing.JLabel jPlayerScore;
    private javax.swing.JButton jPojazd2Button;
    private javax.swing.JButton jPojazd3Button;
    private javax.swing.JButton jPojazd4Button;
    private javax.swing.JButton jPoziomoButton;
    private javax.swing.JButton jRandOmPlayerMapButton;
    private javax.swing.JButton jRandomComputerMapButton;
    private javax.swing.JButton jRandomMapButton;
    private javax.swing.JLabel jRemainingFieldsLabel;
    private javax.swing.JButton jResetMapButton;
    private javax.swing.JButton jSamolotButton;
    private javax.swing.JButton jSelectFileButton;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jShotCounterLabel;
    private javax.swing.JButton jStartGameButton;
    private javax.swing.JButton jStatek2Button;
    private javax.swing.JButton jStatek3Button;
    private javax.swing.JButton jStatek4Button;
    private javax.swing.JButton jStatek5Button;
    private javax.swing.JLabel jWinnerLabel;
    // End of variables declaration//GEN-END:variables
}