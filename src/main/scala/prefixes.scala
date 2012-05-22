package motifs

object Prefixes {
	def UnresolvedPrefix = """.*Unresolved prefixed name: (.*)""".r

	def forDataset( dataset: String ) = dataset match {
		case "swdf" => swdf
		case "dbpedia" => dbpedia
	}

	def swdf = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> PREFIX owl: <http://www.w3.org/2002/07/owl#> PREFIX dc: <http://purl.org/dc/elements/1.1/> PREFIX foaf: <http://xmlns.com/foaf/0.1/> PREFIX swrc: <http://swrc.ontoware.org/ontology#> PREFIX swrc-ext: <http://www.cs.vu.nl/~mcaklein/onto/swrc_ext/2005/05#> PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> PREFIX ical: <http://www.w3.org/2002/12/cal/ical#> PREFIX swc: <http://data.semanticweb.org/ns/swc/ontology#> "

	def dbpedia = "PREFIX SearchResults: <http://www.zillow.com/static/xsd/SearchResults.xsd> PREFIX UpdatedPropertyDetails: <http://www.zillow.com/static/xsd/UpdatedPropertyDetails.xsd> PREFIX a: <http://schemas.openxmlformats.org/drawingml/2006/main> PREFIX aapi: <http://rdf.alchemyapi.com/rdf/v1/s/aapi-schema#> PREFIX address: <http://schemas.talis.com/2005/address/schema#> PREFIX admin: <http://webns.net/mvcb/> PREFIX amz: <http://webservices.amazon.com/AWSECommerceService/2005-10-05> PREFIX atom: <http://atomowl.org/ontologies/atomrdf#> PREFIX audio: <http://purl.org/media/audio#> PREFIX awol: <http://bblfish.net/work/atom-owl/2006-06-06/#> PREFIX batch: <http://schemas.google.com/gdata/batch> PREFIX bestbuy: <http://remix.bestbuy.com/> PREFIX bibo: <http://purl.org/ontology/bibo/> PREFIX bif: <bif:> PREFIX book: <http://purl.org/NET/book/vocab#> PREFIX bookmark: <http://www.w3.org/2002/01/bookmark#> PREFIX bugzilla: <http://www.openlinksw.com/schemas/bugzilla#> PREFIX c: <http://www.w3.org/2002/12/cal/icaltzd#> PREFIX category: <http://dbpedia.org/resource/Category:> PREFIX cb: <http://www.crunchbase.com/> PREFIX cc: <http://web.resource.org/cc/> PREFIX cl: <http://www.ebusiness-unibw.org/ontologies/consumerelectronics/v1#> PREFIX cnet: <http://api.cnet.com/restApi/v1.0/ns> PREFIX content: <http://purl.org/rss/1.0/modules/content/> PREFIX cp: <http://schemas.openxmlformats.org/package/2006/metadata/core-properties> PREFIX cv: <http://purl.org/captsolo/resume-rdf/0.2/cv#> PREFIX cvbase: <http://purl.org/captsolo/resume-rdf/0.2/base#> PREFIX d: <http://schemas.microsoft.com/ado/2007/08/dataservices> PREFIX dawgt: <http://www.w3.org/2001/sw/DataAccess/tests/test-dawg#> PREFIX dbpedia: <http://dbpedia.org/resource/> PREFIX dbpedia-owl: <http://dbpedia.org/ontology/> PREFIX dbpprop: <http://dbpedia.org/property/> PREFIX dc: <http://purl.org/dc/elements/1.1/> PREFIX dcmitype: <http://purl.org/dc/dcmitype/> PREFIX dcterms: <http://purl.org/dc/terms/> PREFIX digg: <http://digg.com/docs/diggrss/> PREFIX dv: <http://rdf.data-vocabulary.org/> PREFIX dwc: <http://rs.tdwg.org/dwc/terms/> PREFIX ebay: <urn:ebay:apis:eBLBaseComponents> PREFIX enc: <http://purl.oclc.org/net/rss_2.0/enc#> PREFIX ep: <http://schemas.openxmlformats.org/officeDocument/2006/extended-properties> PREFIX etsy: <http://www.etsy.com/> PREFIX event: <http://purl.org/NET/c4dm/event.owl#> PREFIX evri: <http://www.openlinksw.com/schemas/evri#> PREFIX exif: <http://www.w3.org/2003/12/exif/ns/> PREFIX fb: <http://api.facebook.com/1.0/> PREFIX ff: <http://api.friendfeed.com/2008/03> PREFIX fn: <http://www.w3.org/2005/xpath-functions/#> PREFIX foaf: <http://xmlns.com/foaf/0.1/> PREFIX freebase: <http://rdf.freebase.com/ns/> PREFIX g: <http://base.google.com/ns/1.0> PREFIX gb: <http://www.openlinksw.com/schemas/google-base#> PREFIX gbs: <http://schemas.google.com/books/2008> PREFIX gd: <http://schemas.google.com/g/2005> PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> PREFIX geonames: <http://www.geonames.org/ontology#> PREFIX georss: <http://www.georss.org/georss/> PREFIX geospecies: <http://rdf.geospecies.org/ont/geospecies#> PREFIX gm: <http://base.google.com/ns-metadata/1.0> PREFIX gml: <http://www.opengis.net/gml> PREFIX go: <http://purl.org/obo/owl/GO#> PREFIX gphoto: <http://schemas.google.com/photos/2007> PREFIX gr: <http://purl.org/goodrelations/v1#> PREFIX gs: <http://schemas.google.com/spreadsheets/2006> PREFIX hlisting: <http://www.openlinksw.com/schemas/hlisting/> PREFIX hnews: <http://ontologi.es/hnews#> PREFIX hrev: <http://www.purl.org/stuff/hrev#> PREFIX http-voc: <http://www.w3.org/2006/http#> PREFIX ical: <http://www.w3.org/2002/12/cal/ical#> PREFIX ir: <http://web-semantics.org/ns/image-regions> PREFIX itunes: <http://www.itunes.com/DTDs/Podcast-1.0.dtd> PREFIX lfm: <http://last.fm/> PREFIX m: <http://schemas.microsoft.com/ado/2007/08/dataservices/metadata> PREFIX math: <http://www.w3.org/2000/10/swap/math#> PREFIX md: <http://www.w3.org/1999/xhtml/microdata#> PREFIX media: <http://search.yahoo.com/mrss/> PREFIX mesh: <http://purl.org/commons/record/mesh/> PREFIX meta: <urn:oasis:names:tc:opendocument:xmlns:meta:1.0> PREFIX mf: <http://www.w3.org/2001/sw/DataAccess/tests/test-manifest#> PREFIX mmd: <http://musicbrainz.org/ns/mmd-1.0#> PREFIX mo: <http://purl.org/ontology/mo/> PREFIX moat: <http://moat-project.org/ns#> PREFIX mql: <http://www.freebase.com/> PREFIX nci: <http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#> PREFIX nfo: <http://www.semanticdesktop.org/ontologies/nfo/#> PREFIX ng: <http://www.openlinksw.com/schemas/ning#> PREFIX nyt: <http://www.nytimes.com/> PREFIX o: <urn:schemas-microsoft-com:office:office> PREFIX oai: <http://www.openarchives.org/OAI/2.0/> PREFIX oai_dc: <http://www.openarchives.org/OAI/2.0/oai_dc/> PREFIX obo: <http://www.geneontology.org/formats/oboInOwl#> PREFIX office: <urn:oasis:names:tc:opendocument:xmlns:office:1.0> PREFIX og: <http://opengraphprotocol.org/schema/> PREFIX oo: <urn:oasis:names:tc:opendocument:xmlns:meta:1.0:> PREFIX openSearch: <http://a9.com/-/spec/opensearchrss/1.0/> PREFIX opencyc: <http://sw.opencyc.org/2008/06/10/concept/> PREFIX openstreetmap: <http://openstreetmap.org/elements/> PREFIX opl: <http://www.openlinksw.com/schema/attribution#> PREFIX opl-gs: <http://www.openlinksw.com/schemas/getsatisfaction/> PREFIX opl-meetup: <http://www.openlinksw.com/schemas/meetup/> PREFIX opl-xbrl: <http://www.openlinksw.com/schemas/xbrl/> PREFIX oplamz: <http://www.openlinksw.com/schemas/amazon#> PREFIX oplbb: <http://www.openlinksw.com/schemas/bestbuy#> PREFIX oplcn: <http://www.openlinksw.com/schemas/cnet#> PREFIX oplebay: <http://www.openlinksw.com/schemas/ebay#> PREFIX oplevri: <http://www.openlinksw.com/schemas/oplevri#> PREFIX opltesco: <http://www.openlinksw.com/schemas/tesco#> PREFIX oplustream: <http://www.openlinksw.com/schemas/ustream#> PREFIX oplweb: <http://www.openlinksw.com/schemas/oplweb#> PREFIX oplzllw: <http://www.openlinksw.com/schemas/zillow#> PREFIX ore: <http://www.openarchives.org/ore/terms/> PREFIX owl: <http://www.w3.org/2002/07/owl#> PREFIX po: <http://purl.org/ontology/po/> PREFIX product: <http://www.buy.com/rss/module/productV2/> PREFIX protseq: <http://purl.org/science/protein/bysequence/> PREFIX proxy: <http://localhost:8899/about/id/> PREFIX r: <http://schemas.openxmlformats.org/package/2006/relationships> PREFIX radio: <http://www.radiopop.co.uk/> PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX rdfa: <http://www.w3.org/ns/rdfa#> PREFIX rdfdf: <http://www.openlinksw.com/virtrdf-data-formats#> PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> PREFIX redwood-tags: <http://www.holygoat.co.uk/owl/redwood/0.1/tags/> PREFIX review: <http://www.purl.org/stuff/rev#> PREFIX rss: <http://purl.org/rss/1.0/> PREFIX sc: <http://purl.org/science/owl/sciencecommons/> PREFIX scot: <http://scot-project.org/scot/ns#> PREFIX scovo: <http://purl.org/NET/scovo#> PREFIX sf: <urn:sobject.enterprise.soap.sforce.com> PREFIX sioc: <http://rdfs.org/sioc/ns#> PREFIX sioct: <http://rdfs.org/sioc/types#> PREFIX skos: <http://www.w3.org/2004/02/skos/core#> PREFIX slash: <http://purl.org/rss/1.0/modules/slash/> PREFIX sql: <sql:> PREFIX ss: <urn:schemas-microsoft-com:office:spreadsheet> PREFIX stock: <http://xbrlontology.com/ontology/finance/stock_market#> PREFIX taxconcept: <http://www.taxonconcept.org/ont/se_v01/seo.owl#> PREFIX time: <http://www.w3.org/2006/time#> PREFIX tl: <http://purl.org/NET/c4dm/timeline.owl#> PREFIX twfy: <http://www.openlinksw.com/schemas/twfy#> PREFIX twitter: <http://www.openlinksw.com/schemas/twitter/> PREFIX uClassify: <http://api.uclassify.com/1/ResponseSchema#> PREFIX umbel: <http://umbel.org/umbel#> PREFIX umbel-ac: <http://umbel.org/umbel/ac/> PREFIX umbel-sc: <http://umbel.org/umbel/sc/> PREFIX units: <http://dbpedia.org/units/> PREFIX v: <http://www.openlinksw.com/xsltext/> PREFIX vcard: <http://www.w3.org/2001/vcard-rdf/3.0#> PREFIX vcard2006: <http://www.w3.org/2006/vcard/ns#> PREFIX vi: <http://www.openlinksw.com/virtuoso/xslt/> PREFIX video: <http://purl.org/media/video#> PREFIX vimeo: <http://vimeo.com/> PREFIX virt: <http://www.openlinksw.com/virtuoso/xslt> PREFIX virtcxml: <http://www.openlinksw.com/schemas/virtcxml#> PREFIX virtrdf: <http://www.openlinksw.com/schemas/virtrdf#> PREFIX void: <http://rdfs.org/ns/void#> PREFIX vt: <http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes> PREFIX w: <http://schemas.microsoft.com/office/word/2003/wordml> PREFIX wdrs: <http://www.w3.org/2007/05/powder-s#> PREFIX wf: <http://www.w3.org/2005/01/wf/flow#> PREFIX wfw: <http://wellformedweb.org/CommentAPI/> PREFIX wikicompany: <http://dbpedia.openlinksw.com/wikicompany/> PREFIX xf: <http://www.w3.org/2004/07/xpath-functions> PREFIX xfn: <http://gmpg.org/xfn/11#> PREFIX xfnv: <http://vocab.sindice.com/xfn#> PREFIX xhtml: <http://www.w3.org/1999/xhtml> PREFIX xhv: <http://www.w3.org/1999/xhtml/vocab#> PREFIX xml: <http://www.w3.org/XML/1998/namespace> PREFIX xn: <http://www.ning.com/atom/1.0> PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> PREFIX xsi: <http://www.w3.org/2001/XMLSchema-instance> PREFIX xsl10: <http://www.w3.org/XSL/Transform/1.0> PREFIX xsl1999: <http://www.w3.org/1999/XSL/Transform> PREFIX xslwd: <http://www.w3.org/TR/WD-xsl> PREFIX y: <urn:yahoo:maps> PREFIX yago: <http://dbpedia.org/class/yago/> PREFIX yago-res: <http://mpii.de/yago/resource/> PREFIX yt: <http://gdata.youtube.com/schemas/2007> PREFIX zillow: <http://www.zillow.com/> "
}