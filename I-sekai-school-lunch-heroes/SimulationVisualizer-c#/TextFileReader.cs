using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System.IO;

public class TextFileReader : MonoBehaviour
{
    // Start is called before the first frame update
    public GameObject studentPrefab;
    TextAsset textFile;
    StringReader stringReader;
    float repeating;
    int tick=0;
    string line = "";

    void Start()
    {


        for (int i = 1; i <= 14; i++)
        {
            for (int j = 1; j <= 35; j++){
                GameObject gameObject = Instantiate(studentPrefab);
                gameObject.name = string.Format("s1{0:00}{1:00}",i,j);
            }
        }
        for (int i = 1; i <= 14; i++)
        {
            for (int j = 1; j <= 33; j++){
                GameObject gameObject = Instantiate(studentPrefab);
                gameObject.name = string.Format("s2{0:00}{1:00}",i,j);
            }
        }
        for (int i = 1; i <= 13; i++)
        {
            for (int j = 1; j <= 31; j++){
                GameObject gameObject = Instantiate(studentPrefab);
                gameObject.name = string.Format("s3{0:00}{1:00}",i,j);
            }
        }


        //Debug.Log("start");
        textFile = Resources.Load("log") as TextAsset;
        stringReader = new StringReader(textFile.text);
        /*while (true)
        {
            string line = stringReader.ReadLine();
            if (line == null)
            {
                break;
            }
            Debug.Log(line);
        }*/
        //Debug.Log("done");
    }

    // Update is called once per frame
    void Update()   
    {
        repeating += Time.deltaTime;
        if(repeating >= 0.1f){
            if(line == null) return;
            while(!line.Contains("t:")){
                line = stringReader.ReadLine();
                string location = line.Split(':')[0];
                string student = line.Split(':')[1];
                Debug.Log(location);
                Debug.Log(student);
                GameObject locationObject = GameObject.Find(location);
                GameObject studentObject = GameObject.Find(string.Format("s{0}",student));
                studentObject.transform.position = 
                    new Vector3(Random.Range(locationObject.transform.position.x-2f,locationObject.transform.position.x+2f),
                                locationObject.transform.position.y-2f,
                                Random.Range(locationObject.transform.position.z-2f,locationObject.transform.position.z+2f));
            }
            repeating = 0;
            tick++;
            line = stringReader.ReadLine();
        }
    }
}
