package sophisticated_wolves.api;


import javax.annotation.Nullable;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
//TODO does not works at the moment
public interface IVillagerHandler {

    public static final String PETS_SELLER_ID = ModInfo.ID.toLowerCase() + ":pets_seller";
    //TODO
//    @Nullable
//    VillagerRegistry.VillagerProfession getPetSellerProfession();
//
//    @Nullable
//    VillagerRegistry.VillagerCareer getPetSellerCareer();

    /**
     * @return unlocalized name of the Pet seller villager
     */
    String getPetsSellerName();

}
