import org.dblp.*;
import org.dblp.mmdb.Field;
import org.dblp.mmdb.PersonName;
import org.dblp.mmdb.Publication;
import org.dblp.mmdb.RecordDb;
import org.dblp.mmdb.RecordDbInterface;
import org.dblp.mmdb.TableOfContents;

import java.io.FileWriter;
import java.io.IOException;

import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test{
    private static HashMap<String,ArrayList<Publication> > mp;


    private static void addWanted(Publication pb){
        String theKey=pb.getKey();
        if(theKey.startsWith("journals/tocs")){
            mp.get("journals/tocs").add(pb);
        }else if(theKey.startsWith("journals/tos")){
            mp.get("journals/tos").add(pb);
        }else if(theKey.startsWith("journals/tcad")){
            mp.get("journals/tcad").add(pb);
        }else if(theKey.startsWith("journals/tc")){
            mp.get("journals/tc").add(pb);
        }else if(theKey.startsWith("journals/tpds")){
            mp.get("journals/tpds").add(pb);
        }else if(theKey.startsWith("journals/taco")){
            mp.get("journals/taco").add(pb);
        }else if(theKey.startsWith("journals/taas")){
            mp.get("journals/taas").add(pb);
        }else if(theKey.startsWith("journals/todaes")){
            mp.get("journals/todaes").add(pb);
        }else if(theKey.startsWith("journals/tecs")){
            mp.get("journals/tecs").add(pb);
        }else if(theKey.startsWith("journals/trets")){
            mp.get("journals/trets").add(pb);
        }else if(theKey.startsWith("journals/tvlsi")){
            mp.get("journals/tvlsi").add(pb);
        }else if(theKey.startsWith("journals/jpdc")){
            mp.get("journals/jpdc").add(pb);
        }else if(theKey.startsWith("journals/jsa")){
            mp.get("journals/jsa").add(pb);
        }else if(theKey.startsWith("conf/parco")){
            mp.get("conf/parco").add(pb);
        }else if(theKey.startsWith("journals/jetc")){
            mp.get("journals/jetc").add(pb);
        }else if(theKey.startsWith("journals/concurrency")){
            mp.get("journals/concurrency").add(pb);
        }else if(theKey.startsWith("journals/dc")){
            mp.get("journals/dc").add(pb);
        }else if(theKey.startsWith("journals/fgcs")){
            mp.get("journals/fgcs").add(pb);
        }else if(theKey.startsWith("journals/integration")){
            mp.get("journals/integration").add(pb);
        }else if(theKey.startsWith("journals/mam")){
            mp.get("journals/mam").add(pb);
        }else if(theKey.startsWith("journals/rts")){
            mp.get("journals/rts").add(pb);
        }else if(theKey.startsWith("journals/tjs")){
            mp.get("journals/tjs").add(pb);
        }else if(theKey.startsWith("conf/ppopp")){
            mp.get("conf/ppopp").add(pb);
        }else if(theKey.startsWith("conf/fast")){
            mp.get("conf/fast").add(pb);
        }else if(theKey.startsWith("conf/hpca")){
            mp.get("conf/hpca").add(pb);
        }else if(theKey.startsWith("conf/sc")){
            mp.get("conf/sc").add(pb);
        }else if(theKey.startsWith("conf/asplos")){
            mp.get("conf/asplos").add(pb);
        }else if(theKey.startsWith("conf/isca")){
            mp.get("conf/isca").add(pb);
        }else if(theKey.startsWith("conf/usenix")){
            mp.get("conf/usenix").add(pb);
        }else if(theKey.startsWith("conf/cloud")){
            mp.get("conf/cloud").add(pb);
        }else if(theKey.startsWith("conf/spaa")){
            mp.get("conf/spaa").add(pb);
        }else if(theKey.startsWith("conf/podc")){
            mp.get("conf/podc").add(pb);
        }else if(theKey.startsWith("conf/fpga")){
            mp.get("conf/fpga").add(pb);
        }else if(theKey.startsWith("conf/cgo")){
            mp.get("conf/cgo").add(pb);
        }else if(theKey.startsWith("conf/date")){
            mp.get("conf/date").add(pb);
        }else if(theKey.startsWith("conf/eurosys")){
            mp.get("conf/eurosys").add(pb);
        }else if(theKey.startsWith("conf/iccd")){
            mp.get("conf/iccd").add(pb);
        }else if(theKey.startsWith("conf/iccad")){
            mp.get("conf/iccad").add(pb);
        }else if(theKey.startsWith("conf/icdcs")){
            mp.get("conf/icdcs").add(pb);
        }else if(theKey.startsWith("conf/codes")){
            mp.get("conf/codes").add(pb);
        }else if(theKey.startsWith("conf/hipeac")){
            mp.get("conf/hipeac").add(pb);
        }else if(theKey.startsWith("conf/sigmetrics")){
            mp.get("conf/sigmetrics").add(pb);
        }else if(theKey.startsWith("conf/IEEEpact")){
            mp.get("conf/IEEEpact").add(pb);
        }else if(theKey.startsWith("conf/icpp")){
            mp.get("conf/icpp").add(pb);
        }else if(theKey.startsWith("conf/ics")){
            mp.get("conf/ics").add(pb);
        }else if(theKey.startsWith("conf/vee")){
            mp.get("conf/vee").add(pb);
        }else if(theKey.startsWith("conf/ipps")){
            mp.get("conf/ipps").add(pb);
        }else if(theKey.startsWith("conf/performance")){
            mp.get("conf/performance").add(pb);
        }else if(theKey.startsWith("conf/hpdc")){
            mp.get("conf/hpdc").add(pb);
        }else if(theKey.startsWith("conf/itc")){
            mp.get("conf/itc").add(pb);
        }else if(theKey.startsWith("conf/lisa")){
            mp.get("conf/lisa").add(pb);
        }else if(theKey.startsWith("conf/mss")){
            mp.get("conf/mss").add(pb);
        }else if(theKey.startsWith("conf/rtas")){
            mp.get("conf/rtas").add(pb);
        }else if(theKey.startsWith("conf/cf")){
            mp.get("conf/cf").add(pb);
        }else if(theKey.startsWith("conf/systor")){
            mp.get("conf/systor").add(pb);
        }else if(theKey.startsWith("conf/nocs")){
            mp.get("conf/nocs").add(pb);
        }else if(theKey.startsWith("conf/asap")){
            mp.get("conf/asap").add(pb);
        }else if(theKey.startsWith("conf/aspdac")){
            mp.get("conf/aspdac").add(pb);
        }else if(theKey.startsWith("conf/europar")){
            mp.get("conf/europar").add(pb);
        }else if(theKey.startsWith("conf/ets")){
            mp.get("conf/ets").add(pb);
        }else if(theKey.startsWith("conf/fpl")){
            mp.get("conf/fpl").add(pb);
        }else if(theKey.startsWith("conf/fccm")){
            mp.get("conf/fccm").add(pb);
        }else if(theKey.startsWith("conf/glvlsi")){
            mp.get("conf/glvlsi").add(pb);
        }else if(theKey.startsWith("conf/ats")){
            mp.get("conf/ats").add(pb);
        }else if(theKey.startsWith("conf/hpcc")){
            mp.get("conf/hpcc").add(pb);
        }else if(theKey.startsWith("conf/hipc")){
            mp.get("conf/hipc").add(pb);
        }else if(theKey.startsWith("conf/mascots")){
            mp.get("conf/mascots").add(pb);
        }else if(theKey.startsWith("conf/ispa")){
            mp.get("conf/ispa").add(pb);
        }else if(theKey.startsWith("conf/ccgrid")){
            mp.get("conf/ccgrid").add(pb);
        }else if(theKey.startsWith("conf/npc")){
            mp.get("conf/npc").add(pb);
        }else if(theKey.startsWith("conf/ica3pp")){
            mp.get("conf/ica3pp").add(pb);
        }else if(theKey.startsWith("conf/cases")){
            mp.get("conf/cases").add(pb);
        }else if(theKey.startsWith("conf/fpt")){
            mp.get("conf/fpt").add(pb);
        }else if(theKey.startsWith("conf/icpads")){
            mp.get("conf/icpads").add(pb);
        }else if(theKey.startsWith("conf/iscas")){
            mp.get("conf/iscas").add(pb);
        }else if(theKey.startsWith("conf/islped")){
            mp.get("conf/islped").add(pb);
        }else if(theKey.startsWith("conf/ispd")){
            mp.get("conf/ispd").add(pb);
        }else if(theKey.startsWith("conf/hoti")){
            mp.get("conf/hoti").add(pb);
        }else if(theKey.startsWith("conf/vts")){
            mp.get("conf/vts").add(pb);
        }else if(theKey.startsWith("journals/jsac")){
            mp.get("journals/jsac").add(pb);
        }else if(theKey.startsWith("journals/tmc")){
            mp.get("journals/tmc").add(pb);
        }else if(theKey.startsWith("journals/ton")){
            mp.get("journals/ton").add(pb);
        }else if(theKey.startsWith("journals/toit")){
            mp.get("journals/toit").add(pb);
        }else if(theKey.startsWith("journals/tomccap")){
            mp.get("journals/tomccap").add(pb);
        }else if(theKey.startsWith("journals/tosn")){
            mp.get("journals/tosn").add(pb);
        }else if(theKey.startsWith("journals/cn")){
            mp.get("journals/cn").add(pb);
        }else if(theKey.startsWith("journals/tcom")){
            mp.get("journals/tcom").add(pb);
        }else if(theKey.startsWith("journals/twc")){
            mp.get("journals/twc").add(pb);
        }else if(theKey.startsWith("journals/adhoc")){
            mp.get("journals/adhoc").add(pb);
        }else if(theKey.startsWith("journals/comcom")){
            mp.get("journals/comcom").add(pb);
        }else if(theKey.startsWith("journals/tnsm")){
            mp.get("journals/tnsm").add(pb);
        }else if(theKey.startsWith("journals/iet-com")){
            mp.get("journals/iet-com").add(pb);
        }else if(theKey.startsWith("journals/jnca")){
            mp.get("journals/jnca").add(pb);
        }else if(theKey.startsWith("journals/monet")){
            mp.get("journals/monet").add(pb);
        }else if(theKey.startsWith("journals/networks")){
            mp.get("journals/networks").add(pb);
        }else if(theKey.startsWith("journals/ppna")){
            mp.get("journals/ppna").add(pb);
        }else if(theKey.startsWith("journals/wicomm")){
            mp.get("journals/wicomm").add(pb);
        }else if(theKey.startsWith("journals/winet")){
            mp.get("journals/winet").add(pb);
        }else if(theKey.startsWith("conf/sigcomm")){
            mp.get("conf/sigcomm").add(pb);
        }else if(theKey.startsWith("conf/mobicom")){
            mp.get("conf/mobicom").add(pb);
        }else if(theKey.startsWith("conf/infocom")){
            mp.get("conf/infocom").add(pb);
        }else if(theKey.startsWith("conf/nsdi")){
            mp.get("conf/nsdi").add(pb);
        }else if(theKey.startsWith("conf/sensys")){
            mp.get("conf/sensys").add(pb);
        }else if(theKey.startsWith("conf/conext")){
            mp.get("conf/conext").add(pb);
        }else if(theKey.startsWith("conf/secon")){
            mp.get("conf/secon").add(pb);
        }else if(theKey.startsWith("conf/ipsn")){
            mp.get("conf/ipsn").add(pb);
        }else if(theKey.startsWith("conf/mobisys")){
            mp.get("conf/mobisys").add(pb);
        }else if(theKey.startsWith("conf/icnp")){
            mp.get("conf/icnp").add(pb);
        }else if(theKey.startsWith("conf/mobihoc")){
            mp.get("conf/mobihoc").add(pb);
        }else if(theKey.startsWith("conf/nossdav")){
            mp.get("conf/nossdav").add(pb);
        }else if(theKey.startsWith("conf/iwqos")){
            mp.get("conf/iwqos").add(pb);
        }else if(theKey.startsWith("conf/imc")){
            mp.get("conf/imc").add(pb);
        }else if(theKey.startsWith("conf/ancs")){
            mp.get("conf/ancs").add(pb);
        }else if(theKey.startsWith("conf/apnoms")){
            mp.get("conf/apnoms").add(pb);
        }else if(theKey.startsWith("conf/forte")){
            mp.get("conf/forte").add(pb);
        }else if(theKey.startsWith("conf/lcn")){
            mp.get("conf/lcn").add(pb);
        }else if(theKey.startsWith("conf/globecom")){
            mp.get("conf/globecom").add(pb);
        }else if(theKey.startsWith("conf/icc")){
            mp.get("conf/icc").add(pb);
        }else if(theKey.startsWith("conf/icccn")){
            mp.get("conf/icccn").add(pb);
        }else if(theKey.startsWith("conf/mass")){
            mp.get("conf/mass").add(pb);
        }else if(theKey.startsWith("conf/p2p")){
            mp.get("conf/p2p").add(pb);
        }else if(theKey.startsWith("conf/ipccc")){
            mp.get("conf/ipccc").add(pb);
        }else if(theKey.startsWith("conf/wowmom")){
            mp.get("conf/wowmom").add(pb);
        }else if(theKey.startsWith("conf/iscc")){
            mp.get("conf/iscc").add(pb);
        }else if(theKey.startsWith("conf/wcnc")){
            mp.get("conf/wcnc").add(pb);
        }else if(theKey.startsWith("conf/networking")){
            mp.get("conf/networking").add(pb);
        }else if(theKey.startsWith("conf/im")){
            mp.get("conf/im").add(pb);
        }else if(theKey.startsWith("conf/mswim")){
            mp.get("conf/mswim").add(pb);
        }else if(theKey.startsWith("conf/wasa")){
            mp.get("conf/wasa").add(pb);
        }else if(theKey.startsWith("conf/hotnets")){
            mp.get("conf/hotnets").add(pb);
        }else if(theKey.startsWith("journals/tdsc")){
            mp.get("journals/tdsc").add(pb);
        }else if(theKey.startsWith("journals/tifs")){
            mp.get("journals/tifs").add(pb);
        }else if(theKey.startsWith("journals/joc")){
            mp.get("journals/joc").add(pb);
        }else if(theKey.startsWith("journals/compsec")){
            mp.get("journals/compsec").add(pb);
        }else if(theKey.startsWith("journals/dcc")){
            mp.get("journals/dcc").add(pb);
        }else if(theKey.startsWith("journals/jcs")){
            mp.get("journals/jcs").add(pb);
        }else if(theKey.startsWith("journals/ejisec")){
            mp.get("journals/ejisec").add(pb);
        }else if(theKey.startsWith("journals/iet-ifs")){
            mp.get("journals/iet-ifs").add(pb);
        }else if(theKey.startsWith("journals/imcs")){
            mp.get("journals/imcs").add(pb);
        }else if(theKey.startsWith("journals/ijics")){
            mp.get("journals/ijics").add(pb);
        }else if(theKey.startsWith("journals/ijisp")){
            mp.get("journals/ijisp").add(pb);
        }else if(theKey.startsWith("journals/scn")){
            mp.get("journals/scn").add(pb);
        }else if(theKey.startsWith("conf/ccs")){
            mp.get("conf/ccs").add(pb);
        }else if(theKey.startsWith("conf/eurocrypt")){
            mp.get("conf/eurocrypt").add(pb);
        }else if(theKey.startsWith("conf/sp")){
            mp.get("conf/sp").add(pb);
        }else if(theKey.startsWith("conf/crypto")){
            mp.get("conf/crypto").add(pb);
        }else if(theKey.startsWith("conf/uss")){
            mp.get("conf/uss").add(pb);
        }else if(theKey.startsWith("conf/acsac")){
            mp.get("conf/acsac").add(pb);
        }else if(theKey.startsWith("conf/asiacrypt")){
            mp.get("conf/asiacrypt").add(pb);
        }else if(theKey.startsWith("conf/esorics")){
            mp.get("conf/esorics").add(pb);
        }else if(theKey.startsWith("conf/fse")){
            mp.get("conf/fse").add(pb);
        }else if(theKey.startsWith("conf/csfw")){
            mp.get("conf/csfw").add(pb);
        }else if(theKey.startsWith("conf/srds")){
            mp.get("conf/srds").add(pb);
        }else if(theKey.startsWith("conf/ches")){
            mp.get("conf/ches").add(pb);
        }else if(theKey.startsWith("conf/dsn")){
            mp.get("conf/dsn").add(pb);
        }else if(theKey.startsWith("conf/raid")){
            mp.get("conf/raid").add(pb);
        }else if(theKey.startsWith("conf/pkc")){
            mp.get("conf/pkc").add(pb);
        }else if(theKey.startsWith("conf/ndss")){
            mp.get("conf/ndss").add(pb);
        }else if(theKey.startsWith("conf/tcc")){
            mp.get("conf/tcc").add(pb);
        }else if(theKey.startsWith("conf/wisec")){
            mp.get("conf/wisec").add(pb);
        }else if(theKey.startsWith("conf/sacmat")){
            mp.get("conf/sacmat").add(pb);
        }else if(theKey.startsWith("conf/drm")){
            mp.get("conf/drm").add(pb);
        }else if(theKey.startsWith("conf/ih")){
            mp.get("conf/ih").add(pb);
        }else if(theKey.startsWith("conf/acns")){
            mp.get("conf/acns").add(pb);
        }else if(theKey.startsWith("conf/ccs")){
            mp.get("conf/ccs").add(pb);
        }else if(theKey.startsWith("conf/acisp")){
            mp.get("conf/acisp").add(pb);
        }else if(theKey.startsWith("conf/ctrsa")){
            mp.get("conf/ctrsa").add(pb);
        }else if(theKey.startsWith("conf/dimva")){
            mp.get("conf/dimva").add(pb);
        }else if(theKey.startsWith("conf/dfrws")){
            mp.get("conf/dfrws").add(pb);
        }else if(theKey.startsWith("conf/fc")){
            mp.get("conf/fc").add(pb);
        }else if(theKey.startsWith("conf/trustcom")){
            mp.get("conf/trustcom").add(pb);
        }else if(theKey.startsWith("conf/sec")){
            mp.get("conf/sec").add(pb);
        }else if(theKey.startsWith("conf/isw")){
            mp.get("conf/isw").add(pb);
        }else if(theKey.startsWith("conf/icdf2c")){
            mp.get("conf/icdf2c").add(pb);
        }else if(theKey.startsWith("conf/icics")){
            mp.get("conf/icics").add(pb);
        }else if(theKey.startsWith("conf/securecomm")){
            mp.get("conf/securecomm").add(pb);
        }else if(theKey.startsWith("conf/nspw")){
            mp.get("conf/nspw").add(pb);
        }else if(theKey.startsWith("conf/pam")){
            mp.get("conf/pam").add(pb);
        }else if(theKey.startsWith("conf/pet")){
            mp.get("conf/pet").add(pb);
        }else if(theKey.startsWith("conf/sacrypt")){
            mp.get("conf/sacrypt").add(pb);
        }else if(theKey.startsWith("conf/soups")){
            mp.get("conf/soups").add(pb);
        }else if(theKey.startsWith("journals/toplas")){
            mp.get("journals/toplas").add(pb);
        }else if(theKey.startsWith("journals/tosem")){
            mp.get("journals/tosem").add(pb);
        }else if(theKey.startsWith("journals/tse")){
            mp.get("journals/tse").add(pb);
        }else if(theKey.startsWith("journals/ase")){
            mp.get("journals/ase").add(pb);
        }else if(theKey.startsWith("journals/ese")){
            mp.get("journals/ese").add(pb);
        }else if(theKey.startsWith("journals/tsc")){
            mp.get("journals/tsc").add(pb);
        }else if(theKey.startsWith("journals/infsof")){
            mp.get("journals/infsof").add(pb);
        }else if(theKey.startsWith("journals/jfp")){
            mp.get("journals/jfp").add(pb);
        }else if(theKey.startsWith("journals/smr")){
            mp.get("journals/smr").add(pb);
        }else if(theKey.startsWith("journals/jss")){
            mp.get("journals/jss").add(pb);
        }else if(theKey.startsWith("journals/re")){
            mp.get("journals/re").add(pb);
        }else if(theKey.startsWith("journals/scp")){
            mp.get("journals/scp").add(pb);
        }else if(theKey.startsWith("journals/sosym")){
            mp.get("journals/sosym").add(pb);
        }else if(theKey.startsWith("journals/stvr")){
            mp.get("journals/stvr").add(pb);
        }else if(theKey.startsWith("journals/spe")){
            mp.get("journals/spe").add(pb);
        }else if(theKey.startsWith("journals/cl")){
            mp.get("journals/cl").add(pb);
        }else if(theKey.startsWith("journals/ijseke")){
            mp.get("journals/ijseke").add(pb);
        }else if(theKey.startsWith("journals/sttt")){
            mp.get("journals/sttt").add(pb);
        }else if(theKey.startsWith("journals/jlp")){
            mp.get("journals/jlp").add(pb);
        }else if(theKey.startsWith("journals/jwe")){
            mp.get("journals/jwe").add(pb);
        }else if(theKey.startsWith("journals/soca")){
            mp.get("journals/soca").add(pb);
        }else if(theKey.startsWith("journals/sqj")){
            mp.get("journals/sqj").add(pb);
        }else if(theKey.startsWith("journals/tplp")){
            mp.get("journals/tplp").add(pb);
        }else if(theKey.startsWith("conf/pldi")){
            mp.get("conf/pldi").add(pb);
        }else if(theKey.startsWith("conf/popl")){
            mp.get("conf/popl").add(pb);
        }else if(theKey.startsWith("conf/sigsoft")){
            mp.get("conf/sigsoft").add(pb);
        }else if(theKey.startsWith("conf/sosp")){
            mp.get("conf/sosp").add(pb);
        }else if(theKey.startsWith("conf/oopsla")){
            mp.get("conf/oopsla").add(pb);
        }else if(theKey.startsWith("conf/kbse")){
            mp.get("conf/kbse").add(pb);
        }else if(theKey.startsWith("conf/icse")){
            mp.get("conf/icse").add(pb);
        }else if(theKey.startsWith("conf/issta")){
            mp.get("conf/issta").add(pb);
        }else if(theKey.startsWith("conf/osdi")){
            mp.get("conf/osdi").add(pb);
        }else if(theKey.startsWith("conf/ecoop")){
            mp.get("conf/ecoop").add(pb);
        }else if(theKey.startsWith("conf/etaps")){
            mp.get("conf/etaps").add(pb);
        }else if(theKey.startsWith("conf/iwpc")){
            mp.get("conf/iwpc").add(pb);
        }else if(theKey.startsWith("conf/re")){
            mp.get("conf/re").add(pb);
        }else if(theKey.startsWith("conf/caise")){
            mp.get("conf/caise").add(pb);
        }else if(theKey.startsWith("conf/icfp")){
            mp.get("conf/icfp").add(pb);
        }else if(theKey.startsWith("conf/lctrts")){
            mp.get("conf/lctrts").add(pb);
        }else if(theKey.startsWith("conf/models")){
            mp.get("conf/models").add(pb);
        }else if(theKey.startsWith("conf/cp")){
            mp.get("conf/cp").add(pb);
        }else if(theKey.startsWith("conf/icsoc")){
            mp.get("conf/icsoc").add(pb);
        }else if(theKey.startsWith("conf/wcre")){
            mp.get("conf/wcre").add(pb);
        }else if(theKey.startsWith("conf/icsm")){
            mp.get("conf/icsm").add(pb);
        }else if(theKey.startsWith("conf/vmcai")){
            mp.get("conf/vmcai").add(pb);
        }else if(theKey.startsWith("conf/icws")){
            mp.get("conf/icws").add(pb);
        }else if(theKey.startsWith("conf/middleware")){
            mp.get("conf/middleware").add(pb);
        }else if(theKey.startsWith("conf/sas")){
            mp.get("conf/sas").add(pb);
        }else if(theKey.startsWith("conf/esem")){
            mp.get("conf/esem").add(pb);
        }else if(theKey.startsWith("conf/fm")){
            mp.get("conf/fm").add(pb);
        }else if(theKey.startsWith("conf/issre")){
            mp.get("conf/issre").add(pb);
        }else if(theKey.startsWith("conf/hotos")){
            mp.get("conf/hotos").add(pb);
        }else if(theKey.startsWith("conf/pepm")){
            mp.get("conf/pepm").add(pb);
        }else if(theKey.startsWith("conf/paste")){
            mp.get("conf/paste").add(pb);
        }else if(theKey.startsWith("conf/aplas")){
            mp.get("conf/aplas").add(pb);
        }else if(theKey.startsWith("conf/apsec")){
            mp.get("conf/apsec").add(pb);
        }else if(theKey.startsWith("conf/ease")){
            mp.get("conf/ease").add(pb);
        }else if(theKey.startsWith("conf/iceccs")){
            mp.get("conf/iceccs").add(pb);
        }else if(theKey.startsWith("conf/icst")){
            mp.get("conf/icst").add(pb);
        }else if(theKey.startsWith("conf/ispass")){
            mp.get("conf/ispass").add(pb);
        }else if(theKey.startsWith("conf/scam")){
            mp.get("conf/scam").add(pb);
        }else if(theKey.startsWith("conf/compsac")){
            mp.get("conf/compsac").add(pb);
        }else if(theKey.startsWith("conf/icfem")){
            mp.get("conf/icfem").add(pb);
        }else if(theKey.startsWith("conf/tools")){
            mp.get("conf/tools").add(pb);
        }else if(theKey.startsWith("conf/IEEEscc")){
            mp.get("conf/IEEEscc").add(pb);
        }else if(theKey.startsWith("conf/ispw")){
            mp.get("conf/ispw").add(pb);
        }else if(theKey.startsWith("conf/seke")){
            mp.get("conf/seke").add(pb);
        }else if(theKey.startsWith("conf/icsr")){
            mp.get("conf/icsr").add(pb);
        }else if(theKey.startsWith("conf/icwe")){
            mp.get("conf/icwe").add(pb);
        }else if(theKey.startsWith("conf/spin")){
            mp.get("conf/spin").add(pb);
        }else if(theKey.startsWith("conf/atva")){
            mp.get("conf/atva").add(pb);
        }else if(theKey.startsWith("conf/lopstr")){
            mp.get("conf/lopstr").add(pb);
        }else if(theKey.startsWith("conf/tase")){
            mp.get("conf/tase").add(pb);
        }else if(theKey.startsWith("conf/msr")){
            mp.get("conf/msr").add(pb);
        }else if(theKey.startsWith("conf/refsq")){
            mp.get("conf/refsq").add(pb);
        }else if(theKey.startsWith("conf/wicsa")){
            mp.get("conf/wicsa").add(pb);
        }else if(theKey.startsWith("journals/tods")){
            mp.get("journals/tods").add(pb);
        }else if(theKey.startsWith("journals/tois")){
            mp.get("journals/tois").add(pb);
        }else if(theKey.startsWith("journals/tkde")){
            mp.get("journals/tkde").add(pb);
        }else if(theKey.startsWith("journals/vldb")){
            mp.get("journals/vldb").add(pb);
        }else if(theKey.startsWith("journals/tkdd")){
            mp.get("journals/tkdd").add(pb);
        }else if(theKey.startsWith("journals/tweb")){
            mp.get("journals/tweb").add(pb);
        }else if(theKey.startsWith("journals/aei")){
            mp.get("journals/aei").add(pb);
        }else if(theKey.startsWith("journals/dke")){
            mp.get("journals/dke").add(pb);
        }else if(theKey.startsWith("journals/datamine")){
            mp.get("journals/datamine").add(pb);
        }else if(theKey.startsWith("journals/ejis")){
            mp.get("journals/ejis").add(pb);
        }else if(theKey.startsWith("journals/geoinformatica")){
            mp.get("journals/geoinformatica").add(pb);
        }else if(theKey.startsWith("journals/ipm")){
            mp.get("journals/ipm").add(pb);
        }else if(theKey.startsWith("journals/isci")){
            mp.get("journals/isci").add(pb);
        }else if(theKey.startsWith("journals/is")){
            mp.get("journals/is").add(pb);
        }else if(theKey.startsWith("journals/jasis")){
            mp.get("journals/jasis").add(pb);
        }else if(theKey.startsWith("journals/ws")){
            mp.get("journals/ws").add(pb);
        }else if(theKey.startsWith("journals/kais")){
            mp.get("journals/kais").add(pb);
        }else if(theKey.startsWith("journals/dpd")){
            mp.get("journals/dpd").add(pb);
        }else if(theKey.startsWith("journals/iam")){
            mp.get("journals/iam").add(pb);
        }else if(theKey.startsWith("journals/ipl")){
            mp.get("journals/ipl").add(pb);
        }else if(theKey.startsWith("journals/ir")){
            mp.get("journals/ir").add(pb);
        }else if(theKey.startsWith("journals/ijcis")){
            mp.get("journals/ijcis").add(pb);
        }else if(theKey.startsWith("journals/gis")){
            mp.get("journals/gis").add(pb);
        }else if(theKey.startsWith("journals/ijis")){
            mp.get("journals/ijis").add(pb);
        }else if(theKey.startsWith("journals/ijkm")){
            mp.get("journals/ijkm").add(pb);
        }else if(theKey.startsWith("journals/ijswis")){
            mp.get("journals/ijswis").add(pb);
        }else if(theKey.startsWith("journals/jcis")){
            mp.get("journals/jcis").add(pb);
        }else if(theKey.startsWith("journals/jdm")){
            mp.get("journals/jdm").add(pb);
        }else if(theKey.startsWith("journals/jiis")){
            mp.get("journals/jiis").add(pb);
        }else if(theKey.startsWith("journals/jsis")){
            mp.get("journals/jsis").add(pb);
        }else if(theKey.startsWith("conf/sigmod")){
            mp.get("conf/sigmod").add(pb);
        }else if(theKey.startsWith("conf/kdd")){
            mp.get("conf/kdd").add(pb);
        }else if(theKey.startsWith("conf/icde")){
            mp.get("conf/icde").add(pb);
        }else if(theKey.startsWith("conf/sigir")){
            mp.get("conf/sigir").add(pb);
        }else if(theKey.startsWith("conf/vldb")){
            mp.get("conf/vldb").add(pb);
        }else if(theKey.startsWith("conf/cikm")){
            mp.get("conf/cikm").add(pb);
        }else if(theKey.startsWith("conf/wsdm")){
            mp.get("conf/wsdm").add(pb);
        }else if(theKey.startsWith("conf/pods")){
            mp.get("conf/pods").add(pb);
        }else if(theKey.startsWith("conf/dasfaa")){
            mp.get("conf/dasfaa").add(pb);
        }else if(theKey.startsWith("conf/ecml")){
            mp.get("conf/ecml").add(pb);
        }else if(theKey.startsWith("conf/pkdd")){
            mp.get("conf/pkdd").add(pb);
        }else if(theKey.startsWith("conf/semweb")){
            mp.get("conf/semweb").add(pb);
        }else if(theKey.startsWith("conf/icdm")){
            mp.get("conf/icdm").add(pb);
        }else if(theKey.startsWith("conf/icdt")){
            mp.get("conf/icdt").add(pb);
        }else if(theKey.startsWith("conf/edbt")){
            mp.get("conf/edbt").add(pb);
        }else if(theKey.startsWith("conf/cidr")){
            mp.get("conf/cidr").add(pb);
        }else if(theKey.startsWith("conf/sdm")){
            mp.get("conf/sdm").add(pb);
        }else if(theKey.startsWith("conf/apweb")){
            mp.get("conf/apweb").add(pb);
        }else if(theKey.startsWith("conf/dexa")){
            mp.get("conf/dexa").add(pb);
        }else if(theKey.startsWith("conf/ecir")){
            mp.get("conf/ecir").add(pb);
        }else if(theKey.startsWith("conf/esws")){
            mp.get("conf/esws").add(pb);
        }else if(theKey.startsWith("conf/webdb")){
            mp.get("conf/webdb").add(pb);
        }else if(theKey.startsWith("conf/er")){
            mp.get("conf/er").add(pb);
        }else if(theKey.startsWith("conf/mdm")){
            mp.get("conf/mdm").add(pb);
        }else if(theKey.startsWith("conf/ssdbm")){
            mp.get("conf/ssdbm").add(pb);
        }else if(theKey.startsWith("conf/waim")){
            mp.get("conf/waim").add(pb);
        }else if(theKey.startsWith("conf/ssd")){
            mp.get("conf/ssd").add(pb);
        }else if(theKey.startsWith("conf/pakdd")){
            mp.get("conf/pakdd").add(pb);
        }else if(theKey.startsWith("conf/wise")){
            mp.get("conf/wise").add(pb);
        }else if(theKey.startsWith("journals/tit")){
            mp.get("journals/tit").add(pb);
        }else if(theKey.startsWith("journals/iandc")){
            mp.get("journals/iandc").add(pb);
        }else if(theKey.startsWith("journals/siamcomp")){
            mp.get("journals/siamcomp").add(pb);
        }else if(theKey.startsWith("journals/talg")){
            mp.get("journals/talg").add(pb);
        }else if(theKey.startsWith("journals/tocl")){
            mp.get("journals/tocl").add(pb);
        }else if(theKey.startsWith("journals/toms")){
            mp.get("journals/toms").add(pb);
        }else if(theKey.startsWith("journals/algorithmica")){
            mp.get("journals/algorithmica").add(pb);
        }else if(theKey.startsWith("journals/cc")){
            mp.get("journals/cc").add(pb);
        }else if(theKey.startsWith("journals/fac")){
            mp.get("journals/fac").add(pb);
        }else if(theKey.startsWith("journals/fmsd")){
            mp.get("journals/fmsd").add(pb);
        }else if(theKey.startsWith("journals/informs")){
            mp.get("journals/informs").add(pb);
        }else if(theKey.startsWith("journals/jcss")){
            mp.get("journals/jcss").add(pb);
        }else if(theKey.startsWith("journals/jgo")){
            mp.get("journals/jgo").add(pb);
        }else if(theKey.startsWith("journals/jsc")){
            mp.get("journals/jsc").add(pb);
        }else if(theKey.startsWith("journals/mscs")){
            mp.get("journals/mscs").add(pb);
        }else if(theKey.startsWith("journals/tcs")){
            mp.get("journals/tcs").add(pb);
        }else if(theKey.startsWith("journals/acta")){
            mp.get("journals/acta").add(pb);
        }else if(theKey.startsWith("journals/apal")){
            mp.get("journals/apal").add(pb);
        }else if(theKey.startsWith("journals/dam")){
            mp.get("journals/dam").add(pb);
        }else if(theKey.startsWith("journals/fuin")){
            mp.get("journals/fuin").add(pb);
        }else if(theKey.startsWith("journals/lisp")){
            mp.get("journals/lisp").add(pb);
        }else if(theKey.startsWith("journals/ipl")){
            mp.get("journals/ipl").add(pb);
        }else if(theKey.startsWith("journals/jc")){
            mp.get("journals/jc").add(pb);
        }else if(theKey.startsWith("journals/logcom")){
            mp.get("journals/logcom").add(pb);
        }else if(theKey.startsWith("journals/jsyml")){
            mp.get("journals/jsyml").add(pb);
        }else if(theKey.startsWith("journals/lmcs")){
            mp.get("journals/lmcs").add(pb);
        }else if(theKey.startsWith("journals/siamdm")){
            mp.get("journals/siamdm").add(pb);
        }else if(theKey.startsWith("journals/mst")){
            mp.get("journals/mst").add(pb);
        }else if(theKey.startsWith("conf/stoc")){
            mp.get("conf/stoc").add(pb);
        }else if(theKey.startsWith("conf/soda")){
            mp.get("conf/soda").add(pb);
        }else if(theKey.startsWith("conf/cav")){
            mp.get("conf/cav").add(pb);
        }else if(theKey.startsWith("conf/focs")){
            mp.get("conf/focs").add(pb);
        }else if(theKey.startsWith("conf/lics")){
            mp.get("conf/lics").add(pb);
        }else if(theKey.startsWith("conf/compgeom")){
            mp.get("conf/compgeom").add(pb);
        }else if(theKey.startsWith("conf/esa")){
            mp.get("conf/esa").add(pb);
        }else if(theKey.startsWith("conf/coco")){
            mp.get("conf/coco").add(pb);
        }else if(theKey.startsWith("conf/icalp")){
            mp.get("conf/icalp").add(pb);
        }else if(theKey.startsWith("conf/cade")){
            mp.get("conf/cade").add(pb);
        }else if(theKey.startsWith("conf/concur")){
            mp.get("conf/concur").add(pb);
        }else if(theKey.startsWith("conf/hybrid")){
            mp.get("conf/hybrid").add(pb);
        }else if(theKey.startsWith("conf/sat")){
            mp.get("conf/sat").add(pb);
        }else if(theKey.startsWith("conf/csl")){
            mp.get("conf/csl").add(pb);
        }else if(theKey.startsWith("conf/fmcad")){
            mp.get("conf/fmcad").add(pb);
        }else if(theKey.startsWith("conf/fsttcs")){
            mp.get("conf/fsttcs").add(pb);
        }else if(theKey.startsWith("conf/ictac")){
            mp.get("conf/ictac").add(pb);
        }else if(theKey.startsWith("conf/ipco")){
            mp.get("conf/ipco").add(pb);
        }else if(theKey.startsWith("conf/rta")){
            mp.get("conf/rta").add(pb);
        }else if(theKey.startsWith("conf/isaac")){
            mp.get("conf/isaac").add(pb);
        }else if(theKey.startsWith("conf/mfcs")){
            mp.get("conf/mfcs").add(pb);
        }else if(theKey.startsWith("conf/stacs")){
            mp.get("conf/stacs").add(pb);
        }else if(theKey.startsWith("journals/tog")){
            mp.get("journals/tog").add(pb);
        }else if(theKey.startsWith("journals/tip")){
            mp.get("journals/tip").add(pb);
        }else if(theKey.startsWith("journals/tvcg")){
            mp.get("journals/tvcg").add(pb);
        }else if(theKey.startsWith("journals/tomccap")){
            mp.get("journals/tomccap").add(pb);
        }else if(theKey.startsWith("journals/cagd")){
            mp.get("journals/cagd").add(pb);
        }else if(theKey.startsWith("journals/cgf")){
            mp.get("journals/cgf").add(pb);
        }else if(theKey.startsWith("journals/cad")){
            mp.get("journals/cad").add(pb);
        }else if(theKey.startsWith("journals/cvgip")){
            mp.get("journals/cvgip").add(pb);
        }else if(theKey.startsWith("journals/tcsv")){
            mp.get("journals/tcsv").add(pb);
        }else if(theKey.startsWith("journals/tmm")){
            mp.get("journals/tmm").add(pb);
        }else if(theKey.startsWith("journals/siamis")){
            mp.get("journals/siamis").add(pb);
        }else if(theKey.startsWith("journals/speech")){
            mp.get("journals/speech").add(pb);
        }else if(theKey.startsWith("journals/comgeo")){
            mp.get("journals/comgeo").add(pb);
        }else if(theKey.startsWith("journals/cg")){
            mp.get("journals/cg").add(pb);
        }else if(theKey.startsWith("journals/dcg")){
            mp.get("journals/dcg").add(pb);
        }else if(theKey.startsWith("journals/spl")){
            mp.get("journals/spl").add(pb);
        }else if(theKey.startsWith("journals/iet-ipr")){
            mp.get("journals/iet-ipr").add(pb);
        }else if(theKey.startsWith("journals/jvcir")){
            mp.get("journals/jvcir").add(pb);
        }else if(theKey.startsWith("journals/mms")){
            mp.get("journals/mms").add(pb);
        }else if(theKey.startsWith("journals/mta")){
            mp.get("journals/mta").add(pb);
        }else if(theKey.startsWith("journals/sigpro")){
            mp.get("journals/sigpro").add(pb);
        }else if(theKey.startsWith("journals/spic")){
            mp.get("journals/spic").add(pb);
        }else if(theKey.startsWith("journals/vc")){
            mp.get("journals/vc").add(pb);
        }else if(theKey.startsWith("conf/mm")){
            mp.get("conf/mm").add(pb);
        }else if(theKey.startsWith("conf/siggraph")){
            mp.get("conf/siggraph").add(pb);
        }else if(theKey.startsWith("conf/vr")){
            mp.get("conf/vr").add(pb);
        }else if(theKey.startsWith("conf/visualization")){
            mp.get("conf/visualization").add(pb);
        }else if(theKey.startsWith("conf/mir")){
            mp.get("conf/mir").add(pb);
        }else if(theKey.startsWith("conf/si3d")){
            mp.get("conf/si3d").add(pb);
        }else if(theKey.startsWith("conf/sca")){
            mp.get("conf/sca").add(pb);
        }else if(theKey.startsWith("conf/dcc")){
            mp.get("conf/dcc").add(pb);
        }else if(theKey.startsWith("conf/eurographics")){
            mp.get("conf/eurographics").add(pb);
        }else if(theKey.startsWith("conf/vissym")){
            mp.get("conf/vissym").add(pb);
        }else if(theKey.startsWith("conf/sgp")){
            mp.get("conf/sgp").add(pb);
        }else if(theKey.startsWith("conf/rt")){
            mp.get("conf/rt").add(pb);
        }else if(theKey.startsWith("conf/icassp")){
            mp.get("conf/icassp").add(pb);
        }else if(theKey.startsWith("conf/icmcs")){
            mp.get("conf/icmcs").add(pb);
        }else if(theKey.startsWith("conf/ismar")){
            mp.get("conf/ismar").add(pb);
        }else if(theKey.startsWith("conf/pg")){
            mp.get("conf/pg").add(pb);
        }else if(theKey.startsWith("conf/sma")){
            mp.get("conf/sma").add(pb);
        }else if(theKey.startsWith("conf/vrst")){
            mp.get("conf/vrst").add(pb);
        }else if(theKey.startsWith("conf/ca")){
            mp.get("conf/ca").add(pb);
        }else if(theKey.startsWith("conf/cgi")){
            mp.get("conf/cgi").add(pb);
        }else if(theKey.startsWith("conf/interspeech")){
            mp.get("conf/interspeech").add(pb);
        }else if(theKey.startsWith("conf/gmp")){
            mp.get("conf/gmp").add(pb);
        }else if(theKey.startsWith("conf/apvis")){
            mp.get("conf/apvis").add(pb);
        }else if(theKey.startsWith("conf/icip")){
            mp.get("conf/icip").add(pb);
        }else if(theKey.startsWith("conf/mmm")){
            mp.get("conf/mmm").add(pb);
        }else if(theKey.startsWith("conf/pcm")){
            mp.get("conf/pcm").add(pb);
        }else if(theKey.startsWith("conf/smi")){
            mp.get("conf/smi").add(pb);
        }else if(theKey.startsWith("journals/ai")){
            mp.get("journals/ai").add(pb);
        }else if(theKey.startsWith("journals/pami")){
            mp.get("journals/pami").add(pb);
        }else if(theKey.startsWith("journals/ijcv")){
            mp.get("journals/ijcv").add(pb);
        }else if(theKey.startsWith("journals/jmlr")){
            mp.get("journals/jmlr").add(pb);
        }else if(theKey.startsWith("journals/tap")){
            mp.get("journals/tap").add(pb);
        }else if(theKey.startsWith("journals/tslp")){
            mp.get("journals/tslp").add(pb);
        }else if(theKey.startsWith("journals/aamas")){
            mp.get("journals/aamas").add(pb);
        }else if(theKey.startsWith("journals/coling")){
            mp.get("journals/coling").add(pb);
        }else if(theKey.startsWith("journals/cviu")){
            mp.get("journals/cviu").add(pb);
        }else if(theKey.startsWith("journals/dke")){
            mp.get("journals/dke").add(pb);
        }else if(theKey.startsWith("journals/ec")){
            mp.get("journals/ec").add(pb);
        }else if(theKey.startsWith("journals/taffco")){
            mp.get("journals/taffco").add(pb);
        }else if(theKey.startsWith("journals/taslp")){
            mp.get("journals/taslp").add(pb);
        }else if(theKey.startsWith("journals/tcyb")){
            mp.get("journals/tcyb").add(pb);
        }else if(theKey.startsWith("journals/tec")){
            mp.get("journals/tec").add(pb);
        }else if(theKey.startsWith("journals/tfs")){
            mp.get("journals/tfs").add(pb);
        }else if(theKey.startsWith("journals/tnn")){
            mp.get("journals/tnn").add(pb);
        }else if(theKey.startsWith("journals/ijar")){
            mp.get("journals/ijar").add(pb);
        }else if(theKey.startsWith("journals/jair")){
            mp.get("journals/jair").add(pb);
        }else if(theKey.startsWith("journals/jar")){
            mp.get("journals/jar").add(pb);
        }else if(theKey.startsWith("journals/ml")){
            mp.get("journals/ml").add(pb);
        }else if(theKey.startsWith("journals/neco")){
            mp.get("journals/neco").add(pb);
        }else if(theKey.startsWith("journals/nn")){
            mp.get("journals/nn").add(pb);
        }else if(theKey.startsWith("conf/par")){
            mp.get("conf/par").add(pb);
        }else if(theKey.startsWith("journals/talip")){
            mp.get("journals/talip").add(pb);
        }else if(theKey.startsWith("journals/apin")){
            mp.get("journals/apin").add(pb);
        }else if(theKey.startsWith("journals/artmed")){
            mp.get("journals/artmed").add(pb);
        }else if(theKey.startsWith("journals/alife")){
            mp.get("journals/alife").add(pb);
        }else if(theKey.startsWith("journals/ci")){
            mp.get("journals/ci").add(pb);
        }else if(theKey.startsWith("journals/csl")){
            mp.get("journals/csl").add(pb);
        }else if(theKey.startsWith("journals/connection")){
            mp.get("journals/connection").add(pb);
        }else if(theKey.startsWith("journals/dss")){
            mp.get("journals/dss").add(pb);
        }else if(theKey.startsWith("journals/eaai")){
            mp.get("journals/eaai").add(pb);
        }else if(theKey.startsWith("journals/es")){
            mp.get("journals/es").add(pb);
        }else if(theKey.startsWith("journals/eswa")){
            mp.get("journals/eswa").add(pb);
        }else if(theKey.startsWith("journals/fss")){
            mp.get("journals/fss").add(pb);
        }else if(theKey.startsWith("journals/tciaig")){
            mp.get("journals/tciaig").add(pb);
        }else if(theKey.startsWith("journals/ivc")){
            mp.get("journals/ivc").add(pb);
        }else if(theKey.startsWith("journals/ida")){
            mp.get("journals/ida").add(pb);
        }else if(theKey.startsWith("journals/ijcia")){
            mp.get("journals/ijcia").add(pb);
        }else if(theKey.startsWith("journals/ijis")){
            mp.get("journals/ijis").add(pb);
        }else if(theKey.startsWith("journals/ijns")){
            mp.get("journals/ijns").add(pb);
        }else if(theKey.startsWith("journals/ijprai")){
            mp.get("journals/ijprai").add(pb);
        }else if(theKey.startsWith("journals/ijdar")){
            mp.get("journals/ijdar").add(pb);
        }else if(theKey.startsWith("journals/jetai")){
            mp.get("journals/jetai").add(pb);
        }else if(theKey.startsWith("journals/kbs")){
            mp.get("journals/kbs").add(pb);
        }else if(theKey.startsWith("journals/mt")){
            mp.get("journals/mt").add(pb);
        }else if(theKey.startsWith("journals/mva")){
            mp.get("journals/mva").add(pb);
        }else if(theKey.startsWith("journals/nc")){
            mp.get("journals/nc").add(pb);
        }else if(theKey.startsWith("journals/nle")){
            mp.get("journals/nle").add(pb);
        }else if(theKey.startsWith("journals/nca")){
            mp.get("journals/nca").add(pb);
        }else if(theKey.startsWith("journals/npl")){
            mp.get("journals/npl").add(pb);
        }else if(theKey.startsWith("journals/ijon")){
            mp.get("journals/ijon").add(pb);
        }else if(theKey.startsWith("journals/paa")){
            mp.get("journals/paa").add(pb);
        }else if(theKey.startsWith("journals/prl")){
            mp.get("journals/prl").add(pb);
        }else if(theKey.startsWith("journals/soco")){
            mp.get("journals/soco").add(pb);
        }else if(theKey.startsWith("journals/wias")){
            mp.get("journals/wias").add(pb);
        }else if(theKey.startsWith("conf/aaai")){
            mp.get("conf/aaai").add(pb);
        }else if(theKey.startsWith("conf/nips")){
            mp.get("conf/nips").add(pb);
        }else if(theKey.startsWith("conf/acl")){
            mp.get("conf/acl").add(pb);
        }else if(theKey.startsWith("conf/cvpr")){
            mp.get("conf/cvpr").add(pb);
        }else if(theKey.startsWith("conf/iccv")){
            mp.get("conf/iccv").add(pb);
        }else if(theKey.startsWith("conf/icml")){
            mp.get("conf/icml").add(pb);
        }else if(theKey.startsWith("conf/ijcai")){
            mp.get("conf/ijcai").add(pb);
        }else if(theKey.startsWith("conf/colt")){
            mp.get("conf/colt").add(pb);
        }else if(theKey.startsWith("conf/emnlp")){
            mp.get("conf/emnlp").add(pb);
        }else if(theKey.startsWith("conf/ecai")){
            mp.get("conf/ecai").add(pb);
        }else if(theKey.startsWith("conf/eccv")){
            mp.get("conf/eccv").add(pb);
        }else if(theKey.startsWith("conf/icra")){
            mp.get("conf/icra").add(pb);
        }else if(theKey.startsWith("conf/aips")){
            mp.get("conf/aips").add(pb);
        }else if(theKey.startsWith("conf/iccbr")){
            mp.get("conf/iccbr").add(pb);
        }else if(theKey.startsWith("conf/coling")){
            mp.get("conf/coling").add(pb);
        }else if(theKey.startsWith("conf/kr")){
            mp.get("conf/kr").add(pb);
        }else if(theKey.startsWith("conf/uai")){
            mp.get("conf/uai").add(pb);
        }else if(theKey.startsWith("conf/atal")){
            mp.get("conf/atal").add(pb);
        }else if(theKey.startsWith("conf/ppsn")){
            mp.get("conf/ppsn").add(pb);
        }else if(theKey.startsWith("conf/aistats")){
            mp.get("conf/aistats").add(pb);
        }else if(theKey.startsWith("conf/accv")){
            mp.get("conf/accv").add(pb);
        }else if(theKey.startsWith("conf/acml")){
            mp.get("conf/acml").add(pb);
        }else if(theKey.startsWith("conf/bmvc")){
            mp.get("conf/bmvc").add(pb);
        }else if(theKey.startsWith("conf/conll")){
            mp.get("conf/conll").add(pb);
        }else if(theKey.startsWith("conf/gecco")){
            mp.get("conf/gecco").add(pb);
        }else if(theKey.startsWith("conf/ictai")){
            mp.get("conf/ictai").add(pb);
        }else if(theKey.startsWith("conf/iros")){
            mp.get("conf/iros").add(pb);
        }else if(theKey.startsWith("conf/alt")){
            mp.get("conf/alt").add(pb);
        }else if(theKey.startsWith("conf/icann")){
            mp.get("conf/icann").add(pb);
        }else if(theKey.startsWith("conf/fgr")){
            mp.get("conf/fgr").add(pb);
        }else if(theKey.startsWith("conf/icdar")){
            mp.get("conf/icdar").add(pb);
        }else if(theKey.startsWith("conf/ilp")){
            mp.get("conf/ilp").add(pb);
        }else if(theKey.startsWith("conf/ksem")){
            mp.get("conf/ksem").add(pb);
        }else if(theKey.startsWith("conf/iconip")){
            mp.get("conf/iconip").add(pb);
        }else if(theKey.startsWith("conf/icpr")){
            mp.get("conf/icpr").add(pb);
        }else if(theKey.startsWith("conf/icb")){
            mp.get("conf/icb").add(pb);
        }else if(theKey.startsWith("conf/ijcnn")){
            mp.get("conf/ijcnn").add(pb);
        }else if(theKey.startsWith("conf/pricai")){
            mp.get("conf/pricai").add(pb);
        }else if(theKey.startsWith("conf/naacl")){
            mp.get("conf/naacl").add(pb);
        }else if(theKey.startsWith("journals/tochi")){
            mp.get("journals/tochi").add(pb);
        }else if(theKey.startsWith("journals/ijmms")){
            mp.get("journals/ijmms").add(pb);
        }else if(theKey.startsWith("journals/cscw")){
            mp.get("journals/cscw").add(pb);
        }else if(theKey.startsWith("journals/hhci")){
            mp.get("journals/hhci").add(pb);
        }else if(theKey.startsWith("journals/thms")){
            mp.get("journals/thms").add(pb);
        }else if(theKey.startsWith("journals/iwc")){
            mp.get("journals/iwc").add(pb);
        }else if(theKey.startsWith("journals/ijhci")){
            mp.get("journals/ijhci").add(pb);
        }else if(theKey.startsWith("journals/umuai")){
            mp.get("journals/umuai").add(pb);
        }else if(theKey.startsWith("journals/behaviourIT")){
            mp.get("journals/behaviourIT").add(pb);
        }else if(theKey.startsWith("journals/puc")){
            mp.get("journals/puc").add(pb);
        }else if(theKey.startsWith("journals/percom")){
            mp.get("journals/percom").add(pb);
        }else if(theKey.startsWith("conf/cscw")){
            mp.get("conf/cscw").add(pb);
        }else if(theKey.startsWith("conf/chi")){
            mp.get("conf/chi").add(pb);
        }else if(theKey.startsWith("conf/huc")){
            mp.get("conf/huc").add(pb);
        }else if(theKey.startsWith("conf/group")){
            mp.get("conf/group").add(pb);
        }else if(theKey.startsWith("conf/iui")){
            mp.get("conf/iui").add(pb);
        }else if(theKey.startsWith("conf/tabletop")){
            mp.get("conf/tabletop").add(pb);
        }else if(theKey.startsWith("conf/uist")){
            mp.get("conf/uist").add(pb);
        }else if(theKey.startsWith("conf/ecscw")){
            mp.get("conf/ecscw").add(pb);
        }else if(theKey.startsWith("conf/percom")){
            mp.get("conf/percom").add(pb);
        }else if(theKey.startsWith("conf/mhci")){
            mp.get("conf/mhci").add(pb);
        }else if(theKey.startsWith("conf/ACMdis")){
            mp.get("conf/ACMdis").add(pb);
        }else if(theKey.startsWith("conf/icmi")){
            mp.get("conf/icmi").add(pb);
        }else if(theKey.startsWith("conf/assets")){
            mp.get("conf/assets").add(pb);
        }else if(theKey.startsWith("conf/graphicsinterface")){
            mp.get("conf/graphicsinterface").add(pb);
        }else if(theKey.startsWith("conf/uic")){
            mp.get("conf/uic").add(pb);
        }else if(theKey.startsWith("conf/haptics")){
            mp.get("conf/haptics").add(pb);
        }else if(theKey.startsWith("conf/interact")){
            mp.get("conf/interact").add(pb);
        }else if(theKey.startsWith("conf/acmidc")){
            mp.get("conf/acmidc").add(pb);
        }else if(theKey.startsWith("conf/cscwd")){
            mp.get("conf/cscwd").add(pb);
        }else if(theKey.startsWith("conf/coopis")){
            mp.get("conf/coopis").add(pb);
        }else if(theKey.startsWith("conf/mobiquitous")){
            mp.get("conf/mobiquitous").add(pb);
        }else if(theKey.startsWith("conf/avi")){
            mp.get("conf/avi").add(pb);
        }
    }


    private static void writefile() throws IOException{
        FileWriter fw=new FileWriter("dblp_needed.csv");
        StringBuilder sb=new StringBuilder();
        Iterator<String> it=mp.keySet().iterator();
        while(it.hasNext()){
            String key=it.next();
            ArrayList<Publication> allpb=mp.get(key);
            for(Publication pb:allpb){
                sb.append(key+",");
                int year=pb.getYear();
                sb.append(Integer.toString(year));
                List<PersonName> allname=pb.getNames();
                for(PersonName name:allname){
                    sb.append(",");
                    sb.append(name.name());
                }
                sb.append("\n");
            }
        }
        fw.write(sb.toString());

        fw.close();
    }
    public static void main(String[] args) throws Exception{
        String xmlfilename="../dblp-2021-09-01.xml";
        String dtdfilename="../dblp.dtd";

        RecordDbInterface dblp;
        try{
            dblp=new RecordDb(xmlfilename, dtdfilename,false);
        }catch (final IOException ex) {
            System.err.println("cannot read dblp XML: " + ex.getMessage());
            return;
        }
        catch (final SAXException ex) {
            System.err.println("cannot parse XML: " + ex.getMessage());
            return;
        }

        System.out.println("read done");

        mp=new HashMap<>();
        mp.put("journals/tocs", new ArrayList<>());
        mp.put("journals/tos", new ArrayList<>());
        mp.put("journals/tcad", new ArrayList<>());
        mp.put("journals/tc", new ArrayList<>());
        mp.put("journals/tpds", new ArrayList<>());
        mp.put("journals/taco", new ArrayList<>());
        mp.put("journals/taas", new ArrayList<>());
        mp.put("journals/todaes", new ArrayList<>());
        mp.put("journals/tecs", new ArrayList<>());
        mp.put("journals/trets", new ArrayList<>());
        mp.put("journals/tvlsi", new ArrayList<>());
        mp.put("journals/jpdc", new ArrayList<>());
        mp.put("journals/jsa", new ArrayList<>());
        mp.put("conf/parco", new ArrayList<>());
        mp.put("journals/jetc", new ArrayList<>());
        mp.put("journals/concurrency", new ArrayList<>());
        mp.put("journals/dc", new ArrayList<>());
        mp.put("journals/fgcs", new ArrayList<>());
        mp.put("journals/integration", new ArrayList<>());
        mp.put("journals/mam", new ArrayList<>());
        mp.put("journals/rts", new ArrayList<>());
        mp.put("journals/tjs", new ArrayList<>());
        mp.put("conf/ppopp", new ArrayList<>());
        mp.put("conf/fast", new ArrayList<>());
        mp.put("conf/hpca", new ArrayList<>());
        mp.put("conf/sc", new ArrayList<>());
        mp.put("conf/asplos", new ArrayList<>());
        mp.put("conf/isca", new ArrayList<>());
        mp.put("conf/usenix", new ArrayList<>());
        mp.put("conf/cloud", new ArrayList<>());
        mp.put("conf/spaa", new ArrayList<>());
        mp.put("conf/podc", new ArrayList<>());
        mp.put("conf/fpga", new ArrayList<>());
        mp.put("conf/cgo", new ArrayList<>());
        mp.put("conf/date", new ArrayList<>());
        mp.put("conf/eurosys", new ArrayList<>());
        mp.put("conf/iccd", new ArrayList<>());
        mp.put("conf/iccad", new ArrayList<>());
        mp.put("conf/icdcs", new ArrayList<>());
        mp.put("conf/codes", new ArrayList<>());
        mp.put("conf/hipeac", new ArrayList<>());
        mp.put("conf/sigmetrics", new ArrayList<>());
        mp.put("conf/IEEEpact", new ArrayList<>());
        mp.put("conf/icpp", new ArrayList<>());
        mp.put("conf/ics", new ArrayList<>());
        mp.put("conf/vee", new ArrayList<>());
        mp.put("conf/ipps", new ArrayList<>());
        mp.put("conf/performance", new ArrayList<>());
        mp.put("conf/hpdc", new ArrayList<>());
        mp.put("conf/itc", new ArrayList<>());
        mp.put("conf/lisa", new ArrayList<>());
        mp.put("conf/mss", new ArrayList<>());
        mp.put("conf/rtas", new ArrayList<>());
        mp.put("conf/cf", new ArrayList<>());
        mp.put("conf/systor", new ArrayList<>());
        mp.put("conf/nocs", new ArrayList<>());
        mp.put("conf/asap", new ArrayList<>());
        mp.put("conf/aspdac", new ArrayList<>());
        mp.put("conf/europar", new ArrayList<>());
        mp.put("conf/ets", new ArrayList<>());
        mp.put("conf/fpl", new ArrayList<>());
        mp.put("conf/fccm", new ArrayList<>());
        mp.put("conf/glvlsi", new ArrayList<>());
        mp.put("conf/ats", new ArrayList<>());
        mp.put("conf/hpcc", new ArrayList<>());
        mp.put("conf/hipc", new ArrayList<>());
        mp.put("conf/mascots", new ArrayList<>());
        mp.put("conf/ispa", new ArrayList<>());
        mp.put("conf/ccgrid", new ArrayList<>());
        mp.put("conf/npc", new ArrayList<>());
        mp.put("conf/ica3pp", new ArrayList<>());
        mp.put("conf/cases", new ArrayList<>());
        mp.put("conf/fpt", new ArrayList<>());
        mp.put("conf/icpads", new ArrayList<>());
        mp.put("conf/iscas", new ArrayList<>());
        mp.put("conf/islped", new ArrayList<>());
        mp.put("conf/ispd", new ArrayList<>());
        mp.put("conf/hoti", new ArrayList<>());
        mp.put("conf/vts", new ArrayList<>());
        mp.put("journals/jsac", new ArrayList<>());
        mp.put("journals/tmc", new ArrayList<>());
        mp.put("journals/ton", new ArrayList<>());
        mp.put("journals/toit", new ArrayList<>());
        mp.put("journals/tomccap", new ArrayList<>());
        mp.put("journals/tosn", new ArrayList<>());
        mp.put("journals/cn", new ArrayList<>());
        mp.put("journals/tcom", new ArrayList<>());
        mp.put("journals/twc", new ArrayList<>());
        mp.put("journals/adhoc", new ArrayList<>());
        mp.put("journals/comcom", new ArrayList<>());
        mp.put("journals/tnsm", new ArrayList<>());
        mp.put("journals/iet-com", new ArrayList<>());
        mp.put("journals/jnca", new ArrayList<>());
        mp.put("journals/monet", new ArrayList<>());
        mp.put("journals/networks", new ArrayList<>());
        mp.put("journals/ppna", new ArrayList<>());
        mp.put("journals/wicomm", new ArrayList<>());
        mp.put("journals/winet", new ArrayList<>());
        mp.put("conf/sigcomm", new ArrayList<>());
        mp.put("conf/mobicom", new ArrayList<>());
        mp.put("conf/infocom", new ArrayList<>());
        mp.put("conf/nsdi", new ArrayList<>());
        mp.put("conf/sensys", new ArrayList<>());
        mp.put("conf/conext", new ArrayList<>());
        mp.put("conf/secon", new ArrayList<>());
        mp.put("conf/ipsn", new ArrayList<>());
        mp.put("conf/mobisys", new ArrayList<>());
        mp.put("conf/icnp", new ArrayList<>());
        mp.put("conf/mobihoc", new ArrayList<>());
        mp.put("conf/nossdav", new ArrayList<>());
        mp.put("conf/iwqos", new ArrayList<>());
        mp.put("conf/imc", new ArrayList<>());
        mp.put("conf/ancs", new ArrayList<>());
        mp.put("conf/apnoms", new ArrayList<>());
        mp.put("conf/forte", new ArrayList<>());
        mp.put("conf/lcn", new ArrayList<>());
        mp.put("conf/globecom", new ArrayList<>());
        mp.put("conf/icc", new ArrayList<>());
        mp.put("conf/icccn", new ArrayList<>());
        mp.put("conf/mass", new ArrayList<>());
        mp.put("conf/p2p", new ArrayList<>());
        mp.put("conf/ipccc", new ArrayList<>());
        mp.put("conf/wowmom", new ArrayList<>());
        mp.put("conf/iscc", new ArrayList<>());
        mp.put("conf/wcnc", new ArrayList<>());
        mp.put("conf/networking", new ArrayList<>());
        mp.put("conf/im", new ArrayList<>());
        mp.put("conf/mswim", new ArrayList<>());
        mp.put("conf/wasa", new ArrayList<>());
        mp.put("conf/hotnets", new ArrayList<>());
        mp.put("journals/tdsc", new ArrayList<>());
        mp.put("journals/tifs", new ArrayList<>());
        mp.put("journals/joc", new ArrayList<>());
        mp.put("journals/compsec", new ArrayList<>());
        mp.put("journals/dcc", new ArrayList<>());
        mp.put("journals/jcs", new ArrayList<>());
        mp.put("journals/ejisec", new ArrayList<>());
        mp.put("journals/iet-ifs", new ArrayList<>());
        mp.put("journals/imcs", new ArrayList<>());
        mp.put("journals/ijics", new ArrayList<>());
        mp.put("journals/ijisp", new ArrayList<>());
        mp.put("journals/scn", new ArrayList<>());
        mp.put("conf/ccs", new ArrayList<>());
        mp.put("conf/eurocrypt", new ArrayList<>());
        mp.put("conf/sp", new ArrayList<>());
        mp.put("conf/crypto", new ArrayList<>());
        mp.put("conf/uss", new ArrayList<>());
        mp.put("conf/acsac", new ArrayList<>());
        mp.put("conf/asiacrypt", new ArrayList<>());
        mp.put("conf/esorics", new ArrayList<>());
        mp.put("conf/fse", new ArrayList<>());
        mp.put("conf/csfw", new ArrayList<>());
        mp.put("conf/srds", new ArrayList<>());
        mp.put("conf/ches", new ArrayList<>());
        mp.put("conf/dsn", new ArrayList<>());
        mp.put("conf/raid", new ArrayList<>());
        mp.put("conf/pkc", new ArrayList<>());
        mp.put("conf/ndss", new ArrayList<>());
        mp.put("conf/tcc", new ArrayList<>());
        mp.put("conf/wisec", new ArrayList<>());
        mp.put("conf/sacmat", new ArrayList<>());
        mp.put("conf/drm", new ArrayList<>());
        mp.put("conf/ih", new ArrayList<>());
        mp.put("conf/acns", new ArrayList<>());
        mp.put("conf/ccs", new ArrayList<>());
        mp.put("conf/acisp", new ArrayList<>());
        mp.put("conf/ctrsa", new ArrayList<>());
        mp.put("conf/dimva", new ArrayList<>());
        mp.put("conf/dfrws", new ArrayList<>());
        mp.put("conf/fc", new ArrayList<>());
        mp.put("conf/trustcom", new ArrayList<>());
        mp.put("conf/sec", new ArrayList<>());
        mp.put("conf/isw", new ArrayList<>());
        mp.put("conf/icdf2c", new ArrayList<>());
        mp.put("conf/icics", new ArrayList<>());
        mp.put("conf/securecomm", new ArrayList<>());
        mp.put("conf/nspw", new ArrayList<>());
        mp.put("conf/pam", new ArrayList<>());
        mp.put("conf/pet", new ArrayList<>());
        mp.put("conf/sacrypt", new ArrayList<>());
        mp.put("conf/soups", new ArrayList<>());
        mp.put("journals/toplas", new ArrayList<>());
        mp.put("journals/tosem", new ArrayList<>());
        mp.put("journals/tse", new ArrayList<>());
        mp.put("journals/ase", new ArrayList<>());
        mp.put("journals/ese", new ArrayList<>());
        mp.put("journals/tsc", new ArrayList<>());
        mp.put("journals/infsof", new ArrayList<>());
        mp.put("journals/jfp", new ArrayList<>());
        mp.put("journals/smr", new ArrayList<>());
        mp.put("journals/jss", new ArrayList<>());
        mp.put("journals/re", new ArrayList<>());
        mp.put("journals/scp", new ArrayList<>());
        mp.put("journals/sosym", new ArrayList<>());
        mp.put("journals/stvr", new ArrayList<>());
        mp.put("journals/spe", new ArrayList<>());
        mp.put("journals/cl", new ArrayList<>());
        mp.put("journals/ijseke", new ArrayList<>());
        mp.put("journals/sttt", new ArrayList<>());
        mp.put("journals/jlp", new ArrayList<>());
        mp.put("journals/jwe", new ArrayList<>());
        mp.put("journals/soca", new ArrayList<>());
        mp.put("journals/sqj", new ArrayList<>());
        mp.put("journals/tplp", new ArrayList<>());
        mp.put("conf/pldi", new ArrayList<>());
        mp.put("conf/popl", new ArrayList<>());
        mp.put("conf/sigsoft", new ArrayList<>());
        mp.put("conf/sosp", new ArrayList<>());
        mp.put("conf/oopsla", new ArrayList<>());
        mp.put("conf/kbse", new ArrayList<>());
        mp.put("conf/icse", new ArrayList<>());
        mp.put("conf/issta", new ArrayList<>());
        mp.put("conf/osdi", new ArrayList<>());
        mp.put("conf/ecoop", new ArrayList<>());
        mp.put("conf/etaps", new ArrayList<>());
        mp.put("conf/iwpc", new ArrayList<>());
        mp.put("conf/re", new ArrayList<>());
        mp.put("conf/caise", new ArrayList<>());
        mp.put("conf/icfp", new ArrayList<>());
        mp.put("conf/lctrts", new ArrayList<>());
        mp.put("conf/models", new ArrayList<>());
        mp.put("conf/cp", new ArrayList<>());
        mp.put("conf/icsoc", new ArrayList<>());
        mp.put("conf/wcre", new ArrayList<>());
        mp.put("conf/icsm", new ArrayList<>());
        mp.put("conf/vmcai", new ArrayList<>());
        mp.put("conf/icws", new ArrayList<>());
        mp.put("conf/middleware", new ArrayList<>());
        mp.put("conf/sas", new ArrayList<>());
        mp.put("conf/esem", new ArrayList<>());
        mp.put("conf/fm", new ArrayList<>());
        mp.put("conf/issre", new ArrayList<>());
        mp.put("conf/hotos", new ArrayList<>());
        mp.put("conf/pepm", new ArrayList<>());
        mp.put("conf/paste", new ArrayList<>());
        mp.put("conf/aplas", new ArrayList<>());
        mp.put("conf/apsec", new ArrayList<>());
        mp.put("conf/ease", new ArrayList<>());
        mp.put("conf/iceccs", new ArrayList<>());
        mp.put("conf/icst", new ArrayList<>());
        mp.put("conf/ispass", new ArrayList<>());
        mp.put("conf/scam", new ArrayList<>());
        mp.put("conf/compsac", new ArrayList<>());
        mp.put("conf/icfem", new ArrayList<>());
        mp.put("conf/tools", new ArrayList<>());
        mp.put("conf/IEEEscc", new ArrayList<>());
        mp.put("conf/ispw", new ArrayList<>());
        mp.put("conf/seke", new ArrayList<>());
        mp.put("conf/icsr", new ArrayList<>());
        mp.put("conf/icwe", new ArrayList<>());
        mp.put("conf/spin", new ArrayList<>());
        mp.put("conf/atva", new ArrayList<>());
        mp.put("conf/lopstr", new ArrayList<>());
        mp.put("conf/tase", new ArrayList<>());
        mp.put("conf/msr", new ArrayList<>());
        mp.put("conf/refsq", new ArrayList<>());
        mp.put("conf/wicsa", new ArrayList<>());
        mp.put("journals/tods", new ArrayList<>());
        mp.put("journals/tois", new ArrayList<>());
        mp.put("journals/tkde", new ArrayList<>());
        mp.put("journals/vldb", new ArrayList<>());
        mp.put("journals/tkdd", new ArrayList<>());
        mp.put("journals/tweb", new ArrayList<>());
        mp.put("journals/aei", new ArrayList<>());
        mp.put("journals/dke", new ArrayList<>());
        mp.put("journals/datamine", new ArrayList<>());
        mp.put("journals/ejis", new ArrayList<>());
        mp.put("journals/geoinformatica", new ArrayList<>());
        mp.put("journals/ipm", new ArrayList<>());
        mp.put("journals/isci", new ArrayList<>());
        mp.put("journals/is", new ArrayList<>());
        mp.put("journals/jasis", new ArrayList<>());
        mp.put("journals/ws", new ArrayList<>());
        mp.put("journals/kais", new ArrayList<>());
        mp.put("journals/dpd", new ArrayList<>());
        mp.put("journals/iam", new ArrayList<>());
        mp.put("journals/ipl", new ArrayList<>());
        mp.put("journals/ir", new ArrayList<>());
        mp.put("journals/ijcis", new ArrayList<>());
        mp.put("journals/gis", new ArrayList<>());
        mp.put("journals/ijis", new ArrayList<>());
        mp.put("journals/ijkm", new ArrayList<>());
        mp.put("journals/ijswis", new ArrayList<>());
        mp.put("journals/jcis", new ArrayList<>());
        mp.put("journals/jdm", new ArrayList<>());
        mp.put("journals/jiis", new ArrayList<>());
        mp.put("journals/jsis", new ArrayList<>());
        mp.put("conf/sigmod", new ArrayList<>());
        mp.put("conf/kdd", new ArrayList<>());
        mp.put("conf/icde", new ArrayList<>());
        mp.put("conf/sigir", new ArrayList<>());
        mp.put("conf/vldb", new ArrayList<>());
        mp.put("conf/cikm", new ArrayList<>());
        mp.put("conf/wsdm", new ArrayList<>());
        mp.put("conf/pods", new ArrayList<>());
        mp.put("conf/dasfaa", new ArrayList<>());
        mp.put("conf/ecml", new ArrayList<>());
        mp.put("conf/pkdd", new ArrayList<>());
        mp.put("conf/semweb", new ArrayList<>());
        mp.put("conf/icdm", new ArrayList<>());
        mp.put("conf/icdt", new ArrayList<>());
        mp.put("conf/edbt", new ArrayList<>());
        mp.put("conf/cidr", new ArrayList<>());
        mp.put("conf/sdm", new ArrayList<>());
        mp.put("conf/apweb", new ArrayList<>());
        mp.put("conf/dexa", new ArrayList<>());
        mp.put("conf/ecir", new ArrayList<>());
        mp.put("conf/esws", new ArrayList<>());
        mp.put("conf/webdb", new ArrayList<>());
        mp.put("conf/er", new ArrayList<>());
        mp.put("conf/mdm", new ArrayList<>());
        mp.put("conf/ssdbm", new ArrayList<>());
        mp.put("conf/waim", new ArrayList<>());
        mp.put("conf/ssd", new ArrayList<>());
        mp.put("conf/pakdd", new ArrayList<>());
        mp.put("conf/wise", new ArrayList<>());
        mp.put("journals/tit", new ArrayList<>());
        mp.put("journals/iandc", new ArrayList<>());
        mp.put("journals/siamcomp", new ArrayList<>());
        mp.put("journals/talg", new ArrayList<>());
        mp.put("journals/tocl", new ArrayList<>());
        mp.put("journals/toms", new ArrayList<>());
        mp.put("journals/algorithmica", new ArrayList<>());
        mp.put("journals/cc", new ArrayList<>());
        mp.put("journals/fac", new ArrayList<>());
        mp.put("journals/fmsd", new ArrayList<>());
        mp.put("journals/informs", new ArrayList<>());
        mp.put("journals/jcss", new ArrayList<>());
        mp.put("journals/jgo", new ArrayList<>());
        mp.put("journals/jsc", new ArrayList<>());
        mp.put("journals/mscs", new ArrayList<>());
        mp.put("journals/tcs", new ArrayList<>());
        mp.put("journals/acta", new ArrayList<>());
        mp.put("journals/apal", new ArrayList<>());
        mp.put("journals/dam", new ArrayList<>());
        mp.put("journals/fuin", new ArrayList<>());
        mp.put("journals/lisp", new ArrayList<>());
        mp.put("journals/ipl", new ArrayList<>());
        mp.put("journals/jc", new ArrayList<>());
        mp.put("journals/logcom", new ArrayList<>());
        mp.put("journals/jsyml", new ArrayList<>());
        mp.put("journals/lmcs", new ArrayList<>());
        mp.put("journals/siamdm", new ArrayList<>());
        mp.put("journals/mst", new ArrayList<>());
        mp.put("conf/stoc", new ArrayList<>());
        mp.put("conf/soda", new ArrayList<>());
        mp.put("conf/cav", new ArrayList<>());
        mp.put("conf/focs", new ArrayList<>());
        mp.put("conf/lics", new ArrayList<>());
        mp.put("conf/compgeom", new ArrayList<>());
        mp.put("conf/esa", new ArrayList<>());
        mp.put("conf/coco", new ArrayList<>());
        mp.put("conf/icalp", new ArrayList<>());
        mp.put("conf/cade", new ArrayList<>());
        mp.put("conf/concur", new ArrayList<>());
        mp.put("conf/hybrid", new ArrayList<>());
        mp.put("conf/sat", new ArrayList<>());
        mp.put("conf/csl", new ArrayList<>());
        mp.put("conf/fmcad", new ArrayList<>());
        mp.put("conf/fsttcs", new ArrayList<>());
        mp.put("conf/ictac", new ArrayList<>());
        mp.put("conf/ipco", new ArrayList<>());
        mp.put("conf/rta", new ArrayList<>());
        mp.put("conf/isaac", new ArrayList<>());
        mp.put("conf/mfcs", new ArrayList<>());
        mp.put("conf/stacs", new ArrayList<>());
        mp.put("journals/tog", new ArrayList<>());
        mp.put("journals/tip", new ArrayList<>());
        mp.put("journals/tvcg", new ArrayList<>());
        mp.put("journals/tomccap", new ArrayList<>());
        mp.put("journals/cagd", new ArrayList<>());
        mp.put("journals/cgf", new ArrayList<>());
        mp.put("journals/cad", new ArrayList<>());
        mp.put("journals/cvgip", new ArrayList<>());
        mp.put("journals/tcsv", new ArrayList<>());
        mp.put("journals/tmm", new ArrayList<>());
        mp.put("journals/siamis", new ArrayList<>());
        mp.put("journals/speech", new ArrayList<>());
        mp.put("journals/comgeo", new ArrayList<>());
        mp.put("journals/cg", new ArrayList<>());
        mp.put("journals/dcg", new ArrayList<>());
        mp.put("journals/spl", new ArrayList<>());
        mp.put("journals/iet-ipr", new ArrayList<>());
        mp.put("journals/jvcir", new ArrayList<>());
        mp.put("journals/mms", new ArrayList<>());
        mp.put("journals/mta", new ArrayList<>());
        mp.put("journals/sigpro", new ArrayList<>());
        mp.put("journals/spic", new ArrayList<>());
        mp.put("journals/vc", new ArrayList<>());
        mp.put("conf/mm", new ArrayList<>());
        mp.put("conf/siggraph", new ArrayList<>());
        mp.put("conf/vr", new ArrayList<>());
        mp.put("conf/visualization", new ArrayList<>());
        mp.put("conf/mir", new ArrayList<>());
        mp.put("conf/si3d", new ArrayList<>());
        mp.put("conf/sca", new ArrayList<>());
        mp.put("conf/dcc", new ArrayList<>());
        mp.put("conf/eurographics", new ArrayList<>());
        mp.put("conf/vissym", new ArrayList<>());
        mp.put("conf/sgp", new ArrayList<>());
        mp.put("conf/rt", new ArrayList<>());
        mp.put("conf/icassp", new ArrayList<>());
        mp.put("conf/icmcs", new ArrayList<>());
        mp.put("conf/ismar", new ArrayList<>());
        mp.put("conf/pg", new ArrayList<>());
        mp.put("conf/sma", new ArrayList<>());
        mp.put("conf/vrst", new ArrayList<>());
        mp.put("conf/ca", new ArrayList<>());
        mp.put("conf/cgi", new ArrayList<>());
        mp.put("conf/interspeech", new ArrayList<>());
        mp.put("conf/gmp", new ArrayList<>());
        mp.put("conf/apvis", new ArrayList<>());
        mp.put("conf/icip", new ArrayList<>());
        mp.put("conf/mmm", new ArrayList<>());
        mp.put("conf/pcm", new ArrayList<>());
        mp.put("conf/smi", new ArrayList<>());
        mp.put("journals/ai", new ArrayList<>());
        mp.put("journals/pami", new ArrayList<>());
        mp.put("journals/ijcv", new ArrayList<>());
        mp.put("journals/jmlr", new ArrayList<>());
        mp.put("journals/tap", new ArrayList<>());
        mp.put("journals/tslp", new ArrayList<>());
        mp.put("journals/aamas", new ArrayList<>());
        mp.put("journals/coling", new ArrayList<>());
        mp.put("journals/cviu", new ArrayList<>());
        mp.put("journals/dke", new ArrayList<>());
        mp.put("journals/ec", new ArrayList<>());
        mp.put("journals/taffco", new ArrayList<>());
        mp.put("journals/taslp", new ArrayList<>());
        mp.put("journals/tcyb", new ArrayList<>());
        mp.put("journals/tec", new ArrayList<>());
        mp.put("journals/tfs", new ArrayList<>());
        mp.put("journals/tnn", new ArrayList<>());
        mp.put("journals/ijar", new ArrayList<>());
        mp.put("journals/jair", new ArrayList<>());
        mp.put("journals/jar", new ArrayList<>());
        mp.put("journals/ml", new ArrayList<>());
        mp.put("journals/neco", new ArrayList<>());
        mp.put("journals/nn", new ArrayList<>());
        mp.put("conf/par", new ArrayList<>());
        mp.put("journals/talip", new ArrayList<>());
        mp.put("journals/apin", new ArrayList<>());
        mp.put("journals/artmed", new ArrayList<>());
        mp.put("journals/alife", new ArrayList<>());
        mp.put("journals/ci", new ArrayList<>());
        mp.put("journals/csl", new ArrayList<>());
        mp.put("journals/connection", new ArrayList<>());
        mp.put("journals/dss", new ArrayList<>());
        mp.put("journals/eaai", new ArrayList<>());
        mp.put("journals/es", new ArrayList<>());
        mp.put("journals/eswa", new ArrayList<>());
        mp.put("journals/fss", new ArrayList<>());
        mp.put("journals/tciaig", new ArrayList<>());
        mp.put("journals/ivc", new ArrayList<>());
        mp.put("journals/ida", new ArrayList<>());
        mp.put("journals/ijcia", new ArrayList<>());
        mp.put("journals/ijis", new ArrayList<>());
        mp.put("journals/ijns", new ArrayList<>());
        mp.put("journals/ijprai", new ArrayList<>());
        mp.put("journals/ijdar", new ArrayList<>());
        mp.put("journals/jetai", new ArrayList<>());
        mp.put("journals/kbs", new ArrayList<>());
        mp.put("journals/mt", new ArrayList<>());
        mp.put("journals/mva", new ArrayList<>());
        mp.put("journals/nc", new ArrayList<>());
        mp.put("journals/nle", new ArrayList<>());
        mp.put("journals/nca", new ArrayList<>());
        mp.put("journals/npl", new ArrayList<>());
        mp.put("journals/ijon", new ArrayList<>());
        mp.put("journals/paa", new ArrayList<>());
        mp.put("journals/prl", new ArrayList<>());
        mp.put("journals/soco", new ArrayList<>());
        mp.put("journals/wias", new ArrayList<>());
        mp.put("conf/aaai", new ArrayList<>());
        mp.put("conf/nips", new ArrayList<>());
        mp.put("conf/acl", new ArrayList<>());
        mp.put("conf/cvpr", new ArrayList<>());
        mp.put("conf/iccv", new ArrayList<>());
        mp.put("conf/icml", new ArrayList<>());
        mp.put("conf/ijcai", new ArrayList<>());
        mp.put("conf/colt", new ArrayList<>());
        mp.put("conf/emnlp", new ArrayList<>());
        mp.put("conf/ecai", new ArrayList<>());
        mp.put("conf/eccv", new ArrayList<>());
        mp.put("conf/icra", new ArrayList<>());
        mp.put("conf/aips", new ArrayList<>());
        mp.put("conf/iccbr", new ArrayList<>());
        mp.put("conf/coling", new ArrayList<>());
        mp.put("conf/kr", new ArrayList<>());
        mp.put("conf/uai", new ArrayList<>());
        mp.put("conf/atal", new ArrayList<>());
        mp.put("conf/ppsn", new ArrayList<>());
        mp.put("conf/aistats", new ArrayList<>());
        mp.put("conf/accv", new ArrayList<>());
        mp.put("conf/acml", new ArrayList<>());
        mp.put("conf/bmvc", new ArrayList<>());
        mp.put("conf/conll", new ArrayList<>());
        mp.put("conf/gecco", new ArrayList<>());
        mp.put("conf/ictai", new ArrayList<>());
        mp.put("conf/iros", new ArrayList<>());
        mp.put("conf/alt", new ArrayList<>());
        mp.put("conf/icann", new ArrayList<>());
        mp.put("conf/fgr", new ArrayList<>());
        mp.put("conf/icdar", new ArrayList<>());
        mp.put("conf/ilp", new ArrayList<>());
        mp.put("conf/ksem", new ArrayList<>());
        mp.put("conf/iconip", new ArrayList<>());
        mp.put("conf/icpr", new ArrayList<>());
        mp.put("conf/icb", new ArrayList<>());
        mp.put("conf/ijcnn", new ArrayList<>());
        mp.put("conf/pricai", new ArrayList<>());
        mp.put("conf/naacl", new ArrayList<>());
        mp.put("journals/tochi", new ArrayList<>());
        mp.put("journals/ijmms", new ArrayList<>());
        mp.put("journals/cscw", new ArrayList<>());
        mp.put("journals/hhci", new ArrayList<>());
        mp.put("journals/thms", new ArrayList<>());
        mp.put("journals/iwc", new ArrayList<>());
        mp.put("journals/ijhci", new ArrayList<>());
        mp.put("journals/umuai", new ArrayList<>());
        mp.put("journals/behaviourIT", new ArrayList<>());
        mp.put("journals/puc", new ArrayList<>());
        mp.put("journals/percom", new ArrayList<>());
        mp.put("conf/cscw", new ArrayList<>());
        mp.put("conf/chi", new ArrayList<>());
        mp.put("conf/huc", new ArrayList<>());
        mp.put("conf/group", new ArrayList<>());
        mp.put("conf/iui", new ArrayList<>());
        mp.put("conf/tabletop", new ArrayList<>());
        mp.put("conf/uist", new ArrayList<>());
        mp.put("conf/ecscw", new ArrayList<>());
        mp.put("conf/percom", new ArrayList<>());
        mp.put("conf/mhci", new ArrayList<>());
        mp.put("conf/ACMdis", new ArrayList<>());
        mp.put("conf/icmi", new ArrayList<>());
        mp.put("conf/assets", new ArrayList<>());
        mp.put("conf/graphicsinterface", new ArrayList<>());
        mp.put("conf/uic", new ArrayList<>());
        mp.put("conf/haptics", new ArrayList<>());
        mp.put("conf/interact", new ArrayList<>());
        mp.put("conf/acmidc", new ArrayList<>());
        mp.put("conf/cscwd", new ArrayList<>());
        mp.put("conf/coopis", new ArrayList<>());
        mp.put("conf/mobiquitous", new ArrayList<>());
        mp.put("conf/avi", new ArrayList<>());

        ArrayList<Publication> allpb=new ArrayList<>(dblp.getPublications());
        for(Publication pb:allpb){
            addWanted(pb);
        }

        writefile();

        // int total=0;
        // Iterator<String> it=mp.keySet().iterator();
        // while(it.hasNext()){
        //     String key=it.next();
        //     int size=mp.get(key).size();
        //     total+=size;
        //     System.out.println(key+" "+size);
        // }
        // System.out.println(total);
        

        // TableOfContents toc=dblp.getToc("db/conf/focs/focs2010.bht");
        // ArrayList<Publication> allpub=new ArrayList<>(toc.getPublications());
        // System.out.println(allpub.size());
        // Publication firstp=allpub.get(0);
        // System.out.println(firstp.getKey());
        // System.out.println(firstp.getYear());
        // for (Field fld : firstp.getFields("title")) {
        //     System.out.println(fld.value());
        // }

        // for (PersonName name : firstp.getNames()){
        //     System.out.println(name.name());
        // }

        // TableOfContents toc1=dblp.getToc("db/conf/focs/focs2010");
        // ArrayList<Publication> allpub1=new ArrayList<>(toc1.getPublications());
        // System.out.println(allpub1.size());

    }
}