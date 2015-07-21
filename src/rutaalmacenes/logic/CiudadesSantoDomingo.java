/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutaalmacenes.logic;

/**
 *
 * @author Seelee
 */
public enum CiudadesSantoDomingo {

    AZUA_DE_COMPOSTELA("Azua de Compostela"),
    BAJOS_DE_HAINA("Bajos de Haina"),
    BANÍ("Baní"),
    BAYAGUANA("Bayaguana"),
    BOCA_CHICA("Boca Chica"),
    BONAO("Bonao"),
    CABRAL("Cabral"),
    CAMBITA_GARABITOS("Cambita Garabitos"),
    COMENDADOR("Comendador"),
    CONCEPCIÓN_DE_LA_VEGA("Concepción de la Vega"),
    CONSTANZA("Constanza"),
    CONSUELO("Consuelo"),
    COTUÍ("Cotuí"),
    DAJABÓN("Dajabón"),
    DUVERGÉ("Duvergé"),
    ESPERANZA("Esperanza"),
    HATO_DEL_YAQUE("Hato del Yaque "),
    HATO_MAYOR_DEL_REY("Hato Mayor del Rey"),
    JARABACOA("Jarabacoa"),
    LA_MATA("La Mata "),
    LA_ROMANA("La Romana"),
    LA_VICTORIA("La Victoria "),
    LAS_MATAS_DE_FARFÁN("Las Matas de Farfán"),
    LOS_ALCARRIZOS("Los Alcarrizos"),
    MAIMÓN("Maimón"),
    MAO("Mao"),
    MOCA("Moca"),
    MONTE_PLATA("Monte Plata"),
    NAGUA("Nagua"),
    NEYBA("Neyba"),
    PEDERNALES("Pedernales"),
    PEDRO_BRAND("Pedro Brand"),
    QUISQUEYA("Quisqueya"),
    SABANA_DE_LA_MAR("Sabana de la Mar"),
    SABANA_GRANDE_DE_BOYÁ("Sabana Grande de Boyá"),
    SABANA_YEGUA("Sabana Yegua "),
    SALCEDO("Salcedo"),
    SALVALEÓN_DE_HIGÜEY("Salvaleón de Higüey"),
    SAN_ANTONIO_DE_GUERRA("San Antonio de Guerra"),
    SAN_CRISTÓBAL("San Cristóbal"),
    SAN_FELIPE_DE_PUERTO_PLATA("San Felipe de Puerto Plata"),
    SAN_FERNANDO_DE_MONTE_CRISTI("San Fernando de Monte Cristi"),
    SAN_FRANCISCO_DE_MACORIS("San Francisco de Macoris"),
    SAN_GREGORIO_DE_NIGUA("San Gregorio de Nigua"),
    SAN_IGNACIO_DE_SABANETA("San Ignacio de Sabaneta"),
    SAN_JOSÉ_DE_OCOA("San José de Ocoa"),
    SAN_JUAN_DE_LA_MAGUANA("San Juan de la Maguana"),
    SAN_PEDRO_DE_MACORIS("San Pedro de Macorís"),
    SÁNCHEZ("Sánchez"),
    SANTA_BÁRBARA_DE_SAMANÁ("Santa Bárbara de Samaná"),
    SANTA_CRUZ_DE_BARAHONA("Santa Cruz de Barahona"),
    SANTA_CRUZ_DEL_SEIBO("Santa Cruz del Seibo"),
    SANTIAGO_DE_LOS_CABALLEROS("Santiago de los Caballeros"),
    SANTO_DOMINGO_DE_GUZMAN("Santo Domingo de Guzmán"),
    SANTO_DOMINGO_ESTE("Santo Domingo Este"),
    SANTO_DOMINGO_NORTE("Santo Domingo Norte"),
    SANTO_DOMINGO_OESTE("Santo Domingo Oeste"),
    TAMBORIL("Tamboril"),
    VICENTE_NOBLE("Vicente Noble"),
    VILLA_ALTAGRACIA("Villa Altagracia"),
    VILLA_BISONÓ("Villa Bisonó"),
    VILLA_VÁSQUEZ("Villa Vásquez"),
    YAMASÁ("Yamasá");

    private final String ciudad;

    CiudadesSantoDomingo(String ciudad)
    {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    @Override
    public String toString() {
        return ciudad;
    }
    
    

    
}
