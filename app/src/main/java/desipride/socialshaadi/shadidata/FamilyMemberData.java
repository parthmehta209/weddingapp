package desipride.socialshaadi.shadidata;

import java.util.ArrayList;

import desipride.socialshaadi.R;

/**
 * Created by parth.mehta on 9/15/15.
 */
public class FamilyMemberData {
    static private ArrayList<FamilyMember> parthFamilyMembers = null;
    static private ArrayList<FamilyMember> priyaFamilyMembers = null;

    private static final String PARTH_MOTHER_NAME = "Nandini Mehta";
    private static final String PARTH_MOTHER_RELATION = "Parth's Mother";
    private static final String PARTH_MOTHER_INFO = "";
    private static final int PARTH_MOTHER_IMAGE = R.drawable.nandini_mehta;

    private static final String PARTH_FATHER_NAME = "Chirag Mehta";
    private static final String PARTH_FATHER_RELATION = "Parth's Father";
    private static final String PARTH_FATHER_INFO = "";
    private static final int PARTH_FATHER_IMAGE = R.drawable.chirag_mehta;

    private static final String PARTH_BA_NAME = "Nila Mehta a.k.a Nilaba";
    private static final String PARTH_BA_RELATION = "Parth's Grandmother";
    private static final String PARTH_BA_INFO = "";
    private static final int PARTH_BA_IMAGE = R.drawable.nilaba;


    private static final String PARTH_FOI_NAME = "Vilas Mehta a.k.a VilasFoi";
    private static final String PARTH_FOI_RELATION = "Parth's Foiba";
    private static final String PARTH_FOI_INFO = "";
    private static final int PARTH_FOI_IMAGE = R.drawable.vilasfoi;

    private static final String PRIYA_MOTER_NAME = "Shilpa Shah";
    private static final String PRIYA_MOTHER_RELATION = "Priya's Mother";
    private static final String PRIYA_MOTHER_INFO = "";
    private static final int PRIYA_MOTHER_IMAGE = R.drawable.shilpa_shah;

    private static final String PRIYA_FATHER_NAME = "Hitank Shah";
    private static final String PRIYA_FATHER_RELATION = "Priya's Father";
    private static final String PRIYA_FATHER_INFO = "";
    private static final int PRIYA_FATHER_IMAGE = R.drawable.hitank_shah;

    private static final String PRIYA_SISTER_NAME = "Sonam Shah";
    private static final String PRIYA_SISTER_RELATION = "Priya's Sister";
    private static final String PRIYA_SISTER_INFO = "";
    private static final int PRIYA_SISTER_IMAGE = R.drawable.sonam_shah;

    private static final String PRIYA_BA_NAME = "Jaya Shah a.k.a. Jayaba";
    private static final String PRIYA_BA_RELATION = "Priya's Grandmother";
    private static final String PRIYA_BA_INFO = "";
    private static final int PRIYA_BA_IMAGE = R.drawable.jayaba;

    private static final String PRIYA_DADA_NAME = "Jayantilal Shah a.k.a. Dada";
    private static final String PRIYA_DADA_RELATION = "Priya's Grandfather";
    private static final String PRIYA_DADA_INFO = "";
    private static final int PRIYA_DADA_IMAGE = R.drawable.dada;

    private static final String PRIYA_TSUK_NAME = "Tsuki Shah";
    private static final String PRIYA_TSUK_RELATION = "Priya's Little Sister";
    private static final String PRIYA_TSUK_INFO = "";
    private static final int PRIYA_TSUK_IMAGE = R.drawable.tsukduuu;


    public static FamilyMember getParthFamilyMember(int index) {
        return getParthFamilyMembers().get(index);
    }

    public static ArrayList<FamilyMember> getParthFamilyMembers() {
        if(parthFamilyMembers == null) {
            parthFamilyMembers = new ArrayList<FamilyMember>(5);
            FamilyMember familyMember = null;

            familyMember = new FamilyMember(PARTH_MOTHER_NAME,PARTH_MOTHER_RELATION,PARTH_MOTHER_INFO,PARTH_MOTHER_IMAGE);
            parthFamilyMembers.add(familyMember);

            familyMember = new FamilyMember(PARTH_FATHER_NAME,PARTH_FATHER_RELATION,PARTH_FATHER_INFO,PARTH_FATHER_IMAGE);
            parthFamilyMembers.add(familyMember);

            familyMember = new FamilyMember(PARTH_BA_NAME,PARTH_BA_RELATION,PARTH_BA_INFO,PARTH_BA_IMAGE);
            parthFamilyMembers.add(familyMember);

            familyMember = new FamilyMember(PARTH_FOI_NAME,PARTH_FOI_RELATION,PARTH_FOI_INFO,PARTH_FOI_IMAGE);
            parthFamilyMembers.add(familyMember);
        }
        return parthFamilyMembers;
    }

    public static ArrayList<FamilyMember> getPriyaFamilyMembers() {
        if(priyaFamilyMembers == null) {
            priyaFamilyMembers = new ArrayList<FamilyMember>(6);
            FamilyMember familyMember = null;
            familyMember = new FamilyMember(PRIYA_DADA_NAME,PRIYA_DADA_RELATION,PRIYA_DADA_INFO,PRIYA_DADA_IMAGE);
            priyaFamilyMembers.add(familyMember);
            familyMember = new FamilyMember(PRIYA_BA_NAME,PRIYA_BA_RELATION,PRIYA_BA_INFO,PRIYA_BA_IMAGE);
            priyaFamilyMembers.add(familyMember);
            familyMember = new FamilyMember(PRIYA_MOTER_NAME,PRIYA_MOTHER_RELATION,PRIYA_MOTHER_INFO,PRIYA_MOTHER_IMAGE);
            priyaFamilyMembers.add(familyMember);
            familyMember = new FamilyMember(PRIYA_FATHER_NAME,PRIYA_FATHER_RELATION,PRIYA_FATHER_INFO,PRIYA_FATHER_IMAGE);
            priyaFamilyMembers.add(familyMember);
            familyMember = new FamilyMember(PRIYA_SISTER_NAME,PRIYA_SISTER_RELATION,PRIYA_SISTER_INFO,PRIYA_SISTER_IMAGE);
            priyaFamilyMembers.add(familyMember);
            familyMember = new FamilyMember(PRIYA_TSUK_NAME,PRIYA_TSUK_RELATION,PRIYA_TSUK_INFO,PRIYA_TSUK_IMAGE);
            priyaFamilyMembers.add(familyMember);
        }
        return priyaFamilyMembers;
    }

}
