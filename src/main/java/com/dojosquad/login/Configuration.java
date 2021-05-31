package com.dojosquad.login;

public interface Configuration {
    
    //Constantes que determinan cual Look & Feel se utilizará.
    public final int LF_DEFAULT = 0;
    public final int LF_NIMBUS = LF_DEFAULT + 1;
    public final int LF_JTATOO = LF_NIMBUS + 1;
    public final int LF_WEBLAF = LF_JTATOO + 1;
    public final int LF_PGS = LF_WEBLAF + 1;
    public final int LOOK_AND_FEEL = LF_NIMBUS; 
    
}
