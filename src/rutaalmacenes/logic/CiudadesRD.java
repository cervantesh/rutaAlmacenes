/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutaalmacenes.logic;

/**
 *
 * @author CDJ
 */
public enum CiudadesRD {

    SANTO_DOMINGO_DE_GUZMAN("Santo Domingo de Guzmán"),
    SANTIAGO_DE_LOS_CABALLEROS("Santiago de los Caballeros"),
    SANTO_DOMINGO_ESTE("Santo Domingo Este"),
    SANTO_DOMINGO_NORTE("Santo Domingo Norte"),
    SANTO_DOMINGO_OESTE("Santo Domingo Oeste"),
    SAN_FELIPE_DE_PUERTO_PLATA("San Felipe de Puerto Plata"),
    SAN_PEDRO_DE_MACORIS("San Pedro de Macorís"),
    LA_ROMANA("La Romana"),
    SAN_FRANCISCO_DE_MACORIS("San Francisco de Macoris"),
    SAN_CRISTÓBAL("San Cristóbal"),
    SALVALEÓN_DE_HIGÜEY("Salvaleón de Higüey"),
    CONCEPCIÓN_DE_LA_VEGA("Concepción de la Vega"),
    SANTA_CRUZ_DE_BARAHONA("Santa Cruz de Barahona"),
    BONAO("Bonao"),
    SAN_JUAN_DE_LA_MAGUANA("San Juan de la Maguana"),
    BANÍ("Baní"),
    BAJOS_DE_HAINA("Bajos de Haina"),
    MOCA("Moca"),
    AZUA_DE_COMPOSTELA("Azua de Compostela"),
    MAO("Mao"),
    BOCA_CHICA("Boca Chica"),
    COTUÍ("Cotuí"),
    ESPERANZA("Esperanza"),
    VILLA_ALTAGRACIA("Villa Altagracia"),
    HATO_MAYOR_DEL_REY("Hato Mayor del Rey"),
    NAGUA("Nagua"),
    VILLA_BISONÓ("Villa Bisonó"),
    JARABACOA("Jarabacoa"),
    CONSTANZA("Constanza"),
    CONSUELO("Consuelo"),
    SANTA_CRUZ_DEL_SEIBO("Santa Cruz del Seibo"),
    TAMBORIL("Tamboril"),
    LAS_MATAS_DE_FARFÁN("Las Matas de Farfán"),
    SAN_JOSÉ_DE_OCOA("San José de Ocoa"),
    BAYAGUANA("Bayaguana"),
    NEYBA("Neyba"),
    DAJABÓN("Dajabón"),
    SABANA_GRANDE_DE_BOYÁ("Sabana Grande de Boyá"),
    SAN_IGNACIO_DE_SABANETA("San Ignacio de Sabaneta"),
    QUISQUEYA("Quisqueya"),
    SAN_FERNANDO_DE_MONTE_CRISTI("San Fernando de Monte Cristi"),
    MONTE_PLATA("Monte Plata"),
    MAIMÓN("Maimón"),
    SABANA_DE_LA_MAR("Sabana de la Mar"),
    CABRAL("Cabral"),
    DUVERGÉ("Duvergé"),
    SALCEDO("Salcedo"),
    SAN_ANTONIO_DE_GUERRA("San Antonio de Guerra"),
    YAMASÁ("Yamasá"),
    COMENDADOR("Comendador"),
    VILLA_VÁSQUEZ("Villa Vásquez"),
    SÁNCHEZ("Sánchez"),
    VICENTE_NOBLE("Vicente Noble"),
    SAN_GREGORIO_DE_NIGUA("San Gregorio de Nigua"),
    SANTA_BÁRBARA_DE_SAMANÁ("Santa Bárbara de Samaná"),
    SABANA_YEGUA("Sabana Yegua "),
    PEDERNALES("Pedernales"),
    LA_MATA("La Mata "),
    LOS_ALCARRIZOS("Los Alcarrizos"),
    PEDRO_BRAND("Pedro Brand"),
    HATO_DEL_YAQUE("Hato del Yaque "),
    CAMBITA_GARABITOS("Cambita Garabitos"),
    LA_VICTORIA("La Victoria ");

    private final String ciudad;

    CiudadesRD(String ciudad)
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
