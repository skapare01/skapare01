package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.neighborhood_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class NeighborhoodTabGooglePlaces extends BasePage {
    public NeighborhoodTabGooglePlaces(WebDriver driver) {
        super(driver);
    }

    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_HEADER = By.xpath("//h3[text()='Google Places']");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_EDIT_BTN = By.id("neighborhood-content-places-button");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_ACCOUNTING = By.xpath("//*[text()='Accounting']");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_AIRPORT = By.xpath("//li[normalize-space()='Airport']");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_AMUSEMENT_PARK = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[3]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_AQUARIUM = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[4]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_ART_GALLERY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[5]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_ATM = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[6]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_BAKERY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[7]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_BANK = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[8]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_BAR = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[9]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_BEAUTY_SALON = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[10]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_BICYCLE_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[11]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_BOOK_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[12]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_BOWLING_ALLEY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[13]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_BUS_STATION = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[14]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CAFE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[15]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CAMPGROUND = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[16]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CAR_DEALER = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[17]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CAR_RENTAL = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[18]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CAR_REPAIR = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[19]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CAR_WASH = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[20]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CASINO = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[21]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CEMETERY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[22]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CHURCH = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[1]/ul/li[23]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CITY_HALL = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[1]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CLOTHING_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[2]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_CONVENIENCE_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[3]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_COURTHOUSE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[4]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_DENTIST = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[5]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_DEPARTMENT_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[6]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_DOCTOR = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[7]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_ELECTRICIAN = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[8]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_ELECTRONICS_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[9]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_EMBASSY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[10]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_FIRE_STATION = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[11]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_FLORIST = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[12]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_FUNERAL_HOME = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[13]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_FURNITURE_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[14]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_GAS_STATION = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[15]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_GYM = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[16]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_HAIR_CARE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[17]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_HARDWARE_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[18]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_HINDU_TEMPLE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[19]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_HOME_GOODS_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[20]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_HOSPITAL = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[21]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_INSURANCE_AGENCY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[22]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_JEWELRY_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[2]/ul/li[23]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_LAUNDRY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[1]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_LAWYER = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[2]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_LIQUOR_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[3]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_LOCAL_GOVERNMENT_OFFICE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[4]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_LOCKSMITH = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[5]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_LODGING = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[6]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_MEAL_DELIVERY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[7]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_MEAL_TAKEAWAY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[8]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_MOSQUE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[9]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_MOVIE_RENTAL = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[10]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_MOVIE_THEATER = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[11]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_MOVING_COMPANY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[12]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_MUSEUM = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[13]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_NIGHT_CLUB = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[14]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_PAINTER = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[15]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_PARK = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[16]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_PARKING = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[17]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_PET_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[18]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_PHARMACY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[19]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_PHYSIOTHERAPIST = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[20]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_PLUMBER = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[21]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_POLICE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[3]/ul/li[22]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_POST_OFFICE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[1]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_REAL_ESTATE_AGENCY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[2]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_RESTAURANT = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[3]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_ROOFING_CONTRACTOR = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[4]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_RV_PARK = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[5]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_SCHOOL = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[6]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_SHOE_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[7]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_SHOPPING_MALL = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[8]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_SPA = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[9]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_STADIUM = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[10]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_STORAGE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[11]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_STORE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[12]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_SUBWAY_STATION = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[13]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_SUPERMARKET = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[14]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_SYNAGOGUE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[15]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_TAXI_STAND = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[16]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_TRAIN_STATION = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[17]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_TRANSIT_STATION = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[18]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_TRAVEL_AGENCY = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[19]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_VETERINARY_CARE = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[20]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_ZOO = By.xpath("//*[@id=\"neighborhood-content-places-view\"]/div/div[4]/ul/li[21]");
    private final By PP_NEIGHBORHOOD_GOOGLE_PLACES_NO_DEFAULT_SELECTED = By.xpath("//*[text()='No Default Selected']");

    public boolean ppNeighborhoodGooglePlacesHeader() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_HEADER);
    }
    public boolean ppNeighborhoodGooglePlacesEditBtn() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_EDIT_BTN);
    }
    public boolean ppNeighborhoodGooglePlacesAccounting() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_ACCOUNTING);
    }
    public boolean ppNeighborhoodGooglePlacesAirport() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_AIRPORT);
    }
    public boolean ppNeighborhoodGooglePlacesAmusementPark() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_AMUSEMENT_PARK);
    }
    public boolean ppNeighborhoodGooglePlacesAquarium() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_AQUARIUM);
    }
    public boolean ppNeighborhoodGooglePlacesArtGallery() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_ART_GALLERY);
    }
    public boolean ppNeighborhoodGooglePlacesAtm() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_ATM);
    }
    public boolean ppNeighborhoodGooglePlacesBakery() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_BAKERY);
    }
    public boolean ppNeighborhoodGooglePlacesBank() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_BANK);
    }
    public boolean ppNeighborhoodGooglePlacesBar() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_BAR);
    }
    public boolean ppNeighborhoodGooglePlacesBeautySalon() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_BEAUTY_SALON);
    }
    public boolean ppNeighborhoodGooglePlacesBicycleStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_BICYCLE_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesBookStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_BOOK_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesBowlingAlley() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_BOWLING_ALLEY);
    }
    public boolean ppNeighborhoodGooglePlacesBusStation() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_BUS_STATION);
    }
    public boolean ppNeighborhoodGooglePlacesCafe() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CAFE);
    }
    public boolean ppNeighborhoodGooglePlacesCampGround() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CAMPGROUND);
    }
    public boolean ppNeighborhoodGooglePlacesCarDealer() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CAR_DEALER);
    }
    public boolean ppNeighborhoodGooglePlacesCarRental() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CAR_RENTAL);
    }
    public boolean ppNeighborhoodGooglePlacesCarRepair() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CAR_REPAIR);
    }
    public boolean ppNeighborhoodGooglePlacesCarWash() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CAR_WASH);
    }
    public boolean ppNeighborhoodGooglePlacesCasino() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CASINO);
    }
    public boolean ppNeighborhoodGooglePlacesCemetery() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CEMETERY);
    }
    public boolean ppNeighborhoodGooglePlacesChurch() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CHURCH);
    }
    public boolean ppNeighborhoodGooglePlacesCityHall() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CITY_HALL);
    }
    public boolean ppNeighborhoodGooglePlacesClothingStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CLOTHING_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesConvenienceStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_CONVENIENCE_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesCourthouse() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_COURTHOUSE);
    }
    public boolean ppNeighborhoodGooglePlacesDentist() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_DENTIST);
    }
    public boolean ppNeighborhoodGooglePlacesDepartmentStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_DEPARTMENT_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesDoctor() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_DOCTOR);
    }
    public boolean ppNeighborhoodGooglePlacesElectrician() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_ELECTRICIAN);
    }
    public boolean ppNeighborhoodGooglePlacesElectronicsStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_ELECTRONICS_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesEmbassy() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_EMBASSY);
    }
    public boolean ppNeighborhoodGooglePlacesFireStation() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_FIRE_STATION);
    }
    public boolean ppNeighborhoodGooglePlacesFlorist() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_FLORIST);
    }
    public boolean ppNeighborhoodGooglePlacesFuneralHome() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_FUNERAL_HOME);
    }
    public boolean ppNeighborhoodGooglePlacesFurnitureStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_FURNITURE_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesGasStation() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_GAS_STATION);
    }
    public boolean ppNeighborhoodGooglePlacesGym() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_GYM);
    }
    public boolean ppNeighborhoodGooglePlacesHairCare() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_HAIR_CARE);
    }
    public boolean ppNeighborhoodGooglePlacesHardwareStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_HARDWARE_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesHinduTemple() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_HINDU_TEMPLE);
    }
    public boolean ppNeighborhoodGooglePlacesHomeGoodsStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_HOME_GOODS_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesHospital() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_HOSPITAL);
    }
    public boolean ppNeighborhoodGooglePlacesInsuranceAgency() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_INSURANCE_AGENCY);
    }
    public boolean ppNeighborhoodGooglePlacesJewelryStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_JEWELRY_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesLaundry() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_LAUNDRY);
    }
    public boolean ppNeighborhoodGooglePlacesLawyer() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_LAWYER);
    }
    public boolean ppNeighborhoodGooglePlacesLiquorStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_LIQUOR_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesLocalGovernmentOffice() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_LOCAL_GOVERNMENT_OFFICE);
    }
    public boolean ppNeighborhoodGooglePlacesLocksmith() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_LOCKSMITH);
    }
    public boolean ppNeighborhoodGooglePlacesLodging() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_LODGING);
    }
    public boolean ppNeighborhoodGooglePlacesMealDelivery() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_MEAL_DELIVERY);
    }
    public boolean ppNeighborhoodGooglePlacesMealTakeaway() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_MEAL_TAKEAWAY);
    }
    public boolean ppNeighborhoodGooglePlacesMosque() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_MOSQUE);
    }
    public boolean ppNeighborhoodGooglePlacesMovieRental() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_MOVIE_RENTAL);
    }
    public boolean ppNeighborhoodGooglePlacesMovieTheater() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_MOVIE_THEATER);
    }
    public boolean ppNeighborhoodGooglePlacesMovingCompany() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_MOVING_COMPANY);
    }
    public boolean ppNeighborhoodGooglePlacesMuseum() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_MUSEUM);
    }
    public boolean ppNeighborhoodGooglePlacesNightClub() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_NIGHT_CLUB);
    }
    public boolean ppNeighborhoodGooglePlacesPainter() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_PAINTER);
    }
    public boolean ppNeighborhoodGooglePlacesPark() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_PARK);
    }
    public boolean ppNeighborhoodGooglePlacesParking() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_PARKING);
    }
    public boolean ppNeighborhoodGooglePlacesPetStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_PET_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesPharmacy() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_PHARMACY);
    }
    public boolean ppNeighborhoodGooglePlacesPhysiotherapist() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_PHYSIOTHERAPIST);
    }
    public boolean ppNeighborhoodGooglePlacesPlumber() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_PLUMBER);
    }
    public boolean ppNeighborhoodGooglePlacesPolice() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_POLICE);
    }
    public boolean ppNeighborhoodGooglePlacesPostOffice() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_POST_OFFICE);
    }
    public boolean ppNeighborhoodGooglePlacesRealEstateAgency() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_REAL_ESTATE_AGENCY);
    }
    public boolean ppNeighborhoodGooglePlacesRestaurant() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_RESTAURANT);
    }
    public boolean ppNeighborhoodGooglePlacesRoofingContractor() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_ROOFING_CONTRACTOR);
    }
    public boolean ppNeighborhoodGooglePlacesRvPark() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_RV_PARK);
    }
    public boolean ppNeighborhoodGooglePlacesSchool() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_SCHOOL);
    }
    public boolean ppNeighborhoodGooglePlacesShoeStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_SHOE_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesShoppingMall() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_SHOPPING_MALL);
    }
    public boolean ppNeighborhoodGooglePlacesSpa() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_SPA);
    }
    public boolean ppNeighborhoodGooglePlaceStadium() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_STADIUM);
    }
    public boolean ppNeighborhoodGooglePlacesStorage() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_STORAGE);
    }
    public boolean ppNeighborhoodGooglePlacesStore() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_STORE);
    }
    public boolean ppNeighborhoodGooglePlacesSubwayStation() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_SUBWAY_STATION);
    }
    public boolean ppNeighborhoodGooglePlacesSupermarket() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_SUPERMARKET);
    }
    public boolean ppNeighborhoodGooglePlacesSynagogue() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_SYNAGOGUE);
    }
    public boolean ppNeighborhoodGooglePlacesTaxiStand() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_TAXI_STAND);
    }
    public boolean ppNeighborhoodGooglePlacesTrainStation() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_TRAIN_STATION);
    }
    public boolean ppNeighborhoodGooglePlacesTransitStation() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_TRANSIT_STATION);
    }
    public boolean ppNeighborhoodGooglePlacesTravelAgency() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_TRAVEL_AGENCY);
    }
    public boolean ppNeighborhoodGooglePlacesVeterinaryCare() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_VETERINARY_CARE);
    }
    public boolean ppNeighborhoodGooglePlacesZoo() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_ZOO);
    }
    public boolean ppNeighborhoodGooglePlacesNoDefaultSelected() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GOOGLE_PLACES_NO_DEFAULT_SELECTED);
    }
}
