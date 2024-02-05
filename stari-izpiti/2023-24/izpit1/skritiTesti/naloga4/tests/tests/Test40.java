
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        List<String> la = List.of("acw", "adb", "aih", "ajf", "ake", "aki", "apt", "aqn", "atd", "auv", "avp", "bda", "bdc", "bek", "bfb", "bfu", "bfy", "bix", "bja", "bjg", "bnb", "bon", "bpl", "bry", "brz", "buq", "bya", "cbl", "cbn", "cbt", "ccj", "ceg", "cfi", "cgw", "chn", "coo", "cqs", "cqv", "cqy", "csz", "cwh", "dcd", "dhj", "dni", "dnx", "doa", "dom", "dpe", "dqj", "dvn", "dyc", "dzq", "ech", "eme", "emw", "ese", "eve", "ewn", "exu", "ezr", "fbw", "feo", "fjs", "fno", "fsm", "ftl", "fxy", "fze", "fzf", "fzm", "gbf", "gbw", "gds", "gfv", "ghj", "gma", "gqc", "gsp", "gvm", "gvo", "gzd", "hej", "hgz", "hhn", "hnf", "hpw", "htb", "hva", "hvs", "hwq", "hyr", "ibj", "ibl", "ica", "icv", "icw", "iel", "igh", "iif", "imt", "imv", "isq", "ivm", "iya", "iyg", "iyo", "izh", "jaz", "jbr", "jdn", "jjw", "jkw", "jlo", "jlt", "jly", "jmj", "jnz", "jog", "jon", "jqd", "jsi", "jyr", "jzx", "kgn", "kht", "khz", "kid", "kja", "klw", "knn", "kqn", "krb", "ktn", "kwb", "kzx", "lab", "lad", "lel", "lgz", "lhp", "lie", "ljx", "llv", "llw", "lth", "ltj", "lvl", "lxs", "lyu", "lyx", "max", "mcp", "mga", "mix", "mpd", "mps", "msa", "mwh", "myq", "myr", "mzn", "ncb", "ncg", "nfp", "nge", "ngw", "nix", "nlt", "nmt", "nmv", "nqi", "nrq", "nuu", "obe", "obx", "och", "oeo", "ohz", "oln", "omy", "oqq", "ors", "owg", "oxe", "oxx", "oyy", "ozm", "pcg", "pfj", "pfn", "pgl", "plb", "plk", "pmo", "pnr", "ptn", "ptp", "pui", "puz", "pya", "pzl", "qer", "qgo", "qhr", "qkb", "qml", "qoq", "qrf", "qrs", "qsu", "qtv", "qza", "rbn", "rid", "rjt", "rke", "rnh", "rod", "rpb", "rsn", "rss", "rvm", "rvp", "sah", "sbd", "ses", "shp", "slm", "srh", "swk", "sxi", "sxm", "szk", "taa", "tag", "tdk", "teh", "tfa", "tfz", "tkv", "tsa", "tss", "twz", "udr", "uht", "uiw", "ula", "uny", "uoj", "uru", "urw", "use", "usu", "usw", "uux", "uws", "vam", "vcd", "vci", "vez", "vfm", "vgd", "vhz", "vmi", "vmv", "vmy", "vne", "vpj", "vpx", "vsa", "vuj", "vwx", "vyk", "vze", "wbn", "wby", "wca", "wgc", "wgl", "wjg", "wmx", "wpf", "wpj", "wrn", "wsb", "wzk", "xbd", "xdr", "xgc", "xgy", "xki", "xkx", "xlg", "xnf", "xnu", "xoo", "xph", "xqt", "xud", "xut", "xwf", "xwq", "xyc", "ybt", "yeu", "yfw", "ygp", "ykp", "ykz", "yoe", "yof", "yoo", "ysz", "yxx", "zbp", "zgc", "zgh", "zhm", "zjt", "zld", "zmc", "znx", "zqs", "zre", "zxx");
        List<String> lb = List.of("aaf", "acx", "adq", "afj", "afo", "agb", "air", "aln", "ams", "amu", "anf", "aoo", "apg", "arl", "arw", "aty", "auy", "axa", "axc", "ayy", "azh", "bcl", "bex", "bfx", "bgh", "bgt", "bgu", "bis", "bjc", "bji", "bjq", "bls", "bmm", "bom", "bqa", "bui", "bve", "bvh", "bvk", "bwn", "bxu", "byt", "byx", "car", "ccn", "cgm", "cii", "cjj", "cjv", "ckr", "ckv", "cme", "cmy", "coq", "csd", "csx", "ctc", "cts", "ctv", "cuz", "cvf", "cwy", "czg", "dbn", "ddf", "dgi", "dih", "dkf", "dki", "dkv", "dlf", "dlv", "dqx", "drf", "dse", "dtb", "dts", "dup", "dve", "dxi", "dzm", "eer", "eew", "eid", "ejb", "ekw", "eln", "ema", "epr", "eqt", "evh", "ewu", "faz", "fcb", "ffs", "fga", "fgd", "fgr", "fia", "fih", "fjk", "fjl", "fnr", "fov", "fow", "fsi", "fxg", "fxk", "fxo", "fzj", "gca", "gdl", "ggp", "gkx", "gnr", "gnx", "gob", "gon", "gqc", "gqq", "gvk", "gwb", "gwn", "gxo", "gya", "gyd", "gyj", "gyy", "hcu", "hdj", "heu", "hjs", "hkm", "hme", "hsh", "hsp", "htn", "huu", "hwr", "hyf", "ibg", "ibj", "ibt", "icy", "idt", "iew", "ifk", "ifu", "igp", "ine", "iog", "ipl", "ipx", "ipy", "ite", "iui", "ivm", "iws", "izu", "izw", "jbk", "jcf", "jcl", "jdd", "jdh", "jea", "jff", "jfi", "jgt", "jhj", "jij", "jlc", "jlt", "jok", "jox", "jpj", "jpr", "jrw", "jsu", "jte", "jvl", "jww", "jyn", "kab", "kbj", "kbq", "keu", "kfj", "kgf", "kha", "kip", "kky", "kmf", "kmn", "kna", "kop", "krq", "krr", "ksv", "kxh", "kyb", "kzb", "lac", "lam", "lav", "lce", "lcs", "lcu", "ldd", "lgp", "lhe", "lip", "lla", "lli", "lqv", "lrb", "ltz", "lup", "luu", "lyb", "lzi", "lzj", "meb", "mfd", "mff", "mkg", "mmv", "moh", "msb", "msr", "mtk", "mws", "mxm", "mzg", "nbi", "ndo", "nes", "nhc", "njl", "nla", "nmt", "nnl", "nob", "nrr", "nsa", "nsg", "nsh", "nsi", "nup", "nwp", "oet", "ofw", "oge", "ogt", "ohg", "ohk", "oho", "ojo", "oky", "oqf", "oqo", "orm", "oux", "ove", "owi", "ozr", "ozw", "pgi", "pkb", "plf", "pls", "pml", "pmo", "pmq", "pmy", "prh", "pth", "puv", "pux", "pvi", "pwc", "pyg", "pzp", "qay", "qhm", "qjf", "qmp", "qrp", "qsm", "qsx", "qyh", "rce", "rcp", "rde", "rdf", "rds", "rff", "rfg", "rfk", "rgq", "rkb", "rlh", "rma", "rmj", "rum", "rvv", "rwo", "ryu", "sau", "scz", "sfd", "sgd", "sgq", "shg", "siy", "sjc", "skc", "sll", "slv", "sos", "sph", "sqe", "srm", "suo", "sup", "swf", "swh", "sxz", "syf", "tbx", "tej", "tfb", "tgb", "the", "thv", "tkv", "tkw", "tpk", "tsv", "tuw", "tvt", "twk", "tyc", "ubi", "udj", "uee", "uey", "uhc", "ulj", "una", "uvk", "uxp", "uxv", "uyy", "vds", "ved", "vhh", "via", "vib", "vix", "vka", "vkv", "vly", "vmk", "vsj", "vtu", "vtv", "vwh", "vwn", "vxi", "vyx", "waf", "wdf", "weh", "wen", "wes", "wgr", "whj", "wik", "wkb", "wlc", "wnp", "wnv", "woc", "wst", "wty", "wuk", "wxt", "wys", "xav", "xeh", "xfs", "xig", "xkn", "xla", "xmw", "xoc", "xpx", "xro", "xtc", "xzx", "yao", "yar", "yez", "ykw", "ymk", "ynu", "yqd", "yrv", "yto", "yvg", "ywn", "yxc", "yzj", "zbw", "zcc", "zeh", "zfq", "zho", "zje", "zjo", "zkr", "zkx", "zls", "zmb", "zus", "zxq", "zyi", "zyp", "zzq", "zzv", "zzz");
        List<String> lc = it2list(Cetrta.zlitje(la.iterator(), lb.iterator()));
        System.out.println(lc);
    }

    private static <T> List<T> it2list(Iterator<T> it) {
        List<T> seznam = new ArrayList<>();
        while (it.hasNext()) {
            T element = it.next();
            seznam.add(element);
        }
        return seznam;
    }
}
