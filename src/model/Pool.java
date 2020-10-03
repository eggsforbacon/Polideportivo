package model;

public class Pool {
  private String poolName;
  private double poolLength, poolWidth, poolDepth;
  private int numUsers;

  public Pool(String poolName, double poolLength, double poolWidth, double poolDepth, int numUsers) {
    this.poolName = poolName;
    this.poolLength = poolLength;
    this.poolWidth = poolWidth;
    this.poolDepth = poolDepth;
    this.numUsers = numUsers;
  }

  public String getPoolName() {
    return poolName;
  }

  public int getNumUsers() {
    return numUsers;
  }

  public int[] calculateMaxOcupation() {
    int[] pplInThePool = new int[4];
    int cap = Club.getMAX_CAPACITY();
    double temp;
    double volume = poolLength * poolWidth * poolDepth;
    double area = poolLength * poolWidth;
    /*El problema dice que se calcula a partir del volumen, no obstante para una piscina de 2m de
    profundidad - y según las condiciones del problema - habrían personas ocupando 1m cubico a 1
    metro de profundidad, ahogandose. Este problema se elimina si usamos 1m cuad. por persona en
    vez de 1m cub. por persona, como sugiere el enunciado. También se dice que el club solo soporta
    200 personas, y para una piscina de volumen (o área) mayor a este tope, no tiene mucho sentido
    que la piscina (dentro del club) aguante más personas que el mismo club. Por último, existe la
    restriccion de la pandemia, que reduce la capacidad de todo el club al 35%. Así que se darán 4
    capacidades máximas: La teórica del enunciado, la teórica realista, la máxima en condiciones
    normales, y la máxima en pandemia (en los últimos dos casos suponiendo que todos los usuarios
    del club se encuentren usando la piscina de la que se calcula el máximo de usuarios).*/
    pplInThePool[0] = (int)volume; //Capacidad máxima teórica según enunciado
    pplInThePool[1] = (int)area; //Capacidad máxima téorica realista
    if (area >= cap) {
      pplInThePool[2] = cap; //Capacidad máxima en condiciones normales
      temp = cap * (1 - 0.75);
      pplInThePool[3] = (int)temp; //Capacidad máxima en pandemia
    }
    else {
      pplInThePool[2] = (int)area;
      temp = area * (1 - 0.75);
      pplInThePool[3] = (int)temp;
    }

    return pplInThePool;
  }
}
