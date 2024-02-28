package data.scripts;

import com.fs.starfarer.api.BaseModPlugin;

import java.util.Map;


public class XVII_SecGen extends BaseModPlugin {

    public void generate(SectorAPI sector) {

        Map<String, Object> data = sector.getPersistentData();
        if(!data.containsKey("XVII_inSaveFile"))){
            data.put("XVII_inSaveFile", "version 0.0.1");
            print("XVII has not been detected in this savefile. Commencing system generation and loadins.");
            loadIns(sector);
            //

            StarSystemAPI system = sector.createStarSystem("Cryodon");
            //nuke: somewhere up northwest
            system.getLocation().set(-13800, 9200);
            system.setBackgroundTextureFilename("graphics/backgrounds/background2.jpg");
            //nuke: dunno what theme you want
            system.addTag(Tags.THEME_CORE_POPULATED);

            PlanetAPI cryodon_star = system.initStar(
                    "XVII_cryodon",
                    "star_orange",
                    905f,
                    701f);

            cryodon_star.setName("Cryodon");

            system.setLightColor(new Color(230, 200, 156));

            PlanetAPI XVII_cryodon_1 = system.addPlanet("XVII_cryodon_1",
                    alicerce_star,
                    "Sevastapol", //nuke: cringe name imo
                    "terran", //nuke: cringe planet type too
                    140f, //starting angle
                    110f, //size
                    3100f, // orbit radius
                    270f); // orbit time
            //XVII_cryodon_1.setCustomDescriptionId("the description id here");
            //PlanetConditionGenerator.generateConditionsForPlanet(XVII_cryodon_1, StarAge.AVERAGE);
            //nuke: you presumably want custom conditions

            //                MarketAPI XVII_cryodon_1_market = seven_util_sysgen.addMarketplace("XVII",
//                    XVII_cryodon_1,
//                    "Sevastapol",
//                    5,
//                    new ArrayList<>(
//                            Arrays.asList(
//                                    Conditions.POPULATION_5,
//                                    "ruins_widespread"
//                            )
//                    ),
//                    new ArrayList<>(
//                            Arrays.asList(
//                                    Submarkets.SUBMARKET_OPEN,
//                                    Submarkets.SUBMARKET_STORAGE,
//                                    Submarkets.SUBMARKET_BLACK
//                            )
//                    ),
//                    new ArrayList<>(
//                            Arrays.asList(
//                                    Industries.POPULATION,
//                                    Industries.SPACEPORT,
//                                    Industries.MINING,
//                                    Industries.WAYSTATION,
//                                    Industries.PATROLHQ,
//                                    Industries.GROUNDDEFENSES
//                            )
//                    ),
//                    true,
//                    false);

            PlanetAPI XVII_cryodon_2 = system.addPlanet("XVII_cryodon_2",
                    alicerce_star,
                    "Shadow The Hedgehog",
                    "terran-eccentric", //nuke: cringe planet type too
                    300f, //starting angle
                    200f, //size
                    3100f, // orbit radius (not actually used)
                    270f); // orbit time (not actually used)

                OrbitAPI ShadowTheHedgehogOrbit= new EllipticalOrbit(cryodon_star, 0, 6400, 15000f, 60, 365f);
                XVII_cryodon_2.setOrbit(ShadowTheHedgehogOrbit);

//                MarketAPI XVII_cryodon_2_market = seven_util_sysgen.addMarketplace("XVII",
//                    XVII_cryodon_2,
//                    "Shadow The Hedgehog",
//                    4,
//                    new ArrayList<>(
//                            Arrays.asList(
//                                    Conditions.POPULATION_4,
//                                    Conditions.HIGH_GRAVITY,
//                                    Conditions.VOLATILES_DIFFUSE,
//                                    "ruins_widespread"
//                            )
//                    ),
//                    new ArrayList<>(
//                            Arrays.asList(
//                                    Submarkets.SUBMARKET_OPEN,
//                                    Submarkets.SUBMARKET_STORAGE,
//                                    Submarkets.SUBMARKET_BLACK
//                            )
//                    ),
//                    new ArrayList<>(
//                            Arrays.asList(
//                                    Industries.POPULATION,
//                                    Industries.SPACEPORT,
//                                    Industries.MINING,
//                                    Industries.WAYSTATION,
//                                    Industries.PATROLHQ,
//                                    Industries.GROUNDDEFENSES
//                            )
//                    ),
//                    true,
//                    false);
        }
        else{
            print("XVII is already present in this savefile. Skipping system generation.");
        }
    }

    private void loadIns(SectorAPI sector){
        //NUKE: TODO: uncomment the lines below and replace them with the actual IDs, so the faciton actually uses the ships

//                sector.getFaction("XVII").getKnownShips().add("ship_idOfSomeKind1");
//                sector.getFaction("XVII").addUseWhenImportingShip("ship_idOfSomeKind1");
//
//                sector.getFaction("XVII").getKnownShips().add("ship_idOfSomeKind2");
//                sector.getFaction("XVII").addUseWhenImportingShip("ship_idOfSomeKind2");

        //NUKE: TODO: please note that you'll need to tag the fighters in the fighters csv, and then uncomment the code below

// for(
//    ShipHullSpecAPI s :Global.getSettings().
//
//    getAllShipHullSpecs())
//
//    {
//        if (s.hasTag("XVII_strikecraft")) {
//            if (!s.hasTag("XVII")) {
//                s.addTag("XVII");
//            }
//            sector.getFaction("XVII").getKnownShips().add(s.getHullId());
//            sector.getFaction("XVII").addUseWhenImportingShip(s.getHullId());
//        }
//
//    }
    }
}
