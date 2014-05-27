package gisutil;

import java.util.*;
//import graphutil.*;
import networkutil.*;
import donnee.*;

public class MyState
{
  public int n;
  public int g;
  public int cost;
  Graph	gr;
  SetOfStreets sos;
  Vector 		v;
  private static final int GRAPH=0;
  private static final int SOS=1;
  int typeGraph;

  public MyState(int nde, int goal, Graph graph)
  {
    n = nde;
    g = goal;
    gr = graph;
    typeGraph = GRAPH;
  } // MyState

  public MyState(int nde, int goal, SetOfStreets graph)
  {
    n = nde;
    g = goal;
    sos = graph;
    typeGraph = SOS;
  } // MyState

} // MyState


/* MyState.java */